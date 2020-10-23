# BookingsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1BookingsBookingIdApprovePost**](BookingsApi.md#apiV1BookingsBookingIdApprovePost) | **POST** /api/v1/bookings/{bookingId}/approve | Approve booking.
[**apiV1BookingsBookingIdCancelPost**](BookingsApi.md#apiV1BookingsBookingIdCancelPost) | **POST** /api/v1/bookings/{bookingId}/cancel | Cancel booking.
[**apiV1BookingsBookingIdDelete**](BookingsApi.md#apiV1BookingsBookingIdDelete) | **DELETE** /api/v1/bookings/{bookingId} | Delete booking.
[**apiV1BookingsBookingIdGet**](BookingsApi.md#apiV1BookingsBookingIdGet) | **GET** /api/v1/bookings/{bookingId} | Get booking.
[**apiV1BookingsBookingIdPaidPost**](BookingsApi.md#apiV1BookingsBookingIdPaidPost) | **POST** /api/v1/bookings/{bookingId}/paid | Mark as Paid booking.
[**apiV1BookingsBookingIdPayPost**](BookingsApi.md#apiV1BookingsBookingIdPayPost) | **POST** /api/v1/bookings/{bookingId}/pay | Pay booking.
[**apiV1BookingsBookingIdPut**](BookingsApi.md#apiV1BookingsBookingIdPut) | **PUT** /api/v1/bookings/{bookingId} | Update booking.
[**apiV1BookingsBookingIdRejectPost**](BookingsApi.md#apiV1BookingsBookingIdRejectPost) | **POST** /api/v1/bookings/{bookingId}/reject | Reject booking.
[**apiV1BookingsGet**](BookingsApi.md#apiV1BookingsGet) | **GET** /api/v1/bookings | Get all bookings.
[**apiV1BookingsRequestIdPost**](BookingsApi.md#apiV1BookingsRequestIdPost) | **POST** /api/v1/bookings/{requestId} | Create booking.


<a name="apiV1BookingsBookingIdApprovePost"></a>
# **apiV1BookingsBookingIdApprovePost**
> kotlin.Boolean apiV1BookingsBookingIdApprovePost(bookingId, approveBookingCommand)

Approve booking.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BookingsApi()
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val approveBookingCommand : ApproveBookingCommand =  // ApproveBookingCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1BookingsBookingIdApprovePost(bookingId, approveBookingCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingsApi#apiV1BookingsBookingIdApprovePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingsApi#apiV1BookingsBookingIdApprovePost")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BookingsBookingIdCancelPost"></a>
# **apiV1BookingsBookingIdCancelPost**
> kotlin.Boolean apiV1BookingsBookingIdCancelPost(bookingId)

Cancel booking.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BookingsApi()
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1BookingsBookingIdCancelPost(bookingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingsApi#apiV1BookingsBookingIdCancelPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingsApi#apiV1BookingsBookingIdCancelPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BookingsBookingIdDelete"></a>
# **apiV1BookingsBookingIdDelete**
> kotlin.Boolean apiV1BookingsBookingIdDelete(bookingId)

Delete booking.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BookingsApi()
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1BookingsBookingIdDelete(bookingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingsApi#apiV1BookingsBookingIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingsApi#apiV1BookingsBookingIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BookingsBookingIdGet"></a>
# **apiV1BookingsBookingIdGet**
> BookingViewModel apiV1BookingsBookingIdGet(bookingId)

Get booking.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BookingsApi()
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : BookingViewModel = apiInstance.apiV1BookingsBookingIdGet(bookingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingsApi#apiV1BookingsBookingIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingsApi#apiV1BookingsBookingIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |

### Return type

[**BookingViewModel**](BookingViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BookingsBookingIdPaidPost"></a>
# **apiV1BookingsBookingIdPaidPost**
> java.util.UUID apiV1BookingsBookingIdPaidPost(bookingId)

Mark as Paid booking.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BookingsApi()
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : java.util.UUID = apiInstance.apiV1BookingsBookingIdPaidPost(bookingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingsApi#apiV1BookingsBookingIdPaidPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingsApi#apiV1BookingsBookingIdPaidPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BookingsBookingIdPayPost"></a>
# **apiV1BookingsBookingIdPayPost**
> kotlin.String apiV1BookingsBookingIdPayPost(bookingId)

Pay booking.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BookingsApi()
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.String = apiInstance.apiV1BookingsBookingIdPayPost(bookingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingsApi#apiV1BookingsBookingIdPayPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingsApi#apiV1BookingsBookingIdPayPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.String**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BookingsBookingIdPut"></a>
# **apiV1BookingsBookingIdPut**
> kotlin.Boolean apiV1BookingsBookingIdPut(bookingId, updateBookingCommand)

Update booking.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BookingsApi()
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateBookingCommand : UpdateBookingCommand =  // UpdateBookingCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1BookingsBookingIdPut(bookingId, updateBookingCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingsApi#apiV1BookingsBookingIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingsApi#apiV1BookingsBookingIdPut")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BookingsBookingIdRejectPost"></a>
# **apiV1BookingsBookingIdRejectPost**
> kotlin.Boolean apiV1BookingsBookingIdRejectPost(bookingId, rejectBookingCommand)

Reject booking.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BookingsApi()
val bookingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val rejectBookingCommand : RejectBookingCommand =  // RejectBookingCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1BookingsBookingIdRejectPost(bookingId, rejectBookingCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingsApi#apiV1BookingsBookingIdRejectPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingsApi#apiV1BookingsBookingIdRejectPost")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BookingsGet"></a>
# **apiV1BookingsGet**
> BookingsViewModel apiV1BookingsGet(searchString, isOpen, isCompleted, status, dealPackageId, page, limit, lastRetrieved, current)

Get all bookings.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BookingsApi()
val searchString : kotlin.String = searchString_example // kotlin.String | 
val isOpen : kotlin.Boolean = true // kotlin.Boolean | 
val isCompleted : kotlin.Boolean = true // kotlin.Boolean | 
val status : BookingStatus =  // BookingStatus | 
val dealPackageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : BookingsViewModel = apiInstance.apiV1BookingsGet(searchString, isOpen, isCompleted, status, dealPackageId, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingsApi#apiV1BookingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingsApi#apiV1BookingsGet")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BookingsRequestIdPost"></a>
# **apiV1BookingsRequestIdPost**
> java.util.UUID apiV1BookingsRequestIdPost(requestId, createBookingCommand)

Create booking.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BookingsApi()
val requestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createBookingCommand : CreateBookingCommand =  // CreateBookingCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1BookingsRequestIdPost(requestId, createBookingCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingsApi#apiV1BookingsRequestIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingsApi#apiV1BookingsRequestIdPost")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

