# BookingsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2BookingsBookingIdGet**](BookingsApi.md#apiV2BookingsBookingIdGet) | **GET** api/v2/bookings/{bookingId} | Get booking.
[**apiV2BookingsBookingIdPayPost**](BookingsApi.md#apiV2BookingsBookingIdPayPost) | **POST** api/v2/bookings/{bookingId}/pay | Pay booking.
[**apiV2BookingsBookingIdPut**](BookingsApi.md#apiV2BookingsBookingIdPut) | **PUT** api/v2/bookings/{bookingId} | Update booking.
[**apiV2BookingsGet**](BookingsApi.md#apiV2BookingsGet) | **GET** api/v2/bookings | Get all bookings.
[**apiV2BookingsRequestIdPost**](BookingsApi.md#apiV2BookingsRequestIdPost) | **POST** api/v2/bookings/{requestId} | Create booking.



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
    val result : BookingModel = webService.apiV2BookingsBookingIdGet(bookingId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **java.util.UUID**|  |

### Return type

[**BookingModel**](BookingModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


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
    val result : kotlin.String = webService.apiV2BookingsBookingIdPayPost(bookingId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **java.util.UUID**|  |

### Return type

**kotlin.String**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


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
    val result : BookingModel = webService.apiV2BookingsBookingIdPut(bookingId, updateBookingCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **java.util.UUID**|  |
 **updateBookingCommand** | [**UpdateBookingCommand**](UpdateBookingCommand.md)|  | [optional]

### Return type

[**BookingModel**](BookingModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json


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
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : BookingsModel = webService.apiV2BookingsGet(searchString, isOpen, isCompleted, status, dealPackageId, hospitalId, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **kotlin.String**|  | [optional]
 **isOpen** | **kotlin.Boolean**|  | [optional]
 **isCompleted** | **kotlin.Boolean**|  | [optional]
 **status** | [**BookingStatus**](.md)|  | [optional] [enum: New, Rejected, Approved, Paid, Canceled, RefundRequested, Refunded]
 **dealPackageId** | **java.util.UUID**|  | [optional]
 **hospitalId** | **java.util.UUID**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**BookingsModel**](BookingsModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


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
    val result : BookingModel = webService.apiV2BookingsRequestIdPost(requestId, createBookingCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **java.util.UUID**|  |
 **createBookingCommand** | [**CreateBookingCommand**](CreateBookingCommand.md)|  | [optional]

### Return type

[**BookingModel**](BookingModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

