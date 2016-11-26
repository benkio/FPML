/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.EffectFullAdtType;
import it.unibo.fPML.EffectFullSumType;
import it.unibo.fPML.FPMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Full Sum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.EffectFullSumTypeImpl#getAdtElement <em>Adt Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectFullSumTypeImpl extends MinimalEObjectImpl.Container implements EffectFullSumType
{
  /**
   * The cached value of the '{@link #getAdtElement() <em>Adt Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdtElement()
   * @generated
   * @ordered
   */
  protected EffectFullAdtType adtElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffectFullSumTypeImpl()
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
    return FPMLPackage.Literals.EFFECT_FULL_SUM_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullAdtType getAdtElement()
  {
    return adtElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdtElement(EffectFullAdtType newAdtElement, NotificationChain msgs)
  {
    EffectFullAdtType oldAdtElement = adtElement;
    adtElement = newAdtElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_SUM_TYPE__ADT_ELEMENT, oldAdtElement, newAdtElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdtElement(EffectFullAdtType newAdtElement)
  {
    if (newAdtElement != adtElement)
    {
      NotificationChain msgs = null;
      if (adtElement != null)
        msgs = ((InternalEObject)adtElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_SUM_TYPE__ADT_ELEMENT, null, msgs);
      if (newAdtElement != null)
        msgs = ((InternalEObject)newAdtElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_SUM_TYPE__ADT_ELEMENT, null, msgs);
      msgs = basicSetAdtElement(newAdtElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_SUM_TYPE__ADT_ELEMENT, newAdtElement, newAdtElement));
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
      case FPMLPackage.EFFECT_FULL_SUM_TYPE__ADT_ELEMENT:
        return basicSetAdtElement(null, msgs);
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
      case FPMLPackage.EFFECT_FULL_SUM_TYPE__ADT_ELEMENT:
        return getAdtElement();
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
      case FPMLPackage.EFFECT_FULL_SUM_TYPE__ADT_ELEMENT:
        setAdtElement((EffectFullAdtType)newValue);
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
      case FPMLPackage.EFFECT_FULL_SUM_TYPE__ADT_ELEMENT:
        setAdtElement((EffectFullAdtType)null);
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
      case FPMLPackage.EFFECT_FULL_SUM_TYPE__ADT_ELEMENT:
        return adtElement != null;
    }
    return super.eIsSet(featureID);
  }

} //EffectFullSumTypeImpl
