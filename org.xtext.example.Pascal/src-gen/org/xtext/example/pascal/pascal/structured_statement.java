/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>structured statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.structured_statement#getCompound <em>Compound</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.structured_statement#getRepetitive <em>Repetitive</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.structured_statement#getConditional <em>Conditional</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.structured_statement#getWithStmt <em>With Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement()
 * @model
 * @generated
 */
public interface structured_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Compound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compound</em>' containment reference.
   * @see #setCompound(compound_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement_Compound()
   * @model containment="true"
   * @generated
   */
  compound_statement getCompound();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.structured_statement#getCompound <em>Compound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compound</em>' containment reference.
   * @see #getCompound()
   * @generated
   */
  void setCompound(compound_statement value);

  /**
   * Returns the value of the '<em><b>Repetitive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repetitive</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repetitive</em>' containment reference.
   * @see #setRepetitive(repetitive_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement_Repetitive()
   * @model containment="true"
   * @generated
   */
  repetitive_statement getRepetitive();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.structured_statement#getRepetitive <em>Repetitive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repetitive</em>' containment reference.
   * @see #getRepetitive()
   * @generated
   */
  void setRepetitive(repetitive_statement value);

  /**
   * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional</em>' containment reference.
   * @see #setConditional(conditional_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement_Conditional()
   * @model containment="true"
   * @generated
   */
  conditional_statement getConditional();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.structured_statement#getConditional <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional</em>' containment reference.
   * @see #getConditional()
   * @generated
   */
  void setConditional(conditional_statement value);

  /**
   * Returns the value of the '<em><b>With Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>With Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>With Stmt</em>' containment reference.
   * @see #setWithStmt(with_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement_WithStmt()
   * @model containment="true"
   * @generated
   */
  with_statement getWithStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.structured_statement#getWithStmt <em>With Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>With Stmt</em>' containment reference.
   * @see #getWithStmt()
   * @generated
   */
  void setWithStmt(with_statement value);

} // structured_statement
