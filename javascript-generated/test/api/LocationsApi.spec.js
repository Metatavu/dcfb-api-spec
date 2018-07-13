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
    instance = new DcfbApiClient.LocationsApi();
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

  describe('LocationsApi', function() {
    describe('createLocation', function() {
      it('should call createLocation successfully', function(done) {
        //uncomment below and update the code to test createLocation
        //instance.createLocation(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteLocation', function() {
      it('should call deleteLocation successfully', function(done) {
        //uncomment below and update the code to test deleteLocation
        //instance.deleteLocation(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('findLocation', function() {
      it('should call findLocation successfully', function(done) {
        //uncomment below and update the code to test findLocation
        //instance.findLocation(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listLocations', function() {
      it('should call listLocations successfully', function(done) {
        //uncomment below and update the code to test listLocations
        //instance.listLocations(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateLocation', function() {
      it('should call updateLocation successfully', function(done) {
        //uncomment below and update the code to test updateLocation
        //instance.updateLocation(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));