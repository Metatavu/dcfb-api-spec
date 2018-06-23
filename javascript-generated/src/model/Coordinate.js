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
    root.DcfbApiClient.Coordinate = factory(root.DcfbApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Coordinate model module.
   * @module model/Coordinate
   * @version 0.0.24
   */

  /**
   * Constructs a new <code>Coordinate</code>.
   * @alias module:model/Coordinate
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>Coordinate</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Coordinate} obj Optional instance to populate.
   * @return {module:model/Coordinate} The populated <code>Coordinate</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('crs')) {
        obj['crs'] = ApiClient.convertToType(data['crs'], 'String');
      }
      if (data.hasOwnProperty('latitude')) {
        obj['latitude'] = ApiClient.convertToType(data['latitude'], 'String');
      }
      if (data.hasOwnProperty('longitude')) {
        obj['longitude'] = ApiClient.convertToType(data['longitude'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} crs
   */
  exports.prototype['crs'] = undefined;
  /**
   * latitude coordinate.
   * @member {String} latitude
   */
  exports.prototype['latitude'] = undefined;
  /**
   * longitude coordinate.
   * @member {String} longitude
   */
  exports.prototype['longitude'] = undefined;



  return exports;
}));


