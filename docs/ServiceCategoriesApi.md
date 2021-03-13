# ServiceCategoriesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ServicecategoriesGet**](ServiceCategoriesApi.md#apiV1ServicecategoriesGet) | **GET** api/v1/servicecategories | Get all ServiceCategories.
[**apiV1ServicecategoriesPost**](ServiceCategoriesApi.md#apiV1ServicecategoriesPost) | **POST** api/v1/servicecategories | Create ServiceCategory.
[**apiV1ServicecategoriesServiceCategoryIdDelete**](ServiceCategoriesApi.md#apiV1ServicecategoriesServiceCategoryIdDelete) | **DELETE** api/v1/servicecategories/{serviceCategoryId} | Delete ServiceCategory.
[**apiV1ServicecategoriesServiceCategoryIdGet**](ServiceCategoriesApi.md#apiV1ServicecategoriesServiceCategoryIdGet) | **GET** api/v1/servicecategories/{serviceCategoryId} | Get ServiceCategory.
[**apiV1ServicecategoriesServiceCategoryIdPut**](ServiceCategoriesApi.md#apiV1ServicecategoriesServiceCategoryIdPut) | **PUT** api/v1/servicecategories/{serviceCategoryId} | Update ServiceCategory



Get all ServiceCategories.

Sample request:        GET /api/v1/ServiceCategories

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceCategoriesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : ServiceCategoriesViewModel = webService.apiV1ServicecategoriesGet(id, name, description, page, limit, lastRetrieved, current)
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


Create ServiceCategory.

Sample request:        POST /api/v1/ServiceCategories      {          \&quot;name\&quot;: \&quot;Adults\&quot;,          \&quot;description\&quot;: \&quot;There are so many “-ologists“ that they can be hard to keep straight. However, this list could be a handy reference. This is not meant to be an exhaustive and all-inclusive list of what a specialist does, but it should provide you with a basic overview.\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceCategoriesApi::class.java)
val createServiceCategoryCommand : CreateServiceCategoryCommand =  // CreateServiceCategoryCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1ServicecategoriesPost(createServiceCategoryCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createServiceCategoryCommand** | [**CreateServiceCategoryCommand**](CreateServiceCategoryCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Delete ServiceCategory.

Sample request:        DELETE /api/v1/ServiceCategories/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceCategoriesApi::class.java)
val serviceCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ServicecategoriesServiceCategoryIdDelete(serviceCategoryId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceCategoryId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get ServiceCategory.

Sample request:        GET /api/v1/ServiceCategories/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceCategoriesApi::class.java)
val serviceCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : ServiceCategoryViewModel = webService.apiV1ServicecategoriesServiceCategoryIdGet(serviceCategoryId)
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


Update ServiceCategory

Sample request:        PUT /api/v1/ServiceCategories/1      {          \&quot;name\&quot;: \&quot;Adults\&quot;,          \&quot;description\&quot;: \&quot;There are so many “-ologists“ that they can be hard to keep straight. However, this list could be a handy reference. This is not meant to be an exhaustive and all-inclusive list of what a specialist does, but it should provide you with a basic overview.\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceCategoriesApi::class.java)
val serviceCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateServiceCategoryCommand : UpdateServiceCategoryCommand =  // UpdateServiceCategoryCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ServicecategoriesServiceCategoryIdPut(serviceCategoryId, updateServiceCategoryCommand)
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



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

