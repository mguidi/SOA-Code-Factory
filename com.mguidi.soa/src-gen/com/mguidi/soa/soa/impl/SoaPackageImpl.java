/**
 */
package com.mguidi.soa.soa.impl;

import com.mguidi.soa.soa.Architecture;
import com.mguidi.soa.soa.Comment;
import com.mguidi.soa.soa.Entities;
import com.mguidi.soa.soa.EntitiesFeature;
import com.mguidi.soa.soa.Entity;
import com.mguidi.soa.soa.Exceptions;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.FeatureType;
import com.mguidi.soa.soa.GenericListFeature;
import com.mguidi.soa.soa.Import;
import com.mguidi.soa.soa.Model;
import com.mguidi.soa.soa.Module;
import com.mguidi.soa.soa.Operation;
import com.mguidi.soa.soa.PrimitiveFeature;
import com.mguidi.soa.soa.PrimitiveType;
import com.mguidi.soa.soa.Service;
import com.mguidi.soa.soa.SoaFactory;
import com.mguidi.soa.soa.SoaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoaPackageImpl extends EPackageImpl implements SoaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass architectureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entitiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entitiesFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericListFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum primitiveTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.mguidi.soa.soa.SoaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SoaPackageImpl()
  {
    super(eNS_URI, SoaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SoaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SoaPackage init()
  {
    if (isInited) return (SoaPackage)EPackage.Registry.INSTANCE.getEPackage(SoaPackage.eNS_URI);

    // Obtain or create and register package
    SoaPackageImpl theSoaPackage = (SoaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoaPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSoaPackage.createPackageContents();

    // Initialize created meta-data
    theSoaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSoaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SoaPackage.eNS_URI, theSoaPackage);
    return theSoaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArchitecture()
  {
    return architectureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArchitecture_Name()
  {
    return (EAttribute)architectureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitecture_Module()
  {
    return (EReference)architectureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Version()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Imports()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Model()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Exceptions()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Services()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Entities()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComment_Value()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntities()
  {
    return entitiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntities_Name()
  {
    return (EAttribute)entitiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum()
  {
    return enumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnum_Features()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Features()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_FeatureComment()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Name()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_Type()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureType()
  {
    return featureTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntitiesFeature()
  {
    return entitiesFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntitiesFeature_Type()
  {
    return (EReference)entitiesFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveFeature()
  {
    return primitiveFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveFeature_Type()
  {
    return (EAttribute)primitiveFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericListFeature()
  {
    return genericListFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericListFeature_Type()
  {
    return (EReference)genericListFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExceptions()
  {
    return exceptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExceptions_Exceptions()
  {
    return (EReference)exceptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getException()
  {
    return exceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getException_Name()
  {
    return (EAttribute)exceptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getException_Msg()
  {
    return (EAttribute)exceptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Name()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_Operations()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Name()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Authenticated()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_FeaturesInput()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_FeaturesOutput()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Exceptionts()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPrimitiveType()
  {
    return primitiveTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoaFactory getSoaFactory()
  {
    return (SoaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    architectureEClass = createEClass(ARCHITECTURE);
    createEAttribute(architectureEClass, ARCHITECTURE__NAME);
    createEReference(architectureEClass, ARCHITECTURE__MODULE);

    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEAttribute(moduleEClass, MODULE__VERSION);
    createEReference(moduleEClass, MODULE__IMPORTS);
    createEReference(moduleEClass, MODULE__MODEL);
    createEReference(moduleEClass, MODULE__EXCEPTIONS);
    createEReference(moduleEClass, MODULE__SERVICES);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ENTITIES);

    commentEClass = createEClass(COMMENT);
    createEAttribute(commentEClass, COMMENT__VALUE);

    entitiesEClass = createEClass(ENTITIES);
    createEAttribute(entitiesEClass, ENTITIES__NAME);

    enumEClass = createEClass(ENUM);
    createEAttribute(enumEClass, ENUM__FEATURES);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__FEATURES);

    featureEClass = createEClass(FEATURE);
    createEReference(featureEClass, FEATURE__FEATURE_COMMENT);
    createEAttribute(featureEClass, FEATURE__NAME);
    createEReference(featureEClass, FEATURE__TYPE);

    featureTypeEClass = createEClass(FEATURE_TYPE);

    entitiesFeatureEClass = createEClass(ENTITIES_FEATURE);
    createEReference(entitiesFeatureEClass, ENTITIES_FEATURE__TYPE);

    primitiveFeatureEClass = createEClass(PRIMITIVE_FEATURE);
    createEAttribute(primitiveFeatureEClass, PRIMITIVE_FEATURE__TYPE);

    genericListFeatureEClass = createEClass(GENERIC_LIST_FEATURE);
    createEReference(genericListFeatureEClass, GENERIC_LIST_FEATURE__TYPE);

    exceptionsEClass = createEClass(EXCEPTIONS);
    createEReference(exceptionsEClass, EXCEPTIONS__EXCEPTIONS);

    exceptionEClass = createEClass(EXCEPTION);
    createEAttribute(exceptionEClass, EXCEPTION__NAME);
    createEAttribute(exceptionEClass, EXCEPTION__MSG);

    serviceEClass = createEClass(SERVICE);
    createEAttribute(serviceEClass, SERVICE__NAME);
    createEReference(serviceEClass, SERVICE__OPERATIONS);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__NAME);
    createEAttribute(operationEClass, OPERATION__AUTHENTICATED);
    createEReference(operationEClass, OPERATION__FEATURES_INPUT);
    createEReference(operationEClass, OPERATION__FEATURES_OUTPUT);
    createEReference(operationEClass, OPERATION__EXCEPTIONTS);

    // Create enums
    primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    enumEClass.getESuperTypes().add(this.getEntities());
    entityEClass.getESuperTypes().add(this.getEntities());
    entitiesFeatureEClass.getESuperTypes().add(this.getFeatureType());
    primitiveFeatureEClass.getESuperTypes().add(this.getFeatureType());
    genericListFeatureEClass.getESuperTypes().add(this.getFeatureType());

    // Initialize classes and features; add operations and parameters
    initEClass(architectureEClass, Architecture.class, "Architecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArchitecture_Name(), ecorePackage.getEString(), "name", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchitecture_Module(), this.getModule(), null, "module", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModule_Version(), ecorePackage.getEString(), "version", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Imports(), this.getImport(), null, "imports", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Model(), this.getModel(), null, "model", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Exceptions(), this.getExceptions(), null, "exceptions", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Services(), this.getService(), null, "services", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Entities(), this.getEntities(), null, "entities", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComment_Value(), ecorePackage.getEString(), "value", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entitiesEClass, Entities.class, "Entities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntities_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEClass, com.mguidi.soa.soa.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnum_Features(), ecorePackage.getEString(), "features", null, 0, -1, com.mguidi.soa.soa.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_Features(), this.getFeature(), null, "features", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeature_FeatureComment(), this.getComment(), null, "featureComment", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeature_Type(), this.getFeatureType(), null, "type", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureTypeEClass, FeatureType.class, "FeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entitiesFeatureEClass, EntitiesFeature.class, "EntitiesFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntitiesFeature_Type(), this.getEntities(), null, "type", null, 0, 1, EntitiesFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveFeatureEClass, PrimitiveFeature.class, "PrimitiveFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitiveFeature_Type(), this.getPrimitiveType(), "type", null, 0, 1, PrimitiveFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericListFeatureEClass, GenericListFeature.class, "GenericListFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGenericListFeature_Type(), this.getFeatureType(), null, "type", null, 0, 1, GenericListFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exceptionsEClass, Exceptions.class, "Exceptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExceptions_Exceptions(), this.getException(), null, "exceptions", null, 0, -1, Exceptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exceptionEClass, com.mguidi.soa.soa.Exception.class, "Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getException_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.mguidi.soa.soa.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getException_Msg(), ecorePackage.getEString(), "msg", null, 0, 1, com.mguidi.soa.soa.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_Operations(), this.getOperation(), null, "operations", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Authenticated(), ecorePackage.getEBoolean(), "authenticated", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_FeaturesInput(), this.getFeature(), null, "featuresInput", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_FeaturesOutput(), this.getFeature(), null, "featuresOutput", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Exceptionts(), this.getException(), null, "exceptionts", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.STRING);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.SHORT);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.INTEGER);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.LONG);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.FLOAT);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DOUBLE);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOLEAN);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BYTE);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DATE);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DATETIME);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.TIMESTAMP);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DECIMAL);

    // Create resource
    createResource(eNS_URI);
  }

} //SoaPackageImpl
