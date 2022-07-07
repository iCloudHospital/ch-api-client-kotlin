# ChatUsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2ChatusersCurrentGet**](ChatUsersApi.md#apiV2ChatusersCurrentGet) | **GET** api/v2/chatusers/current | 
[**apiV2ChatusersGet**](ChatUsersApi.md#apiV2ChatusersGet) | **GET** api/v2/chatusers | Get all chatUsers.
[**apiV2ChatusersPost**](ChatUsersApi.md#apiV2ChatusersPost) | **POST** api/v2/chatusers | Create a chatUser.
[**apiV2ChatusersUserIdDelete**](ChatUsersApi.md#apiV2ChatusersUserIdDelete) | **DELETE** api/v2/chatusers/{userId} | Delete chatUser.
[**apiV2ChatusersUserIdGet**](ChatUsersApi.md#apiV2ChatusersUserIdGet) | **GET** api/v2/chatusers/{userId} | Get chatUser.
[**apiV2ChatusersUserIdPut**](ChatUsersApi.md#apiV2ChatusersUserIdPut) | **PUT** api/v2/chatusers/{userId} | Update chatUser.





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ChatUsersApi::class.java)

launch(Dispatchers.IO) {
    val result : ChatUserModel = webService.apiV2ChatusersCurrentGet()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChatUserModel**](ChatUserModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all chatUsers.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ChatUsersApi::class.java)
val limit : kotlin.Int = 56 // kotlin.Int | 
val token : kotlin.String = token_example // kotlin.String | 
val userIds : kotlin.String = userIds_example // kotlin.String | 
val nickname : kotlin.String = nickname_example // kotlin.String | 
val nicknameStartswith : kotlin.String = nicknameStartswith_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : ChatUsersModel = webService.apiV2ChatusersGet(limit, token, userIds, nickname, nicknameStartswith)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional]
 **token** | **kotlin.String**|  | [optional]
 **userIds** | **kotlin.String**|  | [optional]
 **nickname** | **kotlin.String**|  | [optional]
 **nicknameStartswith** | **kotlin.String**|  | [optional]

### Return type

[**ChatUsersModel**](ChatUsersModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Create a chatUser.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ChatUsersApi::class.java)
val createChatUserCommand : CreateChatUserCommand =  // CreateChatUserCommand | 

launch(Dispatchers.IO) {
    val result : ChatUserModel = webService.apiV2ChatusersPost(createChatUserCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatUserCommand** | [**CreateChatUserCommand**](CreateChatUserCommand.md)|  | [optional]

### Return type

[**ChatUserModel**](ChatUserModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json


Delete chatUser.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ChatUsersApi::class.java)
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV2ChatusersUserIdDelete(userId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **java.util.UUID**|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get chatUser.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ChatUsersApi::class.java)
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : ChatUserModel = webService.apiV2ChatusersUserIdGet(userId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **java.util.UUID**|  |

### Return type

[**ChatUserModel**](ChatUserModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update chatUser.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ChatUsersApi::class.java)
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateChatUserCommand : UpdateChatUserCommand =  // UpdateChatUserCommand | 

launch(Dispatchers.IO) {
    val result : ChatUserModel = webService.apiV2ChatusersUserIdPut(userId, updateChatUserCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **java.util.UUID**|  |
 **updateChatUserCommand** | [**UpdateChatUserCommand**](UpdateChatUserCommand.md)|  | [optional]

### Return type

[**ChatUserModel**](ChatUserModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/*+json
 - **Accept**: application/json

