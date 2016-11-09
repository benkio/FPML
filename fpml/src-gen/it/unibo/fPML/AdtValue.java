/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adt Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.AdtValue#getAdtElements <em>Adt Elements</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getAdtValue()
 * @model
 * @generated
 */
public interface AdtValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Adt Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adt Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adt Elements</em>' containment reference list.
   * @see it.unibo.fPML.FPMLPackage#getAdtValue_AdtElements()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getAdtElements();

} // AdtValue
