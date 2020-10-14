# DoctorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsDoctorIdDelete**](DoctorsApi.md#apiV1DoctorsDoctorIdDelete) | **DELETE** /api/v1/doctors/{doctorId} | Delete doctor.
[**apiV1DoctorsDoctorIdGet**](DoctorsApi.md#apiV1DoctorsDoctorIdGet) | **GET** /api/v1/doctors/{doctorId} | Get hospital doctor.
[**apiV1DoctorsDoctorIdPut**](DoctorsApi.md#apiV1DoctorsDoctorIdPut) | **PUT** /api/v1/doctors/{doctorId} | Update hospital doctor.
[**apiV1DoctorsGet**](DoctorsApi.md#apiV1DoctorsGet) | **GET** /api/v1/doctors | Get all hospital doctors.
[**apiV1DoctorsPost**](DoctorsApi.md#apiV1DoctorsPost) | **POST** /api/v1/doctors | Create hospital doctor.
[**apiV1DoctorsSlugsSlugGet**](DoctorsApi.md#apiV1DoctorsSlugsSlugGet) | **GET** /api/v1/doctors/slugs/{slug} | Get hospital doctor by slug.


<a name="apiV1DoctorsDoctorIdDelete"></a>
# **apiV1DoctorsDoctorIdDelete**
> kotlin.Boolean apiV1DoctorsDoctorIdDelete(doctorId)

Delete doctor.

Sample request:        DELETE /api/v1/doctors/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorsApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DoctorsDoctorIdDelete(doctorId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorsApi#apiV1DoctorsDoctorIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorsApi#apiV1DoctorsDoctorIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsDoctorIdGet"></a>
# **apiV1DoctorsDoctorIdGet**
> DoctorViewModel apiV1DoctorsDoctorIdGet(doctorId)

Get hospital doctor.

Sample request:        GET /api/v1/doctors/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorsApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DoctorViewModel = apiInstance.apiV1DoctorsDoctorIdGet(doctorId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorsApi#apiV1DoctorsDoctorIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorsApi#apiV1DoctorsDoctorIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |

### Return type

[**DoctorViewModel**](DoctorViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsDoctorIdPut"></a>
# **apiV1DoctorsDoctorIdPut**
> kotlin.Boolean apiV1DoctorsDoctorIdPut(doctorId, updateDoctorCommand)

Update hospital doctor.

Sample request:        PUT /api/v1/doctors/1      {          \&quot;firstName\&quot;: \&quot;string\&quot;,          \&quot;lastName\&quot;: \&quot;string\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorsApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDoctorCommand : UpdateDoctorCommand =  // UpdateDoctorCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DoctorsDoctorIdPut(doctorId, updateDoctorCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorsApi#apiV1DoctorsDoctorIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorsApi#apiV1DoctorsDoctorIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **updateDoctorCommand** | [**UpdateDoctorCommand**](UpdateDoctorCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsGet"></a>
# **apiV1DoctorsGet**
> DoctorsViewModel apiV1DoctorsGet(countryId, hospitalId, marketingType, specialtyId, specialtyTypeId, consultationEnabled, exceptDoctorId, exceptDoctorIds, id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)

Get all hospital doctors.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorsApi()
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingType : MarketingType =  // MarketingType | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val consultationEnabled : kotlin.Boolean = true // kotlin.Boolean | 
val exceptDoctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val exceptDoctorIds : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fullname : kotlin.String = fullname_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val gender : Gender =  // Gender | 
val dateOfBirth : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DoctorsViewModel = apiInstance.apiV1DoctorsGet(countryId, hospitalId, marketingType, specialtyId, specialtyTypeId, consultationEnabled, exceptDoctorId, exceptDoctorIds, id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorsApi#apiV1DoctorsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorsApi#apiV1DoctorsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryId** | [**java.util.UUID**](.md)|  | [optional]
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **specialtyId** | [**java.util.UUID**](.md)|  | [optional]
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **consultationEnabled** | **kotlin.Boolean**|  | [optional]
 **exceptDoctorId** | [**java.util.UUID**](.md)|  | [optional]
 **exceptDoctorIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **fullname** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **gender** | [**Gender**](.md)|  | [optional] [enum: NotSpecified, Male, Female, NonBinary, PreferNotToSay]
 **dateOfBirth** | **java.time.OffsetDateTime**|  | [optional]
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DoctorsViewModel**](DoctorsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsPost"></a>
# **apiV1DoctorsPost**
> java.util.UUID apiV1DoctorsPost(createDoctorCommand)

Create hospital doctor.

Sample request:        POST /api/v1/doctors      {          \&quot;userName\&quot;: \&quot;cloudDoctor\&quot;,          \&quot;email\&quot;: \&quot;doctor@icloudhospital.com\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;firstName\&quot;: \&quot;cloud\&quot;,          \&quot;lastName\&quot;: \&quot;doctor\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;string\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T17:57:32.048Z\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorsApi()
val createDoctorCommand : CreateDoctorCommand =  // CreateDoctorCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1DoctorsPost(createDoctorCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorsApi#apiV1DoctorsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorsApi#apiV1DoctorsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDoctorCommand** | [**CreateDoctorCommand**](CreateDoctorCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsSlugsSlugGet"></a>
# **apiV1DoctorsSlugsSlugGet**
> DoctorViewModel apiV1DoctorsSlugsSlugGet(slug)

Get hospital doctor by slug.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : DoctorViewModel = apiInstance.apiV1DoctorsSlugsSlugGet(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorsApi#apiV1DoctorsSlugsSlugGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorsApi#apiV1DoctorsSlugsSlugGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**DoctorViewModel**](DoctorViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

