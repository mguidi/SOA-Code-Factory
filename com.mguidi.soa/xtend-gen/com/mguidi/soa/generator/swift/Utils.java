package com.mguidi.soa.generator.swift;

import com.mguidi.soa.soa.Architecture;
import com.mguidi.soa.soa.Comment;
import com.mguidi.soa.soa.Entities;
import com.mguidi.soa.soa.EntitiesFeature;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.FeatureType;
import com.mguidi.soa.soa.GenericListFeature;
import com.mguidi.soa.soa.Module;
import com.mguidi.soa.soa.Operation;
import com.mguidi.soa.soa.PrimitiveFeature;
import com.mguidi.soa.soa.PrimitiveType;
import com.mguidi.soa.soa.Service;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Utils {
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
  public String className(final Entities entity) {
    String _moduleName = this.moduleName(entity);
    String _firstUpper = StringExtensions.toFirstUpper(_moduleName);
    String _name = entity.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + _firstUpper_1);
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
  public String className(final Service service) {
    String _moduleName = this.moduleName(service);
    String _firstUpper = StringExtensions.toFirstUpper(_moduleName);
    String _name = service.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + _firstUpper_1);
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
  
  public String classNameClient(final Service service) {
    String _moduleName = this.moduleName(service);
    String _firstUpper = StringExtensions.toFirstUpper(_moduleName);
    String _name = service.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + _firstUpper_1);
    return (_plus + "Client");
  }
  
  /**
   * Operation
   */
  public String signature(final Operation operation) {
    String _name = operation.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  public String input(final Operation operation) {
    String text = "";
    EList<Feature> _featuresInput = operation.getFeaturesInput();
    for (final Feature f : _featuresInput) {
      String _text = text;
      String _name = f.getName();
      String _plus = (_name + " : ");
      FeatureType _type = f.getType();
      String _declaration = this.declaration(_type);
      String _plus_1 = (_plus + _declaration);
      String _plus_2 = (_plus_1 + ", ");
      text = (_text + _plus_2);
    }
    return text;
  }
  
  public String classNameOutput(final Operation operation) {
    String _moduleName = this.moduleName(operation);
    String _firstUpper = StringExtensions.toFirstUpper(_moduleName);
    EObject _eContainer = operation.eContainer();
    String _name = ((Service) _eContainer).getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + _firstUpper_1);
    String _name_1 = operation.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_1);
    String _plus_1 = (_plus + _firstUpper_2);
    return (_plus_1 + "Output");
  }
  
  public String classNameInput(final Operation operation) {
    String _moduleName = this.moduleName(operation);
    String _firstUpper = StringExtensions.toFirstUpper(_moduleName);
    EObject _eContainer = operation.eContainer();
    String _name = ((Service) _eContainer).getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + _firstUpper_1);
    String _name_1 = operation.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_1);
    String _plus_1 = (_plus + _firstUpper_2);
    return (_plus_1 + "Input");
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
   * PrimitiveType
   */
  public String className(final PrimitiveType type) {
    String _switchResult = null;
    if (type != null) {
      switch (type) {
        case BOOLEAN:
          _switchResult = "Bool";
          break;
        case BYTE:
          _switchResult = "Byte";
          break;
        case DATE:
          _switchResult = "NSDate";
          break;
        case DATETIME:
          _switchResult = "NSDate";
          break;
        case DECIMAL:
          _switchResult = "NSDecimalNumber";
          break;
        case DOUBLE:
          _switchResult = "Double";
          break;
        case FLOAT:
          _switchResult = "Float";
          break;
        case INTEGER:
          _switchResult = "Int";
          break;
        case LONG:
          _switchResult = "CLong";
          break;
        case SHORT:
          _switchResult = "CShort";
          break;
        case STRING:
          _switchResult = "String";
          break;
        case TIMESTAMP:
          _switchResult = "NSDate";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  /**
   * Feature
   */
  public String key(final Feature feature) {
    String _name = feature.getName();
    return _name.toUpperCase();
  }
  
  /**
   * FeatureType
   */
  public String declaration(final FeatureType featureType) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (featureType instanceof EntitiesFeature) {
        _matched=true;
        Entities _type = ((EntitiesFeature) featureType).getType();
        _switchResult = this.className(_type);
      }
    }
    if (!_matched) {
      if (featureType instanceof PrimitiveFeature) {
        _matched=true;
        PrimitiveType _type = ((PrimitiveFeature) featureType).getType();
        _switchResult = this.className(_type);
      }
    }
    if (!_matched) {
      if (featureType instanceof GenericListFeature) {
        _matched=true;
        FeatureType _type = ((GenericListFeature) featureType).getType();
        String _declaration = this.declaration(_type);
        String _plus = ("Array<" + _declaration);
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
}
