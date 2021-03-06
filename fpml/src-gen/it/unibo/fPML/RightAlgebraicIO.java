/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Algebraic IO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.RightAlgebraicIO#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getRightAlgebraicIO()
 * @model
 * @generated
 */
public interface RightAlgebraicIO extends PrimitiveEffectFullFunction
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(EffectFullAlgebraicType)
   * @see it.unibo.fPML.FPMLPackage#getRightAlgebraicIO_Type()
   * @model containment="true"
   * @generated
   */
  EffectFullAlgebraicType getType();

  /**
   * Sets the value of the '{@link it.unibo.fPML.RightAlgebraicIO#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(EffectFullAlgebraicType value);

} // RightAlgebraicIO
