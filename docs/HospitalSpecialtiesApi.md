# HospitalSpecialtiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdDelete**](HospitalSpecialtiesApi.md#apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdDelete) | **DELETE** api/v1/hospitals/{hospitalId}/specialties/{specialtyId} | Delete hospitalSpecialty.
[**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPost**](HospitalSpecialtiesApi.md#apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPost) | **POST** api/v1/hospitals/{hospitalId}/specialties/{specialtyId} | Create hospitalSpecialty.
[**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPut**](HospitalSpecialtiesApi.md#apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPut) | **PUT** api/v1/hospitals/{hospitalId}/specialties/{specialtyId} | Update hospitalSpecialty.
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
val createHospitalSpecialtyCommand : CreateHospitalSpecialtyCommand =  // CreateHospitalSpecialtyCommand | 

launch(Dispatchers.IO) {
    val result : HospitalSpecialtyViewModel = webService.apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPost(hospitalId, specialtyId, createHospitalSpecialtyCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **createHospitalSpecialtyCommand** | [**CreateHospitalSpecialtyCommand**](CreateHospitalSpecialtyCommand.md)|  | [optional]

### Return type

[**HospitalSpecialtyViewModel**](HospitalSpecialtyViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Update hospitalSpecialty.

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
val updateHospitalSpecialtyCommand : UpdateHospitalSpecialtyCommand =  // UpdateHospitalSpecialtyCommand | 

launch(Dispatchers.IO) {
    val result : HospitalSpecialtyViewModel = webService.apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPut(hospitalId, specialtyId, updateHospitalSpecialtyCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **updateHospitalSpecialtyCommand** | [**UpdateHospitalSpecialtyCommand**](UpdateHospitalSpecialtyCommand.md)|  | [optional]

### Return type

[**HospitalSpecialtyViewModel**](HospitalSpecialtyViewModel.md)

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
val hospitalSlug : kotlin.String = hospitalSlug_example // kotlin.String | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyName : kotlin.String = specialtyName_example // kotlin.String | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingType : MarketingType =  // MarketingType | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalSpecialtiesViewModel = webService.apiV1HospitalsSpecialtiesGet(hospitalId, hospitalName, hospitalSlug, specialtyId, specialtyName, specialtyTypeId, marketingType, created, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **hospitalSlug** | **kotlin.String**|  | [optional]
 **specialtyId** | [**java.util.UUID**](.md)|  | [optional]
 **specialtyName** | **kotlin.String**|  | [optional]
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalSpecialtiesViewModel**](HospitalSpecialtiesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

