/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.term#getFactors <em>Factors</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.term#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getterm()
 * @model
 * @generated
 */
public interface term extends EObject
{
  /**
   * Returns the value of the '<em><b>Factors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.factor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factors</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getterm_Factors()
   * @model containment="true"
   * @generated
   */
  EList<factor> getFactors();

  /**
   * Returns the value of the '<em><b>Operators</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operators</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' attribute list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getterm_Operators()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperators();

} // term
