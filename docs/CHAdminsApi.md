# CHAdminsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ChadminsChAdminIdDelete**](CHAdminsApi.md#apiV1ChadminsChAdminIdDelete) | **DELETE** api/v1/chadmins/{chAdminId} | Delete cloud hospital admin user.
[**apiV1ChadminsChAdminIdGet**](CHAdminsApi.md#apiV1ChadminsChAdminIdGet) | **GET** api/v1/chadmins/{chAdminId} | Get cloud hospital admin user by id.
[**apiV1ChadminsChAdminIdPut**](CHAdminsApi.md#apiV1ChadminsChAdminIdPut) | **PUT** api/v1/chadmins/{chAdminId} | Update cloud hospital admin user.
[**apiV1ChadminsGet**](CHAdminsApi.md#apiV1ChadminsGet) | **GET** api/v1/chadmins | Get cloud hospital admin users.
[**apiV1ChadminsPost**](CHAdminsApi.md#apiV1ChadminsPost) | **POST** api/v1/chadmins | Create cloud hospital admin user.



Delete cloud hospital admin user.

Sample request:        DELETE /api/v1/chadmins/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CHAdminsApi::class.java)
val chAdminId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ChadminsChAdminIdDelete(chAdminId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chAdminId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get cloud hospital admin user by id.

Sample request:        GET /api/v1/chadmins/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CHAdminsApi::class.java)
val chAdminId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : CHAdminViewModel = webService.apiV1ChadminsChAdminIdGet(chAdminId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chAdminId** | [**java.util.UUID**](.md)|  |

### Return type

[**CHAdminViewModel**](CHAdminViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update cloud hospital admin user.

Sample request:        PUT /api/v1/chadmins/1      {          \&quot;email\&quot;: \&quot;adminupdate@icloudhospital.com\&quot;,          \&quot;firstName\&quot;: \&quot;Cloud\&quot;,          \&quot;lastName\&quot;: \&quot;Hospital\&quot;,          \&quot;photo\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T09:09:19.082Z\&quot;,          \&quot;locations\&quot;: [              {                  \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,                  \&quot;latitude\&quot;: 0,                  \&quot;longitude\&quot;: 0,                  \&quot;country\&quot;: \&quot;string\&quot;,                  \&quot;state\&quot;: \&quot;string\&quot;,                  \&quot;county\&quot;: \&quot;string\&quot;,                  \&quot;city\&quot;: \&quot;string\&quot;,                  \&quot;zipCode\&quot;: \&quot;string\&quot;,                  \&quot;address\&quot;: \&quot;string\&quot;              }          ]      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CHAdminsApi::class.java)
val chAdminId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateCHAdminCommand : UpdateCHAdminCommand =  // UpdateCHAdminCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1ChadminsChAdminIdPut(chAdminId, updateCHAdminCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chAdminId** | [**java.util.UUID**](.md)|  |
 **updateCHAdminCommand** | [**UpdateCHAdminCommand**](UpdateCHAdminCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get cloud hospital admin users.

Sample request:        GET /api/v1/chadmin      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;admin\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CHAdminsApi::class.java)
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
    val result : CHAdminsViewModel = webService.apiV1ChadminsGet(id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)
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

[**CHAdminsViewModel**](CHAdminsViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create cloud hospital admin user.

Sample request:        POST /api/v1/chadmins      {          \&quot;firstName\&quot;: \&quot;Cloud\&quot;,          \&quot;lastName\&quot;: \&quot;Hospital\&quot;,          \&quot;photo\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T09:09:19.082Z\&quot;,          \&quot;locations\&quot;: [              {                  \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,                  \&quot;latitude\&quot;: 0,                  \&quot;longitude\&quot;: 0,                  \&quot;country\&quot;: \&quot;string\&quot;,                  \&quot;state\&quot;: \&quot;string\&quot;,                  \&quot;county\&quot;: \&quot;string\&quot;,                  \&quot;city\&quot;: \&quot;string\&quot;,                  \&quot;zipCode\&quot;: \&quot;string\&quot;,                  \&quot;address\&quot;: \&quot;string\&quot;              }          ]      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CHAdminsApi::class.java)
val createCHAdminCommand : CreateCHAdminCommand =  // CreateCHAdminCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1ChadminsPost(createCHAdminCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCHAdminCommand** | [**CreateCHAdminCommand**](CreateCHAdminCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

