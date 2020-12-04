# DevicesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DevicesDeviceIdDelete**](DevicesApi.md#apiV1DevicesDeviceIdDelete) | **DELETE** api/v1/devices/{deviceId} | Delete device.
[**apiV1DevicesDeviceIdGet**](DevicesApi.md#apiV1DevicesDeviceIdGet) | **GET** api/v1/devices/{deviceId} | Get device.
[**apiV1DevicesDeviceIdLoginsPost**](DevicesApi.md#apiV1DevicesDeviceIdLoginsPost) | **POST** api/v1/devices/{deviceId}/logins | Create device login.
[**apiV1DevicesDeviceIdPut**](DevicesApi.md#apiV1DevicesDeviceIdPut) | **PUT** api/v1/devices/{deviceId} | Update device.
[**apiV1DevicesPost**](DevicesApi.md#apiV1DevicesPost) | **POST** api/v1/devices | Create device.



Delete device.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DevicesApi::class.java)
val deviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : kotlin.Boolean = webService.apiV1DevicesDeviceIdDelete(deviceId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | [**java.util.UUID**](.md)|  |

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
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DevicesApi::class.java)
val deviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : DeviceViewModel = webService.apiV1DevicesDeviceIdGet(deviceId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | [**java.util.UUID**](.md)|  |

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
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DevicesApi::class.java)
val deviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDeviceLoginCommand : CreateDeviceLoginCommand =  // CreateDeviceLoginCommand | 

val result : java.util.UUID = webService.apiV1DevicesDeviceIdLoginsPost(deviceId, createDeviceLoginCommand)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | [**java.util.UUID**](.md)|  |
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
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DevicesApi::class.java)
val deviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDeviceCommand : UpdateDeviceCommand =  // UpdateDeviceCommand | 

val result : kotlin.Boolean = webService.apiV1DevicesDeviceIdPut(deviceId, updateDeviceCommand)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | [**java.util.UUID**](.md)|  |
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
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DevicesApi::class.java)
val createDeviceCommand : CreateDeviceCommand =  // CreateDeviceCommand | 

val result : java.util.UUID = webService.apiV1DevicesPost(createDeviceCommand)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDeviceCommand** | [**CreateDeviceCommand**](CreateDeviceCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

