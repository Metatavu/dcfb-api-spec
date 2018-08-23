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
    define(['ApiClient', 'model/Image', 'model/LocalizedValue', 'model/Meta', 'model/Price'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Image'), require('./LocalizedValue'), require('./Meta'), require('./Price'));
  } else {
    // Browser globals (root is window)
    if (!root.DcfbApiClient) {
      root.DcfbApiClient = {};
    }
    root.DcfbApiClient.Item = factory(root.DcfbApiClient.ApiClient, root.DcfbApiClient.Image, root.DcfbApiClient.LocalizedValue, root.DcfbApiClient.Meta, root.DcfbApiClient.Price);
  }
}(this, function(ApiClient, Image, LocalizedValue, Meta, Price) {
  'use strict';




  /**
   * The Item model module.
   * @module model/Item
   * @version 0.0.32
   */

  /**
   * Constructs a new <code>Item</code>.
   * @alias module:model/Item
   * @class
   * @param categoryId {String} Category id.
   * @param unitPrice {module:model/Price} 
   * @param unit {String} 
   * @param amount {Number} 
   */
  var exports = function(categoryId, unitPrice, unit, amount) {
    var _this = this;




    _this['categoryId'] = categoryId;









    _this['unitPrice'] = unitPrice;
    _this['unit'] = unit;
    _this['amount'] = amount;



  };

  /**
   * Constructs a <code>Item</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Item} obj Optional instance to populate.
   * @return {module:model/Item} The populated <code>Item</code> instance.
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
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('categoryId')) {
        obj['categoryId'] = ApiClient.convertToType(data['categoryId'], 'String');
      }
      if (data.hasOwnProperty('locationId')) {
        obj['locationId'] = ApiClient.convertToType(data['locationId'], 'String');
      }
      if (data.hasOwnProperty('slug')) {
        obj['slug'] = ApiClient.convertToType(data['slug'], 'String');
      }
      if (data.hasOwnProperty('sellerId')) {
        obj['sellerId'] = ApiClient.convertToType(data['sellerId'], 'String');
      }
      if (data.hasOwnProperty('createdAt')) {
        obj['createdAt'] = ApiClient.convertToType(data['createdAt'], 'Date');
      }
      if (data.hasOwnProperty('modifiedAt')) {
        obj['modifiedAt'] = ApiClient.convertToType(data['modifiedAt'], 'Date');
      }
      if (data.hasOwnProperty('expiresAt')) {
        obj['expiresAt'] = ApiClient.convertToType(data['expiresAt'], 'Date');
      }
      if (data.hasOwnProperty('images')) {
        obj['images'] = ApiClient.convertToType(data['images'], [Image]);
      }
      if (data.hasOwnProperty('visibleToUsers')) {
        obj['visibleToUsers'] = ApiClient.convertToType(data['visibleToUsers'], ['String']);
      }
      if (data.hasOwnProperty('visibilityLimited')) {
        obj['visibilityLimited'] = ApiClient.convertToType(data['visibilityLimited'], 'Boolean');
      }
      if (data.hasOwnProperty('unitPrice')) {
        obj['unitPrice'] = Price.constructFromObject(data['unitPrice']);
      }
      if (data.hasOwnProperty('unit')) {
        obj['unit'] = ApiClient.convertToType(data['unit'], 'String');
      }
      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
      }
      if (data.hasOwnProperty('reservedAmount')) {
        obj['reservedAmount'] = ApiClient.convertToType(data['reservedAmount'], 'Number');
      }
      if (data.hasOwnProperty('soldAmount')) {
        obj['soldAmount'] = ApiClient.convertToType(data['soldAmount'], 'Number');
      }
      if (data.hasOwnProperty('meta')) {
        obj['meta'] = ApiClient.convertToType(data['meta'], [Meta]);
      }
    }
    return obj;
  }

  /**
   * Item id
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Title of the item, multilingual
   * @member {Array.<module:model/LocalizedValue>} title
   */
  exports.prototype['title'] = undefined;
  /**
   * Description of the item, multilingual
   * @member {Array.<module:model/LocalizedValue>} description
   */
  exports.prototype['description'] = undefined;
  /**
   * Category id.
   * @member {String} categoryId
   */
  exports.prototype['categoryId'] = undefined;
  /**
   * Location id.
   * @member {String} locationId
   */
  exports.prototype['locationId'] = undefined;
  /**
   * Item slug
   * @member {String} slug
   */
  exports.prototype['slug'] = undefined;
  /**
   * Sellers user id
   * @member {String} sellerId
   */
  exports.prototype['sellerId'] = undefined;
  /**
   * @member {Date} createdAt
   */
  exports.prototype['createdAt'] = undefined;
  /**
   * @member {Date} modifiedAt
   */
  exports.prototype['modifiedAt'] = undefined;
  /**
   * @member {Date} expiresAt
   */
  exports.prototype['expiresAt'] = undefined;
  /**
   * @member {Array.<module:model/Image>} images
   */
  exports.prototype['images'] = undefined;
  /**
   * @member {Array.<String>} visibleToUsers
   */
  exports.prototype['visibleToUsers'] = undefined;
  /**
   * @member {Boolean} visibilityLimited
   */
  exports.prototype['visibilityLimited'] = undefined;
  /**
   * @member {module:model/Price} unitPrice
   */
  exports.prototype['unitPrice'] = undefined;
  /**
   * @member {String} unit
   */
  exports.prototype['unit'] = undefined;
  /**
   * @member {Number} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * @member {Number} reservedAmount
   */
  exports.prototype['reservedAmount'] = undefined;
  /**
   * @member {Number} soldAmount
   */
  exports.prototype['soldAmount'] = undefined;
  /**
   * Item meta
   * @member {Array.<module:model/Meta>} meta
   */
  exports.prototype['meta'] = undefined;



  return exports;
}));


