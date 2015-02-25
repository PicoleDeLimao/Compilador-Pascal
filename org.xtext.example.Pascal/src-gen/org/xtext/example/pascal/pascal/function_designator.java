/**
 */
package org.xtext.example.pascal.pascal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function designator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.function_designator#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.function_designator#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getfunction_designator()
 * @model
 * @generated
 */
public interface function_designator extends simple_statement, factor
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfunction_designator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.function_designator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference.
   * @see #setExpressions(expression_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfunction_designator_Expressions()
   * @model containment="true"
   * @generated
   */
  expression_list getExpressions();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.function_designator#getExpressions <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressions</em>' containment reference.
   * @see #getExpressions()
   * @generated
   */
  void setExpressions(expression_list value);

} // function_designator
