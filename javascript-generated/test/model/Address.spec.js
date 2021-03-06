/**
 * DCFB API
 * API spec for DCFB API.
 *
 * OpenAPI spec version: 0.0.1
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.0-SNAPSHOT
 *
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
    factory(root.expect, root.DcfbApiClient);
  }
}(this, function(expect, DcfbApiClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new DcfbApiClient.Address();
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

  describe('Address', function() {
    it('should create an instance of Address', function() {
      // uncomment below and update the code to test Address
      //var instane = new DcfbApiClient.Address();
      //expect(instance).to.be.a(DcfbApiClient.Address);
    });

    it('should have the property streetAddress (base name: "streetAddress")', function() {
      // uncomment below and update the code to test the property streetAddress
      //var instane = new DcfbApiClient.Address();
      //expect(instance).to.be();
    });

    it('should have the property postalCode (base name: "postalCode")', function() {
      // uncomment below and update the code to test the property postalCode
      //var instane = new DcfbApiClient.Address();
      //expect(instance).to.be();
    });

    it('should have the property postOffice (base name: "postOffice")', function() {
      // uncomment below and update the code to test the property postOffice
      //var instane = new DcfbApiClient.Address();
      //expect(instance).to.be();
    });

    it('should have the property country (base name: "country")', function() {
      // uncomment below and update the code to test the property country
      //var instane = new DcfbApiClient.Address();
      //expect(instance).to.be();
    });

    it('should have the property additionalInformations (base name: "additionalInformations")', function() {
      // uncomment below and update the code to test the property additionalInformations
      //var instane = new DcfbApiClient.Address();
      //expect(instance).to.be();
    });

  });

}));
