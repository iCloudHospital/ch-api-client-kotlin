# FaqsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1FaqsFaqIdGet**](FaqsApi.md#apiV1FaqsFaqIdGet) | **GET** api/v1/faqs/{faqId} | Get faq.
[**apiV1FaqsGet**](FaqsApi.md#apiV1FaqsGet) | **GET** api/v1/faqs | Get all faq.
[**apiV1FaqsSlugsSlugGet**](FaqsApi.md#apiV1FaqsSlugsSlugGet) | **GET** api/v1/faqs/slugs/{slug} | Get faq by slug.



Get faq.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FaqsApi::class.java)
val faqId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : FaqViewModel = webService.apiV1FaqsFaqIdGet(faqId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**FaqViewModel**](FaqViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get all faq.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FaqsApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val title : kotlin.String = title_example // kotlin.String | 
val content : kotlin.String = content_example // kotlin.String | 
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : FaqsViewModel = webService.apiV1FaqsGet(id, title, content, categoryId, languageCode, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **title** | **kotlin.String**|  | [optional]
 **content** | **kotlin.String**|  | [optional]
 **categoryId** | [**java.util.UUID**](.md)|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**FaqsViewModel**](FaqsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get faq by slug.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FaqsApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : FaqViewModel = webService.apiV1FaqsSlugsSlugGet(slug, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**FaqViewModel**](FaqViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

