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
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/InternalServerError', 'model/Item', 'model/ItemReservation'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/Item'), require('../model/ItemReservation'));
  } else {
    // Browser globals (root is window)
    if (!root.DcfbApiClient) {
      root.DcfbApiClient = {};
    }
    root.DcfbApiClient.ItemsApi = factory(root.DcfbApiClient.ApiClient, root.DcfbApiClient.BadRequest, root.DcfbApiClient.Forbidden, root.DcfbApiClient.InternalServerError, root.DcfbApiClient.Item, root.DcfbApiClient.ItemReservation);
  }
}(this, function(ApiClient, BadRequest, Forbidden, InternalServerError, Item, ItemReservation) {
  'use strict';

  /**
   * Items service.
   * @module api/ItemsApi
   * @version 0.0.41
   */

  /**
   * Constructs a new ItemsApi. 
   * @alias module:api/ItemsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Create item
     * Create item
     * @param {module:model/Item} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Item} and HTTP response
     */
    this.createItemWithHttpInfo = function(payload) {
      var postBody = payload;

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling createItem");
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
      var returnType = Item;

      return this.apiClient.callApi(
        '/items', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Create item
     * Create item
     * @param {module:model/Item} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Item}
     */
    this.createItem = function(payload) {
      return this.createItemWithHttpInfo(payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Create item reservation
     * Create item reservation
     * @param {String} itemId Item id
     * @param {module:model/ItemReservation} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ItemReservation} and HTTP response
     */
    this.createItemReservationWithHttpInfo = function(itemId, payload) {
      var postBody = payload;

      // verify the required parameter 'itemId' is set
      if (itemId === undefined || itemId === null) {
        throw new Error("Missing the required parameter 'itemId' when calling createItemReservation");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling createItemReservation");
      }


      var pathParams = {
        'itemId': itemId
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
      var returnType = ItemReservation;

      return this.apiClient.callApi(
        '/items/{itemId}/reservations', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Create item reservation
     * Create item reservation
     * @param {String} itemId Item id
     * @param {module:model/ItemReservation} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ItemReservation}
     */
    this.createItemReservation = function(itemId, payload) {
      return this.createItemReservationWithHttpInfo(itemId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * deletes an item
     * Delete item
     * @param {String} itemId Item id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    this.deleteItemWithHttpInfo = function(itemId) {
      var postBody = null;

      // verify the required parameter 'itemId' is set
      if (itemId === undefined || itemId === null) {
        throw new Error("Missing the required parameter 'itemId' when calling deleteItem");
      }


      var pathParams = {
        'itemId': itemId
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
        '/items/{itemId}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * deletes an item
     * Delete item
     * @param {String} itemId Item id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    this.deleteItem = function(itemId) {
      return this.deleteItemWithHttpInfo(itemId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds an item
     * Find item
     * @param {String} itemId Item id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Item} and HTTP response
     */
    this.findItemWithHttpInfo = function(itemId) {
      var postBody = null;

      // verify the required parameter 'itemId' is set
      if (itemId === undefined || itemId === null) {
        throw new Error("Missing the required parameter 'itemId' when calling findItem");
      }


      var pathParams = {
        'itemId': itemId
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
      var returnType = Item;

      return this.apiClient.callApi(
        '/items/{itemId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds an item
     * Find item
     * @param {String} itemId Item id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Item}
     */
    this.findItem = function(itemId) {
      return this.findItemWithHttpInfo(itemId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Find item reservation
     * Find item reservation
     * @param {String} itemId Item id
     * @param {String} itemReservationId Item id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ItemReservation} and HTTP response
     */
    this.findItemReservationWithHttpInfo = function(itemId, itemReservationId) {
      var postBody = null;

      // verify the required parameter 'itemId' is set
      if (itemId === undefined || itemId === null) {
        throw new Error("Missing the required parameter 'itemId' when calling findItemReservation");
      }

      // verify the required parameter 'itemReservationId' is set
      if (itemReservationId === undefined || itemReservationId === null) {
        throw new Error("Missing the required parameter 'itemReservationId' when calling findItemReservation");
      }


      var pathParams = {
        'itemId': itemId,
        'itemReservationId': itemReservationId
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
      var returnType = ItemReservation;

      return this.apiClient.callApi(
        '/items/{itemId}/reservations/{itemReservationId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Find item reservation
     * Find item reservation
     * @param {String} itemId Item id
     * @param {String} itemReservationId Item id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ItemReservation}
     */
    this.findItemReservation = function(itemId, itemReservationId) {
      return this.findItemReservationWithHttpInfo(itemId, itemReservationId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * List items
     * List items
     * @param {Object} opts Optional parameters
     * @param {String} opts.categoryIds Filter by category ids (comma delimitered)
     * @param {String} opts.locationIds Filter by location ids (comma delimitered)
     * @param {String} opts.userIds Filter by user ids (comma delimitered)
     * @param {String} opts.search Search by free-text query
     * @param {Number} opts.nearLat Prefer results near geo-point
     * @param {Number} opts.nearLon Prefer results near geo-point
     * @param {Boolean} opts.includeExhausted Whether to include items without any items in stock. Defaults to false
     * @param {Array.<String>} opts.sort 
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/Item>} and HTTP response
     */
    this.listItemsWithHttpInfo = function(opts) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'categoryIds': opts['categoryIds'],
        'locationIds': opts['locationIds'],
        'userIds': opts['userIds'],
        'search': opts['search'],
        'nearLat': opts['nearLat'],
        'nearLon': opts['nearLon'],
        'includeExhausted': opts['includeExhausted'],
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
      var returnType = [Item];

      return this.apiClient.callApi(
        '/items', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * List items
     * List items
     * @param {Object} opts Optional parameters
     * @param {String} opts.categoryIds Filter by category ids (comma delimitered)
     * @param {String} opts.locationIds Filter by location ids (comma delimitered)
     * @param {String} opts.userIds Filter by user ids (comma delimitered)
     * @param {String} opts.search Search by free-text query
     * @param {Number} opts.nearLat Prefer results near geo-point
     * @param {Number} opts.nearLon Prefer results near geo-point
     * @param {Boolean} opts.includeExhausted Whether to include items without any items in stock. Defaults to false
     * @param {Array.<String>} opts.sort 
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Item>}
     */
    this.listItems = function(opts) {
      return this.listItemsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * updates an item
     * Update item
     * @param {String} itemId Item id
     * @param {module:model/Item} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Item} and HTTP response
     */
    this.updateItemWithHttpInfo = function(itemId, payload) {
      var postBody = payload;

      // verify the required parameter 'itemId' is set
      if (itemId === undefined || itemId === null) {
        throw new Error("Missing the required parameter 'itemId' when calling updateItem");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling updateItem");
      }


      var pathParams = {
        'itemId': itemId
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
      var returnType = Item;

      return this.apiClient.callApi(
        '/items/{itemId}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * updates an item
     * Update item
     * @param {String} itemId Item id
     * @param {module:model/Item} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Item}
     */
    this.updateItem = function(itemId, payload) {
      return this.updateItemWithHttpInfo(itemId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
