/**
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.field_list;
import org.xtext.example.pascal.pascal.record_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>record type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.record_typeImpl#getRecordKeyword <em>Record Keyword</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.record_typeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.record_typeImpl#getEndKeyword <em>End Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class record_typeImpl extends unpacked_structured_typeImpl implements record_type
{
  /**
   * The default value of the '{@link #getRecordKeyword() <em>Record Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordKeyword()
   * @generated
   * @ordered
   */
  protected static final String RECORD_KEYWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecordKeyword() <em>Record Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordKeyword()
   * @generated
   * @ordered
   */
  protected String recordKeyword = RECORD_KEYWORD_EDEFAULT;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected field_list fields;

  /**
   * The default value of the '{@link #getEndKeyword() <em>End Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndKeyword()
   * @generated
   * @ordered
   */
  protected static final String END_KEYWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndKeyword() <em>End Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndKeyword()
   * @generated
   * @ordered
   */
  protected String endKeyword = END_KEYWORD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected record_typeImpl()
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
    return PascalPackage.Literals.RECORD_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecordKeyword()
  {
    return recordKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordKeyword(String newRecordKeyword)
  {
    String oldRecordKeyword = recordKeyword;
    recordKeyword = newRecordKeyword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_TYPE__RECORD_KEYWORD, oldRecordKeyword, recordKeyword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_list getFields()
  {
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFields(field_list newFields, NotificationChain msgs)
  {
    field_list oldFields = fields;
    fields = newFields;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_TYPE__FIELDS, oldFields, newFields);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFields(field_list newFields)
  {
    if (newFields != fields)
    {
      NotificationChain msgs = null;
      if (fields != null)
        msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_TYPE__FIELDS, null, msgs);
      if (newFields != null)
        msgs = ((InternalEObject)newFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_TYPE__FIELDS, null, msgs);
      msgs = basicSetFields(newFields, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_TYPE__FIELDS, newFields, newFields));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndKeyword()
  {
    return endKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndKeyword(String newEndKeyword)
  {
    String oldEndKeyword = endKeyword;
    endKeyword = newEndKeyword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_TYPE__END_KEYWORD, oldEndKeyword, endKeyword));
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
      case PascalPackage.RECORD_TYPE__FIELDS:
        return basicSetFields(null, msgs);
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
      case PascalPackage.RECORD_TYPE__RECORD_KEYWORD:
        return getRecordKeyword();
      case PascalPackage.RECORD_TYPE__FIELDS:
        return getFields();
      case PascalPackage.RECORD_TYPE__END_KEYWORD:
        return getEndKeyword();
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
      case PascalPackage.RECORD_TYPE__RECORD_KEYWORD:
        setRecordKeyword((String)newValue);
        return;
      case PascalPackage.RECORD_TYPE__FIELDS:
        setFields((field_list)newValue);
        return;
      case PascalPackage.RECORD_TYPE__END_KEYWORD:
        setEndKeyword((String)newValue);
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
      case PascalPackage.RECORD_TYPE__RECORD_KEYWORD:
        setRecordKeyword(RECORD_KEYWORD_EDEFAULT);
        return;
      case PascalPackage.RECORD_TYPE__FIELDS:
        setFields((field_list)null);
        return;
      case PascalPackage.RECORD_TYPE__END_KEYWORD:
        setEndKeyword(END_KEYWORD_EDEFAULT);
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
      case PascalPackage.RECORD_TYPE__RECORD_KEYWORD:
        return RECORD_KEYWORD_EDEFAULT == null ? recordKeyword != null : !RECORD_KEYWORD_EDEFAULT.equals(recordKeyword);
      case PascalPackage.RECORD_TYPE__FIELDS:
        return fields != null;
      case PascalPackage.RECORD_TYPE__END_KEYWORD:
        return END_KEYWORD_EDEFAULT == null ? endKeyword != null : !END_KEYWORD_EDEFAULT.equals(endKeyword);
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
    result.append(" (recordKeyword: ");
    result.append(recordKeyword);
    result.append(", endKeyword: ");
    result.append(endKeyword);
    result.append(')');
    return result.toString();
  }

} //record_typeImpl
