# TagsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2TagsGet**](TagsApi.md#apiV2TagsGet) | **GET** api/v2/tags | Get all Tags.
[**apiV2TagsTagIdGet**](TagsApi.md#apiV2TagsTagIdGet) | **GET** api/v2/tags/{tagId} | Get Tag.



Get all Tags.

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
    val result : TagsModel = webService.apiV2TagsGet(tagId, page, limit, lastRetrieved)
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

[**TagsModel**](TagsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Tag.

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
    val result : TagModel = webService.apiV2TagsTagIdGet(tagId, releatedTags)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **kotlin.String**|  |
 **releatedTags** | **kotlin.Boolean**|  | [optional]

### Return type

[**TagModel**](TagModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

