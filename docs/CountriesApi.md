# CountriesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1CountriesCountryIdDelete**](CountriesApi.md#apiV1CountriesCountryIdDelete) | **DELETE** api/v1/countries/{countryId} | Delete country.
[**apiV1CountriesCountryIdGet**](CountriesApi.md#apiV1CountriesCountryIdGet) | **GET** api/v1/countries/{countryId} | Get country.
[**apiV1CountriesCountryIdPut**](CountriesApi.md#apiV1CountriesCountryIdPut) | **PUT** api/v1/countries/{countryId} | Update country.
[**apiV1CountriesGet**](CountriesApi.md#apiV1CountriesGet) | **GET** api/v1/countries | Get all countries.
[**apiV1CountriesPost**](CountriesApi.md#apiV1CountriesPost) | **POST** api/v1/countries | Create a country.
[**apiV1CountriesSlugsSlugGet**](CountriesApi.md#apiV1CountriesSlugsSlugGet) | **GET** api/v1/countries/slugs/{slug} | Get country by slug.



Delete country.

Sample request:        DELETE /api/v1/countries/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CountriesApi::class.java)
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1CountriesCountryIdDelete(countryId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get country.

Sample request:        GET /api/v1/countries/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CountriesApi::class.java)
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : CountryViewModel = webService.apiV1CountriesCountryIdGet(countryId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryId** | [**java.util.UUID**](.md)|  |

### Return type

[**CountryViewModel**](CountryViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update country.

Sample request:        PUT /api/v1/countries/1      {          \&quot;name\&quot;: \&quot;USA\&quot;,          \&quot;description\&quot;: \&quot;United States of America\&quot;          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: 0,              \&quot;url\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/imagecontainer/SouthKorea.png\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/thumbnailcontainer/SouthKorea.png\&quot;              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            },            {              \&quot;mediaType\&quot;: 1,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 1            }          ],      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CountriesApi::class.java)
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateCountryCommand : UpdateCountryCommand =  // UpdateCountryCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1CountriesCountryIdPut(countryId, updateCountryCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryId** | [**java.util.UUID**](.md)|  |
 **updateCountryCommand** | [**UpdateCountryCommand**](UpdateCountryCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all countries.

Sample request:        GET /api/v1/countries      {          \&quot;countryPageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          }      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CountriesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val createdDate : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : CountriesViewModel = webService.apiV1CountriesGet(id, name, description, createdDate, page, limit, lastRetrieved, current)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **createdDate** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**CountriesViewModel**](CountriesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create a country.

Sample request:        POST /api/v1/countries      {          \&quot;name\&quot;: \&quot;Korea\&quot;,          \&quot;description\&quot;: \&quot;Republic of Korea\&quot;,          \&quot;medias\&quot;: [              {                  \&quot;mediaType\&quot;: \&quot;Photo\&quot;,                  \&quot;url\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/imagecontainer/SouthKorea.png\&quot;,                  \&quot;thumbnailUrl\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/thumbnailcontainer/SouthKorea.png\&quot;,                  \&quot;description\&quot;: \&quot;string\&quot;              }          ]      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CountriesApi::class.java)
val createCountryCommand : CreateCountryCommand =  // CreateCountryCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1CountriesPost(createCountryCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCountryCommand** | [**CreateCountryCommand**](CreateCountryCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get country by slug.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CountriesApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : CountryViewModel = webService.apiV1CountriesSlugsSlugGet(slug)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**CountryViewModel**](CountryViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

