# BookingsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1BookingsBookingIdApprovePost**](BookingsApi.md#apiV1BookingsBookingIdApprovePost) | **POST** api/v1/bookings/{bookingId}/approve | Approve booking.
[**apiV1BookingsBookingIdCancelPost**](BookingsApi.md#apiV1BookingsBookingIdCancelPost) | **POST** api/v1/bookings/{bookingId}/cancel | Cancel booking.
[**apiV1BookingsBookingIdDelete**](BookingsApi.md#apiV1BookingsBookingIdDelete) | **DELETE** api/v1/bookings/{bookingId} | Delete booking.
[**apiV1BookingsBookingIdGet**](BookingsApi.md#apiV1BookingsBookingIdGet) | **GET** api/v1/bookings/{bookingId} | Get booking.
[**apiV1BookingsBookingIdPaidPost**](BookingsApi.md#apiV1BookingsBookingIdPaidPost) | **POST** api/v1/bookings/{bookingId}/paid | Mark as Paid booking.
[**apiV1BookingsBookingIdPayPost**](BookingsApi.md#apiV1BookingsBookingIdPayPost) | **POST** api/v1/bookings/{bookingId}/pay | Pay booking.
[**apiV1BookingsBookingIdPut**](BookingsApi.md#apiV1BookingsBookingIdPut) | **PUT** api/v1/bookings/{bookingId} | Update booking.
[**apiV1BookingsBookingIdRejectPost**](BookingsApi.md#apiV1BookingsBookingIdRejectPost) | **POST** api/v1/bookings/{bookingId}/reject | Reject booking.
[**apiV1BookingsGet**](BookingsApi.md#apiV1BookingsGet) | **GET** api/v1/bookings | Get all bookings.
[**apiV1BookingsRequestIdPost**](BookingsApi.md#apiV1BookingsRequestIdPost) | **POST** api/v1/bookings/{requestId} | Create booking.



Approve booking.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookingsApi::class.java)
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val approveBookingCommand : ApproveBookingCommand =  // ApproveBookingCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1BookingsBookingIdApprovePost(bookingId, approveBookingCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |
 **approveBookingCommand** | [**ApproveBookingCommand**](ApproveBookingCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Cancel booking.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookingsApi::class.java)
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1BookingsBookingIdCancelPost(bookingId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete booking.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookingsApi::class.java)
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1BookingsBookingIdDelete(bookingId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get booking.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookingsApi::class.java)
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : BookingViewModel = webService.apiV1BookingsBookingIdGet(bookingId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |

### Return type

[**BookingViewModel**](BookingViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Mark as Paid booking.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookingsApi::class.java)
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1BookingsBookingIdPaidPost(bookingId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Pay booking.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookingsApi::class.java)
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.apiV1BookingsBookingIdPayPost(bookingId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.String**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update booking.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookingsApi::class.java)
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateBookingCommand : UpdateBookingCommand =  // UpdateBookingCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1BookingsBookingIdPut(bookingId, updateBookingCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |
 **updateBookingCommand** | [**UpdateBookingCommand**](UpdateBookingCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Reject booking.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookingsApi::class.java)
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val rejectBookingCommand : RejectBookingCommand =  // RejectBookingCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1BookingsBookingIdRejectPost(bookingId, rejectBookingCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |
 **rejectBookingCommand** | [**RejectBookingCommand**](RejectBookingCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all bookings.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookingsApi::class.java)
val searchString : kotlin.String = searchString_example // kotlin.String | 
val isOpen : kotlin.Boolean = true // kotlin.Boolean | 
val isCompleted : kotlin.Boolean = true // kotlin.Boolean | 
val status : BookingStatus =  // BookingStatus | 
val dealPackageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : BookingsViewModel = webService.apiV1BookingsGet(searchString, isOpen, isCompleted, status, dealPackageId, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **kotlin.String**|  | [optional]
 **isOpen** | **kotlin.Boolean**|  | [optional]
 **isCompleted** | **kotlin.Boolean**|  | [optional]
 **status** | [**BookingStatus**](.md)|  | [optional] [enum: New, Rejected, Approved, Paid, Canceled, RefundRequested, Refunded]
 **dealPackageId** | [**java.util.UUID**](.md)|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**BookingsViewModel**](BookingsViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create booking.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookingsApi::class.java)
val requestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createBookingCommand : CreateBookingCommand =  // CreateBookingCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1BookingsRequestIdPost(requestId, createBookingCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | [**java.util.UUID**](.md)|  |
 **createBookingCommand** | [**CreateBookingCommand**](CreateBookingCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

