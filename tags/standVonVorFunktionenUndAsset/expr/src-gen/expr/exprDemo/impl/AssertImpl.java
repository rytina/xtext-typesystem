/**
 * <copyright>
 * </copyright>
 *

 */
package expr.exprDemo.impl;

import expr.exprDemo.Assert;
import expr.exprDemo.Expr;
import expr.exprDemo.ExprDemoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link expr.exprDemo.impl.AssertImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link expr.exprDemo.impl.AssertImpl#getErrorMsg <em>Error Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertImpl extends ElementImpl implements Assert
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expr expression;

  /**
   * The cached value of the '{@link #getErrorMsg() <em>Error Msg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorMsg()
   * @generated
   * @ordered
   */
  protected Expr errorMsg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertImpl()
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
    return ExprDemoPackage.Literals.ASSERT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expr newExpression, NotificationChain msgs)
  {
    Expr oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprDemoPackage.ASSERT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expr newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprDemoPackage.ASSERT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprDemoPackage.ASSERT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprDemoPackage.ASSERT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getErrorMsg()
  {
    return errorMsg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetErrorMsg(Expr newErrorMsg, NotificationChain msgs)
  {
    Expr oldErrorMsg = errorMsg;
    errorMsg = newErrorMsg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprDemoPackage.ASSERT__ERROR_MSG, oldErrorMsg, newErrorMsg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorMsg(Expr newErrorMsg)
  {
    if (newErrorMsg != errorMsg)
    {
      NotificationChain msgs = null;
      if (errorMsg != null)
        msgs = ((InternalEObject)errorMsg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprDemoPackage.ASSERT__ERROR_MSG, null, msgs);
      if (newErrorMsg != null)
        msgs = ((InternalEObject)newErrorMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprDemoPackage.ASSERT__ERROR_MSG, null, msgs);
      msgs = basicSetErrorMsg(newErrorMsg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprDemoPackage.ASSERT__ERROR_MSG, newErrorMsg, newErrorMsg));
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
      case ExprDemoPackage.ASSERT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case ExprDemoPackage.ASSERT__ERROR_MSG:
        return basicSetErrorMsg(null, msgs);
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
      case ExprDemoPackage.ASSERT__EXPRESSION:
        return getExpression();
      case ExprDemoPackage.ASSERT__ERROR_MSG:
        return getErrorMsg();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExprDemoPackage.ASSERT__EXPRESSION:
        setExpression((Expr)newValue);
        return;
      case ExprDemoPackage.ASSERT__ERROR_MSG:
        setErrorMsg((Expr)newValue);
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
      case ExprDemoPackage.ASSERT__EXPRESSION:
        setExpression((Expr)null);
        return;
      case ExprDemoPackage.ASSERT__ERROR_MSG:
        setErrorMsg((Expr)null);
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
      case ExprDemoPackage.ASSERT__EXPRESSION:
        return expression != null;
      case ExprDemoPackage.ASSERT__ERROR_MSG:
        return errorMsg != null;
    }
    return super.eIsSet(featureID);
  }

} //AssertImpl
