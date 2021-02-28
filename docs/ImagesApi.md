# ImagesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ImagesPost**](ImagesApi.md#apiV1ImagesPost) | **POST** api/v1/images | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ImagesApi::class.java)

launch(Dispatchers.IO) {
    webService.apiV1ImagesPost()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

