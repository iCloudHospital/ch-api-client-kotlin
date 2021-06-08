# LanguagesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1LanguagesCodeGet**](LanguagesApi.md#apiV1LanguagesCodeGet) | **GET** api/v1/languages/{code} | Get a language by code
[**apiV1LanguagesGet**](LanguagesApi.md#apiV1LanguagesGet) | **GET** api/v1/languages | Get all languages.
[**apiV1LanguagesIdGet**](LanguagesApi.md#apiV1LanguagesIdGet) | **GET** api/v1/languages/{id} | Get a language by id



Get a language by code

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LanguagesApi::class.java)
val code : kotlin.String = code_example // kotlin.String | 

val result : LanguageViewModel = webService.apiV1LanguagesCodeGet(code)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

[**LanguageViewModel**](LanguageViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get all languages.

Sample request:        GET: /api/v1/languages

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LanguagesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val code : kotlin.String = code_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

val result : LanguagesViewModel = webService.apiV1LanguagesGet(id, name, code, description, page, limit, lastRetrieved, current)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **code** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**LanguagesViewModel**](LanguagesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get a language by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LanguagesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : LanguageViewModel = webService.apiV1LanguagesIdGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  |

### Return type

[**LanguageViewModel**](LanguageViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

