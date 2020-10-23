# ServiceCategoriesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ServicecategoriesGet**](ServiceCategoriesApi.md#apiV1ServicecategoriesGet) | **GET** /api/v1/servicecategories | Get all ServiceCategories.
[**apiV1ServicecategoriesPost**](ServiceCategoriesApi.md#apiV1ServicecategoriesPost) | **POST** /api/v1/servicecategories | Create ServiceCategory.
[**apiV1ServicecategoriesServiceCategoryIdDelete**](ServiceCategoriesApi.md#apiV1ServicecategoriesServiceCategoryIdDelete) | **DELETE** /api/v1/servicecategories/{serviceCategoryId} | Delete ServiceCategory.
[**apiV1ServicecategoriesServiceCategoryIdGet**](ServiceCategoriesApi.md#apiV1ServicecategoriesServiceCategoryIdGet) | **GET** /api/v1/servicecategories/{serviceCategoryId} | Get ServiceCategory.
[**apiV1ServicecategoriesServiceCategoryIdPut**](ServiceCategoriesApi.md#apiV1ServicecategoriesServiceCategoryIdPut) | **PUT** /api/v1/servicecategories/{serviceCategoryId} | Update ServiceCategory


<a name="apiV1ServicecategoriesGet"></a>
# **apiV1ServicecategoriesGet**
> ServiceCategoriesViewModel apiV1ServicecategoriesGet(id, name, description, page, limit, lastRetrieved, current)

Get all ServiceCategories.

Sample request:        GET /api/v1/ServiceCategories

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCategoriesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : ServiceCategoriesViewModel = apiInstance.apiV1ServicecategoriesGet(id, name, description, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCategoriesApi#apiV1ServicecategoriesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCategoriesApi#apiV1ServicecategoriesGet")
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
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**ServiceCategoriesViewModel**](ServiceCategoriesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ServicecategoriesPost"></a>
# **apiV1ServicecategoriesPost**
> java.util.UUID apiV1ServicecategoriesPost(createServiceCategoryCommand)

Create ServiceCategory.

Sample request:        POST /api/v1/ServiceCategories      {          \&quot;name\&quot;: \&quot;Adults\&quot;,          \&quot;description\&quot;: \&quot;There are so many “-ologists“ that they can be hard to keep straight. However, this list could be a handy reference. This is not meant to be an exhaustive and all-inclusive list of what a specialist does, but it should provide you with a basic overview.\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCategoriesApi()
val createServiceCategoryCommand : CreateServiceCategoryCommand =  // CreateServiceCategoryCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1ServicecategoriesPost(createServiceCategoryCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCategoriesApi#apiV1ServicecategoriesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCategoriesApi#apiV1ServicecategoriesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createServiceCategoryCommand** | [**CreateServiceCategoryCommand**](CreateServiceCategoryCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ServicecategoriesServiceCategoryIdDelete"></a>
# **apiV1ServicecategoriesServiceCategoryIdDelete**
> kotlin.Boolean apiV1ServicecategoriesServiceCategoryIdDelete(serviceCategoryId)

Delete ServiceCategory.

Sample request:        DELETE /api/v1/ServiceCategories/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCategoriesApi()
val serviceCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ServicecategoriesServiceCategoryIdDelete(serviceCategoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCategoriesApi#apiV1ServicecategoriesServiceCategoryIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCategoriesApi#apiV1ServicecategoriesServiceCategoryIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceCategoryId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ServicecategoriesServiceCategoryIdGet"></a>
# **apiV1ServicecategoriesServiceCategoryIdGet**
> ServiceCategoryViewModel apiV1ServicecategoriesServiceCategoryIdGet(serviceCategoryId)

Get ServiceCategory.

Sample request:        GET /api/v1/ServiceCategories/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCategoriesApi()
val serviceCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ServiceCategoryViewModel = apiInstance.apiV1ServicecategoriesServiceCategoryIdGet(serviceCategoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCategoriesApi#apiV1ServicecategoriesServiceCategoryIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCategoriesApi#apiV1ServicecategoriesServiceCategoryIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceCategoryId** | [**java.util.UUID**](.md)|  |

### Return type

[**ServiceCategoryViewModel**](ServiceCategoryViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ServicecategoriesServiceCategoryIdPut"></a>
# **apiV1ServicecategoriesServiceCategoryIdPut**
> kotlin.Boolean apiV1ServicecategoriesServiceCategoryIdPut(serviceCategoryId, updateServiceCategoryCommand)

Update ServiceCategory

Sample request:        PUT /api/v1/ServiceCategories/1      {          \&quot;name\&quot;: \&quot;Adults\&quot;,          \&quot;description\&quot;: \&quot;There are so many “-ologists“ that they can be hard to keep straight. However, this list could be a handy reference. This is not meant to be an exhaustive and all-inclusive list of what a specialist does, but it should provide you with a basic overview.\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCategoriesApi()
val serviceCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateServiceCategoryCommand : UpdateServiceCategoryCommand =  // UpdateServiceCategoryCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ServicecategoriesServiceCategoryIdPut(serviceCategoryId, updateServiceCategoryCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCategoriesApi#apiV1ServicecategoriesServiceCategoryIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCategoriesApi#apiV1ServicecategoriesServiceCategoryIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceCategoryId** | [**java.util.UUID**](.md)|  |
 **updateServiceCategoryCommand** | [**UpdateServiceCategoryCommand**](UpdateServiceCategoryCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

