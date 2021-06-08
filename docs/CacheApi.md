# CacheApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1CacheKeyDelete**](CacheApi.md#apiV1CacheKeyDelete) | **DELETE** api/v1/cache/{key} | Remove cache with specified key



Remove cache with specified key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CacheApi::class.java)
val key : kotlin.String = key_example // kotlin.String | 

val result : kotlin.Boolean = webService.apiV1CacheKeyDelete(key)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  |

### Return type

**kotlin.Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

