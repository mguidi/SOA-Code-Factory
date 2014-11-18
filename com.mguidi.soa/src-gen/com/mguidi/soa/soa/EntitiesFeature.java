/**
 */
package com.mguidi.soa.soa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entities Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mguidi.soa.soa.EntitiesFeature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mguidi.soa.soa.SoaPackage#getEntitiesFeature()
 * @model
 * @generated
 */
public interface EntitiesFeature extends FeatureType
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Entities)
   * @see com.mguidi.soa.soa.SoaPackage#getEntitiesFeature_Type()
   * @model
   * @generated
   */
  Entities getType();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.EntitiesFeature#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entities value);

} // EntitiesFeature
