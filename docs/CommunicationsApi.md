# CommunicationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1CommunicationsDelete**](CommunicationsApi.md#apiV1CommunicationsDelete) | **DELETE** /api/v1/communications | 
[**apiV1CommunicationsGet**](CommunicationsApi.md#apiV1CommunicationsGet) | **GET** /api/v1/communications | 
[**apiV1CommunicationsPut**](CommunicationsApi.md#apiV1CommunicationsPut) | **PUT** /api/v1/communications | 


<a name="apiV1CommunicationsDelete"></a>
# **apiV1CommunicationsDelete**
> kotlin.Int apiV1CommunicationsDelete()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommunicationsApi()
try {
    val result : kotlin.Int = apiInstance.apiV1CommunicationsDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommunicationsApi#apiV1CommunicationsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommunicationsApi#apiV1CommunicationsDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Int**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CommunicationsGet"></a>
# **apiV1CommunicationsGet**
> CommunicationUserTokenModel apiV1CommunicationsGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommunicationsApi()
try {
    val result : CommunicationUserTokenModel = apiInstance.apiV1CommunicationsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommunicationsApi#apiV1CommunicationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommunicationsApi#apiV1CommunicationsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CommunicationUserTokenModel**](CommunicationUserTokenModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CommunicationsPut"></a>
# **apiV1CommunicationsPut**
> CommunicationUserTokenModel apiV1CommunicationsPut()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommunicationsApi()
try {
    val result : CommunicationUserTokenModel = apiInstance.apiV1CommunicationsPut()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommunicationsApi#apiV1CommunicationsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommunicationsApi#apiV1CommunicationsPut")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CommunicationUserTokenModel**](CommunicationUserTokenModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

