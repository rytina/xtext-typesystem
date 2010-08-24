/**
 * <copyright>
 * </copyright>
 *

 */
package expr.exprDemo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link expr.exprDemo.EnumDecl#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see expr.exprDemo.ExprDemoPackage#getEnumDecl()
 * @model
 * @generated
 */
public interface EnumDecl extends Element
{
  /**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
   * The list contents are of type {@link expr.exprDemo.Symbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference list.
   * @see expr.exprDemo.ExprDemoPackage#getEnumDecl_Literals()
   * @model containment="true"
   * @generated
   */
  EList<Symbol> getLiterals();

} // EnumDecl
