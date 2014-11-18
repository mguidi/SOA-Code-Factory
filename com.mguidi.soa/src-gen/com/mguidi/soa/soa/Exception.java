/**
 */
package com.mguidi.soa.soa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mguidi.soa.soa.Exception#getName <em>Name</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Exception#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mguidi.soa.soa.SoaPackage#getException()
 * @model
 * @generated
 */
public interface Exception extends EObject
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
   * @see com.mguidi.soa.soa.SoaPackage#getException_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.Exception#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg</em>' attribute.
   * @see #setMsg(String)
   * @see com.mguidi.soa.soa.SoaPackage#getException_Msg()
   * @model
   * @generated
   */
  String getMsg();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.Exception#getMsg <em>Msg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msg</em>' attribute.
   * @see #getMsg()
   * @generated
   */
  void setMsg(String value);

} // Exception
