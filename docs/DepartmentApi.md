# DepartmentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsDepartmentsGet**](DepartmentApi.md#apiV1HospitalsDepartmentsGet) | **GET** api/v1/hospitals/departments | Get all department.
[**apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete**](DepartmentApi.md#apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete) | **DELETE** api/v1/hospitals/{hospitalId}/departments/{departmentId} | Delete department.
[**apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet**](DepartmentApi.md#apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet) | **GET** api/v1/hospitals/{hospitalId}/departments/{departmentId} | Get department.
[**apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost**](DepartmentApi.md#apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost) | **POST** api/v1/hospitals/{hospitalId}/departments/{departmentId} | Create department.
[**apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut**](DepartmentApi.md#apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut) | **PUT** api/v1/hospitals/{hospitalId}/departments/{departmentId} | Update department.



Get all department.

Sample request:        GET /api/v1/hospitals/departments

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DepartmentApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val additionalInfo : kotlin.String = additionalInfo_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DepartmentsViewModel = webService.apiV1HospitalsDepartmentsGet(id, hospitalId, hospitalName, name, additionalInfo, page, limit, lastRetrieved)
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

### Return type

[**DepartmentsViewModel**](DepartmentsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete department.

Sample request:        DELETE /api/v1/hospitals/1/departments/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DepartmentApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val departmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete(hospitalId, departmentId)
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



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get department.

Sample request:        GET /api/v1/hospitals/1/departments/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DepartmentApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val departmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DepartmentViewModel = webService.apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet(hospitalId, departmentId)
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


Create department.

Sample request:        POST /api/v1/hospitals/1/departments/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DepartmentApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val departmentId : kotlin.String = departmentId_example // kotlin.String | 
val createDepartmentCommand : CreateDepartmentCommand =  // CreateDepartmentCommand | 

launch(Dispatchers.IO) {
    val result : Department = webService.apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost(hospitalId, departmentId, createDepartmentCommand)
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



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Update department.

Sample request:

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DepartmentApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val departmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDepartmentCommand : UpdateDepartmentCommand =  // UpdateDepartmentCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut(hospitalId, departmentId, updateDepartmentCommand)
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



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

