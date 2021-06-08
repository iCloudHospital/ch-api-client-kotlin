# CommunicationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1CommunicationsDelete**](CommunicationsApi.md#apiV1CommunicationsDelete) | **DELETE** api/v1/communications | 
[**apiV1CommunicationsGet**](CommunicationsApi.md#apiV1CommunicationsGet) | **GET** api/v1/communications | 
[**apiV1CommunicationsPut**](CommunicationsApi.md#apiV1CommunicationsPut) | **PUT** api/v1/communications | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.Int = webService.apiV1CommunicationsDelete()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Int**

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
val webService = apiClient.createWebservice(CommunicationsApi::class.java)

launch(Dispatchers.IO) {
    val result : CommunicationUserTokenModel = webService.apiV1CommunicationsGet()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CommunicationUserTokenModel**](CommunicationUserTokenModel.md)

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
val webService = apiClient.createWebservice(CommunicationsApi::class.java)

launch(Dispatchers.IO) {
    val result : CommunicationUserTokenModel = webService.apiV1CommunicationsPut()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CommunicationUserTokenModel**](CommunicationUserTokenModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

