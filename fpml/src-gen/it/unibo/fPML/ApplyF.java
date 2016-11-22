/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply F</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.ApplyF#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getApplyF()
 * @model
 * @generated
 */
public interface ApplyF extends PureFunctionDefinition
{
  /**
   * Returns the value of the '<em><b>Value Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Ref</em>' reference.
   * @see #setValueRef(Value)
   * @see it.unibo.fPML.FPMLPackage#getApplyF_ValueRef()
   * @model
   * @generated
   */
  Value getValueRef();

  /**
   * Sets the value of the '{@link it.unibo.fPML.ApplyF#getValueRef <em>Value Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Ref</em>' reference.
   * @see #getValueRef()
   * @generated
   */
  void setValueRef(Value value);

} // ApplyF
