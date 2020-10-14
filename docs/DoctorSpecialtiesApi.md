# DoctorSpecialtiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost**](DoctorSpecialtiesApi.md#apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost) | **POST** /api/v1/doctors/{doctorId}/specialty/{specialtyId} | Link a doctor to a specialty.
[**apiV1DoctorsHospitalIdDoctorsDoctorIdDelete**](DoctorSpecialtiesApi.md#apiV1DoctorsHospitalIdDoctorsDoctorIdDelete) | **DELETE** /api/v1/doctors/{hospitalId}/doctors/{doctorId} | Remove link between the doctor and the specialty.


<a name="apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost"></a>
# **apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost**
> DoctorSpecialtyViewModel apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost(doctorId, specialtyId)

Link a doctor to a specialty.

Sample request:        POST /api/v1/doctors/1/specialty/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorSpecialtiesApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DoctorSpecialtyViewModel = apiInstance.apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost(doctorId, specialtyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorSpecialtiesApi#apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorSpecialtiesApi#apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsHospitalIdDoctorsDoctorIdDelete"></a>
# **apiV1DoctorsHospitalIdDoctorsDoctorIdDelete**
> kotlin.Boolean apiV1DoctorsHospitalIdDoctorsDoctorIdDelete(doctorId, specailtyId, hospitalId)

Remove link between the doctor and the specialty.

Sample request:        DELETE /api/v1/doctors/1/specialty/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorSpecialtiesApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specailtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DoctorsHospitalIdDoctorsDoctorIdDelete(doctorId, specailtyId, hospitalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorSpecialtiesApi#apiV1DoctorsHospitalIdDoctorsDoctorIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorSpecialtiesApi#apiV1DoctorsHospitalIdDoctorsDoctorIdDelete")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

