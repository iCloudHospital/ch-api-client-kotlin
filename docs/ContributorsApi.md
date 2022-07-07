# ContributorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2ContributorsContributorIdGet**](ContributorsApi.md#apiV2ContributorsContributorIdGet) | **GET** api/v2/contributors/{contributorId} | Get Contributor.
[**apiV2ContributorsContributorIdHandlesGet**](ContributorsApi.md#apiV2ContributorsContributorIdHandlesGet) | **GET** api/v2/contributors/{contributorId}/handles | Get all ContributorHandles.
[**apiV2ContributorsContributorIdHandlesHandleIdGet**](ContributorsApi.md#apiV2ContributorsContributorIdHandlesHandleIdGet) | **GET** api/v2/contributors/{contributorId}/handles/{handleId} | Get ContributorHandle.
[**apiV2ContributorsGet**](ContributorsApi.md#apiV2ContributorsGet) | **GET** api/v2/contributors | Get all Contributors.
[**apiV2ContributorsSlugGet**](ContributorsApi.md#apiV2ContributorsSlugGet) | **GET** api/v2/contributors/{slug} | Get Contributor by slug.



Get Contributor.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorsApi::class.java)
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : ContributorModel = webService.apiV2ContributorsContributorIdGet(contributorId, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**ContributorModel**](ContributorModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all ContributorHandles.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorsApi::class.java)
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val contributorId2 : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val snsType : SnsType =  // SnsType | 
val handle : kotlin.String = handle_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : ContributorSnsHandlesModel = webService.apiV2ContributorsContributorIdHandlesGet(contributorId, contributorId2, id, snsType, handle, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | **java.util.UUID**|  |
 **contributorId2** | **java.util.UUID**|  | [optional]
 **id** | **java.util.UUID**|  | [optional]
 **snsType** | [**SnsType**](.md)|  | [optional] [enum: Twitter, Facebook, Instagram, LinkedIn, Youtube, KakaoTalk]
 **handle** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**ContributorSnsHandlesModel**](ContributorSnsHandlesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get ContributorHandle.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorsApi::class.java)
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val handleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : SnsHandleModel = webService.apiV2ContributorsContributorIdHandlesHandleIdGet(contributorId, handleId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | **java.util.UUID**|  |
 **handleId** | **java.util.UUID**|  |

### Return type

[**SnsHandleModel**](SnsHandleModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all Contributors.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorsApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val website : kotlin.String = website_example // kotlin.String | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val interviewerOnly : kotlin.Boolean = true // kotlin.Boolean | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : ContributorsModel = webService.apiV2ContributorsGet(id, name, email, website, hospitalId, interviewerOnly, showHidden, languageCode, returnDefaultValue, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **website** | **kotlin.String**|  | [optional]
 **hospitalId** | **java.util.UUID**|  | [optional]
 **interviewerOnly** | **kotlin.Boolean**|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**ContributorsModel**](ContributorsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Contributor by slug.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorsApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : ContributorModel = webService.apiV2ContributorsSlugGet(slug, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**ContributorModel**](ContributorModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

