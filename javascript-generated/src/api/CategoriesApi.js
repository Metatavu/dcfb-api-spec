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
    define(['ApiClient', 'model/BadRequest', 'model/Category', 'model/Forbidden', 'model/InternalServerError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Category'), require('../model/Forbidden'), require('../model/InternalServerError'));
  } else {
    // Browser globals (root is window)
    if (!root.DcfbApiClient) {
      root.DcfbApiClient = {};
    }
    root.DcfbApiClient.CategoriesApi = factory(root.DcfbApiClient.ApiClient, root.DcfbApiClient.BadRequest, root.DcfbApiClient.Category, root.DcfbApiClient.Forbidden, root.DcfbApiClient.InternalServerError);
  }
}(this, function(ApiClient, BadRequest, Category, Forbidden, InternalServerError) {
  'use strict';

  /**
   * Categories service.
   * @module api/CategoriesApi
   * @version 0.0.29
   */

  /**
   * Constructs a new CategoriesApi. 
   * @alias module:api/CategoriesApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Create category
     * Create category
     * @param {module:model/Category} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Category} and HTTP response
     */
    this.createCategoryWithHttpInfo = function(payload) {
      var postBody = payload;

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling createCategory");
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
      var returnType = Category;

      return this.apiClient.callApi(
        '/categories', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Create category
     * Create category
     * @param {module:model/Category} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Category}
     */
    this.createCategory = function(payload) {
      return this.createCategoryWithHttpInfo(payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * deletes an category
     * Delete category
     * @param {String} categoryId Category id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    this.deleteCategoryWithHttpInfo = function(categoryId) {
      var postBody = null;

      // verify the required parameter 'categoryId' is set
      if (categoryId === undefined || categoryId === null) {
        throw new Error("Missing the required parameter 'categoryId' when calling deleteCategory");
      }


      var pathParams = {
        'categoryId': categoryId
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
        '/categories/{categoryId}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * deletes an category
     * Delete category
     * @param {String} categoryId Category id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    this.deleteCategory = function(categoryId) {
      return this.deleteCategoryWithHttpInfo(categoryId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds an category
     * Find category
     * @param {String} categoryId Category id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Category} and HTTP response
     */
    this.findCategoryWithHttpInfo = function(categoryId) {
      var postBody = null;

      // verify the required parameter 'categoryId' is set
      if (categoryId === undefined || categoryId === null) {
        throw new Error("Missing the required parameter 'categoryId' when calling findCategory");
      }


      var pathParams = {
        'categoryId': categoryId
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
      var returnType = Category;

      return this.apiClient.callApi(
        '/categories/{categoryId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds an category
     * Find category
     * @param {String} categoryId Category id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Category}
     */
    this.findCategory = function(categoryId) {
      return this.findCategoryWithHttpInfo(categoryId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * List categories
     * List categories
     * @param {Object} opts Optional parameters
     * @param {String} opts.parentId Filter by parent category id
     * @param {String} opts.search Search by free-text query
     * @param {String} opts.slug Filter by category slug
     * @param {Array.<String>} opts.sort Sort results. See CategoryListSort for sort options
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/Category>} and HTTP response
     */
    this.listCategoriesWithHttpInfo = function(opts) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'parentId': opts['parentId'],
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
      var returnType = [Category];

      return this.apiClient.callApi(
        '/categories', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * List categories
     * List categories
     * @param {Object} opts Optional parameters
     * @param {String} opts.parentId Filter by parent category id
     * @param {String} opts.search Search by free-text query
     * @param {String} opts.slug Filter by category slug
     * @param {Array.<String>} opts.sort Sort results. See CategoryListSort for sort options
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Category>}
     */
    this.listCategories = function(opts) {
      return this.listCategoriesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * updates an category
     * Update category
     * @param {String} categoryId Category id
     * @param {module:model/Category} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Category} and HTTP response
     */
    this.updateCategoryWithHttpInfo = function(categoryId, payload) {
      var postBody = payload;

      // verify the required parameter 'categoryId' is set
      if (categoryId === undefined || categoryId === null) {
        throw new Error("Missing the required parameter 'categoryId' when calling updateCategory");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling updateCategory");
      }


      var pathParams = {
        'categoryId': categoryId
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
      var returnType = Category;

      return this.apiClient.callApi(
        '/categories/{categoryId}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * updates an category
     * Update category
     * @param {String} categoryId Category id
     * @param {module:model/Category} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Category}
     */
    this.updateCategory = function(categoryId, payload) {
      return this.updateCategoryWithHttpInfo(categoryId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
