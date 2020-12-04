# IdentityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1IdentityGet**](IdentityApi.md#apiV1IdentityGet) | **GET** api/v1/identity | Get current user&#39;s Identity claims.



Get current user&#39;s Identity claims.

Smaple request:        GET /api/v1/identity

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(IdentityApi::class.java)

webService.apiV1IdentityGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

