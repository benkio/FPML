/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.PureAdtValue;
import it.unibo.fPML.PureProdValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pure Prod Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.PureProdValueImpl#getProdAdtElement1 <em>Prod Adt Element1</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.PureProdValueImpl#getProdAdtElement2 <em>Prod Adt Element2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PureProdValueImpl extends PureAdtValueImpl implements PureProdValue
{
  /**
   * The cached value of the '{@link #getProdAdtElement1() <em>Prod Adt Element1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProdAdtElement1()
   * @generated
   * @ordered
   */
  protected PureAdtValue prodAdtElement1;

  /**
   * The cached value of the '{@link #getProdAdtElement2() <em>Prod Adt Element2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProdAdtElement2()
   * @generated
   * @ordered
   */
  protected PureAdtValue prodAdtElement2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PureProdValueImpl()
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
    return FPMLPackage.Literals.PURE_PROD_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureAdtValue getProdAdtElement1()
  {
    return prodAdtElement1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProdAdtElement1(PureAdtValue newProdAdtElement1, NotificationChain msgs)
  {
    PureAdtValue oldProdAdtElement1 = prodAdtElement1;
    prodAdtElement1 = newProdAdtElement1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT1, oldProdAdtElement1, newProdAdtElement1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProdAdtElement1(PureAdtValue newProdAdtElement1)
  {
    if (newProdAdtElement1 != prodAdtElement1)
    {
      NotificationChain msgs = null;
      if (prodAdtElement1 != null)
        msgs = ((InternalEObject)prodAdtElement1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT1, null, msgs);
      if (newProdAdtElement1 != null)
        msgs = ((InternalEObject)newProdAdtElement1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT1, null, msgs);
      msgs = basicSetProdAdtElement1(newProdAdtElement1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT1, newProdAdtElement1, newProdAdtElement1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureAdtValue getProdAdtElement2()
  {
    return prodAdtElement2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProdAdtElement2(PureAdtValue newProdAdtElement2, NotificationChain msgs)
  {
    PureAdtValue oldProdAdtElement2 = prodAdtElement2;
    prodAdtElement2 = newProdAdtElement2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT2, oldProdAdtElement2, newProdAdtElement2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProdAdtElement2(PureAdtValue newProdAdtElement2)
  {
    if (newProdAdtElement2 != prodAdtElement2)
    {
      NotificationChain msgs = null;
      if (prodAdtElement2 != null)
        msgs = ((InternalEObject)prodAdtElement2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT2, null, msgs);
      if (newProdAdtElement2 != null)
        msgs = ((InternalEObject)newProdAdtElement2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT2, null, msgs);
      msgs = basicSetProdAdtElement2(newProdAdtElement2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT2, newProdAdtElement2, newProdAdtElement2));
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
      case FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT1:
        return basicSetProdAdtElement1(null, msgs);
      case FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT2:
        return basicSetProdAdtElement2(null, msgs);
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
      case FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT1:
        return getProdAdtElement1();
      case FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT2:
        return getProdAdtElement2();
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
      case FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT1:
        setProdAdtElement1((PureAdtValue)newValue);
        return;
      case FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT2:
        setProdAdtElement2((PureAdtValue)newValue);
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
      case FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT1:
        setProdAdtElement1((PureAdtValue)null);
        return;
      case FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT2:
        setProdAdtElement2((PureAdtValue)null);
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
      case FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT1:
        return prodAdtElement1 != null;
      case FPMLPackage.PURE_PROD_VALUE__PROD_ADT_ELEMENT2:
        return prodAdtElement2 != null;
    }
    return super.eIsSet(featureID);
  }

} //PureProdValueImpl