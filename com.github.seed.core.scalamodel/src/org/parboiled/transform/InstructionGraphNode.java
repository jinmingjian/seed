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
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.analysis.BasicValue;
import org.objectweb.asm.tree.analysis.Value;
import org.objectweb.asm.util.AbstractVisitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.objectweb.asm.Opcodes.*;

/**
 * A node in the instruction dependency graph.
 */
class InstructionGraphNode implements Value {

    private AbstractInsnNode instruction;
    private final BasicValue resultValue;
    private final List<InstructionGraphNode> predecessors = new ArrayList<InstructionGraphNode>();
    private boolean isActionRoot;
    private final boolean isVarInitRoot;
    private final boolean isCallOnContextAware;
    private final boolean isXLoad;
    private final boolean isXStore;
    private InstructionGroup group;

    public InstructionGraphNode(AbstractInsnNode instruction, BasicValue resultValue) {
        this.instruction = instruction;
        this.resultValue = resultValue;
        this.isActionRoot = AsmUtils.isActionRoot(instruction);
        this.isVarInitRoot = AsmUtils.isVarRoot(instruction);
        this.isCallOnContextAware = AsmUtils.isCallOnContextAware(instruction);
        this.isXLoad = ILOAD <= instruction.getOpcode() && instruction.getOpcode() < IALOAD;
        this.isXStore = ISTORE <= instruction.getOpcode() && instruction.getOpcode() < IASTORE;
    }

    public int getSize() {
        return resultValue.getSize();
    }

    public AbstractInsnNode getInstruction() {
        return instruction;
    }

    public void setInstruction(AbstractInsnNode instruction) {
        this.instruction = instruction;
    }

    public BasicValue getResultValue() {
        return resultValue;
    }

    public List<InstructionGraphNode> getPredecessors() {
        return predecessors;
    }

    public InstructionGroup getGroup() {
        return group;
    }

    public void setGroup(InstructionGroup newGroup) {
        if (newGroup != group) {
            if (group != null) {
                group.getNodes().remove(this);
            }
            group = newGroup;
            if (group != null) {
                group.getNodes().add(this);
            }
        }
    }

    public boolean isActionRoot() {
        return isActionRoot;
    }

    public void setIsActionRoot() {
        isActionRoot = true;
    }

    public boolean isVarInitRoot() {
        return isVarInitRoot;
    }

    public boolean isCallOnContextAware() {
        return isCallOnContextAware;
    }

    public boolean isXLoad() {
        return isXLoad;
    }

    public boolean isXStore() {
        return isXStore;
    }

    public void addPredecessors(Collection<Value> preds) {
        checkArgNotNull(preds, "preds");
        for (Value pred : preds) {
            if (pred instanceof InstructionGraphNode) {
                addPredecessor(((InstructionGraphNode) pred));
            }
        }
    }

    public void addPredecessor(InstructionGraphNode node) {
        if (!predecessors.contains(node)) {
            predecessors.add(node);
        }
    }

    @Override
    public String toString() {
        return instruction.getOpcode() != -1 ? AbstractVisitor.OPCODES[instruction.getOpcode()] : super.toString();
    }

}
