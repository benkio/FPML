/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.IOEffectFullExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IO Effect Full Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.IOEffectFullExpressionImpl#getInnerValue <em>Inner Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IOEffectFullExpressionImpl extends EffectFullExpressionImpl implements IOEffectFullExpression
{
  /**
   * The cached value of the '{@link #getInnerValue() <em>Inner Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerValue()
   * @generated
   * @ordered
   */
  protected EffectFullExpression innerValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IOEffectFullExpressionImpl()
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
    return FPMLPackage.Literals.IO_EFFECT_FULL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullExpression getInnerValue()
  {
    return innerValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInnerValue(EffectFullExpression newInnerValue, NotificationChain msgs)
  {
    EffectFullExpression oldInnerValue = innerValue;
    innerValue = newInnerValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.IO_EFFECT_FULL_EXPRESSION__INNER_VALUE, oldInnerValue, newInnerValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInnerValue(EffectFullExpression newInnerValue)
  {
    if (newInnerValue != innerValue)
    {
      NotificationChain msgs = null;
      if (innerValue != null)
        msgs = ((InternalEObject)innerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.IO_EFFECT_FULL_EXPRESSION__INNER_VALUE, null, msgs);
      if (newInnerValue != null)
        msgs = ((InternalEObject)newInnerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.IO_EFFECT_FULL_EXPRESSION__INNER_VALUE, null, msgs);
      msgs = basicSetInnerValue(newInnerValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.IO_EFFECT_FULL_EXPRESSION__INNER_VALUE, newInnerValue, newInnerValue));
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
      case FPMLPackage.IO_EFFECT_FULL_EXPRESSION__INNER_VALUE:
        return basicSetInnerValue(null, msgs);
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
      case FPMLPackage.IO_EFFECT_FULL_EXPRESSION__INNER_VALUE:
        return getInnerValue();
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
      case FPMLPackage.IO_EFFECT_FULL_EXPRESSION__INNER_VALUE:
        setInnerValue((EffectFullExpression)newValue);
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
      case FPMLPackage.IO_EFFECT_FULL_EXPRESSION__INNER_VALUE:
        setInnerValue((EffectFullExpression)null);
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
      case FPMLPackage.IO_EFFECT_FULL_EXPRESSION__INNER_VALUE:
        return innerValue != null;
    }
    return super.eIsSet(featureID);
  }

} //IOEffectFullExpressionImpl
