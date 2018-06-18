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
    define(['ApiClient', 'model/LocalizedValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LocalizedValue'));
  } else {
    // Browser globals (root is window)
    if (!root.DcfbApiClient) {
      root.DcfbApiClient = {};
    }
    root.DcfbApiClient.Address = factory(root.DcfbApiClient.ApiClient, root.DcfbApiClient.LocalizedValue);
  }
}(this, function(ApiClient, LocalizedValue) {
  'use strict';




  /**
   * The Address model module.
   * @module model/Address
   * @version 0.0.13
   */

  /**
   * Constructs a new <code>Address</code>.
   * @alias module:model/Address
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>Address</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Address} obj Optional instance to populate.
   * @return {module:model/Address} The populated <code>Address</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('streetAddress')) {
        obj['streetAddress'] = ApiClient.convertToType(data['streetAddress'], 'String');
      }
      if (data.hasOwnProperty('postalCode')) {
        obj['postalCode'] = ApiClient.convertToType(data['postalCode'], 'String');
      }
      if (data.hasOwnProperty('postOffice')) {
        obj['postOffice'] = ApiClient.convertToType(data['postOffice'], 'String');
      }
      if (data.hasOwnProperty('country')) {
        obj['country'] = ApiClient.convertToType(data['country'], 'String');
      }
      if (data.hasOwnProperty('additionalInformations')) {
        obj['additionalInformations'] = ApiClient.convertToType(data['additionalInformations'], [LocalizedValue]);
      }
    }
    return obj;
  }

  /**
   * Street address.
   * @member {String} streetAddress
   */
  exports.prototype['streetAddress'] = undefined;
  /**
   * Postal code, for example 00010.
   * @member {String} postalCode
   */
  exports.prototype['postalCode'] = undefined;
  /**
   * Post office
   * @member {String} postOffice
   */
  exports.prototype['postOffice'] = undefined;
  /**
   * Country code (ISO 3166-1 alpha-2), for example FI.
   * @member {String} country
   */
  exports.prototype['country'] = undefined;
  /**
   * Localized list of additional information about the address.
   * @member {Array.<module:model/LocalizedValue>} additionalInformations
   */
  exports.prototype['additionalInformations'] = undefined;



  return exports;
}));


