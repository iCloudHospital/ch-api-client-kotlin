# DoctorSpecialtiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdDelete**](DoctorSpecialtiesApi.md#apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdDelete) | **DELETE** api/v1/doctors/{doctorId}/specialties/{specialtyId} | Remove link between the doctor and the specialty.
[**apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdGet**](DoctorSpecialtiesApi.md#apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdGet) | **GET** api/v1/doctors/{doctorId}/specialties/{specialtyId} | Get DoctorSpecialty
[**apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdPost**](DoctorSpecialtiesApi.md#apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdPost) | **POST** api/v1/doctors/{doctorId}/specialties/{specialtyId} | Link a doctor to a specialty.
[**apiV1DoctorsSpecialtiesGet**](DoctorSpecialtiesApi.md#apiV1DoctorsSpecialtiesGet) | **GET** api/v1/doctors/specialties | Get All DoctorSpecialties



Remove link between the doctor and the specialty.

Sample request:        DELETE /api/v1/doctors/1/specialty/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorSpecialtiesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdDelete(doctorId, specialtyId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get DoctorSpecialty

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorSpecialtiesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorSpecialtyViewModel = webService.apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdGet(doctorId, specialtyId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |

### Return type

[**DoctorSpecialtyViewModel**](DoctorSpecialtyViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Link a doctor to a specialty.

Sample request:        POST /api/v1/doctors/1/specialty/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorSpecialtiesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorSpecialtyViewModel = webService.apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdPost(doctorId, specialtyId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |

### Return type

[**DoctorSpecialtyViewModel**](DoctorSpecialtyViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get All DoctorSpecialties

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorSpecialtiesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyName : kotlin.String = specialtyName_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorSpecialtiesViewModel = webService.apiV1DoctorsSpecialtiesGet(doctorId, doctorName, specialtyId, specialtyName, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  | [optional]
 **doctorName** | **kotlin.String**|  | [optional]
 **specialtyId** | [**java.util.UUID**](.md)|  | [optional]
 **specialtyName** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorSpecialtiesViewModel**](DoctorSpecialtiesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

