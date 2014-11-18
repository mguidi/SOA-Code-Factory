/**
 */
package com.mguidi.soa.soa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mguidi.soa.soa.Feature#getFeatureComment <em>Feature Comment</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Feature#getName <em>Name</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Feature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mguidi.soa.soa.SoaPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Feature Comment</b></em>' containment reference list.
   * The list contents are of type {@link com.mguidi.soa.soa.Comment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Comment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Comment</em>' containment reference list.
   * @see com.mguidi.soa.soa.SoaPackage#getFeature_FeatureComment()
   * @model containment="true"
   * @generated
   */
  EList<Comment> getFeatureComment();

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
   * @see com.mguidi.soa.soa.SoaPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(FeatureType)
   * @see com.mguidi.soa.soa.SoaPackage#getFeature_Type()
   * @model containment="true"
   * @generated
   */
  FeatureType getType();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.Feature#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(FeatureType value);

} // Feature
