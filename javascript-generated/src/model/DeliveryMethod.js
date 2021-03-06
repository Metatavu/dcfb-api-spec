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
    define(['ApiClient', 'model/LocalizedValue', 'model/Price'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LocalizedValue'), require('./Price'));
  } else {
    // Browser globals (root is window)
    if (!root.DcfbApiClient) {
      root.DcfbApiClient = {};
    }
    root.DcfbApiClient.DeliveryMethod = factory(root.DcfbApiClient.ApiClient, root.DcfbApiClient.LocalizedValue, root.DcfbApiClient.Price);
  }
}(this, function(ApiClient, LocalizedValue, Price) {
  'use strict';




  /**
   * The DeliveryMethod model module.
   * @module model/DeliveryMethod
   * @version 0.0.38
   */

  /**
   * Constructs a new <code>DeliveryMethod</code>.
   * @alias module:model/DeliveryMethod
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>DeliveryMethod</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DeliveryMethod} obj Optional instance to populate.
   * @return {module:model/DeliveryMethod} The populated <code>DeliveryMethod</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('price')) {
        obj['price'] = Price.constructFromObject(data['price']);
      }
    }
    return obj;
  }

  /**
   * Delivery method id
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Title of the item, multilingual
   * @member {Array.<module:model/LocalizedValue>} title
   */
  exports.prototype['title'] = undefined;
  /**
   * @member {module:model/Price} price
   */
  exports.prototype['price'] = undefined;



  return exports;
}));


