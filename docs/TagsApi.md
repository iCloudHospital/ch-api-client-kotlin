# TagsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1TagsGet**](TagsApi.md#apiV1TagsGet) | **GET** api/v1/tags | 
[**apiV1TagsPost**](TagsApi.md#apiV1TagsPost) | **POST** api/v1/tags | 
[**apiV1TagsTagIdDelete**](TagsApi.md#apiV1TagsTagIdDelete) | **DELETE** api/v1/tags/{tagId} | 
[**apiV1TagsTagIdGet**](TagsApi.md#apiV1TagsTagIdGet) | **GET** api/v1/tags/{tagId} | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TagsApi::class.java)
val tagId : kotlin.String = tagId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : TagsViewModel = webService.apiV1TagsGet(tagId, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**TagsViewModel**](TagsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TagsApi::class.java)
val createTagCommand : CreateTagCommand =  // CreateTagCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.apiV1TagsPost(createTagCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTagCommand** | [**CreateTagCommand**](CreateTagCommand.md)|  | [optional]

### Return type

**kotlin.String**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TagsApi::class.java)
val tagId : kotlin.String = tagId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1TagsTagIdDelete(tagId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **kotlin.String**|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TagsApi::class.java)
val tagId : kotlin.String = tagId_example // kotlin.String | 
val releatedTags : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : TagViewModel = webService.apiV1TagsTagIdGet(tagId, releatedTags)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **kotlin.String**|  |
 **releatedTags** | **kotlin.Boolean**|  | [optional]

### Return type

[**TagViewModel**](TagViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

