/*
 * Copyright (c) 2009-2010 Ken Wenzel and Mathias Doenitz
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.parboiled.transform;

import static org.parboiled.common.Preconditions.*;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.parboiled.support.Checks;

import java.lang.reflect.Modifier;
import java.util.*;

import static org.objectweb.asm.Opcodes.*;
import static org.parboiled.transform.AsmUtils.*;

class InstructionGroupCreator implements RuleMethodProcessor  {

    private final Map<String, Integer> memberModifiers = new HashMap<String, Integer>();
    private RuleMethod method;

    public boolean appliesTo(ParserClassNode classNode, RuleMethod method) {
        checkArgNotNull(classNode, "classNode");
        checkArgNotNull(method, "method");
        return method.containsExplicitActions() || method.containsVars();
    }

    public void process(ParserClassNode classNode, RuleMethod method) {
        this.method = checkArgNotNull(method, "method");

        // create groups
        createGroups();

        // prepare groups for later stages
        for (InstructionGroup group : method.getGroups()) {
            sort(group);
            markUngroupedEnclosedNodes(group);
            verify(group);
        }

        // check all non-group node for illegal accesses
        for (InstructionGraphNode node : method.getGraphNodes()) {
            if (node.getGroup() == null) {
                verifyAccess(node);
            }
        }
    }

    private void createGroups() {
        for (InstructionGraphNode node : method.getGraphNodes()) {
            if (node.isActionRoot() || node.isVarInitRoot()) {
                InstructionGroup group = new InstructionGroup(node);
                markGroup(node, group);
                method.getGroups().add(group);
            }
        }
    }

    private void markGroup(InstructionGraphNode node, InstructionGroup group) {
        Checks.ensure(
                node == group.getRoot() || (!node.isActionRoot() && !node.isVarInitRoot()),
                "Method '%s' contains illegal nesting of ACTION and/or Var initializer constructs",
                method.name);

        if (node.getGroup() != null) return; // already visited

        node.setGroup(group);
        if (!node.isXLoad()) {
            if (node.isVarInitRoot()) {
                checkState(node.getPredecessors().size() == 2);
                markGroup(node.getPredecessors().get(1), group); // only color the second predecessor branch
            } else {
                for (InstructionGraphNode pred : node.getPredecessors()) {
                    markGroup(pred, group);
                }
            }
        }
    }

    // sort the group instructions according to their method index
    private void sort(InstructionGroup group) {
        final InsnList instructions = method.instructions;
        Collections.sort(group.getNodes(), new Comparator<InstructionGraphNode>() {
            public int compare(InstructionGraphNode a, InstructionGraphNode b) {
                return Integer.valueOf(instructions.indexOf(a.getInstruction()))
                        .compareTo(instructions.indexOf(b.getInstruction()));
            }
        });
    }

    // also capture all group nodes "hidden" behind xLoads
    private void markUngroupedEnclosedNodes(InstructionGroup group) {
        while_:
        while (true) {
            for (int i = getIndexOfFirstInsn(group), max = getIndexOfLastInsn(group); i < max; i++) {
                InstructionGraphNode node = method.getGraphNodes().get(i);
                if (node.getGroup() == null) {
                    markGroup(node, group);
                    sort(group);
                    continue while_;
                }
            }
            break;
        }
    }

    private void verify(InstructionGroup group) {
        List<InstructionGraphNode> nodes = group.getNodes();
        int sizeMinus1 = nodes.size() - 1;

        // verify all instruction except for the last one (which must be the root)
        checkState(nodes.get(sizeMinus1) == group.getRoot());
        for (int i = 0; i < sizeMinus1; i++) {
            InstructionGraphNode node = nodes.get(i);
            Checks.ensure(!node.isXStore(), "An ACTION or Var initializer in rule method '%s' " +
                    "contains illegal writes to a local variable or parameter", method.name);
            verifyAccess(node);
        }

        Checks.ensure(getIndexOfLastInsn(group) - getIndexOfFirstInsn(group) == sizeMinus1,
                "Error during bytecode analysis of rule method '%s': Incontinuous group block", method.name);
    }

    private void verifyAccess(InstructionGraphNode node) {
        switch (node.getInstruction().getOpcode()) {
            case GETFIELD:
            case GETSTATIC:
                FieldInsnNode field = (FieldInsnNode) node.getInstruction();
                Checks.ensure(!isPrivateField(field.owner, field.name),
                        "Rule method '%s' contains an illegal access to private field '%s'.\n" +
                                "Mark the field protected or package-private if you want to prevent public access!",
                        method.name, field.name);
                break;

            case INVOKEVIRTUAL:
            case INVOKESTATIC:
            case INVOKESPECIAL:
            case INVOKEINTERFACE:
                MethodInsnNode calledMethod = (MethodInsnNode) node.getInstruction();
                Checks.ensure(!isPrivate(calledMethod.owner, calledMethod.name, calledMethod.desc),
                        "Rule method '%s' contains an illegal call to private method '%s'.\nMark '%s' protected or " +
                                "package-private if you want to prevent public access!",
                        method.name, calledMethod.name, calledMethod.name);
                break;
        }
    }

    private int getIndexOfFirstInsn(InstructionGroup group) {
        return method.instructions.indexOf(group.getNodes().get(0).getInstruction());
    }

    private int getIndexOfLastInsn(InstructionGroup group) {
        List<InstructionGraphNode> graphNodes = group.getNodes();
        return method.instructions.indexOf(graphNodes.get(graphNodes.size() - 1).getInstruction());
    }

    private boolean isPrivateField(String owner, String name) {
        String key = owner + '#' + name;
        Integer modifiers = memberModifiers.get(key);
        if (modifiers == null) {
            modifiers = getClassField(owner, name).getModifiers();
            memberModifiers.put(key, modifiers);
        }
        return Modifier.isPrivate(modifiers);
    }

    private boolean isPrivate(String owner, String name, String desc) {
        return "<init>".equals(name) ? isPrivateInstantiation(owner, desc) : isPrivateMethod(owner, name, desc);
    }

    private boolean isPrivateMethod(String owner, String name, String desc) {
        String key = owner + '#' + name + '#' + desc;
        Integer modifiers = memberModifiers.get(key);
        if (modifiers == null) {
            modifiers = getClassMethod(owner, name, desc).getModifiers();
            memberModifiers.put(key, modifiers);
        }
        return Modifier.isPrivate(modifiers);
    }

    private boolean isPrivateInstantiation(String owner, String desc) {
        // first check whether the class is private
        Integer modifiers = memberModifiers.get(owner);
        if (modifiers == null) {
            modifiers = getClassForInternalName(owner).getModifiers();
            memberModifiers.put(owner, modifiers);
        }
        if (Modifier.isPrivate(modifiers)) return true;

        // then check whether the selected constructor is private
        String key = owner + "#<init>#" + desc;
        modifiers = memberModifiers.get(key);
        if (modifiers == null) {
            modifiers = getClassConstructor(owner, desc).getModifiers();
            memberModifiers.put(key, modifiers);
        }
        return Modifier.isPrivate(modifiers);
    }

}