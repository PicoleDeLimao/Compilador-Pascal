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
import org.xtext.example.pascal.pascal.assignment_statement;
import org.xtext.example.pascal.pascal.function_designator;
import org.xtext.example.pascal.pascal.goto_statement;
import org.xtext.example.pascal.pascal.simple_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_statementImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_statementImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_statementImpl#getGoto <em>Goto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simple_statementImpl extends MinimalEObjectImpl.Container implements simple_statement
{
  /**
   * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected assignment_statement assignment;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected function_designator function;

  /**
   * The cached value of the '{@link #getGoto() <em>Goto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoto()
   * @generated
   * @ordered
   */
  protected goto_statement goto_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_statementImpl()
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
    return PascalPackage.Literals.SIMPLE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment_statement getAssignment()
  {
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment(assignment_statement newAssignment, NotificationChain msgs)
  {
    assignment_statement oldAssignment = assignment;
    assignment = newAssignment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT, oldAssignment, newAssignment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment(assignment_statement newAssignment)
  {
    if (newAssignment != assignment)
    {
      NotificationChain msgs = null;
      if (assignment != null)
        msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT, null, msgs);
      if (newAssignment != null)
        msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT, null, msgs);
      msgs = basicSetAssignment(newAssignment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT, newAssignment, newAssignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_designator getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(function_designator newFunction, NotificationChain msgs)
  {
    function_designator oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(function_designator newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__FUNCTION, newFunction, newFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public goto_statement getGoto()
  {
    return goto_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGoto(goto_statement newGoto, NotificationChain msgs)
  {
    goto_statement oldGoto = goto_;
    goto_ = newGoto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__GOTO, oldGoto, newGoto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoto(goto_statement newGoto)
  {
    if (newGoto != goto_)
    {
      NotificationChain msgs = null;
      if (goto_ != null)
        msgs = ((InternalEObject)goto_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__GOTO, null, msgs);
      if (newGoto != null)
        msgs = ((InternalEObject)newGoto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__GOTO, null, msgs);
      msgs = basicSetGoto(newGoto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__GOTO, newGoto, newGoto));
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT:
        return basicSetAssignment(null, msgs);
      case PascalPackage.SIMPLE_STATEMENT__FUNCTION:
        return basicSetFunction(null, msgs);
      case PascalPackage.SIMPLE_STATEMENT__GOTO:
        return basicSetGoto(null, msgs);
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT:
        return getAssignment();
      case PascalPackage.SIMPLE_STATEMENT__FUNCTION:
        return getFunction();
      case PascalPackage.SIMPLE_STATEMENT__GOTO:
        return getGoto();
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT:
        setAssignment((assignment_statement)newValue);
        return;
      case PascalPackage.SIMPLE_STATEMENT__FUNCTION:
        setFunction((function_designator)newValue);
        return;
      case PascalPackage.SIMPLE_STATEMENT__GOTO:
        setGoto((goto_statement)newValue);
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT:
        setAssignment((assignment_statement)null);
        return;
      case PascalPackage.SIMPLE_STATEMENT__FUNCTION:
        setFunction((function_designator)null);
        return;
      case PascalPackage.SIMPLE_STATEMENT__GOTO:
        setGoto((goto_statement)null);
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT:
        return assignment != null;
      case PascalPackage.SIMPLE_STATEMENT__FUNCTION:
        return function != null;
      case PascalPackage.SIMPLE_STATEMENT__GOTO:
        return goto_ != null;
    }
    return super.eIsSet(featureID);
  }

} //simple_statementImpl
