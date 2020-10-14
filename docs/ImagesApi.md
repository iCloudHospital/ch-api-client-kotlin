# ImagesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ImagesPost**](ImagesApi.md#apiV1ImagesPost) | **POST** /api/v1/images | 


<a name="apiV1ImagesPost"></a>
# **apiV1ImagesPost**
> apiV1ImagesPost()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
try {
    apiInstance.apiV1ImagesPost()
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#apiV1ImagesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#apiV1ImagesPost")
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

