/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Full Value Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.EffectFullValueRef#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getEffectFullValueRef()
 * @model
 * @generated
 */
public interface EffectFullValueRef extends EffectFullExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(EffectFullValue)
   * @see it.unibo.fPML.FPMLPackage#getEffectFullValueRef_Value()
   * @model
   * @generated
   */
  EffectFullValue getValue();

  /**
   * Sets the value of the '{@link it.unibo.fPML.EffectFullValueRef#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EffectFullValue value);

} // EffectFullValueRef
