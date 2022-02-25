# ContributorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ContributorsAuthorizedContributorIdGet**](ContributorsApi.md#apiV1ContributorsAuthorizedContributorIdGet) | **GET** api/v1/contributors/authorized/{contributorId} | 
[**apiV1ContributorsAuthorizedGet**](ContributorsApi.md#apiV1ContributorsAuthorizedGet) | **GET** api/v1/contributors/authorized | 
[**apiV1ContributorsAuthorizedSlugGet**](ContributorsApi.md#apiV1ContributorsAuthorizedSlugGet) | **GET** api/v1/contributors/authorized/{slug} | 
[**apiV1ContributorsContributorIdDelete**](ContributorsApi.md#apiV1ContributorsContributorIdDelete) | **DELETE** api/v1/contributors/{contributorId} | Delete contributor
[**apiV1ContributorsContributorIdGet**](ContributorsApi.md#apiV1ContributorsContributorIdGet) | **GET** api/v1/contributors/{contributorId} | Get contributor.
[**apiV1ContributorsContributorIdPut**](ContributorsApi.md#apiV1ContributorsContributorIdPut) | **PUT** api/v1/contributors/{contributorId} | Update contributor
[**apiV1ContributorsGet**](ContributorsApi.md#apiV1ContributorsGet) | **GET** api/v1/contributors | Get all contributors.
[**apiV1ContributorsPost**](ContributorsApi.md#apiV1ContributorsPost) | **POST** api/v1/contributors | Create contributor
[**apiV1ContributorsSlugsSlugGet**](ContributorsApi.md#apiV1ContributorsSlugsSlugGet) | **GET** api/v1/contributors/slugs/{slug} | Get contributor by slug.





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
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : ContributorViewModel = webService.apiV1ContributorsAuthorizedContributorIdGet(contributorId, languageCode, showHidden)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]
 **showHidden** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**ContributorViewModel**](ContributorViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




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
val description : kotlin.String = description_example // kotlin.String | 
val website : kotlin.String = website_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val interviewerOnly : kotlin.Boolean = true // kotlin.Boolean | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : ContributorsViewModel = webService.apiV1ContributorsAuthorizedGet(id, name, email, description, website, languageCode, hospitalId, interviewerOnly, showHidden, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **website** | **kotlin.String**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **interviewerOnly** | **kotlin.Boolean**|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**ContributorsViewModel**](ContributorsViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorsApi::class.java)
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : ContributorViewModel = webService.apiV1ContributorsAuthorizedSlugGet(contributorId, slug, languageCode, showHidden)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | [**java.util.UUID**](.md)|  |
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]
 **showHidden** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**ContributorViewModel**](ContributorViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete contributor

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorsApi::class.java)
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ContributorsContributorIdDelete(contributorId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get contributor.

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

launch(Dispatchers.IO) {
    val result : ContributorViewModel = webService.apiV1ContributorsContributorIdGet(contributorId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**ContributorViewModel**](ContributorViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update contributor

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorsApi::class.java)
val contributorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateContributorCommand : UpdateContributorCommand =  // UpdateContributorCommand | 

launch(Dispatchers.IO) {
    val result : ContributorViewModel = webService.apiV1ContributorsContributorIdPut(contributorId, updateContributorCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributorId** | [**java.util.UUID**](.md)|  |
 **updateContributorCommand** | [**UpdateContributorCommand**](UpdateContributorCommand.md)|  | [optional]

### Return type

[**ContributorViewModel**](ContributorViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all contributors.

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
val description : kotlin.String = description_example // kotlin.String | 
val website : kotlin.String = website_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val interviewerOnly : kotlin.Boolean = true // kotlin.Boolean | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : ContributorsViewModel = webService.apiV1ContributorsGet(id, name, email, description, website, languageCode, hospitalId, interviewerOnly, showHidden, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **website** | **kotlin.String**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **interviewerOnly** | **kotlin.Boolean**|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**ContributorsViewModel**](ContributorsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create contributor

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ContributorsApi::class.java)
val createContributorCommand : CreateContributorCommand =  // CreateContributorCommand | 

launch(Dispatchers.IO) {
    val result : ContributorViewModel = webService.apiV1ContributorsPost(createContributorCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createContributorCommand** | [**CreateContributorCommand**](CreateContributorCommand.md)|  | [optional]

### Return type

[**ContributorViewModel**](ContributorViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get contributor by slug.

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

launch(Dispatchers.IO) {
    val result : ContributorViewModel = webService.apiV1ContributorsSlugsSlugGet(slug, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**ContributorViewModel**](ContributorViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

