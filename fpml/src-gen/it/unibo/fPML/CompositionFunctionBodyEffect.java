/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Function Body Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.CompositionFunctionBodyEffect#getReferenceElement <em>Reference Element</em>}</li>
 *   <li>{@link it.unibo.fPML.CompositionFunctionBodyEffect#getFunctionChain <em>Function Chain</em>}</li>
 *   <li>{@link it.unibo.fPML.CompositionFunctionBodyEffect#getPrimitiveElement <em>Primitive Element</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getCompositionFunctionBodyEffect()
 * @model
 * @generated
 */
public interface CompositionFunctionBodyEffect extends FunctionBodyEffectFull
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
   * @see #setReferenceElement(ChainElement)
   * @see it.unibo.fPML.FPMLPackage#getCompositionFunctionBodyEffect_ReferenceElement()
   * @model
   * @generated
   */
  ChainElement getReferenceElement();

  /**
   * Sets the value of the '{@link it.unibo.fPML.CompositionFunctionBodyEffect#getReferenceElement <em>Reference Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Element</em>' reference.
   * @see #getReferenceElement()
   * @generated
   */
  void setReferenceElement(ChainElement value);

  /**
   * Returns the value of the '<em><b>Function Chain</b></em>' containment reference list.
   * The list contents are of type {@link it.unibo.fPML.CompositionFunctionBodyEffectFullFactor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Chain</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Chain</em>' containment reference list.
   * @see it.unibo.fPML.FPMLPackage#getCompositionFunctionBodyEffect_FunctionChain()
   * @model containment="true"
   * @generated
   */
  EList<CompositionFunctionBodyEffectFullFactor> getFunctionChain();

  /**
   * Returns the value of the '<em><b>Primitive Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive Element</em>' containment reference.
   * @see #setPrimitiveElement(EffectFullFunctionDefinition)
   * @see it.unibo.fPML.FPMLPackage#getCompositionFunctionBodyEffect_PrimitiveElement()
   * @model containment="true"
   * @generated
   */
  EffectFullFunctionDefinition getPrimitiveElement();

  /**
   * Sets the value of the '{@link it.unibo.fPML.CompositionFunctionBodyEffect#getPrimitiveElement <em>Primitive Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive Element</em>' containment reference.
   * @see #getPrimitiveElement()
   * @generated
   */
  void setPrimitiveElement(EffectFullFunctionDefinition value);

} // CompositionFunctionBodyEffect
