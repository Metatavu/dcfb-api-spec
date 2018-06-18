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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.DcfbApiClient) {
      root.DcfbApiClient = {};
    }
    root.DcfbApiClient.Price = factory(root.DcfbApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Price model module.
   * @module model/Price
   * @version 0.0.14
   */

  /**
   * Constructs a new <code>Price</code>.
   * @alias module:model/Price
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>Price</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Price} obj Optional instance to populate.
   * @return {module:model/Price} The populated <code>Price</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('price')) {
        obj['price'] = ApiClient.convertToType(data['price'], 'String');
      }
      if (data.hasOwnProperty('currency')) {
        obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
      }
    }
    return obj;
  }

  /**
   * price with two decimal places. e.g. 13.00
   * @member {String} price
   */
  exports.prototype['price'] = undefined;
  /**
   * Currency code (ISO 4217)
   * @member {String} currency
   */
  exports.prototype['currency'] = undefined;



  return exports;
}));


