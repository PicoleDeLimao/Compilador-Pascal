/**
 */
package org.xtext.example.pascal.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.field_list;
import org.xtext.example.pascal.pascal.fixed_part;
import org.xtext.example.pascal.pascal.variant_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>field list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.field_listImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.field_listImpl#getVariants <em>Variants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class field_listImpl extends MinimalEObjectImpl.Container implements field_list
{
  /**
   * The cached value of the '{@link #getFixed() <em>Fixed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixed()
   * @generated
   * @ordered
   */
  protected fixed_part fixed;

  /**
   * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariants()
   * @generated
   * @ordered
   */
  protected EList<variant_part> variants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected field_listImpl()
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
    return PascalPackage.Literals.FIELD_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fixed_part getFixed()
  {
    return fixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFixed(fixed_part newFixed, NotificationChain msgs)
  {
    fixed_part oldFixed = fixed;
    fixed = newFixed;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__FIXED, oldFixed, newFixed);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixed(fixed_part newFixed)
  {
    if (newFixed != fixed)
    {
      NotificationChain msgs = null;
      if (fixed != null)
        msgs = ((InternalEObject)fixed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__FIXED, null, msgs);
      if (newFixed != null)
        msgs = ((InternalEObject)newFixed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__FIXED, null, msgs);
      msgs = basicSetFixed(newFixed, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__FIXED, newFixed, newFixed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variant_part> getVariants()
  {
    if (variants == null)
    {
      variants = new EObjectContainmentEList<variant_part>(variant_part.class, this, PascalPackage.FIELD_LIST__VARIANTS);
    }
    return variants;
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
      case PascalPackage.FIELD_LIST__FIXED:
        return basicSetFixed(null, msgs);
      case PascalPackage.FIELD_LIST__VARIANTS:
        return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.FIELD_LIST__FIXED:
        return getFixed();
      case PascalPackage.FIELD_LIST__VARIANTS:
        return getVariants();
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
      case PascalPackage.FIELD_LIST__FIXED:
        setFixed((fixed_part)newValue);
        return;
      case PascalPackage.FIELD_LIST__VARIANTS:
        getVariants().clear();
        getVariants().addAll((Collection<? extends variant_part>)newValue);
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
      case PascalPackage.FIELD_LIST__FIXED:
        setFixed((fixed_part)null);
        return;
      case PascalPackage.FIELD_LIST__VARIANTS:
        getVariants().clear();
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
      case PascalPackage.FIELD_LIST__FIXED:
        return fixed != null;
      case PascalPackage.FIELD_LIST__VARIANTS:
        return variants != null && !variants.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //field_listImpl
