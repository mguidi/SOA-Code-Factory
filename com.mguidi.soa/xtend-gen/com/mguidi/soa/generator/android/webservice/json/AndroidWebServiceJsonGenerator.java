package com.mguidi.soa.generator.android.webservice.json;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mguidi.soa.generator.android.webservice.json.ClientJsonGenerator;
import com.mguidi.soa.generator.android.webservice.json.GradleBuildGenerator;
import com.mguidi.soa.generator.android.webservice.json.ManifestGenerator;
import com.mguidi.soa.generator.java.Beautifier;
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils;
import com.mguidi.soa.generator.java.webservice.json.OperationInputJsonHelperGenerator;
import com.mguidi.soa.generator.java.webservice.json.OperationOutputJsonHelperGenerator;
import com.mguidi.soa.soa.Architecture;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.Operation;
import com.mguidi.soa.soa.Service;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class AndroidWebServiceJsonGenerator implements IGenerator {
  @Inject
  @Extension
  private JsonUtils utils;
  
  @Inject
  @Extension
  private ClientJsonGenerator clientJsonGenerator;
  
  @Inject
  @Extension
  private OperationOutputJsonHelperGenerator operationOutputJsonHelperGenerator;
  
  @Inject
  @Extension
  private OperationInputJsonHelperGenerator operationInputJsonHelperGenerator;
  
  @Inject
  @Extension
  private Beautifier beautifier;
  
  @Inject
  @Extension
  private GradleBuildGenerator gradleBuildGenerator;
  
  @Inject
  @Extension
  private ManifestGenerator manifestGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Service> _filter = Iterables.<Service>filter(_iterable, Service.class);
    List<Service> services = IterableExtensions.<Service>toList(_filter);
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
    Iterable<Operation> _filter_1 = Iterables.<Operation>filter(_iterable_1, Operation.class);
    List<Operation> operations = IterableExtensions.<Operation>toList(_filter_1);
    TreeIterator<EObject> _allContents_2 = resource.getAllContents();
    Iterable<EObject> _iterable_2 = IteratorExtensions.<EObject>toIterable(_allContents_2);
    Iterable<Architecture> _filter_2 = Iterables.<Architecture>filter(_iterable_2, Architecture.class);
    for (final Architecture e : _filter_2) {
      boolean _or = false;
      int _size = services.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _or = true;
      } else {
        int _size_1 = operations.size();
        boolean _greaterThan_1 = (_size_1 > 0);
        _or = _greaterThan_1;
      }
      if (_or) {
        String _version = this.utils.version(e);
        String _plus = ("android/" + _version);
        String _plus_1 = (_plus + "/service-json/");
        String _moduleName = this.utils.moduleName(e);
        String _plus_2 = (_plus_1 + _moduleName);
        String _plus_3 = (_plus_2 + "/build.gradle");
        CharSequence _generateBuildServiceJson = this.gradleBuildGenerator.generateBuildServiceJson(e, resource);
        fsa.generateFile(_plus_3, _generateBuildServiceJson);
        String _version_1 = this.utils.version(e);
        String _plus_4 = ("android/" + _version_1);
        String _plus_5 = (_plus_4 + "/service-json/");
        String _moduleName_1 = this.utils.moduleName(e);
        String _plus_6 = (_plus_5 + _moduleName_1);
        String _plus_7 = (_plus_6 + "/src/main/AndroidManifest.xml");
        CharSequence _generateManifestServiceJson = this.manifestGenerator.generateManifestServiceJson(e);
        fsa.generateFile(_plus_7, _generateManifestServiceJson);
      }
    }
    for (final Service e_1 : services) {
      String _version_2 = this.utils.version(e_1);
      String _plus_8 = ("android/" + _version_2);
      String _plus_9 = (_plus_8 + "/service-json/");
      String _moduleName_2 = this.utils.moduleName(e_1);
      String _plus_10 = (_plus_9 + _moduleName_2);
      String _plus_11 = (_plus_10 + "/src/main/java/");
      String _qualifiedClassNameClient = this.utils.qualifiedClassNameClient(e_1);
      String _replace = _qualifiedClassNameClient.replace(".", "/");
      String _plus_12 = (_plus_11 + _replace);
      String _plus_13 = (_plus_12 + ".java");
      CharSequence _generateClient = this.clientJsonGenerator.generateClient(e_1);
      CharSequence _format = this.beautifier.format(_generateClient);
      fsa.generateFile(_plus_13, _format);
    }
    for (final Operation e_2 : operations) {
      {
        EList<Feature> _featuresOutput = e_2.getFeaturesOutput();
        int _size_2 = _featuresOutput.size();
        boolean _greaterThan_2 = (_size_2 > 0);
        if (_greaterThan_2) {
          String _version_3 = this.utils.version(e_2);
          String _plus_14 = ("android/" + _version_3);
          String _plus_15 = (_plus_14 + "/service-json/");
          String _moduleName_3 = this.utils.moduleName(e_2);
          String _plus_16 = (_plus_15 + _moduleName_3);
          String _plus_17 = (_plus_16 + "/src/main/java/");
          String _qualifiedClassNameOutputHelper = this.utils.qualifiedClassNameOutputHelper(e_2);
          String _replace_1 = _qualifiedClassNameOutputHelper.replace(".", "/");
          String _plus_18 = (_plus_17 + _replace_1);
          String _plus_19 = (_plus_18 + ".java");
          CharSequence _generateJsonHelper = this.operationOutputJsonHelperGenerator.generateJsonHelper(e_2);
          CharSequence _format_1 = this.beautifier.format(_generateJsonHelper);
          fsa.generateFile(_plus_19, _format_1);
        }
        EList<Feature> _featuresInput = e_2.getFeaturesInput();
        int _size_3 = _featuresInput.size();
        boolean _greaterThan_3 = (_size_3 > 0);
        if (_greaterThan_3) {
          String _version_4 = this.utils.version(e_2);
          String _plus_20 = ("android/" + _version_4);
          String _plus_21 = (_plus_20 + "/service-json/");
          String _moduleName_4 = this.utils.moduleName(e_2);
          String _plus_22 = (_plus_21 + _moduleName_4);
          String _plus_23 = (_plus_22 + "/src/main/java/");
          String _qualifiedClassNameInputHelper = this.utils.qualifiedClassNameInputHelper(e_2);
          String _replace_2 = _qualifiedClassNameInputHelper.replace(".", "/");
          String _plus_24 = (_plus_23 + _replace_2);
          String _plus_25 = (_plus_24 + ".java");
          CharSequence _generateJsonHelper_1 = this.operationInputJsonHelperGenerator.generateJsonHelper(e_2);
          CharSequence _format_2 = this.beautifier.format(_generateJsonHelper_1);
          fsa.generateFile(_plus_25, _format_2);
        }
      }
    }
  }
}
