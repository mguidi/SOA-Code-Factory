/**
 */
package com.mguidi.soa.soa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic List Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mguidi.soa.soa.GenericListFeature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mguidi.soa.soa.SoaPackage#getGenericListFeature()
 * @model
 * @generated
 */
public interface GenericListFeature extends FeatureType
{
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
   * @see com.mguidi.soa.soa.SoaPackage#getGenericListFeature_Type()
   * @model containment="true"
   * @generated
   */
  FeatureType getType();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.GenericListFeature#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(FeatureType value);

} // GenericListFeature
