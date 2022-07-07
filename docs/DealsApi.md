# DealsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2DealsDealIdGet**](DealsApi.md#apiV2DealsDealIdGet) | **GET** api/v2/deals/{dealId} | Get deal.
[**apiV2DealsDealIdPackagesGet**](DealsApi.md#apiV2DealsDealIdPackagesGet) | **GET** api/v2/deals/{dealId}/packages | Get all DealPackage.
[**apiV2DealsDealIdPackagesPackageIdGet**](DealsApi.md#apiV2DealsDealIdPackagesPackageIdGet) | **GET** api/v2/deals/{dealId}/packages/{packageId} | Get DealPackage.
[**apiV2DealsDealIdServicesGet**](DealsApi.md#apiV2DealsDealIdServicesGet) | **GET** api/v2/deals/{dealId}/services | Get all DealService.
[**apiV2DealsDealIdServicesServiceIdGet**](DealsApi.md#apiV2DealsDealIdServicesServiceIdGet) | **GET** api/v2/deals/{dealId}/services/{serviceId} | Get DealService.
[**apiV2DealsGet**](DealsApi.md#apiV2DealsGet) | **GET** api/v2/deals | Get all deals.
[**apiV2DealsSimpleGet**](DealsApi.md#apiV2DealsSimpleGet) | **GET** api/v2/deals/simple | Get all deals.
[**apiV2DealsSlugGet**](DealsApi.md#apiV2DealsSlugGet) | **GET** api/v2/deals/{slug} | Get deal by slug.



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
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DealModel = webService.apiV2DealsDealIdGet(dealId, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**DealModel**](DealModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all DealPackage.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealsApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val relatedDealPackageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealName : kotlin.String = dealName_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DealPackagesModel = webService.apiV2DealsDealIdPackagesGet(dealId, relatedDealPackageId, dealName, name, countryId, hospitalId, hospitalName, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | **java.util.UUID**|  |
 **relatedDealPackageId** | **java.util.UUID**|  | [optional]
 **dealName** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **countryId** | **java.util.UUID**|  | [optional]
 **hospitalId** | **java.util.UUID**|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DealPackagesModel**](DealPackagesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get DealPackage.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealsApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val packageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DealPackageModel = webService.apiV2DealsDealIdPackagesPackageIdGet(dealId, packageId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | **java.util.UUID**|  |
 **packageId** | **java.util.UUID**|  |

### Return type

[**DealPackageModel**](DealPackageModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all DealService.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealsApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DealServicesModel = webService.apiV2DealsDealIdServicesGet(dealId, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | **java.util.UUID**|  |
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DealServicesModel**](DealServicesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get DealService.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DealsApi::class.java)
val dealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DealServiceModel = webService.apiV2DealsDealIdServicesServiceIdGet(dealId, serviceId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealId** | **java.util.UUID**|  |
 **serviceId** | **java.util.UUID**|  |

### Return type

[**DealServiceModel**](DealServiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


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
val specialtyName : kotlin.String = specialtyName_example // kotlin.String | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyTypeName : kotlin.String = specialtyTypeName_example // kotlin.String | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceName : kotlin.String = serviceName_example // kotlin.String | 
val exceptHospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val exceptDealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val ids : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val serviceDuration : kotlin.Int = 56 // kotlin.Int | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DealsModel = webService.apiV2DealsGet(id, name, marketingType, countryId, hospitalId, hospitalName, specialtyId, specialtyName, specialtyTypeId, specialtyTypeName, serviceId, serviceName, exceptHospitalId, exceptDealId, ids, serviceDuration, languageCode, showHidden, returnDefaultValue, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **countryId** | **java.util.UUID**|  | [optional]
 **hospitalId** | **java.util.UUID**|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **specialtyId** | **java.util.UUID**|  | [optional]
 **specialtyName** | **kotlin.String**|  | [optional]
 **specialtyTypeId** | **java.util.UUID**|  | [optional]
 **specialtyTypeName** | **kotlin.String**|  | [optional]
 **serviceId** | **java.util.UUID**|  | [optional]
 **serviceName** | **kotlin.String**|  | [optional]
 **exceptHospitalId** | **java.util.UUID**|  | [optional]
 **exceptDealId** | **java.util.UUID**|  | [optional]
 **ids** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **serviceDuration** | **kotlin.Int**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DealsModel**](DealsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


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
val specialtyName : kotlin.String = specialtyName_example // kotlin.String | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyTypeName : kotlin.String = specialtyTypeName_example // kotlin.String | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceName : kotlin.String = serviceName_example // kotlin.String | 
val exceptHospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val exceptDealId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val ids : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val serviceDuration : kotlin.Int = 56 // kotlin.Int | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DealsSimpleModel = webService.apiV2DealsSimpleGet(id, name, marketingType, countryId, hospitalId, hospitalName, specialtyId, specialtyName, specialtyTypeId, specialtyTypeName, serviceId, serviceName, exceptHospitalId, exceptDealId, ids, serviceDuration, languageCode, showHidden, returnDefaultValue, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **countryId** | **java.util.UUID**|  | [optional]
 **hospitalId** | **java.util.UUID**|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **specialtyId** | **java.util.UUID**|  | [optional]
 **specialtyName** | **kotlin.String**|  | [optional]
 **specialtyTypeId** | **java.util.UUID**|  | [optional]
 **specialtyTypeName** | **kotlin.String**|  | [optional]
 **serviceId** | **java.util.UUID**|  | [optional]
 **serviceName** | **kotlin.String**|  | [optional]
 **exceptHospitalId** | **java.util.UUID**|  | [optional]
 **exceptDealId** | **java.util.UUID**|  | [optional]
 **ids** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **serviceDuration** | **kotlin.Int**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DealsSimpleModel**](DealsSimpleModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


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
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DealModel = webService.apiV2DealsSlugGet(slug, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**DealModel**](DealModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

