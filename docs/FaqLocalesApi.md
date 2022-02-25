# FaqLocalesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1FaqsFaqIdLocalesLanguageCodeGet**](FaqLocalesApi.md#apiV1FaqsFaqIdLocalesLanguageCodeGet) | **GET** api/v1/faqs/{faqId}/locales/{languageCode} | Get faq locale
[**apiV1FaqsFaqIdLocalesLanguageCodePut**](FaqLocalesApi.md#apiV1FaqsFaqIdLocalesLanguageCodePut) | **PUT** api/v1/faqs/{faqId}/locales/{languageCode} | Update faq locale



Get faq locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FaqLocalesApi::class.java)
val faqId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : FaqLocaleViewModel = webService.apiV1FaqsFaqIdLocalesLanguageCodeGet(faqId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |

### Return type

[**FaqLocaleViewModel**](FaqLocaleViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update faq locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FaqLocalesApi::class.java)
val faqId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val updateFaqLocaleCommand : UpdateFaqLocaleCommand =  // UpdateFaqLocaleCommand | 

launch(Dispatchers.IO) {
    val result : FaqLocaleViewModel = webService.apiV1FaqsFaqIdLocalesLanguageCodePut(faqId, languageCode, updateFaqLocaleCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |
 **updateFaqLocaleCommand** | [**UpdateFaqLocaleCommand**](UpdateFaqLocaleCommand.md)|  | [optional]

### Return type

[**FaqLocaleViewModel**](FaqLocaleViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

