# ConsultationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ConsultationsConsultationIdApprovePost**](ConsultationsApi.md#apiV1ConsultationsConsultationIdApprovePost) | **POST** api/v1/consultations/{consultationId}/approve | Approve consultation.
[**apiV1ConsultationsConsultationIdCancelPost**](ConsultationsApi.md#apiV1ConsultationsConsultationIdCancelPost) | **POST** api/v1/consultations/{consultationId}/cancel | Cancel consultation.
[**apiV1ConsultationsConsultationIdDelete**](ConsultationsApi.md#apiV1ConsultationsConsultationIdDelete) | **DELETE** api/v1/consultations/{consultationId} | Delete consultation.
[**apiV1ConsultationsConsultationIdGet**](ConsultationsApi.md#apiV1ConsultationsConsultationIdGet) | **GET** api/v1/consultations/{consultationId} | Get consultation.
[**apiV1ConsultationsConsultationIdPayPost**](ConsultationsApi.md#apiV1ConsultationsConsultationIdPayPost) | **POST** api/v1/consultations/{consultationId}/pay | Pay consultation.
[**apiV1ConsultationsConsultationIdPut**](ConsultationsApi.md#apiV1ConsultationsConsultationIdPut) | **PUT** api/v1/consultations/{consultationId} | Update consultation.
[**apiV1ConsultationsConsultationIdRejectPost**](ConsultationsApi.md#apiV1ConsultationsConsultationIdRejectPost) | **POST** api/v1/consultations/{consultationId}/reject | Reject consultation.
[**apiV1ConsultationsGet**](ConsultationsApi.md#apiV1ConsultationsGet) | **GET** api/v1/consultations | Get all consultations.
[**apiV1ConsultationsRequestIdPost**](ConsultationsApi.md#apiV1ConsultationsRequestIdPost) | **POST** api/v1/consultations/{requestId} | Create consultation.



Approve consultation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConsultationsApi::class.java)
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val approveConsultationCommand : ApproveConsultationCommand =  // ApproveConsultationCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ConsultationsConsultationIdApprovePost(consultationId, approveConsultationCommand)
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



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Cancel consultation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConsultationsApi::class.java)
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ConsultationsConsultationIdCancelPost(consultationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete consultation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConsultationsApi::class.java)
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ConsultationsConsultationIdDelete(consultationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get consultation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConsultationsApi::class.java)
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : ConsultationViewModel = webService.apiV1ConsultationsConsultationIdGet(consultationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |

### Return type

[**ConsultationViewModel**](ConsultationViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Pay consultation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConsultationsApi::class.java)
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.apiV1ConsultationsConsultationIdPayPost(consultationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.String**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update consultation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConsultationsApi::class.java)
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateConsultationCommand : UpdateConsultationCommand =  // UpdateConsultationCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ConsultationsConsultationIdPut(consultationId, updateConsultationCommand)
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



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Reject consultation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConsultationsApi::class.java)
val consultationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val rejectConsultationCommand : RejectConsultationCommand =  // RejectConsultationCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ConsultationsConsultationIdRejectPost(consultationId, rejectConsultationCommand)
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



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all consultations.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConsultationsApi::class.java)
val searchString : kotlin.String = searchString_example // kotlin.String | 
val isOpen : kotlin.Boolean = true // kotlin.Boolean | 
val isCompleted : kotlin.Boolean = true // kotlin.Boolean | 
val status : ConsultationStatus =  // ConsultationStatus | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : ConsultationsViewModel = webService.apiV1ConsultationsGet(searchString, isOpen, isCompleted, status, page, limit, lastRetrieved, current)
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



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create consultation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConsultationsApi::class.java)
val requestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createConsultationCommand : CreateConsultationCommand =  // CreateConsultationCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1ConsultationsRequestIdPost(requestId, createConsultationCommand)
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



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

