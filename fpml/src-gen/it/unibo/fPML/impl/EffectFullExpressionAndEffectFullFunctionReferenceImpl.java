/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullExpressionAndEffectFullFunctionReference;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.FPMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Full Expression And Effect Full Function Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.EffectFullExpressionAndEffectFullFunctionReferenceImpl#getProdAdtElementExpression <em>Prod Adt Element Expression</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.EffectFullExpressionAndEffectFullFunctionReferenceImpl#getProdAdtElementFunction <em>Prod Adt Element Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectFullExpressionAndEffectFullFunctionReferenceImpl extends MinimalEObjectImpl.Container implements EffectFullExpressionAndEffectFullFunctionReference
{
  /**
   * The cached value of the '{@link #getProdAdtElementExpression() <em>Prod Adt Element Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProdAdtElementExpression()
   * @generated
   * @ordered
   */
  protected EffectFullExpression prodAdtElementExpression;

  /**
   * The cached value of the '{@link #getProdAdtElementFunction() <em>Prod Adt Element Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProdAdtElementFunction()
   * @generated
   * @ordered
   */
  protected EffectFullFunction prodAdtElementFunction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffectFullExpressionAndEffectFullFunctionReferenceImpl()
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
    return FPMLPackage.Literals.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullExpression getProdAdtElementExpression()
  {
    return prodAdtElementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProdAdtElementExpression(EffectFullExpression newProdAdtElementExpression, NotificationChain msgs)
  {
    EffectFullExpression oldProdAdtElementExpression = prodAdtElementExpression;
    prodAdtElementExpression = newProdAdtElementExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_EXPRESSION, oldProdAdtElementExpression, newProdAdtElementExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProdAdtElementExpression(EffectFullExpression newProdAdtElementExpression)
  {
    if (newProdAdtElementExpression != prodAdtElementExpression)
    {
      NotificationChain msgs = null;
      if (prodAdtElementExpression != null)
        msgs = ((InternalEObject)prodAdtElementExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_EXPRESSION, null, msgs);
      if (newProdAdtElementExpression != null)
        msgs = ((InternalEObject)newProdAdtElementExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_EXPRESSION, null, msgs);
      msgs = basicSetProdAdtElementExpression(newProdAdtElementExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_EXPRESSION, newProdAdtElementExpression, newProdAdtElementExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullFunction getProdAdtElementFunction()
  {
    if (prodAdtElementFunction != null && prodAdtElementFunction.eIsProxy())
    {
      InternalEObject oldProdAdtElementFunction = (InternalEObject)prodAdtElementFunction;
      prodAdtElementFunction = (EffectFullFunction)eResolveProxy(oldProdAdtElementFunction);
      if (prodAdtElementFunction != oldProdAdtElementFunction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_FUNCTION, oldProdAdtElementFunction, prodAdtElementFunction));
      }
    }
    return prodAdtElementFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullFunction basicGetProdAdtElementFunction()
  {
    return prodAdtElementFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProdAdtElementFunction(EffectFullFunction newProdAdtElementFunction)
  {
    EffectFullFunction oldProdAdtElementFunction = prodAdtElementFunction;
    prodAdtElementFunction = newProdAdtElementFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_FUNCTION, oldProdAdtElementFunction, prodAdtElementFunction));
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
      case FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_EXPRESSION:
        return basicSetProdAdtElementExpression(null, msgs);
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
      case FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_EXPRESSION:
        return getProdAdtElementExpression();
      case FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_FUNCTION:
        if (resolve) return getProdAdtElementFunction();
        return basicGetProdAdtElementFunction();
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
      case FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_EXPRESSION:
        setProdAdtElementExpression((EffectFullExpression)newValue);
        return;
      case FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_FUNCTION:
        setProdAdtElementFunction((EffectFullFunction)newValue);
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
      case FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_EXPRESSION:
        setProdAdtElementExpression((EffectFullExpression)null);
        return;
      case FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_FUNCTION:
        setProdAdtElementFunction((EffectFullFunction)null);
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
      case FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_EXPRESSION:
        return prodAdtElementExpression != null;
      case FPMLPackage.EFFECT_FULL_EXPRESSION_AND_EFFECT_FULL_FUNCTION_REFERENCE__PROD_ADT_ELEMENT_FUNCTION:
        return prodAdtElementFunction != null;
    }
    return super.eIsSet(featureID);
  }

} //EffectFullExpressionAndEffectFullFunctionReferenceImpl
