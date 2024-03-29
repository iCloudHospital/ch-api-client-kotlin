# DoctorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2DoctorsDoctorIdCertificatesCertificateIdGet**](DoctorsApi.md#apiV2DoctorsDoctorIdCertificatesCertificateIdGet) | **GET** api/v2/doctors/{doctorId}/certificates/{certificateId} | Get DoctorCertificate.
[**apiV2DoctorsDoctorIdCertificatesGet**](DoctorsApi.md#apiV2DoctorsDoctorIdCertificatesGet) | **GET** api/v2/doctors/{doctorId}/certificates | Get All DoctorCertificate.
[**apiV2DoctorsDoctorIdEducationsEducationIdGet**](DoctorsApi.md#apiV2DoctorsDoctorIdEducationsEducationIdGet) | **GET** api/v2/doctors/{doctorId}/educations/{educationId} | Get DoctorEducation.
[**apiV2DoctorsDoctorIdEducationsGet**](DoctorsApi.md#apiV2DoctorsDoctorIdEducationsGet) | **GET** api/v2/doctors/{doctorId}/educations | Get all DoctorEducations.
[**apiV2DoctorsDoctorIdGet**](DoctorsApi.md#apiV2DoctorsDoctorIdGet) | **GET** api/v2/doctors/{doctorId} | 
[**apiV2DoctorsDoctorIdLanguagesGet**](DoctorsApi.md#apiV2DoctorsDoctorIdLanguagesGet) | **GET** api/v2/doctors/{doctorId}/languages | Get all DoctorLanguages.
[**apiV2DoctorsDoctorIdLanguagesLanguageIdGet**](DoctorsApi.md#apiV2DoctorsDoctorIdLanguagesLanguageIdGet) | **GET** api/v2/doctors/{doctorId}/languages/{languageId} | Get DoctorLanguage.
[**apiV2DoctorsDoctorIdMediasGet**](DoctorsApi.md#apiV2DoctorsDoctorIdMediasGet) | **GET** api/v2/doctors/{doctorId}/medias | Get all DoctorMedias.
[**apiV2DoctorsDoctorIdMediasMediaIdGet**](DoctorsApi.md#apiV2DoctorsDoctorIdMediasMediaIdGet) | **GET** api/v2/doctors/{doctorId}/medias/{mediaId} | Get DoctorMedia.
[**apiV2DoctorsDoctorIdPortfoliosGet**](DoctorsApi.md#apiV2DoctorsDoctorIdPortfoliosGet) | **GET** api/v2/doctors/{doctorId}/portfolios | Get All DoctorPortfolios
[**apiV2DoctorsDoctorIdPortfoliosPortfolioIdGet**](DoctorsApi.md#apiV2DoctorsDoctorIdPortfoliosPortfolioIdGet) | **GET** api/v2/doctors/{doctorId}/portfolios/{portfolioId} | Get DoctorPortfolio.
[**apiV2DoctorsDoctorIdSpecialtiesGet**](DoctorsApi.md#apiV2DoctorsDoctorIdSpecialtiesGet) | **GET** api/v2/doctors/{doctorId}/specialties | Get All DoctorSpecialties.
[**apiV2DoctorsDoctorIdSpecialtiesSpecialtyIdGet**](DoctorsApi.md#apiV2DoctorsDoctorIdSpecialtiesSpecialtyIdGet) | **GET** api/v2/doctors/{doctorId}/specialties/{specialtyId} | Get DoctorSpecialty
[**apiV2DoctorsGet**](DoctorsApi.md#apiV2DoctorsGet) | **GET** api/v2/doctors | Get all Doctors.
[**apiV2DoctorsSimpleGet**](DoctorsApi.md#apiV2DoctorsSimpleGet) | **GET** api/v2/doctors/simple | Get all Doctors.



Get DoctorCertificate.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val certificateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorCertificateModel = webService.apiV2DoctorsDoctorIdCertificatesCertificateIdGet(doctorId, certificateId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **certificateId** | **java.util.UUID**|  |

### Return type

[**DoctorCertificateModel**](DoctorCertificateModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get All DoctorCertificate.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val certificateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val certificate : kotlin.String = certificate_example // kotlin.String | 
val activeFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val activeTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorCertificatesModel = webService.apiV2DoctorsDoctorIdCertificatesGet(doctorId, doctorName, certificateId, certificate, activeFrom, activeTo, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **doctorName** | **kotlin.String**|  | [optional]
 **certificateId** | **java.util.UUID**|  | [optional]
 **certificate** | **kotlin.String**|  | [optional]
 **activeFrom** | **java.time.LocalDateTime**|  | [optional]
 **activeTo** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorCertificatesModel**](DoctorCertificatesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get DoctorEducation.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val educationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorEducationModel = webService.apiV2DoctorsDoctorIdEducationsEducationIdGet(doctorId, educationId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **educationId** | **java.util.UUID**|  |

### Return type

[**DoctorEducationModel**](DoctorEducationModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all DoctorEducations.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val educationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val institution : kotlin.String = institution_example // kotlin.String | 
val qualification : kotlin.String = qualification_example // kotlin.String | 
val graduationDate : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorEducationsModel = webService.apiV2DoctorsDoctorIdEducationsGet(doctorId, doctorName, educationId, institution, qualification, graduationDate, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **doctorName** | **kotlin.String**|  | [optional]
 **educationId** | **java.util.UUID**|  | [optional]
 **institution** | **kotlin.String**|  | [optional]
 **qualification** | **kotlin.String**|  | [optional]
 **graduationDate** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorEducationsModel**](DoctorEducationsModel.md)

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
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val returnDefaultValue : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DoctorModel = webService.apiV2DoctorsDoctorIdGet(doctorId, languageCode, returnDefaultValue)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]
 **returnDefaultValue** | **kotlin.Boolean**|  | [optional]

### Return type

[**DoctorModel**](DoctorModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all DoctorLanguages.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val language : kotlin.String = language_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorLanguagesModel = webService.apiV2DoctorsDoctorIdLanguagesGet(doctorId, language, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **language** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorLanguagesModel**](DoctorLanguagesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get DoctorLanguage.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorLanguageModel = webService.apiV2DoctorsDoctorIdLanguagesLanguageIdGet(doctorId, languageId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **languageId** | **java.util.UUID**|  |

### Return type

[**DoctorLanguageModel**](DoctorLanguageModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all DoctorMedias.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaType : MediaType =  // MediaType | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : MediasModel = webService.apiV2DoctorsDoctorIdMediasGet(doctorId, id, mediaType, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
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


Get DoctorMedia.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mediaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : MediaModel = webService.apiV2DoctorsDoctorIdMediasMediaIdGet(doctorId, mediaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **mediaId** | **java.util.UUID**|  |

### Return type

[**MediaModel**](MediaModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get All DoctorPortfolios

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val portfolioId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorPortfoliosModel = webService.apiV2DoctorsDoctorIdPortfoliosGet(doctorId, doctorName, portfolioId, name, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **doctorName** | **kotlin.String**|  | [optional]
 **portfolioId** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorPortfoliosModel**](DoctorPortfoliosModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get DoctorPortfolio.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portfolioId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorPortfolioModel = webService.apiV2DoctorsDoctorIdPortfoliosPortfolioIdGet(doctorId, portfolioId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **portfolioId** | **java.util.UUID**|  |

### Return type

[**DoctorPortfolioModel**](DoctorPortfolioModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get All DoctorSpecialties.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyName : kotlin.String = specialtyName_example // kotlin.String | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorSpecialtiesModel = webService.apiV2DoctorsDoctorIdSpecialtiesGet(doctorId, doctorName, specialtyId, specialtyName, languageCode, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **doctorName** | **kotlin.String**|  | [optional]
 **specialtyId** | **java.util.UUID**|  | [optional]
 **specialtyName** | **kotlin.String**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorSpecialtiesModel**](DoctorSpecialtiesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get DoctorSpecialty

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : DoctorSpecialtyModel = webService.apiV2DoctorsDoctorIdSpecialtiesSpecialtyIdGet(doctorId, specialtyId, languageCode)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **java.util.UUID**|  |
 **specialtyId** | **java.util.UUID**|  |
 **languageCode** | **kotlin.String**|  | [optional]

### Return type

[**DoctorSpecialtyModel**](DoctorSpecialtyModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all Doctors.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val ids : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val consultationEnabled : kotlin.Boolean = true // kotlin.Boolean | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fullname : kotlin.String = fullname_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val gender : Gender =  // Gender | 
val dateOfBirth : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorsModel = webService.apiV2DoctorsGet(hospitalId, hospitalName, ids, specialtyId, consultationEnabled, languageCode, id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **ids** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **specialtyId** | **java.util.UUID**|  | [optional]
 **consultationEnabled** | **kotlin.Boolean**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **id** | **java.util.UUID**|  | [optional]
 **fullname** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **gender** | [**Gender**](.md)|  | [optional] [enum: NotSpecified, Male, Female, NonBinary, PreferNotToSay]
 **dateOfBirth** | **java.time.LocalDateTime**|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorsModel**](DoctorsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get all Doctors.

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorsApi::class.java)
val hospitalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hospitalName : kotlin.String = hospitalName_example // kotlin.String | 
val ids : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val specialtyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val consultationEnabled : kotlin.Boolean = true // kotlin.Boolean | 
val languageCode : kotlin.String = languageCode_example // kotlin.String | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fullname : kotlin.String = fullname_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val gender : Gender =  // Gender | 
val dateOfBirth : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val created : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorsSimpleModel = webService.apiV2DoctorsSimpleGet(hospitalId, hospitalName, ids, specialtyId, consultationEnabled, languageCode, id, fullname, email, gender, dateOfBirth, created, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hospitalId** | **java.util.UUID**|  | [optional]
 **hospitalName** | **kotlin.String**|  | [optional]
 **ids** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **specialtyId** | **java.util.UUID**|  | [optional]
 **consultationEnabled** | **kotlin.Boolean**|  | [optional]
 **languageCode** | **kotlin.String**|  | [optional]
 **id** | **java.util.UUID**|  | [optional]
 **fullname** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **gender** | [**Gender**](.md)|  | [optional] [enum: NotSpecified, Male, Female, NonBinary, PreferNotToSay]
 **dateOfBirth** | **java.time.LocalDateTime**|  | [optional]
 **created** | **java.time.LocalDateTime**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorsSimpleModel**](DoctorsSimpleModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

