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
    root.DcfbApiClient.Forbidden = factory(root.DcfbApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Forbidden model module.
   * @module model/Forbidden
   * @version 0.0.27
   */

  /**
   * Constructs a new <code>Forbidden</code>.
   * @alias module:model/Forbidden
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>Forbidden</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Forbidden} obj Optional instance to populate.
   * @return {module:model/Forbidden} The populated <code>Forbidden</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('code')) {
        obj['code'] = ApiClient.convertToType(data['code'], 'Number');
      }
      if (data.hasOwnProperty('message')) {
        obj['message'] = ApiClient.convertToType(data['message'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Number} code
   */
  exports.prototype['code'] = undefined;
  /**
   * @member {String} message
   */
  exports.prototype['message'] = undefined;



  return exports;
}));


