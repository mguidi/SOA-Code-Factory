/**
 */
package com.mguidi.soa.soa.impl;

import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.Operation;
import com.mguidi.soa.soa.SoaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mguidi.soa.soa.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.impl.OperationImpl#getFeaturesInput <em>Features Input</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.impl.OperationImpl#getFeaturesOutput <em>Features Output</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.impl.OperationImpl#getExceptionts <em>Exceptionts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFeaturesInput() <em>Features Input</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeaturesInput()
   * @generated
   * @ordered
   */
  protected EList<Feature> featuresInput;

  /**
   * The cached value of the '{@link #getFeaturesOutput() <em>Features Output</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeaturesOutput()
   * @generated
   * @ordered
   */
  protected EList<Feature> featuresOutput;

  /**
   * The cached value of the '{@link #getExceptionts() <em>Exceptionts</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptionts()
   * @generated
   * @ordered
   */
  protected EList<com.mguidi.soa.soa.Exception> exceptionts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return SoaPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.OPERATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeaturesInput()
  {
    if (featuresInput == null)
    {
      featuresInput = new EObjectContainmentEList<Feature>(Feature.class, this, SoaPackage.OPERATION__FEATURES_INPUT);
    }
    return featuresInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeaturesOutput()
  {
    if (featuresOutput == null)
    {
      featuresOutput = new EObjectContainmentEList<Feature>(Feature.class, this, SoaPackage.OPERATION__FEATURES_OUTPUT);
    }
    return featuresOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<com.mguidi.soa.soa.Exception> getExceptionts()
  {
    if (exceptionts == null)
    {
      exceptionts = new EObjectResolvingEList<com.mguidi.soa.soa.Exception>(com.mguidi.soa.soa.Exception.class, this, SoaPackage.OPERATION__EXCEPTIONTS);
    }
    return exceptionts;
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
      case SoaPackage.OPERATION__FEATURES_INPUT:
        return ((InternalEList<?>)getFeaturesInput()).basicRemove(otherEnd, msgs);
      case SoaPackage.OPERATION__FEATURES_OUTPUT:
        return ((InternalEList<?>)getFeaturesOutput()).basicRemove(otherEnd, msgs);
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
      case SoaPackage.OPERATION__NAME:
        return getName();
      case SoaPackage.OPERATION__FEATURES_INPUT:
        return getFeaturesInput();
      case SoaPackage.OPERATION__FEATURES_OUTPUT:
        return getFeaturesOutput();
      case SoaPackage.OPERATION__EXCEPTIONTS:
        return getExceptionts();
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
      case SoaPackage.OPERATION__NAME:
        setName((String)newValue);
        return;
      case SoaPackage.OPERATION__FEATURES_INPUT:
        getFeaturesInput().clear();
        getFeaturesInput().addAll((Collection<? extends Feature>)newValue);
        return;
      case SoaPackage.OPERATION__FEATURES_OUTPUT:
        getFeaturesOutput().clear();
        getFeaturesOutput().addAll((Collection<? extends Feature>)newValue);
        return;
      case SoaPackage.OPERATION__EXCEPTIONTS:
        getExceptionts().clear();
        getExceptionts().addAll((Collection<? extends com.mguidi.soa.soa.Exception>)newValue);
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
      case SoaPackage.OPERATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SoaPackage.OPERATION__FEATURES_INPUT:
        getFeaturesInput().clear();
        return;
      case SoaPackage.OPERATION__FEATURES_OUTPUT:
        getFeaturesOutput().clear();
        return;
      case SoaPackage.OPERATION__EXCEPTIONTS:
        getExceptionts().clear();
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
      case SoaPackage.OPERATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SoaPackage.OPERATION__FEATURES_INPUT:
        return featuresInput != null && !featuresInput.isEmpty();
      case SoaPackage.OPERATION__FEATURES_OUTPUT:
        return featuresOutput != null && !featuresOutput.isEmpty();
      case SoaPackage.OPERATION__EXCEPTIONTS:
        return exceptionts != null && !exceptionts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
