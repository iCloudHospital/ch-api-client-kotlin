# HeaderNavigationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2HeadernavigationsLanguageCodeGet**](HeaderNavigationsApi.md#apiV2HeadernavigationsLanguageCodeGet) | **GET** api/v2/headernavigations/{languageCode} | Get all HeaderNavigationItems



Get all HeaderNavigationItems

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HeaderNavigationsApi::class.java)
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<HeaderNavigationItemModel> = webService.apiV2HeadernavigationsLanguageCodeGet(languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **languageCode** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;HeaderNavigationItemModel&gt;**](HeaderNavigationItemModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

