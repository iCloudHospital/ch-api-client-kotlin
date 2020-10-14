# CHAdminsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ChadminsChAdminIdDelete**](CHAdminsApi.md#apiV1ChadminsChAdminIdDelete) | **DELETE** /api/v1/chadmins/{chAdminId} | Delete cloud hospital admin user.
[**apiV1ChadminsChAdminIdGet**](CHAdminsApi.md#apiV1ChadminsChAdminIdGet) | **GET** /api/v1/chadmins/{chAdminId} | Get cloud hospital admin user by id.
[**apiV1ChadminsChAdminIdPut**](CHAdminsApi.md#apiV1ChadminsChAdminIdPut) | **PUT** /api/v1/chadmins/{chAdminId} | Update cloud hospital admin user.
[**apiV1ChadminsGet**](CHAdminsApi.md#apiV1ChadminsGet) | **GET** /api/v1/chadmins | Get cloud hospital admin users.
[**apiV1ChadminsPost**](CHAdminsApi.md#apiV1ChadminsPost) | **POST** /api/v1/chadmins | Create cloud hospital admin user.


<a name="apiV1ChadminsChAdminIdDelete"></a>
# **apiV1ChadminsChAdminIdDelete**
> kotlin.Boolean apiV1ChadminsChAdminIdDelete(chAdminId)

Delete cloud hospital admin user.

Sample request:        DELETE /api/v1/chadmins/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CHAdminsApi()
val chAdminId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ChadminsChAdminIdDelete(chAdminId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CHAdminsApi#apiV1ChadminsChAdminIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CHAdminsApi#apiV1ChadminsChAdminIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chAdminId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ChadminsChAdminIdGet"></a>
# **apiV1ChadminsChAdminIdGet**
> CHAdminViewModel apiV1ChadminsChAdminIdGet(chAdminId)

Get cloud hospital admin user by id.

Sample request:        GET /api/v1/chadmins/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CHAdminsApi()
val chAdminId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CHAdminViewModel = apiInstance.apiV1ChadminsChAdminIdGet(chAdminId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CHAdminsApi#apiV1ChadminsChAdminIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CHAdminsApi#apiV1ChadminsChAdminIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chAdminId** | [**java.util.UUID**](.md)|  |

### Return type

[**CHAdminViewModel**](CHAdminViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ChadminsChAdminIdPut"></a>
# **apiV1ChadminsChAdminIdPut**
> kotlin.Boolean apiV1ChadminsChAdminIdPut(chAdminId, updateCHAdminCommand)

Update cloud hospital admin user.

Sample request:        PUT /api/v1/chadmins/1      {          \&quot;email\&quot;: \&quot;adminupdate@icloudhospital.com\&quot;,          \&quot;firstName\&quot;: \&quot;Cloud\&quot;,          \&quot;lastName\&quot;: \&quot;Hospital\&quot;,          \&quot;photo\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T09:09:19.082Z\&quot;,          \&quot;locations\&quot;: [              {                  \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,                  \&quot;latitude\&quot;: 0,                  \&quot;longitude\&quot;: 0,                  \&quot;country\&quot;: \&quot;string\&quot;,                  \&quot;state\&quot;: \&quot;string\&quot;,                  \&quot;county\&quot;: \&quot;string\&quot;,                  \&quot;city\&quot;: \&quot;string\&quot;,                  \&quot;zipCode\&quot;: \&quot;string\&quot;,                  \&quot;address\&quot;: \&quot;string\&quot;              }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CHAdminsApi()
val chAdminId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateCHAdminCommand : UpdateCHAdminCommand =  // UpdateCHAdminCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ChadminsChAdminIdPut(chAdminId, updateCHAdminCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CHAdminsApi#apiV1ChadminsChAdminIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CHAdminsApi#apiV1ChadminsChAdminIdPut")
    e.printStackTrace()
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


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ChadminsGet"></a>
# **apiV1ChadminsGet**
> CHAdminsViewModel apiV1ChadminsGet(id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)

Get cloud hospital admin users.

Sample request:        GET /api/v1/chadmin      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;admin\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CHAdminsApi()
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
    val result : CHAdminsViewModel = apiInstance.apiV1ChadminsGet(id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CHAdminsApi#apiV1ChadminsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CHAdminsApi#apiV1ChadminsGet")
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
 **dateOfBirth** | **java.time.OffsetDateTime**|  | [optional]
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**CHAdminsViewModel**](CHAdminsViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ChadminsPost"></a>
# **apiV1ChadminsPost**
> java.util.UUID apiV1ChadminsPost(createCHAdminCommand)

Create cloud hospital admin user.

Sample request:        POST /api/v1/chadmins      {          \&quot;firstName\&quot;: \&quot;Cloud\&quot;,          \&quot;lastName\&quot;: \&quot;Hospital\&quot;,          \&quot;photo\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T09:09:19.082Z\&quot;,          \&quot;locations\&quot;: [              {                  \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,                  \&quot;latitude\&quot;: 0,                  \&quot;longitude\&quot;: 0,                  \&quot;country\&quot;: \&quot;string\&quot;,                  \&quot;state\&quot;: \&quot;string\&quot;,                  \&quot;county\&quot;: \&quot;string\&quot;,                  \&quot;city\&quot;: \&quot;string\&quot;,                  \&quot;zipCode\&quot;: \&quot;string\&quot;,                  \&quot;address\&quot;: \&quot;string\&quot;              }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CHAdminsApi()
val createCHAdminCommand : CreateCHAdminCommand =  // CreateCHAdminCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1ChadminsPost(createCHAdminCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CHAdminsApi#apiV1ChadminsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CHAdminsApi#apiV1ChadminsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCHAdminCommand** | [**CreateCHAdminCommand**](CreateCHAdminCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

