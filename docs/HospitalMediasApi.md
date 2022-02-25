# HospitalMediasApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsHospitalIdMediasGet**](HospitalMediasApi.md#apiV1HospitalsHospitalIdMediasGet) | **GET** api/v1/hospitals/{hospitalId}/medias | 
[**apiV1HospitalsHospitalIdMediasMediaIdDelete**](HospitalMediasApi.md#apiV1HospitalsHospitalIdMediasMediaIdDelete) | **DELETE** api/v1/hospitals/{hospitalId}/medias/{mediaId} | 
[**apiV1HospitalsHospitalIdMediasMediaIdPut**](HospitalMediasApi.md#apiV1HospitalsHospitalIdMediasMediaIdPut) | **PUT** api/v1/hospitals/{hospitalId}/medias/{mediaId} | 
[**apiV1HospitalsHospitalIdMediasPost**](HospitalMediasApi.md#apiV1HospitalsHospitalIdMediasPost) | **POST** api/v1/hospitals/{hospitalId}/medias | 
[**apiV1HospitalsHospitalIdMediasequencePut**](HospitalMediasApi.md#apiV1HospitalsHospitalIdMediasequencePut) | **PUT** api/v1/hospitals/{hospitalId}/mediasequence | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalMediasApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaType : MediaType =  // MediaType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalMediasViewModel = webService.apiV1HospitalsHospitalIdMediasGet(hospitalId, mediaType, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **mediaType** | [**MediaType**](.md)|  | [optional] [enum: Photo, Video, Youtube, Document, Frontal, Diagonal, Side]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalMediasViewModel**](HospitalMediasViewModel.md)

### Authorization

No authorization required

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
val webService = apiClient.createWebservice(HospitalMediasApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdMediasMediaIdDelete(hospitalId, mediaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **mediaId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

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
val webService = apiClient.createWebservice(HospitalMediasApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateHospitalMediaCommand : UpdateHospitalMediaCommand =  // UpdateHospitalMediaCommand | 

launch(Dispatchers.IO) {
    val result : MediaViewModel = webService.apiV1HospitalsHospitalIdMediasMediaIdPut(hospitalId, mediaId, updateHospitalMediaCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **mediaId** | [**java.util.UUID**](.md)|  |
 **updateHospitalMediaCommand** | [**UpdateHospitalMediaCommand**](UpdateHospitalMediaCommand.md)|  | [optional]

### Return type

[**MediaViewModel**](MediaViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalMediasApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createHospitalMediaCommand : CreateHospitalMediaCommand =  // CreateHospitalMediaCommand | 

launch(Dispatchers.IO) {
    val result : MediaViewModel = webService.apiV1HospitalsHospitalIdMediasPost(hospitalId, createHospitalMediaCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **createHospitalMediaCommand** | [**CreateHospitalMediaCommand**](CreateHospitalMediaCommand.md)|  | [optional]

### Return type

[**MediaViewModel**](MediaViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalMediasApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateHospitalMediaSequenceCommand : UpdateHospitalMediaSequenceCommand =  // UpdateHospitalMediaSequenceCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdMediasequencePut(hospitalId, updateHospitalMediaSequenceCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **updateHospitalMediaSequenceCommand** | [**UpdateHospitalMediaSequenceCommand**](UpdateHospitalMediaSequenceCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

