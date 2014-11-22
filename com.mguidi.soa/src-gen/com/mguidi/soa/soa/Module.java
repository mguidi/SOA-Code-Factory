/**
 */
package com.mguidi.soa.soa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mguidi.soa.soa.Module#getName <em>Name</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Module#getVersion <em>Version</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Module#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Module#getModel <em>Model</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Module#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Module#getServices <em>Services</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Module#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mguidi.soa.soa.SoaPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.mguidi.soa.soa.SoaPackage#getModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.Module#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see com.mguidi.soa.soa.SoaPackage#getModule_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.Module#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.mguidi.soa.soa.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.mguidi.soa.soa.SoaPackage#getModule_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' containment reference.
   * @see #setModel(Model)
   * @see com.mguidi.soa.soa.SoaPackage#getModule_Model()
   * @model containment="true"
   * @generated
   */
  Model getModel();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.Module#getModel <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' containment reference.
   * @see #getModel()
   * @generated
   */
  void setModel(Model value);

  /**
   * Returns the value of the '<em><b>Exceptions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exceptions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exceptions</em>' containment reference.
   * @see #setExceptions(Exceptions)
   * @see com.mguidi.soa.soa.SoaPackage#getModule_Exceptions()
   * @model containment="true"
   * @generated
   */
  Exceptions getExceptions();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.Module#getExceptions <em>Exceptions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exceptions</em>' containment reference.
   * @see #getExceptions()
   * @generated
   */
  void setExceptions(Exceptions value);

  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link com.mguidi.soa.soa.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see com.mguidi.soa.soa.SoaPackage#getModule_Services()
   * @model containment="true"
   * @generated
   */
  EList<Service> getServices();

  /**
   * Returns the value of the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' attribute.
   * @see #setEvent(String)
   * @see com.mguidi.soa.soa.SoaPackage#getModule_Event()
   * @model
   * @generated
   */
  String getEvent();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.Module#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see #getEvent()
   * @generated
   */
  void setEvent(String value);

} // Module
