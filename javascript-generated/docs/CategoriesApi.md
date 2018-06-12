# DcfbApiClient.CategoriesApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCategory**](CategoriesApi.md#createCategory) | **POST** /categories | Create category
[**deleteCategory**](CategoriesApi.md#deleteCategory) | **DELETE** /categories/{categoryId} | deletes an category
[**findCategory**](CategoriesApi.md#findCategory) | **GET** /categories/{categoryId} | Finds an category
[**listCategories**](CategoriesApi.md#listCategories) | **GET** /categories | List categories
[**updateCategory**](CategoriesApi.md#updateCategory) | **PUT** /categories/{categoryId} | updates an category


<a name="createCategory"></a>
# **createCategory**
> Category createCategory(payload)

Create category

Create category

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.CategoriesApi();

var payload = new DcfbApiClient.Category(); // Category | Payload

apiInstance.createCategory(payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Category**](Category.md)| Payload | 

### Return type

[**Category**](Category.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(categoryId)

deletes an category

Delete category

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.CategoriesApi();

var categoryId = "categoryId_example"; // String | Category id

apiInstance.deleteCategory(categoryId).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Category id | 

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findCategory"></a>
# **findCategory**
> Category findCategory(categoryId)

Finds an category

Find category

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.CategoriesApi();

var categoryId = "categoryId_example"; // String | Category id

apiInstance.findCategory(categoryId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Category id | 

### Return type

[**Category**](Category.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listCategories"></a>
# **listCategories**
> [Category] listCategories(opts)

List categories

List categories

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.CategoriesApi();

var opts = { 
  'firstResult': 789, // Number | First result
  'maxResults': 789 // Number | Max results
};
apiInstance.listCategories(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstResult** | **Number**| First result | [optional] 
 **maxResults** | **Number**| Max results | [optional] 

### Return type

[**[Category]**](Category.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateCategory"></a>
# **updateCategory**
> Category updateCategory(categoryId, payload)

updates an category

Update category

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.CategoriesApi();

var categoryId = "categoryId_example"; // String | Category id

var payload = new DcfbApiClient.Category(); // Category | Payload

apiInstance.updateCategory(categoryId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Category id | 
 **payload** | [**Category**](Category.md)| Payload | 

### Return type

[**Category**](Category.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

