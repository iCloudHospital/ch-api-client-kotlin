# IdentityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1IdentityGet**](IdentityApi.md#apiV1IdentityGet) | **GET** /api/v1/identity | Get current user&#39;s Identity claims.


<a name="apiV1IdentityGet"></a>
# **apiV1IdentityGet**
> apiV1IdentityGet()

Get current user&#39;s Identity claims.

Smaple request:        GET /api/v1/identity

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IdentityApi()
try {
    apiInstance.apiV1IdentityGet()
} catch (e: ClientException) {
    println("4xx response calling IdentityApi#apiV1IdentityGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdentityApi#apiV1IdentityGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

