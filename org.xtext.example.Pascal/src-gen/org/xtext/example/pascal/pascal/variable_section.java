/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.variable_section#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.variable_section#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable_section()
 * @model
 * @generated
 */
public interface variable_section extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifiers</em>' containment reference.
   * @see #setIdentifiers(variable_identifier_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable_section_Identifiers()
   * @model containment="true"
   * @generated
   */
  variable_identifier_list getIdentifiers();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.variable_section#getIdentifiers <em>Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifiers</em>' containment reference.
   * @see #getIdentifiers()
   * @generated
   */
  void setIdentifiers(variable_identifier_list value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(type)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable_section_Type()
   * @model containment="true"
   * @generated
   */
  type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.variable_section#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type value);

} // variable_section
