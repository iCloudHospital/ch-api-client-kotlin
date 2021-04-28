# ReviewersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ReviewersGet**](ReviewersApi.md#apiV1ReviewersGet) | **GET** api/v1/reviewers | Get all reviewers.
[**apiV1ReviewersReviewerIdGet**](ReviewersApi.md#apiV1ReviewersReviewerIdGet) | **GET** api/v1/reviewers/{reviewerId} | Get reviewer.
[**apiV1ReviewersSlugsSlugGet**](ReviewersApi.md#apiV1ReviewersSlugsSlugGet) | **GET** api/v1/reviewers/slugs/{slug} | Get reviewer by slug.



Get all reviewers.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ReviewersApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : ReviewersViewModel = webService.apiV1ReviewersGet(id, languageCode, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**ReviewersViewModel**](ReviewersViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get reviewer.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ReviewersApi::class.java)
val reviewerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : ReviewerViewModel = webService.apiV1ReviewersReviewerIdGet(reviewerId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewerId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**ReviewerViewModel**](ReviewerViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get reviewer by slug.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ReviewersApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : ReviewerViewModel = webService.apiV1ReviewersSlugsSlugGet(slug, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**ReviewerViewModel**](ReviewerViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

