/**
 */
package com.mguidi.soa.soa.util;

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
import com.mguidi.soa.soa.Service;
import com.mguidi.soa.soa.SoaPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.mguidi.soa.soa.SoaPackage
 * @generated
 */
public class SoaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SoaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SoaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SoaSwitch<Adapter> modelSwitch =
    new SoaSwitch<Adapter>()
    {
      @Override
      public Adapter caseArchitecture(Architecture object)
      {
        return createArchitectureAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
      }
      @Override
      public Adapter caseEntities(Entities object)
      {
        return createEntitiesAdapter();
      }
      @Override
      public Adapter caseEnum(com.mguidi.soa.soa.Enum object)
      {
        return createEnumAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseFeatureType(FeatureType object)
      {
        return createFeatureTypeAdapter();
      }
      @Override
      public Adapter caseEntitiesFeature(EntitiesFeature object)
      {
        return createEntitiesFeatureAdapter();
      }
      @Override
      public Adapter casePrimitiveFeature(PrimitiveFeature object)
      {
        return createPrimitiveFeatureAdapter();
      }
      @Override
      public Adapter caseGenericListFeature(GenericListFeature object)
      {
        return createGenericListFeatureAdapter();
      }
      @Override
      public Adapter caseExceptions(Exceptions object)
      {
        return createExceptionsAdapter();
      }
      @Override
      public Adapter caseException(com.mguidi.soa.soa.Exception object)
      {
        return createExceptionAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Architecture <em>Architecture</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Architecture
   * @generated
   */
  public Adapter createArchitectureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Entities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Entities
   * @generated
   */
  public Adapter createEntitiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Enum
   * @generated
   */
  public Adapter createEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.FeatureType <em>Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.FeatureType
   * @generated
   */
  public Adapter createFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.EntitiesFeature <em>Entities Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.EntitiesFeature
   * @generated
   */
  public Adapter createEntitiesFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.PrimitiveFeature <em>Primitive Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.PrimitiveFeature
   * @generated
   */
  public Adapter createPrimitiveFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.GenericListFeature <em>Generic List Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.GenericListFeature
   * @generated
   */
  public Adapter createGenericListFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Exceptions <em>Exceptions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Exceptions
   * @generated
   */
  public Adapter createExceptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Exception <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Exception
   * @generated
   */
  public Adapter createExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.mguidi.soa.soa.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.mguidi.soa.soa.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SoaAdapterFactory
