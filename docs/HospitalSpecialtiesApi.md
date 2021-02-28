# HospitalSpecialtiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdDelete**](HospitalSpecialtiesApi.md#apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdDelete) | **DELETE** api/v1/hospitals/{hospitalId}/specialties/{specialtyId} | Delete hospitalSpecialty.
[**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPost**](HospitalSpecialtiesApi.md#apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPost) | **POST** api/v1/hospitals/{hospitalId}/specialties/{specialtyId} | Create hospitalSpecialty.
[**apiV1HospitalsHospitalIdSpecialtysequencePut**](HospitalSpecialtiesApi.md#apiV1HospitalsHospitalIdSpecialtysequencePut) | **PUT** api/v1/hospitals/{hospitalId}/specialtysequence | Update hospitalSpecialty sequence.
[**apiV1HospitalsSpecialtiesGet**](HospitalSpecialtiesApi.md#apiV1HospitalsSpecialtiesGet) | **GET** api/v1/hospitals/specialties | Get all hospitalSpecialties.



Delete hospitalSpecialty.

Sample request:        DELETE /api/v1/hospitals/1/specialties/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalSpecialtiesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdDelete(hospitalId, specialtyId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create hospitalSpecialty.

Sample request:        POST /api/v1/hospitals/1/specialties/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalSpecialtiesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : HospitalSpecialtyViewModel = webService.apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPost(hospitalId, specialtyId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |

### Return type

[**HospitalSpecialtyViewModel**](HospitalSpecialtyViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update hospitalSpecialty sequence.

Sample request:        PUT /api/v1/hospitals/1/specialtysequence      {          \&quot;specialtyType\&quot;: \&quot;Endocrinology\&quot;,          \&quot;hospitalSpecialtySequence\&quot;: [14, 30, 5, 7]      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalSpecialtiesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateHospitalSpecialtySequenceCommand : UpdateHospitalSpecialtySequenceCommand =  // UpdateHospitalSpecialtySequenceCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdSpecialtysequencePut(hospitalId, specialtyTypeId, updateHospitalSpecialtySequenceCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **specialtyTypeId** | [**java.util.UUID**](.md)|  |
 **updateHospitalSpecialtySequenceCommand** | [**UpdateHospitalSpecialtySequenceCommand**](UpdateHospitalSpecialtySequenceCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all hospitalSpecialties.

Sample request:        GET /api/v1/hospitals/specialties

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalSpecialtiesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyName : kotlin.String = specialtyName_example // kotlin.String | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingType : MarketingType =  // MarketingType | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : HospitalSpecialtiesViewModel = webService.apiV1HospitalsSpecialtiesGet(hospitalId, hospitalName, specialtyId, specialtyName, specialtyTypeId, marketingType, created, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **specialtyId** | [**java.util.UUID**](.md)|  | [optional]
 **specialtyName** | **kotlin.String**|  | [optional]
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalSpecialtiesViewModel**](HospitalSpecialtiesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

