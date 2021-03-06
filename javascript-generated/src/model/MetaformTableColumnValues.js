/**
 * Metaform REST API
 * REST API for Metaform
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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.MetaformTableColumnValues = factory(root.MetaformApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The MetaformTableColumnValues model module.
   * @module model/MetaformTableColumnValues
   * @version 0.0.11
   */

  /**
   * Constructs a new <code>MetaformTableColumnValues</code>.
   * Values for enum columns
   * @alias module:model/MetaformTableColumnValues
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>MetaformTableColumnValues</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MetaformTableColumnValues} obj Optional instance to populate.
   * @return {module:model/MetaformTableColumnValues} The populated <code>MetaformTableColumnValues</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'String');
      }
      if (data.hasOwnProperty('other')) {
        obj['other'] = ApiClient.convertToType(data['other'], 'String');
      }
      if (data.hasOwnProperty('text')) {
        obj['text'] = ApiClient.convertToType(data['text'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} value
   */
  exports.prototype['value'] = undefined;
  /**
   * @member {String} other
   */
  exports.prototype['other'] = undefined;
  /**
   * @member {String} text
   */
  exports.prototype['text'] = undefined;



  return exports;
}));


