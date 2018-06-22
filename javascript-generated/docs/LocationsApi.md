# DcfbApiClient.LocationsApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLocation**](LocationsApi.md#createLocation) | **POST** /locations | Create location
[**deleteLocation**](LocationsApi.md#deleteLocation) | **DELETE** /locations/{locationId} | deletes an location
[**findLocation**](LocationsApi.md#findLocation) | **GET** /locations/{locationId} | Finds an location
[**listLocations**](LocationsApi.md#listLocations) | **GET** /locations | List locations
[**updateLocation**](LocationsApi.md#updateLocation) | **PUT** /locations/{locationId} | updates an location


<a name="createLocation"></a>
# **createLocation**
> Location createLocation(payload)

Create location

Create location

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.LocationsApi();

var payload = new DcfbApiClient.Location(); // Location | Payload

apiInstance.createLocation(payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Location**](Location.md)| Payload | 

### Return type

[**Location**](Location.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteLocation"></a>
# **deleteLocation**
> deleteLocation(locationId)

deletes an location

Delete location

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.LocationsApi();

var locationId = "locationId_example"; // String | Location id

apiInstance.deleteLocation(locationId).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| Location id | 

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findLocation"></a>
# **findLocation**
> Location findLocation(locationId)

Finds an location

Find location

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.LocationsApi();

var locationId = "locationId_example"; // String | Location id

apiInstance.findLocation(locationId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| Location id | 

### Return type

[**Location**](Location.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listLocations"></a>
# **listLocations**
> [Location] listLocations(opts)

List locations

List locations

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.LocationsApi();

var opts = { 
  'search': "search_example", // String | Search by free-text query
  'slug': "slug_example", // String | Filter by location slug
  'sort': ["sort_example"], // [String] | Sort results. See LocationListSort for sort options
  'firstResult': 789, // Number | First result
  'maxResults': 789 // Number | Max results
};
apiInstance.listLocations(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**| Search by free-text query | [optional] 
 **slug** | **String**| Filter by location slug | [optional] 
 **sort** | [**[String]**](String.md)| Sort results. See LocationListSort for sort options | [optional] 
 **firstResult** | **Number**| First result | [optional] 
 **maxResults** | **Number**| Max results | [optional] 

### Return type

[**[Location]**](Location.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateLocation"></a>
# **updateLocation**
> Location updateLocation(locationId, payload)

updates an location

Update location

### Example
```javascript
var DcfbApiClient = require('dcfb-api-client');
var defaultClient = DcfbApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new DcfbApiClient.LocationsApi();

var locationId = "locationId_example"; // String | Location id

var payload = new DcfbApiClient.Location(); // Location | Payload

apiInstance.updateLocation(locationId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| Location id | 
 **payload** | [**Location**](Location.md)| Payload | 

### Return type

[**Location**](Location.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

