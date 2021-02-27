# QuestionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsHospitalIdQuestionsPost**](QuestionsApi.md#apiV1HospitalsHospitalIdQuestionsPost) | **POST** api/v1/hospitals/{hospitalId}/questions | Create an question.
[**apiV1HospitalsHospitalIdQuestionsQuestionIdDelete**](QuestionsApi.md#apiV1HospitalsHospitalIdQuestionsQuestionIdDelete) | **DELETE** api/v1/hospitals/{hospitalId}/questions/{questionId} | Delete question.
[**apiV1HospitalsHospitalIdQuestionsQuestionIdGet**](QuestionsApi.md#apiV1HospitalsHospitalIdQuestionsQuestionIdGet) | **GET** api/v1/hospitals/{hospitalId}/questions/{questionId} | Get question.
[**apiV1HospitalsHospitalIdQuestionsQuestionIdPut**](QuestionsApi.md#apiV1HospitalsHospitalIdQuestionsQuestionIdPut) | **PUT** api/v1/hospitals/{hospitalId}/questions/{questionId} | Update question.
[**apiV1HospitalsQuestionsGet**](QuestionsApi.md#apiV1HospitalsQuestionsGet) | **GET** api/v1/hospitals/questions | Get all questions.



Create an question.

Sample request:        POST /api/v1/hospitals/1/questions      {          \&quot;title\&quot;: \&quot;Hospital question\&quot;,          \&quot;description\&quot;: \&quot;This is a question.\&quot;,          \&quot;body\&quot;: \&quot;question body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;tags\&quot;: [            {              \&quot;value\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0              }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(QuestionsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createQuestionCommand : CreateQuestionCommand =  // CreateQuestionCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1HospitalsHospitalIdQuestionsPost(hospitalId, createQuestionCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **createQuestionCommand** | [**CreateQuestionCommand**](CreateQuestionCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Delete question.

Sample request:        DELETE /api/v1/hospitals/1/questions/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(QuestionsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val questionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdQuestionsQuestionIdDelete(hospitalId, questionId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **questionId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get question.

Sample request:        GET /api/v1/hospitals/1/questions/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(QuestionsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val questionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : QuestionViewModel = webService.apiV1HospitalsHospitalIdQuestionsQuestionIdGet(hospitalId, questionId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **questionId** | [**java.util.UUID**](.md)|  |

### Return type

[**QuestionViewModel**](QuestionViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update question.

Sample request:        PUT /api/v1/hospitals/1/questions/1      {          \&quot;title\&quot;: \&quot;Samsung Hospital\&quot;,          \&quot;description\&quot;: \&quot;This is an question.\&quot;,          \&quot;body\&quot;: \&quot;updated question body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,        ///                   \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(QuestionsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val questionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateQuestionCommand : UpdateQuestionCommand =  // UpdateQuestionCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdQuestionsQuestionIdPut(hospitalId, questionId, updateQuestionCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **questionId** | [**java.util.UUID**](.md)|  |
 **updateQuestionCommand** | [**UpdateQuestionCommand**](UpdateQuestionCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all questions.

Sample request:        GET /api/v1/hospitals/1/questions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(QuestionsApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val title : kotlin.String = title_example // kotlin.String | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val questionType : QuestionType =  // QuestionType | 
val questionStatus : QuestionStatus =  // QuestionStatus | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : QuestionsViewModel = webService.apiV1HospitalsQuestionsGet(id, title, hospitalId, patientId, questionType, questionStatus, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **title** | **kotlin.String**|  | [optional]
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **patientId** | [**java.util.UUID**](.md)|  | [optional]
 **questionType** | [**QuestionType**](.md)|  | [optional] [enum: General, Health, Treatment, Travel, Consult]
 **questionStatus** | [**QuestionStatus**](.md)|  | [optional] [enum: New, Answered, Replied, Archived]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**QuestionsViewModel**](QuestionsViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

