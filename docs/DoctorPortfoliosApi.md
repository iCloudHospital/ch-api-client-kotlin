# DoctorPortfoliosApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DoctorsDoctorIdPortfoliosPortfolioIdDelete**](DoctorPortfoliosApi.md#apiV1DoctorsDoctorIdPortfoliosPortfolioIdDelete) | **DELETE** api/v1/doctors/{doctorId}/portfolios/{portfolioId} | Delete DoctorPortfolio
[**apiV1DoctorsDoctorIdPortfoliosPortfolioIdGet**](DoctorPortfoliosApi.md#apiV1DoctorsDoctorIdPortfoliosPortfolioIdGet) | **GET** api/v1/doctors/{doctorId}/portfolios/{portfolioId} | Get DoctorPortfolio
[**apiV1DoctorsDoctorIdPortfoliosPortfolioIdPut**](DoctorPortfoliosApi.md#apiV1DoctorsDoctorIdPortfoliosPortfolioIdPut) | **PUT** api/v1/doctors/{doctorId}/portfolios/{portfolioId} | Update DoctorPortfolio
[**apiV1DoctorsDoctorIdPortfoliosPost**](DoctorPortfoliosApi.md#apiV1DoctorsDoctorIdPortfoliosPost) | **POST** api/v1/doctors/{doctorId}/portfolios | Create DoctorPortfolios
[**apiV1DoctorsPortfoliosGet**](DoctorPortfoliosApi.md#apiV1DoctorsPortfoliosGet) | **GET** api/v1/doctors/portfolios | Get All DoctorPortfolios



Delete DoctorPortfolio

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorPortfoliosApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portfolioId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.apiV1DoctorsDoctorIdPortfoliosPortfolioIdDelete(doctorId, portfolioId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **portfolioId** | [**java.util.UUID**](.md)|  |

### Return type

**kotlin.Boolean**

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get DoctorPortfolio

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorPortfoliosApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portfolioId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

launch(Dispatchers.IO) {
    val result : DoctorPortfolioViewModel = webService.apiV1DoctorsDoctorIdPortfoliosPortfolioIdGet(doctorId, portfolioId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **portfolioId** | [**java.util.UUID**](.md)|  |

### Return type

[**DoctorPortfolioViewModel**](DoctorPortfolioViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update DoctorPortfolio

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorPortfoliosApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portfolioId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDoctorPortfolioCommand : UpdateDoctorPortfolioCommand =  // UpdateDoctorPortfolioCommand | 

launch(Dispatchers.IO) {
    val result : DoctorPortfolioViewModel = webService.apiV1DoctorsDoctorIdPortfoliosPortfolioIdPut(doctorId, portfolioId, updateDoctorPortfolioCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **portfolioId** | [**java.util.UUID**](.md)|  |
 **updateDoctorPortfolioCommand** | [**UpdateDoctorPortfolioCommand**](UpdateDoctorPortfolioCommand.md)|  | [optional]

### Return type

[**DoctorPortfolioViewModel**](DoctorPortfolioViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Create DoctorPortfolios

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorPortfoliosApi::class.java)
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDoctorPortfolioCommand : CreateDoctorPortfolioCommand =  // CreateDoctorPortfolioCommand | 

launch(Dispatchers.IO) {
    val result : DoctorPortfolioViewModel = webService.apiV1DoctorsDoctorIdPortfoliosPost(doctorId, createDoctorPortfolioCommand)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**java.util.UUID**](.md)|  |
 **createDoctorPortfolioCommand** | [**CreateDoctorPortfolioCommand**](CreateDoctorPortfolioCommand.md)|  | [optional]

### Return type

[**DoctorPortfolioViewModel**](DoctorPortfolioViewModel.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


Get All DoctorPortfolios

### Example
```kotlin
// Import classes:
//import CloudHospitalApi.*
//import CloudHospitalApi.infrastructure.*
//import CloudHospitalApi.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DoctorPortfoliosApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val doctorName : kotlin.String = doctorName_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val lastRetrieved : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 

launch(Dispatchers.IO) {
    val result : DoctorPortfoliosViewModel = webService.apiV1DoctorsPortfoliosGet(id, doctorId, doctorName, name, page, limit, lastRetrieved)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  | [optional]
 **doctorId** | [**java.util.UUID**](.md)|  | [optional]
 **doctorName** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **lastRetrieved** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**DoctorPortfoliosViewModel**](DoctorPortfoliosViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

