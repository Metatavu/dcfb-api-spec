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
    root.DcfbApiClient.ItemPaymentMethods = factory(root.DcfbApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ItemPaymentMethods model module.
   * @module model/ItemPaymentMethods
   * @version 0.0.38
   */

  /**
   * Constructs a new <code>ItemPaymentMethods</code>.
   * @alias module:model/ItemPaymentMethods
   * @class
   * @param allowCreditCard {Boolean} 
   * @param allowContactSeller {Boolean} 
   */
  var exports = function(allowCreditCard, allowContactSeller) {
    var _this = this;

    _this['allowCreditCard'] = allowCreditCard;
    _this['allowContactSeller'] = allowContactSeller;
  };

  /**
   * Constructs a <code>ItemPaymentMethods</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ItemPaymentMethods} obj Optional instance to populate.
   * @return {module:model/ItemPaymentMethods} The populated <code>ItemPaymentMethods</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('allowCreditCard')) {
        obj['allowCreditCard'] = ApiClient.convertToType(data['allowCreditCard'], 'Boolean');
      }
      if (data.hasOwnProperty('allowContactSeller')) {
        obj['allowContactSeller'] = ApiClient.convertToType(data['allowContactSeller'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * @member {Boolean} allowCreditCard
   */
  exports.prototype['allowCreditCard'] = undefined;
  /**
   * @member {Boolean} allowContactSeller
   */
  exports.prototype['allowContactSeller'] = undefined;



  return exports;
}));


