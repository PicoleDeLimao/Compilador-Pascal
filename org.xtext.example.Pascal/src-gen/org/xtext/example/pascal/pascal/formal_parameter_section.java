/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>formal parameter section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.formal_parameter_section#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.formal_parameter_section#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.formal_parameter_section#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.formal_parameter_section#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getformal_parameter_section()
 * @model
 * @generated
 */
public interface formal_parameter_section extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(value_parameter_section)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getformal_parameter_section_Value()
   * @model containment="true"
   * @generated
   */
  value_parameter_section getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.formal_parameter_section#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(value_parameter_section value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(variable_parameter_section)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getformal_parameter_section_Variable()
   * @model containment="true"
   * @generated
   */
  variable_parameter_section getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.formal_parameter_section#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(variable_parameter_section value);

  /**
   * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure</em>' containment reference.
   * @see #setProcedure(procedure_heading)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getformal_parameter_section_Procedure()
   * @model containment="true"
   * @generated
   */
  procedure_heading getProcedure();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.formal_parameter_section#getProcedure <em>Procedure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure</em>' containment reference.
   * @see #getProcedure()
   * @generated
   */
  void setProcedure(procedure_heading value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(function_heading)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getformal_parameter_section_Function()
   * @model containment="true"
   * @generated
   */
  function_heading getFunction();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.formal_parameter_section#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(function_heading value);

} // formal_parameter_section