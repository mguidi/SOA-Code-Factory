/**
 */
package com.mguidi.soa.soa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.mguidi.soa.soa.SoaFactory
 * @model kind="package"
 * @generated
 */
public interface SoaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "soa";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mguidi.com/soa/SOA";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "soa";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SoaPackage eINSTANCE = com.mguidi.soa.soa.impl.SoaPackageImpl.init();

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.ArchitectureImpl <em>Architecture</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.ArchitectureImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getArchitecture()
   * @generated
   */
  int ARCHITECTURE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE__MODULE = 1;

  /**
   * The number of structural features of the '<em>Architecture</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.ModuleImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getModule()
   * @generated
   */
  int MODULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__VERSION = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__MODEL = 3;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__EXCEPTIONS = 4;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__SERVICES = 5;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.ImportImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.ModelImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getModel()
   * @generated
   */
  int MODEL = 3;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ENTITIES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.CommentImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.EntitiesImpl <em>Entities</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.EntitiesImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getEntities()
   * @generated
   */
  int ENTITIES = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITIES__NAME = 0;

  /**
   * The number of structural features of the '<em>Entities</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITIES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.EnumImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = ENTITIES__NAME;

  /**
   * The feature id for the '<em><b>Features</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__FEATURES = ENTITIES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = ENTITIES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.EntityImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = ENTITIES__NAME;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = ENTITIES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = ENTITIES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.FeatureImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 8;

  /**
   * The feature id for the '<em><b>Feature Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__FEATURE_COMMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.FeatureTypeImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getFeatureType()
   * @generated
   */
  int FEATURE_TYPE = 9;

  /**
   * The number of structural features of the '<em>Feature Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.EntitiesFeatureImpl <em>Entities Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.EntitiesFeatureImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getEntitiesFeature()
   * @generated
   */
  int ENTITIES_FEATURE = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITIES_FEATURE__TYPE = FEATURE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entities Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITIES_FEATURE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.PrimitiveFeatureImpl <em>Primitive Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.PrimitiveFeatureImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getPrimitiveFeature()
   * @generated
   */
  int PRIMITIVE_FEATURE = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_FEATURE__TYPE = FEATURE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_FEATURE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.GenericListFeatureImpl <em>Generic List Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.GenericListFeatureImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getGenericListFeature()
   * @generated
   */
  int GENERIC_LIST_FEATURE = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_LIST_FEATURE__TYPE = FEATURE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Generic List Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_LIST_FEATURE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.ExceptionsImpl <em>Exceptions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.ExceptionsImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getExceptions()
   * @generated
   */
  int EXCEPTIONS = 13;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTIONS__EXCEPTIONS = 0;

  /**
   * The number of structural features of the '<em>Exceptions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.ExceptionImpl <em>Exception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.ExceptionImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getException()
   * @generated
   */
  int EXCEPTION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION__MSG = 1;

  /**
   * The number of structural features of the '<em>Exception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.ServiceImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getService()
   * @generated
   */
  int SERVICE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__OPERATIONS = 1;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.impl.OperationImpl
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Authenticated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__AUTHENTICATED = 1;

  /**
   * The feature id for the '<em><b>Features Input</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__FEATURES_INPUT = 2;

  /**
   * The feature id for the '<em><b>Features Output</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__FEATURES_OUTPUT = 3;

  /**
   * The feature id for the '<em><b>Exceptionts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__EXCEPTIONTS = 4;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.mguidi.soa.soa.PrimitiveType <em>Primitive Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mguidi.soa.soa.PrimitiveType
   * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 17;


  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Architecture <em>Architecture</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architecture</em>'.
   * @see com.mguidi.soa.soa.Architecture
   * @generated
   */
  EClass getArchitecture();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Architecture#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.mguidi.soa.soa.Architecture#getName()
   * @see #getArchitecture()
   * @generated
   */
  EAttribute getArchitecture_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.mguidi.soa.soa.Architecture#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see com.mguidi.soa.soa.Architecture#getModule()
   * @see #getArchitecture()
   * @generated
   */
  EReference getArchitecture_Module();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see com.mguidi.soa.soa.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.mguidi.soa.soa.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Module#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see com.mguidi.soa.soa.Module#getVersion()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Version();

  /**
   * Returns the meta object for the containment reference list '{@link com.mguidi.soa.soa.Module#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.mguidi.soa.soa.Module#getImports()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Imports();

  /**
   * Returns the meta object for the containment reference '{@link com.mguidi.soa.soa.Module#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Model</em>'.
   * @see com.mguidi.soa.soa.Module#getModel()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Model();

  /**
   * Returns the meta object for the containment reference '{@link com.mguidi.soa.soa.Module#getExceptions <em>Exceptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exceptions</em>'.
   * @see com.mguidi.soa.soa.Module#getExceptions()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Exceptions();

  /**
   * Returns the meta object for the containment reference list '{@link com.mguidi.soa.soa.Module#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see com.mguidi.soa.soa.Module#getServices()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Services();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.mguidi.soa.soa.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see com.mguidi.soa.soa.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.mguidi.soa.soa.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.mguidi.soa.soa.Model#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see com.mguidi.soa.soa.Model#getEntities()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Entities();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see com.mguidi.soa.soa.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Comment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.mguidi.soa.soa.Comment#getValue()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Value();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Entities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entities</em>'.
   * @see com.mguidi.soa.soa.Entities
   * @generated
   */
  EClass getEntities();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Entities#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.mguidi.soa.soa.Entities#getName()
   * @see #getEntities()
   * @generated
   */
  EAttribute getEntities_Name();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see com.mguidi.soa.soa.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute list '{@link com.mguidi.soa.soa.Enum#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Features</em>'.
   * @see com.mguidi.soa.soa.Enum#getFeatures()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Features();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see com.mguidi.soa.soa.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link com.mguidi.soa.soa.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see com.mguidi.soa.soa.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see com.mguidi.soa.soa.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the containment reference list '{@link com.mguidi.soa.soa.Feature#getFeatureComment <em>Feature Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature Comment</em>'.
   * @see com.mguidi.soa.soa.Feature#getFeatureComment()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_FeatureComment();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.mguidi.soa.soa.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.mguidi.soa.soa.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.mguidi.soa.soa.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.FeatureType <em>Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Type</em>'.
   * @see com.mguidi.soa.soa.FeatureType
   * @generated
   */
  EClass getFeatureType();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.EntitiesFeature <em>Entities Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entities Feature</em>'.
   * @see com.mguidi.soa.soa.EntitiesFeature
   * @generated
   */
  EClass getEntitiesFeature();

  /**
   * Returns the meta object for the reference '{@link com.mguidi.soa.soa.EntitiesFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.mguidi.soa.soa.EntitiesFeature#getType()
   * @see #getEntitiesFeature()
   * @generated
   */
  EReference getEntitiesFeature_Type();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.PrimitiveFeature <em>Primitive Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Feature</em>'.
   * @see com.mguidi.soa.soa.PrimitiveFeature
   * @generated
   */
  EClass getPrimitiveFeature();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.PrimitiveFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.mguidi.soa.soa.PrimitiveFeature#getType()
   * @see #getPrimitiveFeature()
   * @generated
   */
  EAttribute getPrimitiveFeature_Type();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.GenericListFeature <em>Generic List Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic List Feature</em>'.
   * @see com.mguidi.soa.soa.GenericListFeature
   * @generated
   */
  EClass getGenericListFeature();

  /**
   * Returns the meta object for the containment reference '{@link com.mguidi.soa.soa.GenericListFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.mguidi.soa.soa.GenericListFeature#getType()
   * @see #getGenericListFeature()
   * @generated
   */
  EReference getGenericListFeature_Type();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Exceptions <em>Exceptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exceptions</em>'.
   * @see com.mguidi.soa.soa.Exceptions
   * @generated
   */
  EClass getExceptions();

  /**
   * Returns the meta object for the containment reference list '{@link com.mguidi.soa.soa.Exceptions#getExceptions <em>Exceptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exceptions</em>'.
   * @see com.mguidi.soa.soa.Exceptions#getExceptions()
   * @see #getExceptions()
   * @generated
   */
  EReference getExceptions_Exceptions();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Exception <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception</em>'.
   * @see com.mguidi.soa.soa.Exception
   * @generated
   */
  EClass getException();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Exception#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.mguidi.soa.soa.Exception#getName()
   * @see #getException()
   * @generated
   */
  EAttribute getException_Name();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Exception#getMsg <em>Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Msg</em>'.
   * @see com.mguidi.soa.soa.Exception#getMsg()
   * @see #getException()
   * @generated
   */
  EAttribute getException_Msg();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see com.mguidi.soa.soa.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.mguidi.soa.soa.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.mguidi.soa.soa.Service#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.mguidi.soa.soa.Service#getOperations()
   * @see #getService()
   * @generated
   */
  EReference getService_Operations();

  /**
   * Returns the meta object for class '{@link com.mguidi.soa.soa.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see com.mguidi.soa.soa.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.mguidi.soa.soa.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the attribute '{@link com.mguidi.soa.soa.Operation#isAuthenticated <em>Authenticated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Authenticated</em>'.
   * @see com.mguidi.soa.soa.Operation#isAuthenticated()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Authenticated();

  /**
   * Returns the meta object for the containment reference list '{@link com.mguidi.soa.soa.Operation#getFeaturesInput <em>Features Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features Input</em>'.
   * @see com.mguidi.soa.soa.Operation#getFeaturesInput()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_FeaturesInput();

  /**
   * Returns the meta object for the containment reference list '{@link com.mguidi.soa.soa.Operation#getFeaturesOutput <em>Features Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features Output</em>'.
   * @see com.mguidi.soa.soa.Operation#getFeaturesOutput()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_FeaturesOutput();

  /**
   * Returns the meta object for the reference list '{@link com.mguidi.soa.soa.Operation#getExceptionts <em>Exceptionts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Exceptionts</em>'.
   * @see com.mguidi.soa.soa.Operation#getExceptionts()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Exceptionts();

  /**
   * Returns the meta object for enum '{@link com.mguidi.soa.soa.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Primitive Type</em>'.
   * @see com.mguidi.soa.soa.PrimitiveType
   * @generated
   */
  EEnum getPrimitiveType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SoaFactory getSoaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.ArchitectureImpl <em>Architecture</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.ArchitectureImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getArchitecture()
     * @generated
     */
    EClass ARCHITECTURE = eINSTANCE.getArchitecture();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARCHITECTURE__NAME = eINSTANCE.getArchitecture_Name();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE__MODULE = eINSTANCE.getArchitecture_Module();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.ModuleImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__VERSION = eINSTANCE.getModule_Version();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__IMPORTS = eINSTANCE.getModule_Imports();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__MODEL = eINSTANCE.getModule_Model();

    /**
     * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__EXCEPTIONS = eINSTANCE.getModule_Exceptions();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__SERVICES = eINSTANCE.getModule_Services();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.ImportImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.ModelImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ENTITIES = eINSTANCE.getModel_Entities();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.CommentImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__VALUE = eINSTANCE.getComment_Value();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.EntitiesImpl <em>Entities</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.EntitiesImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getEntities()
     * @generated
     */
    EClass ENTITIES = eINSTANCE.getEntities();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITIES__NAME = eINSTANCE.getEntities_Name();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.EnumImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__FEATURES = eINSTANCE.getEnum_Features();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.EntityImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.FeatureImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Feature Comment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__FEATURE_COMMENT = eINSTANCE.getFeature_FeatureComment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.FeatureTypeImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getFeatureType()
     * @generated
     */
    EClass FEATURE_TYPE = eINSTANCE.getFeatureType();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.EntitiesFeatureImpl <em>Entities Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.EntitiesFeatureImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getEntitiesFeature()
     * @generated
     */
    EClass ENTITIES_FEATURE = eINSTANCE.getEntitiesFeature();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITIES_FEATURE__TYPE = eINSTANCE.getEntitiesFeature_Type();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.PrimitiveFeatureImpl <em>Primitive Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.PrimitiveFeatureImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getPrimitiveFeature()
     * @generated
     */
    EClass PRIMITIVE_FEATURE = eINSTANCE.getPrimitiveFeature();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_FEATURE__TYPE = eINSTANCE.getPrimitiveFeature_Type();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.GenericListFeatureImpl <em>Generic List Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.GenericListFeatureImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getGenericListFeature()
     * @generated
     */
    EClass GENERIC_LIST_FEATURE = eINSTANCE.getGenericListFeature();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_LIST_FEATURE__TYPE = eINSTANCE.getGenericListFeature_Type();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.ExceptionsImpl <em>Exceptions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.ExceptionsImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getExceptions()
     * @generated
     */
    EClass EXCEPTIONS = eINSTANCE.getExceptions();

    /**
     * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTIONS__EXCEPTIONS = eINSTANCE.getExceptions_Exceptions();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.ExceptionImpl <em>Exception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.ExceptionImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getException()
     * @generated
     */
    EClass EXCEPTION = eINSTANCE.getException();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCEPTION__NAME = eINSTANCE.getException_Name();

    /**
     * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCEPTION__MSG = eINSTANCE.getException_Msg();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.ServiceImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__OPERATIONS = eINSTANCE.getService_Operations();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.impl.OperationImpl
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

    /**
     * The meta object literal for the '<em><b>Authenticated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__AUTHENTICATED = eINSTANCE.getOperation_Authenticated();

    /**
     * The meta object literal for the '<em><b>Features Input</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__FEATURES_INPUT = eINSTANCE.getOperation_FeaturesInput();

    /**
     * The meta object literal for the '<em><b>Features Output</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__FEATURES_OUTPUT = eINSTANCE.getOperation_FeaturesOutput();

    /**
     * The meta object literal for the '<em><b>Exceptionts</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__EXCEPTIONTS = eINSTANCE.getOperation_Exceptionts();

    /**
     * The meta object literal for the '{@link com.mguidi.soa.soa.PrimitiveType <em>Primitive Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mguidi.soa.soa.PrimitiveType
     * @see com.mguidi.soa.soa.impl.SoaPackageImpl#getPrimitiveType()
     * @generated
     */
    EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

  }

} //SoaPackage
