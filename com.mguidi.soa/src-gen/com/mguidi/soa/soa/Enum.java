/**
 */
package com.mguidi.soa.soa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mguidi.soa.soa.Enum#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mguidi.soa.soa.SoaPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends Entities
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' attribute list.
   * @see com.mguidi.soa.soa.SoaPackage#getEnum_Features()
   * @model unique="false"
   * @generated
   */
  EList<String> getFeatures();

} // Enum
