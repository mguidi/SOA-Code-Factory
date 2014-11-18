/**
 */
package com.mguidi.soa.soa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mguidi.soa.soa.Model#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mguidi.soa.soa.SoaPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link com.mguidi.soa.soa.Entities}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see com.mguidi.soa.soa.SoaPackage#getModel_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entities> getEntities();

} // Model
