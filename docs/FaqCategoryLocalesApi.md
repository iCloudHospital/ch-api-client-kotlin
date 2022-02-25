# FaqCategoryLocalesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1FaqcategoriesFaqCategoryIdLocalesLanguageCodeGet**](FaqCategoryLocalesApi.md#apiV1FaqcategoriesFaqCategoryIdLocalesLanguageCodeGet) | **GET** api/v1/faqcategories/{faqCategoryId}/locales/{languageCode} | Get faqCategory locale
[**apiV1FaqcategoriesFaqCategoryIdLocalesLanguageCodePut**](FaqCategoryLocalesApi.md#apiV1FaqcategoriesFaqCategoryIdLocalesLanguageCodePut) | **PUT** api/v1/faqcategories/{faqCategoryId}/locales/{languageCode} | Update faqCategory locale



Get faqCategory locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FaqCategoryLocalesApi::class.java)
val faqCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : FaqCategoryLocaleViewModel = webService.apiV1FaqcategoriesFaqCategoryIdLocalesLanguageCodeGet(faqCategoryId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqCategoryId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |

### Return type

[**FaqCategoryLocaleViewModel**](FaqCategoryLocaleViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update faqCategory locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FaqCategoryLocalesApi::class.java)
val faqCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val updateFaqCategoryLocaleCommand : UpdateFaqCategoryLocaleCommand =  // UpdateFaqCategoryLocaleCommand | 

launch(Dispatchers.IO) {
    val result : FaqCategoryLocaleViewModel = webService.apiV1FaqcategoriesFaqCategoryIdLocalesLanguageCodePut(faqCategoryId, languageCode, updateFaqCategoryLocaleCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqCategoryId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |
 **updateFaqCategoryLocaleCommand** | [**UpdateFaqCategoryLocaleCommand**](UpdateFaqCategoryLocaleCommand.md)|  | [optional]

### Return type

[**FaqCategoryLocaleViewModel**](FaqCategoryLocaleViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

