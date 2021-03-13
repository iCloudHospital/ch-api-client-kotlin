# DevicesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DevicesGet**](DevicesApi.md#apiV1DevicesGet) | **GET** api/v1/devices | Get all devices.
[**apiV1DevicesIdDelete**](DevicesApi.md#apiV1DevicesIdDelete) | **DELETE** api/v1/devices/{id} | Delete device.
[**apiV1DevicesIdGet**](DevicesApi.md#apiV1DevicesIdGet) | **GET** api/v1/devices/{id} | Get device.
[**apiV1DevicesIdLoginsPost**](DevicesApi.md#apiV1DevicesIdLoginsPost) | **POST** api/v1/devices/{id}/logins | Create device login.
[**apiV1DevicesIdPut**](DevicesApi.md#apiV1DevicesIdPut) | **PUT** api/v1/devices/{id} | Update device.
[**apiV1DevicesPost**](DevicesApi.md#apiV1DevicesPost) | **POST** api/v1/devices | Create device.



Get all devices.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DevicesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val token : kotlin.String = token_example // kotlin.String | 
val platform : Platform =  // Platform | 
val appAlert : kotlin.Boolean = true // kotlin.Boolean | 
val eventAlert : kotlin.Boolean = true // kotlin.Boolean | 
val noticeAlert : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DevicesViewModel = webService.apiV1DevicesGet(id, token, platform, appAlert, eventAlert, noticeAlert, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **token** | **kotlin.String**|  | [optional]
 **platform** | [**Platform**](.md)|  | [optional] [enum: Web, iOS, Android]
 **appAlert** | **kotlin.Boolean**|  | [optional]
 **eventAlert** | **kotlin.Boolean**|  | [optional]
 **noticeAlert** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DevicesViewModel**](DevicesViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete device.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DevicesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DevicesIdDelete(id)
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


Get device.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DevicesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DeviceViewModel = webService.apiV1DevicesIdGet(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  |

### Return type

[**DeviceViewModel**](DeviceViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create device login.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DevicesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDeviceLoginCommand : CreateDeviceLoginCommand =  // CreateDeviceLoginCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1DevicesIdLoginsPost(id, createDeviceLoginCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  |
 **createDeviceLoginCommand** | [**CreateDeviceLoginCommand**](CreateDeviceLoginCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Update device.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DevicesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDeviceCommand : UpdateDeviceCommand =  // UpdateDeviceCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DevicesIdPut(id, updateDeviceCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  |
 **updateDeviceCommand** | [**UpdateDeviceCommand**](UpdateDeviceCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Create device.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DevicesApi::class.java)
val createDeviceCommand : CreateDeviceCommand =  // CreateDeviceCommand | 

launch(Dispatchers.IO) {
    val result : DeviceViewModel = webService.apiV1DevicesPost(createDeviceCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDeviceCommand** | [**CreateDeviceCommand**](CreateDeviceCommand.md)|  | [optional]

### Return type

[**DeviceViewModel**](DeviceViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

