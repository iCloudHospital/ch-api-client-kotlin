# SpecialtyLocalesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SpecialtiesSpecialtyIdLocalesLanguageCodeGet**](SpecialtyLocalesApi.md#apiV1SpecialtiesSpecialtyIdLocalesLanguageCodeGet) | **GET** api/v1/specialties/{specialtyId}/locales/{languageCode} | Get specialty locale
[**apiV1SpecialtiesSpecialtyIdLocalesLanguageCodePut**](SpecialtyLocalesApi.md#apiV1SpecialtiesSpecialtyIdLocalesLanguageCodePut) | **PUT** api/v1/specialties/{specialtyId}/locales/{languageCode} | Update specialty locale



Get specialty locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtyLocalesApi::class.java)
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : SpecialtyLocaleViewModel = webService.apiV1SpecialtiesSpecialtyIdLocalesLanguageCodeGet(specialtyId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |

### Return type

[**SpecialtyLocaleViewModel**](SpecialtyLocaleViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update specialty locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtyLocalesApi::class.java)
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val updateSpecialtyLocaleCommand : UpdateSpecialtyLocaleCommand =  // UpdateSpecialtyLocaleCommand | 

launch(Dispatchers.IO) {
    val result : SpecialtyLocaleViewModel = webService.apiV1SpecialtiesSpecialtyIdLocalesLanguageCodePut(specialtyId, languageCode, updateSpecialtyLocaleCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |
 **updateSpecialtyLocaleCommand** | [**UpdateSpecialtyLocaleCommand**](UpdateSpecialtyLocaleCommand.md)|  | [optional]

### Return type

[**SpecialtyLocaleViewModel**](SpecialtyLocaleViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

