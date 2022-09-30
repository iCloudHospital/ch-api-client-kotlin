# HospitalsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2HospitalsGet**](HospitalsApi.md#apiV2HospitalsGet) | **GET** api/v2/hospitals | Get all Hospitals.
[**apiV2HospitalsHospitalIdAccreditationsAccreditationIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdAccreditationsAccreditationIdGet) | **GET** api/v2/hospitals/{hospitalId}/accreditations/{accreditationId} | Get HospitalAccreditation.
[**apiV2HospitalsHospitalIdAccreditationsGet**](HospitalsApi.md#apiV2HospitalsHospitalIdAccreditationsGet) | **GET** api/v2/hospitals/{hospitalId}/accreditations | Get all HospitalAccreditations.
[**apiV2HospitalsHospitalIdEquipmentsEquipmentIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdEquipmentsEquipmentIdGet) | **GET** api/v2/hospitals/{hospitalId}/equipments/{equipmentId} | Get HospitalEquipment.
[**apiV2HospitalsHospitalIdEquipmentsEquipmentIdMediasGet**](HospitalsApi.md#apiV2HospitalsHospitalIdEquipmentsEquipmentIdMediasGet) | **GET** api/v2/hospitals/{hospitalId}/equipments/{equipmentId}/medias | Get all EquipmentMedia.
[**apiV2HospitalsHospitalIdEquipmentsEquipmentIdMediasMediaIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdEquipmentsEquipmentIdMediasMediaIdGet) | **GET** api/v2/hospitals/{hospitalId}/equipments/{equipmentId}/medias/{mediaId} | Get EquipmentMedia.
[**apiV2HospitalsHospitalIdEquipmentsGet**](HospitalsApi.md#apiV2HospitalsHospitalIdEquipmentsGet) | **GET** api/v2/hospitals/{hospitalId}/equipments | Get all HospitalEquipments.
[**apiV2HospitalsHospitalIdEvaluationsEvaluationIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdEvaluationsEvaluationIdGet) | **GET** api/v2/hospitals/{hospitalId}/evaluations/{evaluationId} | Get HospitalEvaluation.
[**apiV2HospitalsHospitalIdEvaluationsGet**](HospitalsApi.md#apiV2HospitalsHospitalIdEvaluationsGet) | **GET** api/v2/hospitals/{hospitalId}/evaluations | Get all HospitalEvaluations.
[**apiV2HospitalsHospitalIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdGet) | **GET** api/v2/hospitals/{hospitalId} | 
[**apiV2HospitalsHospitalIdHandlesGet**](HospitalsApi.md#apiV2HospitalsHospitalIdHandlesGet) | **GET** api/v2/hospitals/{hospitalId}/handles | Get all HospitalHandles.
[**apiV2HospitalsHospitalIdHandlesHandleIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdHandlesHandleIdGet) | **GET** api/v2/hospitals/{hospitalId}/handles/{handleId} | Get HospitalHandle.
[**apiV2HospitalsHospitalIdLandingsGet**](HospitalsApi.md#apiV2HospitalsHospitalIdLandingsGet) | **GET** api/v2/hospitals/{hospitalId}/landings | 
[**apiV2HospitalsHospitalIdLandingsLandingIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdLandingsLandingIdGet) | **GET** api/v2/hospitals/{hospitalId}/landings/{landingId} | 
[**apiV2HospitalsHospitalIdLandingsSlugGet**](HospitalsApi.md#apiV2HospitalsHospitalIdLandingsSlugGet) | **GET** api/v2/hospitals/{hospitalId}/landings/{slug} | 
[**apiV2HospitalsHospitalIdMediasGet**](HospitalsApi.md#apiV2HospitalsHospitalIdMediasGet) | **GET** api/v2/hospitals/{hospitalId}/medias | Get all HospitalMedias.
[**apiV2HospitalsHospitalIdMediasMediaIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdMediasMediaIdGet) | **GET** api/v2/hospitals/{hospitalId}/medias/{mediaId} | Get HospitalMedia.
[**apiV2HospitalsHospitalIdSpecialtiesGet**](HospitalsApi.md#apiV2HospitalsHospitalIdSpecialtiesGet) | **GET** api/v2/hospitals/{hospitalId}/specialties | Get all HospitalSpecialties.
[**apiV2HospitalsHospitalIdSpecialtiesHospitalSpecialtyIdMediasGet**](HospitalsApi.md#apiV2HospitalsHospitalIdSpecialtiesHospitalSpecialtyIdMediasGet) | **GET** api/v2/hospitals/{hospitalId}/specialties/{hospitalSpecialtyId}/medias | Get all HospitalServiceMedias.
[**apiV2HospitalsHospitalIdSpecialtiesHospitalSpecialtyIdMediasMediaIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdSpecialtiesHospitalSpecialtyIdMediasMediaIdGet) | **GET** api/v2/hospitals/{hospitalId}/specialties/{hospitalSpecialtyId}/medias/{mediaId} | Get HospitalServiceMedia.
[**apiV2HospitalsHospitalIdSpecialtiesSimpleGet**](HospitalsApi.md#apiV2HospitalsHospitalIdSpecialtiesSimpleGet) | **GET** api/v2/hospitals/{hospitalId}/specialties/simple | Get all HospitalSpecialties.
[**apiV2HospitalsHospitalIdSpecialtiesSlugGet**](HospitalsApi.md#apiV2HospitalsHospitalIdSpecialtiesSlugGet) | **GET** api/v2/hospitals/{hospitalId}/specialties/{slug} | Get HospitalSpecialty by slug.
[**apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdGet) | **GET** api/v2/hospitals/{hospitalId}/specialties/{specialtyId} | Get HospitalSpecialty.
[**apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesGet**](HospitalsApi.md#apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesGet) | **GET** api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services | Get all HospitalServices.
[**apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdGet) | **GET** api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId} | Get HospitalService.
[**apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdMediasGet**](HospitalsApi.md#apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdMediasGet) | **GET** api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId}/medias | Get all HospitalServiceMedias.
[**apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdMediasMediaIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdMediasMediaIdGet) | **GET** api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId}/medias/{mediaId} | Get HospitalServiceMedia.
[**apiV2HospitalsHospitalIdWorkingdaysGet**](HospitalsApi.md#apiV2HospitalsHospitalIdWorkingdaysGet) | **GET** api/v2/hospitals/{hospitalId}/workingdays | Get all HospitalWorkingDays.
[**apiV2HospitalsHospitalIdWorkingdaysWorkingDayIdGet**](HospitalsApi.md#apiV2HospitalsHospitalIdWorkingdaysWorkingDayIdGet) | **GET** api/v2/hospitals/{hospitalId}/workingdays/{workingDayId} | Get HospitalWorkingDay.
[**apiV2HospitalsSimpleGet**](HospitalsApi.md#apiV2HospitalsSimpleGet) | **GET** api/v2/hospitals/simple | Get all Hospitals.
[**apiV2HospitalsSlugGet**](HospitalsApi.md#apiV2HospitalsSlugGet) | **GET** api/v2/hospitals/{slug} | 



Get all Hospitals.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val marketingType : MarketingType =  // MarketingType | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val exceptHospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val ids : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 
val paymentEnabled : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalsModel = webService.apiV2HospitalsGet(hospitalId, name, countryId, created, marketingType, specialtyTypeId, specialtyId, exceptHospitalId, showHidden, languageCode, ids, returnDefaultValue, paymentEnabled, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **countryId** | **java.util.UUID**|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **specialtyTypeId** | **java.util.UUID**|  | [optional]
 **specialtyId** | **java.util.UUID**|  | [optional]
 **exceptHospitalId** | **java.util.UUID**|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **ids** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]
 **paymentEnabled** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalsModel**](HospitalsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get HospitalAccreditation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accreditationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : HospitalAccreditationModel = webService.apiV2HospitalsHospitalIdAccreditationsAccreditationIdGet(hospitalId, accreditationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **accreditationId** | **java.util.UUID**|  |

### Return type

[**HospitalAccreditationModel**](HospitalAccreditationModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all HospitalAccreditations.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val accreditationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accreditationName : kotlin.String = accreditationName_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalAccreditationsModel = webService.apiV2HospitalsHospitalIdAccreditationsGet(hospitalId, hospitalName, accreditationId, accreditationName, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **hospitalName** | **kotlin.String**|  | [optional]
 **accreditationId** | **java.util.UUID**|  | [optional]
 **accreditationName** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalAccreditationsModel**](HospitalAccreditationsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get HospitalEquipment.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val equipmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : HospitalEquipmentModel = webService.apiV2HospitalsHospitalIdEquipmentsEquipmentIdGet(hospitalId, equipmentId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **equipmentId** | **java.util.UUID**|  |

### Return type

[**HospitalEquipmentModel**](HospitalEquipmentModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all EquipmentMedia.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val equipmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaType : MediaType =  // MediaType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : MediasModel = webService.apiV2HospitalsHospitalIdEquipmentsEquipmentIdMediasGet(hospitalId, equipmentId, id, mediaType, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **equipmentId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  | [optional]
 **mediaType** | [**MediaType**](.md)|  | [optional] [enum: Photo, Video, Youtube, Document, Frontal, Diagonal, Side]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**MediasModel**](MediasModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get EquipmentMedia.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val equipmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : MediaModel = webService.apiV2HospitalsHospitalIdEquipmentsEquipmentIdMediasMediaIdGet(hospitalId, equipmentId, mediaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **equipmentId** | **java.util.UUID**|  |
 **mediaId** | **java.util.UUID**|  |

### Return type

[**MediaModel**](MediaModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all HospitalEquipments.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val hospitalId2 : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalEquipmentsModel = webService.apiV2HospitalsHospitalIdEquipmentsGet(hospitalId, id, name, hospitalId2, hospitalName, description, created, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **hospitalId2** | **java.util.UUID**|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalEquipmentsModel**](HospitalEquipmentsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get HospitalEvaluation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val evaluationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : HospitalEvaluationModel = webService.apiV2HospitalsHospitalIdEvaluationsEvaluationIdGet(hospitalId, evaluationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **evaluationId** | **java.util.UUID**|  |

### Return type

[**HospitalEvaluationModel**](HospitalEvaluationModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all HospitalEvaluations.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val stars : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalEvaluationsModel = webService.apiV2HospitalsHospitalIdEvaluationsGet(hospitalId, id, name, stars, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **stars** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalEvaluationsModel**](HospitalEvaluationsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : HospitalModel = webService.apiV2HospitalsHospitalIdGet(hospitalId, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalModel**](HospitalModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all HospitalHandles.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val snsType : SnsType =  // SnsType | 
val handle : kotlin.String = handle_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalSnsHandlesModel = webService.apiV2HospitalsHospitalIdHandlesGet(hospitalId, id, snsType, handle, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  | [optional]
 **snsType** | [**SnsType**](.md)|  | [optional] [enum: Twitter, Facebook, Instagram, LinkedIn, Youtube, KakaoTalk]
 **handle** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalSnsHandlesModel**](HospitalSnsHandlesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get HospitalHandle.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val handleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : SnsHandleModel = webService.apiV2HospitalsHospitalIdHandlesHandleIdGet(hospitalId, handleId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **handleId** | **java.util.UUID**|  |

### Return type

[**SnsHandleModel**](SnsHandleModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : LandingsModel = webService.apiV2HospitalsHospitalIdLandingsGet(hospitalId, name, slug, languageCode, showHidden, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **name** | **kotlin.String**|  | [optional]
 **slug** | **kotlin.String**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**LandingsModel**](LandingsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val landingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : LandingModel = webService.apiV2HospitalsHospitalIdLandingsLandingIdGet(hospitalId, landingId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **landingId** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]

### Return type

[**LandingModel**](LandingModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val hospitalId : kotlin.String = hospitalId_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : LandingModel = webService.apiV2HospitalsHospitalIdLandingsSlugGet(slug, hospitalId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **hospitalId** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional]

### Return type

[**LandingModel**](LandingModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all HospitalMedias.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaType : MediaType =  // MediaType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : MediasModel = webService.apiV2HospitalsHospitalIdMediasGet(hospitalId, id, mediaType, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  | [optional]
 **mediaType** | [**MediaType**](.md)|  | [optional] [enum: Photo, Video, Youtube, Document, Frontal, Diagonal, Side]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**MediasModel**](MediasModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get HospitalMedia.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : MediaModel = webService.apiV2HospitalsHospitalIdMediasMediaIdGet(hospitalId, mediaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **mediaId** | **java.util.UUID**|  |

### Return type

[**MediaModel**](MediaModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all HospitalSpecialties.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyName : kotlin.String = specialtyName_example // kotlin.String | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyTypeName : kotlin.String = specialtyTypeName_example // kotlin.String | 
val hospitalSpecialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val slug : kotlin.String = slug_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalSpecialtiesModel = webService.apiV2HospitalsHospitalIdSpecialtiesGet(hospitalId, specialtyId, specialtyName, specialtyTypeId, specialtyTypeName, hospitalSpecialtyId, name, slug, marketingType, languageCode, showHidden, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **specialtyId** | **java.util.UUID**|  | [optional]
 **specialtyName** | **kotlin.String**|  | [optional]
 **specialtyTypeId** | **java.util.UUID**|  | [optional]
 **specialtyTypeName** | **kotlin.String**|  | [optional]
 **hospitalSpecialtyId** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **slug** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **languageCode** | **kotlin.String**|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalSpecialtiesModel**](HospitalSpecialtiesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all HospitalServiceMedias.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalSpecialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaType : MediaType =  // MediaType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : MediasModel = webService.apiV2HospitalsHospitalIdSpecialtiesHospitalSpecialtyIdMediasGet(hospitalId, hospitalSpecialtyId, id, mediaType, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **hospitalSpecialtyId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  | [optional]
 **mediaType** | [**MediaType**](.md)|  | [optional] [enum: Photo, Video, Youtube, Document, Frontal, Diagonal, Side]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**MediasModel**](MediasModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get HospitalServiceMedia.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalSpecialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : MediaModel = webService.apiV2HospitalsHospitalIdSpecialtiesHospitalSpecialtyIdMediasMediaIdGet(hospitalId, hospitalSpecialtyId, mediaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **hospitalSpecialtyId** | **java.util.UUID**|  |
 **mediaId** | **java.util.UUID**|  |

### Return type

[**MediaModel**](MediaModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all HospitalSpecialties.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyName : kotlin.String = specialtyName_example // kotlin.String | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyTypeName : kotlin.String = specialtyTypeName_example // kotlin.String | 
val hospitalSpecialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val slug : kotlin.String = slug_example // kotlin.String | 
val marketingType : MarketingType =  // MarketingType | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalSpecialtiesSimpleModel = webService.apiV2HospitalsHospitalIdSpecialtiesSimpleGet(hospitalId, specialtyId, specialtyName, specialtyTypeId, specialtyTypeName, hospitalSpecialtyId, name, slug, marketingType, languageCode, showHidden, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **specialtyId** | **java.util.UUID**|  | [optional]
 **specialtyName** | **kotlin.String**|  | [optional]
 **specialtyTypeId** | **java.util.UUID**|  | [optional]
 **specialtyTypeName** | **kotlin.String**|  | [optional]
 **hospitalSpecialtyId** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **slug** | **kotlin.String**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **languageCode** | **kotlin.String**|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalSpecialtiesSimpleModel**](HospitalSpecialtiesSimpleModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get HospitalSpecialty by slug.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : HospitalSpecialtyModel = webService.apiV2HospitalsHospitalIdSpecialtiesSlugGet(hospitalId, slug, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional]

### Return type

[**HospitalSpecialtyModel**](HospitalSpecialtyModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get HospitalSpecialty.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : HospitalSpecialtyModel = webService.apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdGet(hospitalId, specialtyId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **specialtyId** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]

### Return type

[**HospitalSpecialtyModel**](HospitalSpecialtyModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all HospitalServices.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val slug : kotlin.String = slug_example // kotlin.String | 
val serviceCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingType : MarketingType =  // MarketingType | 
val procedure : Procedure =  // Procedure | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalServicesModel = webService.apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesGet(hospitalId, specialtyId, id, name, slug, serviceCategoryId, marketingType, procedure, created, languageCode, returnDefaultValue, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **specialtyId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **slug** | **kotlin.String**|  | [optional]
 **serviceCategoryId** | **java.util.UUID**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **procedure** | [**Procedure**](.md)|  | [optional] [enum: Treatment, Diagnostic]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalServicesModel**](HospitalServicesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get HospitalService.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : HospitalServiceModel = webService.apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdGet(hospitalId, specialtyId, serviceId, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **specialtyId** | **java.util.UUID**|  |
 **serviceId** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalServiceModel**](HospitalServiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all HospitalServiceMedias.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaType : MediaType =  // MediaType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : MediasModel = webService.apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdMediasGet(hospitalId, specialtyId, serviceId, id, mediaType, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **specialtyId** | **java.util.UUID**|  |
 **serviceId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  | [optional]
 **mediaType** | [**MediaType**](.md)|  | [optional] [enum: Photo, Video, Youtube, Document, Frontal, Diagonal, Side]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**MediasModel**](MediasModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get HospitalServiceMedia.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : MediaModel = webService.apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdMediasMediaIdGet(hospitalId, specialtyId, serviceId, mediaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **specialtyId** | **java.util.UUID**|  |
 **serviceId** | **java.util.UUID**|  |
 **mediaId** | **java.util.UUID**|  |

### Return type

[**MediaModel**](MediaModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all HospitalWorkingDays.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dayOfWeek : kotlin.String = dayOfWeek_example // kotlin.String | 
val timeFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val timeTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val checkHoliday : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : WorkingDaysModel = webService.apiV2HospitalsHospitalIdWorkingdaysGet(hospitalId, id, dayOfWeek, timeFrom, timeTo, checkHoliday, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  | [optional]
 **dayOfWeek** | **kotlin.String**|  | [optional]
 **timeFrom** | **java.time.LocalDateTime**|  | [optional]
 **timeTo** | **java.time.LocalDateTime**|  | [optional]
 **checkHoliday** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**WorkingDaysModel**](WorkingDaysModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get HospitalWorkingDay.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val workingDayId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : WorkingDayModel = webService.apiV2HospitalsHospitalIdWorkingdaysWorkingDayIdGet(hospitalId, workingDayId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  |
 **workingDayId** | **java.util.UUID**|  |

### Return type

[**WorkingDayModel**](WorkingDayModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all Hospitals.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val countryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val marketingType : MarketingType =  // MarketingType | 
val specialtyTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val exceptHospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val showHidden : kotlin.Boolean = true // kotlin.Boolean | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val ids : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 
val paymentEnabled : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : HospitalsSimpleModel = webService.apiV2HospitalsSimpleGet(hospitalId, name, countryId, created, marketingType, specialtyTypeId, specialtyId, exceptHospitalId, showHidden, languageCode, ids, returnDefaultValue, paymentEnabled, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **countryId** | **java.util.UUID**|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **marketingType** | [**MarketingType**](.md)|  | [optional] [enum: Both, GeneralHealth, Beauty]
 **specialtyTypeId** | **java.util.UUID**|  | [optional]
 **specialtyId** | **java.util.UUID**|  | [optional]
 **exceptHospitalId** | **java.util.UUID**|  | [optional]
 **showHidden** | **kotlin.Boolean**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **ids** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]
 **paymentEnabled** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**HospitalsSimpleModel**](HospitalsSimpleModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HospitalsApi::class.java)
val slug : kotlin.String = slug_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : HospitalModel = webService.apiV2HospitalsSlugGet(slug, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**HospitalModel**](HospitalModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

