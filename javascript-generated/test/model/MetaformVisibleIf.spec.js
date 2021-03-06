/**
 * Metaform REST API
 * REST API for Metaform
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.MetaformApiClient);
  }
}(this, function(expect, MetaformApiClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new MetaformApiClient.MetaformVisibleIf();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('MetaformVisibleIf', function() {
    it('should create an instance of MetaformVisibleIf', function() {
      // uncomment below and update the code to test MetaformVisibleIf
      //var instane = new MetaformApiClient.MetaformVisibleIf();
      //expect(instance).to.be.a(MetaformApiClient.MetaformVisibleIf);
    });

    it('should have the property field (base name: "field")', function() {
      // uncomment below and update the code to test the property field
      //var instane = new MetaformApiClient.MetaformVisibleIf();
      //expect(instance).to.be();
    });

    it('should have the property equals (base name: "equals")', function() {
      // uncomment below and update the code to test the property equals
      //var instane = new MetaformApiClient.MetaformVisibleIf();
      //expect(instance).to.be();
    });

    it('should have the property notEquals (base name: "not-equals")', function() {
      // uncomment below and update the code to test the property notEquals
      //var instane = new MetaformApiClient.MetaformVisibleIf();
      //expect(instance).to.be();
    });

    it('should have the property and (base name: "and")', function() {
      // uncomment below and update the code to test the property and
      //var instane = new MetaformApiClient.MetaformVisibleIf();
      //expect(instance).to.be();
    });

    it('should have the property or (base name: "or")', function() {
      // uncomment below and update the code to test the property or
      //var instane = new MetaformApiClient.MetaformVisibleIf();
      //expect(instance).to.be();
    });

  });

}));
