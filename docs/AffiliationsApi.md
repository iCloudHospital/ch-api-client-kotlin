# AffiliationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsHospitalIdDoctorsDoctorIdDelete**](AffiliationsApi.md#apiV1HospitalsHospitalIdDoctorsDoctorIdDelete) | **DELETE** /api/v1/hospitals/{hospitalId}/doctors/{doctorId} | Remove link between the doctor and the hospital.
[**apiV1HospitalsHospitalIdDoctorsDoctorIdPost**](AffiliationsApi.md#apiV1HospitalsHospitalIdDoctorsDoctorIdPost) | **POST** /api/v1/hospitals/{hospitalId}/doctors/{doctorId} | Link a doctor to a hospital.
[**apiV1HospitalsHospitalIdManagersManagerIdDelete**](AffiliationsApi.md#apiV1HospitalsHospitalIdManagersManagerIdDelete) | **DELETE** /api/v1/hospitals/{hospitalId}/managers/{managerId} | Remove link between the manager and the hospital.
[**apiV1HospitalsHospitalIdManagersManagerIdPost**](AffiliationsApi.md#apiV1HospitalsHospitalIdManagersManagerIdPost) | **POST** /api/v1/hospitals/{hospitalId}/managers/{managerId} | Link a manager to a hospital.


<a name="apiV1HospitalsHospitalIdDoctorsDoctorIdDelete"></a>
# **apiV1HospitalsHospitalIdDoctorsDoctorIdDelete**
> kotlin.Boolean apiV1HospitalsHospitalIdDoctorsDoctorIdDelete(hospitalId, doctorId)

Remove link between the doctor and the hospital.

Sample request:        DELETE /api/v1/hospitals/1/doctors/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AffiliationsApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1HospitalsHospitalIdDoctorsDoctorIdDelete(hospitalId, doctorId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AffiliationsApi#apiV1HospitalsHospitalIdDoctorsDoctorIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AffiliationsApi#apiV1HospitalsHospitalIdDoctorsDoctorIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **doctorId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdDoctorsDoctorIdPost"></a>
# **apiV1HospitalsHospitalIdDoctorsDoctorIdPost**
> DoctorAffiliationViewModel apiV1HospitalsHospitalIdDoctorsDoctorIdPost(hospitalId, doctorId)

Link a doctor to a hospital.

Sample request:        POST /api/v1/hospitals/1/doctors/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AffiliationsApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DoctorAffiliationViewModel = apiInstance.apiV1HospitalsHospitalIdDoctorsDoctorIdPost(hospitalId, doctorId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AffiliationsApi#apiV1HospitalsHospitalIdDoctorsDoctorIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AffiliationsApi#apiV1HospitalsHospitalIdDoctorsDoctorIdPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **doctorId** | [**java.util.UUID**](.md)|  |

### Return type

[**DoctorAffiliationViewModel**](DoctorAffiliationViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdManagersManagerIdDelete"></a>
# **apiV1HospitalsHospitalIdManagersManagerIdDelete**
> kotlin.Boolean apiV1HospitalsHospitalIdManagersManagerIdDelete(hospitalId, managerId)

Remove link between the manager and the hospital.

Sample request:        DELETE /api/v1/hospitals/1/managers/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AffiliationsApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val managerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1HospitalsHospitalIdManagersManagerIdDelete(hospitalId, managerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AffiliationsApi#apiV1HospitalsHospitalIdManagersManagerIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AffiliationsApi#apiV1HospitalsHospitalIdManagersManagerIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **managerId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdManagersManagerIdPost"></a>
# **apiV1HospitalsHospitalIdManagersManagerIdPost**
> ManagerAffiliationViewModel apiV1HospitalsHospitalIdManagersManagerIdPost(hospitalId, managerId)

Link a manager to a hospital.

Sample request:        POST /api/v1/hospitals/1/managers/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AffiliationsApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val managerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ManagerAffiliationViewModel = apiInstance.apiV1HospitalsHospitalIdManagersManagerIdPost(hospitalId, managerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AffiliationsApi#apiV1HospitalsHospitalIdManagersManagerIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AffiliationsApi#apiV1HospitalsHospitalIdManagersManagerIdPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **managerId** | [**java.util.UUID**](.md)|  |

### Return type

[**ManagerAffiliationViewModel**](ManagerAffiliationViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

