package com.mguidi.soa.generator.swift.jsonhelper;

import com.mguidi.soa.generator.swift.Utils;
import com.mguidi.soa.soa.Entities;
import com.mguidi.soa.soa.Operation;

@SuppressWarnings("all")
public class JsonUtils extends Utils {
  /**
   * Entity Json Helper
   */
  public String classNameHelper(final Entities entity) {
    String _className = this.className(entity);
    return (_className + "Helper");
  }
  
  public String classNameOutputHelper(final Operation operation) {
    String _classNameOutput = this.classNameOutput(operation);
    return (_classNameOutput + "Helper");
  }
  
  public String classNameInputHelper(final Operation operation) {
    String _classNameInput = this.classNameInput(operation);
    return (_classNameInput + "Helper");
  }
}
