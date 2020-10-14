# SpecialtyTypeCategoriesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SpecialtytypecategoriesGet**](SpecialtyTypeCategoriesApi.md#apiV1SpecialtytypecategoriesGet) | **GET** /api/v1/specialtytypecategories | Get all SpecialtyTypeCategories.
[**apiV1SpecialtytypecategoriesPost**](SpecialtyTypeCategoriesApi.md#apiV1SpecialtytypecategoriesPost) | **POST** /api/v1/specialtytypecategories | Create specialtyTypeCategory.
[**apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdDelete**](SpecialtyTypeCategoriesApi.md#apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdDelete) | **DELETE** /api/v1/specialtytypecategories/{specialtyTypeCategoryId} | Delete specialtyTypeCategory.
[**apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdGet**](SpecialtyTypeCategoriesApi.md#apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdGet) | **GET** /api/v1/specialtytypecategories/{specialtyTypeCategoryId} | Get specialtyTypeCategory.
[**apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdPut**](SpecialtyTypeCategoriesApi.md#apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdPut) | **PUT** /api/v1/specialtytypecategories/{specialtyTypeCategoryId} | Update specialtyTypeCategory


<a name="apiV1SpecialtytypecategoriesGet"></a>
# **apiV1SpecialtytypecategoriesGet**
> SpecialtyTypeCategoriesViewModel apiV1SpecialtytypecategoriesGet(id, name, description, page, limit, lastRetrieved, current)

Get all SpecialtyTypeCategories.

Sample request:        GET /api/v1/SpecialtyTypeCategories

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtyTypeCategoriesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : SpecialtyTypeCategoriesViewModel = apiInstance.apiV1SpecialtytypecategoriesGet(id, name, description, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtyTypeCategoriesApi#apiV1SpecialtytypecategoriesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtyTypeCategoriesApi#apiV1SpecialtytypecategoriesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**SpecialtyTypeCategoriesViewModel**](SpecialtyTypeCategoriesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtytypecategoriesPost"></a>
# **apiV1SpecialtytypecategoriesPost**
> java.util.UUID apiV1SpecialtytypecategoriesPost(createSpecialtyTypeCategoryCommand)

Create specialtyTypeCategory.

Sample request:        POST /api/v1/SpecialtyTypeCategories      {          \&quot;name\&quot;: \&quot;Adults\&quot;,          \&quot;description\&quot;: \&quot;There are so many “-ologists“ that they can be hard to keep straight. However, this list could be a handy reference. This is not meant to be an exhaustive and all-inclusive list of what a specialist does, but it should provide you with a basic overview.\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtyTypeCategoriesApi()
val createSpecialtyTypeCategoryCommand : CreateSpecialtyTypeCategoryCommand =  // CreateSpecialtyTypeCategoryCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1SpecialtytypecategoriesPost(createSpecialtyTypeCategoryCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtyTypeCategoriesApi#apiV1SpecialtytypecategoriesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtyTypeCategoriesApi#apiV1SpecialtytypecategoriesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSpecialtyTypeCategoryCommand** | [**CreateSpecialtyTypeCategoryCommand**](CreateSpecialtyTypeCategoryCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdDelete"></a>
# **apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdDelete**
> kotlin.Boolean apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdDelete(specialtyTypeCategoryId)

Delete specialtyTypeCategory.

Sample request:        DELETE /api/v1/SpecialtyTypeCategories/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtyTypeCategoriesApi()
val specialtyTypeCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdDelete(specialtyTypeCategoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtyTypeCategoriesApi#apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtyTypeCategoriesApi#apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeCategoryId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdGet"></a>
# **apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdGet**
> SpecialtyTypeCategoryViewModel apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdGet(specialtyTypeCategoryId)

Get specialtyTypeCategory.

Sample request:        GET /api/v1/SpecialtyTypeCategories/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtyTypeCategoriesApi()
val specialtyTypeCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SpecialtyTypeCategoryViewModel = apiInstance.apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdGet(specialtyTypeCategoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtyTypeCategoriesApi#apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtyTypeCategoriesApi#apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeCategoryId** | [**java.util.UUID**](.md)|  |

### Return type

[**SpecialtyTypeCategoryViewModel**](SpecialtyTypeCategoryViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdPut"></a>
# **apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdPut**
> kotlin.Boolean apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdPut(specialtyTypeCategoryId, updateSpecialtyTypeCategoryCommand)

Update specialtyTypeCategory

Sample request:        PUT /api/v1/SpecialtyTypeCategories/1      {          \&quot;name\&quot;: \&quot;Adults\&quot;,          \&quot;description\&quot;: \&quot;There are so many “-ologists“ that they can be hard to keep straight. However, this list could be a handy reference. This is not meant to be an exhaustive and all-inclusive list of what a specialist does, but it should provide you with a basic overview.\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtyTypeCategoriesApi()
val specialtyTypeCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateSpecialtyTypeCategoryCommand : UpdateSpecialtyTypeCategoryCommand =  // UpdateSpecialtyTypeCategoryCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdPut(specialtyTypeCategoryId, updateSpecialtyTypeCategoryCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtyTypeCategoriesApi#apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtyTypeCategoriesApi#apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeCategoryId** | [**java.util.UUID**](.md)|  |
 **updateSpecialtyTypeCategoryCommand** | [**UpdateSpecialtyTypeCategoryCommand**](UpdateSpecialtyTypeCategoryCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

