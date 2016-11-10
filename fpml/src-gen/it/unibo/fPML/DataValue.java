/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.DataValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getDataValue()
 * @model
 * @generated
 */
public interface DataValue extends DataType
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(AdtValue)
   * @see it.unibo.fPML.FPMLPackage#getDataValue_Value()
   * @model containment="true"
   * @generated
   */
  AdtValue getValue();

  /**
   * Sets the value of the '{@link it.unibo.fPML.DataValue#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(AdtValue value);

} // DataValue
