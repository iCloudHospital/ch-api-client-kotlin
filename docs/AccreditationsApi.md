# AccreditationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1AccreditationsAccreditationIdDelete**](AccreditationsApi.md#apiV1AccreditationsAccreditationIdDelete) | **DELETE** api/v1/accreditations/{accreditationId} | 
[**apiV1AccreditationsAccreditationIdGet**](AccreditationsApi.md#apiV1AccreditationsAccreditationIdGet) | **GET** api/v1/accreditations/{accreditationId} | 
[**apiV1AccreditationsAccreditationIdPut**](AccreditationsApi.md#apiV1AccreditationsAccreditationIdPut) | **PUT** api/v1/accreditations/{accreditationId} | 
[**apiV1AccreditationsGet**](AccreditationsApi.md#apiV1AccreditationsGet) | **GET** api/v1/accreditations | 
[**apiV1AccreditationsPost**](AccreditationsApi.md#apiV1AccreditationsPost) | **POST** api/v1/accreditations | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AccreditationsApi::class.java)
val accreditationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1AccreditationsAccreditationIdDelete(accreditationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accreditationId** | [**java.util.UUID**](.md)|  |

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
val webService = apiClient.createWebservice(AccreditationsApi::class.java)
val accreditationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : AccreditationViewModel = webService.apiV1AccreditationsAccreditationIdGet(accreditationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accreditationId** | [**java.util.UUID**](.md)|  |

### Return type

[**AccreditationViewModel**](AccreditationViewModel.md)

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
val webService = apiClient.createWebservice(AccreditationsApi::class.java)
val accreditationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateAccreditationCommand : UpdateAccreditationCommand =  // UpdateAccreditationCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1AccreditationsAccreditationIdPut(accreditationId, updateAccreditationCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accreditationId** | [**java.util.UUID**](.md)|  |
 **updateAccreditationCommand** | [**UpdateAccreditationCommand**](UpdateAccreditationCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

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
val webService = apiClient.createWebservice(AccreditationsApi::class.java)
val name : kotlin.String = name_example // kotlin.String | 
val logo : kotlin.String = logo_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : AccreditationsViewModel = webService.apiV1AccreditationsGet(name, logo, country, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [optional]
 **logo** | **kotlin.String**|  | [optional]
 **country** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**AccreditationsViewModel**](AccreditationsViewModel.md)

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
val webService = apiClient.createWebservice(AccreditationsApi::class.java)
val createAccreditationCommand : CreateAccreditationCommand =  // CreateAccreditationCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1AccreditationsPost(createAccreditationCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAccreditationCommand** | [**CreateAccreditationCommand**](CreateAccreditationCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

