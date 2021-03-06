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
    root.MetaformApiClient.MetaformFieldType = factory(root.MetaformApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class MetaformFieldType.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "text"
     * @const
     */
    "text": "text",
    /**
     * value: "hidden"
     * @const
     */
    "hidden": "hidden",
    /**
     * value: "email"
     * @const
     */
    "email": "email",
    /**
     * value: "number"
     * @const
     */
    "number": "number",
    /**
     * value: "memo"
     * @const
     */
    "memo": "memo",
    /**
     * value: "boolean"
     * @const
     */
    "boolean": "boolean",
    /**
     * value: "radio"
     * @const
     */
    "radio": "radio",
    /**
     * value: "checklist"
     * @const
     */
    "checklist": "checklist",
    /**
     * value: "date"
     * @const
     */
    "date": "date",
    /**
     * value: "time"
     * @const
     */
    "time": "time",
    /**
     * value: "date-time"
     * @const
     */
    "date-time": "date-time",
    /**
     * value: "files"
     * @const
     */
    "files": "files",
    /**
     * value: "table"
     * @const
     */
    "table": "table",
    /**
     * value: "logo"
     * @const
     */
    "logo": "logo",
    /**
     * value: "small-text"
     * @const
     */
    "small-text": "small-text",
    /**
     * value: "html"
     * @const
     */
    "html": "html",
    /**
     * value: "submit"
     * @const
     */
    "submit": "submit",
    /**
     * value: "select"
     * @const
     */
    "select": "select",
    /**
     * value: "autocomplete"
     * @const
     */
    "autocomplete": "autocomplete",
    /**
     * value: "autocomplete-multiple"
     * @const
     */
    "autocomplete-multiple": "autocomplete-multiple"  };

  /**
   * Returns a <code>MetaformFieldType</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/MetaformFieldType} The enum <code>MetaformFieldType</code> value.
   */
  exports.constructFromObject = function(object) {
    return object;
  }

  return exports;
}));


