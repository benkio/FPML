/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.EffectFullAdtValue;
import it.unibo.fPML.FPMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Full Adt Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.EffectFullAdtValueImpl#getInnerValue <em>Inner Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectFullAdtValueImpl extends MinimalEObjectImpl.Container implements EffectFullAdtValue
{
  /**
   * The cached value of the '{@link #getInnerValue() <em>Inner Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerValue()
   * @generated
   * @ordered
   */
  protected EObject innerValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffectFullAdtValueImpl()
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
    return FPMLPackage.Literals.EFFECT_FULL_ADT_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getInnerValue()
  {
    return innerValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInnerValue(EObject newInnerValue, NotificationChain msgs)
  {
    EObject oldInnerValue = innerValue;
    innerValue = newInnerValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_ADT_VALUE__INNER_VALUE, oldInnerValue, newInnerValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInnerValue(EObject newInnerValue)
  {
    if (newInnerValue != innerValue)
    {
      NotificationChain msgs = null;
      if (innerValue != null)
        msgs = ((InternalEObject)innerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_ADT_VALUE__INNER_VALUE, null, msgs);
      if (newInnerValue != null)
        msgs = ((InternalEObject)newInnerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_ADT_VALUE__INNER_VALUE, null, msgs);
      msgs = basicSetInnerValue(newInnerValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_ADT_VALUE__INNER_VALUE, newInnerValue, newInnerValue));
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
      case FPMLPackage.EFFECT_FULL_ADT_VALUE__INNER_VALUE:
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
      case FPMLPackage.EFFECT_FULL_ADT_VALUE__INNER_VALUE:
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
      case FPMLPackage.EFFECT_FULL_ADT_VALUE__INNER_VALUE:
        setInnerValue((EObject)newValue);
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
      case FPMLPackage.EFFECT_FULL_ADT_VALUE__INNER_VALUE:
        setInnerValue((EObject)null);
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
      case FPMLPackage.EFFECT_FULL_ADT_VALUE__INNER_VALUE:
        return innerValue != null;
    }
    return super.eIsSet(featureID);
  }

} //EffectFullAdtValueImpl
