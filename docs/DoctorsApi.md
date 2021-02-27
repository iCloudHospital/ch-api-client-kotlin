# DoctorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsDoctorIdDelete**](DoctorsApi.md#apiV1DoctorsDoctorIdDelete) | **DELETE** api/v1/doctors/{doctorId} | Delete doctor.
[**apiV1DoctorsDoctorIdGet**](DoctorsApi.md#apiV1DoctorsDoctorIdGet) | **GET** api/v1/doctors/{doctorId} | Get hospital doctor.
[**apiV1DoctorsDoctorIdPut**](DoctorsApi.md#apiV1DoctorsDoctorIdPut) | **PUT** api/v1/doctors/{doctorId} | Update hospital doctor.
[**apiV1DoctorsGet**](DoctorsApi.md#apiV1DoctorsGet) | **GET** api/v1/doctors | Get all hospital doctors.
[**apiV1DoctorsPost**](DoctorsApi.md#apiV1DoctorsPost) | **POST** api/v1/doctors | Create hospital doctor.
[**apiV1DoctorsSlugsSlugGet**](DoctorsApi.md#apiV1DoctorsSlugsSlugGet) | **GET** api/v1/doctors/slugs/{slug} | Get hospital doctor by slug.



Delete doctor.

Sample request:        DELETE /api/v1/doctors/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorsDoctorIdDelete(doctorId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get hospital doctor.

Sample request:        GET /api/v1/doctors/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorViewModel = webService.apiV1DoctorsDoctorIdGet(doctorId)
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


Update hospital doctor.

Sample request:        PUT /api/v1/doctors/1      {          \&quot;firstName\&quot;: \&quot;string\&quot;,          \&quot;lastName\&quot;: \&quot;string\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDoctorCommand : UpdateDoctorCommand =  // UpdateDoctorCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorsDoctorIdPut(doctorId, updateDoctorCommand)
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



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all hospital doctors.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
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
val dateOfBirth : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DoctorsViewModel = webService.apiV1DoctorsGet(countryId, hospitalId, marketingType, specialtyId, specialtyTypeId, consultationEnabled, exceptDoctorId, exceptDoctorIds, id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)
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
 **dateOfBirth** | **java.time.LocalDateTime**|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DoctorsViewModel**](DoctorsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create hospital doctor.

Sample request:        POST /api/v1/doctors      {          \&quot;userName\&quot;: \&quot;cloudDoctor\&quot;,          \&quot;email\&quot;: \&quot;doctor@icloudhospital.com\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;firstName\&quot;: \&quot;cloud\&quot;,          \&quot;lastName\&quot;: \&quot;doctor\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;string\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T17:57:32.048Z\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val createDoctorCommand : CreateDoctorCommand =  // CreateDoctorCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1DoctorsPost(createDoctorCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDoctorCommand** | [**CreateDoctorCommand**](CreateDoctorCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get hospital doctor by slug.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : DoctorViewModel = webService.apiV1DoctorsSlugsSlugGet(slug)
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

