# GroupChannelsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2GroupchannelsChannelUrlInvitePost**](GroupChannelsApi.md#apiV2GroupchannelsChannelUrlInvitePost) | **POST** api/v2/groupchannels/{channelUrl}/invite | 
[**apiV2GroupchannelsDealDealIdGet**](GroupChannelsApi.md#apiV2GroupchannelsDealDealIdGet) | **GET** api/v2/groupchannels/deal/{dealId} | 
[**apiV2GroupchannelsDoctorDoctorIdGet**](GroupChannelsApi.md#apiV2GroupchannelsDoctorDoctorIdGet) | **GET** api/v2/groupchannels/doctor/{doctorId} | 
[**apiV2GroupchannelsHospitalHospitalIdGet**](GroupChannelsApi.md#apiV2GroupchannelsHospitalHospitalIdGet) | **GET** api/v2/groupchannels/hospital/{hospitalId} | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupChannelsApi::class.java)
val channelUrl : kotlin.String = channelUrl_example // kotlin.String | 
val inviteSendBirdGroupChannelCommand : InviteSendBirdGroupChannelCommand =  // InviteSendBirdGroupChannelCommand | 

launch(Dispatchers.IO) {
    val result : SendBirdGroupChannelModel = webService.apiV2GroupchannelsChannelUrlInvitePost(channelUrl, inviteSendBirdGroupChannelCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **kotlin.String**|  |
 **inviteSendBirdGroupChannelCommand** | [**InviteSendBirdGroupChannelCommand**](InviteSendBirdGroupChannelCommand.md)|  | [optional]

### Return type

[**SendBirdGroupChannelModel**](SendBirdGroupChannelModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupChannelsApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : SendBirdGroupChannelModel = webService.apiV2GroupchannelsDealDealIdGet(dealId, hospitalId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | [**java.util.UUID**](.md)|  |
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]

### Return type

[**SendBirdGroupChannelModel**](SendBirdGroupChannelModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupChannelsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : SendBirdGroupChannelModel = webService.apiV2GroupchannelsDoctorDoctorIdGet(doctorId, hospitalId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]

### Return type

[**SendBirdGroupChannelModel**](SendBirdGroupChannelModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupChannelsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : SendBirdGroupChannelModel = webService.apiV2GroupchannelsHospitalHospitalIdGet(hospitalId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |

### Return type

[**SendBirdGroupChannelModel**](SendBirdGroupChannelModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

