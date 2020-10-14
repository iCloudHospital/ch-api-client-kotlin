# PartnersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1PartnersGet**](PartnersApi.md#apiV1PartnersGet) | **GET** /api/v1/partners | Get all partners.
[**apiV1PartnersPartnerIdDelete**](PartnersApi.md#apiV1PartnersPartnerIdDelete) | **DELETE** /api/v1/partners/{partnerId} | Delete patner.
[**apiV1PartnersPartnerIdGet**](PartnersApi.md#apiV1PartnersPartnerIdGet) | **GET** /api/v1/partners/{partnerId} | Get partner.
[**apiV1PartnersPartnerIdPut**](PartnersApi.md#apiV1PartnersPartnerIdPut) | **PUT** /api/v1/partners/{partnerId} | Update partner.
[**apiV1PartnersPost**](PartnersApi.md#apiV1PartnersPost) | **POST** /api/v1/partners | Create partner.


<a name="apiV1PartnersGet"></a>
# **apiV1PartnersGet**
> PartnersViewModel apiV1PartnersGet(id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)

Get all partners.

Sample request:        GET /api/v1/partners      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;patner\&quot;      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PartnersApi()
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
    val result : PartnersViewModel = apiInstance.apiV1PartnersGet(id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PartnersApi#apiV1PartnersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PartnersApi#apiV1PartnersGet")
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

[**PartnersViewModel**](PartnersViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1PartnersPartnerIdDelete"></a>
# **apiV1PartnersPartnerIdDelete**
> kotlin.Boolean apiV1PartnersPartnerIdDelete(partnerId)

Delete patner.

Sample request:        DELETE /api/v1/partners/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PartnersApi()
val partnerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1PartnersPartnerIdDelete(partnerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PartnersApi#apiV1PartnersPartnerIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PartnersApi#apiV1PartnersPartnerIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1PartnersPartnerIdGet"></a>
# **apiV1PartnersPartnerIdGet**
> PartnerViewModel apiV1PartnersPartnerIdGet(partnerId)

Get partner.

Sample request:        GET /api/v1/patners/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PartnersApi()
val partnerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PartnerViewModel = apiInstance.apiV1PartnersPartnerIdGet(partnerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PartnersApi#apiV1PartnersPartnerIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PartnersApi#apiV1PartnersPartnerIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | [**java.util.UUID**](.md)|  |

### Return type

[**PartnerViewModel**](PartnerViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1PartnersPartnerIdPut"></a>
# **apiV1PartnersPartnerIdPut**
> kotlin.Boolean apiV1PartnersPartnerIdPut(partnerId, updatePartnerCommand)

Update partner.

Sample request:        PUT /api/v1/patners/1      {          firstName\&quot;: \&quot;string\&quot;,          \&quot;lastName\&quot;: \&quot;string\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PartnersApi()
val partnerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updatePartnerCommand : UpdatePartnerCommand =  // UpdatePartnerCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1PartnersPartnerIdPut(partnerId, updatePartnerCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PartnersApi#apiV1PartnersPartnerIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PartnersApi#apiV1PartnersPartnerIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | [**java.util.UUID**](.md)|  |
 **updatePartnerCommand** | [**UpdatePartnerCommand**](UpdatePartnerCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1PartnersPost"></a>
# **apiV1PartnersPost**
> java.util.UUID apiV1PartnersPost(createPartnerCommand)

Create partner.

Sample request:        POST /api/v1/partners      {          \&quot;userName\&quot;: \&quot;string\&quot;,          \&quot;email\&quot;: \&quot;string\&quot;,          \&quot;firstName\&quot;: \&quot;string\&quot;,          \&quot;lastName\&quot;: \&quot;string\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;string\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T18:04:18.025Z\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PartnersApi()
val createPartnerCommand : CreatePartnerCommand =  // CreatePartnerCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1PartnersPost(createPartnerCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PartnersApi#apiV1PartnersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PartnersApi#apiV1PartnersPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPartnerCommand** | [**CreatePartnerCommand**](CreatePartnerCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

