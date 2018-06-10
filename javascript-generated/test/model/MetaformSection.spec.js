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
    instance = new MetaformApiClient.MetaformSection();
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

  describe('MetaformSection', function() {
    it('should create an instance of MetaformSection', function() {
      // uncomment below and update the code to test MetaformSection
      //var instane = new MetaformApiClient.MetaformSection();
      //expect(instance).to.be.a(MetaformApiClient.MetaformSection);
    });

    it('should have the property title (base name: "title")', function() {
      // uncomment below and update the code to test the property title
      //var instane = new MetaformApiClient.MetaformSection();
      //expect(instance).to.be();
    });

    it('should have the property visibleIf (base name: "visible-if")', function() {
      // uncomment below and update the code to test the property visibleIf
      //var instane = new MetaformApiClient.MetaformSection();
      //expect(instance).to.be();
    });

    it('should have the property fields (base name: "fields")', function() {
      // uncomment below and update the code to test the property fields
      //var instane = new MetaformApiClient.MetaformSection();
      //expect(instance).to.be();
    });

  });

}));
