package com.mguidi.soa.generator.java;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mguidi.soa.generator.java.Beautifier;
import com.mguidi.soa.generator.java.ExceptionGenerator;
import com.mguidi.soa.generator.java.GradleBuildGenerator;
import com.mguidi.soa.generator.java.InstallScriptGenerator;
import com.mguidi.soa.generator.java.ModelGenerator;
import com.mguidi.soa.generator.java.OperationInputGenerator;
import com.mguidi.soa.generator.java.OperationOutputGenerator;
import com.mguidi.soa.generator.java.ServiceGenerator;
import com.mguidi.soa.generator.java.Utils;
import com.mguidi.soa.soa.Architecture;
import com.mguidi.soa.soa.Entity;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.Operation;
import com.mguidi.soa.soa.Service;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class JavaGenerator {
  @Inject
  @Extension
  private Utils utils;
  
  @Inject
  @Extension
  private GradleBuildGenerator gradleBuildGenerator;
  
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
  
  @Inject
  @Extension
  private ExceptionGenerator exceptionGenerator;
  
  @Inject
  @Extension
  private InstallScriptGenerator installScriptGenerator;
  
  @Inject
  @Extension
  private Beautifier beautifier;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Entity> _filter = Iterables.<Entity>filter(_iterable, Entity.class);
    List<Entity> entities = IterableExtensions.<Entity>toList(_filter);
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
    Iterable<com.mguidi.soa.soa.Enum> _filter_1 = Iterables.<com.mguidi.soa.soa.Enum>filter(_iterable_1, com.mguidi.soa.soa.Enum.class);
    List<com.mguidi.soa.soa.Enum> enumerations = IterableExtensions.<com.mguidi.soa.soa.Enum>toList(_filter_1);
    TreeIterator<EObject> _allContents_2 = resource.getAllContents();
    Iterable<EObject> _iterable_2 = IteratorExtensions.<EObject>toIterable(_allContents_2);
    Iterable<Service> _filter_2 = Iterables.<Service>filter(_iterable_2, Service.class);
    List<Service> services = IterableExtensions.<Service>toList(_filter_2);
    TreeIterator<EObject> _allContents_3 = resource.getAllContents();
    Iterable<EObject> _iterable_3 = IteratorExtensions.<EObject>toIterable(_allContents_3);
    Iterable<com.mguidi.soa.soa.Exception> _filter_3 = Iterables.<com.mguidi.soa.soa.Exception>filter(_iterable_3, com.mguidi.soa.soa.Exception.class);
    List<com.mguidi.soa.soa.Exception> exceptions = IterableExtensions.<com.mguidi.soa.soa.Exception>toList(_filter_3);
    TreeIterator<EObject> _allContents_4 = resource.getAllContents();
    Iterable<EObject> _iterable_4 = IteratorExtensions.<EObject>toIterable(_allContents_4);
    Iterable<Architecture> _filter_4 = Iterables.<Architecture>filter(_iterable_4, Architecture.class);
    for (final Architecture e : _filter_4) {
      {
        boolean _or = false;
        int _size = enumerations.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          _or = true;
        } else {
          int _size_1 = entities.size();
          boolean _greaterThan_1 = (_size_1 > 0);
          _or = _greaterThan_1;
        }
        if (_or) {
          String _applicationId = this.utils.applicationId(e);
          String _plus = ("java/" + _applicationId);
          String _plus_1 = (_plus + "/");
          String _moduleName = this.utils.moduleName(e);
          String _plus_2 = (_plus_1 + _moduleName);
          String _plus_3 = (_plus_2 + "/");
          String _version = this.utils.version(e);
          String _plus_4 = (_plus_3 + _version);
          String _plus_5 = (_plus_4 + "/model/build.gradle");
          CharSequence _generateBuildModel = this.gradleBuildGenerator.generateBuildModel(e, resource);
          fsa.generateFile(_plus_5, _generateBuildModel);
        }
        boolean _or_1 = false;
        int _size_2 = services.size();
        boolean _greaterThan_2 = (_size_2 > 0);
        if (_greaterThan_2) {
          _or_1 = true;
        } else {
          int _size_3 = exceptions.size();
          boolean _greaterThan_3 = (_size_3 > 0);
          _or_1 = _greaterThan_3;
        }
        if (_or_1) {
          String _applicationId_1 = this.utils.applicationId(e);
          String _plus_6 = ("java/" + _applicationId_1);
          String _plus_7 = (_plus_6 + "/");
          String _moduleName_1 = this.utils.moduleName(e);
          String _plus_8 = (_plus_7 + _moduleName_1);
          String _plus_9 = (_plus_8 + "/");
          String _version_1 = this.utils.version(e);
          String _plus_10 = (_plus_9 + _version_1);
          String _plus_11 = (_plus_10 + "/service/build.gradle");
          CharSequence _generateBuildService = this.gradleBuildGenerator.generateBuildService(e, resource);
          fsa.generateFile(_plus_11, _generateBuildService);
        }
      }
    }
    for (final Entity e_1 : entities) {
      String _applicationId = this.utils.applicationId(e_1);
      String _plus = ("java/" + _applicationId);
      String _plus_1 = (_plus + "/");
      String _moduleName = this.utils.moduleName(e_1);
      String _plus_2 = (_plus_1 + _moduleName);
      String _plus_3 = (_plus_2 + "/");
      String _version = this.utils.version(e_1);
      String _plus_4 = (_plus_3 + _version);
      String _plus_5 = (_plus_4 + "/model/src/main/java/");
      String _qualifiedClassName = this.utils.qualifiedClassName(e_1);
      String _replace = _qualifiedClassName.replace(".", "/");
      String _plus_6 = (_plus_5 + _replace);
      String _plus_7 = (_plus_6 + ".java");
      CharSequence _generateEntity = this.modelGenerator.generateEntity(e_1);
      CharSequence _format = this.beautifier.format(_generateEntity);
      fsa.generateFile(_plus_7, _format);
    }
    for (final com.mguidi.soa.soa.Enum e_2 : enumerations) {
      String _applicationId_1 = this.utils.applicationId(e_2);
      String _plus_8 = ("java/" + _applicationId_1);
      String _plus_9 = (_plus_8 + "/");
      String _moduleName_1 = this.utils.moduleName(e_2);
      String _plus_10 = (_plus_9 + _moduleName_1);
      String _plus_11 = (_plus_10 + "/");
      String _version_1 = this.utils.version(e_2);
      String _plus_12 = (_plus_11 + _version_1);
      String _plus_13 = (_plus_12 + "/model/src/main/java/");
      String _qualifiedClassName_1 = this.utils.qualifiedClassName(e_2);
      String _replace_1 = _qualifiedClassName_1.replace(".", "/");
      String _plus_14 = (_plus_13 + _replace_1);
      String _plus_15 = (_plus_14 + ".java");
      CharSequence _generateEnum = this.modelGenerator.generateEnum(e_2);
      CharSequence _format_1 = this.beautifier.format(_generateEnum);
      fsa.generateFile(_plus_15, _format_1);
    }
    for (final Service e_3 : services) {
      EList<Operation> _operations = e_3.getOperations();
      int _size = _operations.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _applicationId_2 = this.utils.applicationId(e_3);
        String _plus_16 = ("java/" + _applicationId_2);
        String _plus_17 = (_plus_16 + "/");
        String _moduleName_2 = this.utils.moduleName(e_3);
        String _plus_18 = (_plus_17 + _moduleName_2);
        String _plus_19 = (_plus_18 + "/");
        String _version_2 = this.utils.version(e_3);
        String _plus_20 = (_plus_19 + _version_2);
        String _plus_21 = (_plus_20 + "/service/src/main/java/");
        String _qualifiedClassName_2 = this.utils.qualifiedClassName(e_3);
        String _replace_2 = _qualifiedClassName_2.replace(".", "/");
        String _plus_22 = (_plus_21 + _replace_2);
        String _plus_23 = (_plus_22 + ".java");
        CharSequence _generateService = this.serviceGenerator.generateService(e_3);
        CharSequence _format_2 = this.beautifier.format(_generateService);
        fsa.generateFile(_plus_23, _format_2);
        String _applicationId_3 = this.utils.applicationId(e_3);
        String _plus_24 = ("java/" + _applicationId_3);
        String _plus_25 = (_plus_24 + "/");
        String _moduleName_3 = this.utils.moduleName(e_3);
        String _plus_26 = (_plus_25 + _moduleName_3);
        String _plus_27 = (_plus_26 + "/");
        String _version_3 = this.utils.version(e_3);
        String _plus_28 = (_plus_27 + _version_3);
        String _plus_29 = (_plus_28 + "/service/src/main/java/");
        String _qualifiedClassNameInterface = this.utils.qualifiedClassNameInterface(e_3);
        String _replace_3 = _qualifiedClassNameInterface.replace(".", "/");
        String _plus_30 = (_plus_29 + _replace_3);
        String _plus_31 = (_plus_30 + ".java");
        CharSequence _generateServiceInterface = this.serviceGenerator.generateServiceInterface(e_3);
        CharSequence _format_3 = this.beautifier.format(_generateServiceInterface);
        fsa.generateFile(_plus_31, _format_3);
      }
    }
    TreeIterator<EObject> _allContents_5 = resource.getAllContents();
    Iterable<EObject> _iterable_5 = IteratorExtensions.<EObject>toIterable(_allContents_5);
    Iterable<Operation> _filter_5 = Iterables.<Operation>filter(_iterable_5, Operation.class);
    for (final Operation e_4 : _filter_5) {
      {
        EList<Feature> _featuresOutput = e_4.getFeaturesOutput();
        int _size_1 = _featuresOutput.size();
        boolean _greaterThan_1 = (_size_1 > 0);
        if (_greaterThan_1) {
          String _applicationId_4 = this.utils.applicationId(e_4);
          String _plus_32 = ("java/" + _applicationId_4);
          String _plus_33 = (_plus_32 + "/");
          String _moduleName_4 = this.utils.moduleName(e_4);
          String _plus_34 = (_plus_33 + _moduleName_4);
          String _plus_35 = (_plus_34 + "/");
          String _version_4 = this.utils.version(e_4);
          String _plus_36 = (_plus_35 + _version_4);
          String _plus_37 = (_plus_36 + "/service/src/main/java/");
          String _qualifiedClassNameOutput = this.utils.qualifiedClassNameOutput(e_4);
          String _replace_4 = _qualifiedClassNameOutput.replace(".", "/");
          String _plus_38 = (_plus_37 + _replace_4);
          String _plus_39 = (_plus_38 + ".java");
          CharSequence _generateOperationOutput = this.operationOutputGenerator.generateOperationOutput(e_4);
          CharSequence _format_4 = this.beautifier.format(_generateOperationOutput);
          fsa.generateFile(_plus_39, _format_4);
        }
        EList<Feature> _featuresInput = e_4.getFeaturesInput();
        int _size_2 = _featuresInput.size();
        boolean _greaterThan_2 = (_size_2 > 0);
        if (_greaterThan_2) {
          String _applicationId_5 = this.utils.applicationId(e_4);
          String _plus_40 = ("java/" + _applicationId_5);
          String _plus_41 = (_plus_40 + "/");
          String _moduleName_5 = this.utils.moduleName(e_4);
          String _plus_42 = (_plus_41 + _moduleName_5);
          String _plus_43 = (_plus_42 + "/");
          String _version_5 = this.utils.version(e_4);
          String _plus_44 = (_plus_43 + _version_5);
          String _plus_45 = (_plus_44 + "/service/src/main/java/");
          String _qualifiedClassNameInput = this.utils.qualifiedClassNameInput(e_4);
          String _replace_5 = _qualifiedClassNameInput.replace(".", "/");
          String _plus_46 = (_plus_45 + _replace_5);
          String _plus_47 = (_plus_46 + ".java");
          CharSequence _generateOperationInput = this.operationInputGenerator.generateOperationInput(e_4);
          CharSequence _format_5 = this.beautifier.format(_generateOperationInput);
          fsa.generateFile(_plus_47, _format_5);
        }
      }
    }
    for (final com.mguidi.soa.soa.Exception e_5 : exceptions) {
      String _applicationId_4 = this.utils.applicationId(e_5);
      String _plus_32 = ("java/" + _applicationId_4);
      String _plus_33 = (_plus_32 + "/");
      String _moduleName_4 = this.utils.moduleName(e_5);
      String _plus_34 = (_plus_33 + _moduleName_4);
      String _plus_35 = (_plus_34 + "/");
      String _version_4 = this.utils.version(e_5);
      String _plus_36 = (_plus_35 + _version_4);
      String _plus_37 = (_plus_36 + "/service/src/main/java/");
      String _qualifiedClassName_3 = this.utils.qualifiedClassName(e_5);
      String _replace_4 = _qualifiedClassName_3.replace(".", "/");
      String _plus_38 = (_plus_37 + _replace_4);
      String _plus_39 = (_plus_38 + ".java");
      CharSequence _generateException = this.exceptionGenerator.generateException(e_5);
      CharSequence _format_4 = this.beautifier.format(_generateException);
      fsa.generateFile(_plus_39, _format_4);
    }
  }
  
  public void doGenerate(final Set<Resource> resources, final IFileSystemAccess fsa) {
    LinkedList<Architecture> architectures = this.utils.architectureOrder(resources);
    CharSequence _generateInstallScriptModel = this.installScriptGenerator.generateInstallScriptModel(architectures);
    fsa.generateFile("java/install_model_script.sh", _generateInstallScriptModel);
    CharSequence _generateInstallScriptService = this.installScriptGenerator.generateInstallScriptService(architectures);
    fsa.generateFile("java/install_service_script.sh", _generateInstallScriptService);
  }
}
