# SearchApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SearchAutocompleteGet**](SearchApi.md#apiV1SearchAutocompleteGet) | **GET** api/v1/search/autocomplete | 
[**apiV1SearchDealsGet**](SearchApi.md#apiV1SearchDealsGet) | **GET** api/v1/search/deals | 
[**apiV1SearchDoctorsGet**](SearchApi.md#apiV1SearchDoctorsGet) | **GET** api/v1/search/doctors | 
[**apiV1SearchGetcountGet**](SearchApi.md#apiV1SearchGetcountGet) | **GET** api/v1/search/getcount | 
[**apiV1SearchHospitalsGet**](SearchApi.md#apiV1SearchHospitalsGet) | **GET** api/v1/search/hospitals | 
[**apiV1SearchSpecialtiesGet**](SearchApi.md#apiV1SearchSpecialtiesGet) | **GET** api/v1/search/specialties | 
[**apiV1SearchSpecialtytypesGet**](SearchApi.md#apiV1SearchSpecialtytypesGet) | **GET** api/v1/search/specialtytypes | 
[**apiV1SearchSuggestGet**](SearchApi.md#apiV1SearchSuggestGet) | **GET** api/v1/search/suggest | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SearchApi::class.java)
val mode : AutocompleteMode =  // AutocompleteMode | 
val keyword : kotlin.String = keyword_example // kotlin.String | 
val fuzzy : kotlin.Boolean = true // kotlin.Boolean | 
val highlights : kotlin.Boolean = true // kotlin.Boolean | 
val size : kotlin.Int = 56 // kotlin.Int | 
val minimumCoverage : kotlin.Double = 1.2 // kotlin.Double | 

launch(Dispatchers.IO) {
    val result : AzureSearchServiceAutocompleteModel = webService.apiV1SearchAutocompleteGet(mode, keyword, fuzzy, highlights, size, minimumCoverage)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mode** | [**AutocompleteMode**](.md)|  | [optional] [enum: OneTerm, TwoTerms, OneTermWithContext]
 **keyword** | **kotlin.String**|  | [optional]
 **fuzzy** | **kotlin.Boolean**|  | [optional]
 **highlights** | **kotlin.Boolean**|  | [optional]
 **size** | **kotlin.Int**|  | [optional]
 **minimumCoverage** | **kotlin.Double**|  | [optional]

### Return type

[**AzureSearchServiceAutocompleteModel**](AzureSearchServiceAutocompleteModel.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DealsViewModel = webService.apiV1SearchDealsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTerm** | **kotlin.String**|  | [optional]
 **countOnly** | **kotlin.Boolean**|  | [optional]
 **countryId** | **kotlin.String**|  | [optional]
 **hospitalId** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **languageCode** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DealsViewModel**](DealsViewModel.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DoctorsViewModel = webService.apiV1SearchDoctorsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTerm** | **kotlin.String**|  | [optional]
 **countOnly** | **kotlin.Boolean**|  | [optional]
 **countryId** | **kotlin.String**|  | [optional]
 **hospitalId** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **languageCode** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DoctorsViewModel**](DoctorsViewModel.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : AzureSearchViewModel = webService.apiV1SearchGetcountGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTerm** | **kotlin.String**|  | [optional]
 **countOnly** | **kotlin.Boolean**|  | [optional]
 **countryId** | **kotlin.String**|  | [optional]
 **hospitalId** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **languageCode** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**AzureSearchViewModel**](AzureSearchViewModel.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : HospitalsViewModel = webService.apiV1SearchHospitalsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTerm** | **kotlin.String**|  | [optional]
 **countOnly** | **kotlin.Boolean**|  | [optional]
 **countryId** | **kotlin.String**|  | [optional]
 **hospitalId** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **languageCode** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalsViewModel**](HospitalsViewModel.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : SpecialtiesViewModel = webService.apiV1SearchSpecialtiesGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTerm** | **kotlin.String**|  | [optional]
 **countOnly** | **kotlin.Boolean**|  | [optional]
 **countryId** | **kotlin.String**|  | [optional]
 **hospitalId** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **languageCode** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**SpecialtiesViewModel**](SpecialtiesViewModel.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : SpecialtyTypesViewModel = webService.apiV1SearchSpecialtytypesGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTerm** | **kotlin.String**|  | [optional]
 **countOnly** | **kotlin.Boolean**|  | [optional]
 **countryId** | **kotlin.String**|  | [optional]
 **hospitalId** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **languageCode** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**SpecialtyTypesViewModel**](SpecialtyTypesViewModel.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val keyword : kotlin.String = keyword_example // kotlin.String | 
val fuzzy : kotlin.Boolean = true // kotlin.Boolean | 
val highlights : kotlin.Boolean = true // kotlin.Boolean | 
val size : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : AzureSearchServiceSuggestModel = webService.apiV1SearchSuggestGet(keyword, fuzzy, highlights, size)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **kotlin.String**|  | [optional]
 **fuzzy** | **kotlin.Boolean**|  | [optional]
 **highlights** | **kotlin.Boolean**|  | [optional]
 **size** | **kotlin.Int**|  | [optional]

### Return type

[**AzureSearchServiceSuggestModel**](AzureSearchServiceSuggestModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

