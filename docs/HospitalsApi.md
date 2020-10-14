# HospitalsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsCurrentGet**](HospitalsApi.md#apiV1HospitalsCurrentGet) | **GET** /api/v1/hospitals/current | 
[**apiV1HospitalsGet**](HospitalsApi.md#apiV1HospitalsGet) | **GET** /api/v1/hospitals | Get all hospitals.
[**apiV1HospitalsHospitalIdDelete**](HospitalsApi.md#apiV1HospitalsHospitalIdDelete) | **DELETE** /api/v1/hospitals/{hospitalId} | Delete hospital.
[**apiV1HospitalsHospitalIdGet**](HospitalsApi.md#apiV1HospitalsHospitalIdGet) | **GET** /api/v1/hospitals/{hospitalId} | Get hospita.
[**apiV1HospitalsHospitalIdPut**](HospitalsApi.md#apiV1HospitalsHospitalIdPut) | **PUT** /api/v1/hospitals/{hospitalId} | Update hospital.
[**apiV1HospitalsPost**](HospitalsApi.md#apiV1HospitalsPost) | **POST** /api/v1/hospitals | Create a hospital.
[**apiV1HospitalsSlugsSlugGet**](HospitalsApi.md#apiV1HospitalsSlugsSlugGet) | **GET** /api/v1/hospitals/slugs/{slug} | Get hospital by slug.


<a name="apiV1HospitalsCurrentGet"></a>
# **apiV1HospitalsCurrentGet**
> HospitalsViewModel apiV1HospitalsCurrentGet(id, name, description, countryId, created, marketingType, specialtyTypeId, specialtyId, serviceId, exceptHospitalId, showHidden, page, limit, lastRetrieved, current)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val marketingType : MarketingType =  // MarketingType | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val exceptHospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : HospitalsViewModel = apiInstance.apiV1HospitalsCurrentGet(id, name, description, countryId, created, marketingType, specialtyTypeId, specialtyId, serviceId, exceptHospitalId, showHidden, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalsApi#apiV1HospitalsCurrentGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalsApi#apiV1HospitalsCurrentGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **countryId** | [**java.util.UUID**](.md)|  | [optional]
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **specialtyId** | [**java.util.UUID**](.md)|  | [optional]
 **serviceId** | [**java.util.UUID**](.md)|  | [optional]
 **exceptHospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalsViewModel**](HospitalsViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsGet"></a>
# **apiV1HospitalsGet**
> HospitalsViewModel apiV1HospitalsGet(id, name, description, countryId, created, marketingType, specialtyTypeId, specialtyId, serviceId, exceptHospitalId, showHidden, page, limit, lastRetrieved, current)

Get all hospitals.

Sample request:        GET /api/v1/hospitals      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;Samsung\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val marketingType : MarketingType =  // MarketingType | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val exceptHospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : HospitalsViewModel = apiInstance.apiV1HospitalsGet(id, name, description, countryId, created, marketingType, specialtyTypeId, specialtyId, serviceId, exceptHospitalId, showHidden, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalsApi#apiV1HospitalsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalsApi#apiV1HospitalsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **countryId** | [**java.util.UUID**](.md)|  | [optional]
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **specialtyId** | [**java.util.UUID**](.md)|  | [optional]
 **serviceId** | [**java.util.UUID**](.md)|  | [optional]
 **exceptHospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalsViewModel**](HospitalsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdDelete"></a>
# **apiV1HospitalsHospitalIdDelete**
> kotlin.Boolean apiV1HospitalsHospitalIdDelete(hospitalId)

Delete hospital.

Sample request:        DELETE /api/v1/hospitals/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalsApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1HospitalsHospitalIdDelete(hospitalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalsApi#apiV1HospitalsHospitalIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalsApi#apiV1HospitalsHospitalIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdGet"></a>
# **apiV1HospitalsHospitalIdGet**
> HospitalViewModel apiV1HospitalsHospitalIdGet(hospitalId)

Get hospita.

Sample request:        GET /api/v1/hospitals/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalsApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : HospitalViewModel = apiInstance.apiV1HospitalsHospitalIdGet(hospitalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalsApi#apiV1HospitalsHospitalIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalsApi#apiV1HospitalsHospitalIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |

### Return type

[**HospitalViewModel**](HospitalViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdPut"></a>
# **apiV1HospitalsHospitalIdPut**
> kotlin.Boolean apiV1HospitalsHospitalIdPut(hospitalId, updateHospitalCommand)

Update hospital.

Sameple request:        PUT /api/v1/hospitals      {          \&quot;overview\&quot;: \&quot;Overview of Samsung Medical Center\&quot;,          \&quot;bedsCount\&quot;: 2436,          \&quot;operationsPerYear\&quot;: 44,          \&quot;foundationYear\&quot;: 2012,          \&quot;departmentsCount\&quot;: 200,          \&quot;medicalStaffCount\&quot;: 1200,      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalsApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateHospitalCommand : UpdateHospitalCommand =  // UpdateHospitalCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1HospitalsHospitalIdPut(hospitalId, updateHospitalCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalsApi#apiV1HospitalsHospitalIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalsApi#apiV1HospitalsHospitalIdPut")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsPost"></a>
# **apiV1HospitalsPost**
> java.util.UUID apiV1HospitalsPost(createHospitalCommand)

Create a hospital.

Sample request:        POST /api/v1/hospitals      {          \&quot;name\&quot;: \&quot;Samsung Medical Center\&quot;,          \&quot;description\&quot;: \&quot;Comprehensive Cancer Center in Seoul, South Korea is nationally ranked in 1 adult specialty.\&quot;,          \&quot;logo\&quot;: \&quot;http://www.samsunghospital.com/home/main/index.do\&quot;,          \&quot;overview\&quot;: \&quot;Overview of Samsung Medical Center\&quot;,          \&quot;bedsCount\&quot;: 1436,          \&quot;operationsPerYear\&quot;: 34,          \&quot;foundationYear\&quot;: 2012,          \&quot;departmentsCount\&quot;: 20,          \&quot;medicalStaffCount\&quot;: 600,          \&quot;countryId\&quot;: 1,          \&quot;awards\&quot;: [            {              \&quot;name\&quot;: \&quot;Award1\&quot;,              \&quot;image\&quot;: \&quot;string\&quot;,              \&quot;date\&quot;: \&quot;2020-02-05T09:29:19.240Z\&quot;            },            {              \&quot;name\&quot;: \&quot;Award2\&quot;,              \&quot;image\&quot;: \&quot;string\&quot;,              \&quot;date\&quot;: \&quot;2020-02-05T09:29:19.240Z\&quot;            }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/imagecontainer/SamsungMedicalCenter.jpg\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/thumbnailcontainer/SamsungMedicalCenter.jpg\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            },            {              \&quot;mediaType\&quot;: \&quot;Video\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 1            }          ],          \&quot;location\&quot;: {            \&quot;latitude\&quot;: 37.4881568,            \&quot;longitude\&quot;: 127.0855952,            \&quot;country\&quot;: \&quot;Korea\&quot;,            \&quot;state\&quot;: \&quot;string\&quot;,            \&quot;county\&quot;: \&quot;Gangnamgu\&quot;,            \&quot;city\&quot;: \&quot;Seoul\&quot;,            \&quot;zipCode\&quot;: \&quot;12345\&quot;,            \&quot;address\&quot;: \&quot;Il-won ro 81\&quot;          }      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalsApi()
val createHospitalCommand : CreateHospitalCommand =  // CreateHospitalCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1HospitalsPost(createHospitalCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalsApi#apiV1HospitalsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalsApi#apiV1HospitalsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createHospitalCommand** | [**CreateHospitalCommand**](CreateHospitalCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsSlugsSlugGet"></a>
# **apiV1HospitalsSlugsSlugGet**
> HospitalViewModel apiV1HospitalsSlugsSlugGet(slug)

Get hospital by slug.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = HospitalsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : HospitalViewModel = apiInstance.apiV1HospitalsSlugsSlugGet(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HospitalsApi#apiV1HospitalsSlugsSlugGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HospitalsApi#apiV1HospitalsSlugsSlugGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**HospitalViewModel**](HospitalViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

