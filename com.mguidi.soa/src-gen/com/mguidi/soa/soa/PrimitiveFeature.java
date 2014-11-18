/**
 */
package com.mguidi.soa.soa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mguidi.soa.soa.PrimitiveFeature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mguidi.soa.soa.SoaPackage#getPrimitiveFeature()
 * @model
 * @generated
 */
public interface PrimitiveFeature extends FeatureType
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.mguidi.soa.soa.PrimitiveType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.mguidi.soa.soa.PrimitiveType
   * @see #setType(PrimitiveType)
   * @see com.mguidi.soa.soa.SoaPackage#getPrimitiveFeature_Type()
   * @model
   * @generated
   */
  PrimitiveType getType();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.PrimitiveFeature#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.mguidi.soa.soa.PrimitiveType
   * @see #getType()
   * @generated
   */
  void setType(PrimitiveType value);

} // PrimitiveFeature
