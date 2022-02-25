# MembershipsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1MembershipsCurrentGet**](MembershipsApi.md#apiV1MembershipsCurrentGet) | **GET** api/v1/memberships/current | 
[**apiV1MembershipsDelete**](MembershipsApi.md#apiV1MembershipsDelete) | **DELETE** api/v1/memberships | 
[**apiV1MembershipsInvitationsGet**](MembershipsApi.md#apiV1MembershipsInvitationsGet) | **GET** api/v1/memberships/invitations | 
[**apiV1MembershipsInvitationsInvitationIdDelete**](MembershipsApi.md#apiV1MembershipsInvitationsInvitationIdDelete) | **DELETE** api/v1/memberships/invitations/{invitationId} | 
[**apiV1MembershipsInvitationsPost**](MembershipsApi.md#apiV1MembershipsInvitationsPost) | **POST** api/v1/memberships/invitations | 
[**apiV1MembershipsMembersGet**](MembershipsApi.md#apiV1MembershipsMembersGet) | **GET** api/v1/memberships/members | 
[**apiV1MembershipsMembersPatientIdDelete**](MembershipsApi.md#apiV1MembershipsMembersPatientIdDelete) | **DELETE** api/v1/memberships/members/{patientId} | 
[**apiV1MembershipsPlanIdPost**](MembershipsApi.md#apiV1MembershipsPlanIdPost) | **POST** api/v1/memberships/{planId} | 





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MembershipsApi::class.java)

launch(Dispatchers.IO) {
    val result : MembershipViewModel = webService.apiV1MembershipsCurrentGet()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MembershipViewModel**](MembershipViewModel.md)

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
val webService = apiClient.createWebservice(MembershipsApi::class.java)

launch(Dispatchers.IO) {
    val result : DeleteMembershipResultModel = webService.apiV1MembershipsDelete()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeleteMembershipResultModel**](DeleteMembershipResultModel.md)

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
val webService = apiClient.createWebservice(MembershipsApi::class.java)

launch(Dispatchers.IO) {
    val result : InvitationsViewModel = webService.apiV1MembershipsInvitationsGet()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InvitationsViewModel**](InvitationsViewModel.md)

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
val webService = apiClient.createWebservice(MembershipsApi::class.java)
val invitationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DeleteInvitationResultModel = webService.apiV1MembershipsInvitationsInvitationIdDelete(invitationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationId** | [**java.util.UUID**](.md)|  |

### Return type

[**DeleteInvitationResultModel**](DeleteInvitationResultModel.md)

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
val webService = apiClient.createWebservice(MembershipsApi::class.java)
val createInvitationCommand : CreateInvitationCommand =  // CreateInvitationCommand | 

launch(Dispatchers.IO) {
    val result : CreateInvitationResultModel = webService.apiV1MembershipsInvitationsPost(createInvitationCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInvitationCommand** | [**CreateInvitationCommand**](CreateInvitationCommand.md)|  | [optional]

### Return type

[**CreateInvitationResultModel**](CreateInvitationResultModel.md)

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
val webService = apiClient.createWebservice(MembershipsApi::class.java)

launch(Dispatchers.IO) {
    val result : MembersViewModel = webService.apiV1MembershipsMembersGet()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MembersViewModel**](MembersViewModel.md)

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
val webService = apiClient.createWebservice(MembershipsApi::class.java)
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DeleteMemberResultModel = webService.apiV1MembershipsMembersPatientIdDelete(patientId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientId** | [**java.util.UUID**](.md)|  |

### Return type

[**DeleteMemberResultModel**](DeleteMemberResultModel.md)

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
val webService = apiClient.createWebservice(MembershipsApi::class.java)
val planId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : CreateMembershipResultModel = webService.apiV1MembershipsPlanIdPost(planId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planId** | [**java.util.UUID**](.md)|  |

### Return type

[**CreateMembershipResultModel**](CreateMembershipResultModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

