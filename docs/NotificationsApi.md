# NotificationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2NotificationsCheckPost**](NotificationsApi.md#apiV2NotificationsCheckPost) | **POST** api/v2/notifications/check | Check notification.
[**apiV2NotificationsGet**](NotificationsApi.md#apiV2NotificationsGet) | **GET** api/v2/notifications | Get all notifications.



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
    val result : kotlin.Boolean = webService.apiV2NotificationsCheckPost(checkNotificationsCommand)
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
 - **Accept**: application/json


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
val unreadCountOnly : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : NotificationsModel = webService.apiV2NotificationsGet(notificationCode, unreadCountOnly, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationCode** | [**NotificationCode**](.md)|  | [optional] [enum: WelcomeEmail, DirectMessageSent, BookingNew, BookingUpdated, BookingRejected, BookingApproved, BookingPaid, BookingCanceled, BookingRefundRequested, BookingRefunded, ConsultationNew, ConsultationUpdated, ConsultationRejected, ConsultationApproved, ConsultationPaid, ConsultationCanceled, ConsultationRefundRequested, ConsultationRefunded, ConsultationReady]
 **unreadCountOnly** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**NotificationsModel**](NotificationsModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

