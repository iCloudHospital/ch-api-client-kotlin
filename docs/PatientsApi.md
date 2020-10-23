# PatientsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1PatientsGet**](PatientsApi.md#apiV1PatientsGet) | **GET** /api/v1/patients | Get all patients.
[**apiV1PatientsPatientIdDelete**](PatientsApi.md#apiV1PatientsPatientIdDelete) | **DELETE** /api/v1/patients/{patientId} | Delete patient.
[**apiV1PatientsPatientIdGet**](PatientsApi.md#apiV1PatientsPatientIdGet) | **GET** /api/v1/patients/{patientId} | Get patient.
[**apiV1PatientsPatientIdPut**](PatientsApi.md#apiV1PatientsPatientIdPut) | **PUT** /api/v1/patients/{patientId} | Update patient.
[**apiV1PatientsPost**](PatientsApi.md#apiV1PatientsPost) | **POST** /api/v1/patients | Create patient.


<a name="apiV1PatientsGet"></a>
# **apiV1PatientsGet**
> PatientsViewModel apiV1PatientsGet(id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)

Get all patients.

Sample request:        GET /api/v1/patients      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;patient\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PatientsApi()
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
try {
    val result : PatientsViewModel = apiInstance.apiV1PatientsGet(id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PatientsApi#apiV1PatientsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PatientsApi#apiV1PatientsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

[**PatientsViewModel**](PatientsViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1PatientsPatientIdDelete"></a>
# **apiV1PatientsPatientIdDelete**
> kotlin.Boolean apiV1PatientsPatientIdDelete(patientId)

Delete patient.

Sample request:        DELETE /api/v1/patients/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PatientsApi()
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1PatientsPatientIdDelete(patientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PatientsApi#apiV1PatientsPatientIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PatientsApi#apiV1PatientsPatientIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1PatientsPatientIdGet"></a>
# **apiV1PatientsPatientIdGet**
> PatientViewModel apiV1PatientsPatientIdGet(patientId)

Get patient.

Sample request:        GET /api/v1/patients/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PatientsApi()
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PatientViewModel = apiInstance.apiV1PatientsPatientIdGet(patientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PatientsApi#apiV1PatientsPatientIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PatientsApi#apiV1PatientsPatientIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientId** | [**java.util.UUID**](.md)|  |

### Return type

[**PatientViewModel**](PatientViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1PatientsPatientIdPut"></a>
# **apiV1PatientsPatientIdPut**
> kotlin.Boolean apiV1PatientsPatientIdPut(patientId, updatePatientCommand)

Update patient.

Sample request:        PUT /api/v1/patients/1      {          \&quot;referralCode\&quot;: \&quot;string\&quot;,          \&quot;firstName\&quot;: \&quot;patient\&quot;,          \&quot;lastName\&quot;: \&quot;cloud\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PatientsApi()
val patientId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updatePatientCommand : UpdatePatientCommand =  // UpdatePatientCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1PatientsPatientIdPut(patientId, updatePatientCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PatientsApi#apiV1PatientsPatientIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PatientsApi#apiV1PatientsPatientIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientId** | [**java.util.UUID**](.md)|  |
 **updatePatientCommand** | [**UpdatePatientCommand**](UpdatePatientCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1PatientsPost"></a>
# **apiV1PatientsPost**
> java.util.UUID apiV1PatientsPost(createPatientCommand)

Create patient.

Sample request:        POST /api/v1/patients      {          \&quot;referralCode\&quot;: \&quot;123456\&quot;,          \&quot;email\&quot;: \&quot;patient@icloudhospital.com\&quot;,          \&quot;firstName\&quot;: \&quot;patient\&quot;,          \&quot;lastName\&quot;: \&quot;cloud\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PatientsApi()
val createPatientCommand : CreatePatientCommand =  // CreatePatientCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1PatientsPost(createPatientCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PatientsApi#apiV1PatientsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PatientsApi#apiV1PatientsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPatientCommand** | [**CreatePatientCommand**](CreatePatientCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

