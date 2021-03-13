# DoctorCertificatesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsCertificatesGet**](DoctorCertificatesApi.md#apiV1DoctorsCertificatesGet) | **GET** api/v1/doctors/certificates | Get all certificates.
[**apiV1DoctorsDoctorIdCertificatesCertificateIdDelete**](DoctorCertificatesApi.md#apiV1DoctorsDoctorIdCertificatesCertificateIdDelete) | **DELETE** api/v1/doctors/{doctorId}/certificates/{certificateId} | Delete certificate.
[**apiV1DoctorsDoctorIdCertificatesCertificateIdGet**](DoctorCertificatesApi.md#apiV1DoctorsDoctorIdCertificatesCertificateIdGet) | **GET** api/v1/doctors/{doctorId}/certificates/{certificateId} | Get certificate.
[**apiV1DoctorsDoctorIdCertificatesCertificateIdPut**](DoctorCertificatesApi.md#apiV1DoctorsDoctorIdCertificatesCertificateIdPut) | **PUT** api/v1/doctors/{doctorId}/certificates/{certificateId} | Update department.
[**apiV1DoctorsDoctorIdCertificatesPost**](DoctorCertificatesApi.md#apiV1DoctorsDoctorIdCertificatesPost) | **POST** api/v1/doctors/{doctorId}/certificates | Create certificate.



Get all certificates.

Sample request:        GET /api/v1/doctors/certificates

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorCertificatesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val certificate : kotlin.String = certificate_example // kotlin.String | 
val activeFrom : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val activeTo : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DoctorCertificatesViewModel = webService.apiV1DoctorsCertificatesGet(id, doctorId, doctorName, certificate, activeFrom, activeTo, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **doctorId** | [**java.util.UUID**](.md)|  | [optional]
 **doctorName** | **kotlin.String**|  | [optional]
 **certificate** | **kotlin.String**|  | [optional]
 **activeFrom** | **java.time.OffsetDateTime**|  | [optional]
 **activeTo** | **java.time.OffsetDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DoctorCertificatesViewModel**](DoctorCertificatesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete certificate.

Sample request:        DELETE /api/v1/doctors/1/certificates/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorCertificatesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val certificateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorsDoctorIdCertificatesCertificateIdDelete(doctorId, certificateId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **certificateId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get certificate.

Sample request:        GET /api/v1/doctors/1/certificates/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorCertificatesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val certificateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorCertificateViewModel = webService.apiV1DoctorsDoctorIdCertificatesCertificateIdGet(doctorId, certificateId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **certificateId** | [**java.util.UUID**](.md)|  |

### Return type

[**DoctorCertificateViewModel**](DoctorCertificateViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update department.

Sample request:

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorCertificatesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val certificateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDoctorCertificateCommand : UpdateDoctorCertificateCommand =  // UpdateDoctorCertificateCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorsDoctorIdCertificatesCertificateIdPut(doctorId, certificateId, updateDoctorCertificateCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **certificateId** | [**java.util.UUID**](.md)|  |
 **updateDoctorCertificateCommand** | [**UpdateDoctorCertificateCommand**](UpdateDoctorCertificateCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Create certificate.

Sample request:        POST /api/v1/doctors/1/certificates/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorCertificatesApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDoctorCertificateCommand : CreateDoctorCertificateCommand =  // CreateDoctorCertificateCommand | 

launch(Dispatchers.IO) {
    val result : DoctorCertificate = webService.apiV1DoctorsDoctorIdCertificatesPost(doctorId, createDoctorCertificateCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **createDoctorCertificateCommand** | [**CreateDoctorCertificateCommand**](CreateDoctorCertificateCommand.md)|  | [optional]

### Return type

[**DoctorCertificate**](DoctorCertificate.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

