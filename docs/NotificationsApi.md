# NotificationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1NotificationsCheckPost**](NotificationsApi.md#apiV1NotificationsCheckPost) | **POST** api/v1/notifications/check | Check notification.
[**apiV1NotificationsGet**](NotificationsApi.md#apiV1NotificationsGet) | **GET** api/v1/notifications | Get all notifications.



Check notification.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(NotificationsApi::class.java)
val checkNotificationsCommand : CheckNotificationsCommand =  // CheckNotificationsCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1NotificationsCheckPost(checkNotificationsCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkNotificationsCommand** | [**CheckNotificationsCommand**](CheckNotificationsCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all notifications.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(NotificationsApi::class.java)
val notificationCode : NotificationCode =  // NotificationCode | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : NotificationsViewModel = webService.apiV1NotificationsGet(notificationCode, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationCode** | [**NotificationCode**](.md)|  | [optional] [enum: WelcomeEmail, DirectMessageSent, BookingNew, BookingUpdated, BookingRejected, BookingApproved, BookingPaid, BookingCanceled, BookingRefundRequested, BookingRefunded, ConsultationNew, ConsultationUpdated, ConsultationRejected, ConsultationApproved, ConsultationPaid, ConsultationCanceled, ConsultationRefundRequested, ConsultationRefunded]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**NotificationsViewModel**](NotificationsViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

