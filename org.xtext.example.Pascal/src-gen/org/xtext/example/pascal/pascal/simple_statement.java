/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.simple_statement#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.simple_statement#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.simple_statement#getGoto <em>Goto</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_statement()
 * @model
 * @generated
 */
public interface simple_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(assignment_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_statement_Assignment()
   * @model containment="true"
   * @generated
   */
  assignment_statement getAssignment();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.simple_statement#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(assignment_statement value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(function_designator)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_statement_Function()
   * @model containment="true"
   * @generated
   */
  function_designator getFunction();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.simple_statement#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(function_designator value);

  /**
   * Returns the value of the '<em><b>Goto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goto</em>' containment reference.
   * @see #setGoto(goto_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_statement_Goto()
   * @model containment="true"
   * @generated
   */
  goto_statement getGoto();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.simple_statement#getGoto <em>Goto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goto</em>' containment reference.
   * @see #getGoto()
   * @generated
   */
  void setGoto(goto_statement value);

} // simple_statement
