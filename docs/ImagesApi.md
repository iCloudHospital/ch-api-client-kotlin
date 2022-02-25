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
    val result : kotlin.collections.List<MediaViewModel> = webService.apiV1ImagesPost()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;MediaViewModel&gt;**](MediaViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

