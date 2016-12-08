/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.ApplyFFactor;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.PureFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply FFactor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.ApplyFFactorImpl#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.ApplyFFactorImpl#getValueExpression <em>Value Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplyFFactorImpl extends MinimalEObjectImpl.Container implements ApplyFFactor
{
  /**
   * The cached value of the '{@link #getValueReference() <em>Value Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueReference()
   * @generated
   * @ordered
   */
  protected PureFunction valueReference;

  /**
   * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueExpression()
   * @generated
   * @ordered
   */
  protected Expression valueExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplyFFactorImpl()
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
    return FPMLPackage.Literals.APPLY_FFACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureFunction getValueReference()
  {
    if (valueReference != null && valueReference.eIsProxy())
    {
      InternalEObject oldValueReference = (InternalEObject)valueReference;
      valueReference = (PureFunction)eResolveProxy(oldValueReference);
      if (valueReference != oldValueReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FPMLPackage.APPLY_FFACTOR__VALUE_REFERENCE, oldValueReference, valueReference));
      }
    }
    return valueReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureFunction basicGetValueReference()
  {
    return valueReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueReference(PureFunction newValueReference)
  {
    PureFunction oldValueReference = valueReference;
    valueReference = newValueReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.APPLY_FFACTOR__VALUE_REFERENCE, oldValueReference, valueReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValueExpression()
  {
    return valueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueExpression(Expression newValueExpression, NotificationChain msgs)
  {
    Expression oldValueExpression = valueExpression;
    valueExpression = newValueExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.APPLY_FFACTOR__VALUE_EXPRESSION, oldValueExpression, newValueExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueExpression(Expression newValueExpression)
  {
    if (newValueExpression != valueExpression)
    {
      NotificationChain msgs = null;
      if (valueExpression != null)
        msgs = ((InternalEObject)valueExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.APPLY_FFACTOR__VALUE_EXPRESSION, null, msgs);
      if (newValueExpression != null)
        msgs = ((InternalEObject)newValueExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.APPLY_FFACTOR__VALUE_EXPRESSION, null, msgs);
      msgs = basicSetValueExpression(newValueExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.APPLY_FFACTOR__VALUE_EXPRESSION, newValueExpression, newValueExpression));
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
      case FPMLPackage.APPLY_FFACTOR__VALUE_EXPRESSION:
        return basicSetValueExpression(null, msgs);
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
      case FPMLPackage.APPLY_FFACTOR__VALUE_REFERENCE:
        if (resolve) return getValueReference();
        return basicGetValueReference();
      case FPMLPackage.APPLY_FFACTOR__VALUE_EXPRESSION:
        return getValueExpression();
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
      case FPMLPackage.APPLY_FFACTOR__VALUE_REFERENCE:
        setValueReference((PureFunction)newValue);
        return;
      case FPMLPackage.APPLY_FFACTOR__VALUE_EXPRESSION:
        setValueExpression((Expression)newValue);
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
      case FPMLPackage.APPLY_FFACTOR__VALUE_REFERENCE:
        setValueReference((PureFunction)null);
        return;
      case FPMLPackage.APPLY_FFACTOR__VALUE_EXPRESSION:
        setValueExpression((Expression)null);
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
      case FPMLPackage.APPLY_FFACTOR__VALUE_REFERENCE:
        return valueReference != null;
      case FPMLPackage.APPLY_FFACTOR__VALUE_EXPRESSION:
        return valueExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //ApplyFFactorImpl
