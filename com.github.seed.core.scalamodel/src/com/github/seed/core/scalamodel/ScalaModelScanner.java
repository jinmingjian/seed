/*******************************************************************************
 * Copyright (c) 2011. All rights reserved by the authors. 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Authors:
 *     Jin Mingjian (jin.phd@gmail.com) - initial API and implementation
 *******************************************************************************/

package com.github.seed.core.scalamodel;

import java.util.LinkedList;
import java.util.Stack;

import org.parboiled.BaseParser;
import org.parboiled.Context;
import org.parboiled.MatcherContext;
import org.parboiled.Parboiled;
import org.parboiled.Rule;
import org.parboiled.annotations.*;
import org.parboiled.buffers.InputBuffer;
import org.parboiled.matchers.CustomMatcher;
import org.parboiled.parserunners.ReportingParseRunner;
import org.parboiled.support.ParsingResult;
import org.parboiled.support.ValueStack;

import com.github.seed.core.scalamodel.elements.*;
import com.github.seed.core.scalamodel.elements.Class;
import com.github.seed.core.scalamodel.elements.Object;

public class ScalaModelScanner extends BaseParser<java.lang.Object> {
	
	public static CompilationUnit getModelRoot(String sourceText) {
		ScalaModelScanner parser = Parboiled.createParser(ScalaModelScanner.class);
		ParsingResult<CompilationUnit> result = 
				new ReportingParseRunner<CompilationUnit>(parser.CompilationUnit()).run(sourceText); 
		return result.resultValue;
	}
	
	ScalaModelFactory modelFactory = ScalaModelFactory.eINSTANCE;

    //-------------------------------------------------------------------------
    //  Parsing Rules Section
    //-------------------------------------------------------------------------
	@SuppressNode
    public Rule CompilationUnit() {
        return Sequence(
                Spacing(),
                ZeroOrMore(PackageDcl()),
                ZeroOrMore(TopStat()),
                EOI,
                populateModel(ScalaModelPackage.COMPILATION_UNIT)
                );
    }
	
	/**
	 * XXX: the global value stack is much tricky to consume!
	 * NOTE: this method will return true in anytime
	 */
	boolean populateModel(int metaID) {
		Context<java.lang.Object> ctx = getContext();
		//XXX: ctx==null is allowed?
		if (ctx==null||
				ctx.hasError()||
				ctx.getStartIndex()==ctx.getCurrentIndex())
			return true;
		
		ScalaElement e = null;
		ValueStack<java.lang.Object> valueStack = ctx.getValueStack();
		int currentLevel = ctx.getLevel();
		boolean hasNaturalName = false;
		//NOTE: if this matcher has errors, do we still generate the mode?
		switch (metaID) {
		
		case ScalaModelPackage.COMPILATION_UNIT:
			e = modelFactory.createCompilationUnit();
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if ( ((Integer)lvl).intValue() > currentLevel ) {
				  valueStack.pop();
				} else {
				  break;
				}
				
				java.lang.Object v = valueStack.pop();
				if (v instanceof PackageDcl) {
					((CompilationUnit)e).getPackageDcls().add((PackageDcl)v);
				} else if (v instanceof TemplateDef) { 
					((CompilationUnit)e).getTemplateDefs().add((TemplateDef)v);
				} else if (v instanceof Packaging) { 
					((CompilationUnit)e).getPackagings().add((Packaging)v);
				} else if (v instanceof PackageObject) {
					((CompilationUnit)e).getPackageObjects().add((PackageObject)v);
				}
			}
			break;
			
		case ScalaModelPackage.PACKAGE_DCL:
			e = modelFactory.createPackageDcl();
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				if (v instanceof String)
					e.setName((String)v);
			}
			break;
			
		case ScalaModelPackage.PACKAGING:
			e = modelFactory.createPackaging();
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				if (v instanceof TemplateDef) {
					((Packaging) e).getTemplateDefs().add((TemplateDef) v);
				} else if (v instanceof Packaging) {
					((Packaging) e).getSubPackagings().add((Packaging) v);
				} else if (v instanceof String) {
					e.setName((String) v);
				}
			}
			break;
			
		case ScalaModelPackage.TEMPLATE_DEF:
			//XXX: just filter, should keep sharp of stack?
			ScalaElement filteredElement = null;
			Stack feStack = new Stack(); 
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				//XXX: assert to pop the model node firstly 
				if (v instanceof ScalaElement) {
					filteredElement = (ScalaElement) v;
					feStack.push(lvl);
					feStack.push(filteredElement);
				} else if (filteredElement instanceof TemplateDef && 
						v instanceof String) {
					String s = (String) v;
					if (s.equals("")) {
						continue;
					} else if (s.startsWith("case")) {
						((TemplateDef) filteredElement).setCase(true);
					} else if (s.startsWith("@@@")) {
						((TemplateDef) filteredElement).getModifiers().add(s);
					} else if (s.startsWith("@")) {
						((TemplateDef) filteredElement).getAnnotations().add(s);
					}
				}
			}
			//NOTE: push back again
			while (!feStack.isEmpty())
				valueStack.push(feStack.pop());
			
			break;
			
		case ScalaModelPackage.OBJECT:
			e = modelFactory.createObject();
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				//XXX: assert to pop the model node firstly 
				if (v instanceof ScalaElement) {
					switch (((ScalaElement)v).eClass().getClassifierID()) {
					case ScalaModelPackage.EARLY_DEF:
						((Object)e).setEarlyDef((EarlyDef)v);
						break;
					case ScalaModelPackage.SELF_TYPE:
						((Object)e).setSelfType((SelfType)v);
						break;
					default:
						if (v instanceof TemplateStat)
							((Object)e).getTemplateStats().add((TemplateStat)v);
						break;
					}
					if (v instanceof ClassParamList) {
						((Class)e).getClassParamLists().add((ClassParamList)v);
					}
				} else if (v instanceof String) {
					e.setName(((String)v).substring(2));
				}
				
			}
			//NOTE: create type system here in the meantime
			//      can/need in a independent thread? 
		    //NOTE: not completed
			((TypedScalaElement) e).setType(modelFactory.createType());
			((TypedScalaElement) e).getType().setName(e.getName());
			break;
			
		case ScalaModelPackage.CLASS:
			e = modelFactory.createClass();
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				//XXX: assert to pop the model node firstly 
				if (v instanceof ScalaElement) {
					switch (((ScalaElement)v).eClass().getClassifierID()) {
					case ScalaModelPackage.EARLY_DEF:
						((Class)e).setEarlyDef((EarlyDef)v);
						break;
					case ScalaModelPackage.SELF_TYPE:
						((Class)e).setSelfType((SelfType)v);
						break;
					default:
						if (v instanceof TemplateStat)
							((Class)e).getTemplateStats().add((TemplateStat)v);
						break;
					}
					if (v instanceof ClassParamList) {
						((Class)e).getClassParamLists().add((ClassParamList)v);
					}
					
				} else if (v instanceof String) {
					e.setName(((String)v).substring(2));
				}
				
			}
			//NOTE: create type system here in the meantime
			//      can/need in a independent thread? 
		    //NOTE: not completed
			((TypedScalaElement) e).setType(modelFactory.createType());
			((TypedScalaElement) e).getType().setName(e.getName());
			break;
			
		case ScalaModelPackage.TEMPLATE_STAT:
			//XXX: just filter, should keep sharp of stack?
			feStack = new Stack(); 
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				//XXX: assert to pop the model node firstly 
				if (v instanceof TemplateStat) {
					feStack.push(lvl);
					feStack.push((TemplateStat) v);
					
				}
			}
			//NOTE: push back again
			while (!feStack.isEmpty())
				valueStack.push(feStack.pop());
			
			break;
			
		case ScalaModelPackage.DEF:
			//XXX: just filter, should keep sharp of stack
			filteredElement = null;
			feStack = new Stack(); 
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				//XXX: assert to pop the model node firstly 
				if (v instanceof ScalaElement) {
					filteredElement = (ScalaElement) v;
					feStack.push(lvl);
					feStack.push(filteredElement);
				}  else if (filteredElement instanceof Def && 
						v instanceof String) {
					String s = (String) v;
					if (s.startsWith("@@@")) {
						((Def) filteredElement).getModifiers().add(s.substring(3));
					} else if (s.startsWith("@")) {
						((Def) filteredElement).getAnnotations().add(s);
					} 
				}
			}
			//NOTE: push back again
			while (!feStack.isEmpty())
				valueStack.push(feStack.pop());
			
			break;
			
		case ScalaModelPackage.VAL_VAR_DEF:
			e = modelFactory.createValVarDef();
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				//XXX: assert to pop the model node firstly 
				if (v instanceof Type) {
					((TypedScalaElement) e).setType((Type) v);
				} else if (v instanceof String) {
					String s = (String) v;
					if (s.startsWith("@@")) {
						String ps = ((ValVarDef) e).getName(); 
						if (ps!=null) {
							((ValVarDef) e).setName(s.substring(2)+", "+ps);
						} else {
							((ValVarDef) e).setName(s.substring(2));
						}
						
					}
				}
			}
			break;
			
		case ScalaModelPackage.SIMPLE_TYPE:
			e = modelFactory.createSimpleType();
			String suffix = "";
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				//XXX: assert to pop the model node firstly 
				if (v instanceof Type) {
					((Type) e).getTypeParams().add((Type) v);
				} else if (v instanceof String) {
					String s = (String) v;
					if (s.startsWith("@@")) {
						//NOTE: for nested Type name
						suffix = "#"+s.substring(2);
					} else if (s.startsWith("@#")) {
						//NOTE: for SimpleType name
						((Type) e).setName(s.substring(2)+suffix);
					}
				}
			}
			break;
		
		case ScalaModelPackage.FUN_DEF:
			e = modelFactory.createFunDef();
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				//XXX: assert to pop the model node firstly 
				if (v instanceof Type) {//Return type
					((TypedScalaElement) e).setType((Type) v);
				} else if (v instanceof FunctionSignature) {
					((TypedScalaElement) e).setSignature((FunctionSignature) v);
					e.setName(((FunctionSignature) v).getName());
				} 
			}
			break;
		
		//XXX: not completed!
		case ScalaModelPackage.FUNCTION_SIGNATURE:
			e = modelFactory.createFunctionSignature();
			LinkedList<Type> paramTypes = new LinkedList<Type>(); 
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				//XXX: assert to pop the model node firstly 
				if (v instanceof Type) {
					paramTypes.add((Type) v);
				} else if (v instanceof String) {
					String s = (String) v;
					if (s.startsWith("@@")) {
						((FunctionSignature) e).setName(s.substring(2));
					}
				}
			}
			((FunctionSignature)e).getParamTypes().addAll(paramTypes);
			break;
			
		case ScalaModelPackage.CLASS_PARAM:
			e = modelFactory.createClassParam();
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				//XXX: assert to pop the model node firstly 
				if (v instanceof Type) {//Return type
					((TypedScalaElement) e).setType((Type) v);
				} else if (v instanceof String) {
					String s = (String) v;
					if (s.equals("var")) {
						((ClassParam) e).setVar(true);
					} else if (s.equals("=")) {
						((ClassParam) e).setDefault(true);
					}
				} 
			}
			break;
			
		case ScalaModelPackage.CLASS_PARAM_LIST:
			e = modelFactory.createClassParamList();
			while (!valueStack.isEmpty()) {
				//NOTE:check level
				java.lang.Object lvl = valueStack.peek();
				assert lvl instanceof Integer;
				if (((Integer) lvl).intValue() > currentLevel) {
					valueStack.pop();
				} else {
					break;
				}
				
				java.lang.Object v = valueStack.pop();
				//XXX: assert to pop the model node firstly 
				if (v instanceof ClassParam) {//Return type
					((ClassParamList) e).getClassParams().add((ClassParam) v);
				}
			}
			break;
			
		case ScalaModelPackage.SELF_TYPE:
			e = modelFactory.createSelfType();
			hasNaturalName = true;
			break;
		case ScalaModelPackage.IMPORT:
			e = modelFactory.createImport();
			hasNaturalName = true;
			break;
		case ScalaModelPackage.EXPRESSION:
			e = modelFactory.createExpression();
			e.setName("{...}");
			break;
		}
		
		if (e!=null) {
			e.setStartLocation(ctx.getStartIndex());
			e.setEndLocation(ctx.getCurrentIndex());
			if (hasNaturalName)
				e.setName(ctx.getInputBuffer().extract(ctx.getStartIndex(), 
						                               ctx.getCurrentIndex()).trim());
			push(e);
			push(ctx.getLevel());
		}
		
		return true;
	}
	
    void debug() {
        System.out.println("BREAK"); // set breakpoint here
    }
    
    @MemoMismatches
    Rule PackageDcl() {
        return Sequence(Sequence(PACKAGE,
                                  QualId(true),
                                  Optional(SEMI),
                                  TestNot(Ch('{'))
                                 ),
                populateModel(ScalaModelPackage.PACKAGE_DCL)
                );
    }
    
    Rule QualId(boolean runAction) {
        return Sequence(Sequence(Identifier(false),
        		                  ZeroOrMore(Sequence(DOT,
        				                              Identifier(false)))),
        				 runAction ? pushQualId(getContext()) : true
                );
    }
    
    boolean pushQualId(Context ctx) {
    	push(match().trim());
    	push(ctx.getLevel());
    	return true;
    }
    
    Rule TopStat() {
        return FirstOf(
        		Sequence(IMPORT,
                		 OneOrMore(Import())
                ),
        		TmplDef(),
        		Packaging()
//                PackageObject()
                );
    }
    
    Rule Packaging() {
        return Sequence(Sequence(PACKAGE,
        		         QualId(true),
        		         LBRACE,
        		         ZeroOrMore(TopStat()),
        		         RBRACE
                         ),
                         populateModel(ScalaModelPackage.PACKAGING)
                );
    }
        
    Rule Import() {
    	return Sequence(
    			StableId(),
        		Optional(Sequence(DOT,FirstOf(RW_UNDERSCORE,
        				                      Sequence(LBRACE,
										               ZeroOrMore(Sequence(ImportSelector(),COMMA)),
										               FirstOf(ImportSelector(),
										            		   RW_UNDERSCORE
										            		  ),
										               RBRACE
										              )
										     )
        				         )
        				),
        		populateModel(ScalaModelPackage.IMPORT)
                );
    }
    
    Rule StableId() {
    	return FirstOf(
    			QualId(false),
    			Sequence(Optional(Sequence(Identifier(false),DOT)),
    					 THIS,
    					 DOT,
    					 Identifier(false)
    					 ),
    			Sequence(Optional(Sequence(Identifier(false),DOT)),
    	    			 SUPER,
    	    			 Optional(Sequence(LBRACKET,
    	    					           Identifier(false),
    	    					           RBRACKET)),
    	    			 DOT,
    	    			 Identifier(false)
    	    			 )
                );
    }
    
    Rule ImportSelector() {
    	return Sequence(
    			Identifier(false),
        		Optional(FirstOf(Sequence(RW_ROCKET,Identifier(false)),
        				         Sequence(RW_ROCKET,RW_UNDERSCORE)
        				        )
        				)
        	    
                );
    }

    Rule TmplDef() {
    	return Sequence(
    			ZeroOrMore(Annotation()),
    			ZeroOrMore(Modifier()),
//        		FirstOf(
        				Sequence(Sequence(Optional(CASE), 
        						          push(match().trim()),
        						          push(getContext().getLevel())
        						         ),
        			             FirstOf(Sequence(CLASS,ClassDef()),
        				                 Sequence(OBJECT,ObjectDef())
        				                )
//        				Sequence(TRAIT,TraitDef())
        			   ),
        	    populateModel(ScalaModelPackage.TEMPLATE_DEF)
                );
    }
    
    //XXX: do not process annotation
    Rule Annotation() {
        return Sequence(Sequence(RW_AT,
        		                  //
        		                  Expression(Character.MIN_VALUE)
                                 ),
                         push(match().trim()),
                         push(getContext().getLevel())
                );
    }
    
    @SuppressSubnodes
    @MemoMismatches
    Rule Arguments() {
        return FirstOf(Sequence(LPAREN,
                                 RPAREN
                                ),
                        Sequence(LPAREN,
                        		 Expression('('),
				                 ZeroOrMore(Sequence(COMMA,Expression('('))
				                		   ),
				                 RPAREN
				                ),
				        Sequence(LPAREN,
				                 ZeroOrMore(Sequence(Expression('('),COMMA)
				                		   ),
				                 Expression('('),
				                 RW_COLON,
				                 RW_UNDERSCORE,
				                 STAR,
						         RPAREN
						        ),
						Sequence(LBRACE,
						         ZeroOrMore(Expression('{')),
						         LBRACE
								)
				                
                );
    }
    

    //XXX: to be improved
    /**
     * The customized Expression rule, which is not needed to be
     * a validate expression in fact
     * @param leadingDelimiter - used for predicating 
     * @return
     */
    @SuppressSubnodes
    @MemoMismatches
    Rule Expression(char leadingDelimiter) {
    	return Sequence(new ExpressionMatcher(leadingDelimiter),
    			         Spacing(),
    			         populateModel(ScalaModelPackage.EXPRESSION)
    			        );
    }
    
    
    static class ExpressionMatcher extends CustomMatcher {
    	
    	private final char leadingDelimiter;

        public ExpressionMatcher(char leadingDelimiter) {
            super("Expression");
            this.leadingDelimiter = leadingDelimiter;
        }
        
		@Override
		public <V> boolean match(MatcherContext<V> context) {
			PrimaryCharStack parenStack = new PrimaryCharStack();
			PrimaryCharStack braceStack = new PrimaryCharStack();
//			debug();
			InputBuffer input = context.getInputBuffer();
			int currentIndex = context.getCurrentIndex();
			char currentChar = input.charAt(currentIndex);
			int adavancedSteps = 0;

			if (leadingDelimiter=='{' && currentChar== '}') {
				return false;
			}else if (leadingDelimiter=='(' && currentChar== ')') {
				return false;
			}
			
			boolean running = true; 
			while (running) {
				switch (currentChar) {
				case '\n':
					running=false;
					break;
				case ';':
					running=false;
					break;
				default:
					switch (currentChar) {
					case '(': 
						parenStack.push(currentChar);
						break;
					case '{':
						braceStack.push(currentChar);
						break;
					case ')':
					    if (parenStack.peek()=='(') {
					    	parenStack.pop();
					    } else if (leadingDelimiter=='(') {
					    	context.advanceIndex(adavancedSteps);
							context.createNode();
							return true;
					    } else {
					    	return false;
					    }
					    break;
					case '}':
					    if (braceStack.peek()=='{') {
					    	braceStack.pop();
					    } else if (leadingDelimiter=='{') {
					    	context.advanceIndex(adavancedSteps);
							context.createNode();
							return true;
					    } else {
					    	return false;
					    }
					}
					adavancedSteps++;
					currentIndex++;
					currentChar = input.charAt(currentIndex);
					break;
				}
			}
			
			context.advanceIndex(adavancedSteps);
			context.createNode();
			return true;
		}

		@Override
		public boolean isSingleCharMatcher() {
			return false;
		}

		@Override
		public boolean canMatchEmpty() {
			return false;
		}

		@Override
		public boolean isStarterChar(char c) {
			return false;
		}

		@Override
		public char getStarterChar() {
			return 'a';//XXX: useful now?
		}
    }
    
    
    //XXX: inline modifier keywords for performance? 
    Rule Modifier() {
        return Sequence(FirstOf(OVERRIDE, FINAL, ABSTRACT, LAZY, SEALED,
        			             Sequence(FirstOf(PRIVATE,PROTECTED),
              		                      Optional(Sequence(LBRACKET,
              		                                        FirstOf(Identifier(false),THIS),
              		                                        RBRACKET
              		                                       )
              		                              )
              		                     )
              		            ),
              		     push("@@@"+match().trim()),
              		     push(getContext().getLevel())
                );
    }
    
    Rule ClassDef() {
    	return Sequence(
    			Identifier(true),
        		Optional(TypeParamClause()),
        		ZeroOrMore(Sequence(RW_AT,
                		            SimpleType(),
                		            Arguments()
                		           )
                          ),
                ZeroOrMore(Sequence(LPAREN,
                		            Optional(ClassParams()),
      		                        RPAREN
      		                       )
      		              ),
                Optional(Sequence(LPAREN,
                		          IMPLICIT,
                		          Optional(ClassParams()),
                		          RPAREN
                		         )
                		),
                Optional(FirstOf(Sequence(EXTENDS,
                		                  Optional(EarlyDefs()),
                		                  ClassParents(),
                		                  Optional(TemplateBody())
                		                 ),
                		         Sequence(Optional(EXTENDS),
                				          TemplateBody()
                                         )
                                )
                		 
                	   ),
                 populateModel(ScalaModelPackage.CLASS)
                );
    }
    
    Rule TemplateBody() {
		return Sequence(LBRACE,
				         Optional(SelfType()),
				         ZeroOrMore(TemplateStat(),Optional(SEMI)),
				         RBRACE
				);
	}
    
    Rule SelfType() {
		return Sequence(FirstOf(Sequence(Identifier(false),
				                          Optional(Sequence(RW_COLON,Type())),
				                          RW_ROCKET
                                         ),
                                 Sequence(THIS,
       				                      RW_COLON,
       				                      Type(),
       				                      RW_ROCKET
                                         )
				                ),
				populateModel(ScalaModelPackage.SELF_TYPE)
				);
	}
    
    //XXX: fisrt match the Def, then the Dcl
    Rule TemplateStat() {
		return Sequence(FirstOf(Sequence(IMPORT, OneOrMore(Import()) ),				
                                 Sequence(ZeroOrMore(Annotation()),
              		                      ZeroOrMore(Modifier()),
              		                      Def(),
              		                      populateModel(ScalaModelPackage.DEF)
              		                     ),
                                 Sequence(ZeroOrMore(Annotation()),
              		                      ZeroOrMore(Modifier()),
              		                      Dcl()
              		                     ),
                                 //XXX:              		        
                                 Expression('{')
                                ), 
                         populateModel(ScalaModelPackage.TEMPLATE_STAT)
                );
	}
    
    Rule ClassParams() {
		return Sequence(ClassParam(),
				         ZeroOrMore(Sequence(COMMA,
				        		             ClassParam()
				        		            )
				        		   ),
				         populateModel(ScalaModelPackage.CLASS_PARAM_LIST)
				);
	}
    
    Rule ClassParam() {
		return Sequence(ZeroOrMore(Annotation()),
				         Optional(Sequence(ZeroOrMore(Annotation()),
				        		           Sequence(FirstOf(VAL,VAR),
				        		        		    push(match().trim()),
				        	              		    push(getContext().getLevel())
				        		        		   )
				        		          )
				        		 ),
				         Identifier(false),
				         Optional(Sequence(RW_COLON,
				        		           ParamType()
				        		          )
				        		 ),
				         Optional(Sequence(RW_ASSIGNMENT,
		        		                   Expression(Character.MIN_VALUE),
		        		                   push("="),
		        	              		   push(getContext().getLevel())
		        		                  )
		        		          ),
		        		 populateModel(ScalaModelPackage.CLASS_PARAM)
				);
	}
    
    Rule TypeParamClause() {
        return Sequence(LBRACKET,
        		         VariantTypeParam(),
        		         ZeroOrMore(Sequence(COMMA,
        		        		             VariantTypeParam()
        		        		            )
        		        		   ),
        		         LBRACKET
        		         );
    }
    
    Rule VariantTypeParam() {
		return Sequence(ZeroOrMore(Annotation()),
				         Optional(FirstOf(PLUS,MINUS)),
				         TypeParam()		
				);
	}
    
    Rule TypeParam() {
		return Sequence(FirstOf(Identifier(false),
				                 RW_UNDERSCORE),
				         Optional(TypeParamClause()),
				         Optional(Sequence(RW_LOWERBOUND,
				        		           Type()
				        		          )
				        		 ),
						 Optional(Sequence(RW_UPPERBOUND,
				        		           Type()
				        		          )
				        		 ),
				         Optional(Sequence(RW_COLON,
				        		           Type()
				        		          )
				        		 )
				         		
				);
	}
    
    Rule EarlyDefs() {
		return Sequence(LBRACE,
				         Optional(Sequence(EarlyDef(),
				        		           ZeroOrMore(Optional(SEMI),
				        		        		      EarlyDef()
				        		        		     )
				        		          )
				        		 ),
				         RBRACE
				);
	}
    
    Rule EarlyDef() {
		return Sequence(ZeroOrMore(Annotation()),
				         ZeroOrMore(Modifier()),
				         ValVarDef()
				);
	}
    
    Rule ClassParents() {
		return Sequence(Constr(),
				         ZeroOrMore(Sequence(WITH,
				        		             AnnotType()
				        		            )
				        		   )
				);
	}
    
    Rule Constr() {
		return Sequence(AnnotType(),
				         ZeroOrMore(Sequence(LPAREN,
				        		             Optional(Expression('(')),
				        		             RPAREN
				        		            )
				        		   )
				         
				);
	}
    
    Rule Type() {
		return FirstOf(CompoundType(),
				        InfixType(),
				        FunctionType(),
				        ExistentialType(),
				        RefinementType(),
				        TupleType()//XXX
				);
	}
    
    Rule InfixType() {
		return Sequence(CompoundType(),
				         ZeroOrMore(Sequence(Identifier(false),
				        		             CompoundType()
				        		            )
				        		   )
				);
	}
    
    Rule FunctionType() {
		return Sequence(FunctionArgTypes(),
				         RW_ROCKET,
				         Type()
				);
	}
    
    Rule FunctionArgTypes() {
		return FirstOf(InfixType(),
				        Sequence(LPAREN,
				        		 Optional(Sequence(ParamType(),
				        				           ZeroOrMore(Sequence(COMMA,
				        				        		               ParamType()
				        				        		              )
				        				        		     )
				        				          )
				        				 ),				        				          
				        		 RPAREN
				        		)  
				);
	}
    
    Rule ParamType() {
		return FirstOf(Type(),
				        Sequence(RW_ROCKET,Type()),
				        Sequence(Type(),STAR)
				);
	}
    
    Rule CompoundType() {
		return Sequence(AnnotType(),
				         ZeroOrMore(Sequence(WITH,
				        		             AnnotType()
				        		            )
				        		   ), 
				         Optional(RefinementType())
				);
	}
    
    @MemoMismatches
    Rule RefinementType() {
		return Sequence(LBRACE,
				         Optional(Sequence(FirstOf(Dcl(),TypeDef()),
				                           ZeroOrMore(Optional(SEMI), 
				                        		      FirstOf(Dcl(),TypeDef())
				                        		     )
				                          )
				                 ),
				         RBRACE
				);
	}
    
    Rule AnnotType() {
		return Sequence(SimpleType(),
				         ZeroOrMore(Annotation()) 
				);
	}
    
    Rule ExistentialType() {
		return Sequence(InfixType(),
				         Sequence(FORSOME,
				        		  LBRACE,
				        		  FirstOf(TypeDcl(),ValDcl()),
				        		  ZeroOrMore(Sequence(Optional(SEMI),
				        				              FirstOf(TypeDcl(),ValDcl())
				        				             )
				        				    ),
				        	      RBRACE
				        		  )
				);
	}
    
    //XXX: rule specific for the  ExistentialType()? how about the performance?
    Rule ValDcl() {
		return Sequence(VAL,
				         Identifier(false),
				         ZeroOrMore(Sequence(COMMA,Identifier(false))),
				         RW_COLON,
				         Type()
			    );
	}
    
    Rule ExistentialDcl() {
		return Sequence(SimpleType(),
				         ZeroOrMore(Annotation()) 
				);
	}
    
    //XXX: should be left-recursive
    Rule SimpleType() {
		return Sequence(
				SimpleTypeBase(),
		    	push("@#"+match().trim()),
		    	push(getContext().getLevel()+1),//XXX: increase 1 level for ScalaModelPackage.SIMPLE_TYPE's capture
				ZeroOrMore(
						FirstOf(Sequence(LBRACKET,
						                 Sequence(Type(),
						     	                  ZeroOrMore(Sequence(COMMA,Type()))
								                 ),
								         RBRACKET
								        ),
			                    Sequence(RW_POUND,
			    		                 Identifier(true)
								        )
				
				               )
				          ),
				populateModel(ScalaModelPackage.SIMPLE_TYPE)
				);
	}
    
    Rule SimpleTypeBase() {
		return FirstOf(
				StableId(),
				Sequence(StableId(),DOT,TYPE)
				//XXX: move TupleType() -> Type()
				);
	}
    
    Rule TupleType() {
		return Sequence(LPAREN,
				         Sequence(Type(),
						          ZeroOrMore(Sequence(COMMA,Type()))
						         ),
	                     RPAREN
			    );
	}
    
    
    
    Rule Dcl() {
		return FirstOf(ValVarDcl(), FunDcl(), TypeDcl()
			    );
	}
    
    Rule Def() {
		return FirstOf(ValVarDef(), FunDef(), TypeDef()
			    );
	}
    
    Rule ValVarDcl() {
		return Sequence(FirstOf(VAL, VAR),
				         Identifier(false),
				         ZeroOrMore(Sequence(COMMA,Identifier(false))),
				         RW_COLON,
				         Type()
			    );
	}
    
    Rule FunDcl() {
		return Sequence(DEF,
				         FunSig(),
				         Optional(Sequence(RW_COLON,
				        		           Type()
				        		          )
				        		 )
			    );
	}
    
    Rule FunSig() {
		return Sequence(Identifier(true),
				         Optional(TypeParamClause()),
				         ZeroOrMore(Sequence(LPAREN,
						                     Optional(Sequence(Param(),ZeroOrMore(COMMA,Param()))),
						                     RPAREN
					                        )      
					               ),
				         Optional(Sequence(LPAREN,
				        		           IMPLICIT,
				        		           Sequence(Param(),ZeroOrMore(COMMA,Param())),
				        		           RPAREN
				        		          )
				        		 ),
				        populateModel(ScalaModelPackage.FUNCTION_SIGNATURE)
			    );
	}
    
    Rule Param() {
		return Sequence(ZeroOrMore(Annotation()),
				         Identifier(false),
				         Optional(Sequence(RW_COLON,
				        		           ParamType()
				        		          )
				        		 ),
				         Optional(Sequence(RW_ASSIGNMENT,
				        		           Expression(Character.MIN_VALUE)
				        		          )
				        		 )
				);
	}
    
    Rule TypeDcl() {
		return Sequence(TYPE,
				         Identifier(false),
				         Optional(TypeParamClause()),
				         Optional(Sequence(RW_LOWERBOUND,
		        		                   Type()
		        		                  )
		        		         ),
		                 Optional(Sequence(RW_UPPERBOUND,
		        		                   Type()
		        		                  )
		        		         )
			    );
	}
    
    Rule ValVarDef() {
    	return Sequence(FirstOf(VAL, VAR),
    			         push(match().trim()),
    			         push(getContext().getLevel()),
		                 Identifier(true),
		                 ZeroOrMore(Sequence(COMMA,Identifier(true))),
		                 Optional(Sequence(RW_COLON, 
		                		           Type()
		                		          )
		                		 ),
		                 RW_ASSIGNMENT,
		                 FirstOf(RW_UNDERSCORE,Expression(Character.MIN_VALUE)),
		                 populateModel(ScalaModelPackage.VAL_VAR_DEF)
	            );
	}
    
    Rule FunDef() {
		return Sequence(DEF,
				         FirstOf(Sequence(FunSig(),
		                                  Optional(Sequence(RW_COLON, Type())),
		                                  Optional(RW_ASSIGNMENT),
		                                  FirstOf(Sequence(LBRACE,
		                                                   ZeroOrMore(Expression('{')),//XXX!!!!!!!!!
		                                                   RBRACE),
		                                          Expression(Character.MIN_VALUE)
		                                  ),
		                                  populateModel(ScalaModelPackage.FUN_DEF)
		        		                 ),
		        		         //XXX: NOCOMPLETED!      
		        	             Sequence(THIS,
		        	    		          Sequence(LPAREN,
					                               Sequence(Param(),ZeroOrMore(COMMA,Param())),
					                               RPAREN
				                                  ),
				                          Optional(Sequence(IMPLICIT,Sequence(Param(),ZeroOrMore(COMMA,Param()))))
				                         )
	                     )
	           );
	}
    
    Rule TypeDef() {
		return Sequence(TYPE,
		                 Identifier(false),
		                 Optional(TypeParamClause()),
		                 RW_ASSIGNMENT,
		                 Type()
	             );
    }

    
    
    Rule ObjectDef() {
		return Sequence(
				Identifier(true),
			    Optional(FirstOf(Sequence(EXTENDS, 
						                  Optional(EarlyDefs()),
								          ClassParents(), 
								          Optional(TemplateBody())
								         ),
						         Sequence(Optional(EXTENDS), TemplateBody())
						        )
						),
			   populateModel(ScalaModelPackage.OBJECT)
			   );
    }
    
    
    
    //-------------------------------------------------------------------------
    //  Lexing Rules Section
    //-------------------------------------------------------------------------

	@SuppressNode
    Rule Spacing() {
        return ZeroOrMore(FirstOf(

                // whitespace
                OneOrMore(AnyOf(" \n\t\r\f").label("Whitespace")),

                // traditional comment
                Sequence("/*", ZeroOrMore(TestNot("*/"), ANY), "*/"),

                // end of line comment
                Sequence(
                        "//",
                        ZeroOrMore(TestNot(AnyOf("\r\n")), ANY),
                        FirstOf("\r\n", '\r', '\n', EOI)
                )
        ));
    }

    @SuppressSubnodes
    @MemoMismatches
    Rule Identifier(boolean runAction) {
        return Sequence(FirstOf(Sequence(TestNot(Keyword()), 
        		                 PlainId(), 
        		                 Spacing()),
        		         Sequence(BackQuotedId(), 
                		          Spacing()) 
                	             ),
                	     runAction ? push("@@"+match().trim()) : true,
                	     runAction ? push(getContext().getLevel()) : true 
                );
    }

    @SuppressNode
    @MemoMismatches
    Rule PlainId() {
        return FirstOf(Sequence(Letter(),
        		                 ZeroOrMore(LetterOrDigit()), 
        		                 Optional(Op())
        		                ),
        		        Op()
        	    );
    }
    
    @SuppressNode
    @MemoMismatches
    Rule BackQuotedId() {
    	return Sequence('`', ZeroOrMore(Sequence(TestNot(Ch('`')), ANY)), '`');
    }
    
    //TODO: unicode support for letters and digits?
    
    Rule Letter() {
        return FirstOf(CharRange('a', 'z'), CharRange('A', 'Z'), '_', '$');
    }

    @MemoMismatches
    Rule LetterOrDigit() {
        return FirstOf(CharRange('a', 'z'), CharRange('A', 'Z'), CharRange('0', '9'), '_', '$');
    }
    
    Rule Op() {
        return Sequence(OneOrMore(AnyOf("+-*!~%&^|?<>#\\")),
        		         TestNot(AnyOf("+-*")));
    }
    

    // Keywords
    //XXX: inline modifier keywords for performance? 
    @MemoMismatches
    Rule Keyword() {
        return Sequence(
                FirstOf(  "val",
                		  "def",
                		  "class",
                		  "trait",
                		  "object",
                		  "var",
                		  "package", 
                 		  "import",
                 		  "this",
                 		  "new",
            		      "type",
            		      "extends",
            		      "with",
            		      
            		      "case",
            		      "implicit",
                		  "private",
                		  "override",
                		  "lazy",
            		      "final",
            		      "abstract",
            		      "protected",
            		      "sealed",
            		      "super",
                		  "true",
                		  "false",
                		  
//                		  "_",
                		  ":",
                		  "=",
                		  "=>",
                		  "<-",
                		  "<:",
                		  "<%",
                		  ">:",
                		  "#",
                		  "@",
                		  
                		  "for",
                		  "if",
                		  "else",
                		  "null",
                		  "yield",
                		  "do",
                		  "throw",
                		  "try",
                		  "catch",
                		  "finally",
                		  "while",
                		  "return",
                		  "match",
                		  "forsome"  ),
                TestNot(LetterOrDigit())
        );
    }

    public final Rule IF   = Keyword("if");
    public final Rule FOR  = Keyword("for");
    public final Rule ELSE   = Keyword("else");
    public final Rule THIS = Keyword("this");
    public final Rule NULL = Keyword("null");
    public final Rule NEW = Keyword("new");
    public final Rule WITH = Keyword("with");
    public final Rule SUPER = Keyword("super");
    public final Rule CASE = Keyword("case");
    public final Rule VAL = Keyword("val");
    public final Rule ABSTRACT = Keyword("abstract");
    public final Rule FINAL = Keyword("final");
    public final Rule PRIVATE = Keyword("private");
    public final Rule PROTECTED = Keyword("protected");
    public final Rule OVERRIDE = Keyword("override");
    public final Rule IMPLICIT = Keyword("implicit");
    public final Rule VAR = Keyword("var");
    public final Rule DEF = Keyword("def");
    public final Rule TYPE = Keyword("type");
    public final Rule EXTENDS = Keyword("extends");
    public final Rule TRUE = Keyword("true");
    public final Rule FALSE = Keyword("false");
    public final Rule OBJECT = Keyword("object");
    public final Rule CLASS = Keyword("class");
    public final Rule IMPORT = Keyword("import");
    public final Rule PACKAGE = Keyword("package");
    public final Rule YIELD = Keyword("yield");
    public final Rule DO = Keyword("do");
    public final Rule TRAIT = Keyword("trait");
    public final Rule SEALED = Keyword("sealed");
    public final Rule THROW = Keyword("throw");
    public final Rule TRY = Keyword("try");
    public final Rule CATCH = Keyword("catch");
    public final Rule FINALLY = Keyword("finally");
    public final Rule WHILE = Keyword("while");
    public final Rule RETURN = Keyword("return");
    public final Rule MATCH = Keyword("match");
    public final Rule FORSOME = Keyword("forsome");
    public final Rule LAZY = Keyword("lazy");
    public final Rule RW_COLON = Keyword(":");
    public final Rule RW_ASSIGNMENT = Keyword("=");
    public final Rule RW_ROCKET = Keyword("=>");
    public final Rule RW_IN = Keyword("<-");
    public final Rule RW_UPPERBOUND = Keyword("<:");
    public final Rule RW_VIEWBOUND = Keyword("<%");
    public final Rule RW_LOWERBOUND = Keyword(">:");
    //XXX: special keyword?:)
    public final Rule RW_POUND = Keyword("#");
    public final Rule RW_AT = Sequence(Ch('@'),Spacing());
    public final Rule RW_UNDERSCORE = Sequence(Ch('_'),Spacing());
    
    @SuppressNode
    @DontLabel
    Rule Keyword(String keyword) {
        return Terminal(keyword, LetterOrDigit());
    }
    
    
    // other terminals
    
    final Rule SEMI     = Terminal(";");
    final Rule COMMA    = Terminal(",");
    final Rule DOT      = Terminal(".");
    final Rule STAR     = Terminal("*");
    final Rule MINUS    = Terminal("-");
    final Rule PLUS     = Terminal("+");
    
    final Rule LPAREN   = Terminal("(");
    final Rule RPAREN   = Terminal(")");
    final Rule LBRACKET = Terminal("[");
    final Rule RBRACKET = Terminal("]");
    final Rule LBRACE   = Terminal("{");
    final Rule RBRACE   = Terminal("}");
    
    

    Rule Literal() {
        return Sequence(
                FirstOf(
                        FloatLiteral(),
                        IntegerLiteral(),
                        CharLiteral(),
                        StringLiteral(),
                        SymbolLiteral(),
                        Sequence("true", TestNot(LetterOrDigit())),
                        Sequence("false", TestNot(LetterOrDigit())),
                        Sequence("null", TestNot(LetterOrDigit()))
                ),
                Spacing()
        );
    }

    @SuppressSubnodes
    Rule IntegerLiteral() {
        return Sequence(FirstOf(HexNumeral(), OctalNumeral(), DecimalNumeral()), Optional(AnyOf("lL")));
    }

    @SuppressSubnodes
    Rule DecimalNumeral() {
        return FirstOf('0', Sequence(CharRange('1', '9'), ZeroOrMore(Digit())));
    }

    @SuppressSubnodes

    @MemoMismatches
    Rule HexNumeral() {
        return Sequence('0', IgnoreCase('x'), OneOrMore(HexDigit()));
    }

    Rule HexDigit() {
        return FirstOf(CharRange('a', 'f'), CharRange('A', 'F'), CharRange('0', '9'));
    }

    @SuppressSubnodes
    Rule OctalNumeral() {
        return Sequence('0', OneOrMore(CharRange('0', '7')));
    }

    Rule FloatLiteral() {
        return FirstOf(HexFloat(), DecimalFloat());
    }

    @SuppressSubnodes
    Rule DecimalFloat() {
        return FirstOf(
                Sequence(OneOrMore(Digit()), '.', ZeroOrMore(Digit()), Optional(Exponent()), Optional(AnyOf("fFdD"))),
                Sequence('.', OneOrMore(Digit()), Optional(Exponent()), Optional(AnyOf("fFdD"))),
                Sequence(OneOrMore(Digit()), Exponent(), Optional(AnyOf("fFdD"))),
                Sequence(OneOrMore(Digit()), Optional(Exponent()), AnyOf("fFdD"))
        );
    }

    Rule Exponent() {
        return Sequence(AnyOf("eE"), Optional(AnyOf("+-")), OneOrMore(Digit()));
    }

    Rule Digit() {
        return CharRange('0', '9');
    }

    @SuppressSubnodes
    Rule HexFloat() {
        return Sequence(HexSignificant(), BinaryExponent(), Optional(AnyOf("fFdD")));
    }

    Rule HexSignificant() {
        return FirstOf(
                Sequence(FirstOf("0x", "0X"), ZeroOrMore(HexDigit()), '.', OneOrMore(HexDigit())),
                Sequence(HexNumeral(), Optional('.'))
        );
    }

    Rule BinaryExponent() {
        return Sequence(AnyOf("pP"), Optional(AnyOf("+-")), OneOrMore(Digit()));
    }

    Rule CharLiteral() {
        return Sequence(
                '\'',
                FirstOf(Escape(), Sequence(TestNot(AnyOf("'\\")), ANY)).suppressSubnodes(),
                '\''
        );
    }

    @SuppressNode
    Rule StringLiteral() {
        return Sequence('"',
        		         FirstOf(SingleLineStringBody(),
        		        		 MultiLineStringBody()),
        		         '"');
    }
    
    Rule SingleLineStringBody() {
        return ZeroOrMore(
                        FirstOf(
                                Escape(),
                                Sequence(TestNot(AnyOf("\r\n\"\\")), ANY)
                        )
                ).suppressSubnodes();
    }
    
    Rule MultiLineStringBody() {
        return Sequence(
                '"', '"',
                ZeroOrMore(
                        FirstOf(
                                Escape(),
                                Sequence(TestNot(AnyOf("\r\"\\")), ANY)
                        )
                ).suppressSubnodes(),
                '"', '"'
                );
    }
    
    Rule SymbolLiteral() {
        return Sequence('\'', PlainId());
    }
    

    Rule Escape() {
        return Sequence('\\', FirstOf(AnyOf("btnfr\"\'\\"), OctalEscape(), UnicodeEscape()));
    }

    Rule OctalEscape() {
        return FirstOf(
                Sequence(CharRange('0', '3'), CharRange('0', '7'), CharRange('0', '7')),
                Sequence(CharRange('0', '7'), CharRange('0', '7')),
                CharRange('0', '7')
        );
    }

    Rule UnicodeEscape() {
        return Sequence(OneOrMore('u'), HexDigit(), HexDigit(), HexDigit(), HexDigit());
    }


    //-------------------------------------------------------------------------
    //  helper methods
    //-------------------------------------------------------------------------

    @Override
    protected Rule fromCharLiteral(char c) {
        // turn off creation of parse tree nodes for single characters
        return super.fromCharLiteral(c).suppressNode();
    }

    @SuppressNode
    @DontLabel
    Rule Terminal(String string) {
        return Sequence(string, Spacing()).label('\'' + string + '\'');
    }

    @SuppressNode
    @DontLabel
    Rule Terminal(String string, Rule mustNotFollow) {
        return Sequence(string, TestNot(mustNotFollow), Spacing()).label('\'' + string + '\'');
    }
    
    
    /**
     * a concise, fast character stack helper for internal usages  
     */
	public final static class PrimaryCharStack {
		private char[] chars;
		private int size;
		private int defaultSize;

		public PrimaryCharStack() {
			this.defaultSize = 8;
		}

		public PrimaryCharStack(int intialSize) {
			this.defaultSize = intialSize>0 ? intialSize : 1;
		}

		public boolean isEmpty() {
			return size == 0;
		}

		public int size() {
			return size;
		}

		public void push(char c) {
			if (chars == null) 
				chars = new char[defaultSize];

			final int oldSize = size;
			size += 1;
			// enlarge the backend array if need
			if (chars.length == size) {
				final char[] newContents = new char[size+defaultSize];
				System.arraycopy(chars, 0, newContents, 0, size);
				chars = newContents;
			}
			chars[oldSize] = c;
		}

		public char peek() {
			if (size == 0) 
				return Character.MIN_VALUE;
			return chars[size-1];
		}

		public char pop() {
			if (size == 0) 
                return Character.MIN_VALUE;
			size -= 1;
			final char rt = chars[size];
			chars[size] = Character.MIN_VALUE;
			return rt;
		}

		public void clear() {
			size = 0;
			if (chars != null) 
				chars = new char[defaultSize];
		}

	}

}
