# DoctorEducationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorseducationsDoctorIdEducationsEducationIdDelete**](DoctorEducationsApi.md#apiV1DoctorseducationsDoctorIdEducationsEducationIdDelete) | **DELETE** api/v1/doctorseducations/{doctorId}/educations/{educationId} | Delete Education.
[**apiV1DoctorseducationsDoctorIdEducationsEducationIdGet**](DoctorEducationsApi.md#apiV1DoctorseducationsDoctorIdEducationsEducationIdGet) | **GET** api/v1/doctorseducations/{doctorId}/educations/{educationId} | Get education.
[**apiV1DoctorseducationsDoctorIdEducationsEducationIdPut**](DoctorEducationsApi.md#apiV1DoctorseducationsDoctorIdEducationsEducationIdPut) | **PUT** api/v1/doctorseducations/{doctorId}/educations/{educationId} | Update department.
[**apiV1DoctorseducationsDoctorIdEducationsPost**](DoctorEducationsApi.md#apiV1DoctorseducationsDoctorIdEducationsPost) | **POST** api/v1/doctorseducations/{doctorId}/educations | Create education.
[**apiV1DoctorseducationsEducationsGet**](DoctorEducationsApi.md#apiV1DoctorseducationsEducationsGet) | **GET** api/v1/doctorseducations/educations | Get all educations.



Delete Education.

Sample request:        DELETE /api/v1/doctors/1/educations/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorEducationsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val educationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorseducationsDoctorIdEducationsEducationIdDelete(doctorId, educationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **educationId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get education.

Sample request:        GET /api/v1/doctors/1/educations/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorEducationsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val educationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorEducationViewModel = webService.apiV1DoctorseducationsDoctorIdEducationsEducationIdGet(doctorId, educationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **educationId** | [**java.util.UUID**](.md)|  |

### Return type

[**DoctorEducationViewModel**](DoctorEducationViewModel.md)

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
val webService = apiClient.createWebservice(DoctorEducationsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val educationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDoctorEducationCommand : UpdateDoctorEducationCommand =  // UpdateDoctorEducationCommand | 

launch(Dispatchers.IO) {
    val result : DoctorEducationViewModel = webService.apiV1DoctorseducationsDoctorIdEducationsEducationIdPut(doctorId, educationId, updateDoctorEducationCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **educationId** | [**java.util.UUID**](.md)|  |
 **updateDoctorEducationCommand** | [**UpdateDoctorEducationCommand**](UpdateDoctorEducationCommand.md)|  | [optional]

### Return type

[**DoctorEducationViewModel**](DoctorEducationViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Create education.

Sample request:        POST /api/v1/doctors/1/educations/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorEducationsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDoctorEducationCommand : CreateDoctorEducationCommand =  // CreateDoctorEducationCommand | 

launch(Dispatchers.IO) {
    val result : DoctorEducationViewModel = webService.apiV1DoctorseducationsDoctorIdEducationsPost(doctorId, createDoctorEducationCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **createDoctorEducationCommand** | [**CreateDoctorEducationCommand**](CreateDoctorEducationCommand.md)|  | [optional]

### Return type

[**DoctorEducationViewModel**](DoctorEducationViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all educations.

Sample request:        GET /api/v1/doctors/educations

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorEducationsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val institution : kotlin.String = institution_example // kotlin.String | 
val qualification : kotlin.String = qualification_example // kotlin.String | 
val graduationDate : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorEducationsViewModel = webService.apiV1DoctorseducationsEducationsGet(doctorId, doctorName, institution, qualification, graduationDate, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  | [optional]
 **doctorName** | **kotlin.String**|  | [optional]
 **institution** | **kotlin.String**|  | [optional]
 **qualification** | **kotlin.String**|  | [optional]
 **graduationDate** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorEducationsViewModel**](DoctorEducationsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

