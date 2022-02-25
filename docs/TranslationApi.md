# TranslationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1TranslationsTranslatePost**](TranslationApi.md#apiV1TranslationsTranslatePost) | **POST** api/v1/translations/translate | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TranslationApi::class.java)
val translateCommand : TranslateCommand =  // TranslateCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.apiV1TranslationsTranslatePost(translateCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **translateCommand** | [**TranslateCommand**](TranslateCommand.md)|  | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

