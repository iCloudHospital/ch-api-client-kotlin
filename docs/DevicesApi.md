# DevicesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DevicesDeviceIdDelete**](DevicesApi.md#apiV1DevicesDeviceIdDelete) | **DELETE** /api/v1/devices/{deviceId} | Delete device.
[**apiV1DevicesDeviceIdGet**](DevicesApi.md#apiV1DevicesDeviceIdGet) | **GET** /api/v1/devices/{deviceId} | Get device.
[**apiV1DevicesDeviceIdLoginsPost**](DevicesApi.md#apiV1DevicesDeviceIdLoginsPost) | **POST** /api/v1/devices/{deviceId}/logins | Create device login.
[**apiV1DevicesDeviceIdPut**](DevicesApi.md#apiV1DevicesDeviceIdPut) | **PUT** /api/v1/devices/{deviceId} | Update device.
[**apiV1DevicesPost**](DevicesApi.md#apiV1DevicesPost) | **POST** /api/v1/devices | Create device.


<a name="apiV1DevicesDeviceIdDelete"></a>
# **apiV1DevicesDeviceIdDelete**
> kotlin.Boolean apiV1DevicesDeviceIdDelete(deviceId)

Delete device.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevicesApi()
val deviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DevicesDeviceIdDelete(deviceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DevicesApi#apiV1DevicesDeviceIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevicesApi#apiV1DevicesDeviceIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DevicesDeviceIdGet"></a>
# **apiV1DevicesDeviceIdGet**
> DeviceViewModel apiV1DevicesDeviceIdGet(deviceId)

Get device.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevicesApi()
val deviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeviceViewModel = apiInstance.apiV1DevicesDeviceIdGet(deviceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DevicesApi#apiV1DevicesDeviceIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevicesApi#apiV1DevicesDeviceIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | [**java.util.UUID**](.md)|  |

### Return type

[**DeviceViewModel**](DeviceViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DevicesDeviceIdLoginsPost"></a>
# **apiV1DevicesDeviceIdLoginsPost**
> java.util.UUID apiV1DevicesDeviceIdLoginsPost(deviceId, createDeviceLoginCommand)

Create device login.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevicesApi()
val deviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDeviceLoginCommand : CreateDeviceLoginCommand =  // CreateDeviceLoginCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1DevicesDeviceIdLoginsPost(deviceId, createDeviceLoginCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DevicesApi#apiV1DevicesDeviceIdLoginsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevicesApi#apiV1DevicesDeviceIdLoginsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | [**java.util.UUID**](.md)|  |
 **createDeviceLoginCommand** | [**CreateDeviceLoginCommand**](CreateDeviceLoginCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DevicesDeviceIdPut"></a>
# **apiV1DevicesDeviceIdPut**
> kotlin.Boolean apiV1DevicesDeviceIdPut(deviceId, updateDeviceCommand)

Update device.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevicesApi()
val deviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDeviceCommand : UpdateDeviceCommand =  // UpdateDeviceCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DevicesDeviceIdPut(deviceId, updateDeviceCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DevicesApi#apiV1DevicesDeviceIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevicesApi#apiV1DevicesDeviceIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | [**java.util.UUID**](.md)|  |
 **updateDeviceCommand** | [**UpdateDeviceCommand**](UpdateDeviceCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DevicesPost"></a>
# **apiV1DevicesPost**
> java.util.UUID apiV1DevicesPost(createDeviceCommand)

Create device.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevicesApi()
val createDeviceCommand : CreateDeviceCommand =  // CreateDeviceCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1DevicesPost(createDeviceCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DevicesApi#apiV1DevicesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevicesApi#apiV1DevicesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDeviceCommand** | [**CreateDeviceCommand**](CreateDeviceCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

