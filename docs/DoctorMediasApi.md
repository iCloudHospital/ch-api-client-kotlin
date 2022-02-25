# DoctorMediasApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsDoctorIdMediasGet**](DoctorMediasApi.md#apiV1DoctorsDoctorIdMediasGet) | **GET** api/v1/doctors/{doctorId}/medias | 
[**apiV1DoctorsDoctorIdMediasMediaIdDelete**](DoctorMediasApi.md#apiV1DoctorsDoctorIdMediasMediaIdDelete) | **DELETE** api/v1/doctors/{doctorId}/medias/{mediaId} | 
[**apiV1DoctorsDoctorIdMediasMediaIdPut**](DoctorMediasApi.md#apiV1DoctorsDoctorIdMediasMediaIdPut) | **PUT** api/v1/doctors/{doctorId}/medias/{mediaId} | 
[**apiV1DoctorsDoctorIdMediasPost**](DoctorMediasApi.md#apiV1DoctorsDoctorIdMediasPost) | **POST** api/v1/doctors/{doctorId}/medias | 
[**apiV1DoctorsDoctorIdMediasequencePut**](DoctorMediasApi.md#apiV1DoctorsDoctorIdMediasequencePut) | **PUT** api/v1/doctors/{doctorId}/mediasequence | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorMediasApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaType : MediaType =  // MediaType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorMediasViewModel = webService.apiV1DoctorsDoctorIdMediasGet(doctorId, mediaType, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **mediaType** | [**MediaType**](.md)|  | [optional] [enum: Photo, Video, Youtube, Document, Frontal, Diagonal, Side]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorMediasViewModel**](DoctorMediasViewModel.md)

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
val webService = apiClient.createWebservice(DoctorMediasApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorsDoctorIdMediasMediaIdDelete(doctorId, mediaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
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
val webService = apiClient.createWebservice(DoctorMediasApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDoctorMediaCommand : UpdateDoctorMediaCommand =  // UpdateDoctorMediaCommand | 

launch(Dispatchers.IO) {
    val result : MediaViewModel = webService.apiV1DoctorsDoctorIdMediasMediaIdPut(doctorId, mediaId, updateDoctorMediaCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **mediaId** | [**java.util.UUID**](.md)|  |
 **updateDoctorMediaCommand** | [**UpdateDoctorMediaCommand**](UpdateDoctorMediaCommand.md)|  | [optional]

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
val webService = apiClient.createWebservice(DoctorMediasApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDoctorMediaCommand : CreateDoctorMediaCommand =  // CreateDoctorMediaCommand | 

launch(Dispatchers.IO) {
    val result : MediaViewModel = webService.apiV1DoctorsDoctorIdMediasPost(doctorId, createDoctorMediaCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **createDoctorMediaCommand** | [**CreateDoctorMediaCommand**](CreateDoctorMediaCommand.md)|  | [optional]

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
val webService = apiClient.createWebservice(DoctorMediasApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDoctorMediaSequenceCommand : UpdateDoctorMediaSequenceCommand =  // UpdateDoctorMediaSequenceCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorsDoctorIdMediasequencePut(doctorId, updateDoctorMediaSequenceCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **updateDoctorMediaSequenceCommand** | [**UpdateDoctorMediaSequenceCommand**](UpdateDoctorMediaSequenceCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

