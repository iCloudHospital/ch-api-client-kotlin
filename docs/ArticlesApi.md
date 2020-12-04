# ArticlesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsArticlesGet**](ArticlesApi.md#apiV1HospitalsArticlesGet) | **GET** api/v1/hospitals/articles | Get all articles.
[**apiV1HospitalsArticlesSlugsSlugGet**](ArticlesApi.md#apiV1HospitalsArticlesSlugsSlugGet) | **GET** api/v1/hospitals/articles/slugs/{slug} | Get article by slug.
[**apiV1HospitalsHospitalIdArticlesArticleIdDelete**](ArticlesApi.md#apiV1HospitalsHospitalIdArticlesArticleIdDelete) | **DELETE** api/v1/hospitals/{hospitalId}/articles/{articleId} | Delete article.
[**apiV1HospitalsHospitalIdArticlesArticleIdGet**](ArticlesApi.md#apiV1HospitalsHospitalIdArticlesArticleIdGet) | **GET** api/v1/hospitals/{hospitalId}/articles/{articleId} | Get article.
[**apiV1HospitalsHospitalIdArticlesArticleIdPut**](ArticlesApi.md#apiV1HospitalsHospitalIdArticlesArticleIdPut) | **PUT** api/v1/hospitals/{hospitalId}/articles/{articleId} | Update article.
[**apiV1HospitalsHospitalIdArticlesPost**](ArticlesApi.md#apiV1HospitalsHospitalIdArticlesPost) | **POST** api/v1/hospitals/{hospitalId}/articles | Create an article.



Get all articles.

Sample request:        GET /api/v1/hospitals/1/articles

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticlesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val title : kotlin.String = title_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val status : ArticleStatus =  // ArticleStatus | 
val marketingType : MarketingType =  // MarketingType | 
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val userName : kotlin.String = userName_example // kotlin.String | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tag : kotlin.String = tag_example // kotlin.String | 
val exceptHospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

val result : ArticlesViewModel = webService.apiV1HospitalsArticlesGet(id, title, description, status, marketingType, userId, userName, hospitalId, hospitalName, countryId, tag, exceptHospitalId, page, limit, lastRetrieved, current)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **title** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **status** | [**ArticleStatus**](.md)|  | [optional] [enum: Draft, Active, Archived]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **userId** | [**java.util.UUID**](.md)|  | [optional]
 **userName** | **kotlin.String**|  | [optional]
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **countryId** | [**java.util.UUID**](.md)|  | [optional]
 **tag** | **kotlin.String**|  | [optional]
 **exceptHospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**ArticlesViewModel**](ArticlesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get article by slug.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticlesApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 

val result : ArticleViewModel = webService.apiV1HospitalsArticlesSlugsSlugGet(slug)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**ArticleViewModel**](ArticleViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete article.

Sample request:        DELETE /api/v1/hospitals/1/articles/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticlesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val articleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdArticlesArticleIdDelete(hospitalId, articleId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **articleId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get article.

Sample request:        GET /api/v1/hospitals/1/articles/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticlesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val articleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : ArticleViewModel = webService.apiV1HospitalsHospitalIdArticlesArticleIdGet(hospitalId, articleId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **articleId** | [**java.util.UUID**](.md)|  |

### Return type

[**ArticleViewModel**](ArticleViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update article.

Sample request:        PUT /api/v1/hospitals/1/articles/1      {          \&quot;title\&quot;: \&quot;Samsung Hospital Article\&quot;,          \&quot;description\&quot;: \&quot;This is an article.\&quot;,          \&quot;body\&quot;: \&quot;updated article body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;tags\&quot;: [            {              \&quot;value\&quot;: \&quot;articletag1\&quot;,              \&quot;order\&quot;: 0            },            {              \&quot;value\&quot;: \&quot;articletag2\&quot;,              \&quot;order\&quot;: 0            }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticlesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val articleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateArticleCommand : UpdateArticleCommand =  // UpdateArticleCommand | 

val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdArticlesArticleIdPut(hospitalId, articleId, updateArticleCommand)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **articleId** | [**java.util.UUID**](.md)|  |
 **updateArticleCommand** | [**UpdateArticleCommand**](UpdateArticleCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Create an article.

Sample request:        POST /api/v1/hospitals/1/articles      {          \&quot;title\&quot;: \&quot;Samsung Hospital Article\&quot;,          \&quot;description\&quot;: \&quot;This is an article.\&quot;,          \&quot;body\&quot;: \&quot;article body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;tags\&quot;: [            {              \&quot;value\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0              }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ArticlesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createArticleCommand : CreateArticleCommand =  // CreateArticleCommand | 

val result : java.util.UUID = webService.apiV1HospitalsHospitalIdArticlesPost(hospitalId, createArticleCommand)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **createArticleCommand** | [**CreateArticleCommand**](CreateArticleCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

