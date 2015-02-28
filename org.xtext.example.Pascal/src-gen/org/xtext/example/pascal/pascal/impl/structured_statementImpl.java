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
import org.xtext.example.pascal.pascal.compound_statement;
import org.xtext.example.pascal.pascal.conditional_statement;
import org.xtext.example.pascal.pascal.repetitive_statement;
import org.xtext.example.pascal.pascal.structured_statement;
import org.xtext.example.pascal.pascal.with_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>structured statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.structured_statementImpl#getCompound <em>Compound</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.structured_statementImpl#getRepetitive <em>Repetitive</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.structured_statementImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.structured_statementImpl#getWithStmt <em>With Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class structured_statementImpl extends MinimalEObjectImpl.Container implements structured_statement
{
  /**
   * The cached value of the '{@link #getCompound() <em>Compound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompound()
   * @generated
   * @ordered
   */
  protected compound_statement compound;

  /**
   * The cached value of the '{@link #getRepetitive() <em>Repetitive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepetitive()
   * @generated
   * @ordered
   */
  protected repetitive_statement repetitive;

  /**
   * The cached value of the '{@link #getConditional() <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditional()
   * @generated
   * @ordered
   */
  protected conditional_statement conditional;

  /**
   * The cached value of the '{@link #getWithStmt() <em>With Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWithStmt()
   * @generated
   * @ordered
   */
  protected with_statement withStmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected structured_statementImpl()
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
    return PascalPackage.Literals.STRUCTURED_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compound_statement getCompound()
  {
    return compound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompound(compound_statement newCompound, NotificationChain msgs)
  {
    compound_statement oldCompound = compound;
    compound = newCompound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__COMPOUND, oldCompound, newCompound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompound(compound_statement newCompound)
  {
    if (newCompound != compound)
    {
      NotificationChain msgs = null;
      if (compound != null)
        msgs = ((InternalEObject)compound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__COMPOUND, null, msgs);
      if (newCompound != null)
        msgs = ((InternalEObject)newCompound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__COMPOUND, null, msgs);
      msgs = basicSetCompound(newCompound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__COMPOUND, newCompound, newCompound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public repetitive_statement getRepetitive()
  {
    return repetitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepetitive(repetitive_statement newRepetitive, NotificationChain msgs)
  {
    repetitive_statement oldRepetitive = repetitive;
    repetitive = newRepetitive;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__REPETITIVE, oldRepetitive, newRepetitive);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepetitive(repetitive_statement newRepetitive)
  {
    if (newRepetitive != repetitive)
    {
      NotificationChain msgs = null;
      if (repetitive != null)
        msgs = ((InternalEObject)repetitive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__REPETITIVE, null, msgs);
      if (newRepetitive != null)
        msgs = ((InternalEObject)newRepetitive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__REPETITIVE, null, msgs);
      msgs = basicSetRepetitive(newRepetitive, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__REPETITIVE, newRepetitive, newRepetitive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditional_statement getConditional()
  {
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditional(conditional_statement newConditional, NotificationChain msgs)
  {
    conditional_statement oldConditional = conditional;
    conditional = newConditional;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL, oldConditional, newConditional);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditional(conditional_statement newConditional)
  {
    if (newConditional != conditional)
    {
      NotificationChain msgs = null;
      if (conditional != null)
        msgs = ((InternalEObject)conditional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL, null, msgs);
      if (newConditional != null)
        msgs = ((InternalEObject)newConditional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL, null, msgs);
      msgs = basicSetConditional(newConditional, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL, newConditional, newConditional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public with_statement getWithStmt()
  {
    return withStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWithStmt(with_statement newWithStmt, NotificationChain msgs)
  {
    with_statement oldWithStmt = withStmt;
    withStmt = newWithStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__WITH_STMT, oldWithStmt, newWithStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWithStmt(with_statement newWithStmt)
  {
    if (newWithStmt != withStmt)
    {
      NotificationChain msgs = null;
      if (withStmt != null)
        msgs = ((InternalEObject)withStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__WITH_STMT, null, msgs);
      if (newWithStmt != null)
        msgs = ((InternalEObject)newWithStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__WITH_STMT, null, msgs);
      msgs = basicSetWithStmt(newWithStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__WITH_STMT, newWithStmt, newWithStmt));
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
      case PascalPackage.STRUCTURED_STATEMENT__COMPOUND:
        return basicSetCompound(null, msgs);
      case PascalPackage.STRUCTURED_STATEMENT__REPETITIVE:
        return basicSetRepetitive(null, msgs);
      case PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL:
        return basicSetConditional(null, msgs);
      case PascalPackage.STRUCTURED_STATEMENT__WITH_STMT:
        return basicSetWithStmt(null, msgs);
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
      case PascalPackage.STRUCTURED_STATEMENT__COMPOUND:
        return getCompound();
      case PascalPackage.STRUCTURED_STATEMENT__REPETITIVE:
        return getRepetitive();
      case PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL:
        return getConditional();
      case PascalPackage.STRUCTURED_STATEMENT__WITH_STMT:
        return getWithStmt();
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
      case PascalPackage.STRUCTURED_STATEMENT__COMPOUND:
        setCompound((compound_statement)newValue);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__REPETITIVE:
        setRepetitive((repetitive_statement)newValue);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL:
        setConditional((conditional_statement)newValue);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__WITH_STMT:
        setWithStmt((with_statement)newValue);
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
      case PascalPackage.STRUCTURED_STATEMENT__COMPOUND:
        setCompound((compound_statement)null);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__REPETITIVE:
        setRepetitive((repetitive_statement)null);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL:
        setConditional((conditional_statement)null);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__WITH_STMT:
        setWithStmt((with_statement)null);
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
      case PascalPackage.STRUCTURED_STATEMENT__COMPOUND:
        return compound != null;
      case PascalPackage.STRUCTURED_STATEMENT__REPETITIVE:
        return repetitive != null;
      case PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL:
        return conditional != null;
      case PascalPackage.STRUCTURED_STATEMENT__WITH_STMT:
        return withStmt != null;
    }
    return super.eIsSet(featureID);
  }

} //structured_statementImpl
