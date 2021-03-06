/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Full Value Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.EffectFullValueBlock#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getEffectFullValueBlock()
 * @model
 * @generated
 */
public interface EffectFullValueBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link it.unibo.fPML.EffectFullFunctionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see it.unibo.fPML.FPMLPackage#getEffectFullValueBlock_Elements()
   * @model containment="true"
   * @generated
   */
  EList<EffectFullFunctionDefinition> getElements();

} // EffectFullValueBlock
