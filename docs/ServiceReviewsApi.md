# ServiceReviewsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2ServicereviewsGet**](ServiceReviewsApi.md#apiV2ServicereviewsGet) | **GET** api/v2/servicereviews | Get all ServiceReviews.
[**apiV2ServicereviewsPost**](ServiceReviewsApi.md#apiV2ServicereviewsPost) | **POST** api/v2/servicereviews | Create a ServiceReview.
[**apiV2ServicereviewsServiceReviewIdDelete**](ServiceReviewsApi.md#apiV2ServicereviewsServiceReviewIdDelete) | **DELETE** api/v2/servicereviews/{serviceReviewId} | Delete ServiceReview.
[**apiV2ServicereviewsServiceReviewIdGet**](ServiceReviewsApi.md#apiV2ServicereviewsServiceReviewIdGet) | **GET** api/v2/servicereviews/{serviceReviewId} | 
[**apiV2ServicereviewsServiceReviewIdMediasGet**](ServiceReviewsApi.md#apiV2ServicereviewsServiceReviewIdMediasGet) | **GET** api/v2/servicereviews/{serviceReviewId}/medias | Get all ServiceReviewMedias.
[**apiV2ServicereviewsServiceReviewIdMediasMediaIdDelete**](ServiceReviewsApi.md#apiV2ServicereviewsServiceReviewIdMediasMediaIdDelete) | **DELETE** api/v2/servicereviews/{serviceReviewId}/medias/{mediaId} | Delete ServiceReviewMedia
[**apiV2ServicereviewsServiceReviewIdMediasMediaIdGet**](ServiceReviewsApi.md#apiV2ServicereviewsServiceReviewIdMediasMediaIdGet) | **GET** api/v2/servicereviews/{serviceReviewId}/medias/{mediaId} | Get ServiceReviewMedia.
[**apiV2ServicereviewsServiceReviewIdMediasMediaIdPut**](ServiceReviewsApi.md#apiV2ServicereviewsServiceReviewIdMediasMediaIdPut) | **PUT** api/v2/servicereviews/{serviceReviewId}/medias/{mediaId} | Update ServiceReviewMedia.
[**apiV2ServicereviewsServiceReviewIdMediasPost**](ServiceReviewsApi.md#apiV2ServicereviewsServiceReviewIdMediasPost) | **POST** api/v2/servicereviews/{serviceReviewId}/medias | Create ServiceReviewMedia.
[**apiV2ServicereviewsServiceReviewIdPut**](ServiceReviewsApi.md#apiV2ServicereviewsServiceReviewIdPut) | **PUT** api/v2/servicereviews/{serviceReviewId} | Update ServiceReview.



Get all ServiceReviews.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceReviewsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceName : kotlin.String = serviceName_example // kotlin.String | 
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patientName : kotlin.String = patientName_example // kotlin.String | 
val gender : Gender =  // Gender | 
val recommended : kotlin.Boolean = true // kotlin.Boolean | 
val rate : kotlin.Int = 56 // kotlin.Int | 
val reviewType : ReviewType =  // ReviewType | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : ServiceReviewsModel = webService.apiV2ServicereviewsGet(hospitalId, serviceId, serviceName, patientId, patientName, gender, recommended, rate, reviewType, languageCode, returnDefaultValue, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **serviceId** | [**java.util.UUID**](.md)|  | [optional]
 **serviceName** | **kotlin.String**|  | [optional]
 **patientId** | [**java.util.UUID**](.md)|  | [optional]
 **patientName** | **kotlin.String**|  | [optional]
 **gender** | [**Gender**](.md)|  | [optional] [enum: NotSpecified, Male, Female, NonBinary, PreferNotToSay]
 **recommended** | **kotlin.Boolean**|  | [optional]
 **rate** | **kotlin.Int**|  | [optional]
 **reviewType** | [**ReviewType**](.md)|  | [optional] [enum: Photo, SurgeryReview, RealStory]
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**ServiceReviewsModel**](ServiceReviewsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Create a ServiceReview.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceReviewsApi::class.java)
val createServiceReviewCommand : CreateServiceReviewCommand =  // CreateServiceReviewCommand | 

launch(Dispatchers.IO) {
    val result : ServiceReviewModel = webService.apiV2ServicereviewsPost(createServiceReviewCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createServiceReviewCommand** | [**CreateServiceReviewCommand**](CreateServiceReviewCommand.md)|  | [optional]

### Return type

[**ServiceReviewModel**](ServiceReviewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: application/json


Delete ServiceReview.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceReviewsApi::class.java)
val serviceReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV2ServicereviewsServiceReviewIdDelete(serviceReviewId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceReviewId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceReviewsApi::class.java)
val serviceReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : ServiceReviewModel = webService.apiV2ServicereviewsServiceReviewIdGet(serviceReviewId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceReviewId** | [**java.util.UUID**](.md)|  |

### Return type

[**ServiceReviewModel**](ServiceReviewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all ServiceReviewMedias.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceReviewsApi::class.java)
val serviceReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaType : MediaType =  // MediaType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : MediasModel = webService.apiV2ServicereviewsServiceReviewIdMediasGet(serviceReviewId, id, mediaType, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceReviewId** | [**java.util.UUID**](.md)|  |
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **mediaType** | [**MediaType**](.md)|  | [optional] [enum: Photo, Video, Youtube, Document, Frontal, Diagonal, Side]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**MediasModel**](MediasModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete ServiceReviewMedia

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceReviewsApi::class.java)
val serviceReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV2ServicereviewsServiceReviewIdMediasMediaIdDelete(serviceReviewId, mediaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceReviewId** | [**java.util.UUID**](.md)|  |
 **mediaId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get ServiceReviewMedia.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceReviewsApi::class.java)
val serviceReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : MediaModel = webService.apiV2ServicereviewsServiceReviewIdMediasMediaIdGet(serviceReviewId, mediaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceReviewId** | [**java.util.UUID**](.md)|  |
 **mediaId** | [**java.util.UUID**](.md)|  |

### Return type

[**MediaModel**](MediaModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update ServiceReviewMedia.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceReviewsApi::class.java)
val serviceReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateMediaCommand : UpdateMediaCommand =  // UpdateMediaCommand | 

launch(Dispatchers.IO) {
    val result : MediaModel = webService.apiV2ServicereviewsServiceReviewIdMediasMediaIdPut(serviceReviewId, mediaId, updateMediaCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceReviewId** | [**java.util.UUID**](.md)|  |
 **mediaId** | [**java.util.UUID**](.md)|  |
 **updateMediaCommand** | [**UpdateMediaCommand**](UpdateMediaCommand.md)|  | [optional]

### Return type

[**MediaModel**](MediaModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: application/json


Create ServiceReviewMedia.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceReviewsApi::class.java)
val serviceReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createMediaCommand : CreateMediaCommand =  // CreateMediaCommand | 

launch(Dispatchers.IO) {
    val result : MediaModel = webService.apiV2ServicereviewsServiceReviewIdMediasPost(serviceReviewId, createMediaCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceReviewId** | [**java.util.UUID**](.md)|  |
 **createMediaCommand** | [**CreateMediaCommand**](CreateMediaCommand.md)|  | [optional]

### Return type

[**MediaModel**](MediaModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: application/json


Update ServiceReview.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceReviewsApi::class.java)
val serviceReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateServiceReviewCommand : UpdateServiceReviewCommand =  // UpdateServiceReviewCommand | 

launch(Dispatchers.IO) {
    val result : ServiceReviewModel = webService.apiV2ServicereviewsServiceReviewIdPut(serviceReviewId, updateServiceReviewCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceReviewId** | [**java.util.UUID**](.md)|  |
 **updateServiceReviewCommand** | [**UpdateServiceReviewCommand**](UpdateServiceReviewCommand.md)|  | [optional]

### Return type

[**ServiceReviewModel**](ServiceReviewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: application/json

