# SpecialtiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SpecialtiesGet**](SpecialtiesApi.md#apiV1SpecialtiesGet) | **GET** /api/v1/specialties | Get all specialties.
[**apiV1SpecialtiesPost**](SpecialtiesApi.md#apiV1SpecialtiesPost) | **POST** /api/v1/specialties | Create specialty.
[**apiV1SpecialtiesSlugsSlugGet**](SpecialtiesApi.md#apiV1SpecialtiesSlugsSlugGet) | **GET** /api/v1/specialties/slugs/{slug} | Get specialty by slug.
[**apiV1SpecialtiesSpecialtyIdDelete**](SpecialtiesApi.md#apiV1SpecialtiesSpecialtyIdDelete) | **DELETE** /api/v1/specialties/{specialtyId} | Delete specialty.
[**apiV1SpecialtiesSpecialtyIdGet**](SpecialtiesApi.md#apiV1SpecialtiesSpecialtyIdGet) | **GET** /api/v1/specialties/{specialtyId} | Get specialty.
[**apiV1SpecialtiesSpecialtyIdPut**](SpecialtiesApi.md#apiV1SpecialtiesSpecialtyIdPut) | **PUT** /api/v1/specialties/{specialtyId} | Update specialty


<a name="apiV1SpecialtiesGet"></a>
# **apiV1SpecialtiesGet**
> SpecialtiesViewModel apiV1SpecialtiesGet(id, name, description, specialtyTypeId, created, page, limit, lastRetrieved, current)

Get all specialties.

Sample request:        GET /api/v1/specialties

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtiesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : SpecialtiesViewModel = apiInstance.apiV1SpecialtiesGet(id, name, description, specialtyTypeId, created, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtiesApi#apiV1SpecialtiesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtiesApi#apiV1SpecialtiesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**SpecialtiesViewModel**](SpecialtiesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtiesPost"></a>
# **apiV1SpecialtiesPost**
> java.util.UUID apiV1SpecialtiesPost(specialtyTypeId, createSpecialtyCommand)

Create specialty.

Sample request:        POST /api/v1/specialties      {          \&quot;name\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;description\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;specialtyType\&quot;: \&quot;Cardiology\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtiesApi()
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createSpecialtyCommand : CreateSpecialtyCommand =  // CreateSpecialtyCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1SpecialtiesPost(specialtyTypeId, createSpecialtyCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtiesApi#apiV1SpecialtiesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtiesApi#apiV1SpecialtiesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **createSpecialtyCommand** | [**CreateSpecialtyCommand**](CreateSpecialtyCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtiesSlugsSlugGet"></a>
# **apiV1SpecialtiesSlugsSlugGet**
> SpecialtyViewModel apiV1SpecialtiesSlugsSlugGet(slug)

Get specialty by slug.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtiesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : SpecialtyViewModel = apiInstance.apiV1SpecialtiesSlugsSlugGet(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtiesApi#apiV1SpecialtiesSlugsSlugGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtiesApi#apiV1SpecialtiesSlugsSlugGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**SpecialtyViewModel**](SpecialtyViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtiesSpecialtyIdDelete"></a>
# **apiV1SpecialtiesSpecialtyIdDelete**
> kotlin.Boolean apiV1SpecialtiesSpecialtyIdDelete(specialtyId)

Delete specialty.

Sample request:        DELETE /api/v1/specialties/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtiesApi()
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1SpecialtiesSpecialtyIdDelete(specialtyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtiesApi#apiV1SpecialtiesSpecialtyIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtiesApi#apiV1SpecialtiesSpecialtyIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtiesSpecialtyIdGet"></a>
# **apiV1SpecialtiesSpecialtyIdGet**
> SpecialtyViewModel apiV1SpecialtiesSpecialtyIdGet(specialtyId)

Get specialty.

Sample request:        GET /api/v1/specialties/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtiesApi()
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SpecialtyViewModel = apiInstance.apiV1SpecialtiesSpecialtyIdGet(specialtyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtiesApi#apiV1SpecialtiesSpecialtyIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtiesApi#apiV1SpecialtiesSpecialtyIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyId** | [**java.util.UUID**](.md)|  |

### Return type

[**SpecialtyViewModel**](SpecialtyViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SpecialtiesSpecialtyIdPut"></a>
# **apiV1SpecialtiesSpecialtyIdPut**
> kotlin.Boolean apiV1SpecialtiesSpecialtyIdPut(specialtyId, updateSpecialtyCommand)

Update specialty

Sample request:        PUT /api/v1/specialties/1      {          \&quot;name\&quot;: \&quot;Dilated cardiomyopathy\&quot;,          \&quot;description\&quot;: \&quot;Dilated cardiomyopathy\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecialtiesApi()
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateSpecialtyCommand : UpdateSpecialtyCommand =  // UpdateSpecialtyCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1SpecialtiesSpecialtyIdPut(specialtyId, updateSpecialtyCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecialtiesApi#apiV1SpecialtiesSpecialtyIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecialtiesApi#apiV1SpecialtiesSpecialtyIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **updateSpecialtyCommand** | [**UpdateSpecialtyCommand**](UpdateSpecialtyCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

