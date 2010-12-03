/**
 * <copyright>
 * </copyright>
 *

 */
package expr.exprDemo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link expr.exprDemo.Assert#getExpression <em>Expression</em>}</li>
 *   <li>{@link expr.exprDemo.Assert#getErrorMsg <em>Error Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see expr.exprDemo.ExprDemoPackage#getAssert()
 * @model
 * @generated
 */
public interface Assert extends Element
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expr)
   * @see expr.exprDemo.ExprDemoPackage#getAssert_Expression()
   * @model containment="true"
   * @generated
   */
  Expr getExpression();

  /**
   * Sets the value of the '{@link expr.exprDemo.Assert#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expr value);

  /**
   * Returns the value of the '<em><b>Error Msg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error Msg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Msg</em>' containment reference.
   * @see #setErrorMsg(Expr)
   * @see expr.exprDemo.ExprDemoPackage#getAssert_ErrorMsg()
   * @model containment="true"
   * @generated
   */
  Expr getErrorMsg();

  /**
   * Sets the value of the '{@link expr.exprDemo.Assert#getErrorMsg <em>Error Msg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Msg</em>' containment reference.
   * @see #getErrorMsg()
   * @generated
   */
  void setErrorMsg(Expr value);

} // Assert
