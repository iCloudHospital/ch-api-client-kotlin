# GroupChannelsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1GroupchannelsChannelUrlInvitePost**](GroupChannelsApi.md#apiV1GroupchannelsChannelUrlInvitePost) | **POST** api/v1/groupchannels/{channelUrl}/invite | 
[**apiV1GroupchannelsDealDealIdGet**](GroupChannelsApi.md#apiV1GroupchannelsDealDealIdGet) | **GET** api/v1/groupchannels/deal/{dealId} | 
[**apiV1GroupchannelsDealDealIdPost**](GroupChannelsApi.md#apiV1GroupchannelsDealDealIdPost) | **POST** api/v1/groupchannels/deal/{dealId} | 
[**apiV1GroupchannelsDoctorDoctorIdGet**](GroupChannelsApi.md#apiV1GroupchannelsDoctorDoctorIdGet) | **GET** api/v1/groupchannels/doctor/{doctorId} | 
[**apiV1GroupchannelsDoctorDoctorIdPost**](GroupChannelsApi.md#apiV1GroupchannelsDoctorDoctorIdPost) | **POST** api/v1/groupchannels/doctor/{doctorId} | 
[**apiV1GroupchannelsHospitalHospitalIdGet**](GroupChannelsApi.md#apiV1GroupchannelsHospitalHospitalIdGet) | **GET** api/v1/groupchannels/hospital/{hospitalId} | 
[**apiV1GroupchannelsHospitalHospitalIdPost**](GroupChannelsApi.md#apiV1GroupchannelsHospitalHospitalIdPost) | **POST** api/v1/groupchannels/hospital/{hospitalId} | 
[**apiV1GroupchannelsIdGet**](GroupChannelsApi.md#apiV1GroupchannelsIdGet) | **GET** api/v1/groupchannels/{id} | 





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
    val result : SendBirdGroupChannelViewModel = webService.apiV1GroupchannelsChannelUrlInvitePost(channelUrl, inviteSendBirdGroupChannelCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **kotlin.String**|  |
 **inviteSendBirdGroupChannelCommand** | [**InviteSendBirdGroupChannelCommand**](InviteSendBirdGroupChannelCommand.md)|  | [optional]

### Return type

[**SendBirdGroupChannelViewModel**](SendBirdGroupChannelViewModel.md)

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
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealId : kotlin.String = dealId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : SendBirdGroupChannelViewModel = webService.apiV1GroupchannelsDealDealIdGet(hospitalId, dealId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **dealId** | **kotlin.String**|  |

### Return type

[**SendBirdGroupChannelViewModel**](SendBirdGroupChannelViewModel.md)

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
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1GroupchannelsDealDealIdPost(dealId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

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
val doctorId : kotlin.String = doctorId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : SendBirdGroupChannelViewModel = webService.apiV1GroupchannelsDoctorDoctorIdGet(hospitalId, doctorId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **doctorId** | **kotlin.String**|  |

### Return type

[**SendBirdGroupChannelViewModel**](SendBirdGroupChannelViewModel.md)

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

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1GroupchannelsDoctorDoctorIdPost(doctorId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

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
    val result : SendBirdGroupChannelViewModel = webService.apiV1GroupchannelsHospitalHospitalIdGet(hospitalId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |

### Return type

[**SendBirdGroupChannelViewModel**](SendBirdGroupChannelViewModel.md)

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
    val result : kotlin.Boolean = webService.apiV1GroupchannelsHospitalHospitalIdPost(hospitalId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

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
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1GroupchannelsIdGet(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

