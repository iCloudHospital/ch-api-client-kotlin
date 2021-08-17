# AppVersionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1AppversionPlatformGet**](AppVersionApi.md#apiV1AppversionPlatformGet) | **GET** api/v1/appversion/{platform} | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AppVersionApi::class.java)
val platform : Platform =  // Platform | 

launch(Dispatchers.IO) {
    val result : AppVersionViewModel = webService.apiV1AppversionPlatformGet(platform)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | [**Platform**](.md)|  | [enum: Web, iOS, Android]

### Return type

[**AppVersionViewModel**](AppVersionViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

