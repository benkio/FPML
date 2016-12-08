/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML.impl;

import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullPrimitive;
import it.unibo.fPML.FPMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Function Body Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.impl.CompositionFunctionBodyEffectImpl#getReferenceElement <em>Reference Element</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.CompositionFunctionBodyEffectImpl#getFunctionChain <em>Function Chain</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.CompositionFunctionBodyEffectImpl#getPrimitiveElement <em>Primitive Element</em>}</li>
 *   <li>{@link it.unibo.fPML.impl.CompositionFunctionBodyEffectImpl#getExpressionElement <em>Expression Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionFunctionBodyEffectImpl extends FunctionBodyEffectFullImpl implements CompositionFunctionBodyEffect
{
  /**
   * The cached value of the '{@link #getReferenceElement() <em>Reference Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceElement()
   * @generated
   * @ordered
   */
  protected EffectFullFunction referenceElement;

  /**
   * The cached value of the '{@link #getFunctionChain() <em>Function Chain</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionChain()
   * @generated
   * @ordered
   */
  protected EList<CompositionFunctionBodyEffectFullFactor> functionChain;

  /**
   * The cached value of the '{@link #getPrimitiveElement() <em>Primitive Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveElement()
   * @generated
   * @ordered
   */
  protected EffectFullPrimitive primitiveElement;

  /**
   * The cached value of the '{@link #getExpressionElement() <em>Expression Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionElement()
   * @generated
   * @ordered
   */
  protected EffectFullExpression expressionElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositionFunctionBodyEffectImpl()
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
    return FPMLPackage.Literals.COMPOSITION_FUNCTION_BODY_EFFECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullFunction getReferenceElement()
  {
    if (referenceElement != null && referenceElement.eIsProxy())
    {
      InternalEObject oldReferenceElement = (InternalEObject)referenceElement;
      referenceElement = (EffectFullFunction)eResolveProxy(oldReferenceElement);
      if (referenceElement != oldReferenceElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__REFERENCE_ELEMENT, oldReferenceElement, referenceElement));
      }
    }
    return referenceElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullFunction basicGetReferenceElement()
  {
    return referenceElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceElement(EffectFullFunction newReferenceElement)
  {
    EffectFullFunction oldReferenceElement = referenceElement;
    referenceElement = newReferenceElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__REFERENCE_ELEMENT, oldReferenceElement, referenceElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompositionFunctionBodyEffectFullFactor> getFunctionChain()
  {
    if (functionChain == null)
    {
      functionChain = new EObjectContainmentEList<CompositionFunctionBodyEffectFullFactor>(CompositionFunctionBodyEffectFullFactor.class, this, FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__FUNCTION_CHAIN);
    }
    return functionChain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullPrimitive getPrimitiveElement()
  {
    return primitiveElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimitiveElement(EffectFullPrimitive newPrimitiveElement, NotificationChain msgs)
  {
    EffectFullPrimitive oldPrimitiveElement = primitiveElement;
    primitiveElement = newPrimitiveElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__PRIMITIVE_ELEMENT, oldPrimitiveElement, newPrimitiveElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitiveElement(EffectFullPrimitive newPrimitiveElement)
  {
    if (newPrimitiveElement != primitiveElement)
    {
      NotificationChain msgs = null;
      if (primitiveElement != null)
        msgs = ((InternalEObject)primitiveElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__PRIMITIVE_ELEMENT, null, msgs);
      if (newPrimitiveElement != null)
        msgs = ((InternalEObject)newPrimitiveElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__PRIMITIVE_ELEMENT, null, msgs);
      msgs = basicSetPrimitiveElement(newPrimitiveElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__PRIMITIVE_ELEMENT, newPrimitiveElement, newPrimitiveElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectFullExpression getExpressionElement()
  {
    return expressionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionElement(EffectFullExpression newExpressionElement, NotificationChain msgs)
  {
    EffectFullExpression oldExpressionElement = expressionElement;
    expressionElement = newExpressionElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__EXPRESSION_ELEMENT, oldExpressionElement, newExpressionElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionElement(EffectFullExpression newExpressionElement)
  {
    if (newExpressionElement != expressionElement)
    {
      NotificationChain msgs = null;
      if (expressionElement != null)
        msgs = ((InternalEObject)expressionElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__EXPRESSION_ELEMENT, null, msgs);
      if (newExpressionElement != null)
        msgs = ((InternalEObject)newExpressionElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__EXPRESSION_ELEMENT, null, msgs);
      msgs = basicSetExpressionElement(newExpressionElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__EXPRESSION_ELEMENT, newExpressionElement, newExpressionElement));
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
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__FUNCTION_CHAIN:
        return ((InternalEList<?>)getFunctionChain()).basicRemove(otherEnd, msgs);
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__PRIMITIVE_ELEMENT:
        return basicSetPrimitiveElement(null, msgs);
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__EXPRESSION_ELEMENT:
        return basicSetExpressionElement(null, msgs);
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
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__REFERENCE_ELEMENT:
        if (resolve) return getReferenceElement();
        return basicGetReferenceElement();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__FUNCTION_CHAIN:
        return getFunctionChain();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__PRIMITIVE_ELEMENT:
        return getPrimitiveElement();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__EXPRESSION_ELEMENT:
        return getExpressionElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__REFERENCE_ELEMENT:
        setReferenceElement((EffectFullFunction)newValue);
        return;
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__FUNCTION_CHAIN:
        getFunctionChain().clear();
        getFunctionChain().addAll((Collection<? extends CompositionFunctionBodyEffectFullFactor>)newValue);
        return;
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__PRIMITIVE_ELEMENT:
        setPrimitiveElement((EffectFullPrimitive)newValue);
        return;
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__EXPRESSION_ELEMENT:
        setExpressionElement((EffectFullExpression)newValue);
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
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__REFERENCE_ELEMENT:
        setReferenceElement((EffectFullFunction)null);
        return;
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__FUNCTION_CHAIN:
        getFunctionChain().clear();
        return;
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__PRIMITIVE_ELEMENT:
        setPrimitiveElement((EffectFullPrimitive)null);
        return;
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__EXPRESSION_ELEMENT:
        setExpressionElement((EffectFullExpression)null);
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
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__REFERENCE_ELEMENT:
        return referenceElement != null;
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__FUNCTION_CHAIN:
        return functionChain != null && !functionChain.isEmpty();
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__PRIMITIVE_ELEMENT:
        return primitiveElement != null;
      case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT__EXPRESSION_ELEMENT:
        return expressionElement != null;
    }
    return super.eIsSet(featureID);
  }

} //CompositionFunctionBodyEffectImpl
