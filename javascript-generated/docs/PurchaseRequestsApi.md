# DcfbApiClient.PurchaseRequestsApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPurchaseRequest**](PurchaseRequestsApi.md#createPurchaseRequest) | **POST** /purchaseRequests | Create purchase request
[**deletePurchaseRequest**](PurchaseRequestsApi.md#deletePurchaseRequest) | **DELETE** /purchaseRequests/{purchaseRequestId} | deletes an purchase request
[**findPurchaseRequest**](PurchaseRequestsApi.md#findPurchaseRequest) | **GET** /purchaseRequests/{purchaseRequestId} | Finds an purchaseRequest
[**listPurchaseRequests**](PurchaseRequestsApi.md#listPurchaseRequests) | **GET** /purchaseRequests | List purchase requests
[**updatePurchaseRequest**](PurchaseRequestsApi.md#updatePurchaseRequest) | **PUT** /purchaseRequests/{purchaseRequestId} | updates an purchase request


<a name="createPurchaseRequest"></a>
# **createPurchaseRequest**
> PurchaseRequest createPurchaseRequest(payload)

Create purchase request

Create purchase request

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.PurchaseRequestsApi();

var payload = new DcfbApiClient.PurchaseRequest(); // PurchaseRequest | Payload

apiInstance.createPurchaseRequest(payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PurchaseRequest**](PurchaseRequest.md)| Payload | 

### Return type

[**PurchaseRequest**](PurchaseRequest.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deletePurchaseRequest"></a>
# **deletePurchaseRequest**
> deletePurchaseRequest(purchaseRequestId)

deletes an purchase request

Delete purchase request

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.PurchaseRequestsApi();

var purchaseRequestId = "purchaseRequestId_example"; // String | PurchaseRequest id

apiInstance.deletePurchaseRequest(purchaseRequestId).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseRequestId** | **String**| PurchaseRequest id | 

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findPurchaseRequest"></a>
# **findPurchaseRequest**
> [PurchaseRequest] findPurchaseRequest(purchaseRequestId)

Finds an purchaseRequest

Find purchaseRequest

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.PurchaseRequestsApi();

var purchaseRequestId = "purchaseRequestId_example"; // String | PurchaseRequest id

apiInstance.findPurchaseRequest(purchaseRequestId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseRequestId** | **String**| PurchaseRequest id | 

### Return type

[**[PurchaseRequest]**](PurchaseRequest.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listPurchaseRequests"></a>
# **listPurchaseRequests**
> [PurchaseRequest] listPurchaseRequests(opts)

List purchase requests

List purchase requests

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.PurchaseRequestsApi();

var opts = { 
  'categoryIds': "categoryIds_example", // String | Filter by category ids (comma delimitered)
  'search': "search_example", // String | Search  by free-text query
  'firstResult': 789, // Number | First result
  'maxResults': 789 // Number | Max results
};
apiInstance.listPurchaseRequests(opts).then(function(data) {
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

[**[PurchaseRequest]**](PurchaseRequest.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updatePurchaseRequest"></a>
# **updatePurchaseRequest**
> PurchaseRequest updatePurchaseRequest(purchaseRequestId, payload)

updates an purchase request

Update purchase request

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.PurchaseRequestsApi();

var purchaseRequestId = "purchaseRequestId_example"; // String | PurchaseRequest id

var payload = new DcfbApiClient.PurchaseRequest(); // PurchaseRequest | Payload

apiInstance.updatePurchaseRequest(purchaseRequestId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseRequestId** | **String**| PurchaseRequest id | 
 **payload** | [**PurchaseRequest**](PurchaseRequest.md)| Payload | 

### Return type

[**PurchaseRequest**](PurchaseRequest.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

