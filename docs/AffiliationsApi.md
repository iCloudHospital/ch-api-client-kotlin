# AffiliationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsHospitalIdDoctorsDoctorIdDelete**](AffiliationsApi.md#apiV1HospitalsHospitalIdDoctorsDoctorIdDelete) | **DELETE** api/v1/hospitals/{hospitalId}/doctors/{doctorId} | Remove link between the doctor and the hospital.
[**apiV1HospitalsHospitalIdDoctorsDoctorIdPost**](AffiliationsApi.md#apiV1HospitalsHospitalIdDoctorsDoctorIdPost) | **POST** api/v1/hospitals/{hospitalId}/doctors/{doctorId} | Link a doctor to a hospital.
[**apiV1HospitalsHospitalIdManagersManagerIdDelete**](AffiliationsApi.md#apiV1HospitalsHospitalIdManagersManagerIdDelete) | **DELETE** api/v1/hospitals/{hospitalId}/managers/{managerId} | Remove link between the manager and the hospital.
[**apiV1HospitalsHospitalIdManagersManagerIdPost**](AffiliationsApi.md#apiV1HospitalsHospitalIdManagersManagerIdPost) | **POST** api/v1/hospitals/{hospitalId}/managers/{managerId} | Link a manager to a hospital.



Remove link between the doctor and the hospital.

Sample request:        DELETE /api/v1/hospitals/1/doctors/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AffiliationsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdDoctorsDoctorIdDelete(hospitalId, doctorId)
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



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Link a doctor to a hospital.

Sample request:        POST /api/v1/hospitals/1/doctors/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AffiliationsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorAffiliationViewModel = webService.apiV1HospitalsHospitalIdDoctorsDoctorIdPost(hospitalId, doctorId)
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



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Remove link between the manager and the hospital.

Sample request:        DELETE /api/v1/hospitals/1/managers/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AffiliationsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val managerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdManagersManagerIdDelete(hospitalId, managerId)
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



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Link a manager to a hospital.

Sample request:        POST /api/v1/hospitals/1/managers/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AffiliationsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val managerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : ManagerAffiliationViewModel = webService.apiV1HospitalsHospitalIdManagersManagerIdPost(hospitalId, managerId)
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



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

