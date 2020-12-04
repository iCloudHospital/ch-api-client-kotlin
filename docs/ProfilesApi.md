# ProfilesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ProfilesChangeemailPost**](ProfilesApi.md#apiV1ProfilesChangeemailPost) | **POST** api/v1/profiles/changeemail | Change user&#39;s email on both Identity and Api.
[**apiV1ProfilesConfirmemailPost**](ProfilesApi.md#apiV1ProfilesConfirmemailPost) | **POST** api/v1/profiles/confirmemail | 
[**apiV1ProfilesGet**](ProfilesApi.md#apiV1ProfilesGet) | **GET** api/v1/profiles | Get current user&#39;s profile.



Change user&#39;s email on both Identity and Api.

Sample request:        POST /api/v1/profiles/changeEmail      {          \&quot;email\&quot;: \&quot;user@example.com\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val changeEmailCommand : ChangeEmailCommand =  // ChangeEmailCommand | 

val result : kotlin.Boolean = webService.apiV1ProfilesChangeemailPost(changeEmailCommand)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeEmailCommand** | [**ChangeEmailCommand**](ChangeEmailCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val confirmEmailCommand : ConfirmEmailCommand =  // ConfirmEmailCommand | 

val result : kotlin.Boolean = webService.apiV1ProfilesConfirmemailPost(confirmEmailCommand)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **confirmEmailCommand** | [**ConfirmEmailCommand**](ConfirmEmailCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get current user&#39;s profile.

Sample request:        GET /api/v1/profiles

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ProfilesApi::class.java)

val result : UserViewModel = webService.apiV1ProfilesGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserViewModel**](UserViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

