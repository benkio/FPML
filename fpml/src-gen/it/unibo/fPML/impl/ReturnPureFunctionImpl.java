/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.ReturnPureFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Pure Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.ReturnPureFunctionImpl#getLambdaFunctionBody <em>Lambda Function Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnPureFunctionImpl extends MinimalEObjectImpl.Container implements ReturnPureFunction
{
  /**
   * The cached value of the '{@link #getLambdaFunctionBody() <em>Lambda Function Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLambdaFunctionBody()
   * @generated
   * @ordered
   */
  protected PureLambda lambdaFunctionBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReturnPureFunctionImpl()
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
    return FPMLPackage.Literals.RETURN_PURE_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureLambda getLambdaFunctionBody()
  {
    return lambdaFunctionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLambdaFunctionBody(PureLambda newLambdaFunctionBody, NotificationChain msgs)
  {
    PureLambda oldLambdaFunctionBody = lambdaFunctionBody;
    lambdaFunctionBody = newLambdaFunctionBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.RETURN_PURE_FUNCTION__LAMBDA_FUNCTION_BODY, oldLambdaFunctionBody, newLambdaFunctionBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLambdaFunctionBody(PureLambda newLambdaFunctionBody)
  {
    if (newLambdaFunctionBody != lambdaFunctionBody)
    {
      NotificationChain msgs = null;
      if (lambdaFunctionBody != null)
        msgs = ((InternalEObject)lambdaFunctionBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.RETURN_PURE_FUNCTION__LAMBDA_FUNCTION_BODY, null, msgs);
      if (newLambdaFunctionBody != null)
        msgs = ((InternalEObject)newLambdaFunctionBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.RETURN_PURE_FUNCTION__LAMBDA_FUNCTION_BODY, null, msgs);
      msgs = basicSetLambdaFunctionBody(newLambdaFunctionBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.RETURN_PURE_FUNCTION__LAMBDA_FUNCTION_BODY, newLambdaFunctionBody, newLambdaFunctionBody));
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
      case FPMLPackage.RETURN_PURE_FUNCTION__LAMBDA_FUNCTION_BODY:
        return basicSetLambdaFunctionBody(null, msgs);
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
      case FPMLPackage.RETURN_PURE_FUNCTION__LAMBDA_FUNCTION_BODY:
        return getLambdaFunctionBody();
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
      case FPMLPackage.RETURN_PURE_FUNCTION__LAMBDA_FUNCTION_BODY:
        setLambdaFunctionBody((PureLambda)newValue);
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
      case FPMLPackage.RETURN_PURE_FUNCTION__LAMBDA_FUNCTION_BODY:
        setLambdaFunctionBody((PureLambda)null);
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
      case FPMLPackage.RETURN_PURE_FUNCTION__LAMBDA_FUNCTION_BODY:
        return lambdaFunctionBody != null;
    }
    return super.eIsSet(featureID);
  }

} //ReturnPureFunctionImpl
