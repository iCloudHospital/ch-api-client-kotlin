# CountryLocalesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1CountriesCountryIdLocalesLanguageCodeGet**](CountryLocalesApi.md#apiV1CountriesCountryIdLocalesLanguageCodeGet) | **GET** api/v1/countries/{countryId}/locales/{languageCode} | Get country locale
[**apiV1CountriesCountryIdLocalesLanguageCodePut**](CountryLocalesApi.md#apiV1CountriesCountryIdLocalesLanguageCodePut) | **PUT** api/v1/countries/{countryId}/locales/{languageCode} | Update country locale



Get country locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CountryLocalesApi::class.java)
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : CountryLocaleViewModel = webService.apiV1CountriesCountryIdLocalesLanguageCodeGet(countryId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |

### Return type

[**CountryLocaleViewModel**](CountryLocaleViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update country locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CountryLocalesApi::class.java)
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val updateCountryLocaleCommand : UpdateCountryLocaleCommand =  // UpdateCountryLocaleCommand | 

launch(Dispatchers.IO) {
    val result : CountryLocaleViewModel = webService.apiV1CountriesCountryIdLocalesLanguageCodePut(countryId, languageCode, updateCountryLocaleCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |
 **updateCountryLocaleCommand** | [**UpdateCountryLocaleCommand**](UpdateCountryLocaleCommand.md)|  | [optional]

### Return type

[**CountryLocaleViewModel**](CountryLocaleViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

