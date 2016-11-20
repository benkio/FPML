/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.Argument;
import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.PureLambda;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pure Lambda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.PureLambdaImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.PureLambdaImpl#getFunctionBody <em>Function Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PureLambdaImpl extends MinimalEObjectImpl.Container implements PureLambda
{
  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected Argument arg;

  /**
   * The cached value of the '{@link #getFunctionBody() <em>Function Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionBody()
   * @generated
   * @ordered
   */
  protected FunctionBodyPure functionBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PureLambdaImpl()
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
    return FPMLPackage.Literals.PURE_LAMBDA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg(Argument newArg, NotificationChain msgs)
  {
    Argument oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_LAMBDA__ARG, oldArg, newArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(Argument newArg)
  {
    if (newArg != arg)
    {
      NotificationChain msgs = null;
      if (arg != null)
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_LAMBDA__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_LAMBDA__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_LAMBDA__ARG, newArg, newArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionBodyPure getFunctionBody()
  {
    return functionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionBody(FunctionBodyPure newFunctionBody, NotificationChain msgs)
  {
    FunctionBodyPure oldFunctionBody = functionBody;
    functionBody = newFunctionBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_LAMBDA__FUNCTION_BODY, oldFunctionBody, newFunctionBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionBody(FunctionBodyPure newFunctionBody)
  {
    if (newFunctionBody != functionBody)
    {
      NotificationChain msgs = null;
      if (functionBody != null)
        msgs = ((InternalEObject)functionBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_LAMBDA__FUNCTION_BODY, null, msgs);
      if (newFunctionBody != null)
        msgs = ((InternalEObject)newFunctionBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_LAMBDA__FUNCTION_BODY, null, msgs);
      msgs = basicSetFunctionBody(newFunctionBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_LAMBDA__FUNCTION_BODY, newFunctionBody, newFunctionBody));
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
      case FPMLPackage.PURE_LAMBDA__ARG:
        return basicSetArg(null, msgs);
      case FPMLPackage.PURE_LAMBDA__FUNCTION_BODY:
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
      case FPMLPackage.PURE_LAMBDA__ARG:
        return getArg();
      case FPMLPackage.PURE_LAMBDA__FUNCTION_BODY:
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
      case FPMLPackage.PURE_LAMBDA__ARG:
        setArg((Argument)newValue);
        return;
      case FPMLPackage.PURE_LAMBDA__FUNCTION_BODY:
        setFunctionBody((FunctionBodyPure)newValue);
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
      case FPMLPackage.PURE_LAMBDA__ARG:
        setArg((Argument)null);
        return;
      case FPMLPackage.PURE_LAMBDA__FUNCTION_BODY:
        setFunctionBody((FunctionBodyPure)null);
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
      case FPMLPackage.PURE_LAMBDA__ARG:
        return arg != null;
      case FPMLPackage.PURE_LAMBDA__FUNCTION_BODY:
        return functionBody != null;
    }
    return super.eIsSet(featureID);
  }

} //PureLambdaImpl