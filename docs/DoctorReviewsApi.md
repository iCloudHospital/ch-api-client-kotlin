# DoctorReviewsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsDoctorIdReviewsPatientIdDelete**](DoctorReviewsApi.md#apiV1DoctorsDoctorIdReviewsPatientIdDelete) | **DELETE** /api/v1/doctors/{doctorId}/reviews/{patientId} | Delete review.
[**apiV1DoctorsDoctorIdReviewsPatientIdGet**](DoctorReviewsApi.md#apiV1DoctorsDoctorIdReviewsPatientIdGet) | **GET** /api/v1/doctors/{doctorId}/reviews/{patientId} | Get review.
[**apiV1DoctorsDoctorIdReviewsPatientIdPut**](DoctorReviewsApi.md#apiV1DoctorsDoctorIdReviewsPatientIdPut) | **PUT** /api/v1/doctors/{doctorId}/reviews/{patientId} | Update review.
[**apiV1DoctorsDoctorIdReviewsPost**](DoctorReviewsApi.md#apiV1DoctorsDoctorIdReviewsPost) | **POST** /api/v1/doctors/{doctorId}/reviews | Create review.
[**apiV1DoctorsReviewsGet**](DoctorReviewsApi.md#apiV1DoctorsReviewsGet) | **GET** /api/v1/doctors/reviews | Get all reviews.


<a name="apiV1DoctorsDoctorIdReviewsPatientIdDelete"></a>
# **apiV1DoctorsDoctorIdReviewsPatientIdDelete**
> kotlin.Boolean apiV1DoctorsDoctorIdReviewsPatientIdDelete(doctorId, patientId)

Delete review.

Sample request:        DELETE /api/v1/doctors/1/reviews/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorReviewsApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DoctorsDoctorIdReviewsPatientIdDelete(doctorId, patientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorReviewsApi#apiV1DoctorsDoctorIdReviewsPatientIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorReviewsApi#apiV1DoctorsDoctorIdReviewsPatientIdDelete")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsDoctorIdReviewsPatientIdGet"></a>
# **apiV1DoctorsDoctorIdReviewsPatientIdGet**
> DoctorReviewViewModel apiV1DoctorsDoctorIdReviewsPatientIdGet(doctorId, patientId)

Get review.

Sample request:        GET /api/v1/doctors/1/reviews/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorReviewsApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DoctorReviewViewModel = apiInstance.apiV1DoctorsDoctorIdReviewsPatientIdGet(doctorId, patientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorReviewsApi#apiV1DoctorsDoctorIdReviewsPatientIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorReviewsApi#apiV1DoctorsDoctorIdReviewsPatientIdGet")
    e.printStackTrace()
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

<a name="apiV1DoctorsDoctorIdReviewsPatientIdPut"></a>
# **apiV1DoctorsDoctorIdReviewsPatientIdPut**
> kotlin.Boolean apiV1DoctorsDoctorIdReviewsPatientIdPut(doctorId, patientId, updateDoctorReviewCommand)

Update review.

Sample request:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorReviewsApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDoctorReviewCommand : UpdateDoctorReviewCommand =  // UpdateDoctorReviewCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DoctorsDoctorIdReviewsPatientIdPut(doctorId, patientId, updateDoctorReviewCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorReviewsApi#apiV1DoctorsDoctorIdReviewsPatientIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorReviewsApi#apiV1DoctorsDoctorIdReviewsPatientIdPut")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsDoctorIdReviewsPost"></a>
# **apiV1DoctorsDoctorIdReviewsPost**
> DoctorReview apiV1DoctorsDoctorIdReviewsPost(doctorId, patientId, createDoctorReviewCommand)

Create review.

Sample request:        POST /api/v1/doctors/1/reviews/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorReviewsApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDoctorReviewCommand : CreateDoctorReviewCommand =  // CreateDoctorReviewCommand | 
try {
    val result : DoctorReview = apiInstance.apiV1DoctorsDoctorIdReviewsPost(doctorId, patientId, createDoctorReviewCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorReviewsApi#apiV1DoctorsDoctorIdReviewsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorReviewsApi#apiV1DoctorsDoctorIdReviewsPost")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsReviewsGet"></a>
# **apiV1DoctorsReviewsGet**
> DoctorReviewsViewModel apiV1DoctorsReviewsGet(doctorId, doctorName, patientId, patientName, body, recommended, reviewCategory, rate, created, page, limit, lastRetrieved, current)

Get all reviews.

Sample request:        GET /api/v1/doctors/reviews

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorReviewsApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientName : kotlin.String = patientName_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
val recommended : kotlin.Boolean = true // kotlin.Boolean | 
val reviewCategory : ReviewCategory =  // ReviewCategory | 
val rate : kotlin.Int = 56 // kotlin.Int | 
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DoctorReviewsViewModel = apiInstance.apiV1DoctorsReviewsGet(doctorId, doctorName, patientId, patientName, body, recommended, reviewCategory, rate, created, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorReviewsApi#apiV1DoctorsReviewsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorReviewsApi#apiV1DoctorsReviewsGet")
    e.printStackTrace()
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
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DoctorReviewsViewModel**](DoctorReviewsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

