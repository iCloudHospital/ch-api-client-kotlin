# DealsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DealsDealIdDelete**](DealsApi.md#apiV1DealsDealIdDelete) | **DELETE** /api/v1/deals/{dealId} | Delete deal.
[**apiV1DealsDealIdGet**](DealsApi.md#apiV1DealsDealIdGet) | **GET** /api/v1/deals/{dealId} | Get deal.
[**apiV1DealsDealIdPut**](DealsApi.md#apiV1DealsDealIdPut) | **PUT** /api/v1/deals/{dealId} | Update deal.
[**apiV1DealsGet**](DealsApi.md#apiV1DealsGet) | **GET** /api/v1/deals | Get all deals.
[**apiV1DealsPost**](DealsApi.md#apiV1DealsPost) | **POST** /api/v1/deals | Create deal.
[**apiV1DealsSlugsSlugGet**](DealsApi.md#apiV1DealsSlugsSlugGet) | **GET** /api/v1/deals/slugs/{slug} | Get deal by slug.


<a name="apiV1DealsDealIdDelete"></a>
# **apiV1DealsDealIdDelete**
> kotlin.Boolean apiV1DealsDealIdDelete(dealId)

Delete deal.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealsApi()
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DealsDealIdDelete(dealId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#apiV1DealsDealIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#apiV1DealsDealIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DealsDealIdGet"></a>
# **apiV1DealsDealIdGet**
> DealViewModel apiV1DealsDealIdGet(dealId)

Get deal.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealsApi()
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealViewModel = apiInstance.apiV1DealsDealIdGet(dealId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#apiV1DealsDealIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#apiV1DealsDealIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | [**java.util.UUID**](.md)|  |

### Return type

[**DealViewModel**](DealViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DealsDealIdPut"></a>
# **apiV1DealsDealIdPut**
> kotlin.Boolean apiV1DealsDealIdPut(dealId, updateDealCommand)

Update deal.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealsApi()
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDealCommand : UpdateDealCommand =  // UpdateDealCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DealsDealIdPut(dealId, updateDealCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#apiV1DealsDealIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#apiV1DealsDealIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | [**java.util.UUID**](.md)|  |
 **updateDealCommand** | [**UpdateDealCommand**](UpdateDealCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DealsGet"></a>
# **apiV1DealsGet**
> DealsViewModel apiV1DealsGet(id, name, marketingType, countryId, hospitalId, hospitalName, specialtyId, specialtyTypeId, page, limit, lastRetrieved, current)

Get all deals.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DealsViewModel = apiInstance.apiV1DealsGet(id, name, marketingType, countryId, hospitalId, hospitalName, specialtyId, specialtyTypeId, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#apiV1DealsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#apiV1DealsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **countryId** | [**java.util.UUID**](.md)|  | [optional]
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **specialtyId** | [**java.util.UUID**](.md)|  | [optional]
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DealsViewModel**](DealsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DealsPost"></a>
# **apiV1DealsPost**
> java.util.UUID apiV1DealsPost(createDealCommand)

Create deal.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealsApi()
val createDealCommand : CreateDealCommand =  // CreateDealCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1DealsPost(createDealCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#apiV1DealsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#apiV1DealsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDealCommand** | [**CreateDealCommand**](CreateDealCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DealsSlugsSlugGet"></a>
# **apiV1DealsSlugsSlugGet**
> DealViewModel apiV1DealsSlugsSlugGet(slug)

Get deal by slug.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : DealViewModel = apiInstance.apiV1DealsSlugsSlugGet(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#apiV1DealsSlugsSlugGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#apiV1DealsSlugsSlugGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**DealViewModel**](DealViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

