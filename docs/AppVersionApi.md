# AppVersionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2AppversionPlatformGet**](AppVersionApi.md#apiV2AppversionPlatformGet) | **GET** api/v2/appversion/{platform} | 





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
    val result : AppVersionModel = webService.apiV2AppversionPlatformGet(platform)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | [**Platform**](.md)|  | [enum: Web, iOS, Android]

### Return type

[**AppVersionModel**](AppVersionModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

