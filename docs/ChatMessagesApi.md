# ChatMessagesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ChatmessagesFilesPost**](ChatMessagesApi.md#apiV1ChatmessagesFilesPost) | **POST** api/v1/chatmessages/files | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ChatMessagesApi::class.java)
val sendFileRequestModel : SendFileRequestModel =  // SendFileRequestModel | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ChatmessagesFilesPost(sendFileRequestModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendFileRequestModel** | [**SendFileRequestModel**](SendFileRequestModel.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

