# CommunicationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2CommunicationsDelete**](CommunicationsApi.md#apiV2CommunicationsDelete) | **DELETE** api/v2/communications | Delete CommunicationUser.
[**apiV2CommunicationsGet**](CommunicationsApi.md#apiV2CommunicationsGet) | **GET** api/v2/communications | Get CommunicationUser.
[**apiV2CommunicationsPut**](CommunicationsApi.md#apiV2CommunicationsPut) | **PUT** api/v2/communications | Revoke CommunicationUser.



Delete CommunicationUser.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.Int = webService.apiV2CommunicationsDelete()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Int**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get CommunicationUser.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationsApi::class.java)

launch(Dispatchers.IO) {
    val result : CommunicationUserTokenModel = webService.apiV2CommunicationsGet()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CommunicationUserTokenModel**](CommunicationUserTokenModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Revoke CommunicationUser.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationsApi::class.java)

launch(Dispatchers.IO) {
    val result : CommunicationUserTokenModel = webService.apiV2CommunicationsPut()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CommunicationUserTokenModel**](CommunicationUserTokenModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

