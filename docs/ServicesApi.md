# ServicesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2ServicesGet**](ServicesApi.md#apiV2ServicesGet) | **GET** api/v2/services | Get all HospitalServices.
[**apiV2ServicesServiceIdGet**](ServicesApi.md#apiV2ServicesServiceIdGet) | **GET** api/v2/services/{serviceId} | 
[**apiV2ServicesSlugGet**](ServicesApi.md#apiV2ServicesSlugGet) | **GET** api/v2/services/{slug} | 



Get all HospitalServices.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServicesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val slug : kotlin.String = slug_example // kotlin.String | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val hospitalSlug : kotlin.String = hospitalSlug_example // kotlin.String | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyName : kotlin.String = specialtyName_example // kotlin.String | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyTypeName : kotlin.String = specialtyTypeName_example // kotlin.String | 
val serviceCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingType : MarketingType =  // MarketingType | 
val procedure : Procedure =  // Procedure | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalServicesModel = webService.apiV2ServicesGet(id, name, slug, hospitalId, hospitalName, hospitalSlug, specialtyId, specialtyName, specialtyTypeId, specialtyTypeName, serviceCategoryId, marketingType, procedure, created, languageCode, returnDefaultValue, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **slug** | **kotlin.String**|  | [optional]
 **hospitalId** | **java.util.UUID**|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **hospitalSlug** | **kotlin.String**|  | [optional]
 **specialtyId** | **java.util.UUID**|  | [optional]
 **specialtyName** | **kotlin.String**|  | [optional]
 **specialtyTypeId** | **java.util.UUID**|  | [optional]
 **specialtyTypeName** | **kotlin.String**|  | [optional]
 **serviceCategoryId** | **java.util.UUID**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **procedure** | [**Procedure**](.md)|  | [optional] [enum: Treatment, Diagnostic]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalServicesModel**](HospitalServicesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServicesApi::class.java)
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : HospitalServiceModel = webService.apiV2ServicesServiceIdGet(serviceId, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalServiceModel**](HospitalServiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServicesApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : HospitalServiceModel = webService.apiV2ServicesSlugGet(slug, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalServiceModel**](HospitalServiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

