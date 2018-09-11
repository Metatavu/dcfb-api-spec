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
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/InternalServerError', 'model/Location'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/Location'));
  } else {
    // Browser globals (root is window)
    if (!root.DcfbApiClient) {
      root.DcfbApiClient = {};
    }
    root.DcfbApiClient.LocationsApi = factory(root.DcfbApiClient.ApiClient, root.DcfbApiClient.BadRequest, root.DcfbApiClient.Forbidden, root.DcfbApiClient.InternalServerError, root.DcfbApiClient.Location);
  }
}(this, function(ApiClient, BadRequest, Forbidden, InternalServerError, Location) {
  'use strict';

  /**
   * Locations service.
   * @module api/LocationsApi
   * @version 0.0.33
   */

  /**
   * Constructs a new LocationsApi. 
   * @alias module:api/LocationsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Create location
     * Create location
     * @param {module:model/Location} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Location} and HTTP response
     */
    this.createLocationWithHttpInfo = function(payload) {
      var postBody = payload;

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling createLocation");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearer'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = Location;

      return this.apiClient.callApi(
        '/locations', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Create location
     * Create location
     * @param {module:model/Location} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Location}
     */
    this.createLocation = function(payload) {
      return this.createLocationWithHttpInfo(payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * deletes an location
     * Delete location
     * @param {String} locationId Location id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    this.deleteLocationWithHttpInfo = function(locationId) {
      var postBody = null;

      // verify the required parameter 'locationId' is set
      if (locationId === undefined || locationId === null) {
        throw new Error("Missing the required parameter 'locationId' when calling deleteLocation");
      }


      var pathParams = {
        'locationId': locationId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearer'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = null;

      return this.apiClient.callApi(
        '/locations/{locationId}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * deletes an location
     * Delete location
     * @param {String} locationId Location id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    this.deleteLocation = function(locationId) {
      return this.deleteLocationWithHttpInfo(locationId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds an location
     * Find location
     * @param {String} locationId Location id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Location} and HTTP response
     */
    this.findLocationWithHttpInfo = function(locationId) {
      var postBody = null;

      // verify the required parameter 'locationId' is set
      if (locationId === undefined || locationId === null) {
        throw new Error("Missing the required parameter 'locationId' when calling findLocation");
      }


      var pathParams = {
        'locationId': locationId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearer'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = Location;

      return this.apiClient.callApi(
        '/locations/{locationId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds an location
     * Find location
     * @param {String} locationId Location id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Location}
     */
    this.findLocation = function(locationId) {
      return this.findLocationWithHttpInfo(locationId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * List locations
     * List locations
     * @param {Object} opts Optional parameters
     * @param {String} opts.search Search by free-text query
     * @param {String} opts.slug Filter by location slug
     * @param {Array.<String>} opts.sort Sort results. See LocationListSort for sort options
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/Location>} and HTTP response
     */
    this.listLocationsWithHttpInfo = function(opts) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'search': opts['search'],
        'slug': opts['slug'],
        'firstResult': opts['firstResult'],
        'maxResults': opts['maxResults'],
      };
      var collectionQueryParams = {
        'sort': {
          value: opts['sort'],
          collectionFormat: 'csv'
        },
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearer'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [Location];

      return this.apiClient.callApi(
        '/locations', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * List locations
     * List locations
     * @param {Object} opts Optional parameters
     * @param {String} opts.search Search by free-text query
     * @param {String} opts.slug Filter by location slug
     * @param {Array.<String>} opts.sort Sort results. See LocationListSort for sort options
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Location>}
     */
    this.listLocations = function(opts) {
      return this.listLocationsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * updates an location
     * Update location
     * @param {String} locationId Location id
     * @param {module:model/Location} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Location} and HTTP response
     */
    this.updateLocationWithHttpInfo = function(locationId, payload) {
      var postBody = payload;

      // verify the required parameter 'locationId' is set
      if (locationId === undefined || locationId === null) {
        throw new Error("Missing the required parameter 'locationId' when calling updateLocation");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling updateLocation");
      }


      var pathParams = {
        'locationId': locationId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearer'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = Location;

      return this.apiClient.callApi(
        '/locations/{locationId}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * updates an location
     * Update location
     * @param {String} locationId Location id
     * @param {module:model/Location} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Location}
     */
    this.updateLocation = function(locationId, payload) {
      return this.updateLocationWithHttpInfo(locationId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
