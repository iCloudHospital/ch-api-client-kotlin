# LanguagesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2LanguagesCodeGet**](LanguagesApi.md#apiV2LanguagesCodeGet) | **GET** api/v2/languages/{code} | Get Language.
[**apiV2LanguagesGet**](LanguagesApi.md#apiV2LanguagesGet) | **GET** api/v2/languages | Get all Languages.



Get Language.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LanguagesApi::class.java)
val code : kotlin.String = code_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : LanguageModel = webService.apiV2LanguagesCodeGet(code)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

[**LanguageModel**](LanguageModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all Languages.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LanguagesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val code : kotlin.String = code_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : LanguagesModel = webService.apiV2LanguagesGet(id, name, code, description, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **code** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**LanguagesModel**](LanguagesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

