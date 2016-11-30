/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.StringType#getType <em>Type</em>}</li>
 *   <li>{@link it.unibo.fPML.StringType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getStringType()
 * @model
 * @generated
 */
public interface StringType extends ValueType, Expression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see it.unibo.fPML.FPMLPackage#getStringType_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link it.unibo.fPML.StringType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see it.unibo.fPML.FPMLPackage#getStringType_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link it.unibo.fPML.StringType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // StringType
