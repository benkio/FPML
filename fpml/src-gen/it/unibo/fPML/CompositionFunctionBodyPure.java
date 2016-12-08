/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Function Body Pure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.CompositionFunctionBodyPure#getReferenceElement <em>Reference Element</em>}</li>
 *   <li>{@link it.unibo.fPML.CompositionFunctionBodyPure#getFunctionChain <em>Function Chain</em>}</li>
 *   <li>{@link it.unibo.fPML.CompositionFunctionBodyPure#getPrimitiveElement <em>Primitive Element</em>}</li>
 *   <li>{@link it.unibo.fPML.CompositionFunctionBodyPure#getExpressionElement <em>Expression Element</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getCompositionFunctionBodyPure()
 * @model
 * @generated
 */
public interface CompositionFunctionBodyPure extends FunctionBodyPure
{
  /**
   * Returns the value of the '<em><b>Reference Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Element</em>' reference.
   * @see #setReferenceElement(PureFunction)
   * @see it.unibo.fPML.FPMLPackage#getCompositionFunctionBodyPure_ReferenceElement()
   * @model
   * @generated
   */
  PureFunction getReferenceElement();

  /**
   * Sets the value of the '{@link it.unibo.fPML.CompositionFunctionBodyPure#getReferenceElement <em>Reference Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Element</em>' reference.
   * @see #getReferenceElement()
   * @generated
   */
  void setReferenceElement(PureFunction value);

  /**
   * Returns the value of the '<em><b>Function Chain</b></em>' containment reference list.
   * The list contents are of type {@link it.unibo.fPML.CompositionFunctionBodyPureFactor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Chain</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Chain</em>' containment reference list.
   * @see it.unibo.fPML.FPMLPackage#getCompositionFunctionBodyPure_FunctionChain()
   * @model containment="true"
   * @generated
   */
  EList<CompositionFunctionBodyPureFactor> getFunctionChain();

  /**
   * Returns the value of the '<em><b>Primitive Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive Element</em>' containment reference.
   * @see #setPrimitiveElement(PrimitivePureFunction)
   * @see it.unibo.fPML.FPMLPackage#getCompositionFunctionBodyPure_PrimitiveElement()
   * @model containment="true"
   * @generated
   */
  PrimitivePureFunction getPrimitiveElement();

  /**
   * Sets the value of the '{@link it.unibo.fPML.CompositionFunctionBodyPure#getPrimitiveElement <em>Primitive Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive Element</em>' containment reference.
   * @see #getPrimitiveElement()
   * @generated
   */
  void setPrimitiveElement(PrimitivePureFunction value);

  /**
   * Returns the value of the '<em><b>Expression Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression Element</em>' containment reference.
   * @see #setExpressionElement(Expression)
   * @see it.unibo.fPML.FPMLPackage#getCompositionFunctionBodyPure_ExpressionElement()
   * @model containment="true"
   * @generated
   */
  Expression getExpressionElement();

  /**
   * Sets the value of the '{@link it.unibo.fPML.CompositionFunctionBodyPure#getExpressionElement <em>Expression Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression Element</em>' containment reference.
   * @see #getExpressionElement()
   * @generated
   */
  void setExpressionElement(Expression value);

} // CompositionFunctionBodyPure
