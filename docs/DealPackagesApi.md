# DealPackagesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DealsDealIdPackagesPackageIdDelete**](DealPackagesApi.md#apiV1DealsDealIdPackagesPackageIdDelete) | **DELETE** api/v1/deals/{dealId}/packages/{packageId} | Delete deal package.
[**apiV1DealsDealIdPackagesPackageIdGet**](DealPackagesApi.md#apiV1DealsDealIdPackagesPackageIdGet) | **GET** api/v1/deals/{dealId}/packages/{packageId} | Get deal package.
[**apiV1DealsDealIdPackagesPackageIdPut**](DealPackagesApi.md#apiV1DealsDealIdPackagesPackageIdPut) | **PUT** api/v1/deals/{dealId}/packages/{packageId} | Update deal package.
[**apiV1DealsDealIdPackagesPost**](DealPackagesApi.md#apiV1DealsDealIdPackagesPost) | **POST** api/v1/deals/{dealId}/packages | Create deal package.



Delete deal package.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealPackagesApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val packageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DealsDealIdPackagesPackageIdDelete(dealId, packageId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | [**java.util.UUID**](.md)|  |
 **packageId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get deal package.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealPackagesApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val packageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DealPackageViewModel = webService.apiV1DealsDealIdPackagesPackageIdGet(dealId, packageId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | [**java.util.UUID**](.md)|  |
 **packageId** | [**java.util.UUID**](.md)|  |

### Return type

[**DealPackageViewModel**](DealPackageViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update deal package.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealPackagesApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val packageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDealPackageCommand : UpdateDealPackageCommand =  // UpdateDealPackageCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DealsDealIdPackagesPackageIdPut(dealId, packageId, updateDealPackageCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | [**java.util.UUID**](.md)|  |
 **packageId** | [**java.util.UUID**](.md)|  |
 **updateDealPackageCommand** | [**UpdateDealPackageCommand**](UpdateDealPackageCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Create deal package.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealPackagesApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDealPackageCommand : CreateDealPackageCommand =  // CreateDealPackageCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1DealsDealIdPackagesPost(dealId, createDealPackageCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | [**java.util.UUID**](.md)|  |
 **createDealPackageCommand** | [**CreateDealPackageCommand**](CreateDealPackageCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

