/**
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.constant;
import org.xtext.example.pascal.pascal.subrange_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>subrange type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.subrange_typeImpl#getInitialConst <em>Initial Const</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.subrange_typeImpl#getFinalConst <em>Final Const</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.subrange_typeImpl#getSubrange <em>Subrange</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.subrange_typeImpl#getConst <em>Const</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class subrange_typeImpl extends MinimalEObjectImpl.Container implements subrange_type
{
  /**
   * The cached value of the '{@link #getInitialConst() <em>Initial Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialConst()
   * @generated
   * @ordered
   */
  protected constant initialConst;

  /**
   * The cached value of the '{@link #getFinalConst() <em>Final Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinalConst()
   * @generated
   * @ordered
   */
  protected constant finalConst;

  /**
   * The default value of the '{@link #getSubrange() <em>Subrange</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubrange()
   * @generated
   * @ordered
   */
  protected static final String SUBRANGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubrange() <em>Subrange</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubrange()
   * @generated
   * @ordered
   */
  protected String subrange = SUBRANGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getConst() <em>Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected constant const_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected subrange_typeImpl()
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
    return PascalPackage.Literals.SUBRANGE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant getInitialConst()
  {
    return initialConst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialConst(constant newInitialConst, NotificationChain msgs)
  {
    constant oldInitialConst = initialConst;
    initialConst = newInitialConst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SUBRANGE_TYPE__INITIAL_CONST, oldInitialConst, newInitialConst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialConst(constant newInitialConst)
  {
    if (newInitialConst != initialConst)
    {
      NotificationChain msgs = null;
      if (initialConst != null)
        msgs = ((InternalEObject)initialConst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SUBRANGE_TYPE__INITIAL_CONST, null, msgs);
      if (newInitialConst != null)
        msgs = ((InternalEObject)newInitialConst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SUBRANGE_TYPE__INITIAL_CONST, null, msgs);
      msgs = basicSetInitialConst(newInitialConst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SUBRANGE_TYPE__INITIAL_CONST, newInitialConst, newInitialConst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant getFinalConst()
  {
    return finalConst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinalConst(constant newFinalConst, NotificationChain msgs)
  {
    constant oldFinalConst = finalConst;
    finalConst = newFinalConst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SUBRANGE_TYPE__FINAL_CONST, oldFinalConst, newFinalConst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinalConst(constant newFinalConst)
  {
    if (newFinalConst != finalConst)
    {
      NotificationChain msgs = null;
      if (finalConst != null)
        msgs = ((InternalEObject)finalConst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SUBRANGE_TYPE__FINAL_CONST, null, msgs);
      if (newFinalConst != null)
        msgs = ((InternalEObject)newFinalConst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SUBRANGE_TYPE__FINAL_CONST, null, msgs);
      msgs = basicSetFinalConst(newFinalConst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SUBRANGE_TYPE__FINAL_CONST, newFinalConst, newFinalConst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubrange()
  {
    return subrange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubrange(String newSubrange)
  {
    String oldSubrange = subrange;
    subrange = newSubrange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SUBRANGE_TYPE__SUBRANGE, oldSubrange, subrange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant getConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConst(constant newConst, NotificationChain msgs)
  {
    constant oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SUBRANGE_TYPE__CONST, oldConst, newConst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst(constant newConst)
  {
    if (newConst != const_)
    {
      NotificationChain msgs = null;
      if (const_ != null)
        msgs = ((InternalEObject)const_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SUBRANGE_TYPE__CONST, null, msgs);
      if (newConst != null)
        msgs = ((InternalEObject)newConst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SUBRANGE_TYPE__CONST, null, msgs);
      msgs = basicSetConst(newConst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SUBRANGE_TYPE__CONST, newConst, newConst));
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
      case PascalPackage.SUBRANGE_TYPE__INITIAL_CONST:
        return basicSetInitialConst(null, msgs);
      case PascalPackage.SUBRANGE_TYPE__FINAL_CONST:
        return basicSetFinalConst(null, msgs);
      case PascalPackage.SUBRANGE_TYPE__CONST:
        return basicSetConst(null, msgs);
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
      case PascalPackage.SUBRANGE_TYPE__INITIAL_CONST:
        return getInitialConst();
      case PascalPackage.SUBRANGE_TYPE__FINAL_CONST:
        return getFinalConst();
      case PascalPackage.SUBRANGE_TYPE__SUBRANGE:
        return getSubrange();
      case PascalPackage.SUBRANGE_TYPE__CONST:
        return getConst();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.SUBRANGE_TYPE__INITIAL_CONST:
        setInitialConst((constant)newValue);
        return;
      case PascalPackage.SUBRANGE_TYPE__FINAL_CONST:
        setFinalConst((constant)newValue);
        return;
      case PascalPackage.SUBRANGE_TYPE__SUBRANGE:
        setSubrange((String)newValue);
        return;
      case PascalPackage.SUBRANGE_TYPE__CONST:
        setConst((constant)newValue);
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
      case PascalPackage.SUBRANGE_TYPE__INITIAL_CONST:
        setInitialConst((constant)null);
        return;
      case PascalPackage.SUBRANGE_TYPE__FINAL_CONST:
        setFinalConst((constant)null);
        return;
      case PascalPackage.SUBRANGE_TYPE__SUBRANGE:
        setSubrange(SUBRANGE_EDEFAULT);
        return;
      case PascalPackage.SUBRANGE_TYPE__CONST:
        setConst((constant)null);
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
      case PascalPackage.SUBRANGE_TYPE__INITIAL_CONST:
        return initialConst != null;
      case PascalPackage.SUBRANGE_TYPE__FINAL_CONST:
        return finalConst != null;
      case PascalPackage.SUBRANGE_TYPE__SUBRANGE:
        return SUBRANGE_EDEFAULT == null ? subrange != null : !SUBRANGE_EDEFAULT.equals(subrange);
      case PascalPackage.SUBRANGE_TYPE__CONST:
        return const_ != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (subrange: ");
    result.append(subrange);
    result.append(')');
    return result.toString();
  }

} //subrange_typeImpl
