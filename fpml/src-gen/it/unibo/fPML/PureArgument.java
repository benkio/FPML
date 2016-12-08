/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pure Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.PureArgument#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getPureArgument()
 * @model
 * @generated
 */
public interface PureArgument extends PureFunction, Argument
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
   * @see #setType(ValueType)
   * @see it.unibo.fPML.FPMLPackage#getPureArgument_Type()
   * @model containment="true"
   * @generated
   */
  ValueType getType();

  /**
   * Sets the value of the '{@link it.unibo.fPML.PureArgument#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ValueType value);

} // PureArgument