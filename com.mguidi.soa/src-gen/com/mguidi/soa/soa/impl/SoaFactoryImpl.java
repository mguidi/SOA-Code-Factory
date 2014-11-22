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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoaFactoryImpl extends EFactoryImpl implements SoaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SoaFactory init()
  {
    try
    {
      SoaFactory theSoaFactory = (SoaFactory)EPackage.Registry.INSTANCE.getEFactory(SoaPackage.eNS_URI);
      if (theSoaFactory != null)
      {
        return theSoaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SoaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SoaPackage.ARCHITECTURE: return createArchitecture();
      case SoaPackage.MODULE: return createModule();
      case SoaPackage.IMPORT: return createImport();
      case SoaPackage.MODEL: return createModel();
      case SoaPackage.COMMENT: return createComment();
      case SoaPackage.ENTITIES: return createEntities();
      case SoaPackage.ENUM: return createEnum();
      case SoaPackage.ENTITY: return createEntity();
      case SoaPackage.FEATURE: return createFeature();
      case SoaPackage.FEATURE_TYPE: return createFeatureType();
      case SoaPackage.ENTITIES_FEATURE: return createEntitiesFeature();
      case SoaPackage.PRIMITIVE_FEATURE: return createPrimitiveFeature();
      case SoaPackage.GENERIC_LIST_FEATURE: return createGenericListFeature();
      case SoaPackage.EXCEPTIONS: return createExceptions();
      case SoaPackage.EXCEPTION: return createException();
      case SoaPackage.SERVICE: return createService();
      case SoaPackage.OPERATION: return createOperation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SoaPackage.PRIMITIVE_TYPE:
        return createPrimitiveTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SoaPackage.PRIMITIVE_TYPE:
        return convertPrimitiveTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Architecture createArchitecture()
  {
    ArchitectureImpl architecture = new ArchitectureImpl();
    return architecture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entities createEntities()
  {
    EntitiesImpl entities = new EntitiesImpl();
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.mguidi.soa.soa.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureType createFeatureType()
  {
    FeatureTypeImpl featureType = new FeatureTypeImpl();
    return featureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntitiesFeature createEntitiesFeature()
  {
    EntitiesFeatureImpl entitiesFeature = new EntitiesFeatureImpl();
    return entitiesFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveFeature createPrimitiveFeature()
  {
    PrimitiveFeatureImpl primitiveFeature = new PrimitiveFeatureImpl();
    return primitiveFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericListFeature createGenericListFeature()
  {
    GenericListFeatureImpl genericListFeature = new GenericListFeatureImpl();
    return genericListFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exceptions createExceptions()
  {
    ExceptionsImpl exceptions = new ExceptionsImpl();
    return exceptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.mguidi.soa.soa.Exception createException()
  {
    ExceptionImpl exception = new ExceptionImpl();
    return exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue)
  {
    PrimitiveType result = PrimitiveType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoaPackage getSoaPackage()
  {
    return (SoaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SoaPackage getPackage()
  {
    return SoaPackage.eINSTANCE;
  }

} //SoaFactoryImpl
