# ConsultationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ConsultationsConsultationIdApprovePost**](ConsultationsApi.md#apiV1ConsultationsConsultationIdApprovePost) | **POST** /api/v1/consultations/{consultationId}/approve | Approve consultation.
[**apiV1ConsultationsConsultationIdCancelPost**](ConsultationsApi.md#apiV1ConsultationsConsultationIdCancelPost) | **POST** /api/v1/consultations/{consultationId}/cancel | Cancel consultation.
[**apiV1ConsultationsConsultationIdDelete**](ConsultationsApi.md#apiV1ConsultationsConsultationIdDelete) | **DELETE** /api/v1/consultations/{consultationId} | Delete consultation.
[**apiV1ConsultationsConsultationIdGet**](ConsultationsApi.md#apiV1ConsultationsConsultationIdGet) | **GET** /api/v1/consultations/{consultationId} | Get consultation.
[**apiV1ConsultationsConsultationIdPayPost**](ConsultationsApi.md#apiV1ConsultationsConsultationIdPayPost) | **POST** /api/v1/consultations/{consultationId}/pay | Pay consultation.
[**apiV1ConsultationsConsultationIdPut**](ConsultationsApi.md#apiV1ConsultationsConsultationIdPut) | **PUT** /api/v1/consultations/{consultationId} | Update consultation.
[**apiV1ConsultationsConsultationIdRejectPost**](ConsultationsApi.md#apiV1ConsultationsConsultationIdRejectPost) | **POST** /api/v1/consultations/{consultationId}/reject | Reject consultation.
[**apiV1ConsultationsGet**](ConsultationsApi.md#apiV1ConsultationsGet) | **GET** /api/v1/consultations | Get all consultations.
[**apiV1ConsultationsRequestIdPost**](ConsultationsApi.md#apiV1ConsultationsRequestIdPost) | **POST** /api/v1/consultations/{requestId} | Create consultation.


<a name="apiV1ConsultationsConsultationIdApprovePost"></a>
# **apiV1ConsultationsConsultationIdApprovePost**
> kotlin.Boolean apiV1ConsultationsConsultationIdApprovePost(consultationId, approveConsultationCommand)

Approve consultation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsultationsApi()
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val approveConsultationCommand : ApproveConsultationCommand =  // ApproveConsultationCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ConsultationsConsultationIdApprovePost(consultationId, approveConsultationCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdApprovePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdApprovePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |
 **approveConsultationCommand** | [**ApproveConsultationCommand**](ApproveConsultationCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ConsultationsConsultationIdCancelPost"></a>
# **apiV1ConsultationsConsultationIdCancelPost**
> kotlin.Boolean apiV1ConsultationsConsultationIdCancelPost(consultationId)

Cancel consultation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsultationsApi()
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ConsultationsConsultationIdCancelPost(consultationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdCancelPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdCancelPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ConsultationsConsultationIdDelete"></a>
# **apiV1ConsultationsConsultationIdDelete**
> kotlin.Boolean apiV1ConsultationsConsultationIdDelete(consultationId)

Delete consultation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsultationsApi()
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ConsultationsConsultationIdDelete(consultationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ConsultationsConsultationIdGet"></a>
# **apiV1ConsultationsConsultationIdGet**
> ConsultationViewModel apiV1ConsultationsConsultationIdGet(consultationId)

Get consultation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsultationsApi()
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ConsultationViewModel = apiInstance.apiV1ConsultationsConsultationIdGet(consultationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |

### Return type

[**ConsultationViewModel**](ConsultationViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ConsultationsConsultationIdPayPost"></a>
# **apiV1ConsultationsConsultationIdPayPost**
> kotlin.String apiV1ConsultationsConsultationIdPayPost(consultationId)

Pay consultation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsultationsApi()
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.String = apiInstance.apiV1ConsultationsConsultationIdPayPost(consultationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdPayPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdPayPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.String**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ConsultationsConsultationIdPut"></a>
# **apiV1ConsultationsConsultationIdPut**
> kotlin.Boolean apiV1ConsultationsConsultationIdPut(consultationId, updateConsultationCommand)

Update consultation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsultationsApi()
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateConsultationCommand : UpdateConsultationCommand =  // UpdateConsultationCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ConsultationsConsultationIdPut(consultationId, updateConsultationCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |
 **updateConsultationCommand** | [**UpdateConsultationCommand**](UpdateConsultationCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ConsultationsConsultationIdRejectPost"></a>
# **apiV1ConsultationsConsultationIdRejectPost**
> kotlin.Boolean apiV1ConsultationsConsultationIdRejectPost(consultationId, rejectConsultationCommand)

Reject consultation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsultationsApi()
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val rejectConsultationCommand : RejectConsultationCommand =  // RejectConsultationCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ConsultationsConsultationIdRejectPost(consultationId, rejectConsultationCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdRejectPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultationsApi#apiV1ConsultationsConsultationIdRejectPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |
 **rejectConsultationCommand** | [**RejectConsultationCommand**](RejectConsultationCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ConsultationsGet"></a>
# **apiV1ConsultationsGet**
> ConsultationsViewModel apiV1ConsultationsGet(searchString, isOpen, isCompleted, status, page, limit, lastRetrieved, current)

Get all consultations.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsultationsApi()
val searchString : kotlin.String = searchString_example // kotlin.String | 
val isOpen : kotlin.Boolean = true // kotlin.Boolean | 
val isCompleted : kotlin.Boolean = true // kotlin.Boolean | 
val status : ConsultationStatus =  // ConsultationStatus | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : ConsultationsViewModel = apiInstance.apiV1ConsultationsGet(searchString, isOpen, isCompleted, status, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultationsApi#apiV1ConsultationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultationsApi#apiV1ConsultationsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **kotlin.String**|  | [optional]
 **isOpen** | **kotlin.Boolean**|  | [optional]
 **isCompleted** | **kotlin.Boolean**|  | [optional]
 **status** | [**ConsultationStatus**](.md)|  | [optional] [enum: New, Rejected, Approved, Paid, Canceled, RefundRequested, Refunded]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**ConsultationsViewModel**](ConsultationsViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ConsultationsRequestIdPost"></a>
# **apiV1ConsultationsRequestIdPost**
> java.util.UUID apiV1ConsultationsRequestIdPost(requestId, createConsultationCommand)

Create consultation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsultationsApi()
val requestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createConsultationCommand : CreateConsultationCommand =  // CreateConsultationCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1ConsultationsRequestIdPost(requestId, createConsultationCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultationsApi#apiV1ConsultationsRequestIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultationsApi#apiV1ConsultationsRequestIdPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | [**java.util.UUID**](.md)|  |
 **createConsultationCommand** | [**CreateConsultationCommand**](CreateConsultationCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

