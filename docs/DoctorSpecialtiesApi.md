# DoctorSpecialtiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost**](DoctorSpecialtiesApi.md#apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost) | **POST** api/v1/doctors/{doctorId}/specialty/{specialtyId} | Link a doctor to a specialty.
[**apiV1DoctorsHospitalIdDoctorsDoctorIdDelete**](DoctorSpecialtiesApi.md#apiV1DoctorsHospitalIdDoctorsDoctorIdDelete) | **DELETE** api/v1/doctors/{hospitalId}/doctors/{doctorId} | Remove link between the doctor and the specialty.



Link a doctor to a specialty.

Sample request:        POST /api/v1/doctors/1/specialty/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorSpecialtiesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorSpecialtyViewModel = webService.apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost(doctorId, specialtyId)
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


Remove link between the doctor and the specialty.

Sample request:        DELETE /api/v1/doctors/1/specialty/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorSpecialtiesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specailtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorsHospitalIdDoctorsDoctorIdDelete(doctorId, specailtyId, hospitalId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **specailtyId** | [**java.util.UUID**](.md)|  |
 **hospitalId** | **kotlin.String**|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

