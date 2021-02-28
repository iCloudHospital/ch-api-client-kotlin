# DealsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DealsDealIdDelete**](DealsApi.md#apiV1DealsDealIdDelete) | **DELETE** api/v1/deals/{dealId} | Delete deal.
[**apiV1DealsDealIdGet**](DealsApi.md#apiV1DealsDealIdGet) | **GET** api/v1/deals/{dealId} | Get deal.
[**apiV1DealsDealIdPut**](DealsApi.md#apiV1DealsDealIdPut) | **PUT** api/v1/deals/{dealId} | Update deal.
[**apiV1DealsGet**](DealsApi.md#apiV1DealsGet) | **GET** api/v1/deals | Get all deals.
[**apiV1DealsPost**](DealsApi.md#apiV1DealsPost) | **POST** api/v1/deals | Create deal.
[**apiV1DealsSlugsSlugGet**](DealsApi.md#apiV1DealsSlugsSlugGet) | **GET** api/v1/deals/slugs/{slug} | Get deal by slug.



Delete deal.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealsApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DealsDealIdDelete(dealId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get deal.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealsApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DealViewModel = webService.apiV1DealsDealIdGet(dealId)
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


Update deal.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealsApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDealCommand : UpdateDealCommand =  // UpdateDealCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DealsDealIdPut(dealId, updateDealCommand)
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



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all deals.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealsApi::class.java)
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
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DealsViewModel = webService.apiV1DealsGet(id, name, marketingType, countryId, hospitalId, hospitalName, specialtyId, specialtyTypeId, page, limit, lastRetrieved, current)
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
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DealsViewModel**](DealsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create deal.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealsApi::class.java)
val createDealCommand : CreateDealCommand =  // CreateDealCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1DealsPost(createDealCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDealCommand** | [**CreateDealCommand**](CreateDealCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get deal by slug.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealsApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : DealViewModel = webService.apiV1DealsSlugsSlugGet(slug)
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

