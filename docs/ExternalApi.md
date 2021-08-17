# ExternalApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ExternalFacebookDeleteuserdataPost**](ExternalApi.md#apiV1ExternalFacebookDeleteuserdataPost) | **POST** api/v1/external/facebook/deleteuserdata | Callback for Facebook user data deletion



Callback for Facebook user data deletion

Sample request:        PUT /api/v1/external/facebook/deleteUserData      {          \&quot;signed_request\&quot;: \&quot;......\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ExternalApi::class.java)

launch(Dispatchers.IO) {
    val result : FacebookUserDataDeletionResponseModel = webService.apiV1ExternalFacebookDeleteuserdataPost()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FacebookUserDataDeletionResponseModel**](FacebookUserDataDeletionResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

