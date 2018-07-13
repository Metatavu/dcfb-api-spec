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

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Address', 'model/BadRequest', 'model/Category', 'model/CategoryListSort', 'model/Coordinate', 'model/Forbidden', 'model/Image', 'model/InternalServerError', 'model/Item', 'model/ItemListSort', 'model/LocalizedValue', 'model/Location', 'model/LocationListSort', 'model/Meta', 'model/NotFound', 'model/NotImplemented', 'model/Price', 'model/PurchaseRequest', 'api/CategoriesApi', 'api/ItemsApi', 'api/LocationsApi', 'api/PurchaseRequestsApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/Address'), require('./model/BadRequest'), require('./model/Category'), require('./model/CategoryListSort'), require('./model/Coordinate'), require('./model/Forbidden'), require('./model/Image'), require('./model/InternalServerError'), require('./model/Item'), require('./model/ItemListSort'), require('./model/LocalizedValue'), require('./model/Location'), require('./model/LocationListSort'), require('./model/Meta'), require('./model/NotFound'), require('./model/NotImplemented'), require('./model/Price'), require('./model/PurchaseRequest'), require('./api/CategoriesApi'), require('./api/ItemsApi'), require('./api/LocationsApi'), require('./api/PurchaseRequestsApi'));
  }
}(function(ApiClient, Address, BadRequest, Category, CategoryListSort, Coordinate, Forbidden, Image, InternalServerError, Item, ItemListSort, LocalizedValue, Location, LocationListSort, Meta, NotFound, NotImplemented, Price, PurchaseRequest, CategoriesApi, ItemsApi, LocationsApi, PurchaseRequestsApi) {
  'use strict';

  /**
   * API_spec_for_DCFB_API_.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var DcfbApiClient = require('index'); // See note below*.
   * var xxxSvc = new DcfbApiClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new DcfbApiClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new DcfbApiClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new DcfbApiClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 0.0.26
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The Address model constructor.
     * @property {module:model/Address}
     */
    Address: Address,
    /**
     * The BadRequest model constructor.
     * @property {module:model/BadRequest}
     */
    BadRequest: BadRequest,
    /**
     * The Category model constructor.
     * @property {module:model/Category}
     */
    Category: Category,
    /**
     * The CategoryListSort model constructor.
     * @property {module:model/CategoryListSort}
     */
    CategoryListSort: CategoryListSort,
    /**
     * The Coordinate model constructor.
     * @property {module:model/Coordinate}
     */
    Coordinate: Coordinate,
    /**
     * The Forbidden model constructor.
     * @property {module:model/Forbidden}
     */
    Forbidden: Forbidden,
    /**
     * The Image model constructor.
     * @property {module:model/Image}
     */
    Image: Image,
    /**
     * The InternalServerError model constructor.
     * @property {module:model/InternalServerError}
     */
    InternalServerError: InternalServerError,
    /**
     * The Item model constructor.
     * @property {module:model/Item}
     */
    Item: Item,
    /**
     * The ItemListSort model constructor.
     * @property {module:model/ItemListSort}
     */
    ItemListSort: ItemListSort,
    /**
     * The LocalizedValue model constructor.
     * @property {module:model/LocalizedValue}
     */
    LocalizedValue: LocalizedValue,
    /**
     * The Location model constructor.
     * @property {module:model/Location}
     */
    Location: Location,
    /**
     * The LocationListSort model constructor.
     * @property {module:model/LocationListSort}
     */
    LocationListSort: LocationListSort,
    /**
     * The Meta model constructor.
     * @property {module:model/Meta}
     */
    Meta: Meta,
    /**
     * The NotFound model constructor.
     * @property {module:model/NotFound}
     */
    NotFound: NotFound,
    /**
     * The NotImplemented model constructor.
     * @property {module:model/NotImplemented}
     */
    NotImplemented: NotImplemented,
    /**
     * The Price model constructor.
     * @property {module:model/Price}
     */
    Price: Price,
    /**
     * The PurchaseRequest model constructor.
     * @property {module:model/PurchaseRequest}
     */
    PurchaseRequest: PurchaseRequest,
    /**
     * The CategoriesApi service constructor.
     * @property {module:api/CategoriesApi}
     */
    CategoriesApi: CategoriesApi,
    /**
     * The ItemsApi service constructor.
     * @property {module:api/ItemsApi}
     */
    ItemsApi: ItemsApi,
    /**
     * The LocationsApi service constructor.
     * @property {module:api/LocationsApi}
     */
    LocationsApi: LocationsApi,
    /**
     * The PurchaseRequestsApi service constructor.
     * @property {module:api/PurchaseRequestsApi}
     */
    PurchaseRequestsApi: PurchaseRequestsApi
  };

  return exports;
}));
