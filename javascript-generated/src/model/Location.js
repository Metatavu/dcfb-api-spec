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
    define(['ApiClient', 'model/Address', 'model/Coordinate', 'model/LocalizedValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Address'), require('./Coordinate'), require('./LocalizedValue'));
  } else {
    // Browser globals (root is window)
    if (!root.DcfbApiClient) {
      root.DcfbApiClient = {};
    }
    root.DcfbApiClient.Location = factory(root.DcfbApiClient.ApiClient, root.DcfbApiClient.Address, root.DcfbApiClient.Coordinate, root.DcfbApiClient.LocalizedValue);
  }
}(this, function(ApiClient, Address, Coordinate, LocalizedValue) {
  'use strict';




  /**
   * The Location model module.
   * @module model/Location
   * @version 0.0.14
   */

  /**
   * Constructs a new <code>Location</code>.
   * @alias module:model/Location
   * @class
   * @param name {Array.<module:model/LocalizedValue>} Name of the location, multilingual
   */
  var exports = function(name) {
    var _this = this;


    _this['name'] = name;


  };

  /**
   * Constructs a <code>Location</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Location} obj Optional instance to populate.
   * @return {module:model/Location} The populated <code>Location</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('coordinate')) {
        obj['coordinate'] = Coordinate.constructFromObject(data['coordinate']);
      }
      if (data.hasOwnProperty('address')) {
        obj['address'] = Address.constructFromObject(data['address']);
      }
    }
    return obj;
  }

  /**
   * Location id
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Name of the location, multilingual
   * @member {Array.<module:model/LocalizedValue>} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {module:model/Coordinate} coordinate
   */
  exports.prototype['coordinate'] = undefined;
  /**
   * @member {module:model/Address} address
   */
  exports.prototype['address'] = undefined;



  return exports;
}));


