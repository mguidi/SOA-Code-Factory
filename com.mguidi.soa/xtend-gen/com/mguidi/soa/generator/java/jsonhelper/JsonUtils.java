package com.mguidi.soa.generator.java.jsonhelper;

import com.mguidi.soa.generator.java.Utils;
import com.mguidi.soa.soa.Entities;
import com.mguidi.soa.soa.Operation;

@SuppressWarnings("all")
public class JsonUtils extends Utils {
  /**
   * Entity Json Helper
   */
  public String packageNameHelper(final Entities entity) {
    String _packageName = this.packageName(entity);
    return (_packageName + ".helper.json");
  }
  
  public String classNameHelper(final Entities entity) {
    String _className = this.className(entity);
    return (_className + "Helper");
  }
  
  public String qualifiedClassNameHelper(final Entities entity) {
    String _packageNameHelper = this.packageNameHelper(entity);
    String _plus = (_packageNameHelper + ".");
    String _classNameHelper = this.classNameHelper(entity);
    return (_plus + _classNameHelper);
  }
  
  public String packageNameOutputHelper(final Operation operation) {
    String _packageNameOutput = this.packageNameOutput(operation);
    return (_packageNameOutput + ".helper.json");
  }
  
  public String classNameOutputHelper(final Operation operation) {
    String _classNameOutput = this.classNameOutput(operation);
    return (_classNameOutput + "Helper");
  }
  
  public String qualifiedClassNameOutputHelper(final Operation operation) {
    String _packageNameOutputHelper = this.packageNameOutputHelper(operation);
    String _plus = (_packageNameOutputHelper + ".");
    String _classNameOutputHelper = this.classNameOutputHelper(operation);
    return (_plus + _classNameOutputHelper);
  }
  
  public String packageNameInputHelper(final Operation operation) {
    String _packageNameInput = this.packageNameInput(operation);
    return (_packageNameInput + ".helper.json");
  }
  
  public String classNameInputHelper(final Operation operation) {
    String _classNameInput = this.classNameInput(operation);
    return (_classNameInput + "Helper");
  }
  
  public String qualifiedClassNameInputHelper(final Operation operation) {
    String _packageNameInputHelper = this.packageNameInputHelper(operation);
    String _plus = (_packageNameInputHelper + ".");
    String _classNameInputHelper = this.classNameInputHelper(operation);
    return (_plus + _classNameInputHelper);
  }
}
