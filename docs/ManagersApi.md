# ManagersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ManagersGet**](ManagersApi.md#apiV1ManagersGet) | **GET** /api/v1/managers | Get all hospital managers.
[**apiV1ManagersManagerIdDelete**](ManagersApi.md#apiV1ManagersManagerIdDelete) | **DELETE** /api/v1/managers/{managerId} | Delete hospital manager.
[**apiV1ManagersManagerIdGet**](ManagersApi.md#apiV1ManagersManagerIdGet) | **GET** /api/v1/managers/{managerId} | Get hospital manager.
[**apiV1ManagersManagerIdPut**](ManagersApi.md#apiV1ManagersManagerIdPut) | **PUT** /api/v1/managers/{managerId} | Update hospital manager.
[**apiV1ManagersPost**](ManagersApi.md#apiV1ManagersPost) | **POST** /api/v1/managers | Create hospital manager.


<a name="apiV1ManagersGet"></a>
# **apiV1ManagersGet**
> ManagersViewModel apiV1ManagersGet(id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current, hospitalId)

Get all hospital managers.

Sample request:        GET /api/v1/managers      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;manager\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ManagersApi()
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
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ManagersViewModel = apiInstance.apiV1ManagersGet(id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current, hospitalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagersApi#apiV1ManagersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagersApi#apiV1ManagersGet")
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
 **hospitalId** | [**java.util.UUID**](.md)|  | [optional]

### Return type

[**ManagersViewModel**](ManagersViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ManagersManagerIdDelete"></a>
# **apiV1ManagersManagerIdDelete**
> kotlin.Boolean apiV1ManagersManagerIdDelete(managerId)

Delete hospital manager.

Sample request:        DELETE /api/v1/managers/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ManagersApi()
val managerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ManagersManagerIdDelete(managerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagersApi#apiV1ManagersManagerIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagersApi#apiV1ManagersManagerIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managerId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ManagersManagerIdGet"></a>
# **apiV1ManagersManagerIdGet**
> ManagerViewModel apiV1ManagersManagerIdGet(managerId)

Get hospital manager.

Sample request:        GET /api/v1/managers/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ManagersApi()
val managerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ManagerViewModel = apiInstance.apiV1ManagersManagerIdGet(managerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagersApi#apiV1ManagersManagerIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagersApi#apiV1ManagersManagerIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managerId** | [**java.util.UUID**](.md)|  |

### Return type

[**ManagerViewModel**](ManagerViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ManagersManagerIdPut"></a>
# **apiV1ManagersManagerIdPut**
> kotlin.Boolean apiV1ManagersManagerIdPut(managerId, updateManagerCommand)

Update hospital manager.

Sample request:        PUT /api/v1/managers/1      {          \&quot;firstName\&quot;: \&quot;string\&quot;,          \&quot;lastName\&quot;: \&quot;string\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ManagersApi()
val managerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateManagerCommand : UpdateManagerCommand =  // UpdateManagerCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ManagersManagerIdPut(managerId, updateManagerCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagersApi#apiV1ManagersManagerIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagersApi#apiV1ManagersManagerIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managerId** | [**java.util.UUID**](.md)|  |
 **updateManagerCommand** | [**UpdateManagerCommand**](UpdateManagerCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ManagersPost"></a>
# **apiV1ManagersPost**
> java.util.UUID apiV1ManagersPost(createManagerCommand)

Create hospital manager.

Sample request:        POST /api/v1/managers      {          \&quot;userName\&quot;: \&quot;manager\&quot;,          \&quot;email\&quot;: \&quot;manger@icloudhospital.com\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;firstName\&quot;: \&quot;cloud\&quot;,          \&quot;lastName\&quot;: \&quot;manager\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;string\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T15:28:09.897Z\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ManagersApi()
val createManagerCommand : CreateManagerCommand =  // CreateManagerCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1ManagersPost(createManagerCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagersApi#apiV1ManagersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagersApi#apiV1ManagersPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createManagerCommand** | [**CreateManagerCommand**](CreateManagerCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

