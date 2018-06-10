# DcfbApiClient.ItemsApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createItem**](ItemsApi.md#createItem) | **POST** /items | Create item
[**deleteItem**](ItemsApi.md#deleteItem) | **DELETE** /items/{itemId} | deletes an item
[**findItem**](ItemsApi.md#findItem) | **GET** /items/{itemId} | Finds an item
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

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

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

[basicAuth](../README.md#basicAuth)

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

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

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

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findItem"></a>
# **findItem**
> [Item] findItem(itemId)

Finds an item

Find item

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

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

[**[Item]**](Item.md)

### Authorization

[basicAuth](../README.md#basicAuth)

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

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new DcfbApiClient.ItemsApi();

var opts = { 
  'categoryIds': "categoryIds_example", // String | Filter by category ids (comma delimitered)
  'search': "search_example", // String | Search  by free-text query
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
 **search** | **String**| Search  by free-text query | [optional] 
 **firstResult** | **Number**| First result | [optional] 
 **maxResults** | **Number**| Max results | [optional] 

### Return type

[**[Item]**](Item.md)

### Authorization

[basicAuth](../README.md#basicAuth)

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

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

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

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

