/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pure Prod Type Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.PureProdTypeFactor#getAdtElement <em>Adt Element</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getPureProdTypeFactor()
 * @model
 * @generated
 */
public interface PureProdTypeFactor extends EObject
{
  /**
   * Returns the value of the '<em><b>Adt Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adt Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adt Element</em>' containment reference.
   * @see #setAdtElement(ValueType)
   * @see it.unibo.fPML.FPMLPackage#getPureProdTypeFactor_AdtElement()
   * @model containment="true"
   * @generated
   */
  ValueType getAdtElement();

  /**
   * Sets the value of the '{@link it.unibo.fPML.PureProdTypeFactor#getAdtElement <em>Adt Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adt Element</em>' containment reference.
   * @see #getAdtElement()
   * @generated
   */
  void setAdtElement(ValueType value);

} // PureProdTypeFactor
