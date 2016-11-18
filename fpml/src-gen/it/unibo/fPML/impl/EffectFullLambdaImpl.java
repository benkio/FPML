/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullLambda;
import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.FunctionBodyEffectFull;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Full Lambda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.EffectFullLambdaImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.EffectFullLambdaImpl#getFunctionBody <em>Function Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectFullLambdaImpl extends MinimalEObjectImpl.Container implements EffectFullLambda
{
  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected EffectFullArgument arg;

  /**
   * The cached value of the '{@link #getFunctionBody() <em>Function Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionBody()
   * @generated
   * @ordered
   */
  protected FunctionBodyEffectFull functionBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffectFullLambdaImpl()
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
    return FPMLPackage.Literals.EFFECT_FULL_LAMBDA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullArgument getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg(EffectFullArgument newArg, NotificationChain msgs)
  {
    EffectFullArgument oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_LAMBDA__ARG, oldArg, newArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(EffectFullArgument newArg)
  {
    if (newArg != arg)
    {
      NotificationChain msgs = null;
      if (arg != null)
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_LAMBDA__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_LAMBDA__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_LAMBDA__ARG, newArg, newArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionBodyEffectFull getFunctionBody()
  {
    return functionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionBody(FunctionBodyEffectFull newFunctionBody, NotificationChain msgs)
  {
    FunctionBodyEffectFull oldFunctionBody = functionBody;
    functionBody = newFunctionBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_LAMBDA__FUNCTION_BODY, oldFunctionBody, newFunctionBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionBody(FunctionBodyEffectFull newFunctionBody)
  {
    if (newFunctionBody != functionBody)
    {
      NotificationChain msgs = null;
      if (functionBody != null)
        msgs = ((InternalEObject)functionBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_LAMBDA__FUNCTION_BODY, null, msgs);
      if (newFunctionBody != null)
        msgs = ((InternalEObject)newFunctionBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_LAMBDA__FUNCTION_BODY, null, msgs);
      msgs = basicSetFunctionBody(newFunctionBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_LAMBDA__FUNCTION_BODY, newFunctionBody, newFunctionBody));
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
      case FPMLPackage.EFFECT_FULL_LAMBDA__ARG:
        return basicSetArg(null, msgs);
      case FPMLPackage.EFFECT_FULL_LAMBDA__FUNCTION_BODY:
        return basicSetFunctionBody(null, msgs);
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
      case FPMLPackage.EFFECT_FULL_LAMBDA__ARG:
        return getArg();
      case FPMLPackage.EFFECT_FULL_LAMBDA__FUNCTION_BODY:
        return getFunctionBody();
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
      case FPMLPackage.EFFECT_FULL_LAMBDA__ARG:
        setArg((EffectFullArgument)newValue);
        return;
      case FPMLPackage.EFFECT_FULL_LAMBDA__FUNCTION_BODY:
        setFunctionBody((FunctionBodyEffectFull)newValue);
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
      case FPMLPackage.EFFECT_FULL_LAMBDA__ARG:
        setArg((EffectFullArgument)null);
        return;
      case FPMLPackage.EFFECT_FULL_LAMBDA__FUNCTION_BODY:
        setFunctionBody((FunctionBodyEffectFull)null);
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
      case FPMLPackage.EFFECT_FULL_LAMBDA__ARG:
        return arg != null;
      case FPMLPackage.EFFECT_FULL_LAMBDA__FUNCTION_BODY:
        return functionBody != null;
    }
    return super.eIsSet(featureID);
  }

} //EffectFullLambdaImpl
