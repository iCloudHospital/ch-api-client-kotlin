# ServiceLocalesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ServicesServiceIdLocalesLanguageCodeGet**](ServiceLocalesApi.md#apiV1ServicesServiceIdLocalesLanguageCodeGet) | **GET** api/v1/services/{serviceId}/locales/{languageCode} | Get service locale
[**apiV1ServicesServiceIdLocalesLanguageCodePut**](ServiceLocalesApi.md#apiV1ServicesServiceIdLocalesLanguageCodePut) | **PUT** api/v1/services/{serviceId}/locales/{languageCode} | Update service locale



Get service locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceLocalesApi::class.java)
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : ServiceLocaleViewModel = webService.apiV1ServicesServiceIdLocalesLanguageCodeGet(serviceId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |

### Return type

[**ServiceLocaleViewModel**](ServiceLocaleViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update service locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceLocalesApi::class.java)
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val updateServiceLocaleCommand : UpdateServiceLocaleCommand =  // UpdateServiceLocaleCommand | 

launch(Dispatchers.IO) {
    val result : ServiceLocaleViewModel = webService.apiV1ServicesServiceIdLocalesLanguageCodePut(serviceId, languageCode, updateServiceLocaleCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |
 **updateServiceLocaleCommand** | [**UpdateServiceLocaleCommand**](UpdateServiceLocaleCommand.md)|  | [optional]

### Return type

[**ServiceLocaleViewModel**](ServiceLocaleViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

