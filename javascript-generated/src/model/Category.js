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
    define(['ApiClient', 'model/ExtraParam', 'model/LocalizedValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ExtraParam'), require('./LocalizedValue'));
  } else {
    // Browser globals (root is window)
    if (!root.DcfbApiClient) {
      root.DcfbApiClient = {};
    }
    root.DcfbApiClient.Category = factory(root.DcfbApiClient.ApiClient, root.DcfbApiClient.ExtraParam, root.DcfbApiClient.LocalizedValue);
  }
}(this, function(ApiClient, ExtraParam, LocalizedValue) {
  'use strict';




  /**
   * The Category model module.
   * @module model/Category
   * @version 0.0.17
   */

  /**
   * Constructs a new <code>Category</code>.
   * @alias module:model/Category
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>Category</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Category} obj Optional instance to populate.
   * @return {module:model/Category} The populated <code>Category</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('parentId')) {
        obj['parentId'] = ApiClient.convertToType(data['parentId'], 'String');
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('slug')) {
        obj['slug'] = ApiClient.convertToType(data['slug'], 'String');
      }
      if (data.hasOwnProperty('extra')) {
        obj['extra'] = ApiClient.convertToType(data['extra'], [ExtraParam]);
      }
    }
    return obj;
  }

  /**
   * Category id
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Category parent id.
   * @member {String} parentId
   */
  exports.prototype['parentId'] = undefined;
  /**
   * Title of the category, multilingual
   * @member {Array.<module:model/LocalizedValue>} title
   */
  exports.prototype['title'] = undefined;
  /**
   * Category slug
   * @member {String} slug
   */
  exports.prototype['slug'] = undefined;
  /**
   * Extra parameters
   * @member {Array.<module:model/ExtraParam>} extra
   */
  exports.prototype['extra'] = undefined;



  return exports;
}));


