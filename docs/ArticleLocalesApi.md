# ArticleLocalesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ArticlesArticleIdLocalesLanguageCodeGet**](ArticleLocalesApi.md#apiV1ArticlesArticleIdLocalesLanguageCodeGet) | **GET** api/v1/articles/{articleId}/locales/{languageCode} | Get article locale
[**apiV1ArticlesArticleIdLocalesLanguageCodePut**](ArticleLocalesApi.md#apiV1ArticlesArticleIdLocalesLanguageCodePut) | **PUT** api/v1/articles/{articleId}/locales/{languageCode} | Update article locale



Get article locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticleLocalesApi::class.java)
val articleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : ArticleLocaleViewModel = webService.apiV1ArticlesArticleIdLocalesLanguageCodeGet(articleId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |

### Return type

[**ArticleLocaleViewModel**](ArticleLocaleViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update article locale

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticleLocalesApi::class.java)
val articleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val updateArticleLocaleCommand : UpdateArticleLocaleCommand =  // UpdateArticleLocaleCommand | 

launch(Dispatchers.IO) {
    val result : ArticleLocaleViewModel = webService.apiV1ArticlesArticleIdLocalesLanguageCodePut(articleId, languageCode, updateArticleLocaleCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  |
 **updateArticleLocaleCommand** | [**UpdateArticleLocaleCommand**](UpdateArticleLocaleCommand.md)|  | [optional]

### Return type

[**ArticleLocaleViewModel**](ArticleLocaleViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

