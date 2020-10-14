# DealPackagesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DealsDealIdPackagesPackageIdDelete**](DealPackagesApi.md#apiV1DealsDealIdPackagesPackageIdDelete) | **DELETE** /api/v1/deals/{dealId}/packages/{packageId} | Delete deal package.
[**apiV1DealsDealIdPackagesPackageIdGet**](DealPackagesApi.md#apiV1DealsDealIdPackagesPackageIdGet) | **GET** /api/v1/deals/{dealId}/packages/{packageId} | Get deal package.
[**apiV1DealsDealIdPackagesPackageIdPut**](DealPackagesApi.md#apiV1DealsDealIdPackagesPackageIdPut) | **PUT** /api/v1/deals/{dealId}/packages/{packageId} | Update deal package.
[**apiV1DealsDealIdPackagesPost**](DealPackagesApi.md#apiV1DealsDealIdPackagesPost) | **POST** /api/v1/deals/{dealId}/packages | Create deal package.


<a name="apiV1DealsDealIdPackagesPackageIdDelete"></a>
# **apiV1DealsDealIdPackagesPackageIdDelete**
> kotlin.Boolean apiV1DealsDealIdPackagesPackageIdDelete(dealId, packageId)

Delete deal package.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealPackagesApi()
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val packageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DealsDealIdPackagesPackageIdDelete(dealId, packageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealPackagesApi#apiV1DealsDealIdPackagesPackageIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealPackagesApi#apiV1DealsDealIdPackagesPackageIdDelete")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DealsDealIdPackagesPackageIdGet"></a>
# **apiV1DealsDealIdPackagesPackageIdGet**
> DealPackageViewModel apiV1DealsDealIdPackagesPackageIdGet(dealId, packageId)

Get deal package.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealPackagesApi()
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val packageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealPackageViewModel = apiInstance.apiV1DealsDealIdPackagesPackageIdGet(dealId, packageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealPackagesApi#apiV1DealsDealIdPackagesPackageIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealPackagesApi#apiV1DealsDealIdPackagesPackageIdGet")
    e.printStackTrace()
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

<a name="apiV1DealsDealIdPackagesPackageIdPut"></a>
# **apiV1DealsDealIdPackagesPackageIdPut**
> kotlin.Boolean apiV1DealsDealIdPackagesPackageIdPut(dealId, packageId, updateDealPackageCommand)

Update deal package.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealPackagesApi()
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val packageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDealPackageCommand : UpdateDealPackageCommand =  // UpdateDealPackageCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DealsDealIdPackagesPackageIdPut(dealId, packageId, updateDealPackageCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealPackagesApi#apiV1DealsDealIdPackagesPackageIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealPackagesApi#apiV1DealsDealIdPackagesPackageIdPut")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DealsDealIdPackagesPost"></a>
# **apiV1DealsDealIdPackagesPost**
> java.util.UUID apiV1DealsDealIdPackagesPost(dealId, createDealPackageCommand)

Create deal package.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealPackagesApi()
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDealPackageCommand : CreateDealPackageCommand =  // CreateDealPackageCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1DealsDealIdPackagesPost(dealId, createDealPackageCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealPackagesApi#apiV1DealsDealIdPackagesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealPackagesApi#apiV1DealsDealIdPackagesPost")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

