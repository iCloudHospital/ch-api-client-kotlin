# SpecialtyTypeLocalesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SpecialtytypesSpecialtyTypeIdLocalesLanguageCodeGet**](SpecialtyTypeLocalesApi.md#apiV1SpecialtytypesSpecialtyTypeIdLocalesLanguageCodeGet) | **GET** api/v1/specialtytypes/{specialtyTypeId}/locales/{languageCode} | Get specialtyType locale
[**apiV1SpecialtytypesSpecialtyTypeIdLocalesLanguageCodePut**](SpecialtyTypeLocalesApi.md#apiV1SpecialtytypesSpecialtyTypeIdLocalesLanguageCodePut) | **PUT** api/v1/specialtytypes/{specialtyTypeId}/locales/{languageCode} | Update specialtyType locale



Get specialtyType locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtyTypeLocalesApi::class.java)
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : SpecialtyTypeLocaleViewModel = webService.apiV1SpecialtytypesSpecialtyTypeIdLocalesLanguageCodeGet(specialtyTypeId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |

### Return type

[**SpecialtyTypeLocaleViewModel**](SpecialtyTypeLocaleViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update specialtyType locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtyTypeLocalesApi::class.java)
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val updateSpecialtyTypeLocaleCommand : UpdateSpecialtyTypeLocaleCommand =  // UpdateSpecialtyTypeLocaleCommand | 

launch(Dispatchers.IO) {
    val result : SpecialtyTypeLocaleViewModel = webService.apiV1SpecialtytypesSpecialtyTypeIdLocalesLanguageCodePut(specialtyTypeId, languageCode, updateSpecialtyTypeLocaleCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |
 **updateSpecialtyTypeLocaleCommand** | [**UpdateSpecialtyTypeLocaleCommand**](UpdateSpecialtyTypeLocaleCommand.md)|  | [optional]

### Return type

[**SpecialtyTypeLocaleViewModel**](SpecialtyTypeLocaleViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

