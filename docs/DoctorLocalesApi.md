# DoctorLocalesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsDoctorIdLocalesLanguageCodeGet**](DoctorLocalesApi.md#apiV1DoctorsDoctorIdLocalesLanguageCodeGet) | **GET** api/v1/doctors/{doctorId}/locales/{languageCode} | Get doctor locale
[**apiV1DoctorsDoctorIdLocalesLanguageCodePut**](DoctorLocalesApi.md#apiV1DoctorsDoctorIdLocalesLanguageCodePut) | **PUT** api/v1/doctors/{doctorId}/locales/{languageCode} | Update doctor locale



Get doctor locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorLocalesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : DoctorLocaleViewModel = webService.apiV1DoctorsDoctorIdLocalesLanguageCodeGet(doctorId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |

### Return type

[**DoctorLocaleViewModel**](DoctorLocaleViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update doctor locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorLocalesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val updateDoctorLocaleCommand : UpdateDoctorLocaleCommand =  // UpdateDoctorLocaleCommand | 

launch(Dispatchers.IO) {
    val result : DoctorLocaleViewModel = webService.apiV1DoctorsDoctorIdLocalesLanguageCodePut(doctorId, languageCode, updateDoctorLocaleCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |
 **updateDoctorLocaleCommand** | [**UpdateDoctorLocaleCommand**](UpdateDoctorLocaleCommand.md)|  | [optional]

### Return type

[**DoctorLocaleViewModel**](DoctorLocaleViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

