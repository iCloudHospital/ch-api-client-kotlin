# HospitalReviewsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsHospitalIdReviewsPatientIdDelete**](HospitalReviewsApi.md#apiV1HospitalsHospitalIdReviewsPatientIdDelete) | **DELETE** api/v1/hospitals/{hospitalId}/reviews/{patientId} | Delete review.
[**apiV1HospitalsHospitalIdReviewsPatientIdGet**](HospitalReviewsApi.md#apiV1HospitalsHospitalIdReviewsPatientIdGet) | **GET** api/v1/hospitals/{hospitalId}/reviews/{patientId} | Get review.
[**apiV1HospitalsHospitalIdReviewsPatientIdPut**](HospitalReviewsApi.md#apiV1HospitalsHospitalIdReviewsPatientIdPut) | **PUT** api/v1/hospitals/{hospitalId}/reviews/{patientId} | Update review.
[**apiV1HospitalsHospitalIdReviewsPost**](HospitalReviewsApi.md#apiV1HospitalsHospitalIdReviewsPost) | **POST** api/v1/hospitals/{hospitalId}/reviews | Create review.
[**apiV1HospitalsReviewsGet**](HospitalReviewsApi.md#apiV1HospitalsReviewsGet) | **GET** api/v1/hospitals/reviews | Get all reviews.



Delete review.

Sample request:        DELETE /api/v1/hospitals/1/reviews/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalReviewsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdReviewsPatientIdDelete(hospitalId, patientId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **patientId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get review.

Sample request:        GET /api/v1/hospitals/1/reviews/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalReviewsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : HospitalReviewViewModel = webService.apiV1HospitalsHospitalIdReviewsPatientIdGet(hospitalId, patientId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **patientId** | [**java.util.UUID**](.md)|  |

### Return type

[**HospitalReviewViewModel**](HospitalReviewViewModel.md)

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
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalReviewsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateHospitalReviewCommand : UpdateHospitalReviewCommand =  // UpdateHospitalReviewCommand | 

val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdReviewsPatientIdPut(hospitalId, patientId, updateHospitalReviewCommand)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **patientId** | [**java.util.UUID**](.md)|  |
 **updateHospitalReviewCommand** | [**UpdateHospitalReviewCommand**](UpdateHospitalReviewCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Create review.

Sample request:        POST /api/v1/hospitals/1/reviews/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalReviewsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createHospitalReviewCommand : CreateHospitalReviewCommand =  // CreateHospitalReviewCommand | 

val result : HospitalReview = webService.apiV1HospitalsHospitalIdReviewsPost(hospitalId, patientId, createHospitalReviewCommand)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **patientId** | [**java.util.UUID**](.md)|  |
 **createHospitalReviewCommand** | [**CreateHospitalReviewCommand**](CreateHospitalReviewCommand.md)|  | [optional]

### Return type

[**HospitalReview**](HospitalReview.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all reviews.

Sample request:        GET /api/v1/hospitals/reviews

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalReviewsApi::class.java)
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientName : kotlin.String = patientName_example // kotlin.String | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
val recommended : kotlin.Boolean = true // kotlin.Boolean | 
val reviewCategory : ReviewCategory =  // ReviewCategory | 
val rate : kotlin.Int = 56 // kotlin.Int | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

val result : HospitalReviewsViewModel = webService.apiV1HospitalsReviewsGet(patientId, patientName, hospitalId, hospitalName, body, recommended, reviewCategory, rate, created, page, limit, lastRetrieved, current)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientId** | [**java.util.UUID**](.md)|  | [optional]
 **patientName** | **kotlin.String**|  | [optional]
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **body** | **kotlin.String**|  | [optional]
 **recommended** | **kotlin.Boolean**|  | [optional]
 **reviewCategory** | [**ReviewCategory**](.md)|  | [optional] [enum: Services, Hospitality, Transfer, Etc]
 **rate** | **kotlin.Int**|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalReviewsViewModel**](HospitalReviewsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

