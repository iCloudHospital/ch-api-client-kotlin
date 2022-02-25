# ArticleContributorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ArticlesArticleIdContributorsContributorIdDelete**](ArticleContributorsApi.md#apiV1ArticlesArticleIdContributorsContributorIdDelete) | **DELETE** api/v1/articles/{articleId}/contributors/{contributorId} | Delete article contributor
[**apiV1ArticlesArticleIdContributorsContributorIdPut**](ArticleContributorsApi.md#apiV1ArticlesArticleIdContributorsContributorIdPut) | **PUT** api/v1/articles/{articleId}/contributors/{contributorId} | Update article contributor
[**apiV1ArticlesArticleIdContributorsGet**](ArticleContributorsApi.md#apiV1ArticlesArticleIdContributorsGet) | **GET** api/v1/articles/{articleId}/contributors | Get all article contributor
[**apiV1ArticlesArticleIdContributorsPost**](ArticleContributorsApi.md#apiV1ArticlesArticleIdContributorsPost) | **POST** api/v1/articles/{articleId}/contributors | Create article contributor



Delete article contributor

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticleContributorsApi::class.java)
val articleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ArticlesArticleIdContributorsContributorIdDelete(articleId, contributorId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | [**java.util.UUID**](.md)|  |
 **contributorId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update article contributor

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticleContributorsApi::class.java)
val articleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateArticleContributorCommand : UpdateArticleContributorCommand =  // UpdateArticleContributorCommand | 

launch(Dispatchers.IO) {
    val result : ArticleContributorViewModel = webService.apiV1ArticlesArticleIdContributorsContributorIdPut(articleId, contributorId, updateArticleContributorCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | [**java.util.UUID**](.md)|  |
 **contributorId** | [**java.util.UUID**](.md)|  |
 **updateArticleContributorCommand** | [**UpdateArticleContributorCommand**](UpdateArticleContributorCommand.md)|  | [optional]

### Return type

[**ArticleContributorViewModel**](ArticleContributorViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all article contributor

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticleContributorsApi::class.java)
val articleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val website : kotlin.String = website_example // kotlin.String | 
val contributionType : ContributionType =  // ContributionType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : ArticleContributorsViewModel = webService.apiV1ArticlesArticleIdContributorsGet(articleId, name, email, description, website, contributionType, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | [**java.util.UUID**](.md)|  |
 **name** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **website** | **kotlin.String**|  | [optional]
 **contributionType** | [**ContributionType**](.md)|  | [optional] [enum: ReviewedBy, WrittenBy, InterviewWith]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**ArticleContributorsViewModel**](ArticleContributorsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create article contributor

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticleContributorsApi::class.java)
val articleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createArticleContributorCommand : CreateArticleContributorCommand =  // CreateArticleContributorCommand | 

launch(Dispatchers.IO) {
    val result : ArticleContributorViewModel = webService.apiV1ArticlesArticleIdContributorsPost(articleId, createArticleContributorCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | [**java.util.UUID**](.md)|  |
 **createArticleContributorCommand** | [**CreateArticleContributorCommand**](CreateArticleContributorCommand.md)|  | [optional]

### Return type

[**ArticleContributorViewModel**](ArticleContributorViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

