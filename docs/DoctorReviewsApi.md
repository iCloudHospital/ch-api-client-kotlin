# DoctorReviewsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsDoctorIdReviewsPatientIdDelete**](DoctorReviewsApi.md#apiV1DoctorsDoctorIdReviewsPatientIdDelete) | **DELETE** api/v1/doctors/{doctorId}/reviews/{patientId} | Delete review.
[**apiV1DoctorsDoctorIdReviewsPatientIdGet**](DoctorReviewsApi.md#apiV1DoctorsDoctorIdReviewsPatientIdGet) | **GET** api/v1/doctors/{doctorId}/reviews/{patientId} | Get review.
[**apiV1DoctorsDoctorIdReviewsPatientIdPut**](DoctorReviewsApi.md#apiV1DoctorsDoctorIdReviewsPatientIdPut) | **PUT** api/v1/doctors/{doctorId}/reviews/{patientId} | Update review.
[**apiV1DoctorsDoctorIdReviewsPost**](DoctorReviewsApi.md#apiV1DoctorsDoctorIdReviewsPost) | **POST** api/v1/doctors/{doctorId}/reviews | Create review.
[**apiV1DoctorsReviewsGet**](DoctorReviewsApi.md#apiV1DoctorsReviewsGet) | **GET** api/v1/doctors/reviews | Get all reviews.



Delete review.

Sample request:        DELETE /api/v1/doctors/1/reviews/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorReviewsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorsDoctorIdReviewsPatientIdDelete(doctorId, patientId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **patientId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get review.

Sample request:        GET /api/v1/doctors/1/reviews/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorReviewsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorReviewViewModel = webService.apiV1DoctorsDoctorIdReviewsPatientIdGet(doctorId, patientId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **patientId** | [**java.util.UUID**](.md)|  |

### Return type

[**DoctorReviewViewModel**](DoctorReviewViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update review.

Sample request:

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorReviewsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDoctorReviewCommand : UpdateDoctorReviewCommand =  // UpdateDoctorReviewCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorsDoctorIdReviewsPatientIdPut(doctorId, patientId, updateDoctorReviewCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **patientId** | [**java.util.UUID**](.md)|  |
 **updateDoctorReviewCommand** | [**UpdateDoctorReviewCommand**](UpdateDoctorReviewCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Create review.

Sample request:        POST /api/v1/doctors/1/reviews/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorReviewsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDoctorReviewCommand : CreateDoctorReviewCommand =  // CreateDoctorReviewCommand | 

launch(Dispatchers.IO) {
    val result : DoctorReview = webService.apiV1DoctorsDoctorIdReviewsPost(doctorId, patientId, createDoctorReviewCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **patientId** | [**java.util.UUID**](.md)|  |
 **createDoctorReviewCommand** | [**CreateDoctorReviewCommand**](CreateDoctorReviewCommand.md)|  | [optional]

### Return type

[**DoctorReview**](DoctorReview.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all reviews.

Sample request:        GET /api/v1/doctors/reviews

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorReviewsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientName : kotlin.String = patientName_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
val recommended : kotlin.Boolean = true // kotlin.Boolean | 
val reviewCategory : ReviewCategory =  // ReviewCategory | 
val rate : kotlin.Int = 56 // kotlin.Int | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorReviewsViewModel = webService.apiV1DoctorsReviewsGet(doctorId, doctorName, patientId, patientName, body, recommended, reviewCategory, rate, created, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  | [optional]
 **doctorName** | **kotlin.String**|  | [optional]
 **patientId** | [**java.util.UUID**](.md)|  | [optional]
 **patientName** | **kotlin.String**|  | [optional]
 **body** | **kotlin.String**|  | [optional]
 **recommended** | **kotlin.Boolean**|  | [optional]
 **reviewCategory** | [**ReviewCategory**](.md)|  | [optional] [enum: Services, Hospitality, Transfer, Etc]
 **rate** | **kotlin.Int**|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorReviewsViewModel**](DoctorReviewsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

