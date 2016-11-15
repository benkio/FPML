/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pure Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.PureFunctionDefinition#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link it.unibo.fPML.PureFunctionDefinition#getArg <em>Arg</em>}</li>
 *   <li>{@link it.unibo.fPML.PureFunctionDefinition#getFunctionBody <em>Function Body</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getPureFunctionDefinition()
 * @model
 * @generated
 */
public interface PureFunctionDefinition extends InitialPureChainElement, Function
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(ValueType)
   * @see it.unibo.fPML.FPMLPackage#getPureFunctionDefinition_ReturnType()
   * @model containment="true"
   * @generated
   */
  ValueType getReturnType();

  /**
   * Sets the value of the '{@link it.unibo.fPML.PureFunctionDefinition#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(ValueType value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(Argument)
   * @see it.unibo.fPML.FPMLPackage#getPureFunctionDefinition_Arg()
   * @model containment="true"
   * @generated
   */
  Argument getArg();

  /**
   * Sets the value of the '{@link it.unibo.fPML.PureFunctionDefinition#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(Argument value);

  /**
   * Returns the value of the '<em><b>Function Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Body</em>' containment reference.
   * @see #setFunctionBody(FunctionBodyPure)
   * @see it.unibo.fPML.FPMLPackage#getPureFunctionDefinition_FunctionBody()
   * @model containment="true"
   * @generated
   */
  FunctionBodyPure getFunctionBody();

  /**
   * Sets the value of the '{@link it.unibo.fPML.PureFunctionDefinition#getFunctionBody <em>Function Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Body</em>' containment reference.
   * @see #getFunctionBody()
   * @generated
   */
  void setFunctionBody(FunctionBodyPure value);

} // PureFunctionDefinition