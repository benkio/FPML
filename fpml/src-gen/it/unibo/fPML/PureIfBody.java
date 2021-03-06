/**
 * generated by Xtext 2.10.0
 */
package it.unibo.fPML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pure If Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.fPML.PureIfBody#getFunctionReference <em>Function Reference</em>}</li>
 *   <li>{@link it.unibo.fPML.PureIfBody#getFunctionExpression <em>Function Expression</em>}</li>
 * </ul>
 *
 * @see it.unibo.fPML.FPMLPackage#getPureIfBody()
 * @model
 * @generated
 */
public interface PureIfBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Function Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Reference</em>' reference.
   * @see #setFunctionReference(PureFunction)
   * @see it.unibo.fPML.FPMLPackage#getPureIfBody_FunctionReference()
   * @model
   * @generated
   */
  PureFunction getFunctionReference();

  /**
   * Sets the value of the '{@link it.unibo.fPML.PureIfBody#getFunctionReference <em>Function Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Reference</em>' reference.
   * @see #getFunctionReference()
   * @generated
   */
  void setFunctionReference(PureFunction value);

  /**
   * Returns the value of the '<em><b>Function Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Expression</em>' containment reference.
   * @see #setFunctionExpression(Expression)
   * @see it.unibo.fPML.FPMLPackage#getPureIfBody_FunctionExpression()
   * @model containment="true"
   * @generated
   */
  Expression getFunctionExpression();

  /**
   * Sets the value of the '{@link it.unibo.fPML.PureIfBody#getFunctionExpression <em>Function Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Expression</em>' containment reference.
   * @see #getFunctionExpression()
   * @generated
   */
  void setFunctionExpression(Expression value);

} // PureIfBody
