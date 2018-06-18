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
    root.DcfbApiClient.ItemListSort = factory(root.DcfbApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class ItemListSort.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "CREATED_AT_DESC"
     * @const
     */
    "CREATED_AT_DESC": "CREATED_AT_DESC",
    /**
     * value: "CREATED_AT_ASC"
     * @const
     */
    "CREATED_AT_ASC": "CREATED_AT_ASC",
    /**
     * value: "MODIFIED_AT_DESC"
     * @const
     */
    "MODIFIED_AT_DESC": "MODIFIED_AT_DESC",
    /**
     * value: "MODIFIED_AT_ASC"
     * @const
     */
    "MODIFIED_AT_ASC": "MODIFIED_AT_ASC",
    /**
     * value: "SCORE_DESC"
     * @const
     */
    "SCORE_DESC": "SCORE_DESC",
    /**
     * value: "SCORE_ASC"
     * @const
     */
    "SCORE_ASC": "SCORE_ASC"  };

  /**
   * Returns a <code>ItemListSort</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/ItemListSort} The enum <code>ItemListSort</code> value.
   */
  exports.constructFromObject = function(object) {
    return object;
  }

  return exports;
}));


