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
val files : kotlin.collections.List<java.io.File> = /path/to/file.txt // kotlin.collections.List<java.io.File> | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<MediaModel> = webService.apiV2ImagesPost(files)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **files** | **kotlin.collections.List&lt;java.io.File&gt;**|  | [optional]

### Return type

[**kotlin.collections.List&lt;MediaModel&gt;**](MediaModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

