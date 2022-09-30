# DoctorAffiliationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2DoctoraffiliationsDoctorAffiliationIdMediasGet**](DoctorAffiliationsApi.md#apiV2DoctoraffiliationsDoctorAffiliationIdMediasGet) | **GET** api/v2/doctoraffiliations/{doctorAffiliationId}/medias | Get all DoctorAffiliationMedias.
[**apiV2DoctoraffiliationsDoctorAffiliationIdMediasMediaIdGet**](DoctorAffiliationsApi.md#apiV2DoctoraffiliationsDoctorAffiliationIdMediasMediaIdGet) | **GET** api/v2/doctoraffiliations/{doctorAffiliationId}/medias/{mediaId} | Get DoctorAffiliationMedia.
[**apiV2DoctoraffiliationsGet**](DoctorAffiliationsApi.md#apiV2DoctoraffiliationsGet) | **GET** api/v2/doctoraffiliations | Get all doctor affiliations.
[**apiV2DoctoraffiliationsIdGet**](DoctorAffiliationsApi.md#apiV2DoctoraffiliationsIdGet) | **GET** api/v2/doctoraffiliations/{id} | Get doctor affiliation.
[**apiV2DoctoraffiliationsSlugGet**](DoctorAffiliationsApi.md#apiV2DoctoraffiliationsSlugGet) | **GET** api/v2/doctoraffiliations/{slug} | 



Get all DoctorAffiliationMedias.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorAffiliationsApi::class.java)
val doctorAffiliationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaType : MediaType =  // MediaType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : MediasModel = webService.apiV2DoctoraffiliationsDoctorAffiliationIdMediasGet(doctorAffiliationId, id, mediaType, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorAffiliationId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  | [optional]
 **mediaType** | [**MediaType**](.md)|  | [optional] [enum: Photo, Video, Youtube, Document, Frontal, Diagonal, Side]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**MediasModel**](MediasModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get DoctorAffiliationMedia.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorAffiliationsApi::class.java)
val doctorAffiliationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : MediaModel = webService.apiV2DoctoraffiliationsDoctorAffiliationIdMediasMediaIdGet(doctorAffiliationId, mediaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorAffiliationId** | **java.util.UUID**|  |
 **mediaId** | **java.util.UUID**|  |

### Return type

[**MediaModel**](MediaModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all doctor affiliations.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorAffiliationsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val doctorSlug : kotlin.String = doctorSlug_example // kotlin.String | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingType : MarketingType =  // MarketingType | 
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val exceptDoctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val consultationEnabled : kotlin.Boolean = true // kotlin.Boolean | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorAffiliationsModel = webService.apiV2DoctoraffiliationsGet(hospitalId, hospitalName, doctorId, doctorName, doctorSlug, specialtyId, marketingType, countryId, exceptDoctorId, consultationEnabled, languageCode, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **doctorId** | **java.util.UUID**|  | [optional]
 **doctorName** | **kotlin.String**|  | [optional]
 **doctorSlug** | **kotlin.String**|  | [optional]
 **specialtyId** | **java.util.UUID**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **countryId** | **java.util.UUID**|  | [optional]
 **exceptDoctorId** | **java.util.UUID**|  | [optional]
 **consultationEnabled** | **kotlin.Boolean**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorAffiliationsModel**](DoctorAffiliationsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get doctor affiliation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorAffiliationsApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : DoctorAffiliationModel = webService.apiV2DoctoraffiliationsIdGet(id, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]

### Return type

[**DoctorAffiliationModel**](DoctorAffiliationModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorAffiliationsApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : DoctorAffiliationModel = webService.apiV2DoctoraffiliationsSlugGet(slug, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional]

### Return type

[**DoctorAffiliationModel**](DoctorAffiliationModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

