# ImagesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2ImagesPost**](ImagesApi.md#apiV2ImagesPost) | **POST** api/v2/images | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ImagesApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<MediaModel> = webService.apiV2ImagesPost()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;MediaModel&gt;**](MediaModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

