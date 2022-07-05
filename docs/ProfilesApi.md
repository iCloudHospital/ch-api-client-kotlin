# ProfilesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2ProfilesChangeemailPost**](ProfilesApi.md#apiV2ProfilesChangeemailPost) | **POST** api/v2/profiles/changeemail | Change user&#39;s email on both Identity and Api.
[**apiV2ProfilesConfirmemailPost**](ProfilesApi.md#apiV2ProfilesConfirmemailPost) | **POST** api/v2/profiles/confirmemail | Configm email.
[**apiV2ProfilesGet**](ProfilesApi.md#apiV2ProfilesGet) | **GET** api/v2/profiles | Get Profile.
[**apiV2ProfilesPut**](ProfilesApi.md#apiV2ProfilesPut) | **PUT** api/v2/profiles | Update Profile.



Change user&#39;s email on both Identity and Api.

Sample request:        POST /api/v1/profiles/changeEmail      {          \&quot;email\&quot;: \&quot;user@example.com\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val changeEmailCommand : ChangeEmailCommand =  // ChangeEmailCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV2ProfilesChangeemailPost(changeEmailCommand)
}
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
 - **Accept**: application/json


Configm email.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val confirmEmailCommand : ConfirmEmailCommand =  // ConfirmEmailCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV2ProfilesConfirmemailPost(confirmEmailCommand)
}
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
 - **Accept**: application/json


Get Profile.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ProfilesApi::class.java)

launch(Dispatchers.IO) {
    val result : UserModel = webService.apiV2ProfilesGet()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserModel**](UserModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Profile.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val updateProfileCommand : UpdateProfileCommand =  // UpdateProfileCommand | 

launch(Dispatchers.IO) {
    val result : UserModel = webService.apiV2ProfilesPut(updateProfileCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateProfileCommand** | [**UpdateProfileCommand**](UpdateProfileCommand.md)|  | [optional]

### Return type

[**UserModel**](UserModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: application/json

