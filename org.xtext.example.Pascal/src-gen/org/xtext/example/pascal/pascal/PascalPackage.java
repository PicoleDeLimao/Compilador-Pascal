/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.pascal.pascal.PascalFactory
 * @model kind="package"
 * @generated
 */
public interface PascalPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pascal";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/pascal/Pascal";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pascal";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PascalPackage eINSTANCE = org.xtext.example.pascal.pascal.impl.PascalPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.pascalImpl <em>pascal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.pascalImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getpascal()
   * @generated
   */
  int PASCAL = 0;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASCAL__PROGRAM = 0;

  /**
   * The number of structural features of the '<em>pascal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASCAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.programImpl <em>program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.programImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getprogram()
   * @generated
   */
  int PROGRAM = 1;

  /**
   * The feature id for the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__HEADING = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__BLOCK = 1;

  /**
   * The number of structural features of the '<em>program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.program_heading_blockImpl <em>program heading block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.program_heading_blockImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getprogram_heading_block()
   * @generated
   */
  int PROGRAM_HEADING_BLOCK = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_HEADING_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_HEADING_BLOCK__IDENTIFIERS = 1;

  /**
   * The number of structural features of the '<em>program heading block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_HEADING_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.identifier_listImpl <em>identifier list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.identifier_listImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getidentifier_list()
   * @generated
   */
  int IDENTIFIER_LIST = 3;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_LIST__NAMES = 0;

  /**
   * The number of structural features of the '<em>identifier list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.blockImpl <em>block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.blockImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getblock()
   * @generated
   */
  int BLOCK = 4;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__LABEL = 0;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__CONSTANT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__TYPE = 2;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__VARIABLE = 3;

  /**
   * The feature id for the '<em><b>Abstraction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__ABSTRACTION = 4;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENT = 5;

  /**
   * The number of structural features of the '<em>block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.statement_partImpl <em>statement part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.statement_partImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getstatement_part()
   * @generated
   */
  int STATEMENT_PART = 5;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_PART__SEQUENCE = 0;

  /**
   * The number of structural features of the '<em>statement part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.statement_sequenceImpl <em>statement sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.statement_sequenceImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getstatement_sequence()
   * @generated
   */
  int STATEMENT_SEQUENCE = 6;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>statement sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.statementImpl <em>statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getstatement()
   * @generated
   */
  int STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__LABEL = 0;

  /**
   * The feature id for the '<em><b>Simple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__SIMPLE = 1;

  /**
   * The feature id for the '<em><b>Structured</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__STRUCTURED = 2;

  /**
   * The number of structural features of the '<em>statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.labelImpl <em>label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.labelImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getlabel()
   * @generated
   */
  int LABEL = 8;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NUMBER = 0;

  /**
   * The number of structural features of the '<em>label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.simple_statementImpl <em>simple statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.simple_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getsimple_statement()
   * @generated
   */
  int SIMPLE_STATEMENT = 9;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT__ASSIGNMENT = 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT__FUNCTION = 1;

  /**
   * The feature id for the '<em><b>Goto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT__GOTO = 2;

  /**
   * The number of structural features of the '<em>simple statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.assignment_statementImpl <em>assignment statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.assignment_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getassignment_statement()
   * @generated
   */
  int ASSIGNMENT_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>assignment statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.factorImpl <em>factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.factorImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfactor()
   * @generated
   */
  int FACTOR = 17;

  /**
   * The number of structural features of the '<em>factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.variableImpl <em>variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.variableImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariable()
   * @generated
   */
  int VARIABLE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = FACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VARIABLE = FACTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.var_Impl <em>var </em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.var_Impl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvar_()
   * @generated
   */
  int VAR_ = 12;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR___EXPRESSIONS = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR___VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR___NAME = 2;

  /**
   * The number of structural features of the '<em>var </em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.expression_listImpl <em>expression list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.expression_listImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getexpression_list()
   * @generated
   */
  int EXPRESSION_LIST = 13;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>expression list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.expressionImpl <em>expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.expressionImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getexpression()
   * @generated
   */
  int EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSIONS = FACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERATOR = FACTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.simple_expressionImpl <em>simple expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.simple_expressionImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getsimple_expression()
   * @generated
   */
  int SIMPLE_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Opterators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__OPTERATORS = 0;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__TERMS = 1;

  /**
   * The feature id for the '<em><b>Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__OPERATORS = 2;

  /**
   * The feature id for the '<em><b>Numbers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__NUMBERS = 3;

  /**
   * The number of structural features of the '<em>simple expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.termImpl <em>term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.termImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getterm()
   * @generated
   */
  int TERM = 16;

  /**
   * The feature id for the '<em><b>Factors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__FACTORS = 0;

  /**
   * The feature id for the '<em><b>Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__OPERATORS = 1;

  /**
   * The number of structural features of the '<em>term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.numberImpl <em>number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.numberImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getnumber()
   * @generated
   */
  int NUMBER = 18;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__NUMBER = FACTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.unsigned_numberImpl <em>unsigned number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.unsigned_numberImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getunsigned_number()
   * @generated
   */
  int UNSIGNED_NUMBER = 19;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_NUMBER__NUMBER = 0;

  /**
   * The number of structural features of the '<em>unsigned number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_NUMBER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.signed_numberImpl <em>signed number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.signed_numberImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getsigned_number()
   * @generated
   */
  int SIGNED_NUMBER = 20;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_NUMBER__NUMBER = 0;

  /**
   * The number of structural features of the '<em>signed number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_NUMBER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.setImpl <em>set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.setImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getset()
   * @generated
   */
  int SET = 21;

  /**
   * The feature id for the '<em><b>Brackets</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__BRACKETS = FACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__EXPRESSIONS = FACTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.function_designatorImpl <em>function designator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.function_designatorImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfunction_designator()
   * @generated
   */
  int FUNCTION_DESIGNATOR = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DESIGNATOR__NAME = FACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DESIGNATOR__EXPRESSIONS = FACTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>function designator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DESIGNATOR_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.structured_statementImpl <em>structured statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.structured_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getstructured_statement()
   * @generated
   */
  int STRUCTURED_STATEMENT = 23;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_STATEMENT__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>structured statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.compound_statementImpl <em>compound statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.compound_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getcompound_statement()
   * @generated
   */
  int COMPOUND_STATEMENT = 24;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT__SEQUENCE = 0;

  /**
   * The number of structural features of the '<em>compound statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.repetitive_statementImpl <em>repetitive statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.repetitive_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getrepetitive_statement()
   * @generated
   */
  int REPETITIVE_STATEMENT = 25;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPETITIVE_STATEMENT__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>repetitive statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPETITIVE_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.while_statementImpl <em>while statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.while_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getwhile_statement()
   * @generated
   */
  int WHILE_STATEMENT = 26;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>while statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.repeat_statementImpl <em>repeat statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.repeat_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getrepeat_statement()
   * @generated
   */
  int REPEAT_STATEMENT = 27;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STATEMENT__SEQUENCE = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STATEMENT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>repeat statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.for_statementImpl <em>for statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.for_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfor_statement()
   * @generated
   */
  int FOR_STATEMENT = 28;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__ASSIGNMENT = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__STATEMENT = 2;

  /**
   * The number of structural features of the '<em>for statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.conditional_statementImpl <em>conditional statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.conditional_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getconditional_statement()
   * @generated
   */
  int CONDITIONAL_STATEMENT = 29;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_STATEMENT__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>conditional statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.if_statementImpl <em>if statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.if_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getif_statement()
   * @generated
   */
  int IF_STATEMENT = 30;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__IF_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>if statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.case_statementImpl <em>case statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.case_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getcase_statement()
   * @generated
   */
  int CASE_STATEMENT = 31;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__CASES = 1;

  /**
   * The number of structural features of the '<em>case statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.case_limbImpl <em>case limb</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.case_limbImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getcase_limb()
   * @generated
   */
  int CASE_LIMB = 32;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIMB__CASES = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIMB__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>case limb</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIMB_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.case_label_listImpl <em>case label list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.case_label_listImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getcase_label_list()
   * @generated
   */
  int CASE_LABEL_LIST = 33;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LABEL_LIST__CONSTANTS = 0;

  /**
   * The number of structural features of the '<em>case label list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LABEL_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.constantImpl <em>constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.constantImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getconstant()
   * @generated
   */
  int CONSTANT = 34;

  /**
   * The feature id for the '<em><b>Opterator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__OPTERATOR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = 1;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NUMBER = 2;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__STRING = 3;

  /**
   * The feature id for the '<em><b>Bool Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__BOOL_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NIL = 5;

  /**
   * The number of structural features of the '<em>constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.with_statementImpl <em>with statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.with_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getwith_statement()
   * @generated
   */
  int WITH_STATEMENT = 35;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATEMENT__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATEMENT__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>with statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.goto_statementImpl <em>goto statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.goto_statementImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getgoto_statement()
   * @generated
   */
  int GOTO_STATEMENT = 36;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STATEMENT__LABEL = 0;

  /**
   * The number of structural features of the '<em>goto statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.label_declaration_partImpl <em>label declaration part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.label_declaration_partImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getlabel_declaration_part()
   * @generated
   */
  int LABEL_DECLARATION_PART = 37;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DECLARATION_PART__LABELS = 0;

  /**
   * The number of structural features of the '<em>label declaration part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DECLARATION_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.constant_definition_partImpl <em>constant definition part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.constant_definition_partImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getconstant_definition_part()
   * @generated
   */
  int CONSTANT_DEFINITION_PART = 38;

  /**
   * The feature id for the '<em><b>Consts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_PART__CONSTS = 0;

  /**
   * The number of structural features of the '<em>constant definition part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.constant_definitionImpl <em>constant definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.constant_definitionImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getconstant_definition()
   * @generated
   */
  int CONSTANT_DEFINITION = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__CONST = 1;

  /**
   * The number of structural features of the '<em>constant definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.type_definition_partImpl <em>type definition part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.type_definition_partImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#gettype_definition_part()
   * @generated
   */
  int TYPE_DEFINITION_PART = 40;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_PART__TYPES = 0;

  /**
   * The number of structural features of the '<em>type definition part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.type_definitionImpl <em>type definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.type_definitionImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#gettype_definition()
   * @generated
   */
  int TYPE_DEFINITION = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__TYPE = 1;

  /**
   * The number of structural features of the '<em>type definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.typeImpl <em>type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#gettype()
   * @generated
   */
  int TYPE = 42;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.simple_typeImpl <em>simple type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.simple_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getsimple_type()
   * @generated
   */
  int SIMPLE_TYPE = 43;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__NAME = 1;

  /**
   * The number of structural features of the '<em>simple type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.subrange_typeImpl <em>subrange type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.subrange_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getsubrange_type()
   * @generated
   */
  int SUBRANGE_TYPE = 44;

  /**
   * The feature id for the '<em><b>Initial Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE__INITIAL_CONST = 0;

  /**
   * The feature id for the '<em><b>Final Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE__FINAL_CONST = 1;

  /**
   * The feature id for the '<em><b>Subrange</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE__SUBRANGE = 2;

  /**
   * The feature id for the '<em><b>Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE__CONST = 3;

  /**
   * The number of structural features of the '<em>subrange type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.enumerated_typeImpl <em>enumerated type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.enumerated_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getenumerated_type()
   * @generated
   */
  int ENUMERATED_TYPE = 45;

  /**
   * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATED_TYPE__IDENTIFIERS = 0;

  /**
   * The number of structural features of the '<em>enumerated type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATED_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.structured_typeImpl <em>structured type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.structured_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getstructured_type()
   * @generated
   */
  int STRUCTURED_TYPE = 46;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>structured type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.unpacked_structured_typeImpl <em>unpacked structured type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.unpacked_structured_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getunpacked_structured_type()
   * @generated
   */
  int UNPACKED_STRUCTURED_TYPE = 47;

  /**
   * The number of structural features of the '<em>unpacked structured type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.array_typeImpl <em>array type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.array_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getarray_type()
   * @generated
   */
  int ARRAY_TYPE = 48;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__INDEXES = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__TYPE = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>array type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.dynamic_array_typeImpl <em>dynamic array type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.dynamic_array_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getdynamic_array_type()
   * @generated
   */
  int DYNAMIC_ARRAY_TYPE = 49;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_ARRAY_TYPE__TYPE = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>dynamic array type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_ARRAY_TYPE_FEATURE_COUNT = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.index_typeImpl <em>index type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.index_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getindex_type()
   * @generated
   */
  int INDEX_TYPE = 50;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>index type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.record_typeImpl <em>record type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.record_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getrecord_type()
   * @generated
   */
  int RECORD_TYPE = 51;

  /**
   * The feature id for the '<em><b>Record Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__RECORD_KEYWORD = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__FIELDS = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>End Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__END_KEYWORD = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>record type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_FEATURE_COUNT = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.field_listImpl <em>field list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.field_listImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfield_list()
   * @generated
   */
  int FIELD_LIST = 52;

  /**
   * The feature id for the '<em><b>Fixed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_LIST__FIXED = 0;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_LIST__VARIANTS = 1;

  /**
   * The number of structural features of the '<em>field list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.fixed_partImpl <em>fixed part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.fixed_partImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfixed_part()
   * @generated
   */
  int FIXED_PART = 53;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PART__SECTIONS = 0;

  /**
   * The number of structural features of the '<em>fixed part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.variable_identifier_listImpl <em>variable identifier list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.variable_identifier_listImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariable_identifier_list()
   * @generated
   */
  int VARIABLE_IDENTIFIER_LIST = 54;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_IDENTIFIER_LIST__NAMES = 0;

  /**
   * The number of structural features of the '<em>variable identifier list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_IDENTIFIER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.variable_sectionImpl <em>variable section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.variable_sectionImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariable_section()
   * @generated
   */
  int VARIABLE_SECTION = 55;

  /**
   * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_SECTION__IDENTIFIERS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_SECTION__TYPE = 1;

  /**
   * The number of structural features of the '<em>variable section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.record_sectionImpl <em>record section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.record_sectionImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getrecord_section()
   * @generated
   */
  int RECORD_SECTION = 56;

  /**
   * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_SECTION__IDENTIFIERS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_SECTION__TYPE = 1;

  /**
   * The number of structural features of the '<em>record section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.variant_partImpl <em>variant part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.variant_partImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariant_part()
   * @generated
   */
  int VARIANT_PART = 57;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_PART__TAG = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_PART__NAME = 1;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_PART__VARIANTS = 2;

  /**
   * The number of structural features of the '<em>variant part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_PART_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.tag_fieldImpl <em>tag field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.tag_fieldImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#gettag_field()
   * @generated
   */
  int TAG_FIELD = 58;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FIELD__NAME = 0;

  /**
   * The number of structural features of the '<em>tag field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.variantImpl <em>variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.variantImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariant()
   * @generated
   */
  int VARIANT = 59;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT__LABELS = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT__FIELDS = 1;

  /**
   * The number of structural features of the '<em>variant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.set_typeImpl <em>set type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.set_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getset_type()
   * @generated
   */
  int SET_TYPE = 60;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE__TYPE = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>set type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE_FEATURE_COUNT = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.file_typeImpl <em>file type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.file_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfile_type()
   * @generated
   */
  int FILE_TYPE = 61;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_TYPE__TYPE = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>file type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_TYPE_FEATURE_COUNT = UNPACKED_STRUCTURED_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.pointer_typeImpl <em>pointer type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.pointer_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getpointer_type()
   * @generated
   */
  int POINTER_TYPE = 62;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTER_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>pointer type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTER_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.variable_declaration_partImpl <em>variable declaration part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.variable_declaration_partImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariable_declaration_part()
   * @generated
   */
  int VARIABLE_DECLARATION_PART = 63;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_PART__SECTIONS = 0;

  /**
   * The number of structural features of the '<em>variable declaration part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.procedure_and_function_declaration_partImpl <em>procedure and function declaration part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.procedure_and_function_declaration_partImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getprocedure_and_function_declaration_part()
   * @generated
   */
  int PROCEDURE_AND_FUNCTION_DECLARATION_PART = 64;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURES = 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTIONS = 1;

  /**
   * The number of structural features of the '<em>procedure and function declaration part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_AND_FUNCTION_DECLARATION_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.procedure_declarationImpl <em>procedure declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.procedure_declarationImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getprocedure_declaration()
   * @generated
   */
  int PROCEDURE_DECLARATION = 65;

  /**
   * The feature id for the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION__HEADING = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION__BLOCK = 1;

  /**
   * The number of structural features of the '<em>procedure declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.formal_parameter_sectionImpl <em>formal parameter section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.formal_parameter_sectionImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getformal_parameter_section()
   * @generated
   */
  int FORMAL_PARAMETER_SECTION = 68;

  /**
   * The number of structural features of the '<em>formal parameter section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_SECTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.procedure_headingImpl <em>procedure heading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.procedure_headingImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getprocedure_heading()
   * @generated
   */
  int PROCEDURE_HEADING = 66;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_HEADING__NAME = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_HEADING__PARAMETERS = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>procedure heading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_HEADING_FEATURE_COUNT = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.formal_parameter_listImpl <em>formal parameter list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.formal_parameter_listImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getformal_parameter_list()
   * @generated
   */
  int FORMAL_PARAMETER_LIST = 67;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_LIST__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>formal parameter list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.value_parameter_sectionImpl <em>value parameter section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.value_parameter_sectionImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvalue_parameter_section()
   * @generated
   */
  int VALUE_PARAMETER_SECTION = 69;

  /**
   * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PARAMETER_SECTION__IDENTIFIERS = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PARAMETER_SECTION__TYPE = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>value parameter section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PARAMETER_SECTION_FEATURE_COUNT = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.parameter_typeImpl <em>parameter type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.parameter_typeImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getparameter_type()
   * @generated
   */
  int PARAMETER_TYPE = 70;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>parameter type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.conformant_array_schemaImpl <em>conformant array schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.conformant_array_schemaImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getconformant_array_schema()
   * @generated
   */
  int CONFORMANT_ARRAY_SCHEMA = 71;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFORMANT_ARRAY_SCHEMA__NAME = PARAMETER_TYPE__NAME;

  /**
   * The number of structural features of the '<em>conformant array schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.packed_conformant_array_schemaImpl <em>packed conformant array schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.packed_conformant_array_schemaImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getpacked_conformant_array_schema()
   * @generated
   */
  int PACKED_CONFORMANT_ARRAY_SCHEMA = 72;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKED_CONFORMANT_ARRAY_SCHEMA__NAME = CONFORMANT_ARRAY_SCHEMA__NAME;

  /**
   * The feature id for the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND = CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>packed conformant array schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKED_CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT = CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.bound_specificationImpl <em>bound specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.bound_specificationImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getbound_specification()
   * @generated
   */
  int BOUND_SPECIFICATION = 73;

  /**
   * The feature id for the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUND_SPECIFICATION__INITIAL = 0;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUND_SPECIFICATION__FINAL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUND_SPECIFICATION__NAME = 2;

  /**
   * The number of structural features of the '<em>bound specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUND_SPECIFICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.unpacked_conformant_array_schemaImpl <em>unpacked conformant array schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.unpacked_conformant_array_schemaImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getunpacked_conformant_array_schema()
   * @generated
   */
  int UNPACKED_CONFORMANT_ARRAY_SCHEMA = 74;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_CONFORMANT_ARRAY_SCHEMA__NAME = CONFORMANT_ARRAY_SCHEMA__NAME;

  /**
   * The feature id for the '<em><b>Bounds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS = CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_CONFORMANT_ARRAY_SCHEMA__ARRAY = CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>unpacked conformant array schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT = CONFORMANT_ARRAY_SCHEMA_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.variable_parameter_sectionImpl <em>variable parameter section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.variable_parameter_sectionImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariable_parameter_section()
   * @generated
   */
  int VARIABLE_PARAMETER_SECTION = 75;

  /**
   * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAMETER_SECTION__IDENTIFIERS = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAMETER_SECTION__TYPE = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>variable parameter section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAMETER_SECTION_FEATURE_COUNT = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.function_headingImpl <em>function heading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.function_headingImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfunction_heading()
   * @generated
   */
  int FUNCTION_HEADING = 76;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADING__NAME = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADING__PARAMETERS = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADING__RETURN_TYPE = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>function heading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADING_FEATURE_COUNT = FORMAL_PARAMETER_SECTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.function_declarationImpl <em>function declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.function_declarationImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfunction_declaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 77;

  /**
   * The feature id for the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__HEADING = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__BLOCK = 1;

  /**
   * The number of structural features of the '<em>function declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.pascal <em>pascal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pascal</em>'.
   * @see org.xtext.example.pascal.pascal.pascal
   * @generated
   */
  EClass getpascal();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.pascal#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Program</em>'.
   * @see org.xtext.example.pascal.pascal.pascal#getProgram()
   * @see #getpascal()
   * @generated
   */
  EReference getpascal_Program();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.program <em>program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>program</em>'.
   * @see org.xtext.example.pascal.pascal.program
   * @generated
   */
  EClass getprogram();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.program#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading</em>'.
   * @see org.xtext.example.pascal.pascal.program#getHeading()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Heading();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.program#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.pascal.pascal.program#getBlock()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.program_heading_block <em>program heading block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>program heading block</em>'.
   * @see org.xtext.example.pascal.pascal.program_heading_block
   * @generated
   */
  EClass getprogram_heading_block();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.program_heading_block#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.program_heading_block#getName()
   * @see #getprogram_heading_block()
   * @generated
   */
  EAttribute getprogram_heading_block_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.program_heading_block#getIdentifiers <em>Identifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifiers</em>'.
   * @see org.xtext.example.pascal.pascal.program_heading_block#getIdentifiers()
   * @see #getprogram_heading_block()
   * @generated
   */
  EReference getprogram_heading_block_Identifiers();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.identifier_list <em>identifier list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>identifier list</em>'.
   * @see org.xtext.example.pascal.pascal.identifier_list
   * @generated
   */
  EClass getidentifier_list();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.pascal.pascal.identifier_list#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see org.xtext.example.pascal.pascal.identifier_list#getNames()
   * @see #getidentifier_list()
   * @generated
   */
  EAttribute getidentifier_list_Names();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.block <em>block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>block</em>'.
   * @see org.xtext.example.pascal.pascal.block
   * @generated
   */
  EClass getblock();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.block#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.xtext.example.pascal.pascal.block#getLabel()
   * @see #getblock()
   * @generated
   */
  EReference getblock_Label();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.block#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see org.xtext.example.pascal.pascal.block#getConstant()
   * @see #getblock()
   * @generated
   */
  EReference getblock_Constant();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.block#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.block#getType()
   * @see #getblock()
   * @generated
   */
  EReference getblock_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.block#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.example.pascal.pascal.block#getVariable()
   * @see #getblock()
   * @generated
   */
  EReference getblock_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.block#getAbstraction <em>Abstraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstraction</em>'.
   * @see org.xtext.example.pascal.pascal.block#getAbstraction()
   * @see #getblock()
   * @generated
   */
  EReference getblock_Abstraction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.block#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.pascal.pascal.block#getStatement()
   * @see #getblock()
   * @generated
   */
  EReference getblock_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.statement_part <em>statement part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement part</em>'.
   * @see org.xtext.example.pascal.pascal.statement_part
   * @generated
   */
  EClass getstatement_part();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.statement_part#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence</em>'.
   * @see org.xtext.example.pascal.pascal.statement_part#getSequence()
   * @see #getstatement_part()
   * @generated
   */
  EReference getstatement_part_Sequence();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.statement_sequence <em>statement sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement sequence</em>'.
   * @see org.xtext.example.pascal.pascal.statement_sequence
   * @generated
   */
  EClass getstatement_sequence();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.statement_sequence#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.example.pascal.pascal.statement_sequence#getStatements()
   * @see #getstatement_sequence()
   * @generated
   */
  EReference getstatement_sequence_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement</em>'.
   * @see org.xtext.example.pascal.pascal.statement
   * @generated
   */
  EClass getstatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.statement#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.xtext.example.pascal.pascal.statement#getLabel()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Label();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.statement#getSimple <em>Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple</em>'.
   * @see org.xtext.example.pascal.pascal.statement#getSimple()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Simple();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.statement#getStructured <em>Structured</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structured</em>'.
   * @see org.xtext.example.pascal.pascal.statement#getStructured()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Structured();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.label <em>label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>label</em>'.
   * @see org.xtext.example.pascal.pascal.label
   * @generated
   */
  EClass getlabel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.label#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.xtext.example.pascal.pascal.label#getNumber()
   * @see #getlabel()
   * @generated
   */
  EAttribute getlabel_Number();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.simple_statement <em>simple statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple statement</em>'.
   * @see org.xtext.example.pascal.pascal.simple_statement
   * @generated
   */
  EClass getsimple_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.simple_statement#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment</em>'.
   * @see org.xtext.example.pascal.pascal.simple_statement#getAssignment()
   * @see #getsimple_statement()
   * @generated
   */
  EReference getsimple_statement_Assignment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.simple_statement#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.xtext.example.pascal.pascal.simple_statement#getFunction()
   * @see #getsimple_statement()
   * @generated
   */
  EReference getsimple_statement_Function();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.simple_statement#getGoto <em>Goto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Goto</em>'.
   * @see org.xtext.example.pascal.pascal.simple_statement#getGoto()
   * @see #getsimple_statement()
   * @generated
   */
  EReference getsimple_statement_Goto();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.assignment_statement <em>assignment statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>assignment statement</em>'.
   * @see org.xtext.example.pascal.pascal.assignment_statement
   * @generated
   */
  EClass getassignment_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.assignment_statement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.example.pascal.pascal.assignment_statement#getVariable()
   * @see #getassignment_statement()
   * @generated
   */
  EReference getassignment_statement_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.assignment_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.pascal.pascal.assignment_statement#getExpression()
   * @see #getassignment_statement()
   * @generated
   */
  EReference getassignment_statement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.variable <em>variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable</em>'.
   * @see org.xtext.example.pascal.pascal.variable
   * @generated
   */
  EClass getvariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.variable#getName()
   * @see #getvariable()
   * @generated
   */
  EAttribute getvariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.variable#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.example.pascal.pascal.variable#getVariable()
   * @see #getvariable()
   * @generated
   */
  EReference getvariable_Variable();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.var_ <em>var </em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>var </em>'.
   * @see org.xtext.example.pascal.pascal.var_
   * @generated
   */
  EClass getvar_();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.var_#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressions</em>'.
   * @see org.xtext.example.pascal.pascal.var_#getExpressions()
   * @see #getvar_()
   * @generated
   */
  EReference getvar__Expressions();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.var_#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.example.pascal.pascal.var_#getVariable()
   * @see #getvar_()
   * @generated
   */
  EReference getvar__Variable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.var_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.var_#getName()
   * @see #getvar_()
   * @generated
   */
  EAttribute getvar__Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.expression_list <em>expression list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression list</em>'.
   * @see org.xtext.example.pascal.pascal.expression_list
   * @generated
   */
  EClass getexpression_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.expression_list#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.xtext.example.pascal.pascal.expression_list#getExpressions()
   * @see #getexpression_list()
   * @generated
   */
  EReference getexpression_list_Expressions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression</em>'.
   * @see org.xtext.example.pascal.pascal.expression
   * @generated
   */
  EClass getexpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.expression#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.xtext.example.pascal.pascal.expression#getExpressions()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_Expressions();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.expression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.xtext.example.pascal.pascal.expression#getOperator()
   * @see #getexpression()
   * @generated
   */
  EAttribute getexpression_Operator();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.simple_expression <em>simple expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple expression</em>'.
   * @see org.xtext.example.pascal.pascal.simple_expression
   * @generated
   */
  EClass getsimple_expression();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.pascal.pascal.simple_expression#getOpterators <em>Opterators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Opterators</em>'.
   * @see org.xtext.example.pascal.pascal.simple_expression#getOpterators()
   * @see #getsimple_expression()
   * @generated
   */
  EAttribute getsimple_expression_Opterators();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.simple_expression#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see org.xtext.example.pascal.pascal.simple_expression#getTerms()
   * @see #getsimple_expression()
   * @generated
   */
  EReference getsimple_expression_Terms();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.pascal.pascal.simple_expression#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operators</em>'.
   * @see org.xtext.example.pascal.pascal.simple_expression#getOperators()
   * @see #getsimple_expression()
   * @generated
   */
  EAttribute getsimple_expression_Operators();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.simple_expression#getNumbers <em>Numbers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Numbers</em>'.
   * @see org.xtext.example.pascal.pascal.simple_expression#getNumbers()
   * @see #getsimple_expression()
   * @generated
   */
  EReference getsimple_expression_Numbers();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.term <em>term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>term</em>'.
   * @see org.xtext.example.pascal.pascal.term
   * @generated
   */
  EClass getterm();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.term#getFactors <em>Factors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Factors</em>'.
   * @see org.xtext.example.pascal.pascal.term#getFactors()
   * @see #getterm()
   * @generated
   */
  EReference getterm_Factors();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.pascal.pascal.term#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operators</em>'.
   * @see org.xtext.example.pascal.pascal.term#getOperators()
   * @see #getterm()
   * @generated
   */
  EAttribute getterm_Operators();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.factor <em>factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>factor</em>'.
   * @see org.xtext.example.pascal.pascal.factor
   * @generated
   */
  EClass getfactor();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.number <em>number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>number</em>'.
   * @see org.xtext.example.pascal.pascal.number
   * @generated
   */
  EClass getnumber();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.number#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see org.xtext.example.pascal.pascal.number#getNumber()
   * @see #getnumber()
   * @generated
   */
  EReference getnumber_Number();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.unsigned_number <em>unsigned number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unsigned number</em>'.
   * @see org.xtext.example.pascal.pascal.unsigned_number
   * @generated
   */
  EClass getunsigned_number();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.unsigned_number#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.xtext.example.pascal.pascal.unsigned_number#getNumber()
   * @see #getunsigned_number()
   * @generated
   */
  EAttribute getunsigned_number_Number();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.signed_number <em>signed number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>signed number</em>'.
   * @see org.xtext.example.pascal.pascal.signed_number
   * @generated
   */
  EClass getsigned_number();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.signed_number#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.xtext.example.pascal.pascal.signed_number#getNumber()
   * @see #getsigned_number()
   * @generated
   */
  EAttribute getsigned_number_Number();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.set <em>set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>set</em>'.
   * @see org.xtext.example.pascal.pascal.set
   * @generated
   */
  EClass getset();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.pascal.pascal.set#getBrackets <em>Brackets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Brackets</em>'.
   * @see org.xtext.example.pascal.pascal.set#getBrackets()
   * @see #getset()
   * @generated
   */
  EAttribute getset_Brackets();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.set#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressions</em>'.
   * @see org.xtext.example.pascal.pascal.set#getExpressions()
   * @see #getset()
   * @generated
   */
  EReference getset_Expressions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.function_designator <em>function designator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function designator</em>'.
   * @see org.xtext.example.pascal.pascal.function_designator
   * @generated
   */
  EClass getfunction_designator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.function_designator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.function_designator#getName()
   * @see #getfunction_designator()
   * @generated
   */
  EAttribute getfunction_designator_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.function_designator#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressions</em>'.
   * @see org.xtext.example.pascal.pascal.function_designator#getExpressions()
   * @see #getfunction_designator()
   * @generated
   */
  EReference getfunction_designator_Expressions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.structured_statement <em>structured statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>structured statement</em>'.
   * @see org.xtext.example.pascal.pascal.structured_statement
   * @generated
   */
  EClass getstructured_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.structured_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.pascal.pascal.structured_statement#getStatement()
   * @see #getstructured_statement()
   * @generated
   */
  EReference getstructured_statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.compound_statement <em>compound statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>compound statement</em>'.
   * @see org.xtext.example.pascal.pascal.compound_statement
   * @generated
   */
  EClass getcompound_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.compound_statement#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence</em>'.
   * @see org.xtext.example.pascal.pascal.compound_statement#getSequence()
   * @see #getcompound_statement()
   * @generated
   */
  EReference getcompound_statement_Sequence();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.repetitive_statement <em>repetitive statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>repetitive statement</em>'.
   * @see org.xtext.example.pascal.pascal.repetitive_statement
   * @generated
   */
  EClass getrepetitive_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.repetitive_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.pascal.pascal.repetitive_statement#getStatement()
   * @see #getrepetitive_statement()
   * @generated
   */
  EReference getrepetitive_statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.while_statement <em>while statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>while statement</em>'.
   * @see org.xtext.example.pascal.pascal.while_statement
   * @generated
   */
  EClass getwhile_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.while_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.pascal.pascal.while_statement#getExpression()
   * @see #getwhile_statement()
   * @generated
   */
  EReference getwhile_statement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.while_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.pascal.pascal.while_statement#getStatement()
   * @see #getwhile_statement()
   * @generated
   */
  EReference getwhile_statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.repeat_statement <em>repeat statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>repeat statement</em>'.
   * @see org.xtext.example.pascal.pascal.repeat_statement
   * @generated
   */
  EClass getrepeat_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.repeat_statement#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence</em>'.
   * @see org.xtext.example.pascal.pascal.repeat_statement#getSequence()
   * @see #getrepeat_statement()
   * @generated
   */
  EReference getrepeat_statement_Sequence();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.repeat_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.pascal.pascal.repeat_statement#getExpression()
   * @see #getrepeat_statement()
   * @generated
   */
  EReference getrepeat_statement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.for_statement <em>for statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>for statement</em>'.
   * @see org.xtext.example.pascal.pascal.for_statement
   * @generated
   */
  EClass getfor_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.for_statement#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment</em>'.
   * @see org.xtext.example.pascal.pascal.for_statement#getAssignment()
   * @see #getfor_statement()
   * @generated
   */
  EReference getfor_statement_Assignment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.for_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.pascal.pascal.for_statement#getExpression()
   * @see #getfor_statement()
   * @generated
   */
  EReference getfor_statement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.for_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.pascal.pascal.for_statement#getStatement()
   * @see #getfor_statement()
   * @generated
   */
  EReference getfor_statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.conditional_statement <em>conditional statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>conditional statement</em>'.
   * @see org.xtext.example.pascal.pascal.conditional_statement
   * @generated
   */
  EClass getconditional_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.conditional_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.pascal.pascal.conditional_statement#getStatement()
   * @see #getconditional_statement()
   * @generated
   */
  EReference getconditional_statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.if_statement <em>if statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>if statement</em>'.
   * @see org.xtext.example.pascal.pascal.if_statement
   * @generated
   */
  EClass getif_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.if_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.pascal.pascal.if_statement#getExpression()
   * @see #getif_statement()
   * @generated
   */
  EReference getif_statement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.if_statement#getIfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Statement</em>'.
   * @see org.xtext.example.pascal.pascal.if_statement#getIfStatement()
   * @see #getif_statement()
   * @generated
   */
  EReference getif_statement_IfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.if_statement#getElseStatement <em>Else Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Statement</em>'.
   * @see org.xtext.example.pascal.pascal.if_statement#getElseStatement()
   * @see #getif_statement()
   * @generated
   */
  EReference getif_statement_ElseStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.case_statement <em>case statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>case statement</em>'.
   * @see org.xtext.example.pascal.pascal.case_statement
   * @generated
   */
  EClass getcase_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.case_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.pascal.pascal.case_statement#getExpression()
   * @see #getcase_statement()
   * @generated
   */
  EReference getcase_statement_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.case_statement#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.xtext.example.pascal.pascal.case_statement#getCases()
   * @see #getcase_statement()
   * @generated
   */
  EReference getcase_statement_Cases();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.case_limb <em>case limb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>case limb</em>'.
   * @see org.xtext.example.pascal.pascal.case_limb
   * @generated
   */
  EClass getcase_limb();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.case_limb#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cases</em>'.
   * @see org.xtext.example.pascal.pascal.case_limb#getCases()
   * @see #getcase_limb()
   * @generated
   */
  EReference getcase_limb_Cases();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.case_limb#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.pascal.pascal.case_limb#getStatement()
   * @see #getcase_limb()
   * @generated
   */
  EReference getcase_limb_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.case_label_list <em>case label list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>case label list</em>'.
   * @see org.xtext.example.pascal.pascal.case_label_list
   * @generated
   */
  EClass getcase_label_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.case_label_list#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see org.xtext.example.pascal.pascal.case_label_list#getConstants()
   * @see #getcase_label_list()
   * @generated
   */
  EReference getcase_label_list_Constants();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.constant <em>constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant</em>'.
   * @see org.xtext.example.pascal.pascal.constant
   * @generated
   */
  EClass getconstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.constant#getOpterator <em>Opterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opterator</em>'.
   * @see org.xtext.example.pascal.pascal.constant#getOpterator()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_Opterator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.constant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.constant#getName()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.constant#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see org.xtext.example.pascal.pascal.constant#getNumber()
   * @see #getconstant()
   * @generated
   */
  EReference getconstant_Number();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.constant#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.example.pascal.pascal.constant#getString()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_String();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.constant#getBoolLiteral <em>Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bool Literal</em>'.
   * @see org.xtext.example.pascal.pascal.constant#getBoolLiteral()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_BoolLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.constant#getNil <em>Nil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nil</em>'.
   * @see org.xtext.example.pascal.pascal.constant#getNil()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_Nil();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.with_statement <em>with statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>with statement</em>'.
   * @see org.xtext.example.pascal.pascal.with_statement
   * @generated
   */
  EClass getwith_statement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.with_statement#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.xtext.example.pascal.pascal.with_statement#getVariables()
   * @see #getwith_statement()
   * @generated
   */
  EReference getwith_statement_Variables();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.with_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.pascal.pascal.with_statement#getStatement()
   * @see #getwith_statement()
   * @generated
   */
  EReference getwith_statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.goto_statement <em>goto statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>goto statement</em>'.
   * @see org.xtext.example.pascal.pascal.goto_statement
   * @generated
   */
  EClass getgoto_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.goto_statement#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.xtext.example.pascal.pascal.goto_statement#getLabel()
   * @see #getgoto_statement()
   * @generated
   */
  EReference getgoto_statement_Label();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.label_declaration_part <em>label declaration part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>label declaration part</em>'.
   * @see org.xtext.example.pascal.pascal.label_declaration_part
   * @generated
   */
  EClass getlabel_declaration_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.label_declaration_part#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Labels</em>'.
   * @see org.xtext.example.pascal.pascal.label_declaration_part#getLabels()
   * @see #getlabel_declaration_part()
   * @generated
   */
  EReference getlabel_declaration_part_Labels();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.constant_definition_part <em>constant definition part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant definition part</em>'.
   * @see org.xtext.example.pascal.pascal.constant_definition_part
   * @generated
   */
  EClass getconstant_definition_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.constant_definition_part#getConsts <em>Consts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Consts</em>'.
   * @see org.xtext.example.pascal.pascal.constant_definition_part#getConsts()
   * @see #getconstant_definition_part()
   * @generated
   */
  EReference getconstant_definition_part_Consts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.constant_definition <em>constant definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant definition</em>'.
   * @see org.xtext.example.pascal.pascal.constant_definition
   * @generated
   */
  EClass getconstant_definition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.constant_definition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.constant_definition#getName()
   * @see #getconstant_definition()
   * @generated
   */
  EAttribute getconstant_definition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.constant_definition#getConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Const</em>'.
   * @see org.xtext.example.pascal.pascal.constant_definition#getConst()
   * @see #getconstant_definition()
   * @generated
   */
  EReference getconstant_definition_Const();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.type_definition_part <em>type definition part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type definition part</em>'.
   * @see org.xtext.example.pascal.pascal.type_definition_part
   * @generated
   */
  EClass gettype_definition_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.type_definition_part#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.xtext.example.pascal.pascal.type_definition_part#getTypes()
   * @see #gettype_definition_part()
   * @generated
   */
  EReference gettype_definition_part_Types();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.type_definition <em>type definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type definition</em>'.
   * @see org.xtext.example.pascal.pascal.type_definition
   * @generated
   */
  EClass gettype_definition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.type_definition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.type_definition#getName()
   * @see #gettype_definition()
   * @generated
   */
  EAttribute gettype_definition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.type_definition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.type_definition#getType()
   * @see #gettype_definition()
   * @generated
   */
  EReference gettype_definition_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.type <em>type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type</em>'.
   * @see org.xtext.example.pascal.pascal.type
   * @generated
   */
  EClass gettype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.type#getType()
   * @see #gettype()
   * @generated
   */
  EReference gettype_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.simple_type <em>simple type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple type</em>'.
   * @see org.xtext.example.pascal.pascal.simple_type
   * @generated
   */
  EClass getsimple_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.simple_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.simple_type#getType()
   * @see #getsimple_type()
   * @generated
   */
  EReference getsimple_type_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.simple_type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.simple_type#getName()
   * @see #getsimple_type()
   * @generated
   */
  EAttribute getsimple_type_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.subrange_type <em>subrange type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>subrange type</em>'.
   * @see org.xtext.example.pascal.pascal.subrange_type
   * @generated
   */
  EClass getsubrange_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.subrange_type#getInitialConst <em>Initial Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Const</em>'.
   * @see org.xtext.example.pascal.pascal.subrange_type#getInitialConst()
   * @see #getsubrange_type()
   * @generated
   */
  EReference getsubrange_type_InitialConst();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.subrange_type#getFinalConst <em>Final Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Final Const</em>'.
   * @see org.xtext.example.pascal.pascal.subrange_type#getFinalConst()
   * @see #getsubrange_type()
   * @generated
   */
  EReference getsubrange_type_FinalConst();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.subrange_type#getSubrange <em>Subrange</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subrange</em>'.
   * @see org.xtext.example.pascal.pascal.subrange_type#getSubrange()
   * @see #getsubrange_type()
   * @generated
   */
  EAttribute getsubrange_type_Subrange();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.subrange_type#getConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Const</em>'.
   * @see org.xtext.example.pascal.pascal.subrange_type#getConst()
   * @see #getsubrange_type()
   * @generated
   */
  EReference getsubrange_type_Const();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.enumerated_type <em>enumerated type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enumerated type</em>'.
   * @see org.xtext.example.pascal.pascal.enumerated_type
   * @generated
   */
  EClass getenumerated_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.enumerated_type#getIdentifiers <em>Identifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifiers</em>'.
   * @see org.xtext.example.pascal.pascal.enumerated_type#getIdentifiers()
   * @see #getenumerated_type()
   * @generated
   */
  EReference getenumerated_type_Identifiers();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.structured_type <em>structured type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>structured type</em>'.
   * @see org.xtext.example.pascal.pascal.structured_type
   * @generated
   */
  EClass getstructured_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.structured_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.structured_type#getType()
   * @see #getstructured_type()
   * @generated
   */
  EReference getstructured_type_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.unpacked_structured_type <em>unpacked structured type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unpacked structured type</em>'.
   * @see org.xtext.example.pascal.pascal.unpacked_structured_type
   * @generated
   */
  EClass getunpacked_structured_type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.array_type <em>array type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>array type</em>'.
   * @see org.xtext.example.pascal.pascal.array_type
   * @generated
   */
  EClass getarray_type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.array_type#getIndexes <em>Indexes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indexes</em>'.
   * @see org.xtext.example.pascal.pascal.array_type#getIndexes()
   * @see #getarray_type()
   * @generated
   */
  EReference getarray_type_Indexes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.array_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.array_type#getType()
   * @see #getarray_type()
   * @generated
   */
  EReference getarray_type_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.dynamic_array_type <em>dynamic array type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>dynamic array type</em>'.
   * @see org.xtext.example.pascal.pascal.dynamic_array_type
   * @generated
   */
  EClass getdynamic_array_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.dynamic_array_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.dynamic_array_type#getType()
   * @see #getdynamic_array_type()
   * @generated
   */
  EReference getdynamic_array_type_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.index_type <em>index type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>index type</em>'.
   * @see org.xtext.example.pascal.pascal.index_type
   * @generated
   */
  EClass getindex_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.index_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.index_type#getType()
   * @see #getindex_type()
   * @generated
   */
  EReference getindex_type_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.record_type <em>record type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>record type</em>'.
   * @see org.xtext.example.pascal.pascal.record_type
   * @generated
   */
  EClass getrecord_type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.record_type#getRecordKeyword <em>Record Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Record Keyword</em>'.
   * @see org.xtext.example.pascal.pascal.record_type#getRecordKeyword()
   * @see #getrecord_type()
   * @generated
   */
  EAttribute getrecord_type_RecordKeyword();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.record_type#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fields</em>'.
   * @see org.xtext.example.pascal.pascal.record_type#getFields()
   * @see #getrecord_type()
   * @generated
   */
  EReference getrecord_type_Fields();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.record_type#getEndKeyword <em>End Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Keyword</em>'.
   * @see org.xtext.example.pascal.pascal.record_type#getEndKeyword()
   * @see #getrecord_type()
   * @generated
   */
  EAttribute getrecord_type_EndKeyword();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.field_list <em>field list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>field list</em>'.
   * @see org.xtext.example.pascal.pascal.field_list
   * @generated
   */
  EClass getfield_list();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.field_list#getFixed <em>Fixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fixed</em>'.
   * @see org.xtext.example.pascal.pascal.field_list#getFixed()
   * @see #getfield_list()
   * @generated
   */
  EReference getfield_list_Fixed();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.field_list#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see org.xtext.example.pascal.pascal.field_list#getVariants()
   * @see #getfield_list()
   * @generated
   */
  EReference getfield_list_Variants();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.fixed_part <em>fixed part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fixed part</em>'.
   * @see org.xtext.example.pascal.pascal.fixed_part
   * @generated
   */
  EClass getfixed_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.fixed_part#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.xtext.example.pascal.pascal.fixed_part#getSections()
   * @see #getfixed_part()
   * @generated
   */
  EReference getfixed_part_Sections();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.variable_identifier_list <em>variable identifier list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable identifier list</em>'.
   * @see org.xtext.example.pascal.pascal.variable_identifier_list
   * @generated
   */
  EClass getvariable_identifier_list();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.pascal.pascal.variable_identifier_list#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see org.xtext.example.pascal.pascal.variable_identifier_list#getNames()
   * @see #getvariable_identifier_list()
   * @generated
   */
  EAttribute getvariable_identifier_list_Names();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.variable_section <em>variable section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable section</em>'.
   * @see org.xtext.example.pascal.pascal.variable_section
   * @generated
   */
  EClass getvariable_section();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.variable_section#getIdentifiers <em>Identifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifiers</em>'.
   * @see org.xtext.example.pascal.pascal.variable_section#getIdentifiers()
   * @see #getvariable_section()
   * @generated
   */
  EReference getvariable_section_Identifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.variable_section#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.variable_section#getType()
   * @see #getvariable_section()
   * @generated
   */
  EReference getvariable_section_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.record_section <em>record section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>record section</em>'.
   * @see org.xtext.example.pascal.pascal.record_section
   * @generated
   */
  EClass getrecord_section();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.record_section#getIdentifiers <em>Identifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifiers</em>'.
   * @see org.xtext.example.pascal.pascal.record_section#getIdentifiers()
   * @see #getrecord_section()
   * @generated
   */
  EReference getrecord_section_Identifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.record_section#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.record_section#getType()
   * @see #getrecord_section()
   * @generated
   */
  EReference getrecord_section_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.variant_part <em>variant part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variant part</em>'.
   * @see org.xtext.example.pascal.pascal.variant_part
   * @generated
   */
  EClass getvariant_part();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.variant_part#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag</em>'.
   * @see org.xtext.example.pascal.pascal.variant_part#getTag()
   * @see #getvariant_part()
   * @generated
   */
  EReference getvariant_part_Tag();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.variant_part#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.variant_part#getName()
   * @see #getvariant_part()
   * @generated
   */
  EAttribute getvariant_part_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.variant_part#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see org.xtext.example.pascal.pascal.variant_part#getVariants()
   * @see #getvariant_part()
   * @generated
   */
  EReference getvariant_part_Variants();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.tag_field <em>tag field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tag field</em>'.
   * @see org.xtext.example.pascal.pascal.tag_field
   * @generated
   */
  EClass gettag_field();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.tag_field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.tag_field#getName()
   * @see #gettag_field()
   * @generated
   */
  EAttribute gettag_field_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.variant <em>variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variant</em>'.
   * @see org.xtext.example.pascal.pascal.variant
   * @generated
   */
  EClass getvariant();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.variant#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Labels</em>'.
   * @see org.xtext.example.pascal.pascal.variant#getLabels()
   * @see #getvariant()
   * @generated
   */
  EReference getvariant_Labels();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.variant#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fields</em>'.
   * @see org.xtext.example.pascal.pascal.variant#getFields()
   * @see #getvariant()
   * @generated
   */
  EReference getvariant_Fields();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.set_type <em>set type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>set type</em>'.
   * @see org.xtext.example.pascal.pascal.set_type
   * @generated
   */
  EClass getset_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.set_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.set_type#getType()
   * @see #getset_type()
   * @generated
   */
  EReference getset_type_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.file_type <em>file type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>file type</em>'.
   * @see org.xtext.example.pascal.pascal.file_type
   * @generated
   */
  EClass getfile_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.file_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.file_type#getType()
   * @see #getfile_type()
   * @generated
   */
  EReference getfile_type_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.pointer_type <em>pointer type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pointer type</em>'.
   * @see org.xtext.example.pascal.pascal.pointer_type
   * @generated
   */
  EClass getpointer_type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.pointer_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.pointer_type#getType()
   * @see #getpointer_type()
   * @generated
   */
  EReference getpointer_type_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.variable_declaration_part <em>variable declaration part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable declaration part</em>'.
   * @see org.xtext.example.pascal.pascal.variable_declaration_part
   * @generated
   */
  EClass getvariable_declaration_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.variable_declaration_part#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.xtext.example.pascal.pascal.variable_declaration_part#getSections()
   * @see #getvariable_declaration_part()
   * @generated
   */
  EReference getvariable_declaration_part_Sections();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.procedure_and_function_declaration_part <em>procedure and function declaration part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>procedure and function declaration part</em>'.
   * @see org.xtext.example.pascal.pascal.procedure_and_function_declaration_part
   * @generated
   */
  EClass getprocedure_and_function_declaration_part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.procedure_and_function_declaration_part#getProcedures <em>Procedures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedures</em>'.
   * @see org.xtext.example.pascal.pascal.procedure_and_function_declaration_part#getProcedures()
   * @see #getprocedure_and_function_declaration_part()
   * @generated
   */
  EReference getprocedure_and_function_declaration_part_Procedures();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.procedure_and_function_declaration_part#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.xtext.example.pascal.pascal.procedure_and_function_declaration_part#getFunctions()
   * @see #getprocedure_and_function_declaration_part()
   * @generated
   */
  EReference getprocedure_and_function_declaration_part_Functions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.procedure_declaration <em>procedure declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>procedure declaration</em>'.
   * @see org.xtext.example.pascal.pascal.procedure_declaration
   * @generated
   */
  EClass getprocedure_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.procedure_declaration#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading</em>'.
   * @see org.xtext.example.pascal.pascal.procedure_declaration#getHeading()
   * @see #getprocedure_declaration()
   * @generated
   */
  EReference getprocedure_declaration_Heading();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.procedure_declaration#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.pascal.pascal.procedure_declaration#getBlock()
   * @see #getprocedure_declaration()
   * @generated
   */
  EReference getprocedure_declaration_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.procedure_heading <em>procedure heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>procedure heading</em>'.
   * @see org.xtext.example.pascal.pascal.procedure_heading
   * @generated
   */
  EClass getprocedure_heading();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.procedure_heading#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.procedure_heading#getName()
   * @see #getprocedure_heading()
   * @generated
   */
  EAttribute getprocedure_heading_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.procedure_heading#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see org.xtext.example.pascal.pascal.procedure_heading#getParameters()
   * @see #getprocedure_heading()
   * @generated
   */
  EReference getprocedure_heading_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.formal_parameter_list <em>formal parameter list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>formal parameter list</em>'.
   * @see org.xtext.example.pascal.pascal.formal_parameter_list
   * @generated
   */
  EClass getformal_parameter_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.formal_parameter_list#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.example.pascal.pascal.formal_parameter_list#getParameters()
   * @see #getformal_parameter_list()
   * @generated
   */
  EReference getformal_parameter_list_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.formal_parameter_section <em>formal parameter section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>formal parameter section</em>'.
   * @see org.xtext.example.pascal.pascal.formal_parameter_section
   * @generated
   */
  EClass getformal_parameter_section();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.value_parameter_section <em>value parameter section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>value parameter section</em>'.
   * @see org.xtext.example.pascal.pascal.value_parameter_section
   * @generated
   */
  EClass getvalue_parameter_section();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.value_parameter_section#getIdentifiers <em>Identifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifiers</em>'.
   * @see org.xtext.example.pascal.pascal.value_parameter_section#getIdentifiers()
   * @see #getvalue_parameter_section()
   * @generated
   */
  EReference getvalue_parameter_section_Identifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.value_parameter_section#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.value_parameter_section#getType()
   * @see #getvalue_parameter_section()
   * @generated
   */
  EReference getvalue_parameter_section_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.parameter_type <em>parameter type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter type</em>'.
   * @see org.xtext.example.pascal.pascal.parameter_type
   * @generated
   */
  EClass getparameter_type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.parameter_type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.parameter_type#getName()
   * @see #getparameter_type()
   * @generated
   */
  EAttribute getparameter_type_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.conformant_array_schema <em>conformant array schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>conformant array schema</em>'.
   * @see org.xtext.example.pascal.pascal.conformant_array_schema
   * @generated
   */
  EClass getconformant_array_schema();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.packed_conformant_array_schema <em>packed conformant array schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>packed conformant array schema</em>'.
   * @see org.xtext.example.pascal.pascal.packed_conformant_array_schema
   * @generated
   */
  EClass getpacked_conformant_array_schema();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.packed_conformant_array_schema#getBound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bound</em>'.
   * @see org.xtext.example.pascal.pascal.packed_conformant_array_schema#getBound()
   * @see #getpacked_conformant_array_schema()
   * @generated
   */
  EReference getpacked_conformant_array_schema_Bound();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.bound_specification <em>bound specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bound specification</em>'.
   * @see org.xtext.example.pascal.pascal.bound_specification
   * @generated
   */
  EClass getbound_specification();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.bound_specification#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial</em>'.
   * @see org.xtext.example.pascal.pascal.bound_specification#getInitial()
   * @see #getbound_specification()
   * @generated
   */
  EAttribute getbound_specification_Initial();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.bound_specification#getFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.xtext.example.pascal.pascal.bound_specification#getFinal()
   * @see #getbound_specification()
   * @generated
   */
  EAttribute getbound_specification_Final();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.bound_specification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.bound_specification#getName()
   * @see #getbound_specification()
   * @generated
   */
  EAttribute getbound_specification_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema <em>unpacked conformant array schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unpacked conformant array schema</em>'.
   * @see org.xtext.example.pascal.pascal.unpacked_conformant_array_schema
   * @generated
   */
  EClass getunpacked_conformant_array_schema();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getBounds <em>Bounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bounds</em>'.
   * @see org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getBounds()
   * @see #getunpacked_conformant_array_schema()
   * @generated
   */
  EReference getunpacked_conformant_array_schema_Bounds();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getArray()
   * @see #getunpacked_conformant_array_schema()
   * @generated
   */
  EReference getunpacked_conformant_array_schema_Array();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.variable_parameter_section <em>variable parameter section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable parameter section</em>'.
   * @see org.xtext.example.pascal.pascal.variable_parameter_section
   * @generated
   */
  EClass getvariable_parameter_section();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.variable_parameter_section#getIdentifiers <em>Identifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifiers</em>'.
   * @see org.xtext.example.pascal.pascal.variable_parameter_section#getIdentifiers()
   * @see #getvariable_parameter_section()
   * @generated
   */
  EReference getvariable_parameter_section_Identifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.variable_parameter_section#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.pascal.pascal.variable_parameter_section#getType()
   * @see #getvariable_parameter_section()
   * @generated
   */
  EReference getvariable_parameter_section_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.function_heading <em>function heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function heading</em>'.
   * @see org.xtext.example.pascal.pascal.function_heading
   * @generated
   */
  EClass getfunction_heading();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.function_heading#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.function_heading#getName()
   * @see #getfunction_heading()
   * @generated
   */
  EAttribute getfunction_heading_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.function_heading#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see org.xtext.example.pascal.pascal.function_heading#getParameters()
   * @see #getfunction_heading()
   * @generated
   */
  EReference getfunction_heading_Parameters();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.function_heading#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see org.xtext.example.pascal.pascal.function_heading#getReturnType()
   * @see #getfunction_heading()
   * @generated
   */
  EAttribute getfunction_heading_ReturnType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.function_declaration <em>function declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function declaration</em>'.
   * @see org.xtext.example.pascal.pascal.function_declaration
   * @generated
   */
  EClass getfunction_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.function_declaration#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading</em>'.
   * @see org.xtext.example.pascal.pascal.function_declaration#getHeading()
   * @see #getfunction_declaration()
   * @generated
   */
  EReference getfunction_declaration_Heading();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.pascal.pascal.function_declaration#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.pascal.pascal.function_declaration#getBlock()
   * @see #getfunction_declaration()
   * @generated
   */
  EReference getfunction_declaration_Block();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PascalFactory getPascalFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.pascalImpl <em>pascal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.pascalImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getpascal()
     * @generated
     */
    EClass PASCAL = eINSTANCE.getpascal();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PASCAL__PROGRAM = eINSTANCE.getpascal_Program();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.programImpl <em>program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.programImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getprogram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getprogram();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__HEADING = eINSTANCE.getprogram_Heading();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__BLOCK = eINSTANCE.getprogram_Block();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.program_heading_blockImpl <em>program heading block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.program_heading_blockImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getprogram_heading_block()
     * @generated
     */
    EClass PROGRAM_HEADING_BLOCK = eINSTANCE.getprogram_heading_block();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM_HEADING_BLOCK__NAME = eINSTANCE.getprogram_heading_block_Name();

    /**
     * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM_HEADING_BLOCK__IDENTIFIERS = eINSTANCE.getprogram_heading_block_Identifiers();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.identifier_listImpl <em>identifier list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.identifier_listImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getidentifier_list()
     * @generated
     */
    EClass IDENTIFIER_LIST = eINSTANCE.getidentifier_list();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER_LIST__NAMES = eINSTANCE.getidentifier_list_Names();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.blockImpl <em>block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.blockImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getblock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getblock();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__LABEL = eINSTANCE.getblock_Label();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__CONSTANT = eINSTANCE.getblock_Constant();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__TYPE = eINSTANCE.getblock_Type();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__VARIABLE = eINSTANCE.getblock_Variable();

    /**
     * The meta object literal for the '<em><b>Abstraction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__ABSTRACTION = eINSTANCE.getblock_Abstraction();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEMENT = eINSTANCE.getblock_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.statement_partImpl <em>statement part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.statement_partImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getstatement_part()
     * @generated
     */
    EClass STATEMENT_PART = eINSTANCE.getstatement_part();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_PART__SEQUENCE = eINSTANCE.getstatement_part_Sequence();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.statement_sequenceImpl <em>statement sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.statement_sequenceImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getstatement_sequence()
     * @generated
     */
    EClass STATEMENT_SEQUENCE = eINSTANCE.getstatement_sequence();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_SEQUENCE__STATEMENTS = eINSTANCE.getstatement_sequence_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.statementImpl <em>statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getstatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getstatement();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__LABEL = eINSTANCE.getstatement_Label();

    /**
     * The meta object literal for the '<em><b>Simple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__SIMPLE = eINSTANCE.getstatement_Simple();

    /**
     * The meta object literal for the '<em><b>Structured</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__STRUCTURED = eINSTANCE.getstatement_Structured();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.labelImpl <em>label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.labelImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getlabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getlabel();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__NUMBER = eINSTANCE.getlabel_Number();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.simple_statementImpl <em>simple statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.simple_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getsimple_statement()
     * @generated
     */
    EClass SIMPLE_STATEMENT = eINSTANCE.getsimple_statement();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_STATEMENT__ASSIGNMENT = eINSTANCE.getsimple_statement_Assignment();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_STATEMENT__FUNCTION = eINSTANCE.getsimple_statement_Function();

    /**
     * The meta object literal for the '<em><b>Goto</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_STATEMENT__GOTO = eINSTANCE.getsimple_statement_Goto();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.assignment_statementImpl <em>assignment statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.assignment_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getassignment_statement()
     * @generated
     */
    EClass ASSIGNMENT_STATEMENT = eINSTANCE.getassignment_statement();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STATEMENT__VARIABLE = eINSTANCE.getassignment_statement_Variable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STATEMENT__EXPRESSION = eINSTANCE.getassignment_statement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.variableImpl <em>variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.variableImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getvariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getvariable_Name();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__VARIABLE = eINSTANCE.getvariable_Variable();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.var_Impl <em>var </em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.var_Impl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvar_()
     * @generated
     */
    EClass VAR_ = eINSTANCE.getvar_();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR___EXPRESSIONS = eINSTANCE.getvar__Expressions();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR___VARIABLE = eINSTANCE.getvar__Variable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR___NAME = eINSTANCE.getvar__Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.expression_listImpl <em>expression list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.expression_listImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getexpression_list()
     * @generated
     */
    EClass EXPRESSION_LIST = eINSTANCE.getexpression_list();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getexpression_list_Expressions();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.expressionImpl <em>expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.expressionImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getexpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getexpression();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPRESSIONS = eINSTANCE.getexpression_Expressions();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OPERATOR = eINSTANCE.getexpression_Operator();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.simple_expressionImpl <em>simple expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.simple_expressionImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getsimple_expression()
     * @generated
     */
    EClass SIMPLE_EXPRESSION = eINSTANCE.getsimple_expression();

    /**
     * The meta object literal for the '<em><b>Opterators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_EXPRESSION__OPTERATORS = eINSTANCE.getsimple_expression_Opterators();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPRESSION__TERMS = eINSTANCE.getsimple_expression_Terms();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_EXPRESSION__OPERATORS = eINSTANCE.getsimple_expression_Operators();

    /**
     * The meta object literal for the '<em><b>Numbers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPRESSION__NUMBERS = eINSTANCE.getsimple_expression_Numbers();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.termImpl <em>term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.termImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getterm()
     * @generated
     */
    EClass TERM = eINSTANCE.getterm();

    /**
     * The meta object literal for the '<em><b>Factors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__FACTORS = eINSTANCE.getterm_Factors();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__OPERATORS = eINSTANCE.getterm_Operators();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.factorImpl <em>factor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.factorImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfactor()
     * @generated
     */
    EClass FACTOR = eINSTANCE.getfactor();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.numberImpl <em>number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.numberImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getnumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getnumber();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER__NUMBER = eINSTANCE.getnumber_Number();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.unsigned_numberImpl <em>unsigned number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.unsigned_numberImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getunsigned_number()
     * @generated
     */
    EClass UNSIGNED_NUMBER = eINSTANCE.getunsigned_number();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNSIGNED_NUMBER__NUMBER = eINSTANCE.getunsigned_number_Number();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.signed_numberImpl <em>signed number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.signed_numberImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getsigned_number()
     * @generated
     */
    EClass SIGNED_NUMBER = eINSTANCE.getsigned_number();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNED_NUMBER__NUMBER = eINSTANCE.getsigned_number_Number();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.setImpl <em>set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.setImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getset()
     * @generated
     */
    EClass SET = eINSTANCE.getset();

    /**
     * The meta object literal for the '<em><b>Brackets</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET__BRACKETS = eINSTANCE.getset_Brackets();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET__EXPRESSIONS = eINSTANCE.getset_Expressions();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.function_designatorImpl <em>function designator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.function_designatorImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfunction_designator()
     * @generated
     */
    EClass FUNCTION_DESIGNATOR = eINSTANCE.getfunction_designator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DESIGNATOR__NAME = eINSTANCE.getfunction_designator_Name();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DESIGNATOR__EXPRESSIONS = eINSTANCE.getfunction_designator_Expressions();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.structured_statementImpl <em>structured statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.structured_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getstructured_statement()
     * @generated
     */
    EClass STRUCTURED_STATEMENT = eINSTANCE.getstructured_statement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURED_STATEMENT__STATEMENT = eINSTANCE.getstructured_statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.compound_statementImpl <em>compound statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.compound_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getcompound_statement()
     * @generated
     */
    EClass COMPOUND_STATEMENT = eINSTANCE.getcompound_statement();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_STATEMENT__SEQUENCE = eINSTANCE.getcompound_statement_Sequence();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.repetitive_statementImpl <em>repetitive statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.repetitive_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getrepetitive_statement()
     * @generated
     */
    EClass REPETITIVE_STATEMENT = eINSTANCE.getrepetitive_statement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPETITIVE_STATEMENT__STATEMENT = eINSTANCE.getrepetitive_statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.while_statementImpl <em>while statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.while_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getwhile_statement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getwhile_statement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__EXPRESSION = eINSTANCE.getwhile_statement_Expression();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__STATEMENT = eINSTANCE.getwhile_statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.repeat_statementImpl <em>repeat statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.repeat_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getrepeat_statement()
     * @generated
     */
    EClass REPEAT_STATEMENT = eINSTANCE.getrepeat_statement();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_STATEMENT__SEQUENCE = eINSTANCE.getrepeat_statement_Sequence();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_STATEMENT__EXPRESSION = eINSTANCE.getrepeat_statement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.for_statementImpl <em>for statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.for_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfor_statement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getfor_statement();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__ASSIGNMENT = eINSTANCE.getfor_statement_Assignment();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EXPRESSION = eINSTANCE.getfor_statement_Expression();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__STATEMENT = eINSTANCE.getfor_statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.conditional_statementImpl <em>conditional statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.conditional_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getconditional_statement()
     * @generated
     */
    EClass CONDITIONAL_STATEMENT = eINSTANCE.getconditional_statement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_STATEMENT__STATEMENT = eINSTANCE.getconditional_statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.if_statementImpl <em>if statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.if_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getif_statement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getif_statement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__EXPRESSION = eINSTANCE.getif_statement_Expression();

    /**
     * The meta object literal for the '<em><b>If Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__IF_STATEMENT = eINSTANCE.getif_statement_IfStatement();

    /**
     * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_STATEMENT = eINSTANCE.getif_statement_ElseStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.case_statementImpl <em>case statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.case_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getcase_statement()
     * @generated
     */
    EClass CASE_STATEMENT = eINSTANCE.getcase_statement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT__EXPRESSION = eINSTANCE.getcase_statement_Expression();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT__CASES = eINSTANCE.getcase_statement_Cases();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.case_limbImpl <em>case limb</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.case_limbImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getcase_limb()
     * @generated
     */
    EClass CASE_LIMB = eINSTANCE.getcase_limb();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_LIMB__CASES = eINSTANCE.getcase_limb_Cases();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_LIMB__STATEMENT = eINSTANCE.getcase_limb_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.case_label_listImpl <em>case label list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.case_label_listImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getcase_label_list()
     * @generated
     */
    EClass CASE_LABEL_LIST = eINSTANCE.getcase_label_list();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_LABEL_LIST__CONSTANTS = eINSTANCE.getcase_label_list_Constants();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.constantImpl <em>constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.constantImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getconstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getconstant();

    /**
     * The meta object literal for the '<em><b>Opterator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__OPTERATOR = eINSTANCE.getconstant_Opterator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NAME = eINSTANCE.getconstant_Name();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__NUMBER = eINSTANCE.getconstant_Number();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__STRING = eINSTANCE.getconstant_String();

    /**
     * The meta object literal for the '<em><b>Bool Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__BOOL_LITERAL = eINSTANCE.getconstant_BoolLiteral();

    /**
     * The meta object literal for the '<em><b>Nil</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NIL = eINSTANCE.getconstant_Nil();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.with_statementImpl <em>with statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.with_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getwith_statement()
     * @generated
     */
    EClass WITH_STATEMENT = eINSTANCE.getwith_statement();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_STATEMENT__VARIABLES = eINSTANCE.getwith_statement_Variables();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_STATEMENT__STATEMENT = eINSTANCE.getwith_statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.goto_statementImpl <em>goto statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.goto_statementImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getgoto_statement()
     * @generated
     */
    EClass GOTO_STATEMENT = eINSTANCE.getgoto_statement();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOTO_STATEMENT__LABEL = eINSTANCE.getgoto_statement_Label();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.label_declaration_partImpl <em>label declaration part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.label_declaration_partImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getlabel_declaration_part()
     * @generated
     */
    EClass LABEL_DECLARATION_PART = eINSTANCE.getlabel_declaration_part();

    /**
     * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_DECLARATION_PART__LABELS = eINSTANCE.getlabel_declaration_part_Labels();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.constant_definition_partImpl <em>constant definition part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.constant_definition_partImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getconstant_definition_part()
     * @generated
     */
    EClass CONSTANT_DEFINITION_PART = eINSTANCE.getconstant_definition_part();

    /**
     * The meta object literal for the '<em><b>Consts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DEFINITION_PART__CONSTS = eINSTANCE.getconstant_definition_part_Consts();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.constant_definitionImpl <em>constant definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.constant_definitionImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getconstant_definition()
     * @generated
     */
    EClass CONSTANT_DEFINITION = eINSTANCE.getconstant_definition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DEFINITION__NAME = eINSTANCE.getconstant_definition_Name();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DEFINITION__CONST = eINSTANCE.getconstant_definition_Const();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.type_definition_partImpl <em>type definition part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.type_definition_partImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#gettype_definition_part()
     * @generated
     */
    EClass TYPE_DEFINITION_PART = eINSTANCE.gettype_definition_part();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION_PART__TYPES = eINSTANCE.gettype_definition_part_Types();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.type_definitionImpl <em>type definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.type_definitionImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#gettype_definition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.gettype_definition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEFINITION__NAME = eINSTANCE.gettype_definition_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION__TYPE = eINSTANCE.gettype_definition_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.typeImpl <em>type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#gettype()
     * @generated
     */
    EClass TYPE = eINSTANCE.gettype();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__TYPE = eINSTANCE.gettype_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.simple_typeImpl <em>simple type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.simple_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getsimple_type()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getsimple_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_TYPE__TYPE = eINSTANCE.getsimple_type_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_TYPE__NAME = eINSTANCE.getsimple_type_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.subrange_typeImpl <em>subrange type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.subrange_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getsubrange_type()
     * @generated
     */
    EClass SUBRANGE_TYPE = eINSTANCE.getsubrange_type();

    /**
     * The meta object literal for the '<em><b>Initial Const</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE_TYPE__INITIAL_CONST = eINSTANCE.getsubrange_type_InitialConst();

    /**
     * The meta object literal for the '<em><b>Final Const</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE_TYPE__FINAL_CONST = eINSTANCE.getsubrange_type_FinalConst();

    /**
     * The meta object literal for the '<em><b>Subrange</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBRANGE_TYPE__SUBRANGE = eINSTANCE.getsubrange_type_Subrange();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE_TYPE__CONST = eINSTANCE.getsubrange_type_Const();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.enumerated_typeImpl <em>enumerated type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.enumerated_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getenumerated_type()
     * @generated
     */
    EClass ENUMERATED_TYPE = eINSTANCE.getenumerated_type();

    /**
     * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATED_TYPE__IDENTIFIERS = eINSTANCE.getenumerated_type_Identifiers();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.structured_typeImpl <em>structured type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.structured_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getstructured_type()
     * @generated
     */
    EClass STRUCTURED_TYPE = eINSTANCE.getstructured_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURED_TYPE__TYPE = eINSTANCE.getstructured_type_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.unpacked_structured_typeImpl <em>unpacked structured type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.unpacked_structured_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getunpacked_structured_type()
     * @generated
     */
    EClass UNPACKED_STRUCTURED_TYPE = eINSTANCE.getunpacked_structured_type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.array_typeImpl <em>array type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.array_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getarray_type()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getarray_type();

    /**
     * The meta object literal for the '<em><b>Indexes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__INDEXES = eINSTANCE.getarray_type_Indexes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__TYPE = eINSTANCE.getarray_type_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.dynamic_array_typeImpl <em>dynamic array type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.dynamic_array_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getdynamic_array_type()
     * @generated
     */
    EClass DYNAMIC_ARRAY_TYPE = eINSTANCE.getdynamic_array_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_ARRAY_TYPE__TYPE = eINSTANCE.getdynamic_array_type_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.index_typeImpl <em>index type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.index_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getindex_type()
     * @generated
     */
    EClass INDEX_TYPE = eINSTANCE.getindex_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEX_TYPE__TYPE = eINSTANCE.getindex_type_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.record_typeImpl <em>record type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.record_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getrecord_type()
     * @generated
     */
    EClass RECORD_TYPE = eINSTANCE.getrecord_type();

    /**
     * The meta object literal for the '<em><b>Record Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_TYPE__RECORD_KEYWORD = eINSTANCE.getrecord_type_RecordKeyword();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TYPE__FIELDS = eINSTANCE.getrecord_type_Fields();

    /**
     * The meta object literal for the '<em><b>End Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_TYPE__END_KEYWORD = eINSTANCE.getrecord_type_EndKeyword();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.field_listImpl <em>field list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.field_listImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfield_list()
     * @generated
     */
    EClass FIELD_LIST = eINSTANCE.getfield_list();

    /**
     * The meta object literal for the '<em><b>Fixed</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_LIST__FIXED = eINSTANCE.getfield_list_Fixed();

    /**
     * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_LIST__VARIANTS = eINSTANCE.getfield_list_Variants();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.fixed_partImpl <em>fixed part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.fixed_partImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfixed_part()
     * @generated
     */
    EClass FIXED_PART = eINSTANCE.getfixed_part();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIXED_PART__SECTIONS = eINSTANCE.getfixed_part_Sections();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.variable_identifier_listImpl <em>variable identifier list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.variable_identifier_listImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariable_identifier_list()
     * @generated
     */
    EClass VARIABLE_IDENTIFIER_LIST = eINSTANCE.getvariable_identifier_list();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_IDENTIFIER_LIST__NAMES = eINSTANCE.getvariable_identifier_list_Names();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.variable_sectionImpl <em>variable section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.variable_sectionImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariable_section()
     * @generated
     */
    EClass VARIABLE_SECTION = eINSTANCE.getvariable_section();

    /**
     * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_SECTION__IDENTIFIERS = eINSTANCE.getvariable_section_Identifiers();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_SECTION__TYPE = eINSTANCE.getvariable_section_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.record_sectionImpl <em>record section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.record_sectionImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getrecord_section()
     * @generated
     */
    EClass RECORD_SECTION = eINSTANCE.getrecord_section();

    /**
     * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_SECTION__IDENTIFIERS = eINSTANCE.getrecord_section_Identifiers();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_SECTION__TYPE = eINSTANCE.getrecord_section_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.variant_partImpl <em>variant part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.variant_partImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariant_part()
     * @generated
     */
    EClass VARIANT_PART = eINSTANCE.getvariant_part();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT_PART__TAG = eINSTANCE.getvariant_part_Tag();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIANT_PART__NAME = eINSTANCE.getvariant_part_Name();

    /**
     * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT_PART__VARIANTS = eINSTANCE.getvariant_part_Variants();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.tag_fieldImpl <em>tag field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.tag_fieldImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#gettag_field()
     * @generated
     */
    EClass TAG_FIELD = eINSTANCE.gettag_field();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG_FIELD__NAME = eINSTANCE.gettag_field_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.variantImpl <em>variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.variantImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariant()
     * @generated
     */
    EClass VARIANT = eINSTANCE.getvariant();

    /**
     * The meta object literal for the '<em><b>Labels</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT__LABELS = eINSTANCE.getvariant_Labels();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT__FIELDS = eINSTANCE.getvariant_Fields();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.set_typeImpl <em>set type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.set_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getset_type()
     * @generated
     */
    EClass SET_TYPE = eINSTANCE.getset_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_TYPE__TYPE = eINSTANCE.getset_type_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.file_typeImpl <em>file type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.file_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfile_type()
     * @generated
     */
    EClass FILE_TYPE = eINSTANCE.getfile_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE_TYPE__TYPE = eINSTANCE.getfile_type_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.pointer_typeImpl <em>pointer type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.pointer_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getpointer_type()
     * @generated
     */
    EClass POINTER_TYPE = eINSTANCE.getpointer_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTER_TYPE__TYPE = eINSTANCE.getpointer_type_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.variable_declaration_partImpl <em>variable declaration part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.variable_declaration_partImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariable_declaration_part()
     * @generated
     */
    EClass VARIABLE_DECLARATION_PART = eINSTANCE.getvariable_declaration_part();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION_PART__SECTIONS = eINSTANCE.getvariable_declaration_part_Sections();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.procedure_and_function_declaration_partImpl <em>procedure and function declaration part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.procedure_and_function_declaration_partImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getprocedure_and_function_declaration_part()
     * @generated
     */
    EClass PROCEDURE_AND_FUNCTION_DECLARATION_PART = eINSTANCE.getprocedure_and_function_declaration_part();

    /**
     * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURES = eINSTANCE.getprocedure_and_function_declaration_part_Procedures();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTIONS = eINSTANCE.getprocedure_and_function_declaration_part_Functions();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.procedure_declarationImpl <em>procedure declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.procedure_declarationImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getprocedure_declaration()
     * @generated
     */
    EClass PROCEDURE_DECLARATION = eINSTANCE.getprocedure_declaration();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_DECLARATION__HEADING = eINSTANCE.getprocedure_declaration_Heading();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_DECLARATION__BLOCK = eINSTANCE.getprocedure_declaration_Block();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.procedure_headingImpl <em>procedure heading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.procedure_headingImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getprocedure_heading()
     * @generated
     */
    EClass PROCEDURE_HEADING = eINSTANCE.getprocedure_heading();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_HEADING__NAME = eINSTANCE.getprocedure_heading_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_HEADING__PARAMETERS = eINSTANCE.getprocedure_heading_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.formal_parameter_listImpl <em>formal parameter list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.formal_parameter_listImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getformal_parameter_list()
     * @generated
     */
    EClass FORMAL_PARAMETER_LIST = eINSTANCE.getformal_parameter_list();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMETER_LIST__PARAMETERS = eINSTANCE.getformal_parameter_list_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.formal_parameter_sectionImpl <em>formal parameter section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.formal_parameter_sectionImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getformal_parameter_section()
     * @generated
     */
    EClass FORMAL_PARAMETER_SECTION = eINSTANCE.getformal_parameter_section();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.value_parameter_sectionImpl <em>value parameter section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.value_parameter_sectionImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvalue_parameter_section()
     * @generated
     */
    EClass VALUE_PARAMETER_SECTION = eINSTANCE.getvalue_parameter_section();

    /**
     * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_PARAMETER_SECTION__IDENTIFIERS = eINSTANCE.getvalue_parameter_section_Identifiers();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_PARAMETER_SECTION__TYPE = eINSTANCE.getvalue_parameter_section_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.parameter_typeImpl <em>parameter type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.parameter_typeImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getparameter_type()
     * @generated
     */
    EClass PARAMETER_TYPE = eINSTANCE.getparameter_type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getparameter_type_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.conformant_array_schemaImpl <em>conformant array schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.conformant_array_schemaImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getconformant_array_schema()
     * @generated
     */
    EClass CONFORMANT_ARRAY_SCHEMA = eINSTANCE.getconformant_array_schema();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.packed_conformant_array_schemaImpl <em>packed conformant array schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.packed_conformant_array_schemaImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getpacked_conformant_array_schema()
     * @generated
     */
    EClass PACKED_CONFORMANT_ARRAY_SCHEMA = eINSTANCE.getpacked_conformant_array_schema();

    /**
     * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND = eINSTANCE.getpacked_conformant_array_schema_Bound();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.bound_specificationImpl <em>bound specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.bound_specificationImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getbound_specification()
     * @generated
     */
    EClass BOUND_SPECIFICATION = eINSTANCE.getbound_specification();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUND_SPECIFICATION__INITIAL = eINSTANCE.getbound_specification_Initial();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUND_SPECIFICATION__FINAL = eINSTANCE.getbound_specification_Final();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUND_SPECIFICATION__NAME = eINSTANCE.getbound_specification_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.unpacked_conformant_array_schemaImpl <em>unpacked conformant array schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.unpacked_conformant_array_schemaImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getunpacked_conformant_array_schema()
     * @generated
     */
    EClass UNPACKED_CONFORMANT_ARRAY_SCHEMA = eINSTANCE.getunpacked_conformant_array_schema();

    /**
     * The meta object literal for the '<em><b>Bounds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS = eINSTANCE.getunpacked_conformant_array_schema_Bounds();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPACKED_CONFORMANT_ARRAY_SCHEMA__ARRAY = eINSTANCE.getunpacked_conformant_array_schema_Array();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.variable_parameter_sectionImpl <em>variable parameter section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.variable_parameter_sectionImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getvariable_parameter_section()
     * @generated
     */
    EClass VARIABLE_PARAMETER_SECTION = eINSTANCE.getvariable_parameter_section();

    /**
     * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_PARAMETER_SECTION__IDENTIFIERS = eINSTANCE.getvariable_parameter_section_Identifiers();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_PARAMETER_SECTION__TYPE = eINSTANCE.getvariable_parameter_section_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.function_headingImpl <em>function heading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.function_headingImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfunction_heading()
     * @generated
     */
    EClass FUNCTION_HEADING = eINSTANCE.getfunction_heading();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADING__NAME = eINSTANCE.getfunction_heading_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_HEADING__PARAMETERS = eINSTANCE.getfunction_heading_Parameters();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADING__RETURN_TYPE = eINSTANCE.getfunction_heading_ReturnType();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.function_declarationImpl <em>function declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.function_declarationImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getfunction_declaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getfunction_declaration();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__HEADING = eINSTANCE.getfunction_declaration_Heading();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__BLOCK = eINSTANCE.getfunction_declaration_Block();

  }

} //PascalPackage
