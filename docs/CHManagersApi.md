# CHManagersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ChmanagersChManagerIdDelete**](CHManagersApi.md#apiV1ChmanagersChManagerIdDelete) | **DELETE** /api/v1/chmanagers/{chManagerId} | Delete cloud hospital manager.
[**apiV1ChmanagersChManagerIdGet**](CHManagersApi.md#apiV1ChmanagersChManagerIdGet) | **GET** /api/v1/chmanagers/{chManagerId} | Get cloud hospital manager.
[**apiV1ChmanagersChManagerIdPut**](CHManagersApi.md#apiV1ChmanagersChManagerIdPut) | **PUT** /api/v1/chmanagers/{chManagerId} | Update cloud hospital manager.
[**apiV1ChmanagersGet**](CHManagersApi.md#apiV1ChmanagersGet) | **GET** /api/v1/chmanagers | Get cloud hospital managers.
[**apiV1ChmanagersPost**](CHManagersApi.md#apiV1ChmanagersPost) | **POST** /api/v1/chmanagers | Create cloud hospital manager.


<a name="apiV1ChmanagersChManagerIdDelete"></a>
# **apiV1ChmanagersChManagerIdDelete**
> kotlin.Boolean apiV1ChmanagersChManagerIdDelete(chManagerId)

Delete cloud hospital manager.

Smaple request:        DELETE /api/v1/chmanagers/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CHManagersApi()
val chManagerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ChmanagersChManagerIdDelete(chManagerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CHManagersApi#apiV1ChmanagersChManagerIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CHManagersApi#apiV1ChmanagersChManagerIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chManagerId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ChmanagersChManagerIdGet"></a>
# **apiV1ChmanagersChManagerIdGet**
> CHManagerViewModel apiV1ChmanagersChManagerIdGet(managerId, chManagerId)

Get cloud hospital manager.

Sample request:        GET /api/v1/chmanagers/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CHManagersApi()
val managerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val chManagerId : kotlin.String = chManagerId_example // kotlin.String | 
try {
    val result : CHManagerViewModel = apiInstance.apiV1ChmanagersChManagerIdGet(managerId, chManagerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CHManagersApi#apiV1ChmanagersChManagerIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CHManagersApi#apiV1ChmanagersChManagerIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managerId** | [**java.util.UUID**](.md)|  |
 **chManagerId** | **kotlin.String**|  |

### Return type

[**CHManagerViewModel**](CHManagerViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ChmanagersChManagerIdPut"></a>
# **apiV1ChmanagersChManagerIdPut**
> kotlin.Boolean apiV1ChmanagersChManagerIdPut(chManagerId, updateCHManagerCommand)

Update cloud hospital manager.

Sample request:        PUT /api/v1/chmanagers/1      {          \&quot;firstName\&quot;: \&quot;cloud\&quot;,          \&quot;lastName\&quot;: \&quot;manager\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [          {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;              }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CHManagersApi()
val chManagerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateCHManagerCommand : UpdateCHManagerCommand =  // UpdateCHManagerCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1ChmanagersChManagerIdPut(chManagerId, updateCHManagerCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CHManagersApi#apiV1ChmanagersChManagerIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CHManagersApi#apiV1ChmanagersChManagerIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chManagerId** | [**java.util.UUID**](.md)|  |
 **updateCHManagerCommand** | [**UpdateCHManagerCommand**](UpdateCHManagerCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ChmanagersGet"></a>
# **apiV1ChmanagersGet**
> CHManagersViewModel apiV1ChmanagersGet(id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)

Get cloud hospital managers.

Sample request:        GET /api/v1/chmanagers      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;chmanager\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CHManagersApi()
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
    val result : CHManagersViewModel = apiInstance.apiV1ChmanagersGet(id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CHManagersApi#apiV1ChmanagersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CHManagersApi#apiV1ChmanagersGet")
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

[**CHManagersViewModel**](CHManagersViewModel.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ChmanagersPost"></a>
# **apiV1ChmanagersPost**
> java.util.UUID apiV1ChmanagersPost(createCHManagerCommand)

Create cloud hospital manager.

Sample request:        POST /api/v1/chmanagers      {          \&quot;userName\&quot;: \&quot;chmanager\&quot;,          \&quot;email\&quot;: \&quot;chmanger@icloudhospital.com\&quot;,          \&quot;firstName\&quot;: \&quot;cloud\&quot;,          \&quot;lastName\&quot;: \&quot;manager\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;string\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T15:28:09.897Z\&quot;,          \&quot;locations\&quot;: [             {             \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,             \&quot;latitude\&quot;: 0,             \&quot;longitude\&quot;: 0,             \&quot;country\&quot;: \&quot;string\&quot;,             \&quot;state\&quot;: \&quot;string\&quot;,             \&quot;county\&quot;: \&quot;string\&quot;,             \&quot;city\&quot;: \&quot;string\&quot;,             \&quot;zipCode\&quot;: \&quot;string\&quot;,             \&quot;address\&quot;: \&quot;string\&quot;             }          ]       }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CHManagersApi()
val createCHManagerCommand : CreateCHManagerCommand =  // CreateCHManagerCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1ChmanagersPost(createCHManagerCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CHManagersApi#apiV1ChmanagersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CHManagersApi#apiV1ChmanagersPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCHManagerCommand** | [**CreateCHManagerCommand**](CreateCHManagerCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

