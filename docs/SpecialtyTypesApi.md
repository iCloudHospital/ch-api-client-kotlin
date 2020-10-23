# SpecialtyTypesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SpecialtytypesGet**](SpecialtyTypesApi.md#apiV1SpecialtytypesGet) | **GET** /api/v1/specialtytypes | Get all SpecialtyTypes.
[**apiV1SpecialtytypesPost**](SpecialtyTypesApi.md#apiV1SpecialtytypesPost) | **POST** /api/v1/specialtytypes | Create specialtyType.
[**apiV1SpecialtytypesSlugsSlugGet**](SpecialtyTypesApi.md#apiV1SpecialtytypesSlugsSlugGet) | **GET** /api/v1/specialtytypes/slugs/{slug} | Get specialtyType by slug.
[**apiV1SpecialtytypesSpecialtyTypeIdDelete**](SpecialtyTypesApi.md#apiV1SpecialtytypesSpecialtyTypeIdDelete) | **DELETE** /api/v1/specialtytypes/{specialtyTypeId} | Delete specialtyType.
[**apiV1SpecialtytypesSpecialtyTypeIdGet**](SpecialtyTypesApi.md#apiV1SpecialtytypesSpecialtyTypeIdGet) | **GET** /api/v1/specialtytypes/{specialtyTypeId} | Get specialtyType.
[**apiV1SpecialtytypesSpecialtyTypeIdPut**](SpecialtyTypesApi.md#apiV1SpecialtytypesSpecialtyTypeIdPut) | **PUT** /api/v1/specialtytypes/{specialtyTypeId} | Update specialtyType


<a name="apiV1SpecialtytypesGet"></a>
# **apiV1SpecialtytypesGet**
> SpecialtyTypesViewModel apiV1SpecialtytypesGet(id, name, description, marketingType, created, page, limit, lastRetrieved, current)

Get all SpecialtyTypes.

Sample request:        GET /api/v1/SpecialtyTypes

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtyTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : SpecialtyTypesViewModel = apiInstance.apiV1SpecialtytypesGet(id, name, description, marketingType, created, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtyTypesApi#apiV1SpecialtytypesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtyTypesApi#apiV1SpecialtytypesGet")
    e.printStackTrace()
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

<a name="apiV1SpecialtytypesPost"></a>
# **apiV1SpecialtytypesPost**
> java.util.UUID apiV1SpecialtytypesPost(specialtyTypeId, createSpecialtyTypeCommand)

Create specialtyType.

Sample request:        POST /api/v1/SpecialtyTypes      {          \&quot;name\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;description\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;specialtyTypeType\&quot;: \&quot;Cardiology\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtyTypesApi()
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createSpecialtyTypeCommand : CreateSpecialtyTypeCommand =  // CreateSpecialtyTypeCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1SpecialtytypesPost(specialtyTypeId, createSpecialtyTypeCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtyTypesApi#apiV1SpecialtytypesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtyTypesApi#apiV1SpecialtytypesPost")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtytypesSlugsSlugGet"></a>
# **apiV1SpecialtytypesSlugsSlugGet**
> SpecialtyTypeViewModel apiV1SpecialtytypesSlugsSlugGet(slug)

Get specialtyType by slug.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtyTypesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : SpecialtyTypeViewModel = apiInstance.apiV1SpecialtytypesSlugsSlugGet(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtyTypesApi#apiV1SpecialtytypesSlugsSlugGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtyTypesApi#apiV1SpecialtytypesSlugsSlugGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**SpecialtyTypeViewModel**](SpecialtyTypeViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtytypesSpecialtyTypeIdDelete"></a>
# **apiV1SpecialtytypesSpecialtyTypeIdDelete**
> kotlin.Boolean apiV1SpecialtytypesSpecialtyTypeIdDelete(specialtyTypeId)

Delete specialtyType.

Sample request:        DELETE /api/v1/SpecialtyTypes/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtyTypesApi()
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1SpecialtytypesSpecialtyTypeIdDelete(specialtyTypeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtyTypesApi#apiV1SpecialtytypesSpecialtyTypeIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtyTypesApi#apiV1SpecialtytypesSpecialtyTypeIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtytypesSpecialtyTypeIdGet"></a>
# **apiV1SpecialtytypesSpecialtyTypeIdGet**
> SpecialtyTypeViewModel apiV1SpecialtytypesSpecialtyTypeIdGet(specialtyTypeId)

Get specialtyType.

Sample request:        GET /api/v1/SpecialtyTypes/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtyTypesApi()
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SpecialtyTypeViewModel = apiInstance.apiV1SpecialtytypesSpecialtyTypeIdGet(specialtyTypeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtyTypesApi#apiV1SpecialtytypesSpecialtyTypeIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtyTypesApi#apiV1SpecialtytypesSpecialtyTypeIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeId** | [**java.util.UUID**](.md)|  |

### Return type

[**SpecialtyTypeViewModel**](SpecialtyTypeViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtytypesSpecialtyTypeIdPut"></a>
# **apiV1SpecialtytypesSpecialtyTypeIdPut**
> kotlin.Boolean apiV1SpecialtytypesSpecialtyTypeIdPut(specialtyTypeId, updateSpecialtyTypeCommand)

Update specialtyType

Sample request:        PUT /api/v1/SpecialtyTypes/1      {          \&quot;name\&quot;: \&quot;Dilated cardiomyopathy\&quot;,          \&quot;description\&quot;: \&quot;Dilated cardiomyopathy\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtyTypesApi()
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateSpecialtyTypeCommand : UpdateSpecialtyTypeCommand =  // UpdateSpecialtyTypeCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1SpecialtytypesSpecialtyTypeIdPut(specialtyTypeId, updateSpecialtyTypeCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtyTypesApi#apiV1SpecialtytypesSpecialtyTypeIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtyTypesApi#apiV1SpecialtytypesSpecialtyTypeIdPut")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

