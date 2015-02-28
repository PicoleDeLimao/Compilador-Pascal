/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>conditional statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.conditional_statement#getIfStmt <em>If Stmt</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.conditional_statement#getCaseStmt <em>Case Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getconditional_statement()
 * @model
 * @generated
 */
public interface conditional_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>If Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Stmt</em>' containment reference.
   * @see #setIfStmt(if_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getconditional_statement_IfStmt()
   * @model containment="true"
   * @generated
   */
  if_statement getIfStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.conditional_statement#getIfStmt <em>If Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Stmt</em>' containment reference.
   * @see #getIfStmt()
   * @generated
   */
  void setIfStmt(if_statement value);

  /**
   * Returns the value of the '<em><b>Case Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Stmt</em>' containment reference.
   * @see #setCaseStmt(case_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getconditional_statement_CaseStmt()
   * @model containment="true"
   * @generated
   */
  case_statement getCaseStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.conditional_statement#getCaseStmt <em>Case Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Stmt</em>' containment reference.
   * @see #getCaseStmt()
   * @generated
   */
  void setCaseStmt(case_statement value);

} // conditional_statement
