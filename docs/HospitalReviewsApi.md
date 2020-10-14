# HospitalReviewsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsHospitalIdReviewsPatientIdDelete**](HospitalReviewsApi.md#apiV1HospitalsHospitalIdReviewsPatientIdDelete) | **DELETE** /api/v1/hospitals/{hospitalId}/reviews/{patientId} | Delete review.
[**apiV1HospitalsHospitalIdReviewsPatientIdGet**](HospitalReviewsApi.md#apiV1HospitalsHospitalIdReviewsPatientIdGet) | **GET** /api/v1/hospitals/{hospitalId}/reviews/{patientId} | Get review.
[**apiV1HospitalsHospitalIdReviewsPatientIdPut**](HospitalReviewsApi.md#apiV1HospitalsHospitalIdReviewsPatientIdPut) | **PUT** /api/v1/hospitals/{hospitalId}/reviews/{patientId} | Update review.
[**apiV1HospitalsHospitalIdReviewsPost**](HospitalReviewsApi.md#apiV1HospitalsHospitalIdReviewsPost) | **POST** /api/v1/hospitals/{hospitalId}/reviews | Create review.
[**apiV1HospitalsReviewsGet**](HospitalReviewsApi.md#apiV1HospitalsReviewsGet) | **GET** /api/v1/hospitals/reviews | Get all reviews.


<a name="apiV1HospitalsHospitalIdReviewsPatientIdDelete"></a>
# **apiV1HospitalsHospitalIdReviewsPatientIdDelete**
> kotlin.Boolean apiV1HospitalsHospitalIdReviewsPatientIdDelete(hospitalId, patientId)

Delete review.

Sample request:        DELETE /api/v1/hospitals/1/reviews/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalReviewsApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1HospitalsHospitalIdReviewsPatientIdDelete(hospitalId, patientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalReviewsApi#apiV1HospitalsHospitalIdReviewsPatientIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalReviewsApi#apiV1HospitalsHospitalIdReviewsPatientIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **patientId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdReviewsPatientIdGet"></a>
# **apiV1HospitalsHospitalIdReviewsPatientIdGet**
> HospitalReviewViewModel apiV1HospitalsHospitalIdReviewsPatientIdGet(hospitalId, patientId)

Get review.

Sample request:        GET /api/v1/hospitals/1/reviews/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalReviewsApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : HospitalReviewViewModel = apiInstance.apiV1HospitalsHospitalIdReviewsPatientIdGet(hospitalId, patientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalReviewsApi#apiV1HospitalsHospitalIdReviewsPatientIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalReviewsApi#apiV1HospitalsHospitalIdReviewsPatientIdGet")
    e.printStackTrace()
}
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

<a name="apiV1HospitalsHospitalIdReviewsPatientIdPut"></a>
# **apiV1HospitalsHospitalIdReviewsPatientIdPut**
> kotlin.Boolean apiV1HospitalsHospitalIdReviewsPatientIdPut(hospitalId, patientId, updateHospitalReviewCommand)

Update review.

Sample request:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalReviewsApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateHospitalReviewCommand : UpdateHospitalReviewCommand =  // UpdateHospitalReviewCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1HospitalsHospitalIdReviewsPatientIdPut(hospitalId, patientId, updateHospitalReviewCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalReviewsApi#apiV1HospitalsHospitalIdReviewsPatientIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalReviewsApi#apiV1HospitalsHospitalIdReviewsPatientIdPut")
    e.printStackTrace()
}
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdReviewsPost"></a>
# **apiV1HospitalsHospitalIdReviewsPost**
> HospitalReview apiV1HospitalsHospitalIdReviewsPost(hospitalId, patientId, createHospitalReviewCommand)

Create review.

Sample request:        POST /api/v1/hospitals/1/reviews/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalReviewsApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createHospitalReviewCommand : CreateHospitalReviewCommand =  // CreateHospitalReviewCommand | 
try {
    val result : HospitalReview = apiInstance.apiV1HospitalsHospitalIdReviewsPost(hospitalId, patientId, createHospitalReviewCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalReviewsApi#apiV1HospitalsHospitalIdReviewsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalReviewsApi#apiV1HospitalsHospitalIdReviewsPost")
    e.printStackTrace()
}
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsReviewsGet"></a>
# **apiV1HospitalsReviewsGet**
> HospitalReviewsViewModel apiV1HospitalsReviewsGet(patientId, patientName, hospitalId, hospitalName, body, recommended, reviewCategory, rate, created, page, limit, lastRetrieved, current)

Get all reviews.

Sample request:        GET /api/v1/hospitals/reviews

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalReviewsApi()
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientName : kotlin.String = patientName_example // kotlin.String | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
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
    val result : HospitalReviewsViewModel = apiInstance.apiV1HospitalsReviewsGet(patientId, patientName, hospitalId, hospitalName, body, recommended, reviewCategory, rate, created, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalReviewsApi#apiV1HospitalsReviewsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalReviewsApi#apiV1HospitalsReviewsGet")
    e.printStackTrace()
}
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
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalReviewsViewModel**](HospitalReviewsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

