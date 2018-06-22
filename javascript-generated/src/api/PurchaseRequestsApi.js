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
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/InternalServerError', 'model/PurchaseRequest'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/PurchaseRequest'));
  } else {
    // Browser globals (root is window)
    if (!root.DcfbApiClient) {
      root.DcfbApiClient = {};
    }
    root.DcfbApiClient.PurchaseRequestsApi = factory(root.DcfbApiClient.ApiClient, root.DcfbApiClient.BadRequest, root.DcfbApiClient.Forbidden, root.DcfbApiClient.InternalServerError, root.DcfbApiClient.PurchaseRequest);
  }
}(this, function(ApiClient, BadRequest, Forbidden, InternalServerError, PurchaseRequest) {
  'use strict';

  /**
   * PurchaseRequests service.
   * @module api/PurchaseRequestsApi
   * @version 0.0.22
   */

  /**
   * Constructs a new PurchaseRequestsApi. 
   * @alias module:api/PurchaseRequestsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Create purchase request
     * Create purchase request
     * @param {module:model/PurchaseRequest} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PurchaseRequest} and HTTP response
     */
    this.createPurchaseRequestWithHttpInfo = function(payload) {
      var postBody = payload;

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling createPurchaseRequest");
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
      var returnType = PurchaseRequest;

      return this.apiClient.callApi(
        '/purchaseRequests', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Create purchase request
     * Create purchase request
     * @param {module:model/PurchaseRequest} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/PurchaseRequest}
     */
    this.createPurchaseRequest = function(payload) {
      return this.createPurchaseRequestWithHttpInfo(payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * deletes an purchase request
     * Delete purchase request
     * @param {String} purchaseRequestId PurchaseRequest id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    this.deletePurchaseRequestWithHttpInfo = function(purchaseRequestId) {
      var postBody = null;

      // verify the required parameter 'purchaseRequestId' is set
      if (purchaseRequestId === undefined || purchaseRequestId === null) {
        throw new Error("Missing the required parameter 'purchaseRequestId' when calling deletePurchaseRequest");
      }


      var pathParams = {
        'purchaseRequestId': purchaseRequestId
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
        '/purchaseRequests/{purchaseRequestId}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * deletes an purchase request
     * Delete purchase request
     * @param {String} purchaseRequestId PurchaseRequest id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    this.deletePurchaseRequest = function(purchaseRequestId) {
      return this.deletePurchaseRequestWithHttpInfo(purchaseRequestId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds an purchaseRequest
     * Find purchaseRequest
     * @param {String} purchaseRequestId PurchaseRequest id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/PurchaseRequest>} and HTTP response
     */
    this.findPurchaseRequestWithHttpInfo = function(purchaseRequestId) {
      var postBody = null;

      // verify the required parameter 'purchaseRequestId' is set
      if (purchaseRequestId === undefined || purchaseRequestId === null) {
        throw new Error("Missing the required parameter 'purchaseRequestId' when calling findPurchaseRequest");
      }


      var pathParams = {
        'purchaseRequestId': purchaseRequestId
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
      var returnType = [PurchaseRequest];

      return this.apiClient.callApi(
        '/purchaseRequests/{purchaseRequestId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds an purchaseRequest
     * Find purchaseRequest
     * @param {String} purchaseRequestId PurchaseRequest id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/PurchaseRequest>}
     */
    this.findPurchaseRequest = function(purchaseRequestId) {
      return this.findPurchaseRequestWithHttpInfo(purchaseRequestId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * List purchase requests
     * List purchase requests
     * @param {Object} opts Optional parameters
     * @param {String} opts.categoryIds Filter by category ids (comma delimitered)
     * @param {String} opts.search Search  by free-text query
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/PurchaseRequest>} and HTTP response
     */
    this.listPurchaseRequestsWithHttpInfo = function(opts) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'categoryIds': opts['categoryIds'],
        'search': opts['search'],
        'firstResult': opts['firstResult'],
        'maxResults': opts['maxResults'],
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
      var returnType = [PurchaseRequest];

      return this.apiClient.callApi(
        '/purchaseRequests', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * List purchase requests
     * List purchase requests
     * @param {Object} opts Optional parameters
     * @param {String} opts.categoryIds Filter by category ids (comma delimitered)
     * @param {String} opts.search Search  by free-text query
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/PurchaseRequest>}
     */
    this.listPurchaseRequests = function(opts) {
      return this.listPurchaseRequestsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * updates an purchase request
     * Update purchase request
     * @param {String} purchaseRequestId PurchaseRequest id
     * @param {module:model/PurchaseRequest} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PurchaseRequest} and HTTP response
     */
    this.updatePurchaseRequestWithHttpInfo = function(purchaseRequestId, payload) {
      var postBody = payload;

      // verify the required parameter 'purchaseRequestId' is set
      if (purchaseRequestId === undefined || purchaseRequestId === null) {
        throw new Error("Missing the required parameter 'purchaseRequestId' when calling updatePurchaseRequest");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling updatePurchaseRequest");
      }


      var pathParams = {
        'purchaseRequestId': purchaseRequestId
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
      var returnType = PurchaseRequest;

      return this.apiClient.callApi(
        '/purchaseRequests/{purchaseRequestId}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * updates an purchase request
     * Update purchase request
     * @param {String} purchaseRequestId PurchaseRequest id
     * @param {module:model/PurchaseRequest} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/PurchaseRequest}
     */
    this.updatePurchaseRequest = function(purchaseRequestId, payload) {
      return this.updatePurchaseRequestWithHttpInfo(purchaseRequestId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
