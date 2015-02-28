/*
 * generated by Xtext
 */
package org.xtext.example.pascal.validation

import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.validation.Check
import org.xtext.example.pascal.pascal.PascalPackage
import org.xtext.example.pascal.pascal.block
import org.xtext.example.pascal.pascal.case_limb
import org.xtext.example.pascal.pascal.constant
import org.xtext.example.pascal.pascal.constant_definition
import org.xtext.example.pascal.pascal.expression
import org.xtext.example.pascal.pascal.factor
import org.xtext.example.pascal.pascal.formal_parameter_list
import org.xtext.example.pascal.pascal.formal_parameter_section
import org.xtext.example.pascal.pascal.function_declaration
import org.xtext.example.pascal.pascal.procedure_declaration
import org.xtext.example.pascal.pascal.simple_expression
import org.xtext.example.pascal.pascal.statement
import org.xtext.example.pascal.pascal.statement_sequence
import org.xtext.example.pascal.pascal.term
import org.xtext.example.pascal.pascal.variable
import org.xtext.example.pascal.pascal.variable_section

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class PascalValidator extends AbstractPascalValidator {
	
	private Map<EObject, Set<Error>> errorList = new HashMap<EObject, Set<Error>>();
	private Map<EObject, Set<Variable>> variables = new HashMap<EObject, Set<Variable>>();
	
	def search(Set<Variable> variables, Variable key) {
		for (Variable v : variables) {
			if (v.equals(key))
				return v;
		} 
		return null;	
	}
	 
	def insertError(EObject object, String message, ErrorType type, EStructuralFeature feature) {
		if (!errorList.containsKey(object)) {
			errorList.put(object, new HashSet<Error>());
		}
		errorList.get(object).add(new Error(message, type, feature));
	}
	
	def removeError(EObject object, ErrorType type) {
		if (!errorList.containsKey(object)) {
			errorList.put(object, new HashSet<Error>());
		}
		errorList.get(object).remove(new Error(type));
	} 
	
	def clear(block block, VariableType varType) {
		if (!variables.containsKey(block)) {
			variables.put(block, new HashSet<Variable>());
		} else {
			var newSet = new HashSet<Variable>();
			for (Variable v : variables.get(block)) {
				if (v.varType != varType || v.isInherited) {
					newSet.add(v);
				}	
			} 
			variables.put(block, newSet);
		}
	}
	
	def inheritVariables(block block, Variable variable) {
		if (block.abstraction != null) {
			if (block.abstraction.procedures != null) {
				for (procedure_declaration declaration : block.abstraction.procedures) {
					if (declaration.block != null) {
						var subblock = declaration.block;
						if (subblock != null) {
							if (!variables.containsKey(subblock)) {
								variables.put(subblock, new HashSet<Variable>());
							}
							variables.get(subblock).add(variable);
						}
					}
				}
			}
			if (block.abstraction.functions != null) {
				for (function_declaration declaration : block.abstraction.functions) {
					if (declaration.block != null) {
						var subblock = declaration.block;
						if (subblock != null) {
							if (!variables.containsKey(subblock)) {
								variables.put(subblock, new HashSet<Variable>());
							}
							variables.get(subblock).add(variable);
							variables.get(subblock).add(new Variable(declaration.heading.name, declaration.heading.returnType, false, VariableType.FUNCTION_RETURN));
						}
					}
				}
			}
		}
	}
	
	def addVariable(block block, String name, String type, VariableType varType, EObject errorSection, EStructuralFeature errorFeature) {			
		var tempVariable = new Variable(name, type, false, varType);
		var searchVariable = search(variables.get(block), tempVariable);
		if (searchVariable != null && !searchVariable.isInherited) {
			if (varType == searchVariable.varType) { 
				insertError(errorSection, varType + " cannot be redeclared.", ErrorType.REDECLARATION, errorFeature); 
			} else { 
				if (searchVariable.varType == VariableType.VARIABLE) {
					insertError(errorSection, "Identifier is already being used by a variable.", ErrorType.REDECLARATION, errorFeature);
				} else if (searchVariable.varType == VariableType.CONSTANT) {
					insertError(errorSection, "Identifier is already being used by a constant.", ErrorType.REDECLARATION, errorFeature);
				} else if (searchVariable.varType == VariableType.PARAMETER) {
					insertError(errorSection, "Identifier is already being used by a parameter.", ErrorType.REDECLARATION, errorFeature);
				} else if (searchVariable.varType == VariableType.FUNCTION_RETURN) {
					insertError(errorSection, "Identifier reserved for function return.", ErrorType.REDECLARATION, errorFeature);
				}
			}
		} else { 
			removeError(errorSection, ErrorType.REDECLARATION);
			variables.get(block).remove(searchVariable);
			variables.get(block).add(tempVariable);
			inheritVariables(block, new Variable(name, type, true, varType));
		}
	}
	
	def addParameters(block block, formal_parameter_list list) {
		clear(block, VariableType.PARAMETER);
		if (list != null) {
			if (list.parameters != null) {
				for (formal_parameter_section section : list.parameters) {
					if (section.variable != null) { 
						var variable = section.variable; 
						for (String name : variable.identifiers.names) {
							addVariable(block, name, variable.type.toString(), VariableType.PARAMETER, variable, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__IDENTIFIERS);
						}
					} else if (section.value != null) { 
						var value = section.value;
						for (String name : value.identifiers.names) {
							addVariable(block, name, value.type.toString(), VariableType.PARAMETER, value, PascalPackage.Literals.VALUE_PARAMETER_SECTION__IDENTIFIERS);
						}
					}
				}
			}
		}
	}
	
	@Check
	def checkAbstractionRedeclaration(block block) {
		if (block.abstraction != null) {
			var abstraction = block.abstraction;
			if (abstraction.functions != null) {
				for (function_declaration function : abstraction.functions) {
					if (function.block != null) {
						addParameters(function.block, function.heading.parameters);
					}
				}
			}
			if (abstraction.procedures != null) {
				for (procedure_declaration procedure : abstraction.procedures) {
					if (procedure.block != null) {
						addParameters(procedure.block, procedure.heading.parameters); 
					}
				}
			}
		}	
	}
	
	
	@Check
	def checkConstantRedeclaration(block block) {
		clear(block, VariableType.CONSTANT);
		if (block.constant != null) {
			for (constant_definition const : block.constant.consts) {
				addVariable(block, const.name, const.const.toString(), VariableType.CONSTANT, const, PascalPackage.Literals.CONSTANT_DEFINITION__NAME);
			}
		}
	} 
	
	@Check
	def checkVariableRedeclaration(block block) {		
		clear(block, VariableType.VARIABLE);
		if (block.variable != null) {
			for (variable_section section : block.variable.sections) {
				for (String name : section.identifiers.names) { 
					addVariable(block, name, section.type.toString(), VariableType.VARIABLE, section, PascalPackage.Literals.VARIABLE_SECTION__IDENTIFIERS);
				}
			}
		}
	}
	
	def checkVariable(block block, variable variable, boolean isAssignment) { 
		var searchVariable = search(variables.get(block), new Variable(variable.name));
		if (searchVariable == null) {
			insertError(variable, "Variable was not declared.", ErrorType.NOT_DECLARATION, PascalPackage.Literals.VARIABLE__NAME);
		} else {
			removeError(variable, ErrorType.NOT_DECLARATION);
			if (isAssignment) {
				if (searchVariable.varType == VariableType.CONSTANT) {
					insertError(variable, "Constants cannot be assigned.", ErrorType.CONSTANT_ASSIGNMENT, PascalPackage.Literals.VARIABLE__NAME);
				} else {
					removeError(variable, ErrorType.CONSTANT_ASSIGNMENT);
				}
			}
		}
	}
	
	def checkExpression(block block, expression expr) {
		for (simple_expression s : expr.expressions) {
			for (term t : s.terms) {
				for (factor f : t.factors) {
					if (f.variable != null) {
						checkVariable(block, f.variable, false);
					} if (f.function != null) {
						var function = f.function;
						if (function.expressions != null) {
							for (expression e : function.expressions.expressions) {
								checkExpression(block, e);
							}
						}
					}
				}
			}
		}
	}
	
	def checkConstant(block block, constant const) {
		if (const.name != null) {
			var searchVariable = search(variables.get(block), new Variable(const.name));
			if (searchVariable == null) {
				insertError(const, "Constant was not declared.", ErrorType.NOT_DECLARATION, PascalPackage.Literals.CONSTANT__NAME);
			} else {
				removeError(const, ErrorType.NOT_DECLARATION);
				if (searchVariable.varType != VariableType.CONSTANT) {
					insertError(const, "Only constants are allowed.", ErrorType.CONSTANT_ONLY, PascalPackage.Literals.CONSTANT__NAME);
				} else {
					removeError(const, ErrorType.CONSTANT_ONLY);
				}
			}
		}
	}
	
	def checkStatement(block block, statement stmt) {
		if (stmt.simple != null) {
			var simple = stmt.simple;
			if (simple.assignment != null) {
				var assignment = simple.assignment;
				var variable = assignment.variable;
				checkVariable(block, variable, true);
			} else if (simple.function != null) {
				var function = simple.function;
				if (function.expressions != null) {
					for (expression e : function.expressions.expressions) {
						checkExpression(block, e);
					}
				}
			}
		} else if (stmt.structured != null) {
			var structured = stmt.structured;
			if (structured.compound != null) {
				var compound = structured.compound; 
				checkStatements(block, compound.sequence); 
			} else if (structured.repetitive != null) {
				var repetitive = structured.repetitive;	
				if (repetitive.whileStmt != null) {
					checkExpression(block, repetitive.whileStmt.expression);
					checkStatement(block, repetitive.whileStmt.statement);
				} else if (repetitive.repeatStmt != null) {
					checkStatements(block, repetitive.repeatStmt.sequence);
					checkExpression(block, repetitive.repeatStmt.expression);
				} else if (repetitive.forStmt != null) {
					checkVariable(block, repetitive.forStmt.assignment.variable, true);
					checkExpression(block, repetitive.forStmt.expression);
					checkStatement(block, repetitive.forStmt.statement);
				}
			} else if (structured.conditional != null) {
				var conditional = structured.conditional;
				if (conditional.ifStmt != null) {
					var ifStmt = conditional.ifStmt;
					checkExpression(block, ifStmt.expression);
					checkStatement(block, ifStmt.ifStatement);
					if (ifStmt.elseStatement != null) {
						checkStatement(block, ifStmt.elseStatement);
					}
				} else if (conditional.caseStmt != null) {
					var caseStmt = conditional.caseStmt;
					checkExpression(block, caseStmt.expression);
					for (case_limb limb : caseStmt.cases) {
						checkStatement(block, limb.statement);
						for (constant c : limb.cases.constants) {
							checkConstant(block, c);
						}
					}
				} 
			} else if (structured.withStmt != null) {
				var withStmt = structured.withStmt;
				for (variable v : withStmt.variables) {
					checkVariable(block, v, false);
				}
				checkStatement(block, withStmt.statement);
			}
		}
	}
	
	def checkStatements(block block, statement_sequence sequence) {
		for (statement stmt : sequence.statements) {
			checkStatement(block, stmt);
		}
	} 
	
	@Check
	def checkBlock(block block) {
		checkStatements(block, block.statement.sequence);
	}
	
	@Check
	def showError(EObject obj) {
		if (errorList.containsKey(obj)) {
			for (Error err : errorList.get(obj)) {
				error(err.message, err.feature);
			} 
		} 
	}
	
}
