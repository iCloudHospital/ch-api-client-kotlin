# MoviesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1MoviesPost**](MoviesApi.md#apiV1MoviesPost) | **POST** /api/v1/movies | 


<a name="apiV1MoviesPost"></a>
# **apiV1MoviesPost**
> apiV1MoviesPost()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoviesApi()
try {
    apiInstance.apiV1MoviesPost()
} catch (e: ClientException) {
    println("4xx response calling MoviesApi#apiV1MoviesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoviesApi#apiV1MoviesPost")
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

