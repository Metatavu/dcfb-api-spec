# DcfbApiClient.ItemsApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createItem**](ItemsApi.md#createItem) | **POST** /items | Create item
[**createItemReservation**](ItemsApi.md#createItemReservation) | **POST** /items/{itemId}/reservations | Create item reservation
[**deleteItem**](ItemsApi.md#deleteItem) | **DELETE** /items/{itemId} | deletes an item
[**findItem**](ItemsApi.md#findItem) | **GET** /items/{itemId} | Finds an item
[**findItemReservation**](ItemsApi.md#findItemReservation) | **GET** /items/{itemId}/reservations/{itemReservationId} | Find item reservation
[**listItems**](ItemsApi.md#listItems) | **GET** /items | List items
[**updateItem**](ItemsApi.md#updateItem) | **PUT** /items/{itemId} | updates an item


<a name="createItem"></a>
# **createItem**
> Item createItem(payload)

Create item

Create item

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.ItemsApi();

var payload = new DcfbApiClient.Item(); // Item | Payload

apiInstance.createItem(payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Item**](Item.md)| Payload | 

### Return type

[**Item**](Item.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createItemReservation"></a>
# **createItemReservation**
> ItemReservation createItemReservation(itemId, payload)

Create item reservation

Create item reservation

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.ItemsApi();

var itemId = "itemId_example"; // String | Item id

var payload = new DcfbApiClient.ItemReservation(); // ItemReservation | Payload

apiInstance.createItemReservation(itemId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **String**| Item id | 
 **payload** | [**ItemReservation**](ItemReservation.md)| Payload | 

### Return type

[**ItemReservation**](ItemReservation.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteItem"></a>
# **deleteItem**
> deleteItem(itemId)

deletes an item

Delete item

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.ItemsApi();

var itemId = "itemId_example"; // String | Item id

apiInstance.deleteItem(itemId).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **String**| Item id | 

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findItem"></a>
# **findItem**
> Item findItem(itemId)

Finds an item

Find item

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.ItemsApi();

var itemId = "itemId_example"; // String | Item id

apiInstance.findItem(itemId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **String**| Item id | 

### Return type

[**Item**](Item.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findItemReservation"></a>
# **findItemReservation**
> ItemReservation findItemReservation(itemId, itemReservationId)

Find item reservation

Find item reservation

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.ItemsApi();

var itemId = "itemId_example"; // String | Item id

var itemReservationId = "itemReservationId_example"; // String | Item id

apiInstance.findItemReservation(itemId, itemReservationId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **String**| Item id | 
 **itemReservationId** | **String**| Item id | 

### Return type

[**ItemReservation**](ItemReservation.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listItems"></a>
# **listItems**
> [Item] listItems(opts)

List items

List items

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.ItemsApi();

var opts = { 
  'categoryIds': "categoryIds_example", // String | Filter by category ids (comma delimitered)
  'locationIds': "locationIds_example", // String | Filter by location ids (comma delimitered)
  'userIds': "userIds_example", // String | Filter by user ids (comma delimitered)
  'search': "search_example", // String | Search by free-text query
  'nearLat': 1.2, // Number | Prefer results near geo-point
  'nearLon': 1.2, // Number | Prefer results near geo-point
  'includeExhausted': true, // Boolean | Whether to include items without any items in stock. Defaults to false
  'sort': ["sort_example"], // [String] | 
  'firstResult': 789, // Number | First result
  'maxResults': 789 // Number | Max results
};
apiInstance.listItems(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryIds** | **String**| Filter by category ids (comma delimitered) | [optional] 
 **locationIds** | **String**| Filter by location ids (comma delimitered) | [optional] 
 **userIds** | **String**| Filter by user ids (comma delimitered) | [optional] 
 **search** | **String**| Search by free-text query | [optional] 
 **nearLat** | **Number**| Prefer results near geo-point | [optional] 
 **nearLon** | **Number**| Prefer results near geo-point | [optional] 
 **includeExhausted** | **Boolean**| Whether to include items without any items in stock. Defaults to false | [optional] 
 **sort** | [**[String]**](String.md)|  | [optional] 
 **firstResult** | **Number**| First result | [optional] 
 **maxResults** | **Number**| Max results | [optional] 

### Return type

[**[Item]**](Item.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateItem"></a>
# **updateItem**
> Item updateItem(itemId, payload)

updates an item

Update item

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.ItemsApi();

var itemId = "itemId_example"; // String | Item id

var payload = new DcfbApiClient.Item(); // Item | Payload

apiInstance.updateItem(itemId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **String**| Item id | 
 **payload** | [**Item**](Item.md)| Payload | 

### Return type

[**Item**](Item.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

