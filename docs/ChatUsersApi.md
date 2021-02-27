# ChatUsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ChatusersCurrentGet**](ChatUsersApi.md#apiV1ChatusersCurrentGet) | **GET** api/v1/chatusers/current | 
[**apiV1ChatusersCurrentPost**](ChatUsersApi.md#apiV1ChatusersCurrentPost) | **POST** api/v1/chatusers/current | 
[**apiV1ChatusersDelete**](ChatUsersApi.md#apiV1ChatusersDelete) | **DELETE** api/v1/chatusers | 
[**apiV1ChatusersPut**](ChatUsersApi.md#apiV1ChatusersPut) | **PUT** api/v1/chatusers | 
[**apiV1ChatusersUserIdGet**](ChatUsersApi.md#apiV1ChatusersUserIdGet) | **GET** api/v1/chatusers/{userId} | 





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ChatUsersApi::class.java)

launch(Dispatchers.IO) {
    val result : SendBirdUserViewModel = webService.apiV1ChatusersCurrentGet()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SendBirdUserViewModel**](SendBirdUserViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ChatUsersApi::class.java)
val createSendBirdCurrentUserCommand : CreateSendBirdCurrentUserCommand =  // CreateSendBirdCurrentUserCommand | 

launch(Dispatchers.IO) {
    val result : SendBirdUserViewModel = webService.apiV1ChatusersCurrentPost(createSendBirdCurrentUserCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSendBirdCurrentUserCommand** | [**CreateSendBirdCurrentUserCommand**](CreateSendBirdCurrentUserCommand.md)|  | [optional]

### Return type

[**SendBirdUserViewModel**](SendBirdUserViewModel.md)

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
val webService = apiClient.createWebservice(ChatUsersApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ChatusersDelete()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ChatUsersApi::class.java)
val updateSendBirdUserCommand : UpdateSendBirdUserCommand =  // UpdateSendBirdUserCommand | 

launch(Dispatchers.IO) {
    val result : SendBirdUserViewModel = webService.apiV1ChatusersPut(updateSendBirdUserCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateSendBirdUserCommand** | [**UpdateSendBirdUserCommand**](UpdateSendBirdUserCommand.md)|  | [optional]

### Return type

[**SendBirdUserViewModel**](SendBirdUserViewModel.md)

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
val webService = apiClient.createWebservice(ChatUsersApi::class.java)
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : SendBirdUserViewModel = webService.apiV1ChatusersUserIdGet(userId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**java.util.UUID**](.md)|  |

### Return type

[**SendBirdUserViewModel**](SendBirdUserViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

