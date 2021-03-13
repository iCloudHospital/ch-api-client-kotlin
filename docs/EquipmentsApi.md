# EquipmentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsEquipmentsGet**](EquipmentsApi.md#apiV1HospitalsEquipmentsGet) | **GET** api/v1/hospitals/equipments | Get all equipments.
[**apiV1HospitalsHospitalIdEquipmentsEquipmentIdDelete**](EquipmentsApi.md#apiV1HospitalsHospitalIdEquipmentsEquipmentIdDelete) | **DELETE** api/v1/hospitals/{hospitalId}/equipments/{equipmentId} | Delete equipment.
[**apiV1HospitalsHospitalIdEquipmentsEquipmentIdGet**](EquipmentsApi.md#apiV1HospitalsHospitalIdEquipmentsEquipmentIdGet) | **GET** api/v1/hospitals/{hospitalId}/equipments/{equipmentId} | Get equipment.
[**apiV1HospitalsHospitalIdEquipmentsEquipmentIdPut**](EquipmentsApi.md#apiV1HospitalsHospitalIdEquipmentsEquipmentIdPut) | **PUT** api/v1/hospitals/{hospitalId}/equipments/{equipmentId} | Update equipment.
[**apiV1HospitalsHospitalIdEquipmentsPost**](EquipmentsApi.md#apiV1HospitalsHospitalIdEquipmentsPost) | **POST** api/v1/hospitals/{hospitalId}/equipments | Create an equipment and add to a hospital.



Get all equipments.

Sample request:        GET /api/v1/hospitals/1/equipments      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;Medical\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(EquipmentsApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : EquipmentsViewModel = webService.apiV1HospitalsEquipmentsGet(id, name, description, hospitalId, hospitalName, created, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**EquipmentsViewModel**](EquipmentsViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete equipment.

Sample request:        DELETE /api/v1/hospitals/1/equipments/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(EquipmentsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val equipmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdEquipmentsEquipmentIdDelete(hospitalId, equipmentId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **equipmentId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get equipment.

Sample request:        GET /api/v1/hospitals/1/equipments/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(EquipmentsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val equipmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : EquipmentViewModel = webService.apiV1HospitalsHospitalIdEquipmentsEquipmentIdGet(hospitalId, equipmentId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **equipmentId** | [**java.util.UUID**](.md)|  |

### Return type

[**EquipmentViewModel**](EquipmentViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update equipment.

Sample request:        PUT /api/v1/hospitals/1/equipments/1      {          \&quot;description\&quot;: \&quot;Upgraded medical equipment\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(EquipmentsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val equipmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateEquipmentCommand : UpdateEquipmentCommand =  // UpdateEquipmentCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdEquipmentsEquipmentIdPut(hospitalId, equipmentId, updateEquipmentCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **equipmentId** | [**java.util.UUID**](.md)|  |
 **updateEquipmentCommand** | [**UpdateEquipmentCommand**](UpdateEquipmentCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Create an equipment and add to a hospital.

Sample request:        POST /api/v1/hospitals/1/equipments      {          \&quot;name\&quot;: \&quot;Afroasia ltd\&quot;,          \&quot;description\&quot;: \&quot;Medical equipment\&quot;,          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: 0,              \&quot;url\&quot;: \&quot;imageurl\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,                      \&quot;order\&quot;: 0            }          ]      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(EquipmentsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createEquipmentCommand : CreateEquipmentCommand =  // CreateEquipmentCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1HospitalsHospitalIdEquipmentsPost(hospitalId, createEquipmentCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **createEquipmentCommand** | [**CreateEquipmentCommand**](CreateEquipmentCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

