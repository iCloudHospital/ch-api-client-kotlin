# YoutubesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1YoutubesGet**](YoutubesApi.md#apiV1YoutubesGet) | **GET** /api/v1/youtubes | Get all youtubes.
[**apiV1YoutubesPost**](YoutubesApi.md#apiV1YoutubesPost) | **POST** /api/v1/youtubes | Create an youtube.
[**apiV1YoutubesSlugsSlugGet**](YoutubesApi.md#apiV1YoutubesSlugsSlugGet) | **GET** /api/v1/youtubes/slugs/{slug} | Get youtube by slug.
[**apiV1YoutubesYoutubeIdDelete**](YoutubesApi.md#apiV1YoutubesYoutubeIdDelete) | **DELETE** /api/v1/youtubes/{youtubeId} | Delete youtube.
[**apiV1YoutubesYoutubeIdGet**](YoutubesApi.md#apiV1YoutubesYoutubeIdGet) | **GET** /api/v1/youtubes/{youtubeId} | Get youtube.
[**apiV1YoutubesYoutubeIdPut**](YoutubesApi.md#apiV1YoutubesYoutubeIdPut) | **PUT** /api/v1/youtubes/{youtubeId} | Update youtube.


<a name="apiV1YoutubesGet"></a>
# **apiV1YoutubesGet**
> YoutubesViewModel apiV1YoutubesGet(id, title, normalizedTitle, description, marketingType, tag, page, limit, lastRetrieved, current)

Get all youtubes.

Sample request:        GET /api/v1/youtubes

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = YoutubesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val title : kotlin.String = title_example // kotlin.String | 
val normalizedTitle : kotlin.String = normalizedTitle_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val tag : kotlin.String = tag_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : YoutubesViewModel = apiInstance.apiV1YoutubesGet(id, title, normalizedTitle, description, marketingType, tag, page, limit, lastRetrieved, current)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YoutubesApi#apiV1YoutubesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YoutubesApi#apiV1YoutubesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **title** | **kotlin.String**|  | [optional]
 **normalizedTitle** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **tag** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**YoutubesViewModel**](YoutubesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1YoutubesPost"></a>
# **apiV1YoutubesPost**
> java.util.UUID apiV1YoutubesPost(createYoutubeCommand)

Create an youtube.

Sample request:        POST /api/v1/youtubes      {          \&quot;title\&quot;: \&quot;Samsung Hospital Youtube\&quot;,          \&quot;description\&quot;: \&quot;This is an youtube.\&quot;,          \&quot;body\&quot;: \&quot;youtube body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;tags\&quot;: [            {              \&quot;value\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0              }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = YoutubesApi()
val createYoutubeCommand : CreateYoutubeCommand =  // CreateYoutubeCommand | 
try {
    val result : java.util.UUID = apiInstance.apiV1YoutubesPost(createYoutubeCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YoutubesApi#apiV1YoutubesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YoutubesApi#apiV1YoutubesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createYoutubeCommand** | [**CreateYoutubeCommand**](CreateYoutubeCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1YoutubesSlugsSlugGet"></a>
# **apiV1YoutubesSlugsSlugGet**
> YoutubeViewModel apiV1YoutubesSlugsSlugGet(slug)

Get youtube by slug.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = YoutubesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : YoutubeViewModel = apiInstance.apiV1YoutubesSlugsSlugGet(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YoutubesApi#apiV1YoutubesSlugsSlugGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YoutubesApi#apiV1YoutubesSlugsSlugGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**YoutubeViewModel**](YoutubeViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1YoutubesYoutubeIdDelete"></a>
# **apiV1YoutubesYoutubeIdDelete**
> kotlin.Boolean apiV1YoutubesYoutubeIdDelete(youtubeId)

Delete youtube.

Sample request:        DELETE /api/v1/youtubes/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = YoutubesApi()
val youtubeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1YoutubesYoutubeIdDelete(youtubeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YoutubesApi#apiV1YoutubesYoutubeIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YoutubesApi#apiV1YoutubesYoutubeIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **youtubeId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1YoutubesYoutubeIdGet"></a>
# **apiV1YoutubesYoutubeIdGet**
> YoutubeViewModel apiV1YoutubesYoutubeIdGet(youtubeId)

Get youtube.

Sample request:        GET /api/v1/youtubes/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = YoutubesApi()
val youtubeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : YoutubeViewModel = apiInstance.apiV1YoutubesYoutubeIdGet(youtubeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YoutubesApi#apiV1YoutubesYoutubeIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YoutubesApi#apiV1YoutubesYoutubeIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **youtubeId** | [**java.util.UUID**](.md)|  |

### Return type

[**YoutubeViewModel**](YoutubeViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1YoutubesYoutubeIdPut"></a>
# **apiV1YoutubesYoutubeIdPut**
> kotlin.Boolean apiV1YoutubesYoutubeIdPut(youtubeId, updateYoutubeCommand)

Update youtube.

Sample request:        PUT /api/v1/youtubes/1      {          \&quot;title\&quot;: \&quot;Samsung Hospital Youtube\&quot;,          \&quot;description\&quot;: \&quot;This is an youtube.\&quot;,                  \&quot;tags\&quot;: [            {              \&quot;value\&quot;: \&quot;youtubetag1\&quot;,              \&quot;order\&quot;: 0            },            {              \&quot;value\&quot;: \&quot;youtubetag2\&quot;,              \&quot;order\&quot;: 0            }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = YoutubesApi()
val youtubeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateYoutubeCommand : UpdateYoutubeCommand =  // UpdateYoutubeCommand | 
try {
    val result : kotlin.Boolean = apiInstance.apiV1YoutubesYoutubeIdPut(youtubeId, updateYoutubeCommand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YoutubesApi#apiV1YoutubesYoutubeIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YoutubesApi#apiV1YoutubesYoutubeIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **youtubeId** | [**java.util.UUID**](.md)|  |
 **updateYoutubeCommand** | [**UpdateYoutubeCommand**](UpdateYoutubeCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

