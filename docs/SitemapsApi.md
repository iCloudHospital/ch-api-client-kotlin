# SitemapsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SitemapsArticlesGet**](SitemapsApi.md#apiV1SitemapsArticlesGet) | **GET** api/v1/sitemaps/articles | Get articles sitemap raw data
[**apiV1SitemapsContributorsGet**](SitemapsApi.md#apiV1SitemapsContributorsGet) | **GET** api/v1/sitemaps/contributors | Get contributors sitemap raw data
[**apiV1SitemapsCountriesGet**](SitemapsApi.md#apiV1SitemapsCountriesGet) | **GET** api/v1/sitemaps/countries | Get countries sitemap raw data
[**apiV1SitemapsDealsGet**](SitemapsApi.md#apiV1SitemapsDealsGet) | **GET** api/v1/sitemaps/deals | Get deals sitemap raw data
[**apiV1SitemapsDepartmentsGet**](SitemapsApi.md#apiV1SitemapsDepartmentsGet) | **GET** api/v1/sitemaps/departments | Get departments sitemap raw data
[**apiV1SitemapsDoctorsGet**](SitemapsApi.md#apiV1SitemapsDoctorsGet) | **GET** api/v1/sitemaps/doctors | Get doctors sitemap raw data
[**apiV1SitemapsFaqcategoriesGet**](SitemapsApi.md#apiV1SitemapsFaqcategoriesGet) | **GET** api/v1/sitemaps/faqcategories | Get faq categories sitemap raw data
[**apiV1SitemapsFaqsGet**](SitemapsApi.md#apiV1SitemapsFaqsGet) | **GET** api/v1/sitemaps/faqs | Get faqs sitemap raw data
[**apiV1SitemapsGet**](SitemapsApi.md#apiV1SitemapsGet) | **GET** api/v1/sitemaps | Get sitemap content pages information
[**apiV1SitemapsHospitalsGet**](SitemapsApi.md#apiV1SitemapsHospitalsGet) | **GET** api/v1/sitemaps/hospitals | Get hospitals sitemap raw data
[**apiV1SitemapsProceduresGet**](SitemapsApi.md#apiV1SitemapsProceduresGet) | **GET** api/v1/sitemaps/procedures | Get procedures sitemap raw data
[**apiV1SitemapsServicesGet**](SitemapsApi.md#apiV1SitemapsServicesGet) | **GET** api/v1/sitemaps/services | Get services sitemap raw data
[**apiV1SitemapsSpecialtiesGet**](SitemapsApi.md#apiV1SitemapsSpecialtiesGet) | **GET** api/v1/sitemaps/specialties | Get specialties sitemap raw data



Get articles sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsArticlesGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get contributors sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsContributorsGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get countries sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsCountriesGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get deals sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsDealsGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get departments sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsDepartmentsGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get doctors sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsDoctorsGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get faq categories sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsFaqcategoriesGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get faqs sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsFaqsGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get sitemap content pages information

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapInformationViewModel = webService.apiV1SitemapsGet(limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapInformationViewModel**](SitemapInformationViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get hospitals sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsHospitalsGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get procedures sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsProceduresGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get services sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsServicesGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get specialties sitemap raw data

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SitemapsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : SitemapViewModel = webService.apiV1SitemapsSpecialtiesGet(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**SitemapViewModel**](SitemapViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

