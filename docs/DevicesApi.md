# DevicesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2DevicesGet**](DevicesApi.md#apiV2DevicesGet) | **GET** api/v2/devices | Get all devices.
[**apiV2DevicesIdDelete**](DevicesApi.md#apiV2DevicesIdDelete) | **DELETE** api/v2/devices/{id} | Delete device.
[**apiV2DevicesIdGet**](DevicesApi.md#apiV2DevicesIdGet) | **GET** api/v2/devices/{id} | Get device.
[**apiV2DevicesIdLoginsPost**](DevicesApi.md#apiV2DevicesIdLoginsPost) | **POST** api/v2/devices/{id}/logins | Create device login.
[**apiV2DevicesIdPut**](DevicesApi.md#apiV2DevicesIdPut) | **PUT** api/v2/devices/{id} | Update device.
[**apiV2DevicesPost**](DevicesApi.md#apiV2DevicesPost) | **POST** api/v2/devices | Create device.



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
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DevicesModel = webService.apiV2DevicesGet(id, token, platform, appAlert, eventAlert, noticeAlert, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  | [optional]
 **token** | **kotlin.String**|  | [optional]
 **platform** | [**Platform**](.md)|  | [optional] [enum: Web, iOS, Android]
 **appAlert** | **kotlin.Boolean**|  | [optional]
 **eventAlert** | **kotlin.Boolean**|  | [optional]
 **noticeAlert** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DevicesModel**](DevicesModel.md)

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
    val result : kotlin.Boolean = webService.apiV2DevicesIdDelete(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

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
    val result : DeviceModel = webService.apiV2DevicesIdGet(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**DeviceModel**](DeviceModel.md)

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
    val result : java.util.UUID = webService.apiV2DevicesIdLoginsPost(id, createDeviceLoginCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **createDeviceLoginCommand** | [**CreateDeviceLoginCommand**](CreateDeviceLoginCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
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
    val result : kotlin.Boolean = webService.apiV2DevicesIdPut(id, updateDeviceCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **updateDeviceCommand** | [**UpdateDeviceCommand**](UpdateDeviceCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
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
    val result : DeviceModel = webService.apiV2DevicesPost(createDeviceCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDeviceCommand** | [**CreateDeviceCommand**](CreateDeviceCommand.md)|  | [optional]

### Return type

[**DeviceModel**](DeviceModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

