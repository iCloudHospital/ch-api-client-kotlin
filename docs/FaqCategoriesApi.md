# FaqCategoriesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2FaqcategoriesFaqCategoryIdGet**](FaqCategoriesApi.md#apiV2FaqcategoriesFaqCategoryIdGet) | **GET** api/v2/faqcategories/{faqCategoryId} | Get FaqCategory.
[**apiV2FaqcategoriesGet**](FaqCategoriesApi.md#apiV2FaqcategoriesGet) | **GET** api/v2/faqcategories | Get all FaqCategories.
[**apiV2FaqcategoriesSlugGet**](FaqCategoriesApi.md#apiV2FaqcategoriesSlugGet) | **GET** api/v2/faqcategories/{slug} | Get FaqCategory by slug.



Get FaqCategory.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FaqCategoriesApi::class.java)
val faqCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : FaqCategoryModel = webService.apiV2FaqcategoriesFaqCategoryIdGet(faqCategoryId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqCategoryId** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]

### Return type

[**FaqCategoryModel**](FaqCategoryModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all FaqCategories.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FaqCategoriesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val parentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : FaqCategoriesModel = webService.apiV2FaqcategoriesGet(id, parentId, name, hospitalId, hospitalName, languageCode, showHidden, returnDefaultValue, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  | [optional]
 **parentId** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **hospitalId** | **java.util.UUID**|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**FaqCategoriesModel**](FaqCategoriesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get FaqCategory by slug.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FaqCategoriesApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : FaqCategoryModel = webService.apiV2FaqcategoriesSlugGet(slug, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional]

### Return type

[**FaqCategoryModel**](FaqCategoryModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

