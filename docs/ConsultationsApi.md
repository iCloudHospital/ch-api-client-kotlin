# ConsultationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2ConsultationsConsultationIdGet**](ConsultationsApi.md#apiV2ConsultationsConsultationIdGet) | **GET** api/v2/consultations/{consultationId} | Get consultation.
[**apiV2ConsultationsConsultationIdPayPost**](ConsultationsApi.md#apiV2ConsultationsConsultationIdPayPost) | **POST** api/v2/consultations/{consultationId}/pay | Pay consultation.
[**apiV2ConsultationsConsultationIdPut**](ConsultationsApi.md#apiV2ConsultationsConsultationIdPut) | **PUT** api/v2/consultations/{consultationId} | Update consultation.
[**apiV2ConsultationsGet**](ConsultationsApi.md#apiV2ConsultationsGet) | **GET** api/v2/consultations | Get all consultations.
[**apiV2ConsultationsRequestIdPost**](ConsultationsApi.md#apiV2ConsultationsRequestIdPost) | **POST** api/v2/consultations/{requestId} | Create consultation.



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
    val result : ConsultationModel = webService.apiV2ConsultationsConsultationIdGet(consultationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |

### Return type

[**ConsultationModel**](ConsultationModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


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
    val result : kotlin.String = webService.apiV2ConsultationsConsultationIdPayPost(consultationId)
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
 - **Accept**: application/json


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
    val result : ConsultationModel = webService.apiV2ConsultationsConsultationIdPut(consultationId, updateConsultationCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**java.util.UUID**](.md)|  |
 **updateConsultationCommand** | [**UpdateConsultationCommand**](UpdateConsultationCommand.md)|  | [optional]

### Return type

[**ConsultationModel**](ConsultationModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: application/json


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
val consultationType : ConsultationType =  // ConsultationType | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : ConsultationsModel = webService.apiV2ConsultationsGet(searchString, isOpen, isCompleted, status, consultationType, hospitalId, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **kotlin.String**|  | [optional]
 **isOpen** | **kotlin.Boolean**|  | [optional]
 **isCompleted** | **kotlin.Boolean**|  | [optional]
 **status** | [**ConsultationStatus**](.md)|  | [optional] [enum: New, Rejected, Approved, Paid, Canceled, RefundRequested, Refunded]
 **consultationType** | [**ConsultationType**](.md)|  | [optional] [enum: Hospital, Doctor, Deal]
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**ConsultationsModel**](ConsultationsModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


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
    val result : ConsultationModel = webService.apiV2ConsultationsRequestIdPost(requestId, createConsultationCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | [**java.util.UUID**](.md)|  |
 **createConsultationCommand** | [**CreateConsultationCommand**](CreateConsultationCommand.md)|  | [optional]

### Return type

[**ConsultationModel**](ConsultationModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: application/json

