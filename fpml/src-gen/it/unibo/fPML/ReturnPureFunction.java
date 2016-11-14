/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Pure Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.ReturnPureFunction#getLambdaFunctioBody <em>Lambda Functio Body</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getReturnPureFunction()
 * @model
 * @generated
 */
public interface ReturnPureFunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Lambda Functio Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lambda Functio Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lambda Functio Body</em>' containment reference.
   * @see #setLambdaFunctioBody(FunctionBodyPure)
   * @see it.unibo.fPML.FPMLPackage#getReturnPureFunction_LambdaFunctioBody()
   * @model containment="true"
   * @generated
   */
  FunctionBodyPure getLambdaFunctioBody();

  /**
   * Sets the value of the '{@link it.unibo.fPML.ReturnPureFunction#getLambdaFunctioBody <em>Lambda Functio Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lambda Functio Body</em>' containment reference.
   * @see #getLambdaFunctioBody()
   * @generated
   */
  void setLambdaFunctioBody(FunctionBodyPure value);

} // ReturnPureFunction
