# ProfilesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ProfilesChangeemailPost**](ProfilesApi.md#apiV1ProfilesChangeemailPost) | **POST** /api/v1/profiles/changeemail | Change user&#39;s email on both Identity and Api.
[**apiV1ProfilesConfirmemailPost**](ProfilesApi.md#apiV1ProfilesConfirmemailPost) | **POST** /api/v1/profiles/confirmemail | 
[**apiV1ProfilesGet**](ProfilesApi.md#apiV1ProfilesGet) | **GET** /api/v1/profiles | Get current user&#39;s profile.


<a name="apiV1ProfilesChangeemailPost"></a>
# **apiV1ProfilesChangeemailPost**
> kotlin.Boolean apiV1ProfilesChangeemailPost(changeEmailCommand)

Change user&#39;s email on both Identity and Api.

Sample request:        POST /api/v1/profiles/changeEmail      {          \&quot;email\&quot;: \&quot;user@example.com\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val changeEmailCommand : ChangeEmailCommand =  // ChangeEmailCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ProfilesChangeemailPost(changeEmailCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#apiV1ProfilesChangeemailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#apiV1ProfilesChangeemailPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeEmailCommand** | [**ChangeEmailCommand**](ChangeEmailCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ProfilesConfirmemailPost"></a>
# **apiV1ProfilesConfirmemailPost**
> kotlin.Boolean apiV1ProfilesConfirmemailPost(confirmEmailCommand)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val confirmEmailCommand : ConfirmEmailCommand =  // ConfirmEmailCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ProfilesConfirmemailPost(confirmEmailCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#apiV1ProfilesConfirmemailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#apiV1ProfilesConfirmemailPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **confirmEmailCommand** | [**ConfirmEmailCommand**](ConfirmEmailCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ProfilesGet"></a>
# **apiV1ProfilesGet**
> UserViewModel apiV1ProfilesGet()

Get current user&#39;s profile.

Sample request:        GET /api/v1/profiles

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
try {
    val result : UserViewModel = apiInstance.apiV1ProfilesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#apiV1ProfilesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#apiV1ProfilesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserViewModel**](UserViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

