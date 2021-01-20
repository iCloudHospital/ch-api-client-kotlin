# org.openapitools.client - Kotlin client library for Swagger UI - Cloud Hospital Api-INT

## Requires

* Kotlin 1.3.61
* Gradle 4.9

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
*AffiliationsApi* | [**apiV1HospitalsHospitalIdDoctorsDoctorIdDelete**](docs/AffiliationsApi.md#apiv1hospitalshospitaliddoctorsdoctoriddelete) | **DELETE** api/v1/hospitals/{hospitalId}/doctors/{doctorId} | Remove link between the doctor and the hospital.
*AffiliationsApi* | [**apiV1HospitalsHospitalIdDoctorsDoctorIdPost**](docs/AffiliationsApi.md#apiv1hospitalshospitaliddoctorsdoctoridpost) | **POST** api/v1/hospitals/{hospitalId}/doctors/{doctorId} | Link a doctor to a hospital.
*AffiliationsApi* | [**apiV1HospitalsHospitalIdManagersManagerIdDelete**](docs/AffiliationsApi.md#apiv1hospitalshospitalidmanagersmanageriddelete) | **DELETE** api/v1/hospitals/{hospitalId}/managers/{managerId} | Remove link between the manager and the hospital.
*AffiliationsApi* | [**apiV1HospitalsHospitalIdManagersManagerIdPost**](docs/AffiliationsApi.md#apiv1hospitalshospitalidmanagersmanageridpost) | **POST** api/v1/hospitals/{hospitalId}/managers/{managerId} | Link a manager to a hospital.
*ArticlesApi* | [**apiV1HospitalsArticlesGet**](docs/ArticlesApi.md#apiv1hospitalsarticlesget) | **GET** api/v1/hospitals/articles | Get all articles.
*ArticlesApi* | [**apiV1HospitalsArticlesSlugsSlugGet**](docs/ArticlesApi.md#apiv1hospitalsarticlesslugsslugget) | **GET** api/v1/hospitals/articles/slugs/{slug} | Get article by slug.
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
*CountriesApi* | [**apiV1CountriesCountryIdDelete**](docs/CountriesApi.md#apiv1countriescountryiddelete) | **DELETE** api/v1/countries/{countryId} | Delete country.
*CountriesApi* | [**apiV1CountriesCountryIdGet**](docs/CountriesApi.md#apiv1countriescountryidget) | **GET** api/v1/countries/{countryId} | Get country.
*CountriesApi* | [**apiV1CountriesCountryIdPut**](docs/CountriesApi.md#apiv1countriescountryidput) | **PUT** api/v1/countries/{countryId} | Update country.
*CountriesApi* | [**apiV1CountriesGet**](docs/CountriesApi.md#apiv1countriesget) | **GET** api/v1/countries | Get all countries.
*CountriesApi* | [**apiV1CountriesPost**](docs/CountriesApi.md#apiv1countriespost) | **POST** api/v1/countries | Create a country.
*CountriesApi* | [**apiV1CountriesSlugsSlugGet**](docs/CountriesApi.md#apiv1countriesslugsslugget) | **GET** api/v1/countries/slugs/{slug} | Get country by slug.
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
*DevicesApi* | [**apiV1DevicesDeviceIdDelete**](docs/DevicesApi.md#apiv1devicesdeviceiddelete) | **DELETE** api/v1/devices/{deviceId} | Delete device.
*DevicesApi* | [**apiV1DevicesDeviceIdLoginsPost**](docs/DevicesApi.md#apiv1devicesdeviceidloginspost) | **POST** api/v1/devices/{deviceId}/logins | Create device login.
*DevicesApi* | [**apiV1DevicesDeviceIdPut**](docs/DevicesApi.md#apiv1devicesdeviceidput) | **PUT** api/v1/devices/{deviceId} | Update device.
*DevicesApi* | [**apiV1DevicesGet**](docs/DevicesApi.md#apiv1devicesget) | **GET** api/v1/devices | Get all devices.
*DevicesApi* | [**apiV1DevicesPost**](docs/DevicesApi.md#apiv1devicespost) | **POST** api/v1/devices | Create device.
*DevicesApi* | [**apiV1DevicesTokenGet**](docs/DevicesApi.md#apiv1devicestokenget) | **GET** api/v1/devices/{token} | Get device.
*DoctorCertificatesApi* | [**apiV1DoctorsCertificatesGet**](docs/DoctorCertificatesApi.md#apiv1doctorscertificatesget) | **GET** api/v1/doctors/certificates | Get all certificates.
*DoctorCertificatesApi* | [**apiV1DoctorsDoctorIdCertificatesCertificateIdDelete**](docs/DoctorCertificatesApi.md#apiv1doctorsdoctoridcertificatescertificateiddelete) | **DELETE** api/v1/doctors/{doctorId}/certificates/{certificateId} | Delete certificate.
*DoctorCertificatesApi* | [**apiV1DoctorsDoctorIdCertificatesCertificateIdGet**](docs/DoctorCertificatesApi.md#apiv1doctorsdoctoridcertificatescertificateidget) | **GET** api/v1/doctors/{doctorId}/certificates/{certificateId} | Get certificate.
*DoctorCertificatesApi* | [**apiV1DoctorsDoctorIdCertificatesCertificateIdPut**](docs/DoctorCertificatesApi.md#apiv1doctorsdoctoridcertificatescertificateidput) | **PUT** api/v1/doctors/{doctorId}/certificates/{certificateId} | Update department.
*DoctorCertificatesApi* | [**apiV1DoctorsDoctorIdCertificatesPost**](docs/DoctorCertificatesApi.md#apiv1doctorsdoctoridcertificatespost) | **POST** api/v1/doctors/{doctorId}/certificates | Create certificate.
*DoctorReviewsApi* | [**apiV1DoctorsDoctorIdReviewsPatientIdDelete**](docs/DoctorReviewsApi.md#apiv1doctorsdoctoridreviewspatientiddelete) | **DELETE** api/v1/doctors/{doctorId}/reviews/{patientId} | Delete review.
*DoctorReviewsApi* | [**apiV1DoctorsDoctorIdReviewsPatientIdGet**](docs/DoctorReviewsApi.md#apiv1doctorsdoctoridreviewspatientidget) | **GET** api/v1/doctors/{doctorId}/reviews/{patientId} | Get review.
*DoctorReviewsApi* | [**apiV1DoctorsDoctorIdReviewsPatientIdPut**](docs/DoctorReviewsApi.md#apiv1doctorsdoctoridreviewspatientidput) | **PUT** api/v1/doctors/{doctorId}/reviews/{patientId} | Update review.
*DoctorReviewsApi* | [**apiV1DoctorsDoctorIdReviewsPost**](docs/DoctorReviewsApi.md#apiv1doctorsdoctoridreviewspost) | **POST** api/v1/doctors/{doctorId}/reviews | Create review.
*DoctorReviewsApi* | [**apiV1DoctorsReviewsGet**](docs/DoctorReviewsApi.md#apiv1doctorsreviewsget) | **GET** api/v1/doctors/reviews | Get all reviews.
*DoctorSpecialtiesApi* | [**apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost**](docs/DoctorSpecialtiesApi.md#apiv1doctorsdoctoridspecialtyspecialtyidpost) | **POST** api/v1/doctors/{doctorId}/specialty/{specialtyId} | Link a doctor to a specialty.
*DoctorSpecialtiesApi* | [**apiV1DoctorsHospitalIdDoctorsDoctorIdDelete**](docs/DoctorSpecialtiesApi.md#apiv1doctorshospitaliddoctorsdoctoriddelete) | **DELETE** api/v1/doctors/{hospitalId}/doctors/{doctorId} | Remove link between the doctor and the specialty.
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
*GroupChannelsApi* | [**apiV1GroupchannelsChannelUrlInvitePost**](docs/GroupChannelsApi.md#apiv1groupchannelschannelurlinvitepost) | **POST** api/v1/groupchannels/{channelUrl}/invite | 
*GroupChannelsApi* | [**apiV1GroupchannelsDealDealIdPost**](docs/GroupChannelsApi.md#apiv1groupchannelsdealdealidpost) | **POST** api/v1/groupchannels/deal/{dealId} | 
*GroupChannelsApi* | [**apiV1GroupchannelsDealIdGet**](docs/GroupChannelsApi.md#apiv1groupchannelsdealidget) | **GET** api/v1/groupchannels/{dealId} | 
*GroupChannelsApi* | [**apiV1GroupchannelsDoctorDoctorIdPost**](docs/GroupChannelsApi.md#apiv1groupchannelsdoctordoctoridpost) | **POST** api/v1/groupchannels/doctor/{doctorId} | 
*GroupChannelsApi* | [**apiV1GroupchannelsHospitalHospitalIdPost**](docs/GroupChannelsApi.md#apiv1groupchannelshospitalhospitalidpost) | **POST** api/v1/groupchannels/hospital/{hospitalId} | 
*HospitalReviewsApi* | [**apiV1HospitalsHospitalIdReviewsPatientIdDelete**](docs/HospitalReviewsApi.md#apiv1hospitalshospitalidreviewspatientiddelete) | **DELETE** api/v1/hospitals/{hospitalId}/reviews/{patientId} | Delete review.
*HospitalReviewsApi* | [**apiV1HospitalsHospitalIdReviewsPatientIdGet**](docs/HospitalReviewsApi.md#apiv1hospitalshospitalidreviewspatientidget) | **GET** api/v1/hospitals/{hospitalId}/reviews/{patientId} | Get review.
*HospitalReviewsApi* | [**apiV1HospitalsHospitalIdReviewsPatientIdPut**](docs/HospitalReviewsApi.md#apiv1hospitalshospitalidreviewspatientidput) | **PUT** api/v1/hospitals/{hospitalId}/reviews/{patientId} | Update review.
*HospitalReviewsApi* | [**apiV1HospitalsHospitalIdReviewsPost**](docs/HospitalReviewsApi.md#apiv1hospitalshospitalidreviewspost) | **POST** api/v1/hospitals/{hospitalId}/reviews | Create review.
*HospitalReviewsApi* | [**apiV1HospitalsReviewsGet**](docs/HospitalReviewsApi.md#apiv1hospitalsreviewsget) | **GET** api/v1/hospitals/reviews | Get all reviews.
*HospitalSpecialtiesApi* | [**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdDelete**](docs/HospitalSpecialtiesApi.md#apiv1hospitalshospitalidspecialtiesspecialtyiddelete) | **DELETE** api/v1/hospitals/{hospitalId}/specialties/{specialtyId} | Delete hospitalSpecialty.
*HospitalSpecialtiesApi* | [**apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPost**](docs/HospitalSpecialtiesApi.md#apiv1hospitalshospitalidspecialtiesspecialtyidpost) | **POST** api/v1/hospitals/{hospitalId}/specialties/{specialtyId} | Create hospitalSpecialty.
*HospitalSpecialtiesApi* | [**apiV1HospitalsHospitalIdSpecialtysequencePut**](docs/HospitalSpecialtiesApi.md#apiv1hospitalshospitalidspecialtysequenceput) | **PUT** api/v1/hospitals/{hospitalId}/specialtysequence | Update hospitalSpecialty sequence.
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
*ManagersApi* | [**apiV1ManagersGet**](docs/ManagersApi.md#apiv1managersget) | **GET** api/v1/managers | Get all hospital managers.
*ManagersApi* | [**apiV1ManagersManagerIdDelete**](docs/ManagersApi.md#apiv1managersmanageriddelete) | **DELETE** api/v1/managers/{managerId} | Delete hospital manager.
*ManagersApi* | [**apiV1ManagersManagerIdGet**](docs/ManagersApi.md#apiv1managersmanageridget) | **GET** api/v1/managers/{managerId} | Get hospital manager.
*ManagersApi* | [**apiV1ManagersManagerIdPut**](docs/ManagersApi.md#apiv1managersmanageridput) | **PUT** api/v1/managers/{managerId} | Update hospital manager.
*ManagersApi* | [**apiV1ManagersPost**](docs/ManagersApi.md#apiv1managerspost) | **POST** api/v1/managers | Create hospital manager.
*MoviesApi* | [**apiV1MoviesPost**](docs/MoviesApi.md#apiv1moviespost) | **POST** api/v1/movies | 
*NotificationsApi* | [**apiV1NotificationsCheckPost**](docs/NotificationsApi.md#apiv1notificationscheckpost) | **POST** api/v1/notifications/check | Check notification.
*NotificationsApi* | [**apiV1NotificationsGet**](docs/NotificationsApi.md#apiv1notificationsget) | **GET** api/v1/notifications | Get all notifications.
*PartnersApi* | [**apiV1PartnersGet**](docs/PartnersApi.md#apiv1partnersget) | **GET** api/v1/partners | Get all partners.
*PartnersApi* | [**apiV1PartnersPartnerIdDelete**](docs/PartnersApi.md#apiv1partnerspartneriddelete) | **DELETE** api/v1/partners/{partnerId} | Delete patner.
*PartnersApi* | [**apiV1PartnersPartnerIdGet**](docs/PartnersApi.md#apiv1partnerspartneridget) | **GET** api/v1/partners/{partnerId} | Get partner.
*PartnersApi* | [**apiV1PartnersPartnerIdPut**](docs/PartnersApi.md#apiv1partnerspartneridput) | **PUT** api/v1/partners/{partnerId} | Update partner.
*PartnersApi* | [**apiV1PartnersPost**](docs/PartnersApi.md#apiv1partnerspost) | **POST** api/v1/partners | Create partner.
*PatientsApi* | [**apiV1PatientsGet**](docs/PatientsApi.md#apiv1patientsget) | **GET** api/v1/patients | Get all patients.
*PatientsApi* | [**apiV1PatientsPatientIdDelete**](docs/PatientsApi.md#apiv1patientspatientiddelete) | **DELETE** api/v1/patients/{patientId} | Delete patient.
*PatientsApi* | [**apiV1PatientsPatientIdGet**](docs/PatientsApi.md#apiv1patientspatientidget) | **GET** api/v1/patients/{patientId} | Get patient.
*PatientsApi* | [**apiV1PatientsPatientIdPut**](docs/PatientsApi.md#apiv1patientspatientidput) | **PUT** api/v1/patients/{patientId} | Update patient.
*PatientsApi* | [**apiV1PatientsPost**](docs/PatientsApi.md#apiv1patientspost) | **POST** api/v1/patients | Create patient.
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
*SearchApi* | [**apiV1SearchDealsGet**](docs/SearchApi.md#apiv1searchdealsget) | **GET** api/v1/search/deals | 
*SearchApi* | [**apiV1SearchDoctorsGet**](docs/SearchApi.md#apiv1searchdoctorsget) | **GET** api/v1/search/doctors | 
*SearchApi* | [**apiV1SearchGetcountGet**](docs/SearchApi.md#apiv1searchgetcountget) | **GET** api/v1/search/getcount | 
*SearchApi* | [**apiV1SearchHospitalsGet**](docs/SearchApi.md#apiv1searchhospitalsget) | **GET** api/v1/search/hospitals | 
*SearchApi* | [**apiV1SearchSpecialtiesGet**](docs/SearchApi.md#apiv1searchspecialtiesget) | **GET** api/v1/search/specialties | 
*SearchApi* | [**apiV1SearchSpecialtytypesGet**](docs/SearchApi.md#apiv1searchspecialtytypesget) | **GET** api/v1/search/specialtytypes | 
*ServiceCategoriesApi* | [**apiV1ServicecategoriesGet**](docs/ServiceCategoriesApi.md#apiv1servicecategoriesget) | **GET** api/v1/servicecategories | Get all ServiceCategories.
*ServiceCategoriesApi* | [**apiV1ServicecategoriesPost**](docs/ServiceCategoriesApi.md#apiv1servicecategoriespost) | **POST** api/v1/servicecategories | Create ServiceCategory.
*ServiceCategoriesApi* | [**apiV1ServicecategoriesServiceCategoryIdDelete**](docs/ServiceCategoriesApi.md#apiv1servicecategoriesservicecategoryiddelete) | **DELETE** api/v1/servicecategories/{serviceCategoryId} | Delete ServiceCategory.
*ServiceCategoriesApi* | [**apiV1ServicecategoriesServiceCategoryIdGet**](docs/ServiceCategoriesApi.md#apiv1servicecategoriesservicecategoryidget) | **GET** api/v1/servicecategories/{serviceCategoryId} | Get ServiceCategory.
*ServiceCategoriesApi* | [**apiV1ServicecategoriesServiceCategoryIdPut**](docs/ServiceCategoriesApi.md#apiv1servicecategoriesservicecategoryidput) | **PUT** api/v1/servicecategories/{serviceCategoryId} | Update ServiceCategory
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
*SpecialtyTypeCategoriesApi* | [**apiV1SpecialtytypecategoriesGet**](docs/SpecialtyTypeCategoriesApi.md#apiv1specialtytypecategoriesget) | **GET** api/v1/specialtytypecategories | Get all SpecialtyTypeCategories.
*SpecialtyTypeCategoriesApi* | [**apiV1SpecialtytypecategoriesPost**](docs/SpecialtyTypeCategoriesApi.md#apiv1specialtytypecategoriespost) | **POST** api/v1/specialtytypecategories | Create specialtyTypeCategory.
*SpecialtyTypeCategoriesApi* | [**apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdDelete**](docs/SpecialtyTypeCategoriesApi.md#apiv1specialtytypecategoriesspecialtytypecategoryiddelete) | **DELETE** api/v1/specialtytypecategories/{specialtyTypeCategoryId} | Delete specialtyTypeCategory.
*SpecialtyTypeCategoriesApi* | [**apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdGet**](docs/SpecialtyTypeCategoriesApi.md#apiv1specialtytypecategoriesspecialtytypecategoryidget) | **GET** api/v1/specialtytypecategories/{specialtyTypeCategoryId} | Get specialtyTypeCategory.
*SpecialtyTypeCategoriesApi* | [**apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdPut**](docs/SpecialtyTypeCategoriesApi.md#apiv1specialtytypecategoriesspecialtytypecategoryidput) | **PUT** api/v1/specialtytypecategories/{specialtyTypeCategoryId} | Update specialtyTypeCategory
*SpecialtyTypesApi* | [**apiV1SpecialtytypesGet**](docs/SpecialtyTypesApi.md#apiv1specialtytypesget) | **GET** api/v1/specialtytypes | Get all SpecialtyTypes.
*SpecialtyTypesApi* | [**apiV1SpecialtytypesPost**](docs/SpecialtyTypesApi.md#apiv1specialtytypespost) | **POST** api/v1/specialtytypes | Create specialtyType.
*SpecialtyTypesApi* | [**apiV1SpecialtytypesSlugsSlugGet**](docs/SpecialtyTypesApi.md#apiv1specialtytypesslugsslugget) | **GET** api/v1/specialtytypes/slugs/{slug} | Get specialtyType by slug.
*SpecialtyTypesApi* | [**apiV1SpecialtytypesSpecialtyTypeIdDelete**](docs/SpecialtyTypesApi.md#apiv1specialtytypesspecialtytypeiddelete) | **DELETE** api/v1/specialtytypes/{specialtyTypeId} | Delete specialtyType.
*SpecialtyTypesApi* | [**apiV1SpecialtytypesSpecialtyTypeIdGet**](docs/SpecialtyTypesApi.md#apiv1specialtytypesspecialtytypeidget) | **GET** api/v1/specialtytypes/{specialtyTypeId} | Get specialtyType.
*SpecialtyTypesApi* | [**apiV1SpecialtytypesSpecialtyTypeIdPut**](docs/SpecialtyTypesApi.md#apiv1specialtytypesspecialtytypeidput) | **PUT** api/v1/specialtytypes/{specialtyTypeId} | Update specialtyType
*YoutubesApi* | [**apiV1YoutubesGet**](docs/YoutubesApi.md#apiv1youtubesget) | **GET** api/v1/youtubes | Get all youtubes.
*YoutubesApi* | [**apiV1YoutubesPost**](docs/YoutubesApi.md#apiv1youtubespost) | **POST** api/v1/youtubes | Create an youtube.
*YoutubesApi* | [**apiV1YoutubesSlugsSlugGet**](docs/YoutubesApi.md#apiv1youtubesslugsslugget) | **GET** api/v1/youtubes/slugs/{slug} | Get youtube by slug.
*YoutubesApi* | [**apiV1YoutubesYoutubeIdDelete**](docs/YoutubesApi.md#apiv1youtubesyoutubeiddelete) | **DELETE** api/v1/youtubes/{youtubeId} | Delete youtube.
*YoutubesApi* | [**apiV1YoutubesYoutubeIdGet**](docs/YoutubesApi.md#apiv1youtubesyoutubeidget) | **GET** api/v1/youtubes/{youtubeId} | Get youtube.
*YoutubesApi* | [**apiV1YoutubesYoutubeIdPut**](docs/YoutubesApi.md#apiv1youtubesyoutubeidput) | **PUT** api/v1/youtubes/{youtubeId} | Update youtube.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.Account](docs/Account.md)
 - [org.openapitools.client.models.Accreditation](docs/Accreditation.md)
 - [org.openapitools.client.models.AccreditationViewModel](docs/AccreditationViewModel.md)
 - [org.openapitools.client.models.AdminMessageViewModel](docs/AdminMessageViewModel.md)
 - [org.openapitools.client.models.ApproveBookingCommand](docs/ApproveBookingCommand.md)
 - [org.openapitools.client.models.ApproveConsultationCommand](docs/ApproveConsultationCommand.md)
 - [org.openapitools.client.models.Article](docs/Article.md)
 - [org.openapitools.client.models.ArticleItemViewModel](docs/ArticleItemViewModel.md)
 - [org.openapitools.client.models.ArticleStatus](docs/ArticleStatus.md)
 - [org.openapitools.client.models.ArticleTag](docs/ArticleTag.md)
 - [org.openapitools.client.models.ArticleTagItemViewModel](docs/ArticleTagItemViewModel.md)
 - [org.openapitools.client.models.ArticleViewModel](docs/ArticleViewModel.md)
 - [org.openapitools.client.models.ArticlesViewModel](docs/ArticlesViewModel.md)
 - [org.openapitools.client.models.AuditableEntity](docs/AuditableEntity.md)
 - [org.openapitools.client.models.Award](docs/Award.md)
 - [org.openapitools.client.models.AwardViewModel](docs/AwardViewModel.md)
 - [org.openapitools.client.models.AzureSearchViewModel](docs/AzureSearchViewModel.md)
 - [org.openapitools.client.models.Booking](docs/Booking.md)
 - [org.openapitools.client.models.BookingItemViewModel](docs/BookingItemViewModel.md)
 - [org.openapitools.client.models.BookingStatus](docs/BookingStatus.md)
 - [org.openapitools.client.models.BookingViewModel](docs/BookingViewModel.md)
 - [org.openapitools.client.models.BookingsViewModel](docs/BookingsViewModel.md)
 - [org.openapitools.client.models.CHAdminItemViewModel](docs/CHAdminItemViewModel.md)
 - [org.openapitools.client.models.CHAdminViewModel](docs/CHAdminViewModel.md)
 - [org.openapitools.client.models.CHAdminsViewModel](docs/CHAdminsViewModel.md)
 - [org.openapitools.client.models.CHManagerItemViewModel](docs/CHManagerItemViewModel.md)
 - [org.openapitools.client.models.CHManagerViewModel](docs/CHManagerViewModel.md)
 - [org.openapitools.client.models.CHManagersViewModel](docs/CHManagersViewModel.md)
 - [org.openapitools.client.models.ChangeEmailCommand](docs/ChangeEmailCommand.md)
 - [org.openapitools.client.models.ChangeLog](docs/ChangeLog.md)
 - [org.openapitools.client.models.ChargeStatus](docs/ChargeStatus.md)
 - [org.openapitools.client.models.CheckNotificationsCommand](docs/CheckNotificationsCommand.md)
 - [org.openapitools.client.models.CommunicationUserTokenModel](docs/CommunicationUserTokenModel.md)
 - [org.openapitools.client.models.ConfirmEmailCommand](docs/ConfirmEmailCommand.md)
 - [org.openapitools.client.models.Consultation](docs/Consultation.md)
 - [org.openapitools.client.models.ConsultationItemViewModel](docs/ConsultationItemViewModel.md)
 - [org.openapitools.client.models.ConsultationStatus](docs/ConsultationStatus.md)
 - [org.openapitools.client.models.ConsultationType](docs/ConsultationType.md)
 - [org.openapitools.client.models.ConsultationViewModel](docs/ConsultationViewModel.md)
 - [org.openapitools.client.models.ConsultationsViewModel](docs/ConsultationsViewModel.md)
 - [org.openapitools.client.models.CountriesViewModel](docs/CountriesViewModel.md)
 - [org.openapitools.client.models.Country](docs/Country.md)
 - [org.openapitools.client.models.CountryItemViewModel](docs/CountryItemViewModel.md)
 - [org.openapitools.client.models.CountryViewModel](docs/CountryViewModel.md)
 - [org.openapitools.client.models.CreateArticleCommand](docs/CreateArticleCommand.md)
 - [org.openapitools.client.models.CreateBookingCommand](docs/CreateBookingCommand.md)
 - [org.openapitools.client.models.CreateCHAdminCommand](docs/CreateCHAdminCommand.md)
 - [org.openapitools.client.models.CreateCHManagerCommand](docs/CreateCHManagerCommand.md)
 - [org.openapitools.client.models.CreateConsultationCommand](docs/CreateConsultationCommand.md)
 - [org.openapitools.client.models.CreateCountryCommand](docs/CreateCountryCommand.md)
 - [org.openapitools.client.models.CreateDealCommand](docs/CreateDealCommand.md)
 - [org.openapitools.client.models.CreateDealPackageCommand](docs/CreateDealPackageCommand.md)
 - [org.openapitools.client.models.CreateDepartmentCommand](docs/CreateDepartmentCommand.md)
 - [org.openapitools.client.models.CreateDeviceCommand](docs/CreateDeviceCommand.md)
 - [org.openapitools.client.models.CreateDeviceLoginCommand](docs/CreateDeviceLoginCommand.md)
 - [org.openapitools.client.models.CreateDoctorCertificateCommand](docs/CreateDoctorCertificateCommand.md)
 - [org.openapitools.client.models.CreateDoctorCommand](docs/CreateDoctorCommand.md)
 - [org.openapitools.client.models.CreateDoctorReviewCommand](docs/CreateDoctorReviewCommand.md)
 - [org.openapitools.client.models.CreateEquipmentCommand](docs/CreateEquipmentCommand.md)
 - [org.openapitools.client.models.CreateHospitalCommand](docs/CreateHospitalCommand.md)
 - [org.openapitools.client.models.CreateHospitalReviewCommand](docs/CreateHospitalReviewCommand.md)
 - [org.openapitools.client.models.CreateManagerCommand](docs/CreateManagerCommand.md)
 - [org.openapitools.client.models.CreatePartnerCommand](docs/CreatePartnerCommand.md)
 - [org.openapitools.client.models.CreatePatientCommand](docs/CreatePatientCommand.md)
 - [org.openapitools.client.models.CreateQuestionCommand](docs/CreateQuestionCommand.md)
 - [org.openapitools.client.models.CreateQuestionCommentCommand](docs/CreateQuestionCommentCommand.md)
 - [org.openapitools.client.models.CreateSendBirdCurrentUserCommand](docs/CreateSendBirdCurrentUserCommand.md)
 - [org.openapitools.client.models.CreateServiceCategoryCommand](docs/CreateServiceCategoryCommand.md)
 - [org.openapitools.client.models.CreateServiceCommand](docs/CreateServiceCommand.md)
 - [org.openapitools.client.models.CreateSpecialtyCommand](docs/CreateSpecialtyCommand.md)
 - [org.openapitools.client.models.CreateSpecialtyTypeCategoryCommand](docs/CreateSpecialtyTypeCategoryCommand.md)
 - [org.openapitools.client.models.CreateSpecialtyTypeCommand](docs/CreateSpecialtyTypeCommand.md)
 - [org.openapitools.client.models.CreateYoutubeCommand](docs/CreateYoutubeCommand.md)
 - [org.openapitools.client.models.Customer](docs/Customer.md)
 - [org.openapitools.client.models.Deal](docs/Deal.md)
 - [org.openapitools.client.models.DealItemViewModel](docs/DealItemViewModel.md)
 - [org.openapitools.client.models.DealPackage](docs/DealPackage.md)
 - [org.openapitools.client.models.DealPackageItemViewModel](docs/DealPackageItemViewModel.md)
 - [org.openapitools.client.models.DealPackageSearchViewModel](docs/DealPackageSearchViewModel.md)
 - [org.openapitools.client.models.DealPackageService](docs/DealPackageService.md)
 - [org.openapitools.client.models.DealPackageServiceItemViewModel](docs/DealPackageServiceItemViewModel.md)
 - [org.openapitools.client.models.DealPackageViewModel](docs/DealPackageViewModel.md)
 - [org.openapitools.client.models.DealSearchResultViewModel](docs/DealSearchResultViewModel.md)
 - [org.openapitools.client.models.DealSearchViewModel](docs/DealSearchViewModel.md)
 - [org.openapitools.client.models.DealViewModel](docs/DealViewModel.md)
 - [org.openapitools.client.models.DealsViewModel](docs/DealsViewModel.md)
 - [org.openapitools.client.models.Department](docs/Department.md)
 - [org.openapitools.client.models.DepartmentItemViewModel](docs/DepartmentItemViewModel.md)
 - [org.openapitools.client.models.DepartmentViewModel](docs/DepartmentViewModel.md)
 - [org.openapitools.client.models.DepartmentsViewModel](docs/DepartmentsViewModel.md)
 - [org.openapitools.client.models.Device](docs/Device.md)
 - [org.openapitools.client.models.DeviceItemViewModel](docs/DeviceItemViewModel.md)
 - [org.openapitools.client.models.DeviceLogin](docs/DeviceLogin.md)
 - [org.openapitools.client.models.DeviceViewModel](docs/DeviceViewModel.md)
 - [org.openapitools.client.models.DevicesViewModel](docs/DevicesViewModel.md)
 - [org.openapitools.client.models.Doctor](docs/Doctor.md)
 - [org.openapitools.client.models.DoctorAffiliation](docs/DoctorAffiliation.md)
 - [org.openapitools.client.models.DoctorAffiliationViewModel](docs/DoctorAffiliationViewModel.md)
 - [org.openapitools.client.models.DoctorCertificate](docs/DoctorCertificate.md)
 - [org.openapitools.client.models.DoctorCertificateItemViewModel](docs/DoctorCertificateItemViewModel.md)
 - [org.openapitools.client.models.DoctorCertificateViewModel](docs/DoctorCertificateViewModel.md)
 - [org.openapitools.client.models.DoctorCertificatesViewModel](docs/DoctorCertificatesViewModel.md)
 - [org.openapitools.client.models.DoctorEducation](docs/DoctorEducation.md)
 - [org.openapitools.client.models.DoctorEducationItemViewModel](docs/DoctorEducationItemViewModel.md)
 - [org.openapitools.client.models.DoctorEducationViewModel](docs/DoctorEducationViewModel.md)
 - [org.openapitools.client.models.DoctorItemViewModel](docs/DoctorItemViewModel.md)
 - [org.openapitools.client.models.DoctorPortfolio](docs/DoctorPortfolio.md)
 - [org.openapitools.client.models.DoctorPortfolioItemViewModel](docs/DoctorPortfolioItemViewModel.md)
 - [org.openapitools.client.models.DoctorPortfolioViewModel](docs/DoctorPortfolioViewModel.md)
 - [org.openapitools.client.models.DoctorReview](docs/DoctorReview.md)
 - [org.openapitools.client.models.DoctorReviewItemViewModel](docs/DoctorReviewItemViewModel.md)
 - [org.openapitools.client.models.DoctorReviewViewModel](docs/DoctorReviewViewModel.md)
 - [org.openapitools.client.models.DoctorReviewsViewModel](docs/DoctorReviewsViewModel.md)
 - [org.openapitools.client.models.DoctorSearchResultViewModel](docs/DoctorSearchResultViewModel.md)
 - [org.openapitools.client.models.DoctorSpecialty](docs/DoctorSpecialty.md)
 - [org.openapitools.client.models.DoctorSpecialtyItemViewModel](docs/DoctorSpecialtyItemViewModel.md)
 - [org.openapitools.client.models.DoctorSpecialtyViewModel](docs/DoctorSpecialtyViewModel.md)
 - [org.openapitools.client.models.DoctorViewModel](docs/DoctorViewModel.md)
 - [org.openapitools.client.models.DoctorsViewModel](docs/DoctorsViewModel.md)
 - [org.openapitools.client.models.Equipment](docs/Equipment.md)
 - [org.openapitools.client.models.EquipmentItemViewModel](docs/EquipmentItemViewModel.md)
 - [org.openapitools.client.models.EquipmentViewModel](docs/EquipmentViewModel.md)
 - [org.openapitools.client.models.EquipmentsViewModel](docs/EquipmentsViewModel.md)
 - [org.openapitools.client.models.Gender](docs/Gender.md)
 - [org.openapitools.client.models.Hospital](docs/Hospital.md)
 - [org.openapitools.client.models.HospitalAccreditation](docs/HospitalAccreditation.md)
 - [org.openapitools.client.models.HospitalAffiliationViewModel](docs/HospitalAffiliationViewModel.md)
 - [org.openapitools.client.models.HospitalEvaluation](docs/HospitalEvaluation.md)
 - [org.openapitools.client.models.HospitalEvaluationViewModel](docs/HospitalEvaluationViewModel.md)
 - [org.openapitools.client.models.HospitalItemViewModel](docs/HospitalItemViewModel.md)
 - [org.openapitools.client.models.HospitalReview](docs/HospitalReview.md)
 - [org.openapitools.client.models.HospitalReviewItemViewModel](docs/HospitalReviewItemViewModel.md)
 - [org.openapitools.client.models.HospitalReviewViewModel](docs/HospitalReviewViewModel.md)
 - [org.openapitools.client.models.HospitalReviewsViewModel](docs/HospitalReviewsViewModel.md)
 - [org.openapitools.client.models.HospitalSearchItemViewModel](docs/HospitalSearchItemViewModel.md)
 - [org.openapitools.client.models.HospitalSearchResultViewModel](docs/HospitalSearchResultViewModel.md)
 - [org.openapitools.client.models.HospitalSpecialtiesViewModel](docs/HospitalSpecialtiesViewModel.md)
 - [org.openapitools.client.models.HospitalSpecialty](docs/HospitalSpecialty.md)
 - [org.openapitools.client.models.HospitalSpecialtyItemViewModel](docs/HospitalSpecialtyItemViewModel.md)
 - [org.openapitools.client.models.HospitalSpecialtyViewModel](docs/HospitalSpecialtyViewModel.md)
 - [org.openapitools.client.models.HospitalViewModel](docs/HospitalViewModel.md)
 - [org.openapitools.client.models.HospitalsViewModel](docs/HospitalsViewModel.md)
 - [org.openapitools.client.models.InviteSendBirdGroupChannelCommand](docs/InviteSendBirdGroupChannelCommand.md)
 - [org.openapitools.client.models.Location](docs/Location.md)
 - [org.openapitools.client.models.LocationViewModel](docs/LocationViewModel.md)
 - [org.openapitools.client.models.Manager](docs/Manager.md)
 - [org.openapitools.client.models.ManagerAffiliation](docs/ManagerAffiliation.md)
 - [org.openapitools.client.models.ManagerAffiliationViewModel](docs/ManagerAffiliationViewModel.md)
 - [org.openapitools.client.models.ManagerViewModel](docs/ManagerViewModel.md)
 - [org.openapitools.client.models.ManagersViewModel](docs/ManagersViewModel.md)
 - [org.openapitools.client.models.MarketingType](docs/MarketingType.md)
 - [org.openapitools.client.models.Media](docs/Media.md)
 - [org.openapitools.client.models.MediaSearchViewModel](docs/MediaSearchViewModel.md)
 - [org.openapitools.client.models.MediaType](docs/MediaType.md)
 - [org.openapitools.client.models.MediaViewModel](docs/MediaViewModel.md)
 - [org.openapitools.client.models.Metadata](docs/Metadata.md)
 - [org.openapitools.client.models.NotificationCode](docs/NotificationCode.md)
 - [org.openapitools.client.models.NotificationViewModel](docs/NotificationViewModel.md)
 - [org.openapitools.client.models.NotificationsViewModel](docs/NotificationsViewModel.md)
 - [org.openapitools.client.models.PagedListMetaData](docs/PagedListMetaData.md)
 - [org.openapitools.client.models.PartnerItemViewModel](docs/PartnerItemViewModel.md)
 - [org.openapitools.client.models.PartnerViewModel](docs/PartnerViewModel.md)
 - [org.openapitools.client.models.PartnersViewModel](docs/PartnersViewModel.md)
 - [org.openapitools.client.models.Patient](docs/Patient.md)
 - [org.openapitools.client.models.PatientItemViewModel](docs/PatientItemViewModel.md)
 - [org.openapitools.client.models.PatientViewModel](docs/PatientViewModel.md)
 - [org.openapitools.client.models.PatientsViewModel](docs/PatientsViewModel.md)
 - [org.openapitools.client.models.Payment](docs/Payment.md)
 - [org.openapitools.client.models.PaymentMethod](docs/PaymentMethod.md)
 - [org.openapitools.client.models.PaymentStatus](docs/PaymentStatus.md)
 - [org.openapitools.client.models.Platform](docs/Platform.md)
 - [org.openapitools.client.models.Procedure](docs/Procedure.md)
 - [org.openapitools.client.models.Question](docs/Question.md)
 - [org.openapitools.client.models.QuestionComment](docs/QuestionComment.md)
 - [org.openapitools.client.models.QuestionCommentItemViewModel](docs/QuestionCommentItemViewModel.md)
 - [org.openapitools.client.models.QuestionCommentViewModel](docs/QuestionCommentViewModel.md)
 - [org.openapitools.client.models.QuestionCommentsViewModel](docs/QuestionCommentsViewModel.md)
 - [org.openapitools.client.models.QuestionItemViewModel](docs/QuestionItemViewModel.md)
 - [org.openapitools.client.models.QuestionStatus](docs/QuestionStatus.md)
 - [org.openapitools.client.models.QuestionType](docs/QuestionType.md)
 - [org.openapitools.client.models.QuestionViewModel](docs/QuestionViewModel.md)
 - [org.openapitools.client.models.QuestionsViewModel](docs/QuestionsViewModel.md)
 - [org.openapitools.client.models.RefundPolicy](docs/RefundPolicy.md)
 - [org.openapitools.client.models.RefundStatus](docs/RefundStatus.md)
 - [org.openapitools.client.models.RejectBookingCommand](docs/RejectBookingCommand.md)
 - [org.openapitools.client.models.RejectConsultationCommand](docs/RejectConsultationCommand.md)
 - [org.openapitools.client.models.RejectReason](docs/RejectReason.md)
 - [org.openapitools.client.models.ReviewCategory](docs/ReviewCategory.md)
 - [org.openapitools.client.models.SearchMetaData](docs/SearchMetaData.md)
 - [org.openapitools.client.models.SendBirdGroupChannelMember](docs/SendBirdGroupChannelMember.md)
 - [org.openapitools.client.models.SendBirdGroupChannelViewModel](docs/SendBirdGroupChannelViewModel.md)
 - [org.openapitools.client.models.SendBirdGroupChannelrOperator](docs/SendBirdGroupChannelrOperator.md)
 - [org.openapitools.client.models.SendBirdUserViewModel](docs/SendBirdUserViewModel.md)
 - [org.openapitools.client.models.Service](docs/Service.md)
 - [org.openapitools.client.models.ServiceCategoriesViewModel](docs/ServiceCategoriesViewModel.md)
 - [org.openapitools.client.models.ServiceCategoryItemViewModel](docs/ServiceCategoryItemViewModel.md)
 - [org.openapitools.client.models.ServiceCategoryViewModel](docs/ServiceCategoryViewModel.md)
 - [org.openapitools.client.models.ServiceItemViewModel](docs/ServiceItemViewModel.md)
 - [org.openapitools.client.models.ServiceSearchViewModel](docs/ServiceSearchViewModel.md)
 - [org.openapitools.client.models.ServiceViewModel](docs/ServiceViewModel.md)
 - [org.openapitools.client.models.ServicesViewModel](docs/ServicesViewModel.md)
 - [org.openapitools.client.models.SpecialtiesViewModel](docs/SpecialtiesViewModel.md)
 - [org.openapitools.client.models.Specialty](docs/Specialty.md)
 - [org.openapitools.client.models.SpecialtyItemViewModel](docs/SpecialtyItemViewModel.md)
 - [org.openapitools.client.models.SpecialtySearchResultViewModel](docs/SpecialtySearchResultViewModel.md)
 - [org.openapitools.client.models.SpecialtySearchViewModel](docs/SpecialtySearchViewModel.md)
 - [org.openapitools.client.models.SpecialtyType](docs/SpecialtyType.md)
 - [org.openapitools.client.models.SpecialtyTypeCategoriesViewModel](docs/SpecialtyTypeCategoriesViewModel.md)
 - [org.openapitools.client.models.SpecialtyTypeCategoryItemViewModel](docs/SpecialtyTypeCategoryItemViewModel.md)
 - [org.openapitools.client.models.SpecialtyTypeCategoryViewModel](docs/SpecialtyTypeCategoryViewModel.md)
 - [org.openapitools.client.models.SpecialtyTypeItemViewModel](docs/SpecialtyTypeItemViewModel.md)
 - [org.openapitools.client.models.SpecialtyTypeSearchResultViewModel](docs/SpecialtyTypeSearchResultViewModel.md)
 - [org.openapitools.client.models.SpecialtyTypeSearchViewModel](docs/SpecialtyTypeSearchViewModel.md)
 - [org.openapitools.client.models.SpecialtyTypeViewModel](docs/SpecialtyTypeViewModel.md)
 - [org.openapitools.client.models.SpecialtyTypesViewModel](docs/SpecialtyTypesViewModel.md)
 - [org.openapitools.client.models.SpecialtyViewModel](docs/SpecialtyViewModel.md)
 - [org.openapitools.client.models.Tag](docs/Tag.md)
 - [org.openapitools.client.models.UpdateArticleCommand](docs/UpdateArticleCommand.md)
 - [org.openapitools.client.models.UpdateBookingCommand](docs/UpdateBookingCommand.md)
 - [org.openapitools.client.models.UpdateCHAdminCommand](docs/UpdateCHAdminCommand.md)
 - [org.openapitools.client.models.UpdateCHManagerCommand](docs/UpdateCHManagerCommand.md)
 - [org.openapitools.client.models.UpdateConsultationCommand](docs/UpdateConsultationCommand.md)
 - [org.openapitools.client.models.UpdateCountryCommand](docs/UpdateCountryCommand.md)
 - [org.openapitools.client.models.UpdateDealCommand](docs/UpdateDealCommand.md)
 - [org.openapitools.client.models.UpdateDealPackageCommand](docs/UpdateDealPackageCommand.md)
 - [org.openapitools.client.models.UpdateDepartmentCommand](docs/UpdateDepartmentCommand.md)
 - [org.openapitools.client.models.UpdateDeviceCommand](docs/UpdateDeviceCommand.md)
 - [org.openapitools.client.models.UpdateDoctorCertificateCommand](docs/UpdateDoctorCertificateCommand.md)
 - [org.openapitools.client.models.UpdateDoctorCommand](docs/UpdateDoctorCommand.md)
 - [org.openapitools.client.models.UpdateDoctorReviewCommand](docs/UpdateDoctorReviewCommand.md)
 - [org.openapitools.client.models.UpdateEquipmentCommand](docs/UpdateEquipmentCommand.md)
 - [org.openapitools.client.models.UpdateHospitalCommand](docs/UpdateHospitalCommand.md)
 - [org.openapitools.client.models.UpdateHospitalReviewCommand](docs/UpdateHospitalReviewCommand.md)
 - [org.openapitools.client.models.UpdateHospitalSpecialtySequenceCommand](docs/UpdateHospitalSpecialtySequenceCommand.md)
 - [org.openapitools.client.models.UpdateManagerCommand](docs/UpdateManagerCommand.md)
 - [org.openapitools.client.models.UpdatePartnerCommand](docs/UpdatePartnerCommand.md)
 - [org.openapitools.client.models.UpdatePatientCommand](docs/UpdatePatientCommand.md)
 - [org.openapitools.client.models.UpdateQuestionCommand](docs/UpdateQuestionCommand.md)
 - [org.openapitools.client.models.UpdateQuestionCommentCommand](docs/UpdateQuestionCommentCommand.md)
 - [org.openapitools.client.models.UpdateSendBirdUserCommand](docs/UpdateSendBirdUserCommand.md)
 - [org.openapitools.client.models.UpdateServiceCategoryCommand](docs/UpdateServiceCategoryCommand.md)
 - [org.openapitools.client.models.UpdateServiceCommand](docs/UpdateServiceCommand.md)
 - [org.openapitools.client.models.UpdateServiceSequenceCommand](docs/UpdateServiceSequenceCommand.md)
 - [org.openapitools.client.models.UpdateSpecialtyCommand](docs/UpdateSpecialtyCommand.md)
 - [org.openapitools.client.models.UpdateSpecialtyTypeCategoryCommand](docs/UpdateSpecialtyTypeCategoryCommand.md)
 - [org.openapitools.client.models.UpdateSpecialtyTypeCommand](docs/UpdateSpecialtyTypeCommand.md)
 - [org.openapitools.client.models.UpdateYoutubeCommand](docs/UpdateYoutubeCommand.md)
 - [org.openapitools.client.models.User](docs/User.md)
 - [org.openapitools.client.models.UserItemViewModel](docs/UserItemViewModel.md)
 - [org.openapitools.client.models.UserLanguage](docs/UserLanguage.md)
 - [org.openapitools.client.models.UserLanguageViewModel](docs/UserLanguageViewModel.md)
 - [org.openapitools.client.models.UserLocation](docs/UserLocation.md)
 - [org.openapitools.client.models.UserLocationType](docs/UserLocationType.md)
 - [org.openapitools.client.models.UserLocationViewModel](docs/UserLocationViewModel.md)
 - [org.openapitools.client.models.UserViewModel](docs/UserViewModel.md)
 - [org.openapitools.client.models.VendorType](docs/VendorType.md)
 - [org.openapitools.client.models.Youtube](docs/Youtube.md)
 - [org.openapitools.client.models.YoutubeItemViewModel](docs/YoutubeItemViewModel.md)
 - [org.openapitools.client.models.YoutubeTag](docs/YoutubeTag.md)
 - [org.openapitools.client.models.YoutubeTagItemViewModel](docs/YoutubeTagItemViewModel.md)
 - [org.openapitools.client.models.YoutubeViewModel](docs/YoutubeViewModel.md)
 - [org.openapitools.client.models.YoutubesViewModel](docs/YoutubesViewModel.md)


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

