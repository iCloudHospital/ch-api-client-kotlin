# AboutUsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2AboutusGet**](AboutUsApi.md#apiV2AboutusGet) | **GET** api/v2/aboutus | Get all AboutUsList.
[**apiV2AboutusHospitalIdGet**](AboutUsApi.md#apiV2AboutusHospitalIdGet) | **GET** api/v2/aboutus/{hospitalId} | Get AboutUs.
[**apiV2AboutusSlugGet**](AboutUsApi.md#apiV2AboutusSlugGet) | **GET** api/v2/aboutus/{slug} | 



Get all AboutUsList.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AboutUsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val hospitalSlug : kotlin.String = hospitalSlug_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 
val confirmed : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : AboutUsPagesModel = webService.apiV2AboutusGet(hospitalId, hospitalName, hospitalSlug, name, languageCode, returnDefaultValue, confirmed, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **hospitalSlug** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]
 **confirmed** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**AboutUsPagesModel**](AboutUsPagesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get AboutUs.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AboutUsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : AboutUsPageModel = webService.apiV2AboutusHospitalIdGet(hospitalId, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**AboutUsPageModel**](AboutUsPageModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AboutUsApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : AboutUsPageModel = webService.apiV2AboutusSlugGet(slug, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**AboutUsPageModel**](AboutUsPageModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

