/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Effect Full Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.ReturnEffectFullFunction#getLambdaFunctionBody <em>Lambda Function Body</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getReturnEffectFullFunction()
 * @model
 * @generated
 */
public interface ReturnEffectFullFunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Lambda Function Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lambda Function Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lambda Function Body</em>' containment reference.
   * @see #setLambdaFunctionBody(EffectFullFunctionDefinition)
   * @see it.unibo.fPML.FPMLPackage#getReturnEffectFullFunction_LambdaFunctionBody()
   * @model containment="true"
   * @generated
   */
  EffectFullFunctionDefinition getLambdaFunctionBody();

  /**
   * Sets the value of the '{@link it.unibo.fPML.ReturnEffectFullFunction#getLambdaFunctionBody <em>Lambda Function Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lambda Function Body</em>' containment reference.
   * @see #getLambdaFunctionBody()
   * @generated
   */
  void setLambdaFunctionBody(EffectFullFunctionDefinition value);

} // ReturnEffectFullFunction
