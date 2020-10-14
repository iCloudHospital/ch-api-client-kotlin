# QuestionCommentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1QuestionsQuestionIdQuestioncommentsGet**](QuestionCommentsApi.md#apiV1QuestionsQuestionIdQuestioncommentsGet) | **GET** /api/v1/questions/{questionId}/questioncomments | Get all questionComment.
[**apiV1QuestionsQuestionIdQuestioncommentsPost**](QuestionCommentsApi.md#apiV1QuestionsQuestionIdQuestioncommentsPost) | **POST** /api/v1/questions/{questionId}/questioncomments | Create an questionComment.
[**apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdDelete**](QuestionCommentsApi.md#apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdDelete) | **DELETE** /api/v1/questions/{questionId}/questioncomments/{questionCommentId} | Delete questionComment.
[**apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdGet**](QuestionCommentsApi.md#apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdGet) | **GET** /api/v1/questions/{questionId}/questioncomments/{questionCommentId} | Get questionComment.
[**apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdPut**](QuestionCommentsApi.md#apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdPut) | **PUT** /api/v1/questions/{questionId}/questioncomments/{questionCommentId} | Update questionComment.


<a name="apiV1QuestionsQuestionIdQuestioncommentsGet"></a>
# **apiV1QuestionsQuestionIdQuestioncommentsGet**
> QuestionCommentsViewModel apiV1QuestionsQuestionIdQuestioncommentsGet(questionId, id, userId, questionId2, page, limit, lastRetrieved, current)

Get all questionComment.

Sample request:        GET /api/v1/questionComment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuestionCommentsApi()
val questionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val questionId2 : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : QuestionCommentsViewModel = apiInstance.apiV1QuestionsQuestionIdQuestioncommentsGet(questionId, id, userId, questionId2, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuestionCommentsApi#apiV1QuestionsQuestionIdQuestioncommentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuestionCommentsApi#apiV1QuestionsQuestionIdQuestioncommentsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | [**java.util.UUID**](.md)|  |
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **userId** | [**java.util.UUID**](.md)|  | [optional]
 **questionId2** | [**java.util.UUID**](.md)|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**QuestionCommentsViewModel**](QuestionCommentsViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1QuestionsQuestionIdQuestioncommentsPost"></a>
# **apiV1QuestionsQuestionIdQuestioncommentsPost**
> java.util.UUID apiV1QuestionsQuestionIdQuestioncommentsPost(questionId, createQuestionCommentCommand)

Create an questionComment.

Sample request:        POST /api/v1/questions/1/questionComment      {          \&quot;description\&quot;: \&quot;This is a questionComment.\&quot;,          \&quot;body\&quot;: \&quot;questionComment body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuestionCommentsApi()
val questionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createQuestionCommentCommand : CreateQuestionCommentCommand =  // CreateQuestionCommentCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1QuestionsQuestionIdQuestioncommentsPost(questionId, createQuestionCommentCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuestionCommentsApi#apiV1QuestionsQuestionIdQuestioncommentsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuestionCommentsApi#apiV1QuestionsQuestionIdQuestioncommentsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | [**java.util.UUID**](.md)|  |
 **createQuestionCommentCommand** | [**CreateQuestionCommentCommand**](CreateQuestionCommentCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdDelete"></a>
# **apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdDelete**
> kotlin.Boolean apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdDelete(questionId, questionCommentId)

Delete questionComment.

Sample request:        DELETE /api/v1/questions/1/questionComments/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuestionCommentsApi()
val questionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val questionCommentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdDelete(questionId, questionCommentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuestionCommentsApi#apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuestionCommentsApi#apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | [**java.util.UUID**](.md)|  |
 **questionCommentId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdGet"></a>
# **apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdGet**
> QuestionCommentViewModel apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdGet(questionId, questionCommentId)

Get questionComment.

Sample request:        GET /api/v1/questionComment/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuestionCommentsApi()
val questionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val questionCommentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : QuestionCommentViewModel = apiInstance.apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdGet(questionId, questionCommentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuestionCommentsApi#apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuestionCommentsApi#apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | [**java.util.UUID**](.md)|  |
 **questionCommentId** | [**java.util.UUID**](.md)|  |

### Return type

[**QuestionCommentViewModel**](QuestionCommentViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdPut"></a>
# **apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdPut**
> kotlin.Boolean apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdPut(questionId, questionCommentId, updateQuestionCommentCommand)

Update questionComment.

Sample request:        PUT /api/v1/questions/1/questionComments/1      {          \&quot;QuestionTitle\&quot;: \&quot;Question title\&quot;,          \&quot;body\&quot;: \&quot;updated questionComment body here\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuestionCommentsApi()
val questionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val questionCommentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateQuestionCommentCommand : UpdateQuestionCommentCommand =  // UpdateQuestionCommentCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdPut(questionId, questionCommentId, updateQuestionCommentCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuestionCommentsApi#apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuestionCommentsApi#apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | [**java.util.UUID**](.md)|  |
 **questionCommentId** | [**java.util.UUID**](.md)|  |
 **updateQuestionCommentCommand** | [**UpdateQuestionCommentCommand**](UpdateQuestionCommentCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

