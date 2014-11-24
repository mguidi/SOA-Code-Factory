package com.mguidi.soa.generator.java;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.mguidi.soa.soa.Architecture;
import com.mguidi.soa.soa.Comment;
import com.mguidi.soa.soa.Entities;
import com.mguidi.soa.soa.EntitiesFeature;
import com.mguidi.soa.soa.Entity;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.FeatureType;
import com.mguidi.soa.soa.GenericListFeature;
import com.mguidi.soa.soa.Model;
import com.mguidi.soa.soa.Module;
import com.mguidi.soa.soa.Operation;
import com.mguidi.soa.soa.PrimitiveFeature;
import com.mguidi.soa.soa.PrimitiveType;
import com.mguidi.soa.soa.Service;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Utils {
  public static class Dependency {
    public String applicationId;
    
    public String moduleName;
    
    public String version;
    
    public boolean equals(final Object obj) {
      Utils.Dependency tmp = ((Utils.Dependency) obj);
      boolean _and = false;
      boolean _and_1 = false;
      boolean _equals = tmp.applicationId.equals(this.applicationId);
      if (!_equals) {
        _and_1 = false;
      } else {
        boolean _equals_1 = tmp.moduleName.equals(this.moduleName);
        _and_1 = _equals_1;
      }
      if (!_and_1) {
        _and = false;
      } else {
        boolean _equals_2 = tmp.version.equals(this.version);
        _and = _equals_2;
      }
      return _and;
    }
    
    public int hashCode() {
      return ((this.applicationId + this.moduleName) + this.version).hashCode();
    }
  }
  
  public String applicationId(final Architecture architecture) {
    return architecture.getName();
  }
  
  public String moduleName(final Architecture architecture) {
    Module _module = architecture.getModule();
    return _module.getName();
  }
  
  public String version(final Architecture architecture) {
    Module _module = architecture.getModule();
    return _module.getVersion();
  }
  
  /**
   * Entities
   */
  public String packageName(final Entities entity) {
    EObject _eContainer = entity.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    EObject _eContainer_2 = _eContainer_1.eContainer();
    String _name = ((Architecture) _eContainer_2).getName();
    String _plus = (_name + ".");
    EObject _eContainer_3 = entity.eContainer();
    EObject _eContainer_4 = _eContainer_3.eContainer();
    String _name_1 = ((Module) _eContainer_4).getName();
    String _plus_1 = (_plus + _name_1);
    return (_plus_1 + ".model");
  }
  
  public String className(final Entities entity) {
    String _name = entity.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  public String qualifiedClassName(final Entities entity) {
    String _packageName = this.packageName(entity);
    String _plus = (_packageName + ".");
    String _className = this.className(entity);
    return (_plus + _className);
  }
  
  public String applicationId(final Entities entity) {
    EObject _eContainer = entity.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    EObject _eContainer_2 = _eContainer_1.eContainer();
    return this.applicationId(((Architecture) _eContainer_2));
  }
  
  public String moduleName(final Entities entity) {
    EObject _eContainer = entity.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    EObject _eContainer_2 = _eContainer_1.eContainer();
    return this.moduleName(((Architecture) _eContainer_2));
  }
  
  public String version(final Entities entity) {
    EObject _eContainer = entity.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    EObject _eContainer_2 = _eContainer_1.eContainer();
    return this.version(((Architecture) _eContainer_2));
  }
  
  /**
   * Service
   */
  public String packageName(final Service service) {
    EObject _eContainer = service.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    String _name = ((Architecture) _eContainer_1).getName();
    String _plus = (_name + ".");
    EObject _eContainer_2 = service.eContainer();
    String _name_1 = ((Module) _eContainer_2).getName();
    String _plus_1 = (_plus + _name_1);
    return (_plus_1 + ".service");
  }
  
  public String className(final Service service) {
    String _name = service.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  public String qualifiedClassName(final Service service) {
    String _packageName = this.packageName(service);
    String _plus = (_packageName + ".");
    String _className = this.className(service);
    return (_plus + _className);
  }
  
  public String packageNameInterface(final Service service) {
    EObject _eContainer = service.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    String _name = ((Architecture) _eContainer_1).getName();
    String _plus = (_name + ".");
    EObject _eContainer_2 = service.eContainer();
    String _name_1 = ((Module) _eContainer_2).getName();
    String _plus_1 = (_plus + _name_1);
    return (_plus_1 + ".service");
  }
  
  public String classNameInterface(final Service service) {
    String _name = service.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return ("I" + _firstUpper);
  }
  
  public String qualifiedClassNameInterface(final Service service) {
    String _packageNameInterface = this.packageNameInterface(service);
    String _plus = (_packageNameInterface + ".");
    String _classNameInterface = this.classNameInterface(service);
    return (_plus + _classNameInterface);
  }
  
  public String applicationId(final Service service) {
    EObject _eContainer = service.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    return this.applicationId(((Architecture) _eContainer_1));
  }
  
  public String moduleName(final Service service) {
    EObject _eContainer = service.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    return this.moduleName(((Architecture) _eContainer_1));
  }
  
  public String version(final Service service) {
    EObject _eContainer = service.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    return this.version(((Architecture) _eContainer_1));
  }
  
  public String packageNameServlet(final Service service) {
    EObject _eContainer = service.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    String _name = ((Architecture) _eContainer_1).getName();
    String _plus = (_name + ".");
    EObject _eContainer_2 = service.eContainer();
    String _name_1 = ((Module) _eContainer_2).getName();
    String _plus_1 = (_plus + _name_1);
    return (_plus_1 + ".servlet");
  }
  
  public String classNameServlet(final Service service) {
    String _name = service.getName();
    return (_name + "Servlet");
  }
  
  public String qualifiedClassNameServlet(final Service service) {
    String _packageNameServlet = this.packageNameServlet(service);
    String _plus = (_packageNameServlet + ".");
    String _classNameServlet = this.classNameServlet(service);
    return (_plus + _classNameServlet);
  }
  
  public String packageNameClient(final Service service) {
    EObject _eContainer = service.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    String _name = ((Architecture) _eContainer_1).getName();
    String _plus = (_name + ".");
    EObject _eContainer_2 = service.eContainer();
    String _name_1 = ((Module) _eContainer_2).getName();
    String _plus_1 = (_plus + _name_1);
    return (_plus_1 + ".client");
  }
  
  public String classNameClient(final Service service) {
    String _name = service.getName();
    return (_name + "Client");
  }
  
  public String qualifiedClassNameClient(final Service service) {
    String _packageNameClient = this.packageNameClient(service);
    String _plus = (_packageNameClient + ".");
    String _classNameClient = this.classNameClient(service);
    return (_plus + _classNameClient);
  }
  
  public String serviceName(final Service service) {
    return service.getName();
  }
  
  /**
   * Operation
   */
  public String signature(final Operation operation) {
    String _name = operation.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  public String throwsException(final Operation operation) {
    String text = "";
    EList<com.mguidi.soa.soa.Exception> _exceptionts = operation.getExceptionts();
    for (final com.mguidi.soa.soa.Exception e : _exceptionts) {
      String _text = text;
      String _qualifiedClassName = this.qualifiedClassName(e);
      String _plus = (", " + _qualifiedClassName);
      text = (_text + _plus);
    }
    return text;
  }
  
  public String packageNameOutput(final Operation operation) {
    EObject _eContainer = operation.eContainer();
    String _qualifiedClassName = this.qualifiedClassName(((Service) _eContainer));
    String _lowerCase = _qualifiedClassName.toLowerCase();
    return (_lowerCase + ".output");
  }
  
  public String classNameOutput(final Operation operation) {
    String _name = operation.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "Output");
  }
  
  public String qualifiedClassNameOutput(final Operation operation) {
    String _packageNameOutput = this.packageNameOutput(operation);
    String _plus = (_packageNameOutput + ".");
    String _classNameOutput = this.classNameOutput(operation);
    return (_plus + _classNameOutput);
  }
  
  public String packageNameInput(final Operation operation) {
    EObject _eContainer = operation.eContainer();
    String _qualifiedClassName = this.qualifiedClassName(((Service) _eContainer));
    String _lowerCase = _qualifiedClassName.toLowerCase();
    return (_lowerCase + ".input");
  }
  
  public String classNameInput(final Operation operation) {
    String _name = operation.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "Input");
  }
  
  public String qualifiedClassNameInput(final Operation operation) {
    String _packageNameInput = this.packageNameInput(operation);
    String _plus = (_packageNameInput + ".");
    String _classNameInput = this.classNameInput(operation);
    return (_plus + _classNameInput);
  }
  
  public String applicationId(final Operation operation) {
    EObject _eContainer = operation.eContainer();
    return this.applicationId(((Service) _eContainer));
  }
  
  public String moduleName(final Operation operation) {
    EObject _eContainer = operation.eContainer();
    return this.moduleName(((Service) _eContainer));
  }
  
  public String version(final Operation operation) {
    EObject _eContainer = operation.eContainer();
    return this.version(((Service) _eContainer));
  }
  
  /**
   * Exception
   */
  public String packageName(final com.mguidi.soa.soa.Exception exception) {
    EObject _eContainer = exception.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    EObject _eContainer_2 = _eContainer_1.eContainer();
    String _name = ((Architecture) _eContainer_2).getName();
    String _plus = (_name + ".");
    EObject _eContainer_3 = exception.eContainer();
    EObject _eContainer_4 = _eContainer_3.eContainer();
    String _name_1 = ((Module) _eContainer_4).getName();
    String _plus_1 = (_plus + _name_1);
    return (_plus_1 + ".exception");
  }
  
  public String className(final com.mguidi.soa.soa.Exception exception) {
    String _name = exception.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  public String qualifiedClassName(final com.mguidi.soa.soa.Exception exception) {
    String _packageName = this.packageName(exception);
    String _plus = (_packageName + ".");
    String _className = this.className(exception);
    return (_plus + _className);
  }
  
  public String applicationId(final com.mguidi.soa.soa.Exception exception) {
    EObject _eContainer = exception.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    EObject _eContainer_2 = _eContainer_1.eContainer();
    return this.applicationId(((Architecture) _eContainer_2));
  }
  
  public String moduleName(final com.mguidi.soa.soa.Exception exception) {
    EObject _eContainer = exception.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    EObject _eContainer_2 = _eContainer_1.eContainer();
    return this.moduleName(((Architecture) _eContainer_2));
  }
  
  public String version(final com.mguidi.soa.soa.Exception exception) {
    EObject _eContainer = exception.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    EObject _eContainer_2 = _eContainer_1.eContainer();
    return this.version(((Architecture) _eContainer_2));
  }
  
  /**
   * PrimitiveType
   */
  public String packageName(final PrimitiveType type) {
    String _switchResult = null;
    if (type != null) {
      switch (type) {
        case DATE:
          _switchResult = "java.util";
          break;
        case DATETIME:
          _switchResult = "java.util";
          break;
        case TIMESTAMP:
          _switchResult = "java.util";
          break;
        case DECIMAL:
          _switchResult = "java.math";
          break;
        default:
          _switchResult = "java.lang";
          break;
      }
    } else {
      _switchResult = "java.lang";
    }
    return _switchResult;
  }
  
  public String className(final PrimitiveType type) {
    String _switchResult = null;
    if (type != null) {
      switch (type) {
        case BOOLEAN:
          _switchResult = "Boolean";
          break;
        case BYTE:
          _switchResult = "Byte";
          break;
        case DATE:
          _switchResult = "Date";
          break;
        case DATETIME:
          _switchResult = "Date";
          break;
        case DECIMAL:
          _switchResult = "BigDecimal";
          break;
        case DOUBLE:
          _switchResult = "Double";
          break;
        case FLOAT:
          _switchResult = "Float";
          break;
        case INTEGER:
          _switchResult = "Integer";
          break;
        case LONG:
          _switchResult = "Long";
          break;
        case SHORT:
          _switchResult = "Short";
          break;
        case STRING:
          _switchResult = "String";
          break;
        case TIMESTAMP:
          _switchResult = "Date";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public String qualifiedClassName(final PrimitiveType type) {
    String _packageName = this.packageName(type);
    String _plus = (_packageName + ".");
    String _className = this.className(type);
    return (_plus + _className);
  }
  
  /**
   * Feature
   */
  public String key(final Feature feature) {
    String _name = feature.getName();
    return _name.toUpperCase();
  }
  
  public String keyValue(final Feature feature) {
    return feature.getName();
  }
  
  public String featureName(final Feature feature) {
    String _name = feature.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return ("m" + _firstUpper);
  }
  
  public String featureSetterName(final Feature feature) {
    String _name = feature.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return ("set" + _firstUpper);
  }
  
  public String featureGetterName(final Feature feature) {
    String _name = feature.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return ("get" + _firstUpper);
  }
  
  /**
   * FeatureType
   */
  public String applicationId(final FeatureType featureType) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (featureType instanceof EntitiesFeature) {
        _matched=true;
        Entities _type = ((EntitiesFeature) featureType).getType();
        _switchResult = this.applicationId(_type);
      }
    }
    if (!_matched) {
      if (featureType instanceof GenericListFeature) {
        _matched=true;
        FeatureType _baseType = this.baseType(((GenericListFeature) featureType));
        _switchResult = this.applicationId(_baseType);
      }
    }
    return _switchResult;
  }
  
  public String moduleName(final FeatureType featureType) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (featureType instanceof EntitiesFeature) {
        _matched=true;
        Entities _type = ((EntitiesFeature) featureType).getType();
        _switchResult = this.moduleName(_type);
      }
    }
    if (!_matched) {
      if (featureType instanceof GenericListFeature) {
        _matched=true;
        FeatureType _baseType = this.baseType(((GenericListFeature) featureType));
        _switchResult = this.moduleName(_baseType);
      }
    }
    return _switchResult;
  }
  
  public String version(final FeatureType featureType) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (featureType instanceof EntitiesFeature) {
        _matched=true;
        Entities _type = ((EntitiesFeature) featureType).getType();
        _switchResult = this.version(_type);
      }
    }
    if (!_matched) {
      if (featureType instanceof GenericListFeature) {
        _matched=true;
        FeatureType _baseType = this.baseType(((GenericListFeature) featureType));
        _switchResult = this.version(_baseType);
      }
    }
    return _switchResult;
  }
  
  public String declaration(final FeatureType featureType) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (featureType instanceof EntitiesFeature) {
        _matched=true;
        Entities _type = ((EntitiesFeature) featureType).getType();
        _switchResult = this.qualifiedClassName(_type);
      }
    }
    if (!_matched) {
      if (featureType instanceof PrimitiveFeature) {
        _matched=true;
        PrimitiveType _type = ((PrimitiveFeature) featureType).getType();
        _switchResult = this.qualifiedClassName(_type);
      }
    }
    if (!_matched) {
      if (featureType instanceof GenericListFeature) {
        _matched=true;
        FeatureType _type = ((GenericListFeature) featureType).getType();
        String _declaration = this.declaration(_type);
        String _plus = ("java.util.List<" + _declaration);
        _switchResult = (_plus + ">");
      }
    }
    return _switchResult;
  }
  
  /**
   * Comment
   */
  public String clean(final Comment comment) {
    String _value = comment.getValue();
    String _replace = _value.replace("# ", "");
    return _replace.replace("#", "");
  }
  
  /**
   * GenericListFeature
   */
  public int depthToBaseType(final GenericListFeature generic) {
    int _xifexpression = (int) 0;
    FeatureType _type = generic.getType();
    if ((_type instanceof GenericListFeature)) {
      FeatureType _type_1 = generic.getType();
      int _depthToBaseType = this.depthToBaseType(((GenericListFeature) _type_1));
      _xifexpression = (1 + _depthToBaseType);
    } else {
      _xifexpression = 1;
    }
    return _xifexpression;
  }
  
  public FeatureType baseType(final GenericListFeature generic) {
    FeatureType _xifexpression = null;
    FeatureType _type = generic.getType();
    if ((_type instanceof GenericListFeature)) {
      FeatureType _type_1 = generic.getType();
      _xifexpression = this.baseType(((GenericListFeature) _type_1));
    } else {
      _xifexpression = generic.getType();
    }
    return _xifexpression;
  }
  
  public String declarationAtDepth(final GenericListFeature generic, final int i) {
    String _xifexpression = null;
    if ((i == 0)) {
      _xifexpression = this.declaration(generic);
    } else {
      String _xifexpression_1 = null;
      FeatureType _type = generic.getType();
      if ((_type instanceof GenericListFeature)) {
        FeatureType _type_1 = generic.getType();
        _xifexpression_1 = this.declarationAtDepth(((GenericListFeature) _type_1), (i - 1));
      } else {
        FeatureType _type_2 = generic.getType();
        _xifexpression_1 = this.declaration(_type_2);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String createAtDepth(final GenericListFeature generic, final int i) {
    String _xifexpression = null;
    if ((i == 0)) {
      FeatureType _type = generic.getType();
      String _declaration = this.declaration(_type);
      String _plus = ("new java.util.LinkedList<" + _declaration);
      _xifexpression = (_plus + ">()");
    } else {
      FeatureType _type_1 = generic.getType();
      _xifexpression = this.createAtDepth(((GenericListFeature) _type_1), (i - 1));
    }
    return _xifexpression;
  }
  
  public HashSet<Utils.Dependency> moduleDependencies(final Architecture architecture) {
    HashSet<Utils.Dependency> dependencies = new HashSet<Utils.Dependency>();
    HashSet<Utils.Dependency> _modelDependencies = this.modelDependencies(architecture);
    dependencies.addAll(_modelDependencies);
    HashSet<Utils.Dependency> _serviceModelDependencies = this.serviceModelDependencies(architecture);
    dependencies.addAll(_serviceModelDependencies);
    HashSet<Utils.Dependency> _serviceExceptionDependencies = this.serviceExceptionDependencies(architecture);
    dependencies.addAll(_serviceExceptionDependencies);
    return dependencies;
  }
  
  public HashSet<Utils.Dependency> modelDependencies(final Architecture architecture) {
    HashSet<Utils.Dependency> dependencies = new HashSet<Utils.Dependency>();
    Module _module = architecture.getModule();
    Model _model = _module.getModel();
    boolean _notEquals = (!Objects.equal(_model, null));
    if (_notEquals) {
      Module _module_1 = architecture.getModule();
      Model _model_1 = _module_1.getModel();
      EList<Entities> _entities = _model_1.getEntities();
      Iterable<Entity> _filter = Iterables.<Entity>filter(_entities, Entity.class);
      for (final Entity entity : _filter) {
        EList<Feature> _features = entity.getFeatures();
        for (final Feature f : _features) {
          FeatureType _type = f.getType();
          if ((_type instanceof EntitiesFeature)) {
            boolean _or = false;
            FeatureType _type_1 = f.getType();
            String _applicationId = this.applicationId(_type_1);
            String _applicationId_1 = this.applicationId(architecture);
            boolean _equals = _applicationId.equals(_applicationId_1);
            boolean _not = (!_equals);
            if (_not) {
              _or = true;
            } else {
              FeatureType _type_2 = f.getType();
              String _moduleName = this.moduleName(_type_2);
              String _moduleName_1 = this.moduleName(architecture);
              boolean _equals_1 = _moduleName.equals(_moduleName_1);
              boolean _not_1 = (!_equals_1);
              _or = _not_1;
            }
            if (_or) {
              Utils.Dependency dependency = new Utils.Dependency();
              FeatureType _type_3 = f.getType();
              String _applicationId_2 = this.applicationId(_type_3);
              dependency.applicationId = _applicationId_2;
              FeatureType _type_4 = f.getType();
              String _moduleName_2 = this.moduleName(_type_4);
              dependency.moduleName = _moduleName_2;
              FeatureType _type_5 = f.getType();
              String _version = this.version(_type_5);
              dependency.version = _version;
              dependencies.add(dependency);
            }
          } else {
            boolean _and = false;
            FeatureType _type_6 = f.getType();
            if (!(_type_6 instanceof GenericListFeature)) {
              _and = false;
            } else {
              FeatureType _type_7 = f.getType();
              FeatureType _baseType = this.baseType(((GenericListFeature) _type_7));
              _and = (_baseType instanceof EntitiesFeature);
            }
            if (_and) {
              boolean _or_1 = false;
              FeatureType _type_8 = f.getType();
              String _applicationId_3 = this.applicationId(_type_8);
              String _applicationId_4 = this.applicationId(architecture);
              boolean _equals_2 = _applicationId_3.equals(_applicationId_4);
              boolean _not_2 = (!_equals_2);
              if (_not_2) {
                _or_1 = true;
              } else {
                FeatureType _type_9 = f.getType();
                String _moduleName_3 = this.moduleName(_type_9);
                String _moduleName_4 = this.moduleName(architecture);
                boolean _equals_3 = _moduleName_3.equals(_moduleName_4);
                boolean _not_3 = (!_equals_3);
                _or_1 = _not_3;
              }
              if (_or_1) {
                Utils.Dependency dependency_1 = new Utils.Dependency();
                FeatureType _type_10 = f.getType();
                String _applicationId_5 = this.applicationId(_type_10);
                dependency_1.applicationId = _applicationId_5;
                FeatureType _type_11 = f.getType();
                String _moduleName_5 = this.moduleName(_type_11);
                dependency_1.moduleName = _moduleName_5;
                FeatureType _type_12 = f.getType();
                String _version_1 = this.version(_type_12);
                dependency_1.version = _version_1;
                dependencies.add(dependency_1);
              }
            }
          }
        }
      }
    }
    return dependencies;
  }
  
  public HashSet<Utils.Dependency> serviceModelDependencies(final Architecture architecture) {
    HashSet<Utils.Dependency> dependencies = new HashSet<Utils.Dependency>();
    Module _module = architecture.getModule();
    EList<Service> _services = _module.getServices();
    for (final Service service : _services) {
      EList<Operation> _operations = service.getOperations();
      for (final Operation operation : _operations) {
        {
          EList<Feature> _featuresInput = operation.getFeaturesInput();
          for (final Feature f : _featuresInput) {
            FeatureType _type = f.getType();
            if ((_type instanceof EntitiesFeature)) {
              boolean _or = false;
              FeatureType _type_1 = f.getType();
              String _applicationId = this.applicationId(_type_1);
              String _applicationId_1 = this.applicationId(architecture);
              boolean _equals = _applicationId.equals(_applicationId_1);
              boolean _not = (!_equals);
              if (_not) {
                _or = true;
              } else {
                FeatureType _type_2 = f.getType();
                String _moduleName = this.moduleName(_type_2);
                String _moduleName_1 = this.moduleName(architecture);
                boolean _equals_1 = _moduleName.equals(_moduleName_1);
                boolean _not_1 = (!_equals_1);
                _or = _not_1;
              }
              if (_or) {
                Utils.Dependency dependency = new Utils.Dependency();
                FeatureType _type_3 = f.getType();
                String _applicationId_2 = this.applicationId(_type_3);
                dependency.applicationId = _applicationId_2;
                FeatureType _type_4 = f.getType();
                String _moduleName_2 = this.moduleName(_type_4);
                dependency.moduleName = _moduleName_2;
                FeatureType _type_5 = f.getType();
                String _version = this.version(_type_5);
                dependency.version = _version;
                dependencies.add(dependency);
              }
            } else {
              boolean _and = false;
              FeatureType _type_6 = f.getType();
              if (!(_type_6 instanceof GenericListFeature)) {
                _and = false;
              } else {
                FeatureType _type_7 = f.getType();
                FeatureType _baseType = this.baseType(((GenericListFeature) _type_7));
                _and = (_baseType instanceof EntitiesFeature);
              }
              if (_and) {
                boolean _or_1 = false;
                FeatureType _type_8 = f.getType();
                String _applicationId_3 = this.applicationId(_type_8);
                String _applicationId_4 = this.applicationId(architecture);
                boolean _equals_2 = _applicationId_3.equals(_applicationId_4);
                boolean _not_2 = (!_equals_2);
                if (_not_2) {
                  _or_1 = true;
                } else {
                  FeatureType _type_9 = f.getType();
                  String _moduleName_3 = this.moduleName(_type_9);
                  String _moduleName_4 = this.moduleName(architecture);
                  boolean _equals_3 = _moduleName_3.equals(_moduleName_4);
                  boolean _not_3 = (!_equals_3);
                  _or_1 = _not_3;
                }
                if (_or_1) {
                  Utils.Dependency dependency_1 = new Utils.Dependency();
                  FeatureType _type_10 = f.getType();
                  String _applicationId_5 = this.applicationId(_type_10);
                  dependency_1.applicationId = _applicationId_5;
                  FeatureType _type_11 = f.getType();
                  String _moduleName_5 = this.moduleName(_type_11);
                  dependency_1.moduleName = _moduleName_5;
                  FeatureType _type_12 = f.getType();
                  String _version_1 = this.version(_type_12);
                  dependency_1.version = _version_1;
                  dependencies.add(dependency_1);
                }
              }
            }
          }
          EList<Feature> _featuresOutput = operation.getFeaturesOutput();
          for (final Feature f_1 : _featuresOutput) {
            FeatureType _type_13 = f_1.getType();
            if ((_type_13 instanceof EntitiesFeature)) {
              boolean _or_2 = false;
              FeatureType _type_14 = f_1.getType();
              String _applicationId_6 = this.applicationId(_type_14);
              String _applicationId_7 = this.applicationId(architecture);
              boolean _equals_4 = _applicationId_6.equals(_applicationId_7);
              boolean _not_4 = (!_equals_4);
              if (_not_4) {
                _or_2 = true;
              } else {
                FeatureType _type_15 = f_1.getType();
                String _moduleName_6 = this.moduleName(_type_15);
                String _moduleName_7 = this.moduleName(architecture);
                boolean _equals_5 = _moduleName_6.equals(_moduleName_7);
                boolean _not_5 = (!_equals_5);
                _or_2 = _not_5;
              }
              if (_or_2) {
                Utils.Dependency dependency_2 = new Utils.Dependency();
                FeatureType _type_16 = f_1.getType();
                String _applicationId_8 = this.applicationId(_type_16);
                dependency_2.applicationId = _applicationId_8;
                FeatureType _type_17 = f_1.getType();
                String _moduleName_8 = this.moduleName(_type_17);
                dependency_2.moduleName = _moduleName_8;
                FeatureType _type_18 = f_1.getType();
                String _version_2 = this.version(_type_18);
                dependency_2.version = _version_2;
                dependencies.add(dependency_2);
              }
            } else {
              boolean _and_1 = false;
              FeatureType _type_19 = f_1.getType();
              if (!(_type_19 instanceof GenericListFeature)) {
                _and_1 = false;
              } else {
                FeatureType _type_20 = f_1.getType();
                FeatureType _baseType_1 = this.baseType(((GenericListFeature) _type_20));
                _and_1 = (_baseType_1 instanceof EntitiesFeature);
              }
              if (_and_1) {
                boolean _or_3 = false;
                FeatureType _type_21 = f_1.getType();
                String _applicationId_9 = this.applicationId(_type_21);
                String _applicationId_10 = this.applicationId(architecture);
                boolean _equals_6 = _applicationId_9.equals(_applicationId_10);
                boolean _not_6 = (!_equals_6);
                if (_not_6) {
                  _or_3 = true;
                } else {
                  FeatureType _type_22 = f_1.getType();
                  String _moduleName_9 = this.moduleName(_type_22);
                  String _moduleName_10 = this.moduleName(architecture);
                  boolean _equals_7 = _moduleName_9.equals(_moduleName_10);
                  boolean _not_7 = (!_equals_7);
                  _or_3 = _not_7;
                }
                if (_or_3) {
                  Utils.Dependency dependency_3 = new Utils.Dependency();
                  FeatureType _type_23 = f_1.getType();
                  String _applicationId_11 = this.applicationId(_type_23);
                  dependency_3.applicationId = _applicationId_11;
                  FeatureType _type_24 = f_1.getType();
                  String _moduleName_11 = this.moduleName(_type_24);
                  dependency_3.moduleName = _moduleName_11;
                  FeatureType _type_25 = f_1.getType();
                  String _version_3 = this.version(_type_25);
                  dependency_3.version = _version_3;
                  dependencies.add(dependency_3);
                }
              }
            }
          }
        }
      }
    }
    return dependencies;
  }
  
  public HashSet<Utils.Dependency> serviceExceptionDependencies(final Architecture architecture) {
    HashSet<Utils.Dependency> dependencies = new HashSet<Utils.Dependency>();
    Module _module = architecture.getModule();
    EList<Service> _services = _module.getServices();
    for (final Service service : _services) {
      EList<Operation> _operations = service.getOperations();
      for (final Operation operation : _operations) {
        EList<com.mguidi.soa.soa.Exception> _exceptionts = operation.getExceptionts();
        for (final com.mguidi.soa.soa.Exception exception : _exceptionts) {
          boolean _or = false;
          String _applicationId = this.applicationId(exception);
          String _applicationId_1 = this.applicationId(architecture);
          boolean _equals = _applicationId.equals(_applicationId_1);
          boolean _not = (!_equals);
          if (_not) {
            _or = true;
          } else {
            String _moduleName = this.moduleName(exception);
            String _moduleName_1 = this.moduleName(architecture);
            boolean _equals_1 = _moduleName.equals(_moduleName_1);
            boolean _not_1 = (!_equals_1);
            _or = _not_1;
          }
          if (_or) {
            Utils.Dependency dependency = new Utils.Dependency();
            String _applicationId_2 = this.applicationId(exception);
            dependency.applicationId = _applicationId_2;
            String _moduleName_2 = this.moduleName(exception);
            dependency.moduleName = _moduleName_2;
            String _version = this.version(exception);
            dependency.version = _version;
            dependencies.add(dependency);
          }
        }
      }
    }
    return dependencies;
  }
  
  public LinkedList<Architecture> architectureOrder(final Set<Resource> resources) {
    LinkedList<Architecture> queue = new LinkedList<Architecture>();
    for (final Resource resource : resources) {
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      queue.add(((Architecture) _get));
    }
    LinkedList<Utils.Dependency> repository = new LinkedList<Utils.Dependency>();
    LinkedList<Architecture> architectures = new LinkedList<Architecture>();
    while ((queue.size() > 0)) {
      {
        Architecture architecture = queue.remove(0);
        HashSet<Utils.Dependency> _moduleDependencies = this.moduleDependencies(architecture);
        boolean _checkDependency = this.checkDependency(_moduleDependencies, repository);
        boolean _not = (!_checkDependency);
        if (_not) {
          queue.add(architecture);
        } else {
          Utils.Dependency dependency = new Utils.Dependency();
          String _applicationId = this.applicationId(architecture);
          dependency.applicationId = _applicationId;
          String _moduleName = this.moduleName(architecture);
          dependency.moduleName = _moduleName;
          String _version = this.version(architecture);
          dependency.version = _version;
          repository.add(dependency);
          architectures.add(architecture);
        }
      }
    }
    return architectures;
  }
  
  public boolean checkDependency(final Collection<Utils.Dependency> dependencies, final Collection<Utils.Dependency> repository) {
    for (final Utils.Dependency dependency : dependencies) {
      boolean _contains = repository.contains(dependency);
      boolean _not = (!_contains);
      if (_not) {
        return false;
      }
    }
    return true;
  }
}
