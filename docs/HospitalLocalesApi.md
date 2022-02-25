# HospitalLocalesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsHospitalIdLocalesLanguageCodeGet**](HospitalLocalesApi.md#apiV1HospitalsHospitalIdLocalesLanguageCodeGet) | **GET** api/v1/hospitals/{hospitalId}/locales/{languageCode} | Get hospital locale
[**apiV1HospitalsHospitalIdLocalesLanguageCodePut**](HospitalLocalesApi.md#apiV1HospitalsHospitalIdLocalesLanguageCodePut) | **PUT** api/v1/hospitals/{hospitalId}/locales/{languageCode} | Update hospital locale



Get hospital locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalLocalesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : HospitalLocaleViewModel = webService.apiV1HospitalsHospitalIdLocalesLanguageCodeGet(hospitalId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |

### Return type

[**HospitalLocaleViewModel**](HospitalLocaleViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update hospital locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalLocalesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val updateHospitalLocaleCommand : UpdateHospitalLocaleCommand =  // UpdateHospitalLocaleCommand | 

launch(Dispatchers.IO) {
    val result : HospitalLocaleViewModel = webService.apiV1HospitalsHospitalIdLocalesLanguageCodePut(hospitalId, languageCode, updateHospitalLocaleCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |
 **updateHospitalLocaleCommand** | [**UpdateHospitalLocaleCommand**](UpdateHospitalLocaleCommand.md)|  | [optional]

### Return type

[**HospitalLocaleViewModel**](HospitalLocaleViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

