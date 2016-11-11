/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.Argument;
import it.unibo.fPML.ChainElement;
import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.Function;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.ValueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pure Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.PureFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.PureFunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.PureFunctionImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.PureFunctionImpl#getFunctionBody <em>Function Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PureFunctionImpl extends InitialPureChainElementImpl implements PureFunction
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected ValueType returnType;

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
  protected PureFunctionImpl()
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
    return FPMLPackage.Literals.PURE_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_FUNCTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(ValueType newReturnType, NotificationChain msgs)
  {
    ValueType oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_FUNCTION__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(ValueType newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_FUNCTION__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_FUNCTION__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_FUNCTION__RETURN_TYPE, newReturnType, newReturnType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_FUNCTION__ARG, oldArg, newArg);
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
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_FUNCTION__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_FUNCTION__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_FUNCTION__ARG, newArg, newArg));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_FUNCTION__FUNCTION_BODY, oldFunctionBody, newFunctionBody);
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
        msgs = ((InternalEObject)functionBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_FUNCTION__FUNCTION_BODY, null, msgs);
      if (newFunctionBody != null)
        msgs = ((InternalEObject)newFunctionBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.PURE_FUNCTION__FUNCTION_BODY, null, msgs);
      msgs = basicSetFunctionBody(newFunctionBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.PURE_FUNCTION__FUNCTION_BODY, newFunctionBody, newFunctionBody));
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
      case FPMLPackage.PURE_FUNCTION__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case FPMLPackage.PURE_FUNCTION__ARG:
        return basicSetArg(null, msgs);
      case FPMLPackage.PURE_FUNCTION__FUNCTION_BODY:
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
      case FPMLPackage.PURE_FUNCTION__NAME:
        return getName();
      case FPMLPackage.PURE_FUNCTION__RETURN_TYPE:
        return getReturnType();
      case FPMLPackage.PURE_FUNCTION__ARG:
        return getArg();
      case FPMLPackage.PURE_FUNCTION__FUNCTION_BODY:
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
      case FPMLPackage.PURE_FUNCTION__NAME:
        setName((String)newValue);
        return;
      case FPMLPackage.PURE_FUNCTION__RETURN_TYPE:
        setReturnType((ValueType)newValue);
        return;
      case FPMLPackage.PURE_FUNCTION__ARG:
        setArg((Argument)newValue);
        return;
      case FPMLPackage.PURE_FUNCTION__FUNCTION_BODY:
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
      case FPMLPackage.PURE_FUNCTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FPMLPackage.PURE_FUNCTION__RETURN_TYPE:
        setReturnType((ValueType)null);
        return;
      case FPMLPackage.PURE_FUNCTION__ARG:
        setArg((Argument)null);
        return;
      case FPMLPackage.PURE_FUNCTION__FUNCTION_BODY:
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
      case FPMLPackage.PURE_FUNCTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FPMLPackage.PURE_FUNCTION__RETURN_TYPE:
        return returnType != null;
      case FPMLPackage.PURE_FUNCTION__ARG:
        return arg != null;
      case FPMLPackage.PURE_FUNCTION__FUNCTION_BODY:
        return functionBody != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == ChainElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Function.class)
    {
      switch (derivedFeatureID)
      {
        case FPMLPackage.PURE_FUNCTION__NAME: return FPMLPackage.FUNCTION__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == ChainElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Function.class)
    {
      switch (baseFeatureID)
      {
        case FPMLPackage.FUNCTION__NAME: return FPMLPackage.PURE_FUNCTION__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PureFunctionImpl
