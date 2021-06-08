# SpecialtiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SpecialtiesGet**](SpecialtiesApi.md#apiV1SpecialtiesGet) | **GET** api/v1/specialties | Get all specialties.
[**apiV1SpecialtiesPost**](SpecialtiesApi.md#apiV1SpecialtiesPost) | **POST** api/v1/specialties | Create specialty.
[**apiV1SpecialtiesSlugsSlugGet**](SpecialtiesApi.md#apiV1SpecialtiesSlugsSlugGet) | **GET** api/v1/specialties/slugs/{slug} | Get specialty by slug.
[**apiV1SpecialtiesSpecialtyIdDelete**](SpecialtiesApi.md#apiV1SpecialtiesSpecialtyIdDelete) | **DELETE** api/v1/specialties/{specialtyId} | Delete specialty.
[**apiV1SpecialtiesSpecialtyIdGet**](SpecialtiesApi.md#apiV1SpecialtiesSpecialtyIdGet) | **GET** api/v1/specialties/{specialtyId} | Get specialty.
[**apiV1SpecialtiesSpecialtyIdPut**](SpecialtiesApi.md#apiV1SpecialtiesSpecialtyIdPut) | **PUT** api/v1/specialties/{specialtyId} | Update specialty



Get all specialties.

Sample request:        GET /api/v1/specialties

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtiesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

val result : SpecialtiesViewModel = webService.apiV1SpecialtiesGet(id, name, description, specialtyTypeId, created, languageCode, page, limit, lastRetrieved, current)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
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


Create specialty.

Sample request:        POST /api/v1/specialties      {          \&quot;name\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;description\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;specialtyType\&quot;: \&quot;Cardiology\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtiesApi::class.java)
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createSpecialtyCommand : CreateSpecialtyCommand =  // CreateSpecialtyCommand | 

val result : java.util.UUID = webService.apiV1SpecialtiesPost(specialtyTypeId, createSpecialtyCommand)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **createSpecialtyCommand** | [**CreateSpecialtyCommand**](CreateSpecialtyCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get specialty by slug.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtiesApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

val result : SpecialtyViewModel = webService.apiV1SpecialtiesSlugsSlugGet(slug, languageCode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**SpecialtyViewModel**](SpecialtyViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete specialty.

Sample request:        DELETE /api/v1/specialties/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtiesApi::class.java)
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : kotlin.Boolean = webService.apiV1SpecialtiesSpecialtyIdDelete(specialtyId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get specialty.

Sample request:        GET /api/v1/specialties/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtiesApi::class.java)
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

val result : SpecialtyViewModel = webService.apiV1SpecialtiesSpecialtyIdGet(specialtyId, languageCode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**SpecialtyViewModel**](SpecialtyViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update specialty

Sample request:        PUT /api/v1/specialties/1      {          \&quot;name\&quot;: \&quot;Dilated cardiomyopathy\&quot;,          \&quot;description\&quot;: \&quot;Dilated cardiomyopathy\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SpecialtiesApi::class.java)
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateSpecialtyCommand : UpdateSpecialtyCommand =  // UpdateSpecialtyCommand | 

val result : kotlin.Boolean = webService.apiV1SpecialtiesSpecialtyIdPut(specialtyId, updateSpecialtyCommand)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **updateSpecialtyCommand** | [**UpdateSpecialtyCommand**](UpdateSpecialtyCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

