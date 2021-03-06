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
 *   <li>{@link it.unibo.fPML.ApplyF#getFunctionType <em>Function Type</em>}</li>
 *   <li>{@link it.unibo.fPML.ApplyF#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getApplyF()
 * @model
 * @generated
 */
public interface ApplyF extends PrimitivePureFunction
{
  /**
   * Returns the value of the '<em><b>Function Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Type</em>' containment reference.
   * @see #setFunctionType(PureFunctionType)
   * @see it.unibo.fPML.FPMLPackage#getApplyF_FunctionType()
   * @model containment="true"
   * @generated
   */
  PureFunctionType getFunctionType();

  /**
   * Sets the value of the '{@link it.unibo.fPML.ApplyF#getFunctionType <em>Function Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Type</em>' containment reference.
   * @see #getFunctionType()
   * @generated
   */
  void setFunctionType(PureFunctionType value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ApplyFFactor)
   * @see it.unibo.fPML.FPMLPackage#getApplyF_Value()
   * @model containment="true"
   * @generated
   */
  ApplyFFactor getValue();

  /**
   * Sets the value of the '{@link it.unibo.fPML.ApplyF#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ApplyFFactor value);

} // ApplyF
