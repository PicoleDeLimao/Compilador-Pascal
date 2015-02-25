/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>program heading block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.program_heading_block#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.program_heading_block#getIdentifiers <em>Identifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getprogram_heading_block()
 * @model
 * @generated
 */
public interface program_heading_block extends EObject
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
   * @see org.xtext.example.pascal.pascal.PascalPackage#getprogram_heading_block_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.program_heading_block#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifiers</em>' containment reference.
   * @see #setIdentifiers(identifier_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getprogram_heading_block_Identifiers()
   * @model containment="true"
   * @generated
   */
  identifier_list getIdentifiers();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.program_heading_block#getIdentifiers <em>Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifiers</em>' containment reference.
   * @see #getIdentifiers()
   * @generated
   */
  void setIdentifiers(identifier_list value);

} // program_heading_block
