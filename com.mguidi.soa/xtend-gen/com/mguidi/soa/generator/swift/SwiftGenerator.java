package com.mguidi.soa.generator.swift;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mguidi.soa.generator.swift.ModelGenerator;
import com.mguidi.soa.generator.swift.OperationInputGenerator;
import com.mguidi.soa.generator.swift.OperationOutputGenerator;
import com.mguidi.soa.generator.swift.ServiceGenerator;
import com.mguidi.soa.generator.swift.Utils;
import com.mguidi.soa.soa.Entity;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.Operation;
import com.mguidi.soa.soa.Service;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SwiftGenerator implements IGenerator {
  @Inject
  @Extension
  private Utils utils;
  
  @Inject
  @Extension
  private ModelGenerator modelGenerator;
  
  @Inject
  @Extension
  private ServiceGenerator serviceGenerator;
  
  @Inject
  @Extension
  private OperationOutputGenerator operationOutputGenerator;
  
  @Inject
  @Extension
  private OperationInputGenerator operationInputGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Entity> _filter = Iterables.<Entity>filter(_iterable, Entity.class);
    for (final Entity e : _filter) {
      String _moduleName = this.utils.moduleName(e);
      String _plus = ("swift/commons/" + _moduleName);
      String _plus_1 = (_plus + "/");
      String _version = this.utils.version(e);
      String _plus_2 = (_plus_1 + _version);
      String _plus_3 = (_plus_2 + "/src/model/");
      String _className = this.utils.className(e);
      String _plus_4 = (_plus_3 + _className);
      String _plus_5 = (_plus_4 + ".swift");
      CharSequence _generateEntity = this.modelGenerator.generateEntity(e);
      fsa.generateFile(_plus_5, _generateEntity);
    }
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
    Iterable<com.mguidi.soa.soa.Enum> _filter_1 = Iterables.<com.mguidi.soa.soa.Enum>filter(_iterable_1, com.mguidi.soa.soa.Enum.class);
    for (final com.mguidi.soa.soa.Enum e_1 : _filter_1) {
      String _moduleName_1 = this.utils.moduleName(e_1);
      String _plus_6 = ("swift/commons/" + _moduleName_1);
      String _plus_7 = (_plus_6 + "/");
      String _version_1 = this.utils.version(e_1);
      String _plus_8 = (_plus_7 + _version_1);
      String _plus_9 = (_plus_8 + "/src/model/");
      String _className_1 = this.utils.className(e_1);
      String _plus_10 = (_plus_9 + _className_1);
      String _plus_11 = (_plus_10 + ".swift");
      CharSequence _generateEnum = this.modelGenerator.generateEnum(e_1);
      fsa.generateFile(_plus_11, _generateEnum);
    }
    TreeIterator<EObject> _allContents_2 = resource.getAllContents();
    Iterable<EObject> _iterable_2 = IteratorExtensions.<EObject>toIterable(_allContents_2);
    Iterable<Service> _filter_2 = Iterables.<Service>filter(_iterable_2, Service.class);
    for (final Service e_2 : _filter_2) {
      String _moduleName_2 = this.utils.moduleName(e_2);
      String _plus_12 = ("swift/commons/" + _moduleName_2);
      String _plus_13 = (_plus_12 + "/");
      String _version_2 = this.utils.version(e_2);
      String _plus_14 = (_plus_13 + _version_2);
      String _plus_15 = (_plus_14 + "/src/service/");
      String _className_2 = this.utils.className(e_2);
      String _plus_16 = (_plus_15 + _className_2);
      String _plus_17 = (_plus_16 + ".swift");
      CharSequence _generateService = this.serviceGenerator.generateService(e_2);
      fsa.generateFile(_plus_17, _generateService);
    }
    TreeIterator<EObject> _allContents_3 = resource.getAllContents();
    Iterable<EObject> _iterable_3 = IteratorExtensions.<EObject>toIterable(_allContents_3);
    Iterable<Operation> _filter_3 = Iterables.<Operation>filter(_iterable_3, Operation.class);
    for (final Operation e_3 : _filter_3) {
      {
        EList<Feature> _featuresOutput = e_3.getFeaturesOutput();
        int _size = _featuresOutput.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          String _moduleName_3 = this.utils.moduleName(e_3);
          String _plus_18 = ("swift/commons/" + _moduleName_3);
          String _plus_19 = (_plus_18 + "/");
          String _version_3 = this.utils.version(e_3);
          String _plus_20 = (_plus_19 + _version_3);
          String _plus_21 = (_plus_20 + "/src/service/operation/");
          String _classNameOutput = this.utils.classNameOutput(e_3);
          String _plus_22 = (_plus_21 + _classNameOutput);
          String _plus_23 = (_plus_22 + ".swift");
          CharSequence _generateOperationOutput = this.operationOutputGenerator.generateOperationOutput(e_3);
          fsa.generateFile(_plus_23, _generateOperationOutput);
        }
        EList<Feature> _featuresInput = e_3.getFeaturesInput();
        int _size_1 = _featuresInput.size();
        boolean _greaterThan_1 = (_size_1 > 0);
        if (_greaterThan_1) {
          String _moduleName_4 = this.utils.moduleName(e_3);
          String _plus_24 = ("swift/commons/" + _moduleName_4);
          String _plus_25 = (_plus_24 + "/");
          String _version_4 = this.utils.version(e_3);
          String _plus_26 = (_plus_25 + _version_4);
          String _plus_27 = (_plus_26 + "/src/service/operation/");
          String _classNameInput = this.utils.classNameInput(e_3);
          String _plus_28 = (_plus_27 + _classNameInput);
          String _plus_29 = (_plus_28 + ".swift");
          CharSequence _generateOperationInput = this.operationInputGenerator.generateOperationInput(e_3);
          fsa.generateFile(_plus_29, _generateOperationInput);
        }
      }
    }
  }
}
