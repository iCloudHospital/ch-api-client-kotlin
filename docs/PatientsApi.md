# PatientsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2PatientsPatientIdDelete**](PatientsApi.md#apiV2PatientsPatientIdDelete) | **DELETE** api/v2/patients/{patientId} | Delete Patient.
[**apiV2PatientsPatientIdGet**](PatientsApi.md#apiV2PatientsPatientIdGet) | **GET** api/v2/patients/{patientId} | Get Patient.
[**apiV2PatientsPatientIdPut**](PatientsApi.md#apiV2PatientsPatientIdPut) | **PUT** api/v2/patients/{patientId} | Update Patient.
[**apiV2PatientsPost**](PatientsApi.md#apiV2PatientsPost) | **POST** api/v2/patients | Create a Patient.



Delete Patient.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PatientsApi::class.java)
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV2PatientsPatientIdDelete(patientId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Patient.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PatientsApi::class.java)
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : PatientModel = webService.apiV2PatientsPatientIdGet(patientId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientId** | [**java.util.UUID**](.md)|  |

### Return type

[**PatientModel**](PatientModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Patient.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PatientsApi::class.java)
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updatePatientCommand : UpdatePatientCommand =  // UpdatePatientCommand | 

launch(Dispatchers.IO) {
    val result : PatientModel = webService.apiV2PatientsPatientIdPut(patientId, updatePatientCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientId** | [**java.util.UUID**](.md)|  |
 **updatePatientCommand** | [**UpdatePatientCommand**](UpdatePatientCommand.md)|  | [optional]

### Return type

[**PatientModel**](PatientModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: application/json


Create a Patient.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PatientsApi::class.java)
val createPatientCommand : CreatePatientCommand =  // CreatePatientCommand | 

launch(Dispatchers.IO) {
    val result : PatientModel = webService.apiV2PatientsPost(createPatientCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPatientCommand** | [**CreatePatientCommand**](CreatePatientCommand.md)|  | [optional]

### Return type

[**PatientModel**](PatientModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: application/json

