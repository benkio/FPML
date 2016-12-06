/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.IOType;
import it.unibo.fPML.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Full Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.EffectFullFunctionTypeImpl#getInnerValue <em>Inner Value</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.EffectFullFunctionTypeImpl#getArgType <em>Arg Type</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.EffectFullFunctionTypeImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.EffectFullFunctionTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectFullFunctionTypeImpl extends EffectFullTypeImpl implements EffectFullFunctionType
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
   * The cached value of the '{@link #getArgType() <em>Arg Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgType()
   * @generated
   * @ordered
   */
  protected Type argType;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected IOType returnType;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EffectFullFunctionDefinition value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffectFullFunctionTypeImpl()
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
    return FPMLPackage.Literals.EFFECT_FULL_FUNCTION_TYPE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__INNER_VALUE, oldInnerValue, newInnerValue);
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
        msgs = ((InternalEObject)innerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__INNER_VALUE, null, msgs);
      if (newInnerValue != null)
        msgs = ((InternalEObject)newInnerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__INNER_VALUE, null, msgs);
      msgs = basicSetInnerValue(newInnerValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__INNER_VALUE, newInnerValue, newInnerValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getArgType()
  {
    return argType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgType(Type newArgType, NotificationChain msgs)
  {
    Type oldArgType = argType;
    argType = newArgType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__ARG_TYPE, oldArgType, newArgType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgType(Type newArgType)
  {
    if (newArgType != argType)
    {
      NotificationChain msgs = null;
      if (argType != null)
        msgs = ((InternalEObject)argType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__ARG_TYPE, null, msgs);
      if (newArgType != null)
        msgs = ((InternalEObject)newArgType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__ARG_TYPE, null, msgs);
      msgs = basicSetArgType(newArgType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__ARG_TYPE, newArgType, newArgType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IOType getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(IOType newReturnType, NotificationChain msgs)
  {
    IOType oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(IOType newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullFunctionDefinition getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(EffectFullFunctionDefinition newValue, NotificationChain msgs)
  {
    EffectFullFunctionDefinition oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(EffectFullFunctionDefinition newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__VALUE, newValue, newValue));
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
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__INNER_VALUE:
        return basicSetInnerValue(null, msgs);
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__ARG_TYPE:
        return basicSetArgType(null, msgs);
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__VALUE:
        return basicSetValue(null, msgs);
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
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__INNER_VALUE:
        return getInnerValue();
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__ARG_TYPE:
        return getArgType();
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__RETURN_TYPE:
        return getReturnType();
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__VALUE:
        return getValue();
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
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__INNER_VALUE:
        setInnerValue((EObject)newValue);
        return;
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__ARG_TYPE:
        setArgType((Type)newValue);
        return;
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__RETURN_TYPE:
        setReturnType((IOType)newValue);
        return;
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__VALUE:
        setValue((EffectFullFunctionDefinition)newValue);
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
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__INNER_VALUE:
        setInnerValue((EObject)null);
        return;
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__ARG_TYPE:
        setArgType((Type)null);
        return;
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__RETURN_TYPE:
        setReturnType((IOType)null);
        return;
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__VALUE:
        setValue((EffectFullFunctionDefinition)null);
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
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__INNER_VALUE:
        return innerValue != null;
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__ARG_TYPE:
        return argType != null;
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__RETURN_TYPE:
        return returnType != null;
      case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__VALUE:
        return value != null;
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
    if (baseClass == EffectFullExpression.class)
    {
      switch (derivedFeatureID)
      {
        case FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__INNER_VALUE: return FPMLPackage.EFFECT_FULL_EXPRESSION__INNER_VALUE;
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
    if (baseClass == EffectFullExpression.class)
    {
      switch (baseFeatureID)
      {
        case FPMLPackage.EFFECT_FULL_EXPRESSION__INNER_VALUE: return FPMLPackage.EFFECT_FULL_FUNCTION_TYPE__INNER_VALUE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //EffectFullFunctionTypeImpl
