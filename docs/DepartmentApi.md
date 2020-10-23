# DepartmentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsDepartmentsGet**](DepartmentApi.md#apiV1HospitalsDepartmentsGet) | **GET** /api/v1/hospitals/departments | Get all department.
[**apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete**](DepartmentApi.md#apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete) | **DELETE** /api/v1/hospitals/{hospitalId}/departments/{departmentId} | Delete department.
[**apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet**](DepartmentApi.md#apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet) | **GET** /api/v1/hospitals/{hospitalId}/departments/{departmentId} | Get department.
[**apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost**](DepartmentApi.md#apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost) | **POST** /api/v1/hospitals/{hospitalId}/departments/{departmentId} | Create department.
[**apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut**](DepartmentApi.md#apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut) | **PUT** /api/v1/hospitals/{hospitalId}/departments/{departmentId} | Update department.


<a name="apiV1HospitalsDepartmentsGet"></a>
# **apiV1HospitalsDepartmentsGet**
> DepartmentsViewModel apiV1HospitalsDepartmentsGet(id, hospitalId, hospitalName, name, additionalInfo, page, limit, lastRetrieved, current)

Get all department.

Sample request:        GET /api/v1/hospitals/departments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DepartmentApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val additionalInfo : kotlin.String = additionalInfo_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DepartmentsViewModel = apiInstance.apiV1HospitalsDepartmentsGet(id, hospitalId, hospitalName, name, additionalInfo, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepartmentApi#apiV1HospitalsDepartmentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepartmentApi#apiV1HospitalsDepartmentsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **additionalInfo** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**DepartmentsViewModel**](DepartmentsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete"></a>
# **apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete**
> kotlin.Boolean apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete(hospitalId, departmentId)

Delete department.

Sample request:        DELETE /api/v1/hospitals/1/departments/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DepartmentApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val departmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete(hospitalId, departmentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepartmentApi#apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepartmentApi#apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **departmentId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet"></a>
# **apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet**
> DepartmentViewModel apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet(hospitalId, departmentId)

Get department.

Sample request:        GET /api/v1/hospitals/1/departments/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DepartmentApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val departmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DepartmentViewModel = apiInstance.apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet(hospitalId, departmentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepartmentApi#apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepartmentApi#apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **departmentId** | [**java.util.UUID**](.md)|  |

### Return type

[**DepartmentViewModel**](DepartmentViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost"></a>
# **apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost**
> Department apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost(hospitalId, departmentId, createDepartmentCommand)

Create department.

Sample request:        POST /api/v1/hospitals/1/departments/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DepartmentApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val departmentId : kotlin.String = departmentId_example // kotlin.String | 
val createDepartmentCommand : CreateDepartmentCommand =  // CreateDepartmentCommand | 
try {
    val result : Department = apiInstance.apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost(hospitalId, departmentId, createDepartmentCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepartmentApi#apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepartmentApi#apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **departmentId** | **kotlin.String**|  |
 **createDepartmentCommand** | [**CreateDepartmentCommand**](CreateDepartmentCommand.md)|  | [optional]

### Return type

[**Department**](Department.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut"></a>
# **apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut**
> kotlin.Boolean apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut(hospitalId, departmentId, updateDepartmentCommand)

Update department.

Sample request:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DepartmentApi()
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val departmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDepartmentCommand : UpdateDepartmentCommand =  // UpdateDepartmentCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut(hospitalId, departmentId, updateDepartmentCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepartmentApi#apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepartmentApi#apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **departmentId** | [**java.util.UUID**](.md)|  |
 **updateDepartmentCommand** | [**UpdateDepartmentCommand**](UpdateDepartmentCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

