/**
 * <copyright>
 * </copyright>
 *

 */
package expr.exprDemo.impl;

import expr.exprDemo.EnumDecl;
import expr.exprDemo.ExprDemoPackage;
import expr.exprDemo.Symbol;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link expr.exprDemo.impl.EnumDeclImpl#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumDeclImpl extends ElementImpl implements EnumDecl
{
  /**
   * The cached value of the '{@link #getLiterals() <em>Literals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiterals()
   * @generated
   * @ordered
   */
  protected EList<Symbol> literals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumDeclImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExprDemoPackage.Literals.ENUM_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Symbol> getLiterals()
  {
    if (literals == null)
    {
      literals = new EObjectContainmentEList<Symbol>(Symbol.class, this, ExprDemoPackage.ENUM_DECL__LITERALS);
    }
    return literals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExprDemoPackage.ENUM_DECL__LITERALS:
        return ((InternalEList<?>)getLiterals()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExprDemoPackage.ENUM_DECL__LITERALS:
        return getLiterals();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExprDemoPackage.ENUM_DECL__LITERALS:
        getLiterals().clear();
        getLiterals().addAll((Collection<? extends Symbol>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExprDemoPackage.ENUM_DECL__LITERALS:
        getLiterals().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExprDemoPackage.ENUM_DECL__LITERALS:
        return literals != null && !literals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnumDeclImpl
