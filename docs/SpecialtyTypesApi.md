# SpecialtyTypesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SpecialtytypesGet**](SpecialtyTypesApi.md#apiV1SpecialtytypesGet) | **GET** api/v1/specialtytypes | Get all SpecialtyTypes.
[**apiV1SpecialtytypesPost**](SpecialtyTypesApi.md#apiV1SpecialtytypesPost) | **POST** api/v1/specialtytypes | Create specialtyType.
[**apiV1SpecialtytypesSlugsSlugGet**](SpecialtyTypesApi.md#apiV1SpecialtytypesSlugsSlugGet) | **GET** api/v1/specialtytypes/slugs/{slug} | Get specialtyType by slug.
[**apiV1SpecialtytypesSpecialtyTypeIdDelete**](SpecialtyTypesApi.md#apiV1SpecialtytypesSpecialtyTypeIdDelete) | **DELETE** api/v1/specialtytypes/{specialtyTypeId} | Delete specialtyType.
[**apiV1SpecialtytypesSpecialtyTypeIdGet**](SpecialtyTypesApi.md#apiV1SpecialtytypesSpecialtyTypeIdGet) | **GET** api/v1/specialtytypes/{specialtyTypeId} | Get specialtyType.
[**apiV1SpecialtytypesSpecialtyTypeIdPut**](SpecialtyTypesApi.md#apiV1SpecialtytypesSpecialtyTypeIdPut) | **PUT** api/v1/specialtytypes/{specialtyTypeId} | Update specialtyType



Get all SpecialtyTypes.

Sample request:        GET /api/v1/SpecialtyTypes

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtyTypesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : SpecialtyTypesViewModel = webService.apiV1SpecialtytypesGet(id, name, description, marketingType, created, languageCode, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**SpecialtyTypesViewModel**](SpecialtyTypesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create specialtyType.

Sample request:        POST /api/v1/SpecialtyTypes      {          \&quot;name\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;description\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;specialtyTypeType\&quot;: \&quot;Cardiology\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtyTypesApi::class.java)
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createSpecialtyTypeCommand : CreateSpecialtyTypeCommand =  // CreateSpecialtyTypeCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1SpecialtytypesPost(specialtyTypeId, createSpecialtyTypeCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **createSpecialtyTypeCommand** | [**CreateSpecialtyTypeCommand**](CreateSpecialtyTypeCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get specialtyType by slug.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtyTypesApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : SpecialtyTypeViewModel = webService.apiV1SpecialtytypesSlugsSlugGet(slug, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**SpecialtyTypeViewModel**](SpecialtyTypeViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete specialtyType.

Sample request:        DELETE /api/v1/SpecialtyTypes/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtyTypesApi::class.java)
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1SpecialtytypesSpecialtyTypeIdDelete(specialtyTypeId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get specialtyType.

Sample request:        GET /api/v1/SpecialtyTypes/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtyTypesApi::class.java)
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : SpecialtyTypeViewModel = webService.apiV1SpecialtytypesSpecialtyTypeIdGet(specialtyTypeId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**SpecialtyTypeViewModel**](SpecialtyTypeViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update specialtyType

Sample request:        PUT /api/v1/SpecialtyTypes/1      {          \&quot;name\&quot;: \&quot;Dilated cardiomyopathy\&quot;,          \&quot;description\&quot;: \&quot;Dilated cardiomyopathy\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtyTypesApi::class.java)
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateSpecialtyTypeCommand : UpdateSpecialtyTypeCommand =  // UpdateSpecialtyTypeCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1SpecialtytypesSpecialtyTypeIdPut(specialtyTypeId, updateSpecialtyTypeCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeId** | [**java.util.UUID**](.md)|  |
 **updateSpecialtyTypeCommand** | [**UpdateSpecialtyTypeCommand**](UpdateSpecialtyTypeCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

