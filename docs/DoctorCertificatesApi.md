# DoctorCertificatesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsCertificatesGet**](DoctorCertificatesApi.md#apiV1DoctorsCertificatesGet) | **GET** /api/v1/doctors/certificates | Get all certificates.
[**apiV1DoctorsDoctorIdCertificatesCertificateIdDelete**](DoctorCertificatesApi.md#apiV1DoctorsDoctorIdCertificatesCertificateIdDelete) | **DELETE** /api/v1/doctors/{doctorId}/certificates/{certificateId} | Delete certificate.
[**apiV1DoctorsDoctorIdCertificatesCertificateIdGet**](DoctorCertificatesApi.md#apiV1DoctorsDoctorIdCertificatesCertificateIdGet) | **GET** /api/v1/doctors/{doctorId}/certificates/{certificateId} | Get certificate.
[**apiV1DoctorsDoctorIdCertificatesCertificateIdPut**](DoctorCertificatesApi.md#apiV1DoctorsDoctorIdCertificatesCertificateIdPut) | **PUT** /api/v1/doctors/{doctorId}/certificates/{certificateId} | Update department.
[**apiV1DoctorsDoctorIdCertificatesPost**](DoctorCertificatesApi.md#apiV1DoctorsDoctorIdCertificatesPost) | **POST** /api/v1/doctors/{doctorId}/certificates | Create certificate.


<a name="apiV1DoctorsCertificatesGet"></a>
# **apiV1DoctorsCertificatesGet**
> DoctorCertificatesViewModel apiV1DoctorsCertificatesGet(id, doctorId, doctorName, certificate, activeFrom, activeTo, page, limit, lastRetrieved, current)

Get all certificates.

Sample request:        GET /api/v1/doctors/certificates

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorCertificatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val certificate : kotlin.String = certificate_example // kotlin.String | 
val activeFrom : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val activeTo : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DoctorCertificatesViewModel = apiInstance.apiV1DoctorsCertificatesGet(id, doctorId, doctorName, certificate, activeFrom, activeTo, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorCertificatesApi#apiV1DoctorsCertificatesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorCertificatesApi#apiV1DoctorsCertificatesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **doctorId** | [**java.util.UUID**](.md)|  | [optional]
 **doctorName** | **kotlin.String**|  | [optional]
 **certificate** | **kotlin.String**|  | [optional]
 **activeFrom** | **java.time.OffsetDateTime**|  | [optional]
 **activeTo** | **java.time.OffsetDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DoctorCertificatesViewModel**](DoctorCertificatesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsDoctorIdCertificatesCertificateIdDelete"></a>
# **apiV1DoctorsDoctorIdCertificatesCertificateIdDelete**
> kotlin.Boolean apiV1DoctorsDoctorIdCertificatesCertificateIdDelete(doctorId, certificateId)

Delete certificate.

Sample request:        DELETE /api/v1/doctors/1/certificates/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorCertificatesApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val certificateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DoctorsDoctorIdCertificatesCertificateIdDelete(doctorId, certificateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorCertificatesApi#apiV1DoctorsDoctorIdCertificatesCertificateIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorCertificatesApi#apiV1DoctorsDoctorIdCertificatesCertificateIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **certificateId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsDoctorIdCertificatesCertificateIdGet"></a>
# **apiV1DoctorsDoctorIdCertificatesCertificateIdGet**
> DoctorCertificateViewModel apiV1DoctorsDoctorIdCertificatesCertificateIdGet(doctorId, certificateId)

Get certificate.

Sample request:        GET /api/v1/doctors/1/certificates/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorCertificatesApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val certificateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DoctorCertificateViewModel = apiInstance.apiV1DoctorsDoctorIdCertificatesCertificateIdGet(doctorId, certificateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorCertificatesApi#apiV1DoctorsDoctorIdCertificatesCertificateIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorCertificatesApi#apiV1DoctorsDoctorIdCertificatesCertificateIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **certificateId** | [**java.util.UUID**](.md)|  |

### Return type

[**DoctorCertificateViewModel**](DoctorCertificateViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsDoctorIdCertificatesCertificateIdPut"></a>
# **apiV1DoctorsDoctorIdCertificatesCertificateIdPut**
> kotlin.Boolean apiV1DoctorsDoctorIdCertificatesCertificateIdPut(doctorId, certificateId, updateDoctorCertificateCommand)

Update department.

Sample request:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorCertificatesApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val certificateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDoctorCertificateCommand : UpdateDoctorCertificateCommand =  // UpdateDoctorCertificateCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1DoctorsDoctorIdCertificatesCertificateIdPut(doctorId, certificateId, updateDoctorCertificateCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorCertificatesApi#apiV1DoctorsDoctorIdCertificatesCertificateIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorCertificatesApi#apiV1DoctorsDoctorIdCertificatesCertificateIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **certificateId** | [**java.util.UUID**](.md)|  |
 **updateDoctorCertificateCommand** | [**UpdateDoctorCertificateCommand**](UpdateDoctorCertificateCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1DoctorsDoctorIdCertificatesPost"></a>
# **apiV1DoctorsDoctorIdCertificatesPost**
> DoctorCertificate apiV1DoctorsDoctorIdCertificatesPost(doctorId, createDoctorCertificateCommand)

Create certificate.

Sample request:        POST /api/v1/doctors/1/certificates/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DoctorCertificatesApi()
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDoctorCertificateCommand : CreateDoctorCertificateCommand =  // CreateDoctorCertificateCommand | 
try {
    val result : DoctorCertificate = apiInstance.apiV1DoctorsDoctorIdCertificatesPost(doctorId, createDoctorCertificateCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DoctorCertificatesApi#apiV1DoctorsDoctorIdCertificatesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DoctorCertificatesApi#apiV1DoctorsDoctorIdCertificatesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **createDoctorCertificateCommand** | [**CreateDoctorCertificateCommand**](CreateDoctorCertificateCommand.md)|  | [optional]

### Return type

[**DoctorCertificate**](DoctorCertificate.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

