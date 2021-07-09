# HospitalsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsCurrentGet**](HospitalsApi.md#apiV1HospitalsCurrentGet) | **GET** api/v1/hospitals/current | 
[**apiV1HospitalsGet**](HospitalsApi.md#apiV1HospitalsGet) | **GET** api/v1/hospitals | Get all hospitals.
[**apiV1HospitalsHospitalIdDelete**](HospitalsApi.md#apiV1HospitalsHospitalIdDelete) | **DELETE** api/v1/hospitals/{hospitalId} | Delete hospital.
[**apiV1HospitalsHospitalIdGet**](HospitalsApi.md#apiV1HospitalsHospitalIdGet) | **GET** api/v1/hospitals/{hospitalId} | Get hospita.
[**apiV1HospitalsHospitalIdPut**](HospitalsApi.md#apiV1HospitalsHospitalIdPut) | **PUT** api/v1/hospitals/{hospitalId} | Update hospital.
[**apiV1HospitalsPost**](HospitalsApi.md#apiV1HospitalsPost) | **POST** api/v1/hospitals | Create a hospital.
[**apiV1HospitalsSlugsSlugGet**](HospitalsApi.md#apiV1HospitalsSlugsSlugGet) | **GET** api/v1/hospitals/slugs/{slug} | Get hospital by slug.





### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val marketingType : MarketingType =  // MarketingType | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val exceptHospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val ids : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : HospitalsViewModel = webService.apiV1HospitalsCurrentGet(id, name, description, countryId, created, marketingType, specialtyTypeId, specialtyId, serviceId, exceptHospitalId, showHidden, languageCode, ids, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **countryId** | [**java.util.UUID**](.md)|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **specialtyId** | [**java.util.UUID**](.md)|  | [optional]
 **serviceId** | [**java.util.UUID**](.md)|  | [optional]
 **exceptHospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **ids** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalsViewModel**](HospitalsViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get all hospitals.

Sample request:        GET /api/v1/hospitals      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;Samsung\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val marketingType : MarketingType =  // MarketingType | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val exceptHospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val ids : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : HospitalsViewModel = webService.apiV1HospitalsGet(id, name, description, countryId, created, marketingType, specialtyTypeId, specialtyId, serviceId, exceptHospitalId, showHidden, languageCode, ids, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **countryId** | [**java.util.UUID**](.md)|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **specialtyId** | [**java.util.UUID**](.md)|  | [optional]
 **serviceId** | [**java.util.UUID**](.md)|  | [optional]
 **exceptHospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **ids** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalsViewModel**](HospitalsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete hospital.

Sample request:        DELETE /api/v1/hospitals/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdDelete(hospitalId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get hospita.

Sample request:        GET /api/v1/hospitals/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : HospitalViewModel = webService.apiV1HospitalsHospitalIdGet(hospitalId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**HospitalViewModel**](HospitalViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update hospital.

Sameple request:        PUT /api/v1/hospitals      {          \&quot;overview\&quot;: \&quot;Overview of Samsung Medical Center\&quot;,          \&quot;bedsCount\&quot;: 2436,          \&quot;operationsPerYear\&quot;: 44,          \&quot;foundationYear\&quot;: 2012,          \&quot;departmentsCount\&quot;: 200,          \&quot;medicalStaffCount\&quot;: 1200,      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateHospitalCommand : UpdateHospitalCommand =  // UpdateHospitalCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdPut(hospitalId, updateHospitalCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **updateHospitalCommand** | [**UpdateHospitalCommand**](UpdateHospitalCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Create a hospital.

Sample request:        POST /api/v1/hospitals      {          \&quot;name\&quot;: \&quot;Samsung Medical Center\&quot;,          \&quot;description\&quot;: \&quot;Comprehensive Cancer Center in Seoul, South Korea is nationally ranked in 1 adult specialty.\&quot;,          \&quot;logo\&quot;: \&quot;http://www.samsunghospital.com/home/main/index.do\&quot;,          \&quot;overview\&quot;: \&quot;Overview of Samsung Medical Center\&quot;,          \&quot;bedsCount\&quot;: 1436,          \&quot;operationsPerYear\&quot;: 34,          \&quot;foundationYear\&quot;: 2012,          \&quot;departmentsCount\&quot;: 20,          \&quot;medicalStaffCount\&quot;: 600,          \&quot;countryId\&quot;: 1,          \&quot;awards\&quot;: [            {              \&quot;name\&quot;: \&quot;Award1\&quot;,              \&quot;image\&quot;: \&quot;string\&quot;,              \&quot;date\&quot;: \&quot;2020-02-05T09:29:19.240Z\&quot;            },            {              \&quot;name\&quot;: \&quot;Award2\&quot;,              \&quot;image\&quot;: \&quot;string\&quot;,              \&quot;date\&quot;: \&quot;2020-02-05T09:29:19.240Z\&quot;            }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/imagecontainer/SamsungMedicalCenter.jpg\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/thumbnailcontainer/SamsungMedicalCenter.jpg\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            },            {              \&quot;mediaType\&quot;: \&quot;Video\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 1            }          ],          \&quot;location\&quot;: {            \&quot;latitude\&quot;: 37.4881568,            \&quot;longitude\&quot;: 127.0855952,            \&quot;country\&quot;: \&quot;Korea\&quot;,            \&quot;state\&quot;: \&quot;string\&quot;,            \&quot;county\&quot;: \&quot;Gangnamgu\&quot;,            \&quot;city\&quot;: \&quot;Seoul\&quot;,            \&quot;zipCode\&quot;: \&quot;12345\&quot;,            \&quot;address\&quot;: \&quot;Il-won ro 81\&quot;          }      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val createHospitalCommand : CreateHospitalCommand =  // CreateHospitalCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1HospitalsPost(createHospitalCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createHospitalCommand** | [**CreateHospitalCommand**](CreateHospitalCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get hospital by slug.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : HospitalViewModel = webService.apiV1HospitalsSlugsSlugGet(slug, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**HospitalViewModel**](HospitalViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

