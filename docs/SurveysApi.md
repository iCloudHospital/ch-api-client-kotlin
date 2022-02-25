# SurveysApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SurveysIdGet**](SurveysApi.md#apiV1SurveysIdGet) | **GET** api/v1/surveys/{id} | Get the survey.
[**apiV1SurveysPost**](SurveysApi.md#apiV1SurveysPost) | **POST** api/v1/surveys | Create user&#39;s survey response.



Get the survey.

Sample request:        GET: /api/v1/surveys/29e54730-783f-40ed-b1e1-56db817c73e2

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SurveysApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : SurveyModel = webService.apiV1SurveysIdGet(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  |

### Return type

[**SurveyModel**](SurveyModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create user&#39;s survey response.

Sample request:        POST: /api/v1/surveys      {          \&quot;surveyId\&quot;: \&quot;29e54730-783f-40ed-b1e1-56db817c73e2\&quot;,          \&quot;answers\&quot;: \&quot;[{ ... }]\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SurveysApi::class.java)
val createSurveyResponseCommand : CreateSurveyResponseCommand =  // CreateSurveyResponseCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1SurveysPost(createSurveyResponseCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSurveyResponseCommand** | [**CreateSurveyResponseCommand**](CreateSurveyResponseCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

