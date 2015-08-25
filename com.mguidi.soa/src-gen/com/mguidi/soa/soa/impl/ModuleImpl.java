/**
 */
package com.mguidi.soa.soa.impl;

import com.mguidi.soa.soa.Exceptions;
import com.mguidi.soa.soa.Import;
import com.mguidi.soa.soa.Model;
import com.mguidi.soa.soa.Module;
import com.mguidi.soa.soa.Service;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mguidi.soa.soa.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.impl.ModuleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.impl.ModuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.impl.ModuleImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.impl.ModuleImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.impl.ModuleImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module
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
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected Model model;

  /**
   * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptions()
   * @generated
   * @ordered
   */
  protected Exceptions exceptions;

  /**
   * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServices()
   * @generated
   * @ordered
   */
  protected EList<Service> services;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl()
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
    return SoaPackage.Literals.MODULE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.MODULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.MODULE__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, SoaPackage.MODULE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model getModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModel(Model newModel, NotificationChain msgs)
  {
    Model oldModel = model;
    model = newModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoaPackage.MODULE__MODEL, oldModel, newModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(Model newModel)
  {
    if (newModel != model)
    {
      NotificationChain msgs = null;
      if (model != null)
        msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoaPackage.MODULE__MODEL, null, msgs);
      if (newModel != null)
        msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoaPackage.MODULE__MODEL, null, msgs);
      msgs = basicSetModel(newModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.MODULE__MODEL, newModel, newModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exceptions getExceptions()
  {
    return exceptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExceptions(Exceptions newExceptions, NotificationChain msgs)
  {
    Exceptions oldExceptions = exceptions;
    exceptions = newExceptions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoaPackage.MODULE__EXCEPTIONS, oldExceptions, newExceptions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExceptions(Exceptions newExceptions)
  {
    if (newExceptions != exceptions)
    {
      NotificationChain msgs = null;
      if (exceptions != null)
        msgs = ((InternalEObject)exceptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoaPackage.MODULE__EXCEPTIONS, null, msgs);
      if (newExceptions != null)
        msgs = ((InternalEObject)newExceptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoaPackage.MODULE__EXCEPTIONS, null, msgs);
      msgs = basicSetExceptions(newExceptions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.MODULE__EXCEPTIONS, newExceptions, newExceptions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getServices()
  {
    if (services == null)
    {
      services = new EObjectContainmentEList<Service>(Service.class, this, SoaPackage.MODULE__SERVICES);
    }
    return services;
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
      case SoaPackage.MODULE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case SoaPackage.MODULE__MODEL:
        return basicSetModel(null, msgs);
      case SoaPackage.MODULE__EXCEPTIONS:
        return basicSetExceptions(null, msgs);
      case SoaPackage.MODULE__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
      case SoaPackage.MODULE__NAME:
        return getName();
      case SoaPackage.MODULE__VERSION:
        return getVersion();
      case SoaPackage.MODULE__IMPORTS:
        return getImports();
      case SoaPackage.MODULE__MODEL:
        return getModel();
      case SoaPackage.MODULE__EXCEPTIONS:
        return getExceptions();
      case SoaPackage.MODULE__SERVICES:
        return getServices();
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
      case SoaPackage.MODULE__NAME:
        setName((String)newValue);
        return;
      case SoaPackage.MODULE__VERSION:
        setVersion((String)newValue);
        return;
      case SoaPackage.MODULE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case SoaPackage.MODULE__MODEL:
        setModel((Model)newValue);
        return;
      case SoaPackage.MODULE__EXCEPTIONS:
        setExceptions((Exceptions)newValue);
        return;
      case SoaPackage.MODULE__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
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
      case SoaPackage.MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SoaPackage.MODULE__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case SoaPackage.MODULE__IMPORTS:
        getImports().clear();
        return;
      case SoaPackage.MODULE__MODEL:
        setModel((Model)null);
        return;
      case SoaPackage.MODULE__EXCEPTIONS:
        setExceptions((Exceptions)null);
        return;
      case SoaPackage.MODULE__SERVICES:
        getServices().clear();
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
      case SoaPackage.MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SoaPackage.MODULE__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case SoaPackage.MODULE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case SoaPackage.MODULE__MODEL:
        return model != null;
      case SoaPackage.MODULE__EXCEPTIONS:
        return exceptions != null;
      case SoaPackage.MODULE__SERVICES:
        return services != null && !services.isEmpty();
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
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //ModuleImpl
