/**
 */
package org.xtext.example.pascal.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.function_declaration;
import org.xtext.example.pascal.pascal.procedure_and_function_declaration_part;
import org.xtext.example.pascal.pascal.procedure_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>procedure and function declaration part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.procedure_and_function_declaration_partImpl#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.procedure_and_function_declaration_partImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class procedure_and_function_declaration_partImpl extends MinimalEObjectImpl.Container implements procedure_and_function_declaration_part
{
  /**
   * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedures()
   * @generated
   * @ordered
   */
  protected EList<procedure_declaration> procedures;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<function_declaration> functions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected procedure_and_function_declaration_partImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.PROCEDURE_AND_FUNCTION_DECLARATION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<procedure_declaration> getProcedures()
  {
    if (procedures == null)
    {
      procedures = new EObjectContainmentEList<procedure_declaration>(procedure_declaration.class, this, PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURES);
    }
    return procedures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<function_declaration> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<function_declaration>(function_declaration.class, this, PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURES:
        return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURES:
        return getProcedures();
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTIONS:
        return getFunctions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURES:
        getProcedures().clear();
        getProcedures().addAll((Collection<? extends procedure_declaration>)newValue);
        return;
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends function_declaration>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURES:
        getProcedures().clear();
        return;
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTIONS:
        getFunctions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURES:
        return procedures != null && !procedures.isEmpty();
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTIONS:
        return functions != null && !functions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //procedure_and_function_declaration_partImpl
