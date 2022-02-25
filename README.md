# CloudHospitalApi - Kotlin client library for Swagger UI - Cloud Hospital Api-INT

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccreditationsApi* | [**apiV1AccreditationsAccreditationIdDelete**](docs/AccreditationsApi.md#apiv1accreditationsaccreditationiddelete) | **DELETE** api/v1/accreditations/{accreditationId} | 
*AccreditationsApi* | [**apiV1AccreditationsAccreditationIdGet**](docs/AccreditationsApi.md#apiv1accreditationsaccreditationidget) | **GET** api/v1/accreditations/{accreditationId} | 
*AccreditationsApi* | [**apiV1AccreditationsAccreditationIdPut**](docs/AccreditationsApi.md#apiv1accreditationsaccreditationidput) | **PUT** api/v1/accreditations/{accreditationId} | 
*AccreditationsApi* | [**apiV1AccreditationsGet**](docs/AccreditationsApi.md#apiv1accreditationsget) | **GET** api/v1/accreditations | 
*AccreditationsApi* | [**apiV1AccreditationsPost**](docs/AccreditationsApi.md#apiv1accreditationspost) | **POST** api/v1/accreditations | 
*AffiliationsApi* | [**apiV1HospitalsHospitalIdDoctorsDoctorIdDelete**](docs/AffiliationsApi.md#apiv1hospitalshospitaliddoctorsdoctoriddelete) | **DELETE** api/v1/hospitals/{hospitalId}/doctors/{doctorId} | Remove link between the doctor and the hospital.
*AffiliationsApi* | [**apiV1HospitalsHospitalIdDoctorsDoctorIdPost**](docs/AffiliationsApi.md#apiv1hospitalshospitaliddoctorsdoctoridpost) | **POST** api/v1/hospitals/{hospitalId}/doctors/{doctorId} | Link a doctor to a hospital.
*AffiliationsApi* | [**apiV1HospitalsHospitalIdManagersManagerIdDelete**](docs/AffiliationsApi.md#apiv1hospitalshospitalidmanagersmanageriddelete) | **DELETE** api/v1/hospitals/{hospitalId}/managers/{managerId} | Remove link between the manager and the hospital.
*AffiliationsApi* | [**apiV1HospitalsHospitalIdManagersManagerIdPost**](docs/AffiliationsApi.md#apiv1hospitalshospitalidmanagersmanageridpost) | **POST** api/v1/hospitals/{hospitalId}/managers/{managerId} | Link a manager to a hospital.
*AppVersionApi* | [**apiV1AppversionPlatformGet**](docs/AppVersionApi.md#apiv1appversionplatformget) | **GET** api/v1/appversion/{platform} | 
*ArticleContributorsApi* | [**apiV1ArticlesArticleIdContributorsContributorIdDelete**](docs/ArticleContributorsApi.md#apiv1articlesarticleidcontributorscontributoriddelete) | **DELETE** api/v1/articles/{articleId}/contributors/{contributorId} | Delete article contributor
*ArticleContributorsApi* | [**apiV1ArticlesArticleIdContributorsContributorIdPut**](docs/ArticleContributorsApi.md#apiv1articlesarticleidcontributorscontributoridput) | **PUT** api/v1/articles/{articleId}/contributors/{contributorId} | Update article contributor
*ArticleContributorsApi* | [**apiV1ArticlesArticleIdContributorsGet**](docs/ArticleContributorsApi.md#apiv1articlesarticleidcontributorsget) | **GET** api/v1/articles/{articleId}/contributors | Get all article contributor
*ArticleContributorsApi* | [**apiV1ArticlesArticleIdContributorsPost**](docs/ArticleContributorsApi.md#apiv1articlesarticleidcontributorspost) | **POST** api/v1/articles/{articleId}/contributors | Create article contributor
*ArticleLocalesApi* | [**apiV1ArticlesArticleIdLocalesLanguageCodeGet**](docs/ArticleLocalesApi.md#apiv1articlesarticleidlocaleslanguagecodeget) | **GET** api/v1/articles/{articleId}/locales/{languageCode} | Get article locale
*ArticleLocalesApi* | [**apiV1ArticlesArticleIdLocalesLanguageCodePut**](docs/ArticleLocalesApi.md#apiv1articlesarticleidlocaleslanguagecodeput) | **PUT** api/v1/articles/{articleId}/locales/{languageCode} | Update article locale
*ArticlesApi* | [**apiV1HospitalsArticlesGet**](docs/ArticlesApi.md#apiv1hospitalsarticlesget) | **GET** api/v1/hospitals/articles | Get all articles.
*ArticlesApi* | [**apiV1HospitalsArticlesSlugsSlugGet**](docs/ArticlesApi.md#apiv1hospitalsarticlesslugsslugget) | **GET** api/v1/hospitals/articles/slugs/{slug} | Get article by slug.
*ArticlesApi* | [**apiV1HospitalsAuthorizedGet**](docs/ArticlesApi.md#apiv1hospitalsauthorizedget) | **GET** api/v1/hospitals/authorized | 
*ArticlesApi* | [**apiV1HospitalsHospitalIdArticlesArticleIdDelete**](docs/ArticlesApi.md#apiv1hospitalshospitalidarticlesarticleiddelete) | **DELETE** api/v1/hospitals/{hospitalId}/articles/{articleId} | Delete article.
*ArticlesApi* | [**apiV1HospitalsHospitalIdArticlesArticleIdGet**](docs/ArticlesApi.md#apiv1hospitalshospitalidarticlesarticleidget) | **GET** api/v1/hospitals/{hospitalId}/articles/{articleId} | Get article.
*ArticlesApi* | [**apiV1HospitalsHospitalIdArticlesArticleIdPut**](docs/ArticlesApi.md#apiv1hospitalshospitalidarticlesarticleidput) | **PUT** api/v1/hospitals/{hospitalId}/articles/{articleId} | Update article.
*ArticlesApi* | [**apiV1HospitalsHospitalIdArticlesPost**](docs/ArticlesApi.md#apiv1hospitalshospitalidarticlespost) | **POST** api/v1/hospitals/{hospitalId}/articles | Create an article.
*BookingsApi* | [**apiV1BookingsBookingIdApprovePost**](docs/BookingsApi.md#apiv1bookingsbookingidapprovepost) | **POST** api/v1/bookings/{bookingId}/approve | Approve booking.
*BookingsApi* | [**apiV1BookingsBookingIdCancelPost**](docs/BookingsApi.md#apiv1bookingsbookingidcancelpost) | **POST** api/v1/bookings/{bookingId}/cancel | Cancel booking.
*BookingsApi* | [**apiV1BookingsBookingIdDelete**](docs/BookingsApi.md#apiv1bookingsbookingiddelete) | **DELETE** api/v1/bookings/{bookingId} | Delete booking.
*BookingsApi* | [**apiV1BookingsBookingIdGet**](docs/BookingsApi.md#apiv1bookingsbookingidget) | **GET** api/v1/bookings/{bookingId} | Get booking.
*BookingsApi* | [**apiV1BookingsBookingIdPaidPost**](docs/BookingsApi.md#apiv1bookingsbookingidpaidpost) | **POST** api/v1/bookings/{bookingId}/paid | Mark as Paid booking.
*BookingsApi* | [**apiV1BookingsBookingIdPayPost**](docs/BookingsApi.md#apiv1bookingsbookingidpaypost) | **POST** api/v1/bookings/{bookingId}/pay | Pay booking.
*BookingsApi* | [**apiV1BookingsBookingIdPut**](docs/BookingsApi.md#apiv1bookingsbookingidput) | **PUT** api/v1/bookings/{bookingId} | Update booking.
*BookingsApi* | [**apiV1BookingsBookingIdRejectPost**](docs/BookingsApi.md#apiv1bookingsbookingidrejectpost) | **POST** api/v1/bookings/{bookingId}/reject | Reject booking.
*BookingsApi* | [**apiV1BookingsGet**](docs/BookingsApi.md#apiv1bookingsget) | **GET** api/v1/bookings | Get all bookings.
*BookingsApi* | [**apiV1BookingsRequestIdPost**](docs/BookingsApi.md#apiv1bookingsrequestidpost) | **POST** api/v1/bookings/{requestId} | Create booking.
*CHAdminsApi* | [**apiV1ChadminsChAdminIdDelete**](docs/CHAdminsApi.md#apiv1chadminschadminiddelete) | **DELETE** api/v1/chadmins/{chAdminId} | Delete cloud hospital admin user.
*CHAdminsApi* | [**apiV1ChadminsChAdminIdGet**](docs/CHAdminsApi.md#apiv1chadminschadminidget) | **GET** api/v1/chadmins/{chAdminId} | Get cloud hospital admin user by id.
*CHAdminsApi* | [**apiV1ChadminsChAdminIdPut**](docs/CHAdminsApi.md#apiv1chadminschadminidput) | **PUT** api/v1/chadmins/{chAdminId} | Update cloud hospital admin user.
*CHAdminsApi* | [**apiV1ChadminsGet**](docs/CHAdminsApi.md#apiv1chadminsget) | **GET** api/v1/chadmins | Get cloud hospital admin users.
*CHAdminsApi* | [**apiV1ChadminsPost**](docs/CHAdminsApi.md#apiv1chadminspost) | **POST** api/v1/chadmins | Create cloud hospital admin user.
*CHManagersApi* | [**apiV1ChmanagersChManagerIdDelete**](docs/CHManagersApi.md#apiv1chmanagerschmanageriddelete) | **DELETE** api/v1/chmanagers/{chManagerId} | Delete cloud hospital manager.
*CHManagersApi* | [**apiV1ChmanagersChManagerIdGet**](docs/CHManagersApi.md#apiv1chmanagerschmanageridget) | **GET** api/v1/chmanagers/{chManagerId} | Get cloud hospital manager.
*CHManagersApi* | [**apiV1ChmanagersChManagerIdPut**](docs/CHManagersApi.md#apiv1chmanagerschmanageridput) | **PUT** api/v1/chmanagers/{chManagerId} | Update cloud hospital manager.
*CHManagersApi* | [**apiV1ChmanagersGet**](docs/CHManagersApi.md#apiv1chmanagersget) | **GET** api/v1/chmanagers | Get cloud hospital managers.
*CHManagersApi* | [**apiV1ChmanagersPost**](docs/CHManagersApi.md#apiv1chmanagerspost) | **POST** api/v1/chmanagers | Create cloud hospital manager.
*ChatMessagesApi* | [**apiV1ChatmessagesFilesPost**](docs/ChatMessagesApi.md#apiv1chatmessagesfilespost) | **POST** api/v1/chatmessages/files | 
*ChatUsersApi* | [**apiV1ChatusersCurrentGet**](docs/ChatUsersApi.md#apiv1chatuserscurrentget) | **GET** api/v1/chatusers/current | 
*ChatUsersApi* | [**apiV1ChatusersCurrentPost**](docs/ChatUsersApi.md#apiv1chatuserscurrentpost) | **POST** api/v1/chatusers/current | 
*ChatUsersApi* | [**apiV1ChatusersDelete**](docs/ChatUsersApi.md#apiv1chatusersdelete) | **DELETE** api/v1/chatusers | 
*ChatUsersApi* | [**apiV1ChatusersPut**](docs/ChatUsersApi.md#apiv1chatusersput) | **PUT** api/v1/chatusers | 
*ChatUsersApi* | [**apiV1ChatusersUserIdGet**](docs/ChatUsersApi.md#apiv1chatusersuseridget) | **GET** api/v1/chatusers/{userId} | 
*CommunicationsApi* | [**apiV1CommunicationsDelete**](docs/CommunicationsApi.md#apiv1communicationsdelete) | **DELETE** api/v1/communications | 
*CommunicationsApi* | [**apiV1CommunicationsGet**](docs/CommunicationsApi.md#apiv1communicationsget) | **GET** api/v1/communications | 
*CommunicationsApi* | [**apiV1CommunicationsPut**](docs/CommunicationsApi.md#apiv1communicationsput) | **PUT** api/v1/communications | 
*ConsultationsApi* | [**apiV1ConsultationsConsultationIdApprovePost**](docs/ConsultationsApi.md#apiv1consultationsconsultationidapprovepost) | **POST** api/v1/consultations/{consultationId}/approve | Approve consultation.
*ConsultationsApi* | [**apiV1ConsultationsConsultationIdCancelPost**](docs/ConsultationsApi.md#apiv1consultationsconsultationidcancelpost) | **POST** api/v1/consultations/{consultationId}/cancel | Cancel consultation.
*ConsultationsApi* | [**apiV1ConsultationsConsultationIdDelete**](docs/ConsultationsApi.md#apiv1consultationsconsultationiddelete) | **DELETE** api/v1/consultations/{consultationId} | Delete consultation.
*ConsultationsApi* | [**apiV1ConsultationsConsultationIdGet**](docs/ConsultationsApi.md#apiv1consultationsconsultationidget) | **GET** api/v1/consultations/{consultationId} | Get consultation.
*ConsultationsApi* | [**apiV1ConsultationsConsultationIdPayPost**](docs/ConsultationsApi.md#apiv1consultationsconsultationidpaypost) | **POST** api/v1/consultations/{consultationId}/pay | Pay consultation.
*ConsultationsApi* | [**apiV1ConsultationsConsultationIdPut**](docs/ConsultationsApi.md#apiv1consultationsconsultationidput) | **PUT** api/v1/consultations/{consultationId} | Update consultation.
*ConsultationsApi* | [**apiV1ConsultationsConsultationIdRejectPost**](docs/ConsultationsApi.md#apiv1consultationsconsultationidrejectpost) | **POST** api/v1/consultations/{consultationId}/reject | Reject consultation.
*ConsultationsApi* | [**apiV1ConsultationsGet**](docs/ConsultationsApi.md#apiv1consultationsget) | **GET** api/v1/consultations | Get all consultations.
*ConsultationsApi* | [**apiV1ConsultationsRequestIdPost**](docs/ConsultationsApi.md#apiv1consultationsrequestidpost) | **POST** api/v1/consultations/{requestId} | Create consultation.
*ContributorSnsHandlesApi* | [**apiV1ContributorsContributorIdSnshandlesGet**](docs/ContributorSnsHandlesApi.md#apiv1contributorscontributoridsnshandlesget) | **GET** api/v1/contributors/{contributorId}/snshandles | Get all contributor SNShandles.
*ContributorSnsHandlesApi* | [**apiV1ContributorsContributorIdSnshandlesPost**](docs/ContributorSnsHandlesApi.md#apiv1contributorscontributoridsnshandlespost) | **POST** api/v1/contributors/{contributorId}/snshandles | Create contributor SNShandle
*ContributorSnsHandlesApi* | [**apiV1ContributorsContributorIdSnshandlesSnshandleIdDelete**](docs/ContributorSnsHandlesApi.md#apiv1contributorscontributoridsnshandlessnshandleiddelete) | **DELETE** api/v1/contributors/{contributorId}/snshandles/{snshandleId} | Delete contributor SNShandle
*ContributorSnsHandlesApi* | [**apiV1ContributorsContributorIdSnshandlesSnshandleIdPut**](docs/ContributorSnsHandlesApi.md#apiv1contributorscontributoridsnshandlessnshandleidput) | **PUT** api/v1/contributors/{contributorId}/snshandles/{snshandleId} | Update contributor SNShandle
*ContributorsApi* | [**apiV1ContributorsAuthorizedContributorIdGet**](docs/ContributorsApi.md#apiv1contributorsauthorizedcontributoridget) | **GET** api/v1/contributors/authorized/{contributorId} | 
*ContributorsApi* | [**apiV1ContributorsAuthorizedGet**](docs/ContributorsApi.md#apiv1contributorsauthorizedget) | **GET** api/v1/contributors/authorized | 
*ContributorsApi* | [**apiV1ContributorsAuthorizedSlugGet**](docs/ContributorsApi.md#apiv1contributorsauthorizedslugget) | **GET** api/v1/contributors/authorized/{slug} | 
*ContributorsApi* | [**apiV1ContributorsContributorIdDelete**](docs/ContributorsApi.md#apiv1contributorscontributoriddelete) | **DELETE** api/v1/contributors/{contributorId} | Delete contributor
*ContributorsApi* | [**apiV1ContributorsContributorIdGet**](docs/ContributorsApi.md#apiv1contributorscontributoridget) | **GET** api/v1/contributors/{contributorId} | Get contributor.
*ContributorsApi* | [**apiV1ContributorsContributorIdPut**](docs/ContributorsApi.md#apiv1contributorscontributoridput) | **PUT** api/v1/contributors/{contributorId} | Update contributor
*ContributorsApi* | [**apiV1ContributorsGet**](docs/ContributorsApi.md#apiv1contributorsget) | **GET** api/v1/contributors | Get all contributors.
*ContributorsApi* | [**apiV1ContributorsPost**](docs/ContributorsApi.md#apiv1contributorspost) | **POST** api/v1/contributors | Create contributor
*ContributorsApi* | [**apiV1ContributorsSlugsSlugGet**](docs/ContributorsApi.md#apiv1contributorsslugsslugget) | **GET** api/v1/contributors/slugs/{slug} | Get contributor by slug.
*CountriesApi* | [**apiV1CountriesCountryIdDelete**](docs/CountriesApi.md#apiv1countriescountryiddelete) | **DELETE** api/v1/countries/{countryId} | Delete country.
*CountriesApi* | [**apiV1CountriesCountryIdGet**](docs/CountriesApi.md#apiv1countriescountryidget) | **GET** api/v1/countries/{countryId} | Get country.
*CountriesApi* | [**apiV1CountriesCountryIdPut**](docs/CountriesApi.md#apiv1countriescountryidput) | **PUT** api/v1/countries/{countryId} | Update country.
*CountriesApi* | [**apiV1CountriesGet**](docs/CountriesApi.md#apiv1countriesget) | **GET** api/v1/countries | Get all countries.
*CountriesApi* | [**apiV1CountriesPost**](docs/CountriesApi.md#apiv1countriespost) | **POST** api/v1/countries | Create a country.
*CountriesApi* | [**apiV1CountriesSlugsSlugGet**](docs/CountriesApi.md#apiv1countriesslugsslugget) | **GET** api/v1/countries/slugs/{slug} | Get country by slug.
*CountryLocalesApi* | [**apiV1CountriesCountryIdLocalesLanguageCodeGet**](docs/CountryLocalesApi.md#apiv1countriescountryidlocaleslanguagecodeget) | **GET** api/v1/countries/{countryId}/locales/{languageCode} | Get country locale
*CountryLocalesApi* | [**apiV1CountriesCountryIdLocalesLanguageCodePut**](docs/CountryLocalesApi.md#apiv1countriescountryidlocaleslanguagecodeput) | **PUT** api/v1/countries/{countryId}/locales/{languageCode} | Update country locale
*DealPackagesApi* | [**apiV1DealsDealIdPackagesPackageIdDelete**](docs/DealPackagesApi.md#apiv1dealsdealidpackagespackageiddelete) | **DELETE** api/v1/deals/{dealId}/packages/{packageId} | Delete deal package.
*DealPackagesApi* | [**apiV1DealsDealIdPackagesPackageIdGet**](docs/DealPackagesApi.md#apiv1dealsdealidpackagespackageidget) | **GET** api/v1/deals/{dealId}/packages/{packageId} | Get deal package.
*DealPackagesApi* | [**apiV1DealsDealIdPackagesPackageIdPut**](docs/DealPackagesApi.md#apiv1dealsdealidpackagespackageidput) | **PUT** api/v1/deals/{dealId}/packages/{packageId} | Update deal package.
*DealPackagesApi* | [**apiV1DealsDealIdPackagesPost**](docs/DealPackagesApi.md#apiv1dealsdealidpackagespost) | **POST** api/v1/deals/{dealId}/packages | Create deal package.
*DealsApi* | [**apiV1DealsDealIdDelete**](docs/DealsApi.md#apiv1dealsdealiddelete) | **DELETE** api/v1/deals/{dealId} | Delete deal.
*DealsApi* | [**apiV1DealsDealIdGet**](docs/DealsApi.md#apiv1dealsdealidget) | **GET** api/v1/deals/{dealId} | Get deal.
*DealsApi* | [**apiV1DealsDealIdPut**](docs/DealsApi.md#apiv1dealsdealidput) | **PUT** api/v1/deals/{dealId} | Update deal.
*DealsApi* | [**apiV1DealsGet**](docs/DealsApi.md#apiv1dealsget) | **GET** api/v1/deals | Get all deals.
*DealsApi* | [**apiV1DealsPost**](docs/DealsApi.md#apiv1dealspost) | **POST** api/v1/deals | Create deal.
*DealsApi* | [**apiV1DealsSlugsSlugGet**](docs/DealsApi.md#apiv1dealsslugsslugget) | **GET** api/v1/deals/slugs/{slug} | Get deal by slug.
*DepartmentApi* | [**apiV1HospitalsDepartmentsGet**](docs/DepartmentApi.md#apiv1hospitalsdepartmentsget) | **GET** api/v1/hospitals/departments | Get all department.
*DepartmentApi* | [**apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete**](docs/DepartmentApi.md#apiv1hospitalshospitaliddepartmentsdepartmentiddelete) | **DELETE** api/v1/hospitals/{hospitalId}/departments/{departmentId} | Delete department.
*DepartmentApi* | [**apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet**](docs/DepartmentApi.md#apiv1hospitalshospitaliddepartmentsdepartmentidget) | **GET** api/v1/hospitals/{hospitalId}/departments/{departmentId} | Get department.
*DepartmentApi* | [**apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost**](docs/DepartmentApi.md#apiv1hospitalshospitaliddepartmentsdepartmentidpost) | **POST** api/v1/hospitals/{hospitalId}/departments/{departmentId} | Create department.
*DepartmentApi* | [**apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut**](docs/DepartmentApi.md#apiv1hospitalshospitaliddepartmentsdepartmentidput) | **PUT** api/v1/hospitals/{hospitalId}/departments/{departmentId} | Update department.
*DevicesApi* | [**apiV1DevicesGet**](docs/DevicesApi.md#apiv1devicesget) | **GET** api/v1/devices | Get all devices.
*DevicesApi* | [**apiV1DevicesIdDelete**](docs/DevicesApi.md#apiv1devicesiddelete) | **DELETE** api/v1/devices/{id} | Delete device.
*DevicesApi* | [**apiV1DevicesIdGet**](docs/DevicesApi.md#apiv1devicesidget) | **GET** api/v1/devices/{id} | Get device.
*DevicesApi* | [**apiV1DevicesIdLoginsPost**](docs/DevicesApi.md#apiv1devicesidloginspost) | **POST** api/v1/devices/{id}/logins | Create device login.
*DevicesApi* | [**apiV1DevicesIdPut**](docs/DevicesApi.md#apiv1devicesidput) | **PUT** api/v1/devices/{id} | Update device.
*DevicesApi* | [**apiV1DevicesPost**](docs/DevicesApi.md#apiv1devicespost) | **POST** api/v1/devices | Create device.
*DoctorCertificatesApi* | [**apiV1DoctorsCertificatesGet**](docs/DoctorCertificatesApi.md#apiv1doctorscertificatesget) | **GET** api/v1/doctors/certificates | Get all certificates.
*DoctorCertificatesApi* | [**apiV1DoctorsDoctorIdCertificatesCertificateIdDelete**](docs/DoctorCertificatesApi.md#apiv1doctorsdoctoridcertificatescertificateiddelete) | **DELETE** api/v1/doctors/{doctorId}/certificates/{certificateId} | Delete certificate.
*DoctorCertificatesApi* | [**apiV1DoctorsDoctorIdCertificatesCertificateIdGet**](docs/DoctorCertificatesApi.md#apiv1doctorsdoctoridcertificatescertificateidget) | **GET** api/v1/doctors/{doctorId}/certificates/{certificateId} | Get certificate.
*DoctorCertificatesApi* | [**apiV1DoctorsDoctorIdCertificatesCertificateIdPut**](docs/DoctorCertificatesApi.md#apiv1doctorsdoctoridcertificatescertificateidput) | **PUT** api/v1/doctors/{doctorId}/certificates/{certificateId} | Update department.
*DoctorCertificatesApi* | [**apiV1DoctorsDoctorIdCertificatesPost**](docs/DoctorCertificatesApi.md#apiv1doctorsdoctoridcertificatespost) | **POST** api/v1/doctors/{doctorId}/certificates | Create certificate.
*DoctorEducationsApi* | [**apiV1DoctorseducationsDoctorIdEducationsEducationIdDelete**](docs/DoctorEducationsApi.md#apiv1doctorseducationsdoctorideducationseducationiddelete) | **DELETE** api/v1/doctorseducations/{doctorId}/educations/{educationId} | Delete Education.
*DoctorEducationsApi* | [**apiV1DoctorseducationsDoctorIdEducationsEducationIdGet**](docs/DoctorEducationsApi.md#apiv1doctorseducationsdoctorideducationseducationidget) | **GET** api/v1/doctorseducations/{doctorId}/educations/{educationId} | Get education.
*DoctorEducationsApi* | [**apiV1DoctorseducationsDoctorIdEducationsEducationIdPut**](docs/DoctorEducationsApi.md#apiv1doctorseducationsdoctorideducationseducationidput) | **PUT** api/v1/doctorseducations/{doctorId}/educations/{educationId} | Update department.
*DoctorEducationsApi* | [**apiV1DoctorseducationsDoctorIdEducationsPost**](docs/DoctorEducationsApi.md#apiv1doctorseducationsdoctorideducationspost) | **POST** api/v1/doctorseducations/{doctorId}/educations | Create education.
*DoctorEducationsApi* | [**apiV1DoctorseducationsEducationsGet**](docs/DoctorEducationsApi.md#apiv1doctorseducationseducationsget) | **GET** api/v1/doctorseducations/educations | Get all educations.
*DoctorLocalesApi* | [**apiV1DoctorsDoctorIdLocalesLanguageCodeGet**](docs/DoctorLocalesApi.md#apiv1doctorsdoctoridlocaleslanguagecodeget) | **GET** api/v1/doctors/{doctorId}/locales/{languageCode} | Get doctor locale
*DoctorLocalesApi* | [**apiV1DoctorsDoctorIdLocalesLanguageCodePut**](docs/DoctorLocalesApi.md#apiv1doctorsdoctoridlocaleslanguagecodeput) | **PUT** api/v1/doctors/{doctorId}/locales/{languageCode} | Update doctor locale
*DoctorMediasApi* | [**apiV1DoctorsDoctorIdMediasGet**](docs/DoctorMediasApi.md#apiv1doctorsdoctoridmediasget) | **GET** api/v1/doctors/{doctorId}/medias | 
*DoctorMediasApi* | [**apiV1DoctorsDoctorIdMediasMediaIdDelete**](docs/DoctorMediasApi.md#apiv1doctorsdoctoridmediasmediaiddelete) | **DELETE** api/v1/doctors/{doctorId}/medias/{mediaId} | 
*DoctorMediasApi* | [**apiV1DoctorsDoctorIdMediasMediaIdPut**](docs/DoctorMediasApi.md#apiv1doctorsdoctoridmediasmediaidput) | **PUT** api/v1/doctors/{doctorId}/medias/{mediaId} | 
*DoctorMediasApi* | [**apiV1DoctorsDoctorIdMediasPost**](docs/DoctorMediasApi.md#apiv1doctorsdoctoridmediaspost) | **POST** api/v1/doctors/{doctorId}/medias | 
*DoctorMediasApi* | [**apiV1DoctorsDoctorIdMediasequencePut**](docs/DoctorMediasApi.md#apiv1doctorsdoctoridmediasequenceput) | **PUT** api/v1/doctors/{doctorId}/mediasequence | 
*DoctorPortfoliosApi* | [**apiV1DoctorsDoctorIdPortfoliosPortfolioIdDelete**](docs/DoctorPortfoliosApi.md#apiv1doctorsdoctoridportfoliosportfolioiddelete) | **DELETE** api/v1/doctors/{doctorId}/portfolios/{portfolioId} | Delete DoctorPortfolio
*DoctorPortfoliosApi* | [**apiV1DoctorsDoctorIdPortfoliosPortfolioIdGet**](docs/DoctorPortfoliosApi.md#apiv1doctorsdoctoridportfoliosportfolioidget) | **GET** api/v1/doctors/{doctorId}/portfolios/{portfolioId} | Get DoctorPortfolio
*DoctorPortfoliosApi* | [**apiV1DoctorsDoctorIdPortfoliosPortfolioIdPut**](docs/DoctorPortfoliosApi.md#apiv1doctorsdoctoridportfoliosportfolioidput) | **PUT** api/v1/doctors/{doctorId}/portfolios/{portfolioId} | Update DoctorPortfolio
*DoctorPortfoliosApi* | [**apiV1DoctorsDoctorIdPortfoliosPost**](docs/DoctorPortfoliosApi.md#apiv1doctorsdoctoridportfoliospost) | **POST** api/v1/doctors/{doctorId}/portfolios | Create DoctorPortfolios
*DoctorPortfoliosApi* | [**apiV1DoctorsPortfoliosGet**](docs/DoctorPortfoliosApi.md#apiv1doctorsportfoliosget) | **GET** api/v1/doctors/portfolios | Get All DoctorPortfolios
*DoctorReviewsApi* | [**apiV1DoctorsDoctorIdReviewsPatientIdDelete**](docs/DoctorReviewsApi.md#apiv1doctorsdoctoridreviewspatientiddelete) | **DELETE** api/v1/doctors/{doctorId}/reviews/{patientId} | Delete review.
*DoctorReviewsApi* | [**apiV1DoctorsDoctorIdReviewsPatientIdGet**](docs/DoctorReviewsApi.md#apiv1doctorsdoctoridreviewspatientidget) | **GET** api/v1/doctors/{doctorId}/reviews/{patientId} | Get review.
*DoctorReviewsApi* | [**apiV1DoctorsDoctorIdReviewsPatientIdPut**](docs/DoctorReviewsApi.md#apiv1doctorsdoctoridreviewspatientidput) | **PUT** api/v1/doctors/{doctorId}/reviews/{patientId} | Update review.
*DoctorReviewsApi* | [**apiV1DoctorsDoctorIdReviewsPost**](docs/DoctorReviewsApi.md#apiv1doctorsdoctoridreviewspost) | **POST** api/v1/doctors/{doctorId}/reviews | Create review.
*DoctorReviewsApi* | [**apiV1DoctorsReviewsGet**](docs/DoctorReviewsApi.md#apiv1doctorsreviewsget) | **GET** api/v1/doctors/reviews | Get all reviews.
*DoctorSpecialtiesApi* | [**apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdDelete**](docs/DoctorSpecialtiesApi.md#apiv1doctorsdoctoridspecialtiesspecialtyiddelete) | **DELETE** api/v1/doctors/{doctorId}/specialties/{specialtyId} | Remove link between the doctor and the specialty.
*DoctorSpecialtiesApi* | [**apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdGet**](docs/DoctorSpecialtiesApi.md#apiv1doctorsdoctoridspecialtiesspecialtyidget) | **GET** api/v1/doctors/{doctorId}/specialties/{specialtyId} | Get DoctorSpecialty
*DoctorSpecialtiesApi* | [**apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdPost**](docs/DoctorSpecialtiesApi.md#apiv1doctorsdoctoridspecialtiesspecialtyidpost) | **POST** api/v1/doctors/{doctorId}/specialties/{specialtyId} | Link a doctor to a specialty.
*DoctorSpecialtiesApi* | [**apiV1DoctorsSpecialtiesGet**](docs/DoctorSpecialtiesApi.md#apiv1doctorsspecialtiesget) | **GET** api/v1/doctors/specialties | Get All DoctorSpecialties
*DoctorsApi* | [**apiV1DoctorsDoctorIdDelete**](docs/DoctorsApi.md#apiv1doctorsdoctoriddelete) | **DELETE** api/v1/doctors/{doctorId} | Delete doctor.
*DoctorsApi* | [**apiV1DoctorsDoctorIdGet**](docs/DoctorsApi.md#apiv1doctorsdoctoridget) | **GET** api/v1/doctors/{doctorId} | Get hospital doctor.
*DoctorsApi* | [**apiV1DoctorsDoctorIdPut**](docs/DoctorsApi.md#apiv1doctorsdoctoridput) | **PUT** api/v1/doctors/{doctorId} | Update hospital doctor.
*DoctorsApi* | [**apiV1DoctorsGet**](docs/DoctorsApi.md#apiv1doctorsget) | **GET** api/v1/doctors | Get all hospital doctors.
*DoctorsApi* | [**apiV1DoctorsPost**](docs/DoctorsApi.md#apiv1doctorspost) | **POST** api/v1/doctors | Create hospital doctor.
*DoctorsApi* | [**apiV1DoctorsSlugsSlugGet**](docs/DoctorsApi.md#apiv1doctorsslugsslugget) | **GET** api/v1/doctors/slugs/{slug} | Get hospital doctor by slug.
*EquipmentsApi* | [**apiV1HospitalsEquipmentsGet**](docs/EquipmentsApi.md#apiv1hospitalsequipmentsget) | **GET** api/v1/hospitals/equipments | Get all equipments.
*EquipmentsApi* | [**apiV1HospitalsHospitalIdEquipmentsEquipmentIdDelete**](docs/EquipmentsApi.md#apiv1hospitalshospitalidequipmentsequipmentiddelete) | **DELETE** api/v1/hospitals/{hospitalId}/equipments/{equipmentId} | Delete equipment.
*EquipmentsApi* | [**apiV1HospitalsHospitalIdEquipmentsEquipmentIdGet**](docs/EquipmentsApi.md#apiv1hospitalshospitalidequipmentsequipmentidget) | **GET** api/v1/hospitals/{hospitalId}/equipments/{equipmentId} | Get equipment.
*EquipmentsApi* | [**apiV1HospitalsHospitalIdEquipmentsEquipmentIdPut**](docs/EquipmentsApi.md#apiv1hospitalshospitalidequipmentsequipmentidput) | **PUT** api/v1/hospitals/{hospitalId}/equipments/{equipmentId} | Update equipment.
*EquipmentsApi* | [**apiV1HospitalsHospitalIdEquipmentsPost**](docs/EquipmentsApi.md#apiv1hospitalshospitalidequipmentspost) | **POST** api/v1/hospitals/{hospitalId}/equipments | Create an equipment and add to a hospital.
*ExternalApi* | [**apiV1ExternalFacebookDeleteuserdataPost**](docs/ExternalApi.md#apiv1externalfacebookdeleteuserdatapost) | **POST** api/v1/external/facebook/deleteuserdata | Callback for Facebook user data deletion
*FaqCategoriesApi* | [**apiV1FaqcategoriesFaqCategoryIdGet**](docs/FaqCategoriesApi.md#apiv1faqcategoriesfaqcategoryidget) | **GET** api/v1/faqcategories/{faqCategoryId} | Get faqCategory.
*FaqCategoriesApi* | [**apiV1FaqcategoriesGet**](docs/FaqCategoriesApi.md#apiv1faqcategoriesget) | **GET** api/v1/faqcategories | Get all faqCategory.
*FaqCategoriesApi* | [**apiV1FaqcategoriesSlugsSlugGet**](docs/FaqCategoriesApi.md#apiv1faqcategoriesslugsslugget) | **GET** api/v1/faqcategories/slugs/{slug} | Get faqCategory by slug.
*FaqCategoryLocalesApi* | [**apiV1FaqcategoriesFaqCategoryIdLocalesLanguageCodeGet**](docs/FaqCategoryLocalesApi.md#apiv1faqcategoriesfaqcategoryidlocaleslanguagecodeget) | **GET** api/v1/faqcategories/{faqCategoryId}/locales/{languageCode} | Get faqCategory locale
*FaqCategoryLocalesApi* | [**apiV1FaqcategoriesFaqCategoryIdLocalesLanguageCodePut**](docs/FaqCategoryLocalesApi.md#apiv1faqcategoriesfaqcategoryidlocaleslanguagecodeput) | **PUT** api/v1/faqcategories/{faqCategoryId}/locales/{languageCode} | Update faqCategory locale
*FaqLocalesApi* | [**apiV1FaqsFaqIdLocalesLanguageCodeGet**](docs/FaqLocalesApi.md#apiv1faqsfaqidlocaleslanguagecodeget) | **GET** api/v1/faqs/{faqId}/locales/{languageCode} | Get faq locale
*FaqLocalesApi* | [**apiV1FaqsFaqIdLocalesLanguageCodePut**](docs/FaqLocalesApi.md#apiv1faqsfaqidlocaleslanguagecodeput) | **PUT** api/v1/faqs/{faqId}/locales/{languageCode} | Update faq locale
*FaqsApi* | [**apiV1FaqsFaqIdGet**](docs/FaqsApi.md#apiv1faqsfaqidget) | **GET** api/v1/faqs/{faqId} | Get faq.
*FaqsApi* | [**apiV1FaqsGet**](docs/FaqsApi.md#apiv1faqsget) | **GET** api/v1/faqs | Get all faq.
*FaqsApi* | [**apiV1FaqsSlugsSlugGet**](docs/FaqsApi.md#apiv1faqsslugsslugget) | **GET** api/v1/faqs/slugs/{slug} | Get faq by slug.
*GroupChannelsApi* | [**apiV1GroupchannelsChannelUrlInvitePost**](docs/GroupChannelsApi.md#apiv1groupchannelschannelurlinvitepost) | **POST** api/v1/groupchannels/{channelUrl}/invite | 
*GroupChannelsApi* | [**apiV1GroupchannelsDealDealIdGet**](docs/GroupChannelsApi.md#apiv1groupchannelsdealdealidget) | **GET** api/v1/groupchannels/deal/{dealId} | 
*GroupChannelsApi* | [**apiV1GroupchannelsDealDealIdPost**](docs/GroupChannelsApi.md#apiv1groupchannelsdealdealidpost) | **POST** api/v1/groupchannels/deal/{dealId} | 
*GroupChannelsApi* | [**apiV1GroupchannelsDoctorDoctorIdGet**](docs/GroupChannelsApi.md#apiv1groupchannelsdoctordoctoridget) | **GET** api/v1/groupchannels/doctor/{doctorId} | 
*GroupChannelsApi* | [**apiV1GroupchannelsDoctorDoctorIdPost**](docs/GroupChannelsApi.md#apiv1groupchannelsdoctordoctoridpost) | **POST** api/v1/groupchannels/doctor/{doctorId} | 
*GroupChannelsApi* | [**apiV1GroupchannelsHospitalHospitalIdGet**](docs/GroupChannelsApi.md#apiv1groupchannelshospitalhospitalidget) | **GET** api/v1/groupchannels/hospital/{hospitalId} | 
*GroupChannelsApi* | [**apiV1GroupchannelsHospitalHospitalIdPost**](docs/GroupChannelsApi.md#apiv1groupchannelshospitalhospitalidpost) | **POST** api/v1/groupchannels/hospital/{hospitalId} | 
*GroupChannelsApi* | [**apiV1GroupchannelsIdGet**](docs/GroupChannelsApi.md#apiv1groupchannelsidget) | **GET** api/v1/groupchannels/{id} | 
*HospitalAccreditationsApi* | [**apiV1HospitalsHospitalIdAccreditationsAccreditationIdDelete**](docs/HospitalAccreditationsApi.md#apiv1hospitalshospitalidaccreditationsaccreditationiddelete) | **DELETE** api/v1/hospitals/{hospitalId}/accreditations/{accreditationId} | 
*HospitalAccreditationsApi* | [**apiV1HospitalsHospitalIdAccreditationsAccreditationIdPost**](docs/HospitalAccreditationsApi.md#apiv1hospitalshospitalidaccreditationsaccreditationidpost) | **POST** api/v1/hospitals/{hospitalId}/accreditations/{accreditationId} | 
*HospitalAccreditationsApi* | [**apiV1HospitalsHospitalIdAccreditationsGet**](docs/HospitalAccreditationsApi.md#apiv1hospitalshospitalidaccreditationsget) | **GET** api/v1/hospitals/{hospitalId}/accreditations | 
*HospitalLocalesApi* | [**apiV1HospitalsHospitalIdLocalesLanguageCodeGet**](docs/HospitalLocalesApi.md#apiv1hospitalshospitalidlocaleslanguagecodeget) | **GET** api/v1/hospitals/{hospitalId}/locales/{languageCode} | Get hospital locale
*HospitalLocalesApi* | [**apiV1HospitalsHospitalIdLocalesLanguageCodePut**](docs/HospitalLocalesApi.md#apiv1hospitalshospitalidlocaleslanguagecodeput) | **PUT** api/v1/hospitals/{hospitalId}/locales/{languageCode} | Update hospital locale
*HospitalMediasApi* | [**apiV1HospitalsHospitalIdMediasGet**](docs/HospitalMediasApi.md#apiv1hospitalshospitalidmediasget) | **GET** api/v1/hospitals/{hospitalId}/medias | 
*HospitalMediasApi* | [**apiV1HospitalsHospitalIdMediasMediaIdDelete**](docs/HospitalMediasApi.md#apiv1hospitalshospitalidmediasmediaiddelete) | **DELETE** api/v1/hospitals/{hospitalId}/medias/{mediaId} | 
*HospitalMediasApi* | [**apiV1HospitalsHospitalIdMediasMediaIdPut**](docs/HospitalMediasApi.md#apiv1hospitalshospitalidmediasmediaidput) | **PUT** api/v1/hospitals/{hospitalId}/medias/{mediaId} | 
*HospitalMediasApi* | [**apiV1HospitalsHospitalIdMediasPost**](docs/HospitalMediasApi.md#apiv1hospitalshospitalidmediaspost) | **POST** api/v1/hospitals/{hospitalId}/medias | 
*HospitalMediasApi* | [**apiV1HospitalsHospitalIdMediasequencePut**](docs/HospitalMediasApi.md#apiv1hospitalshospitalidmediasequenceput) | **PUT** api/v1/hospitals/{hospitalId}/mediasequence | 
*HospitalReviewsApi* | [**apiV1HospitalsHospitalIdReviewsPatientIdDelete**](docs/HospitalReviewsApi.md#apiv1hospitalshospitalidreviewspatientiddelete) | **DELETE** api/v1/hospitals/{hospitalId}/reviews/{patientId} | Delete review.
*HospitalReviewsApi* | [**apiV1HospitalsHospitalIdReviewsPatientIdGet**](docs/HospitalReviewsApi.md#apiv1hospitalshospitalidreviewspatientidget) | **GET** api/v1/hospitals/{hospitalId}/reviews/{patientId} | Get review.
*HospitalReviewsApi* | [**apiV1HospitalsHospitalIdReviewsPatientIdPut**](docs/HospitalReviewsApi.md#apiv1hospitalshospitalidreviewspatientidput) | **PUT** api/v1/hospitals/{hospitalId}/reviews/{patientId} | Update review.
*HospitalReviewsApi* | [**apiV1HospitalsHospitalIdReviewsPost**](docs/HospitalReviewsApi.md#apiv1hospitalshospitalidreviewspost) | **POST** api/v1/hospitals/{hospitalId}/reviews | Create review.
*HospitalReviewsApi* | [**apiV1HospitalsReviewsGet**](docs/HospitalReviewsApi.md#apiv1hospitalsreviewsget) | **GET** api/v1/hospitals/reviews | Get all reviews.
*HospitalSpecialtiesApi* | [**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdDelete**](docs/HospitalSpecialtiesApi.md#apiv1hospitalshospitalidspecialtiesspecialtyiddelete) | **DELETE** api/v1/hospitals/{hospitalId}/specialties/{specialtyId} | Delete hospitalSpecialty.
*HospitalSpecialtiesApi* | [**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPost**](docs/HospitalSpecialtiesApi.md#apiv1hospitalshospitalidspecialtiesspecialtyidpost) | **POST** api/v1/hospitals/{hospitalId}/specialties/{specialtyId} | Create hospitalSpecialty.
*HospitalSpecialtiesApi* | [**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPut**](docs/HospitalSpecialtiesApi.md#apiv1hospitalshospitalidspecialtiesspecialtyidput) | **PUT** api/v1/hospitals/{hospitalId}/specialties/{specialtyId} | Update hospitalSpecialty.
*HospitalSpecialtiesApi* | [**apiV1HospitalsSpecialtiesGet**](docs/HospitalSpecialtiesApi.md#apiv1hospitalsspecialtiesget) | **GET** api/v1/hospitals/specialties | Get all hospitalSpecialties.
*HospitalsApi* | [**apiV1HospitalsCurrentGet**](docs/HospitalsApi.md#apiv1hospitalscurrentget) | **GET** api/v1/hospitals/current | 
*HospitalsApi* | [**apiV1HospitalsGet**](docs/HospitalsApi.md#apiv1hospitalsget) | **GET** api/v1/hospitals | Get all hospitals.
*HospitalsApi* | [**apiV1HospitalsHospitalIdDelete**](docs/HospitalsApi.md#apiv1hospitalshospitaliddelete) | **DELETE** api/v1/hospitals/{hospitalId} | Delete hospital.
*HospitalsApi* | [**apiV1HospitalsHospitalIdGet**](docs/HospitalsApi.md#apiv1hospitalshospitalidget) | **GET** api/v1/hospitals/{hospitalId} | Get hospita.
*HospitalsApi* | [**apiV1HospitalsHospitalIdPut**](docs/HospitalsApi.md#apiv1hospitalshospitalidput) | **PUT** api/v1/hospitals/{hospitalId} | Update hospital.
*HospitalsApi* | [**apiV1HospitalsPost**](docs/HospitalsApi.md#apiv1hospitalspost) | **POST** api/v1/hospitals | Create a hospital.
*HospitalsApi* | [**apiV1HospitalsSlugsSlugGet**](docs/HospitalsApi.md#apiv1hospitalsslugsslugget) | **GET** api/v1/hospitals/slugs/{slug} | Get hospital by slug.
*IdentityApi* | [**apiV1IdentityGet**](docs/IdentityApi.md#apiv1identityget) | **GET** api/v1/identity | Get current user's Identity claims.
*ImagesApi* | [**apiV1ImagesPost**](docs/ImagesApi.md#apiv1imagespost) | **POST** api/v1/images | 
*LanguagesApi* | [**apiV1LanguagesCodeGet**](docs/LanguagesApi.md#apiv1languagescodeget) | **GET** api/v1/languages/{code} | Get a language by code
*LanguagesApi* | [**apiV1LanguagesGet**](docs/LanguagesApi.md#apiv1languagesget) | **GET** api/v1/languages | Get all languages.
*LanguagesApi* | [**apiV1LanguagesIdGet**](docs/LanguagesApi.md#apiv1languagesidget) | **GET** api/v1/languages/{id} | Get a language by id
*ManagersApi* | [**apiV1ManagersGet**](docs/ManagersApi.md#apiv1managersget) | **GET** api/v1/managers | Get all hospital managers.
*ManagersApi* | [**apiV1ManagersManagerIdDelete**](docs/ManagersApi.md#apiv1managersmanageriddelete) | **DELETE** api/v1/managers/{managerId} | Delete hospital manager.
*ManagersApi* | [**apiV1ManagersManagerIdGet**](docs/ManagersApi.md#apiv1managersmanageridget) | **GET** api/v1/managers/{managerId} | Get hospital manager.
*ManagersApi* | [**apiV1ManagersManagerIdPut**](docs/ManagersApi.md#apiv1managersmanageridput) | **PUT** api/v1/managers/{managerId} | Update hospital manager.
*ManagersApi* | [**apiV1ManagersPost**](docs/ManagersApi.md#apiv1managerspost) | **POST** api/v1/managers | Create hospital manager.
*MembershipsApi* | [**apiV1MembershipsCurrentGet**](docs/MembershipsApi.md#apiv1membershipscurrentget) | **GET** api/v1/memberships/current | 
*MembershipsApi* | [**apiV1MembershipsDelete**](docs/MembershipsApi.md#apiv1membershipsdelete) | **DELETE** api/v1/memberships | 
*MembershipsApi* | [**apiV1MembershipsInvitationsGet**](docs/MembershipsApi.md#apiv1membershipsinvitationsget) | **GET** api/v1/memberships/invitations | 
*MembershipsApi* | [**apiV1MembershipsInvitationsInvitationIdDelete**](docs/MembershipsApi.md#apiv1membershipsinvitationsinvitationiddelete) | **DELETE** api/v1/memberships/invitations/{invitationId} | 
*MembershipsApi* | [**apiV1MembershipsInvitationsPost**](docs/MembershipsApi.md#apiv1membershipsinvitationspost) | **POST** api/v1/memberships/invitations | 
*MembershipsApi* | [**apiV1MembershipsMembersGet**](docs/MembershipsApi.md#apiv1membershipsmembersget) | **GET** api/v1/memberships/members | 
*MembershipsApi* | [**apiV1MembershipsMembersPatientIdDelete**](docs/MembershipsApi.md#apiv1membershipsmemberspatientiddelete) | **DELETE** api/v1/memberships/members/{patientId} | 
*MembershipsApi* | [**apiV1MembershipsPlanIdPost**](docs/MembershipsApi.md#apiv1membershipsplanidpost) | **POST** api/v1/memberships/{planId} | 
*MoviesApi* | [**apiV1MoviesPost**](docs/MoviesApi.md#apiv1moviespost) | **POST** api/v1/movies | 
*NotificationsApi* | [**apiV1NotificationsCheckPost**](docs/NotificationsApi.md#apiv1notificationscheckpost) | **POST** api/v1/notifications/check | Check notification.
*NotificationsApi* | [**apiV1NotificationsGet**](docs/NotificationsApi.md#apiv1notificationsget) | **GET** api/v1/notifications | Get all notifications.
*PartnersApi* | [**apiV1PartnersGet**](docs/PartnersApi.md#apiv1partnersget) | **GET** api/v1/partners | Get all partners.
*PartnersApi* | [**apiV1PartnersPartnerIdDelete**](docs/PartnersApi.md#apiv1partnerspartneriddelete) | **DELETE** api/v1/partners/{partnerId} | Delete patner.
*PartnersApi* | [**apiV1PartnersPartnerIdGet**](docs/PartnersApi.md#apiv1partnerspartneridget) | **GET** api/v1/partners/{partnerId} | Get partner.
*PartnersApi* | [**apiV1PartnersPartnerIdPut**](docs/PartnersApi.md#apiv1partnerspartneridput) | **PUT** api/v1/partners/{partnerId} | Update partner.
*PartnersApi* | [**apiV1PartnersPost**](docs/PartnersApi.md#apiv1partnerspost) | **POST** api/v1/partners | Create partner.
*PatientsApi* | [**apiV1PatientsGet**](docs/PatientsApi.md#apiv1patientsget) | **GET** api/v1/patients | Get all patients.
*PatientsApi* | [**apiV1PatientsHealthprofileGet**](docs/PatientsApi.md#apiv1patientshealthprofileget) | **GET** api/v1/patients/healthprofile | Get health profile for patient.
*PatientsApi* | [**apiV1PatientsHealthprofilePut**](docs/PatientsApi.md#apiv1patientshealthprofileput) | **PUT** api/v1/patients/healthprofile | Update health profile for patient.
*PatientsApi* | [**apiV1PatientsPatientIdDelete**](docs/PatientsApi.md#apiv1patientspatientiddelete) | **DELETE** api/v1/patients/{patientId} | Delete patient.
*PatientsApi* | [**apiV1PatientsPatientIdGet**](docs/PatientsApi.md#apiv1patientspatientidget) | **GET** api/v1/patients/{patientId} | Get patient.
*PatientsApi* | [**apiV1PatientsPatientIdPut**](docs/PatientsApi.md#apiv1patientspatientidput) | **PUT** api/v1/patients/{patientId} | Update patient.
*PatientsApi* | [**apiV1PatientsPost**](docs/PatientsApi.md#apiv1patientspost) | **POST** api/v1/patients | Create patient.
*PlansApi* | [**apiV1PlansGet**](docs/PlansApi.md#apiv1plansget) | **GET** api/v1/plans | Get all plans.
*PlansApi* | [**apiV1PlansPlanIdGet**](docs/PlansApi.md#apiv1plansplanidget) | **GET** api/v1/plans/{planId} | Get plan.
*PlansApi* | [**apiV1PlansPlanIdHospitalsGet**](docs/PlansApi.md#apiv1plansplanidhospitalsget) | **GET** api/v1/plans/{planId}/hospitals | Get all partner hospitals
*ProfilesApi* | [**apiV1ProfilesChangeemailPost**](docs/ProfilesApi.md#apiv1profileschangeemailpost) | **POST** api/v1/profiles/changeemail | Change user's email on both Identity and Api.
*ProfilesApi* | [**apiV1ProfilesConfirmemailPost**](docs/ProfilesApi.md#apiv1profilesconfirmemailpost) | **POST** api/v1/profiles/confirmemail | 
*ProfilesApi* | [**apiV1ProfilesGet**](docs/ProfilesApi.md#apiv1profilesget) | **GET** api/v1/profiles | Get current user's profile.
*QuestionCommentsApi* | [**apiV1QuestionsQuestionIdQuestioncommentsGet**](docs/QuestionCommentsApi.md#apiv1questionsquestionidquestioncommentsget) | **GET** api/v1/questions/{questionId}/questioncomments | Get all questionComment.
*QuestionCommentsApi* | [**apiV1QuestionsQuestionIdQuestioncommentsPost**](docs/QuestionCommentsApi.md#apiv1questionsquestionidquestioncommentspost) | **POST** api/v1/questions/{questionId}/questioncomments | Create an questionComment.
*QuestionCommentsApi* | [**apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdDelete**](docs/QuestionCommentsApi.md#apiv1questionsquestionidquestioncommentsquestioncommentiddelete) | **DELETE** api/v1/questions/{questionId}/questioncomments/{questionCommentId} | Delete questionComment.
*QuestionCommentsApi* | [**apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdGet**](docs/QuestionCommentsApi.md#apiv1questionsquestionidquestioncommentsquestioncommentidget) | **GET** api/v1/questions/{questionId}/questioncomments/{questionCommentId} | Get questionComment.
*QuestionCommentsApi* | [**apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdPut**](docs/QuestionCommentsApi.md#apiv1questionsquestionidquestioncommentsquestioncommentidput) | **PUT** api/v1/questions/{questionId}/questioncomments/{questionCommentId} | Update questionComment.
*QuestionsApi* | [**apiV1HospitalsHospitalIdQuestionsPost**](docs/QuestionsApi.md#apiv1hospitalshospitalidquestionspost) | **POST** api/v1/hospitals/{hospitalId}/questions | Create an question.
*QuestionsApi* | [**apiV1HospitalsHospitalIdQuestionsQuestionIdDelete**](docs/QuestionsApi.md#apiv1hospitalshospitalidquestionsquestioniddelete) | **DELETE** api/v1/hospitals/{hospitalId}/questions/{questionId} | Delete question.
*QuestionsApi* | [**apiV1HospitalsHospitalIdQuestionsQuestionIdGet**](docs/QuestionsApi.md#apiv1hospitalshospitalidquestionsquestionidget) | **GET** api/v1/hospitals/{hospitalId}/questions/{questionId} | Get question.
*QuestionsApi* | [**apiV1HospitalsHospitalIdQuestionsQuestionIdPut**](docs/QuestionsApi.md#apiv1hospitalshospitalidquestionsquestionidput) | **PUT** api/v1/hospitals/{hospitalId}/questions/{questionId} | Update question.
*QuestionsApi* | [**apiV1HospitalsQuestionsGet**](docs/QuestionsApi.md#apiv1hospitalsquestionsget) | **GET** api/v1/hospitals/questions | Get all questions.
*SearchApi* | [**apiV1SearchAutocompleteGet**](docs/SearchApi.md#apiv1searchautocompleteget) | **GET** api/v1/search/autocomplete | 
*SearchApi* | [**apiV1SearchDealsGet**](docs/SearchApi.md#apiv1searchdealsget) | **GET** api/v1/search/deals | 
*SearchApi* | [**apiV1SearchDoctorsGet**](docs/SearchApi.md#apiv1searchdoctorsget) | **GET** api/v1/search/doctors | 
*SearchApi* | [**apiV1SearchGetcountGet**](docs/SearchApi.md#apiv1searchgetcountget) | **GET** api/v1/search/getcount | 
*SearchApi* | [**apiV1SearchHospitalsGet**](docs/SearchApi.md#apiv1searchhospitalsget) | **GET** api/v1/search/hospitals | 
*SearchApi* | [**apiV1SearchSpecialtiesGet**](docs/SearchApi.md#apiv1searchspecialtiesget) | **GET** api/v1/search/specialties | 
*SearchApi* | [**apiV1SearchSpecialtytypesGet**](docs/SearchApi.md#apiv1searchspecialtytypesget) | **GET** api/v1/search/specialtytypes | 
*SearchApi* | [**apiV1SearchSuggestGet**](docs/SearchApi.md#apiv1searchsuggestget) | **GET** api/v1/search/suggest | 
*ServiceCategoriesApi* | [**apiV1ServicecategoriesGet**](docs/ServiceCategoriesApi.md#apiv1servicecategoriesget) | **GET** api/v1/servicecategories | Get all ServiceCategories.
*ServiceCategoriesApi* | [**apiV1ServicecategoriesPost**](docs/ServiceCategoriesApi.md#apiv1servicecategoriespost) | **POST** api/v1/servicecategories | Create ServiceCategory.
*ServiceCategoriesApi* | [**apiV1ServicecategoriesServiceCategoryIdDelete**](docs/ServiceCategoriesApi.md#apiv1servicecategoriesservicecategoryiddelete) | **DELETE** api/v1/servicecategories/{serviceCategoryId} | Delete ServiceCategory.
*ServiceCategoriesApi* | [**apiV1ServicecategoriesServiceCategoryIdGet**](docs/ServiceCategoriesApi.md#apiv1servicecategoriesservicecategoryidget) | **GET** api/v1/servicecategories/{serviceCategoryId} | Get ServiceCategory.
*ServiceCategoriesApi* | [**apiV1ServicecategoriesServiceCategoryIdPut**](docs/ServiceCategoriesApi.md#apiv1servicecategoriesservicecategoryidput) | **PUT** api/v1/servicecategories/{serviceCategoryId} | Update ServiceCategory
*ServiceLocalesApi* | [**apiV1ServicesServiceIdLocalesLanguageCodeGet**](docs/ServiceLocalesApi.md#apiv1servicesserviceidlocaleslanguagecodeget) | **GET** api/v1/services/{serviceId}/locales/{languageCode} | Get service locale
*ServiceLocalesApi* | [**apiV1ServicesServiceIdLocalesLanguageCodePut**](docs/ServiceLocalesApi.md#apiv1servicesserviceidlocaleslanguagecodeput) | **PUT** api/v1/services/{serviceId}/locales/{languageCode} | Update service locale
*ServicesApi* | [**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesPost**](docs/ServicesApi.md#apiv1hospitalshospitalidspecialtiesspecialtyidservicespost) | **POST** api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services | Create service.
*ServicesApi* | [**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdDelete**](docs/ServicesApi.md#apiv1hospitalshospitalidspecialtiesspecialtyidservicesserviceiddelete) | **DELETE** api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId} | Delete service.
*ServicesApi* | [**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdGet**](docs/ServicesApi.md#apiv1hospitalshospitalidspecialtiesspecialtyidservicesserviceidget) | **GET** api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId} | Get service.
*ServicesApi* | [**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdPut**](docs/ServicesApi.md#apiv1hospitalshospitalidspecialtiesspecialtyidservicesserviceidput) | **PUT** api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId} | Update service.
*ServicesApi* | [**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesquencePut**](docs/ServicesApi.md#apiv1hospitalshospitalidspecialtiesspecialtyidservicesquenceput) | **PUT** api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/servicesquence | Update service sequence.
*ServicesApi* | [**apiV1HospitalsServicesGet**](docs/ServicesApi.md#apiv1hospitalsservicesget) | **GET** api/v1/hospitals/services | Get all services.
*ServicesApi* | [**apiV1HospitalsServicesSlugsSlugGet**](docs/ServicesApi.md#apiv1hospitalsservicesslugsslugget) | **GET** api/v1/hospitals/services/slugs/{slug} | Get service by slug.
*SpecialtiesApi* | [**apiV1SpecialtiesGet**](docs/SpecialtiesApi.md#apiv1specialtiesget) | **GET** api/v1/specialties | Get all specialties.
*SpecialtiesApi* | [**apiV1SpecialtiesPost**](docs/SpecialtiesApi.md#apiv1specialtiespost) | **POST** api/v1/specialties | Create specialty.
*SpecialtiesApi* | [**apiV1SpecialtiesSlugsSlugGet**](docs/SpecialtiesApi.md#apiv1specialtiesslugsslugget) | **GET** api/v1/specialties/slugs/{slug} | Get specialty by slug.
*SpecialtiesApi* | [**apiV1SpecialtiesSpecialtyIdDelete**](docs/SpecialtiesApi.md#apiv1specialtiesspecialtyiddelete) | **DELETE** api/v1/specialties/{specialtyId} | Delete specialty.
*SpecialtiesApi* | [**apiV1SpecialtiesSpecialtyIdGet**](docs/SpecialtiesApi.md#apiv1specialtiesspecialtyidget) | **GET** api/v1/specialties/{specialtyId} | Get specialty.
*SpecialtiesApi* | [**apiV1SpecialtiesSpecialtyIdPut**](docs/SpecialtiesApi.md#apiv1specialtiesspecialtyidput) | **PUT** api/v1/specialties/{specialtyId} | Update specialty
*SpecialtyLocalesApi* | [**apiV1SpecialtiesSpecialtyIdLocalesLanguageCodeGet**](docs/SpecialtyLocalesApi.md#apiv1specialtiesspecialtyidlocaleslanguagecodeget) | **GET** api/v1/specialties/{specialtyId}/locales/{languageCode} | Get specialty locale
*SpecialtyLocalesApi* | [**apiV1SpecialtiesSpecialtyIdLocalesLanguageCodePut**](docs/SpecialtyLocalesApi.md#apiv1specialtiesspecialtyidlocaleslanguagecodeput) | **PUT** api/v1/specialties/{specialtyId}/locales/{languageCode} | Update specialty locale
*SpecialtyTypeCategoriesApi* | [**apiV1SpecialtytypecategoriesGet**](docs/SpecialtyTypeCategoriesApi.md#apiv1specialtytypecategoriesget) | **GET** api/v1/specialtytypecategories | Get all SpecialtyTypeCategories.
*SpecialtyTypeCategoriesApi* | [**apiV1SpecialtytypecategoriesPost**](docs/SpecialtyTypeCategoriesApi.md#apiv1specialtytypecategoriespost) | **POST** api/v1/specialtytypecategories | Create specialtyTypeCategory.
*SpecialtyTypeCategoriesApi* | [**apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdDelete**](docs/SpecialtyTypeCategoriesApi.md#apiv1specialtytypecategoriesspecialtytypecategoryiddelete) | **DELETE** api/v1/specialtytypecategories/{specialtyTypeCategoryId} | Delete specialtyTypeCategory.
*SpecialtyTypeCategoriesApi* | [**apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdGet**](docs/SpecialtyTypeCategoriesApi.md#apiv1specialtytypecategoriesspecialtytypecategoryidget) | **GET** api/v1/specialtytypecategories/{specialtyTypeCategoryId} | Get specialtyTypeCategory.
*SpecialtyTypeCategoriesApi* | [**apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdPut**](docs/SpecialtyTypeCategoriesApi.md#apiv1specialtytypecategoriesspecialtytypecategoryidput) | **PUT** api/v1/specialtytypecategories/{specialtyTypeCategoryId} | Update specialtyTypeCategory
*SpecialtyTypeLocalesApi* | [**apiV1SpecialtytypesSpecialtyTypeIdLocalesLanguageCodeGet**](docs/SpecialtyTypeLocalesApi.md#apiv1specialtytypesspecialtytypeidlocaleslanguagecodeget) | **GET** api/v1/specialtytypes/{specialtyTypeId}/locales/{languageCode} | Get specialtyType locale
*SpecialtyTypeLocalesApi* | [**apiV1SpecialtytypesSpecialtyTypeIdLocalesLanguageCodePut**](docs/SpecialtyTypeLocalesApi.md#apiv1specialtytypesspecialtytypeidlocaleslanguagecodeput) | **PUT** api/v1/specialtytypes/{specialtyTypeId}/locales/{languageCode} | Update specialtyType locale
*SpecialtyTypesApi* | [**apiV1SpecialtytypesGet**](docs/SpecialtyTypesApi.md#apiv1specialtytypesget) | **GET** api/v1/specialtytypes | Get all SpecialtyTypes.
*SpecialtyTypesApi* | [**apiV1SpecialtytypesPost**](docs/SpecialtyTypesApi.md#apiv1specialtytypespost) | **POST** api/v1/specialtytypes | Create specialtyType.
*SpecialtyTypesApi* | [**apiV1SpecialtytypesSlugsSlugGet**](docs/SpecialtyTypesApi.md#apiv1specialtytypesslugsslugget) | **GET** api/v1/specialtytypes/slugs/{slug} | Get specialtyType by slug.
*SpecialtyTypesApi* | [**apiV1SpecialtytypesSpecialtyTypeIdDelete**](docs/SpecialtyTypesApi.md#apiv1specialtytypesspecialtytypeiddelete) | **DELETE** api/v1/specialtytypes/{specialtyTypeId} | Delete specialtyType.
*SpecialtyTypesApi* | [**apiV1SpecialtytypesSpecialtyTypeIdGet**](docs/SpecialtyTypesApi.md#apiv1specialtytypesspecialtytypeidget) | **GET** api/v1/specialtytypes/{specialtyTypeId} | Get specialtyType.
*SpecialtyTypesApi* | [**apiV1SpecialtytypesSpecialtyTypeIdPut**](docs/SpecialtyTypesApi.md#apiv1specialtytypesspecialtytypeidput) | **PUT** api/v1/specialtytypes/{specialtyTypeId} | Update specialtyType
*SurveysApi* | [**apiV1SurveysIdGet**](docs/SurveysApi.md#apiv1surveysidget) | **GET** api/v1/surveys/{id} | Get the survey.
*SurveysApi* | [**apiV1SurveysPost**](docs/SurveysApi.md#apiv1surveyspost) | **POST** api/v1/surveys | Create user's survey response.
*TagsApi* | [**apiV1TagsGet**](docs/TagsApi.md#apiv1tagsget) | **GET** api/v1/tags | 
*TagsApi* | [**apiV1TagsPost**](docs/TagsApi.md#apiv1tagspost) | **POST** api/v1/tags | 
*TagsApi* | [**apiV1TagsTagIdDelete**](docs/TagsApi.md#apiv1tagstagiddelete) | **DELETE** api/v1/tags/{tagId} | 
*TagsApi* | [**apiV1TagsTagIdGet**](docs/TagsApi.md#apiv1tagstagidget) | **GET** api/v1/tags/{tagId} | 
*TranslationApi* | [**apiV1TranslationsTranslatePost**](docs/TranslationApi.md#apiv1translationstranslatepost) | **POST** api/v1/translations/translate | 
*YoutubesApi* | [**apiV1YoutubesGet**](docs/YoutubesApi.md#apiv1youtubesget) | **GET** api/v1/youtubes | Get all youtubes.
*YoutubesApi* | [**apiV1YoutubesPost**](docs/YoutubesApi.md#apiv1youtubespost) | **POST** api/v1/youtubes | Create an youtube.
*YoutubesApi* | [**apiV1YoutubesSlugsSlugGet**](docs/YoutubesApi.md#apiv1youtubesslugsslugget) | **GET** api/v1/youtubes/slugs/{slug} | Get youtube by slug.
*YoutubesApi* | [**apiV1YoutubesYoutubeIdDelete**](docs/YoutubesApi.md#apiv1youtubesyoutubeiddelete) | **DELETE** api/v1/youtubes/{youtubeId} | Delete youtube.
*YoutubesApi* | [**apiV1YoutubesYoutubeIdGet**](docs/YoutubesApi.md#apiv1youtubesyoutubeidget) | **GET** api/v1/youtubes/{youtubeId} | Get youtube.
*YoutubesApi* | [**apiV1YoutubesYoutubeIdPut**](docs/YoutubesApi.md#apiv1youtubesyoutubeidput) | **PUT** api/v1/youtubes/{youtubeId} | Update youtube.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [CloudHospitalApi.models.Account](docs/Account.md)
 - [CloudHospitalApi.models.Accreditation](docs/Accreditation.md)
 - [CloudHospitalApi.models.AccreditationItemViewModel](docs/AccreditationItemViewModel.md)
 - [CloudHospitalApi.models.AccreditationViewModel](docs/AccreditationViewModel.md)
 - [CloudHospitalApi.models.AccreditationsViewModel](docs/AccreditationsViewModel.md)
 - [CloudHospitalApi.models.AdminMessageViewModel](docs/AdminMessageViewModel.md)
 - [CloudHospitalApi.models.AppVersionViewModel](docs/AppVersionViewModel.md)
 - [CloudHospitalApi.models.ApproveBookingCommand](docs/ApproveBookingCommand.md)
 - [CloudHospitalApi.models.ApproveConsultationCommand](docs/ApproveConsultationCommand.md)
 - [CloudHospitalApi.models.Article](docs/Article.md)
 - [CloudHospitalApi.models.ArticleContributor](docs/ArticleContributor.md)
 - [CloudHospitalApi.models.ArticleContributorItemViewModel](docs/ArticleContributorItemViewModel.md)
 - [CloudHospitalApi.models.ArticleContributorViewModel](docs/ArticleContributorViewModel.md)
 - [CloudHospitalApi.models.ArticleContributorsViewModel](docs/ArticleContributorsViewModel.md)
 - [CloudHospitalApi.models.ArticleItemViewModel](docs/ArticleItemViewModel.md)
 - [CloudHospitalApi.models.ArticleLocaleViewModel](docs/ArticleLocaleViewModel.md)
 - [CloudHospitalApi.models.ArticleStatus](docs/ArticleStatus.md)
 - [CloudHospitalApi.models.ArticleTag](docs/ArticleTag.md)
 - [CloudHospitalApi.models.ArticleTagItemViewModel](docs/ArticleTagItemViewModel.md)
 - [CloudHospitalApi.models.ArticleViewModel](docs/ArticleViewModel.md)
 - [CloudHospitalApi.models.ArticlesViewModel](docs/ArticlesViewModel.md)
 - [CloudHospitalApi.models.AuditableEntity](docs/AuditableEntity.md)
 - [CloudHospitalApi.models.AutocompleteMode](docs/AutocompleteMode.md)
 - [CloudHospitalApi.models.Award](docs/Award.md)
 - [CloudHospitalApi.models.AwardViewModel](docs/AwardViewModel.md)
 - [CloudHospitalApi.models.AzureSearchServiceAutocompleteModel](docs/AzureSearchServiceAutocompleteModel.md)
 - [CloudHospitalApi.models.AzureSearchServiceSuggestModel](docs/AzureSearchServiceSuggestModel.md)
 - [CloudHospitalApi.models.AzureSearchViewModel](docs/AzureSearchViewModel.md)
 - [CloudHospitalApi.models.Booking](docs/Booking.md)
 - [CloudHospitalApi.models.BookingItemViewModel](docs/BookingItemViewModel.md)
 - [CloudHospitalApi.models.BookingStatus](docs/BookingStatus.md)
 - [CloudHospitalApi.models.BookingViewModel](docs/BookingViewModel.md)
 - [CloudHospitalApi.models.BookingsViewModel](docs/BookingsViewModel.md)
 - [CloudHospitalApi.models.CHAdminItemViewModel](docs/CHAdminItemViewModel.md)
 - [CloudHospitalApi.models.CHAdminViewModel](docs/CHAdminViewModel.md)
 - [CloudHospitalApi.models.CHAdminsViewModel](docs/CHAdminsViewModel.md)
 - [CloudHospitalApi.models.CHManagerItemViewModel](docs/CHManagerItemViewModel.md)
 - [CloudHospitalApi.models.CHManagerViewModel](docs/CHManagerViewModel.md)
 - [CloudHospitalApi.models.CHManagersViewModel](docs/CHManagersViewModel.md)
 - [CloudHospitalApi.models.ChangeEmailCommand](docs/ChangeEmailCommand.md)
 - [CloudHospitalApi.models.ChangeLog](docs/ChangeLog.md)
 - [CloudHospitalApi.models.ChargeStatus](docs/ChargeStatus.md)
 - [CloudHospitalApi.models.CheckNotificationsCommand](docs/CheckNotificationsCommand.md)
 - [CloudHospitalApi.models.CommunicationUserTokenModel](docs/CommunicationUserTokenModel.md)
 - [CloudHospitalApi.models.ConfirmEmailCommand](docs/ConfirmEmailCommand.md)
 - [CloudHospitalApi.models.Consultation](docs/Consultation.md)
 - [CloudHospitalApi.models.ConsultationItemViewModel](docs/ConsultationItemViewModel.md)
 - [CloudHospitalApi.models.ConsultationStatus](docs/ConsultationStatus.md)
 - [CloudHospitalApi.models.ConsultationType](docs/ConsultationType.md)
 - [CloudHospitalApi.models.ConsultationViewModel](docs/ConsultationViewModel.md)
 - [CloudHospitalApi.models.ConsultationsViewModel](docs/ConsultationsViewModel.md)
 - [CloudHospitalApi.models.ContributionType](docs/ContributionType.md)
 - [CloudHospitalApi.models.Contributor](docs/Contributor.md)
 - [CloudHospitalApi.models.ContributorItemViewModel](docs/ContributorItemViewModel.md)
 - [CloudHospitalApi.models.ContributorSnsHandlesViewModel](docs/ContributorSnsHandlesViewModel.md)
 - [CloudHospitalApi.models.ContributorViewModel](docs/ContributorViewModel.md)
 - [CloudHospitalApi.models.ContributorsViewModel](docs/ContributorsViewModel.md)
 - [CloudHospitalApi.models.ControlType](docs/ControlType.md)
 - [CloudHospitalApi.models.CountriesViewModel](docs/CountriesViewModel.md)
 - [CloudHospitalApi.models.Country](docs/Country.md)
 - [CloudHospitalApi.models.CountryItemViewModel](docs/CountryItemViewModel.md)
 - [CloudHospitalApi.models.CountryLocaleViewModel](docs/CountryLocaleViewModel.md)
 - [CloudHospitalApi.models.CountryViewModel](docs/CountryViewModel.md)
 - [CloudHospitalApi.models.CreateAccreditationCommand](docs/CreateAccreditationCommand.md)
 - [CloudHospitalApi.models.CreateArticleCommand](docs/CreateArticleCommand.md)
 - [CloudHospitalApi.models.CreateArticleContributorCommand](docs/CreateArticleContributorCommand.md)
 - [CloudHospitalApi.models.CreateBookingCommand](docs/CreateBookingCommand.md)
 - [CloudHospitalApi.models.CreateCHAdminCommand](docs/CreateCHAdminCommand.md)
 - [CloudHospitalApi.models.CreateCHManagerCommand](docs/CreateCHManagerCommand.md)
 - [CloudHospitalApi.models.CreateConsultationCommand](docs/CreateConsultationCommand.md)
 - [CloudHospitalApi.models.CreateContributorCommand](docs/CreateContributorCommand.md)
 - [CloudHospitalApi.models.CreateContributorSnsHandleCommand](docs/CreateContributorSnsHandleCommand.md)
 - [CloudHospitalApi.models.CreateCountryCommand](docs/CreateCountryCommand.md)
 - [CloudHospitalApi.models.CreateDealCommand](docs/CreateDealCommand.md)
 - [CloudHospitalApi.models.CreateDealPackageCommand](docs/CreateDealPackageCommand.md)
 - [CloudHospitalApi.models.CreateDepartmentCommand](docs/CreateDepartmentCommand.md)
 - [CloudHospitalApi.models.CreateDeviceCommand](docs/CreateDeviceCommand.md)
 - [CloudHospitalApi.models.CreateDeviceLoginCommand](docs/CreateDeviceLoginCommand.md)
 - [CloudHospitalApi.models.CreateDoctorCertificateCommand](docs/CreateDoctorCertificateCommand.md)
 - [CloudHospitalApi.models.CreateDoctorCommand](docs/CreateDoctorCommand.md)
 - [CloudHospitalApi.models.CreateDoctorEducationCommand](docs/CreateDoctorEducationCommand.md)
 - [CloudHospitalApi.models.CreateDoctorMediaCommand](docs/CreateDoctorMediaCommand.md)
 - [CloudHospitalApi.models.CreateDoctorPortfolioCommand](docs/CreateDoctorPortfolioCommand.md)
 - [CloudHospitalApi.models.CreateDoctorReviewCommand](docs/CreateDoctorReviewCommand.md)
 - [CloudHospitalApi.models.CreateEquipmentCommand](docs/CreateEquipmentCommand.md)
 - [CloudHospitalApi.models.CreateHospitalCommand](docs/CreateHospitalCommand.md)
 - [CloudHospitalApi.models.CreateHospitalMediaCommand](docs/CreateHospitalMediaCommand.md)
 - [CloudHospitalApi.models.CreateHospitalReviewCommand](docs/CreateHospitalReviewCommand.md)
 - [CloudHospitalApi.models.CreateHospitalSpecialtyCommand](docs/CreateHospitalSpecialtyCommand.md)
 - [CloudHospitalApi.models.CreateInvitationCommand](docs/CreateInvitationCommand.md)
 - [CloudHospitalApi.models.CreateInvitationResultModel](docs/CreateInvitationResultModel.md)
 - [CloudHospitalApi.models.CreateManagerCommand](docs/CreateManagerCommand.md)
 - [CloudHospitalApi.models.CreateMembershipResultModel](docs/CreateMembershipResultModel.md)
 - [CloudHospitalApi.models.CreatePartnerCommand](docs/CreatePartnerCommand.md)
 - [CloudHospitalApi.models.CreatePatientCommand](docs/CreatePatientCommand.md)
 - [CloudHospitalApi.models.CreateQuestionCommand](docs/CreateQuestionCommand.md)
 - [CloudHospitalApi.models.CreateQuestionCommentCommand](docs/CreateQuestionCommentCommand.md)
 - [CloudHospitalApi.models.CreateSendBirdCurrentUserCommand](docs/CreateSendBirdCurrentUserCommand.md)
 - [CloudHospitalApi.models.CreateServiceCategoryCommand](docs/CreateServiceCategoryCommand.md)
 - [CloudHospitalApi.models.CreateServiceCommand](docs/CreateServiceCommand.md)
 - [CloudHospitalApi.models.CreateSpecialtyCommand](docs/CreateSpecialtyCommand.md)
 - [CloudHospitalApi.models.CreateSpecialtyTypeCategoryCommand](docs/CreateSpecialtyTypeCategoryCommand.md)
 - [CloudHospitalApi.models.CreateSpecialtyTypeCommand](docs/CreateSpecialtyTypeCommand.md)
 - [CloudHospitalApi.models.CreateSurveyResponseCommand](docs/CreateSurveyResponseCommand.md)
 - [CloudHospitalApi.models.CreateTagCommand](docs/CreateTagCommand.md)
 - [CloudHospitalApi.models.CreateYoutubeCommand](docs/CreateYoutubeCommand.md)
 - [CloudHospitalApi.models.Customer](docs/Customer.md)
 - [CloudHospitalApi.models.Deal](docs/Deal.md)
 - [CloudHospitalApi.models.DealItemViewModel](docs/DealItemViewModel.md)
 - [CloudHospitalApi.models.DealPackage](docs/DealPackage.md)
 - [CloudHospitalApi.models.DealPackageItemViewModel](docs/DealPackageItemViewModel.md)
 - [CloudHospitalApi.models.DealPackageViewModel](docs/DealPackageViewModel.md)
 - [CloudHospitalApi.models.DealService](docs/DealService.md)
 - [CloudHospitalApi.models.DealServiceItemViewModel](docs/DealServiceItemViewModel.md)
 - [CloudHospitalApi.models.DealViewModel](docs/DealViewModel.md)
 - [CloudHospitalApi.models.DealsViewModel](docs/DealsViewModel.md)
 - [CloudHospitalApi.models.DeleteInvitationResultModel](docs/DeleteInvitationResultModel.md)
 - [CloudHospitalApi.models.DeleteMemberResultModel](docs/DeleteMemberResultModel.md)
 - [CloudHospitalApi.models.DeleteMembershipResultModel](docs/DeleteMembershipResultModel.md)
 - [CloudHospitalApi.models.Department](docs/Department.md)
 - [CloudHospitalApi.models.DepartmentItemViewModel](docs/DepartmentItemViewModel.md)
 - [CloudHospitalApi.models.DepartmentViewModel](docs/DepartmentViewModel.md)
 - [CloudHospitalApi.models.DepartmentsViewModel](docs/DepartmentsViewModel.md)
 - [CloudHospitalApi.models.Device](docs/Device.md)
 - [CloudHospitalApi.models.DeviceItemViewModel](docs/DeviceItemViewModel.md)
 - [CloudHospitalApi.models.DeviceLogin](docs/DeviceLogin.md)
 - [CloudHospitalApi.models.DeviceViewModel](docs/DeviceViewModel.md)
 - [CloudHospitalApi.models.DevicesViewModel](docs/DevicesViewModel.md)
 - [CloudHospitalApi.models.Doctor](docs/Doctor.md)
 - [CloudHospitalApi.models.DoctorAffiliation](docs/DoctorAffiliation.md)
 - [CloudHospitalApi.models.DoctorAffiliationViewModel](docs/DoctorAffiliationViewModel.md)
 - [CloudHospitalApi.models.DoctorCertificate](docs/DoctorCertificate.md)
 - [CloudHospitalApi.models.DoctorCertificateItemViewModel](docs/DoctorCertificateItemViewModel.md)
 - [CloudHospitalApi.models.DoctorCertificateViewModel](docs/DoctorCertificateViewModel.md)
 - [CloudHospitalApi.models.DoctorCertificatesViewModel](docs/DoctorCertificatesViewModel.md)
 - [CloudHospitalApi.models.DoctorEducation](docs/DoctorEducation.md)
 - [CloudHospitalApi.models.DoctorEducationItemViewModel](docs/DoctorEducationItemViewModel.md)
 - [CloudHospitalApi.models.DoctorEducationViewModel](docs/DoctorEducationViewModel.md)
 - [CloudHospitalApi.models.DoctorEducationsViewModel](docs/DoctorEducationsViewModel.md)
 - [CloudHospitalApi.models.DoctorItemViewModel](docs/DoctorItemViewModel.md)
 - [CloudHospitalApi.models.DoctorLocaleViewModel](docs/DoctorLocaleViewModel.md)
 - [CloudHospitalApi.models.DoctorMediasViewModel](docs/DoctorMediasViewModel.md)
 - [CloudHospitalApi.models.DoctorPortfolio](docs/DoctorPortfolio.md)
 - [CloudHospitalApi.models.DoctorPortfolioItemViewModel](docs/DoctorPortfolioItemViewModel.md)
 - [CloudHospitalApi.models.DoctorPortfolioViewModel](docs/DoctorPortfolioViewModel.md)
 - [CloudHospitalApi.models.DoctorPortfoliosViewModel](docs/DoctorPortfoliosViewModel.md)
 - [CloudHospitalApi.models.DoctorReview](docs/DoctorReview.md)
 - [CloudHospitalApi.models.DoctorReviewItemViewModel](docs/DoctorReviewItemViewModel.md)
 - [CloudHospitalApi.models.DoctorReviewViewModel](docs/DoctorReviewViewModel.md)
 - [CloudHospitalApi.models.DoctorReviewsViewModel](docs/DoctorReviewsViewModel.md)
 - [CloudHospitalApi.models.DoctorSpecialtiesViewModel](docs/DoctorSpecialtiesViewModel.md)
 - [CloudHospitalApi.models.DoctorSpecialty](docs/DoctorSpecialty.md)
 - [CloudHospitalApi.models.DoctorSpecialtyItemViewModel](docs/DoctorSpecialtyItemViewModel.md)
 - [CloudHospitalApi.models.DoctorSpecialtyViewModel](docs/DoctorSpecialtyViewModel.md)
 - [CloudHospitalApi.models.DoctorViewModel](docs/DoctorViewModel.md)
 - [CloudHospitalApi.models.DoctorsViewModel](docs/DoctorsViewModel.md)
 - [CloudHospitalApi.models.Equipment](docs/Equipment.md)
 - [CloudHospitalApi.models.EquipmentItemViewModel](docs/EquipmentItemViewModel.md)
 - [CloudHospitalApi.models.EquipmentViewModel](docs/EquipmentViewModel.md)
 - [CloudHospitalApi.models.EquipmentsViewModel](docs/EquipmentsViewModel.md)
 - [CloudHospitalApi.models.FacebookUserDataDeletionResponseModel](docs/FacebookUserDataDeletionResponseModel.md)
 - [CloudHospitalApi.models.FaqCategoriesViewModel](docs/FaqCategoriesViewModel.md)
 - [CloudHospitalApi.models.FaqCategoryBreadCrumbViewModel](docs/FaqCategoryBreadCrumbViewModel.md)
 - [CloudHospitalApi.models.FaqCategoryItemViewModel](docs/FaqCategoryItemViewModel.md)
 - [CloudHospitalApi.models.FaqCategoryLocaleViewModel](docs/FaqCategoryLocaleViewModel.md)
 - [CloudHospitalApi.models.FaqCategoryViewModel](docs/FaqCategoryViewModel.md)
 - [CloudHospitalApi.models.FaqItemViewModel](docs/FaqItemViewModel.md)
 - [CloudHospitalApi.models.FaqLocaleViewModel](docs/FaqLocaleViewModel.md)
 - [CloudHospitalApi.models.FaqViewModel](docs/FaqViewModel.md)
 - [CloudHospitalApi.models.FaqsViewModel](docs/FaqsViewModel.md)
 - [CloudHospitalApi.models.Gender](docs/Gender.md)
 - [CloudHospitalApi.models.HealthProfile](docs/HealthProfile.md)
 - [CloudHospitalApi.models.HealthProfileViewModel](docs/HealthProfileViewModel.md)
 - [CloudHospitalApi.models.Hospital](docs/Hospital.md)
 - [CloudHospitalApi.models.HospitalAccreditation](docs/HospitalAccreditation.md)
 - [CloudHospitalApi.models.HospitalAccreditationItemViewModel](docs/HospitalAccreditationItemViewModel.md)
 - [CloudHospitalApi.models.HospitalAccreditationViewModel](docs/HospitalAccreditationViewModel.md)
 - [CloudHospitalApi.models.HospitalAccreditationsViewModel](docs/HospitalAccreditationsViewModel.md)
 - [CloudHospitalApi.models.HospitalAffiliationViewModel](docs/HospitalAffiliationViewModel.md)
 - [CloudHospitalApi.models.HospitalEvaluation](docs/HospitalEvaluation.md)
 - [CloudHospitalApi.models.HospitalEvaluationViewModel](docs/HospitalEvaluationViewModel.md)
 - [CloudHospitalApi.models.HospitalItemViewModel](docs/HospitalItemViewModel.md)
 - [CloudHospitalApi.models.HospitalLocaleViewModel](docs/HospitalLocaleViewModel.md)
 - [CloudHospitalApi.models.HospitalMediasViewModel](docs/HospitalMediasViewModel.md)
 - [CloudHospitalApi.models.HospitalReview](docs/HospitalReview.md)
 - [CloudHospitalApi.models.HospitalReviewItemViewModel](docs/HospitalReviewItemViewModel.md)
 - [CloudHospitalApi.models.HospitalReviewViewModel](docs/HospitalReviewViewModel.md)
 - [CloudHospitalApi.models.HospitalReviewsViewModel](docs/HospitalReviewsViewModel.md)
 - [CloudHospitalApi.models.HospitalSpecialtiesViewModel](docs/HospitalSpecialtiesViewModel.md)
 - [CloudHospitalApi.models.HospitalSpecialty](docs/HospitalSpecialty.md)
 - [CloudHospitalApi.models.HospitalSpecialtyItemViewModel](docs/HospitalSpecialtyItemViewModel.md)
 - [CloudHospitalApi.models.HospitalSpecialtyViewModel](docs/HospitalSpecialtyViewModel.md)
 - [CloudHospitalApi.models.HospitalViewModel](docs/HospitalViewModel.md)
 - [CloudHospitalApi.models.HospitalsViewModel](docs/HospitalsViewModel.md)
 - [CloudHospitalApi.models.InvitationViewModel](docs/InvitationViewModel.md)
 - [CloudHospitalApi.models.InvitationsViewModel](docs/InvitationsViewModel.md)
 - [CloudHospitalApi.models.InviteSendBirdGroupChannelCommand](docs/InviteSendBirdGroupChannelCommand.md)
 - [CloudHospitalApi.models.LanguageItemViewModel](docs/LanguageItemViewModel.md)
 - [CloudHospitalApi.models.LanguageViewModel](docs/LanguageViewModel.md)
 - [CloudHospitalApi.models.LanguagesViewModel](docs/LanguagesViewModel.md)
 - [CloudHospitalApi.models.LocalizedUrlViewModel](docs/LocalizedUrlViewModel.md)
 - [CloudHospitalApi.models.Location](docs/Location.md)
 - [CloudHospitalApi.models.LocationViewModel](docs/LocationViewModel.md)
 - [CloudHospitalApi.models.Manager](docs/Manager.md)
 - [CloudHospitalApi.models.ManagerAffiliation](docs/ManagerAffiliation.md)
 - [CloudHospitalApi.models.ManagerAffiliationViewModel](docs/ManagerAffiliationViewModel.md)
 - [CloudHospitalApi.models.ManagerViewModel](docs/ManagerViewModel.md)
 - [CloudHospitalApi.models.ManagersViewModel](docs/ManagersViewModel.md)
 - [CloudHospitalApi.models.MarketingType](docs/MarketingType.md)
 - [CloudHospitalApi.models.Media](docs/Media.md)
 - [CloudHospitalApi.models.MediaType](docs/MediaType.md)
 - [CloudHospitalApi.models.MediaViewModel](docs/MediaViewModel.md)
 - [CloudHospitalApi.models.MemberViewModel](docs/MemberViewModel.md)
 - [CloudHospitalApi.models.MembersViewModel](docs/MembersViewModel.md)
 - [CloudHospitalApi.models.Membership](docs/Membership.md)
 - [CloudHospitalApi.models.MembershipInvitation](docs/MembershipInvitation.md)
 - [CloudHospitalApi.models.MembershipViewModel](docs/MembershipViewModel.md)
 - [CloudHospitalApi.models.Metadata](docs/Metadata.md)
 - [CloudHospitalApi.models.NotificationCode](docs/NotificationCode.md)
 - [CloudHospitalApi.models.NotificationViewModel](docs/NotificationViewModel.md)
 - [CloudHospitalApi.models.NotificationsViewModel](docs/NotificationsViewModel.md)
 - [CloudHospitalApi.models.PagedListMetaData](docs/PagedListMetaData.md)
 - [CloudHospitalApi.models.PartnerItemViewModel](docs/PartnerItemViewModel.md)
 - [CloudHospitalApi.models.PartnerViewModel](docs/PartnerViewModel.md)
 - [CloudHospitalApi.models.PartnersViewModel](docs/PartnersViewModel.md)
 - [CloudHospitalApi.models.Patient](docs/Patient.md)
 - [CloudHospitalApi.models.PatientItemViewModel](docs/PatientItemViewModel.md)
 - [CloudHospitalApi.models.PatientViewModel](docs/PatientViewModel.md)
 - [CloudHospitalApi.models.PatientsViewModel](docs/PatientsViewModel.md)
 - [CloudHospitalApi.models.Payment](docs/Payment.md)
 - [CloudHospitalApi.models.PaymentMethod](docs/PaymentMethod.md)
 - [CloudHospitalApi.models.PaymentStatus](docs/PaymentStatus.md)
 - [CloudHospitalApi.models.Plan](docs/Plan.md)
 - [CloudHospitalApi.models.PlanItemViewModel](docs/PlanItemViewModel.md)
 - [CloudHospitalApi.models.PlanViewModel](docs/PlanViewModel.md)
 - [CloudHospitalApi.models.PlansViewModel](docs/PlansViewModel.md)
 - [CloudHospitalApi.models.Platform](docs/Platform.md)
 - [CloudHospitalApi.models.Procedure](docs/Procedure.md)
 - [CloudHospitalApi.models.Question](docs/Question.md)
 - [CloudHospitalApi.models.QuestionComment](docs/QuestionComment.md)
 - [CloudHospitalApi.models.QuestionCommentItemViewModel](docs/QuestionCommentItemViewModel.md)
 - [CloudHospitalApi.models.QuestionCommentViewModel](docs/QuestionCommentViewModel.md)
 - [CloudHospitalApi.models.QuestionCommentsViewModel](docs/QuestionCommentsViewModel.md)
 - [CloudHospitalApi.models.QuestionItemViewModel](docs/QuestionItemViewModel.md)
 - [CloudHospitalApi.models.QuestionStatus](docs/QuestionStatus.md)
 - [CloudHospitalApi.models.QuestionType](docs/QuestionType.md)
 - [CloudHospitalApi.models.QuestionViewModel](docs/QuestionViewModel.md)
 - [CloudHospitalApi.models.QuestionsViewModel](docs/QuestionsViewModel.md)
 - [CloudHospitalApi.models.RecurringInterval](docs/RecurringInterval.md)
 - [CloudHospitalApi.models.RefundPolicy](docs/RefundPolicy.md)
 - [CloudHospitalApi.models.RefundStatus](docs/RefundStatus.md)
 - [CloudHospitalApi.models.RejectBookingCommand](docs/RejectBookingCommand.md)
 - [CloudHospitalApi.models.RejectConsultationCommand](docs/RejectConsultationCommand.md)
 - [CloudHospitalApi.models.RejectReason](docs/RejectReason.md)
 - [CloudHospitalApi.models.ReviewCategory](docs/ReviewCategory.md)
 - [CloudHospitalApi.models.ReviewType](docs/ReviewType.md)
 - [CloudHospitalApi.models.SendBirdGroupChannelMember](docs/SendBirdGroupChannelMember.md)
 - [CloudHospitalApi.models.SendBirdGroupChannelViewModel](docs/SendBirdGroupChannelViewModel.md)
 - [CloudHospitalApi.models.SendBirdGroupChannelrOperator](docs/SendBirdGroupChannelrOperator.md)
 - [CloudHospitalApi.models.SendBirdUserViewModel](docs/SendBirdUserViewModel.md)
 - [CloudHospitalApi.models.SendFileRequestModel](docs/SendFileRequestModel.md)
 - [CloudHospitalApi.models.Service](docs/Service.md)
 - [CloudHospitalApi.models.ServiceCategoriesViewModel](docs/ServiceCategoriesViewModel.md)
 - [CloudHospitalApi.models.ServiceCategory](docs/ServiceCategory.md)
 - [CloudHospitalApi.models.ServiceCategoryItemViewModel](docs/ServiceCategoryItemViewModel.md)
 - [CloudHospitalApi.models.ServiceCategoryViewModel](docs/ServiceCategoryViewModel.md)
 - [CloudHospitalApi.models.ServiceItemViewModel](docs/ServiceItemViewModel.md)
 - [CloudHospitalApi.models.ServiceLocaleViewModel](docs/ServiceLocaleViewModel.md)
 - [CloudHospitalApi.models.ServiceReview](docs/ServiceReview.md)
 - [CloudHospitalApi.models.ServiceViewModel](docs/ServiceViewModel.md)
 - [CloudHospitalApi.models.ServicesViewModel](docs/ServicesViewModel.md)
 - [CloudHospitalApi.models.SnsHandle](docs/SnsHandle.md)
 - [CloudHospitalApi.models.SnsHandleViewModel](docs/SnsHandleViewModel.md)
 - [CloudHospitalApi.models.SnsType](docs/SnsType.md)
 - [CloudHospitalApi.models.Source](docs/Source.md)
 - [CloudHospitalApi.models.SourceViewModel](docs/SourceViewModel.md)
 - [CloudHospitalApi.models.SpecialtiesViewModel](docs/SpecialtiesViewModel.md)
 - [CloudHospitalApi.models.Specialty](docs/Specialty.md)
 - [CloudHospitalApi.models.SpecialtyItemViewModel](docs/SpecialtyItemViewModel.md)
 - [CloudHospitalApi.models.SpecialtyLocaleViewModel](docs/SpecialtyLocaleViewModel.md)
 - [CloudHospitalApi.models.SpecialtyType](docs/SpecialtyType.md)
 - [CloudHospitalApi.models.SpecialtyTypeCategoriesViewModel](docs/SpecialtyTypeCategoriesViewModel.md)
 - [CloudHospitalApi.models.SpecialtyTypeCategoryItemViewModel](docs/SpecialtyTypeCategoryItemViewModel.md)
 - [CloudHospitalApi.models.SpecialtyTypeCategoryViewModel](docs/SpecialtyTypeCategoryViewModel.md)
 - [CloudHospitalApi.models.SpecialtyTypeItemViewModel](docs/SpecialtyTypeItemViewModel.md)
 - [CloudHospitalApi.models.SpecialtyTypeLocaleViewModel](docs/SpecialtyTypeLocaleViewModel.md)
 - [CloudHospitalApi.models.SpecialtyTypeViewModel](docs/SpecialtyTypeViewModel.md)
 - [CloudHospitalApi.models.SpecialtyTypesViewModel](docs/SpecialtyTypesViewModel.md)
 - [CloudHospitalApi.models.SpecialtyViewModel](docs/SpecialtyViewModel.md)
 - [CloudHospitalApi.models.SubscriptionViewModel](docs/SubscriptionViewModel.md)
 - [CloudHospitalApi.models.SurgeryProcedureViewModel](docs/SurgeryProcedureViewModel.md)
 - [CloudHospitalApi.models.SurveyModel](docs/SurveyModel.md)
 - [CloudHospitalApi.models.SurveyQuestionModel](docs/SurveyQuestionModel.md)
 - [CloudHospitalApi.models.Tag](docs/Tag.md)
 - [CloudHospitalApi.models.TagItemViewModel](docs/TagItemViewModel.md)
 - [CloudHospitalApi.models.TagViewModel](docs/TagViewModel.md)
 - [CloudHospitalApi.models.TagsViewModel](docs/TagsViewModel.md)
 - [CloudHospitalApi.models.TranslateCommand](docs/TranslateCommand.md)
 - [CloudHospitalApi.models.UpdateAccreditationCommand](docs/UpdateAccreditationCommand.md)
 - [CloudHospitalApi.models.UpdateArticleCommand](docs/UpdateArticleCommand.md)
 - [CloudHospitalApi.models.UpdateArticleContributorCommand](docs/UpdateArticleContributorCommand.md)
 - [CloudHospitalApi.models.UpdateArticleLocaleCommand](docs/UpdateArticleLocaleCommand.md)
 - [CloudHospitalApi.models.UpdateBookingCommand](docs/UpdateBookingCommand.md)
 - [CloudHospitalApi.models.UpdateCHAdminCommand](docs/UpdateCHAdminCommand.md)
 - [CloudHospitalApi.models.UpdateCHManagerCommand](docs/UpdateCHManagerCommand.md)
 - [CloudHospitalApi.models.UpdateConsultationCommand](docs/UpdateConsultationCommand.md)
 - [CloudHospitalApi.models.UpdateContributorCommand](docs/UpdateContributorCommand.md)
 - [CloudHospitalApi.models.UpdateContributorSnsHandleCommand](docs/UpdateContributorSnsHandleCommand.md)
 - [CloudHospitalApi.models.UpdateCountryCommand](docs/UpdateCountryCommand.md)
 - [CloudHospitalApi.models.UpdateCountryLocaleCommand](docs/UpdateCountryLocaleCommand.md)
 - [CloudHospitalApi.models.UpdateDealCommand](docs/UpdateDealCommand.md)
 - [CloudHospitalApi.models.UpdateDealPackageCommand](docs/UpdateDealPackageCommand.md)
 - [CloudHospitalApi.models.UpdateDepartmentCommand](docs/UpdateDepartmentCommand.md)
 - [CloudHospitalApi.models.UpdateDeviceCommand](docs/UpdateDeviceCommand.md)
 - [CloudHospitalApi.models.UpdateDoctorCertificateCommand](docs/UpdateDoctorCertificateCommand.md)
 - [CloudHospitalApi.models.UpdateDoctorCommand](docs/UpdateDoctorCommand.md)
 - [CloudHospitalApi.models.UpdateDoctorEducationCommand](docs/UpdateDoctorEducationCommand.md)
 - [CloudHospitalApi.models.UpdateDoctorLocaleCommand](docs/UpdateDoctorLocaleCommand.md)
 - [CloudHospitalApi.models.UpdateDoctorMediaCommand](docs/UpdateDoctorMediaCommand.md)
 - [CloudHospitalApi.models.UpdateDoctorMediaSequenceCommand](docs/UpdateDoctorMediaSequenceCommand.md)
 - [CloudHospitalApi.models.UpdateDoctorPortfolioCommand](docs/UpdateDoctorPortfolioCommand.md)
 - [CloudHospitalApi.models.UpdateDoctorReviewCommand](docs/UpdateDoctorReviewCommand.md)
 - [CloudHospitalApi.models.UpdateEquipmentCommand](docs/UpdateEquipmentCommand.md)
 - [CloudHospitalApi.models.UpdateFaqCategoryLocaleCommand](docs/UpdateFaqCategoryLocaleCommand.md)
 - [CloudHospitalApi.models.UpdateFaqLocaleCommand](docs/UpdateFaqLocaleCommand.md)
 - [CloudHospitalApi.models.UpdateHealthProfileCommand](docs/UpdateHealthProfileCommand.md)
 - [CloudHospitalApi.models.UpdateHospitalCommand](docs/UpdateHospitalCommand.md)
 - [CloudHospitalApi.models.UpdateHospitalLocaleCommand](docs/UpdateHospitalLocaleCommand.md)
 - [CloudHospitalApi.models.UpdateHospitalMediaCommand](docs/UpdateHospitalMediaCommand.md)
 - [CloudHospitalApi.models.UpdateHospitalMediaSequenceCommand](docs/UpdateHospitalMediaSequenceCommand.md)
 - [CloudHospitalApi.models.UpdateHospitalReviewCommand](docs/UpdateHospitalReviewCommand.md)
 - [CloudHospitalApi.models.UpdateHospitalSpecialtyCommand](docs/UpdateHospitalSpecialtyCommand.md)
 - [CloudHospitalApi.models.UpdateManagerCommand](docs/UpdateManagerCommand.md)
 - [CloudHospitalApi.models.UpdatePartnerCommand](docs/UpdatePartnerCommand.md)
 - [CloudHospitalApi.models.UpdatePatientCommand](docs/UpdatePatientCommand.md)
 - [CloudHospitalApi.models.UpdateQuestionCommand](docs/UpdateQuestionCommand.md)
 - [CloudHospitalApi.models.UpdateQuestionCommentCommand](docs/UpdateQuestionCommentCommand.md)
 - [CloudHospitalApi.models.UpdateSendBirdUserCommand](docs/UpdateSendBirdUserCommand.md)
 - [CloudHospitalApi.models.UpdateServiceCategoryCommand](docs/UpdateServiceCategoryCommand.md)
 - [CloudHospitalApi.models.UpdateServiceCommand](docs/UpdateServiceCommand.md)
 - [CloudHospitalApi.models.UpdateServiceLocaleCommand](docs/UpdateServiceLocaleCommand.md)
 - [CloudHospitalApi.models.UpdateServiceSequenceCommand](docs/UpdateServiceSequenceCommand.md)
 - [CloudHospitalApi.models.UpdateSpecialtyCommand](docs/UpdateSpecialtyCommand.md)
 - [CloudHospitalApi.models.UpdateSpecialtyLocaleCommand](docs/UpdateSpecialtyLocaleCommand.md)
 - [CloudHospitalApi.models.UpdateSpecialtyTypeCategoryCommand](docs/UpdateSpecialtyTypeCategoryCommand.md)
 - [CloudHospitalApi.models.UpdateSpecialtyTypeCommand](docs/UpdateSpecialtyTypeCommand.md)
 - [CloudHospitalApi.models.UpdateSpecialtyTypeLocaleCommand](docs/UpdateSpecialtyTypeLocaleCommand.md)
 - [CloudHospitalApi.models.UpdateYoutubeCommand](docs/UpdateYoutubeCommand.md)
 - [CloudHospitalApi.models.User](docs/User.md)
 - [CloudHospitalApi.models.UserItemViewModel](docs/UserItemViewModel.md)
 - [CloudHospitalApi.models.UserLanguage](docs/UserLanguage.md)
 - [CloudHospitalApi.models.UserLanguageViewModel](docs/UserLanguageViewModel.md)
 - [CloudHospitalApi.models.UserLocation](docs/UserLocation.md)
 - [CloudHospitalApi.models.UserLocationType](docs/UserLocationType.md)
 - [CloudHospitalApi.models.UserLocationViewModel](docs/UserLocationViewModel.md)
 - [CloudHospitalApi.models.UserViewModel](docs/UserViewModel.md)
 - [CloudHospitalApi.models.VendorType](docs/VendorType.md)
 - [CloudHospitalApi.models.Youtube](docs/Youtube.md)
 - [CloudHospitalApi.models.YoutubeItemViewModel](docs/YoutubeItemViewModel.md)
 - [CloudHospitalApi.models.YoutubeTag](docs/YoutubeTag.md)
 - [CloudHospitalApi.models.YoutubeTagItemViewModel](docs/YoutubeTagItemViewModel.md)
 - [CloudHospitalApi.models.YoutubeViewModel](docs/YoutubeViewModel.md)
 - [CloudHospitalApi.models.YoutubesViewModel](docs/YoutubesViewModel.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="oauth2"></a>
### oauth2

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://identity-int.icloudhospital.com/connect/authorize
- **Scopes**: 
  - CloudHospital_api: CloudHospital_api
  - IdentityServerApi: IdentityServerApi

