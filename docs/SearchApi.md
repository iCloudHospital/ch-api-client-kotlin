# SearchApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SearchDealsGet**](SearchApi.md#apiV1SearchDealsGet) | **GET** /api/v1/search/deals | 
[**apiV1SearchDoctorsGet**](SearchApi.md#apiV1SearchDoctorsGet) | **GET** /api/v1/search/doctors | 
[**apiV1SearchEquipmentsGet**](SearchApi.md#apiV1SearchEquipmentsGet) | **GET** /api/v1/search/equipments | 
[**apiV1SearchGetcountGet**](SearchApi.md#apiV1SearchGetcountGet) | **GET** /api/v1/search/getcount | 
[**apiV1SearchHospitalsGet**](SearchApi.md#apiV1SearchHospitalsGet) | **GET** /api/v1/search/hospitals | 
[**apiV1SearchSpecialtiesGet**](SearchApi.md#apiV1SearchSpecialtiesGet) | **GET** /api/v1/search/specialties | 


<a name="apiV1SearchDealsGet"></a>
# **apiV1SearchDealsGet**
> DealSearchResultViewModel apiV1SearchDealsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DealSearchResultViewModel = apiInstance.apiV1SearchDealsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchDealsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchDealsGet")
    e.printStackTrace()
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
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DealSearchResultViewModel**](DealSearchResultViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchDoctorsGet"></a>
# **apiV1SearchDoctorsGet**
> DoctorSearchResultViewModel apiV1SearchDoctorsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DoctorSearchResultViewModel = apiInstance.apiV1SearchDoctorsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchDoctorsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchDoctorsGet")
    e.printStackTrace()
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
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DoctorSearchResultViewModel**](DoctorSearchResultViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchEquipmentsGet"></a>
# **apiV1SearchEquipmentsGet**
> EquipmentSearchResultViewModel apiV1SearchEquipmentsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : EquipmentSearchResultViewModel = apiInstance.apiV1SearchEquipmentsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchEquipmentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchEquipmentsGet")
    e.printStackTrace()
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
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**EquipmentSearchResultViewModel**](EquipmentSearchResultViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchGetcountGet"></a>
# **apiV1SearchGetcountGet**
> AzureSearchViewModel apiV1SearchGetcountGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : AzureSearchViewModel = apiInstance.apiV1SearchGetcountGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchGetcountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchGetcountGet")
    e.printStackTrace()
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
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**AzureSearchViewModel**](AzureSearchViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchHospitalsGet"></a>
# **apiV1SearchHospitalsGet**
> HospitalSearchResultViewModel apiV1SearchHospitalsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : HospitalSearchResultViewModel = apiInstance.apiV1SearchHospitalsGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchHospitalsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchHospitalsGet")
    e.printStackTrace()
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
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalSearchResultViewModel**](HospitalSearchResultViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchSpecialtiesGet"></a>
# **apiV1SearchSpecialtiesGet**
> SpecialtySearchResultViewModel apiV1SearchSpecialtiesGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | 
val countOnly : kotlin.Boolean = true // kotlin.Boolean | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : SpecialtySearchResultViewModel = apiInstance.apiV1SearchSpecialtiesGet(searchTerm, countOnly, countryId, hospitalId, marketingType, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchSpecialtiesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchSpecialtiesGet")
    e.printStackTrace()
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
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**SpecialtySearchResultViewModel**](SpecialtySearchResultViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

