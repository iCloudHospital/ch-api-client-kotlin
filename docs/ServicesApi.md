# ServicesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesPost**](ServicesApi.md#apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesPost) | **POST** api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services | Create service.
[**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdDelete**](ServicesApi.md#apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdDelete) | **DELETE** api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId} | Delete service.
[**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdGet**](ServicesApi.md#apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdGet) | **GET** api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId} | Get service.
[**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdPut**](ServicesApi.md#apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdPut) | **PUT** api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId} | Update service.
[**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesquencePut**](ServicesApi.md#apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesquencePut) | **PUT** api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/servicesquence | Update service sequence.
[**apiV1HospitalsServicesGet**](ServicesApi.md#apiV1HospitalsServicesGet) | **GET** api/v1/hospitals/services | Get all services.
[**apiV1HospitalsServicesSlugsSlugGet**](ServicesApi.md#apiV1HospitalsServicesSlugsSlugGet) | **GET** api/v1/hospitals/services/slugs/{slug} | Get service by slug.



Create service.

Sample request:        POST /api/v1/hospitals/1/specialties/1/services      {          \&quot;name\&quot;: \&quot;Heart check up\&quot;,          \&quot;description\&quot;: \&quot;Asan Hospital (Asan Medical Center) is the largest multidisciplinary medical center in South Korea, which can serve 2,700 patients at once.The key specialties in the hospital are organ transplant, oncology, cardiology, and cardiac surgery.Almost half of all heart transplants in South Korea are carried out (45%) at Asan.The success of organ transplants ranges from 90%. Every day, 11,800 outpatients and 2,550 inpatients are treated in Asan Hospital. Medical tourists from the USA, China, the UAE, Russia, Kazakhstan, and Mongolia choose Asan Hospital.\&quot;,          \&quot;minPrice\&quot;: 2235,          \&quot;maxPrice\&quot;: 2566,          \&quot;priceReuqest\&quot;: false,          \&quot;procedure\&quot;: \&quot;Treatment\&quot;      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServicesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createServiceCommand : CreateServiceCommand =  // CreateServiceCommand | 

launch(Dispatchers.IO) {
    val result : java.util.UUID = webService.apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesPost(hospitalId, specialtyId, createServiceCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **createServiceCommand** | [**CreateServiceCommand**](CreateServiceCommand.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Delete service.

Sample request:        DELETE /api/v1/hospitals/1/specialties/1/services/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServicesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdDelete(hospitalId, specialtyId, serviceId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **serviceId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get service.

Sample request:        GET /api/v1/hospitals/1/specialties/1/services/1

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServicesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : ServiceViewModel = webService.apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdGet(hospitalId, specialtyId, serviceId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **serviceId** | [**java.util.UUID**](.md)|  |

### Return type

[**ServiceViewModel**](ServiceViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update service.

Sample request:        PUT /api/v1/hospitals/1/specialties/1/services/1      {          \&quot;name\&quot;: \&quot;Extended analysis of blood\&quot;,          \&quot;description\&quot;: \&quot;Extended analysis of blood description.\&quot;,          \&quot;minPrice\&quot;: 1000,          \&quot;maxPrice\&quot;: 2600,          \&quot;priceReuqest\&quot;: false      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServicesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateServiceCommand : UpdateServiceCommand =  // UpdateServiceCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdPut(hospitalId, specialtyId, serviceId, updateServiceCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **serviceId** | [**java.util.UUID**](.md)|  |
 **updateServiceCommand** | [**UpdateServiceCommand**](UpdateServiceCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Update service sequence.

Smaple request:        PUT /api/v1/hospitals/1/specialties/1/servicesquence      {          \&quot;serviceSequence\&quot;: [1, 3, 5]      }

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServicesApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateServiceSequenceCommand : UpdateServiceSequenceCommand =  // UpdateServiceSequenceCommand | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesquencePut(hospitalId, specialtyId, updateServiceSequenceCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | [**java.util.UUID**](.md)|  |
 **specialtyId** | [**java.util.UUID**](.md)|  |
 **updateServiceSequenceCommand** | [**UpdateServiceSequenceCommand**](UpdateServiceSequenceCommand.md)|  | [optional]

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get all services.

Sample request:        GET /api/v1/hospitals/services

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServicesApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val hospitalSlug : kotlin.String = hospitalSlug_example // kotlin.String | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyTypeName : kotlin.String = specialtyTypeName_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val procedure : Procedure =  // Procedure | 
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val current : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : ServicesViewModel = webService.apiV1HospitalsServicesGet(id, name, description, hospitalId, hospitalName, hospitalSlug, specialtyId, specialtyTypeId, specialtyTypeName, marketingType, procedure, created, page, limit, lastRetrieved, current)
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
 **hospitalSlug** | **kotlin.String**|  | [optional]
 **specialtyId** | [**java.util.UUID**](.md)|  | [optional]
 **specialtyTypeId** | [**java.util.UUID**](.md)|  | [optional]
 **specialtyTypeName** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **procedure** | [**Procedure**](.md)|  | [optional] [enum: Treatment, Diagnostic]
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.OffsetDateTime**|  | [optional]
 **current** | **kotlin.Boolean**|  | [optional]

### Return type

[**ServicesViewModel**](ServicesViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get service by slug.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServicesApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : ServiceViewModel = webService.apiV1HospitalsServicesSlugsSlugGet(slug)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**ServiceViewModel**](ServiceViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

