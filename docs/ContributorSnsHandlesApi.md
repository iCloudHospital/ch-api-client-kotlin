# ContributorSnsHandlesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ContributorsContributorIdSnshandlesGet**](ContributorSnsHandlesApi.md#apiV1ContributorsContributorIdSnshandlesGet) | **GET** api/v1/contributors/{contributorId}/snshandles | Get all contributor SNShandles.
[**apiV1ContributorsContributorIdSnshandlesPost**](ContributorSnsHandlesApi.md#apiV1ContributorsContributorIdSnshandlesPost) | **POST** api/v1/contributors/{contributorId}/snshandles | Create contributor SNShandle
[**apiV1ContributorsContributorIdSnshandlesSnshandleIdDelete**](ContributorSnsHandlesApi.md#apiV1ContributorsContributorIdSnshandlesSnshandleIdDelete) | **DELETE** api/v1/contributors/{contributorId}/snshandles/{snshandleId} | Delete contributor SNShandle
[**apiV1ContributorsContributorIdSnshandlesSnshandleIdPut**](ContributorSnsHandlesApi.md#apiV1ContributorsContributorIdSnshandlesSnshandleIdPut) | **PUT** api/v1/contributors/{contributorId}/snshandles/{snshandleId} | Update contributor SNShandle



Get all contributor SNShandles.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorSnsHandlesApi::class.java)
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val snsType : SnsType =  // SnsType | 
val handle : kotlin.String = handle_example // kotlin.String | 
val contributorId2 : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : ContributorSnsHandlesViewModel = webService.apiV1ContributorsContributorIdSnshandlesGet(contributorId, id, snsType, handle, contributorId2, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | [**java.util.UUID**](.md)|  |
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **snsType** | [**SnsType**](.md)|  | [optional] [enum: Twitter, Facebook, Instagram, LinkedIn, Youtube, KakaoTalk]
 **handle** | **kotlin.String**|  | [optional]
 **contributorId2** | [**java.util.UUID**](.md)|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**ContributorSnsHandlesViewModel**](ContributorSnsHandlesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create contributor SNShandle

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorSnsHandlesApi::class.java)
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createContributorSnsHandleCommand : CreateContributorSnsHandleCommand =  // CreateContributorSnsHandleCommand | 

launch(Dispatchers.IO) {
    val result : SnsHandleViewModel = webService.apiV1ContributorsContributorIdSnshandlesPost(contributorId, createContributorSnsHandleCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | [**java.util.UUID**](.md)|  |
 **createContributorSnsHandleCommand** | [**CreateContributorSnsHandleCommand**](CreateContributorSnsHandleCommand.md)|  | [optional]

### Return type

[**SnsHandleViewModel**](SnsHandleViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Delete contributor SNShandle

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorSnsHandlesApi::class.java)
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val snshandleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ContributorsContributorIdSnshandlesSnshandleIdDelete(contributorId, snshandleId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | [**java.util.UUID**](.md)|  |
 **snshandleId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update contributor SNShandle

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorSnsHandlesApi::class.java)
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val snshandleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateContributorSnsHandleCommand : UpdateContributorSnsHandleCommand =  // UpdateContributorSnsHandleCommand | 

launch(Dispatchers.IO) {
    val result : SnsHandleViewModel = webService.apiV1ContributorsContributorIdSnshandlesSnshandleIdPut(contributorId, snshandleId, updateContributorSnsHandleCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | [**java.util.UUID**](.md)|  |
 **snshandleId** | [**java.util.UUID**](.md)|  |
 **updateContributorSnsHandleCommand** | [**UpdateContributorSnsHandleCommand**](UpdateContributorSnsHandleCommand.md)|  | [optional]

### Return type

[**SnsHandleViewModel**](SnsHandleViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

