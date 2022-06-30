# AccreditationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2AccreditationsAccreditationIdGet**](AccreditationsApi.md#apiV2AccreditationsAccreditationIdGet) | **GET** api/v2/accreditations/{accreditationId} | Get Accreditation.
[**apiV2AccreditationsGet**](AccreditationsApi.md#apiV2AccreditationsGet) | **GET** api/v2/accreditations | Get all Accreditations.



Get Accreditation.

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
    val result : AccreditationModel = webService.apiV2AccreditationsAccreditationIdGet(accreditationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accreditationId** | [**java.util.UUID**](.md)|  |

### Return type

[**AccreditationModel**](AccreditationModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all Accreditations.

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
    val result : AccreditationsModel = webService.apiV2AccreditationsGet(name, logo, country, page, limit, lastRetrieved)
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

[**AccreditationsModel**](AccreditationsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

