# HospitalsConsultationTimetablesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2HospitalsHospitalIdConsultationtimetablesGet**](HospitalsConsultationTimetablesApi.md#apiV2HospitalsHospitalIdConsultationtimetablesGet) | **GET** api/v2/hospitals/{hospitalId}/consultationtimetables | Get hospital consultation timetables by hospitalId



Get hospital consultation timetables by hospitalId

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsConsultationTimetablesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val year : kotlin.Int = 56 // kotlin.Int | 
val month : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : ConsultationTimetableModel = webService.apiV2HospitalsHospitalIdConsultationtimetablesGet(hospitalId, year, month)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **year** | **kotlin.Int**|  | [optional]
 **month** | **kotlin.Int**|  | [optional]

### Return type

[**ConsultationTimetableModel**](ConsultationTimetableModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

