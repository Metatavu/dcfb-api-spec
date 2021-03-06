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
    root.MetaformApiClient.MetaformFieldOption = factory(root.MetaformApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The MetaformFieldOption model module.
   * @module model/MetaformFieldOption
   * @version 0.0.11
   */

  /**
   * Constructs a new <code>MetaformFieldOption</code>.
   * Option object for Metaform field
   * @alias module:model/MetaformFieldOption
   * @class
   * @param name {String} Option name
   * @param text {String} Option text
   */
  var exports = function(name, text) {
    var _this = this;

    _this['name'] = name;
    _this['text'] = text;


  };

  /**
   * Constructs a <code>MetaformFieldOption</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MetaformFieldOption} obj Optional instance to populate.
   * @return {module:model/MetaformFieldOption} The populated <code>MetaformFieldOption</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('text')) {
        obj['text'] = ApiClient.convertToType(data['text'], 'String');
      }
      if (data.hasOwnProperty('checked')) {
        obj['checked'] = ApiClient.convertToType(data['checked'], 'Boolean');
      }
      if (data.hasOwnProperty('selected')) {
        obj['selected'] = ApiClient.convertToType(data['selected'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * Option name
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Option text
   * @member {String} text
   */
  exports.prototype['text'] = undefined;
  /**
   * Defines whether option should be checked by default.
   * @member {Boolean} checked
   */
  exports.prototype['checked'] = undefined;
  /**
   * Defines whether option should be selected by default.
   * @member {Boolean} selected
   */
  exports.prototype['selected'] = undefined;



  return exports;
}));


