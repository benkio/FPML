/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Full Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.EffectFullDataType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getEffectFullDataType()
 * @model
 * @generated
 */
public interface EffectFullDataType extends EffectFullType, EffectFullExpression, EffectFullAdtValue
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(EffectFullData)
   * @see it.unibo.fPML.FPMLPackage#getEffectFullDataType_Type()
   * @model
   * @generated
   */
  EffectFullData getType();

  /**
   * Sets the value of the '{@link it.unibo.fPML.EffectFullDataType#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(EffectFullData value);

} // EffectFullDataType
