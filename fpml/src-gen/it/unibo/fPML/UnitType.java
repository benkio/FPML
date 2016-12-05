/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.UnitType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getUnitType()
 * @model
 * @generated
 */
public interface UnitType extends ValueType, Expression
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
   * @see it.unibo.fPML.FPMLPackage#getUnitType_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link it.unibo.fPML.UnitType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // UnitType
