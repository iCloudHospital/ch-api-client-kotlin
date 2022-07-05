# SearchApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2SearchAutocompleteGet**](SearchApi.md#apiV2SearchAutocompleteGet) | **GET** api/v2/search/autocomplete | 
[**apiV2SearchDealsGet**](SearchApi.md#apiV2SearchDealsGet) | **GET** api/v2/search/deals | 
[**apiV2SearchDoctorsGet**](SearchApi.md#apiV2SearchDoctorsGet) | **GET** api/v2/search/doctors | 
[**apiV2SearchGetcountGet**](SearchApi.md#apiV2SearchGetcountGet) | **GET** api/v2/search/getcount | 
[**apiV2SearchHospitalsGet**](SearchApi.md#apiV2SearchHospitalsGet) | **GET** api/v2/search/hospitals | 
[**apiV2SearchSpecialtiesGet**](SearchApi.md#apiV2SearchSpecialtiesGet) | **GET** api/v2/search/specialties | 
[**apiV2SearchSpecialtytypesGet**](SearchApi.md#apiV2SearchSpecialtytypesGet) | **GET** api/v2/search/specialtytypes | 
[**apiV2SearchSuggestGet**](SearchApi.md#apiV2SearchSuggestGet) | **GET** api/v2/search/suggest | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SearchApi::class.java)
val keyword : kotlin.String = keyword_example // kotlin.String | 
val mode : AutocompleteMode =  // AutocompleteMode | 
val fuzzy : kotlin.Boolean = true // kotlin.Boolean | 
val highlights : kotlin.Boolean = true // kotlin.Boolean | 
val size : kotlin.Int = 56 // kotlin.Int | 
val minimumCoverage : kotlin.Double = 1.2 // kotlin.Double | 

launch(Dispatchers.IO) {
    val result : AzureSearchServiceAutocompleteModel = webService.apiV2SearchAutocompleteGet(keyword, mode, fuzzy, highlights, size, minimumCoverage)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **kotlin.String**|  |
 **mode** | [**AutocompleteMode**](.md)|  | [optional] [enum: OneTerm, TwoTerms, OneTermWithContext]
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

launch(Dispatchers.IO) {
    val result : DealsModel = webService.apiV2SearchDealsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved)
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

### Return type

[**DealsModel**](DealsModel.md)

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

launch(Dispatchers.IO) {
    val result : DoctorsModel = webService.apiV2SearchDoctorsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved)
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

### Return type

[**DoctorsModel**](DoctorsModel.md)

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

launch(Dispatchers.IO) {
    val result : AzureSearchModel = webService.apiV2SearchGetcountGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved)
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

### Return type

[**AzureSearchModel**](AzureSearchModel.md)

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

launch(Dispatchers.IO) {
    val result : HospitalsModel = webService.apiV2SearchHospitalsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved)
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

### Return type

[**HospitalsModel**](HospitalsModel.md)

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

launch(Dispatchers.IO) {
    val result : SpecialtiesModel = webService.apiV2SearchSpecialtiesGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved)
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

### Return type

[**SpecialtiesModel**](SpecialtiesModel.md)

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

launch(Dispatchers.IO) {
    val result : SpecialtyTypesModel = webService.apiV2SearchSpecialtytypesGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved)
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

### Return type

[**SpecialtyTypesModel**](SpecialtyTypesModel.md)

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
    val result : AzureSearchServiceSuggestModel = webService.apiV2SearchSuggestGet(keyword, fuzzy, highlights, size)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **kotlin.String**|  |
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

