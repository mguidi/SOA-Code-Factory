/**
 */
package com.mguidi.soa.soa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mguidi.soa.soa.Operation#getName <em>Name</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Operation#getFeaturesInput <em>Features Input</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Operation#getFeaturesOutput <em>Features Output</em>}</li>
 *   <li>{@link com.mguidi.soa.soa.Operation#getExceptionts <em>Exceptionts</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mguidi.soa.soa.SoaPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
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
   * @see com.mguidi.soa.soa.SoaPackage#getOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.mguidi.soa.soa.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Features Input</b></em>' containment reference list.
   * The list contents are of type {@link com.mguidi.soa.soa.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features Input</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features Input</em>' containment reference list.
   * @see com.mguidi.soa.soa.SoaPackage#getOperation_FeaturesInput()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeaturesInput();

  /**
   * Returns the value of the '<em><b>Features Output</b></em>' containment reference list.
   * The list contents are of type {@link com.mguidi.soa.soa.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features Output</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features Output</em>' containment reference list.
   * @see com.mguidi.soa.soa.SoaPackage#getOperation_FeaturesOutput()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeaturesOutput();

  /**
   * Returns the value of the '<em><b>Exceptionts</b></em>' reference list.
   * The list contents are of type {@link com.mguidi.soa.soa.Exception}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exceptionts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exceptionts</em>' reference list.
   * @see com.mguidi.soa.soa.SoaPackage#getOperation_Exceptionts()
   * @model
   * @generated
   */
  EList<com.mguidi.soa.soa.Exception> getExceptionts();

} // Operation
