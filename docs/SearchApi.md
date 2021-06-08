# SearchApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SearchDealsGet**](SearchApi.md#apiV1SearchDealsGet) | **GET** api/v1/search/deals | 
[**apiV1SearchDoctorsGet**](SearchApi.md#apiV1SearchDoctorsGet) | **GET** api/v1/search/doctors | 
[**apiV1SearchGetcountGet**](SearchApi.md#apiV1SearchGetcountGet) | **GET** api/v1/search/getcount | 
[**apiV1SearchHospitalsGet**](SearchApi.md#apiV1SearchHospitalsGet) | **GET** api/v1/search/hospitals | 
[**apiV1SearchSpecialtiesGet**](SearchApi.md#apiV1SearchSpecialtiesGet) | **GET** api/v1/search/specialties | 
[**apiV1SearchSpecialtytypesGet**](SearchApi.md#apiV1SearchSpecialtytypesGet) | **GET** api/v1/search/specialtytypes | 





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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

val result : DealSearchResultViewModel = webService.apiV1SearchDealsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
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

[**DealSearchResultViewModel**](DealSearchResultViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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

val result : DoctorSearchResultViewModel = webService.apiV1SearchDoctorsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
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

[**DoctorSearchResultViewModel**](DoctorSearchResultViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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

val result : AzureSearchViewModel = webService.apiV1SearchGetcountGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
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
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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

val result : HospitalSearchResultViewModel = webService.apiV1SearchHospitalsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
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

[**HospitalSearchResultViewModel**](HospitalSearchResultViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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

val result : SpecialtySearchResultViewModel = webService.apiV1SearchSpecialtiesGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
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

[**SpecialtySearchResultViewModel**](SpecialtySearchResultViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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

val result : SpecialtyTypeSearchResultViewModel = webService.apiV1SearchSpecialtytypesGet(searchTerm, countOnly, countryId, hospitalId, marketingType, languageCode, page, limit, lastRetrieved, current)
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

[**SpecialtyTypeSearchResultViewModel**](SpecialtyTypeSearchResultViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

