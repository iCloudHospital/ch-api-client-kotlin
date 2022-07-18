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
*AboutUsApi* | [**apiV2AboutusGet**](docs/AboutUsApi.md#apiv2aboutusget) | **GET** api/v2/aboutus | Get all AboutUsList.
*AboutUsApi* | [**apiV2AboutusHospitalIdGet**](docs/AboutUsApi.md#apiv2aboutushospitalidget) | **GET** api/v2/aboutus/{hospitalId} | Get AboutUs.
*AboutUsApi* | [**apiV2AboutusSlugGet**](docs/AboutUsApi.md#apiv2aboutusslugget) | **GET** api/v2/aboutus/{slug} | 
*AccreditationsApi* | [**apiV2AccreditationsAccreditationIdGet**](docs/AccreditationsApi.md#apiv2accreditationsaccreditationidget) | **GET** api/v2/accreditations/{accreditationId} | Get Accreditation.
*AccreditationsApi* | [**apiV2AccreditationsGet**](docs/AccreditationsApi.md#apiv2accreditationsget) | **GET** api/v2/accreditations | Get all Accreditations.
*ArticlesApi* | [**apiV2ArticlesArticleIdContributorsContributorIdGet**](docs/ArticlesApi.md#apiv2articlesarticleidcontributorscontributoridget) | **GET** api/v2/articles/{articleId}/contributors/{contributorId} | Get ArticleContributor.
*ArticlesApi* | [**apiV2ArticlesArticleIdContributorsGet**](docs/ArticlesApi.md#apiv2articlesarticleidcontributorsget) | **GET** api/v2/articles/{articleId}/contributors | GetAll ArticleContributors.
*ArticlesApi* | [**apiV2ArticlesArticleIdGet**](docs/ArticlesApi.md#apiv2articlesarticleidget) | **GET** api/v2/articles/{articleId} | Get Article.
*ArticlesApi* | [**apiV2ArticlesArticleIdMediasGet**](docs/ArticlesApi.md#apiv2articlesarticleidmediasget) | **GET** api/v2/articles/{articleId}/medias | Get all ArticleMedias.
*ArticlesApi* | [**apiV2ArticlesArticleIdMediasMediaIdGet**](docs/ArticlesApi.md#apiv2articlesarticleidmediasmediaidget) | **GET** api/v2/articles/{articleId}/medias/{mediaId} | Get ArticleMedia.
*ArticlesApi* | [**apiV2ArticlesArticleIdSourcesGet**](docs/ArticlesApi.md#apiv2articlesarticleidsourcesget) | **GET** api/v2/articles/{articleId}/sources | Get all ArticleSource.
*ArticlesApi* | [**apiV2ArticlesArticleIdSourcesSourceIdGet**](docs/ArticlesApi.md#apiv2articlesarticleidsourcessourceidget) | **GET** api/v2/articles/{articleId}/sources/{sourceId} | Get ArticleSource.
*ArticlesApi* | [**apiV2ArticlesArticleIdTagsGet**](docs/ArticlesApi.md#apiv2articlesarticleidtagsget) | **GET** api/v2/articles/{articleId}/tags | GetAll ArticleTags.
*ArticlesApi* | [**apiV2ArticlesArticleIdTagsTagIdGet**](docs/ArticlesApi.md#apiv2articlesarticleidtagstagidget) | **GET** api/v2/articles/{articleId}/tags/{tagId} | Get ArticleTag.
*ArticlesApi* | [**apiV2ArticlesGet**](docs/ArticlesApi.md#apiv2articlesget) | **GET** api/v2/articles | Get all Articles.
*ArticlesApi* | [**apiV2ArticlesSlugGet**](docs/ArticlesApi.md#apiv2articlesslugget) | **GET** api/v2/articles/{slug} | 
*BookingsApi* | [**apiV2BookingsBookingIdGet**](docs/BookingsApi.md#apiv2bookingsbookingidget) | **GET** api/v2/bookings/{bookingId} | Get booking.
*BookingsApi* | [**apiV2BookingsBookingIdPayPost**](docs/BookingsApi.md#apiv2bookingsbookingidpaypost) | **POST** api/v2/bookings/{bookingId}/pay | Pay booking.
*BookingsApi* | [**apiV2BookingsBookingIdPut**](docs/BookingsApi.md#apiv2bookingsbookingidput) | **PUT** api/v2/bookings/{bookingId} | Update booking.
*BookingsApi* | [**apiV2BookingsGet**](docs/BookingsApi.md#apiv2bookingsget) | **GET** api/v2/bookings | Get all bookings.
*BookingsApi* | [**apiV2BookingsRequestIdPost**](docs/BookingsApi.md#apiv2bookingsrequestidpost) | **POST** api/v2/bookings/{requestId} | Create booking.
*ChatUsersApi* | [**apiV2ChatusersCurrentGet**](docs/ChatUsersApi.md#apiv2chatuserscurrentget) | **GET** api/v2/chatusers/current | 
*ChatUsersApi* | [**apiV2ChatusersGet**](docs/ChatUsersApi.md#apiv2chatusersget) | **GET** api/v2/chatusers | Get all chatUsers.
*ChatUsersApi* | [**apiV2ChatusersPost**](docs/ChatUsersApi.md#apiv2chatuserspost) | **POST** api/v2/chatusers | Create a chatUser.
*ChatUsersApi* | [**apiV2ChatusersUserIdDelete**](docs/ChatUsersApi.md#apiv2chatusersuseriddelete) | **DELETE** api/v2/chatusers/{userId} | Delete chatUser.
*ChatUsersApi* | [**apiV2ChatusersUserIdGet**](docs/ChatUsersApi.md#apiv2chatusersuseridget) | **GET** api/v2/chatusers/{userId} | Get chatUser.
*ChatUsersApi* | [**apiV2ChatusersUserIdPut**](docs/ChatUsersApi.md#apiv2chatusersuseridput) | **PUT** api/v2/chatusers/{userId} | Update chatUser.
*CommunicationsApi* | [**apiV2CommunicationsDelete**](docs/CommunicationsApi.md#apiv2communicationsdelete) | **DELETE** api/v2/communications | Delete CommunicationUser.
*CommunicationsApi* | [**apiV2CommunicationsGet**](docs/CommunicationsApi.md#apiv2communicationsget) | **GET** api/v2/communications | Get CommunicationUser.
*CommunicationsApi* | [**apiV2CommunicationsPut**](docs/CommunicationsApi.md#apiv2communicationsput) | **PUT** api/v2/communications | Revoke CommunicationUser.
*ConsultationsApi* | [**apiV2ConsultationsConsultationIdGet**](docs/ConsultationsApi.md#apiv2consultationsconsultationidget) | **GET** api/v2/consultations/{consultationId} | Get consultation.
*ConsultationsApi* | [**apiV2ConsultationsConsultationIdPayPost**](docs/ConsultationsApi.md#apiv2consultationsconsultationidpaypost) | **POST** api/v2/consultations/{consultationId}/pay | Pay consultation.
*ConsultationsApi* | [**apiV2ConsultationsConsultationIdPut**](docs/ConsultationsApi.md#apiv2consultationsconsultationidput) | **PUT** api/v2/consultations/{consultationId} | Update consultation.
*ConsultationsApi* | [**apiV2ConsultationsGet**](docs/ConsultationsApi.md#apiv2consultationsget) | **GET** api/v2/consultations | Get all consultations.
*ConsultationsApi* | [**apiV2ConsultationsRequestIdPost**](docs/ConsultationsApi.md#apiv2consultationsrequestidpost) | **POST** api/v2/consultations/{requestId} | Create consultation.
*ContributorsApi* | [**apiV2ContributorsContributorIdGet**](docs/ContributorsApi.md#apiv2contributorscontributoridget) | **GET** api/v2/contributors/{contributorId} | Get Contributor.
*ContributorsApi* | [**apiV2ContributorsContributorIdHandlesGet**](docs/ContributorsApi.md#apiv2contributorscontributoridhandlesget) | **GET** api/v2/contributors/{contributorId}/handles | Get all ContributorHandles.
*ContributorsApi* | [**apiV2ContributorsContributorIdHandlesHandleIdGet**](docs/ContributorsApi.md#apiv2contributorscontributoridhandleshandleidget) | **GET** api/v2/contributors/{contributorId}/handles/{handleId} | Get ContributorHandle.
*ContributorsApi* | [**apiV2ContributorsGet**](docs/ContributorsApi.md#apiv2contributorsget) | **GET** api/v2/contributors | Get all Contributors.
*ContributorsApi* | [**apiV2ContributorsSlugGet**](docs/ContributorsApi.md#apiv2contributorsslugget) | **GET** api/v2/contributors/{slug} | Get Contributor by slug.
*CountriesApi* | [**apiV2CountriesCountryIdGet**](docs/CountriesApi.md#apiv2countriescountryidget) | **GET** api/v2/countries/{countryId} | 
*CountriesApi* | [**apiV2CountriesCountryIdMediasGet**](docs/CountriesApi.md#apiv2countriescountryidmediasget) | **GET** api/v2/countries/{countryId}/medias | Get all CountryMedias.
*CountriesApi* | [**apiV2CountriesCountryIdMediasMediaIdGet**](docs/CountriesApi.md#apiv2countriescountryidmediasmediaidget) | **GET** api/v2/countries/{countryId}/medias/{mediaId} | Get CountryMedia.
*CountriesApi* | [**apiV2CountriesGet**](docs/CountriesApi.md#apiv2countriesget) | **GET** api/v2/countries | Get all countries.
*CountriesApi* | [**apiV2CountriesSlugGet**](docs/CountriesApi.md#apiv2countriesslugget) | **GET** api/v2/countries/{slug} | 
*DealsApi* | [**apiV2DealsDealIdGet**](docs/DealsApi.md#apiv2dealsdealidget) | **GET** api/v2/deals/{dealId} | Get deal.
*DealsApi* | [**apiV2DealsDealIdPackagesGet**](docs/DealsApi.md#apiv2dealsdealidpackagesget) | **GET** api/v2/deals/{dealId}/packages | Get all DealPackage.
*DealsApi* | [**apiV2DealsDealIdPackagesPackageIdGet**](docs/DealsApi.md#apiv2dealsdealidpackagespackageidget) | **GET** api/v2/deals/{dealId}/packages/{packageId} | Get DealPackage.
*DealsApi* | [**apiV2DealsDealIdServicesGet**](docs/DealsApi.md#apiv2dealsdealidservicesget) | **GET** api/v2/deals/{dealId}/services | Get all DealService.
*DealsApi* | [**apiV2DealsDealIdServicesServiceIdGet**](docs/DealsApi.md#apiv2dealsdealidservicesserviceidget) | **GET** api/v2/deals/{dealId}/services/{serviceId} | Get DealService.
*DealsApi* | [**apiV2DealsGet**](docs/DealsApi.md#apiv2dealsget) | **GET** api/v2/deals | Get all deals.
*DealsApi* | [**apiV2DealsSimpleGet**](docs/DealsApi.md#apiv2dealssimpleget) | **GET** api/v2/deals/simple | Get all deals.
*DealsApi* | [**apiV2DealsSlugGet**](docs/DealsApi.md#apiv2dealsslugget) | **GET** api/v2/deals/{slug} | Get deal by slug.
*DoctorAffiliationsApi* | [**apiV2DoctoraffiliationsGet**](docs/DoctorAffiliationsApi.md#apiv2doctoraffiliationsget) | **GET** api/v2/doctoraffiliations | Get all doctor affiliations.
*DoctorAffiliationsApi* | [**apiV2DoctoraffiliationsIdGet**](docs/DoctorAffiliationsApi.md#apiv2doctoraffiliationsidget) | **GET** api/v2/doctoraffiliations/{id} | Get doctor affiliation.
*DoctorAffiliationsApi* | [**apiV2DoctoraffiliationsSlugGet**](docs/DoctorAffiliationsApi.md#apiv2doctoraffiliationsslugget) | **GET** api/v2/doctoraffiliations/{slug} | 
*DoctorsApi* | [**apiV2DoctorsDoctorIdCertificatesCertificateIdGet**](docs/DoctorsApi.md#apiv2doctorsdoctoridcertificatescertificateidget) | **GET** api/v2/doctors/{doctorId}/certificates/{certificateId} | Get DoctorCertificate.
*DoctorsApi* | [**apiV2DoctorsDoctorIdCertificatesGet**](docs/DoctorsApi.md#apiv2doctorsdoctoridcertificatesget) | **GET** api/v2/doctors/{doctorId}/certificates | Get All DoctorCertificate.
*DoctorsApi* | [**apiV2DoctorsDoctorIdEducationsEducationIdGet**](docs/DoctorsApi.md#apiv2doctorsdoctorideducationseducationidget) | **GET** api/v2/doctors/{doctorId}/educations/{educationId} | Get DoctorEducation.
*DoctorsApi* | [**apiV2DoctorsDoctorIdEducationsGet**](docs/DoctorsApi.md#apiv2doctorsdoctorideducationsget) | **GET** api/v2/doctors/{doctorId}/educations | Get all DoctorEducations.
*DoctorsApi* | [**apiV2DoctorsDoctorIdGet**](docs/DoctorsApi.md#apiv2doctorsdoctoridget) | **GET** api/v2/doctors/{doctorId} | 
*DoctorsApi* | [**apiV2DoctorsDoctorIdLanguagesGet**](docs/DoctorsApi.md#apiv2doctorsdoctoridlanguagesget) | **GET** api/v2/doctors/{doctorId}/languages | Get all DoctorLanguages.
*DoctorsApi* | [**apiV2DoctorsDoctorIdLanguagesLanguageIdGet**](docs/DoctorsApi.md#apiv2doctorsdoctoridlanguageslanguageidget) | **GET** api/v2/doctors/{doctorId}/languages/{languageId} | Get DoctorLanguage.
*DoctorsApi* | [**apiV2DoctorsDoctorIdMediasGet**](docs/DoctorsApi.md#apiv2doctorsdoctoridmediasget) | **GET** api/v2/doctors/{doctorId}/medias | Get all DoctorMedias.
*DoctorsApi* | [**apiV2DoctorsDoctorIdMediasMediaIdGet**](docs/DoctorsApi.md#apiv2doctorsdoctoridmediasmediaidget) | **GET** api/v2/doctors/{doctorId}/medias/{mediaId} | Get DoctorMedia.
*DoctorsApi* | [**apiV2DoctorsDoctorIdPortfoliosGet**](docs/DoctorsApi.md#apiv2doctorsdoctoridportfoliosget) | **GET** api/v2/doctors/{doctorId}/portfolios | Get All DoctorPortfolios
*DoctorsApi* | [**apiV2DoctorsDoctorIdPortfoliosPortfolioIdGet**](docs/DoctorsApi.md#apiv2doctorsdoctoridportfoliosportfolioidget) | **GET** api/v2/doctors/{doctorId}/portfolios/{portfolioId} | Get DoctorPortfolio.
*DoctorsApi* | [**apiV2DoctorsDoctorIdSpecialtiesGet**](docs/DoctorsApi.md#apiv2doctorsdoctoridspecialtiesget) | **GET** api/v2/doctors/{doctorId}/specialties | Get All DoctorSpecialties.
*DoctorsApi* | [**apiV2DoctorsDoctorIdSpecialtiesSpecialtyIdGet**](docs/DoctorsApi.md#apiv2doctorsdoctoridspecialtiesspecialtyidget) | **GET** api/v2/doctors/{doctorId}/specialties/{specialtyId} | Get DoctorSpecialty
*DoctorsApi* | [**apiV2DoctorsGet**](docs/DoctorsApi.md#apiv2doctorsget) | **GET** api/v2/doctors | Get all Doctors.
*DoctorsApi* | [**apiV2DoctorsSimpleGet**](docs/DoctorsApi.md#apiv2doctorssimpleget) | **GET** api/v2/doctors/simple | Get all Doctors.
*FaqCategoriesApi* | [**apiV2FaqcategoriesFaqCategoryIdGet**](docs/FaqCategoriesApi.md#apiv2faqcategoriesfaqcategoryidget) | **GET** api/v2/faqcategories/{faqCategoryId} | Get FaqCategory.
*FaqCategoriesApi* | [**apiV2FaqcategoriesGet**](docs/FaqCategoriesApi.md#apiv2faqcategoriesget) | **GET** api/v2/faqcategories | Get all FaqCategories.
*FaqCategoriesApi* | [**apiV2FaqcategoriesSlugGet**](docs/FaqCategoriesApi.md#apiv2faqcategoriesslugget) | **GET** api/v2/faqcategories/{slug} | Get FaqCategory by slug.
*FaqsApi* | [**apiV2FaqsFaqIdGet**](docs/FaqsApi.md#apiv2faqsfaqidget) | **GET** api/v2/faqs/{faqId} | Get faq.
*FaqsApi* | [**apiV2FaqsFaqIdMediasGet**](docs/FaqsApi.md#apiv2faqsfaqidmediasget) | **GET** api/v2/faqs/{faqId}/medias | Get all FaqMedias.
*FaqsApi* | [**apiV2FaqsFaqIdMediasMediaIdGet**](docs/FaqsApi.md#apiv2faqsfaqidmediasmediaidget) | **GET** api/v2/faqs/{faqId}/medias/{mediaId} | Get FaqMedia.
*FaqsApi* | [**apiV2FaqsFaqIdTagsGet**](docs/FaqsApi.md#apiv2faqsfaqidtagsget) | **GET** api/v2/faqs/{faqId}/tags | GetAll FaqTags.
*FaqsApi* | [**apiV2FaqsFaqIdTagsTagIdGet**](docs/FaqsApi.md#apiv2faqsfaqidtagstagidget) | **GET** api/v2/faqs/{faqId}/tags/{tagId} | Get FaqTag.
*FaqsApi* | [**apiV2FaqsGet**](docs/FaqsApi.md#apiv2faqsget) | **GET** api/v2/faqs | Get all Faqs.
*FaqsApi* | [**apiV2FaqsSlugGet**](docs/FaqsApi.md#apiv2faqsslugget) | **GET** api/v2/faqs/{slug} | Get faq by slug.
*GroupChannelsApi* | [**apiV2GroupchannelsChannelUrlInvitePost**](docs/GroupChannelsApi.md#apiv2groupchannelschannelurlinvitepost) | **POST** api/v2/groupchannels/{channelUrl}/invite | 
*GroupChannelsApi* | [**apiV2GroupchannelsDealDealIdGet**](docs/GroupChannelsApi.md#apiv2groupchannelsdealdealidget) | **GET** api/v2/groupchannels/deal/{dealId} | 
*GroupChannelsApi* | [**apiV2GroupchannelsDoctorDoctorIdGet**](docs/GroupChannelsApi.md#apiv2groupchannelsdoctordoctoridget) | **GET** api/v2/groupchannels/doctor/{doctorId} | 
*GroupChannelsApi* | [**apiV2GroupchannelsHospitalHospitalIdGet**](docs/GroupChannelsApi.md#apiv2groupchannelshospitalhospitalidget) | **GET** api/v2/groupchannels/hospital/{hospitalId} | 
*HospitalsApi* | [**apiV2HospitalsGet**](docs/HospitalsApi.md#apiv2hospitalsget) | **GET** api/v2/hospitals | Get all Hospitals.
*HospitalsApi* | [**apiV2HospitalsHospitalIdAccreditationsAccreditationIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidaccreditationsaccreditationidget) | **GET** api/v2/hospitals/{hospitalId}/accreditations/{accreditationId} | Get HospitalAccreditation.
*HospitalsApi* | [**apiV2HospitalsHospitalIdAccreditationsGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidaccreditationsget) | **GET** api/v2/hospitals/{hospitalId}/accreditations | Get all HospitalAccreditations.
*HospitalsApi* | [**apiV2HospitalsHospitalIdEquipmentsEquipmentIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidequipmentsequipmentidget) | **GET** api/v2/hospitals/{hospitalId}/equipments/{equipmentId} | Get HospitalEquipment.
*HospitalsApi* | [**apiV2HospitalsHospitalIdEquipmentsEquipmentIdMediasGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidequipmentsequipmentidmediasget) | **GET** api/v2/hospitals/{hospitalId}/equipments/{equipmentId}/medias | Get all EquipmentMedia.
*HospitalsApi* | [**apiV2HospitalsHospitalIdEquipmentsEquipmentIdMediasMediaIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidequipmentsequipmentidmediasmediaidget) | **GET** api/v2/hospitals/{hospitalId}/equipments/{equipmentId}/medias/{mediaId} | Get EquipmentMedia.
*HospitalsApi* | [**apiV2HospitalsHospitalIdEquipmentsGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidequipmentsget) | **GET** api/v2/hospitals/{hospitalId}/equipments | Get all HospitalEquipments.
*HospitalsApi* | [**apiV2HospitalsHospitalIdEvaluationsEvaluationIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidevaluationsevaluationidget) | **GET** api/v2/hospitals/{hospitalId}/evaluations/{evaluationId} | Get HospitalEvaluation.
*HospitalsApi* | [**apiV2HospitalsHospitalIdEvaluationsGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidevaluationsget) | **GET** api/v2/hospitals/{hospitalId}/evaluations | Get all HospitalEvaluations.
*HospitalsApi* | [**apiV2HospitalsHospitalIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidget) | **GET** api/v2/hospitals/{hospitalId} | 
*HospitalsApi* | [**apiV2HospitalsHospitalIdHandlesGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidhandlesget) | **GET** api/v2/hospitals/{hospitalId}/handles | Get all HospitalHandles.
*HospitalsApi* | [**apiV2HospitalsHospitalIdHandlesHandleIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidhandleshandleidget) | **GET** api/v2/hospitals/{hospitalId}/handles/{handleId} | Get HospitalHandle.
*HospitalsApi* | [**apiV2HospitalsHospitalIdMediasGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidmediasget) | **GET** api/v2/hospitals/{hospitalId}/medias | Get all HospitalMedias.
*HospitalsApi* | [**apiV2HospitalsHospitalIdMediasMediaIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidmediasmediaidget) | **GET** api/v2/hospitals/{hospitalId}/medias/{mediaId} | Get HospitalMedia.
*HospitalsApi* | [**apiV2HospitalsHospitalIdSpecialtiesGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidspecialtiesget) | **GET** api/v2/hospitals/{hospitalId}/specialties | Get all HospitalSpecialties.
*HospitalsApi* | [**apiV2HospitalsHospitalIdSpecialtiesHospitalSpecialtyIdMediasGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidspecialtieshospitalspecialtyidmediasget) | **GET** api/v2/hospitals/{hospitalId}/specialties/{hospitalSpecialtyId}/medias | Get all HospitalServiceMedias.
*HospitalsApi* | [**apiV2HospitalsHospitalIdSpecialtiesHospitalSpecialtyIdMediasMediaIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidspecialtieshospitalspecialtyidmediasmediaidget) | **GET** api/v2/hospitals/{hospitalId}/specialties/{hospitalSpecialtyId}/medias/{mediaId} | Get HospitalServiceMedia.
*HospitalsApi* | [**apiV2HospitalsHospitalIdSpecialtiesSimpleGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidspecialtiessimpleget) | **GET** api/v2/hospitals/{hospitalId}/specialties/simple | Get all HospitalSpecialties.
*HospitalsApi* | [**apiV2HospitalsHospitalIdSpecialtiesSlugGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidspecialtiesslugget) | **GET** api/v2/hospitals/{hospitalId}/specialties/{slug} | Get HospitalSpecialty by slug.
*HospitalsApi* | [**apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidspecialtiesspecialtyidget) | **GET** api/v2/hospitals/{hospitalId}/specialties/{specialtyId} | Get HospitalSpecialty.
*HospitalsApi* | [**apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidspecialtiesspecialtyidservicesget) | **GET** api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services | Get all HospitalServices.
*HospitalsApi* | [**apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidspecialtiesspecialtyidservicesserviceidget) | **GET** api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId} | Get HospitalService.
*HospitalsApi* | [**apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdMediasGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidspecialtiesspecialtyidservicesserviceidmediasget) | **GET** api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId}/medias | Get all HospitalServiceMedias.
*HospitalsApi* | [**apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdMediasMediaIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidspecialtiesspecialtyidservicesserviceidmediasmediaidget) | **GET** api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId}/medias/{mediaId} | Get HospitalServiceMedia.
*HospitalsApi* | [**apiV2HospitalsHospitalIdWorkingdaysGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidworkingdaysget) | **GET** api/v2/hospitals/{hospitalId}/workingdays | Get all HospitalWorkingDays.
*HospitalsApi* | [**apiV2HospitalsHospitalIdWorkingdaysWorkingDayIdGet**](docs/HospitalsApi.md#apiv2hospitalshospitalidworkingdaysworkingdayidget) | **GET** api/v2/hospitals/{hospitalId}/workingdays/{workingDayId} | Get HospitalWorkingDay.
*HospitalsApi* | [**apiV2HospitalsSimpleGet**](docs/HospitalsApi.md#apiv2hospitalssimpleget) | **GET** api/v2/hospitals/simple | Get all Hospitals.
*HospitalsApi* | [**apiV2HospitalsSlugGet**](docs/HospitalsApi.md#apiv2hospitalsslugget) | **GET** api/v2/hospitals/{slug} | 
*ImagesApi* | [**apiV2ImagesPost**](docs/ImagesApi.md#apiv2imagespost) | **POST** api/v2/images | 
*LanguagesApi* | [**apiV2LanguagesCodeGet**](docs/LanguagesApi.md#apiv2languagescodeget) | **GET** api/v2/languages/{code} | Get Language by code.
*LanguagesApi* | [**apiV2LanguagesGet**](docs/LanguagesApi.md#apiv2languagesget) | **GET** api/v2/languages | Get all Languages.
*LanguagesApi* | [**apiV2LanguagesIdGet**](docs/LanguagesApi.md#apiv2languagesidget) | **GET** api/v2/languages/{id} | Get Language.
*MembershipsApi* | [**apiV2MembershipsGet**](docs/MembershipsApi.md#apiv2membershipsget) | **GET** api/v2/memberships | Get all memberships.
*MembershipsApi* | [**apiV2MembershipsMembershipIdGet**](docs/MembershipsApi.md#apiv2membershipsmembershipidget) | **GET** api/v2/memberships/{membershipId} | Get membership.
*MembershipsApi* | [**apiV2MembershipsMembershipIdMembersGet**](docs/MembershipsApi.md#apiv2membershipsmembershipidmembersget) | **GET** api/v2/memberships/{membershipId}/members | Get all members.
*NotificationsApi* | [**apiV2NotificationsCheckPost**](docs/NotificationsApi.md#apiv2notificationscheckpost) | **POST** api/v2/notifications/check | Check notification.
*NotificationsApi* | [**apiV2NotificationsGet**](docs/NotificationsApi.md#apiv2notificationsget) | **GET** api/v2/notifications | Get all notifications.
*PatientsApi* | [**apiV2PatientsPatientIdDelete**](docs/PatientsApi.md#apiv2patientspatientiddelete) | **DELETE** api/v2/patients/{patientId} | Delete Patient.
*PatientsApi* | [**apiV2PatientsPatientIdGet**](docs/PatientsApi.md#apiv2patientspatientidget) | **GET** api/v2/patients/{patientId} | Get Patient.
*PatientsApi* | [**apiV2PatientsPatientIdPut**](docs/PatientsApi.md#apiv2patientspatientidput) | **PUT** api/v2/patients/{patientId} | Update Patient.
*PatientsApi* | [**apiV2PatientsPost**](docs/PatientsApi.md#apiv2patientspost) | **POST** api/v2/patients | Create a Patient.
*PlansApi* | [**apiV2PlansGet**](docs/PlansApi.md#apiv2plansget) | **GET** api/v2/plans | Get all plans.
*PlansApi* | [**apiV2PlansPlanIdGet**](docs/PlansApi.md#apiv2plansplanidget) | **GET** api/v2/plans/{planId} | Get plan.
*PlansApi* | [**apiV2PlansPlanIdHospitalsGet**](docs/PlansApi.md#apiv2plansplanidhospitalsget) | **GET** api/v2/plans/{planId}/hospitals | Get all plan hospital.
*PlansApi* | [**apiV2PlansPlanIdHospitalsHospitalIdGet**](docs/PlansApi.md#apiv2plansplanidhospitalshospitalidget) | **GET** api/v2/plans/{planId}/hospitals/{hospitalId} | Get plan hospital.
*ProfilesApi* | [**apiV2ProfilesChangeemailPost**](docs/ProfilesApi.md#apiv2profileschangeemailpost) | **POST** api/v2/profiles/changeemail | Change user's email on both Identity and Api.
*ProfilesApi* | [**apiV2ProfilesConfirmemailPost**](docs/ProfilesApi.md#apiv2profilesconfirmemailpost) | **POST** api/v2/profiles/confirmemail | Configm email.
*ProfilesApi* | [**apiV2ProfilesGet**](docs/ProfilesApi.md#apiv2profilesget) | **GET** api/v2/profiles | Get Profile.
*ProfilesApi* | [**apiV2ProfilesPut**](docs/ProfilesApi.md#apiv2profilesput) | **PUT** api/v2/profiles | Update Profile.
*ServiceReviewsApi* | [**apiV2ServicereviewsGet**](docs/ServiceReviewsApi.md#apiv2servicereviewsget) | **GET** api/v2/servicereviews | Get all ServiceReviews.
*ServiceReviewsApi* | [**apiV2ServicereviewsPost**](docs/ServiceReviewsApi.md#apiv2servicereviewspost) | **POST** api/v2/servicereviews | Create a ServiceReview.
*ServiceReviewsApi* | [**apiV2ServicereviewsServiceReviewIdDelete**](docs/ServiceReviewsApi.md#apiv2servicereviewsservicereviewiddelete) | **DELETE** api/v2/servicereviews/{serviceReviewId} | Delete ServiceReview.
*ServiceReviewsApi* | [**apiV2ServicereviewsServiceReviewIdGet**](docs/ServiceReviewsApi.md#apiv2servicereviewsservicereviewidget) | **GET** api/v2/servicereviews/{serviceReviewId} | 
*ServiceReviewsApi* | [**apiV2ServicereviewsServiceReviewIdMediasGet**](docs/ServiceReviewsApi.md#apiv2servicereviewsservicereviewidmediasget) | **GET** api/v2/servicereviews/{serviceReviewId}/medias | Get all ServiceReviewMedias.
*ServiceReviewsApi* | [**apiV2ServicereviewsServiceReviewIdMediasMediaIdDelete**](docs/ServiceReviewsApi.md#apiv2servicereviewsservicereviewidmediasmediaiddelete) | **DELETE** api/v2/servicereviews/{serviceReviewId}/medias/{mediaId} | Delete ServiceReviewMedia
*ServiceReviewsApi* | [**apiV2ServicereviewsServiceReviewIdMediasMediaIdGet**](docs/ServiceReviewsApi.md#apiv2servicereviewsservicereviewidmediasmediaidget) | **GET** api/v2/servicereviews/{serviceReviewId}/medias/{mediaId} | Get ServiceReviewMedia.
*ServiceReviewsApi* | [**apiV2ServicereviewsServiceReviewIdMediasMediaIdPut**](docs/ServiceReviewsApi.md#apiv2servicereviewsservicereviewidmediasmediaidput) | **PUT** api/v2/servicereviews/{serviceReviewId}/medias/{mediaId} | Update ServiceReviewMedia.
*ServiceReviewsApi* | [**apiV2ServicereviewsServiceReviewIdMediasPost**](docs/ServiceReviewsApi.md#apiv2servicereviewsservicereviewidmediaspost) | **POST** api/v2/servicereviews/{serviceReviewId}/medias | Create ServiceReviewMedia.
*ServiceReviewsApi* | [**apiV2ServicereviewsServiceReviewIdPut**](docs/ServiceReviewsApi.md#apiv2servicereviewsservicereviewidput) | **PUT** api/v2/servicereviews/{serviceReviewId} | Update ServiceReview.
*ServicesApi* | [**apiV2ServicesGet**](docs/ServicesApi.md#apiv2servicesget) | **GET** api/v2/services | Get all HospitalServices.
*ServicesApi* | [**apiV2ServicesServiceIdGet**](docs/ServicesApi.md#apiv2servicesserviceidget) | **GET** api/v2/services/{serviceId} | 
*ServicesApi* | [**apiV2ServicesSlugGet**](docs/ServicesApi.md#apiv2servicesslugget) | **GET** api/v2/services/{slug} | 
*ServicesCategoriesApi* | [**apiV2ServicescategoriesGet**](docs/ServicesCategoriesApi.md#apiv2servicescategoriesget) | **GET** api/v2/servicescategories | Get all ServiceCategories.
*ServicesCategoriesApi* | [**apiV2ServicescategoriesServiceCategoryIdGet**](docs/ServicesCategoriesApi.md#apiv2servicescategoriesservicecategoryidget) | **GET** api/v2/servicescategories/{serviceCategoryId} | Get ServiceCategory.
*SpecialtiesApi* | [**apiV2SpecialtiesGet**](docs/SpecialtiesApi.md#apiv2specialtiesget) | **GET** api/v2/specialties | Get all Specialties.
*SpecialtiesApi* | [**apiV2SpecialtiesSimpleGet**](docs/SpecialtiesApi.md#apiv2specialtiessimpleget) | **GET** api/v2/specialties/simple | Get all Specialties Simple.
*SpecialtiesApi* | [**apiV2SpecialtiesSlugGet**](docs/SpecialtiesApi.md#apiv2specialtiesslugget) | **GET** api/v2/specialties/{slug} | 
*SpecialtiesApi* | [**apiV2SpecialtiesSpecialtyIdGet**](docs/SpecialtiesApi.md#apiv2specialtiesspecialtyidget) | **GET** api/v2/specialties/{specialtyId} | 
*SpecialtiesApi* | [**apiV2SpecialtiesSpecialtyIdMediasGet**](docs/SpecialtiesApi.md#apiv2specialtiesspecialtyidmediasget) | **GET** api/v2/specialties/{specialtyId}/medias | Get all SpecialtyMedias.
*SpecialtiesApi* | [**apiV2SpecialtiesSpecialtyIdMediasMediaIdGet**](docs/SpecialtiesApi.md#apiv2specialtiesspecialtyidmediasmediaidget) | **GET** api/v2/specialties/{specialtyId}/medias/{mediaId} | Get SpecialtyMedia.
*SpecialtyTypesApi* | [**apiV2SpecialtytypesGet**](docs/SpecialtyTypesApi.md#apiv2specialtytypesget) | **GET** api/v2/specialtytypes | Get all Departments.
*SpecialtyTypesApi* | [**apiV2SpecialtytypesSimpleGet**](docs/SpecialtyTypesApi.md#apiv2specialtytypessimpleget) | **GET** api/v2/specialtytypes/simple | Get all Hospitals.
*SpecialtyTypesApi* | [**apiV2SpecialtytypesSlugGet**](docs/SpecialtyTypesApi.md#apiv2specialtytypesslugget) | **GET** api/v2/specialtytypes/{slug} | 
*SpecialtyTypesApi* | [**apiV2SpecialtytypesSpecialtyTypeIdGet**](docs/SpecialtyTypesApi.md#apiv2specialtytypesspecialtytypeidget) | **GET** api/v2/specialtytypes/{specialtyTypeId} | 
*SpecialtyTypesApi* | [**apiV2SpecialtytypesSpecialtyTypeIdMediasGet**](docs/SpecialtyTypesApi.md#apiv2specialtytypesspecialtytypeidmediasget) | **GET** api/v2/specialtytypes/{specialtyTypeId}/medias | Get all SpecialtyTypeMedias.
*SpecialtyTypesApi* | [**apiV2SpecialtytypesSpecialtyTypeIdMediasMediaIdGet**](docs/SpecialtyTypesApi.md#apiv2specialtytypesspecialtytypeidmediasmediaidget) | **GET** api/v2/specialtytypes/{specialtyTypeId}/medias/{mediaId} | Get SpecialtyTypeMedia.
*TagsApi* | [**apiV2TagsGet**](docs/TagsApi.md#apiv2tagsget) | **GET** api/v2/tags | Get all Tags.
*TagsApi* | [**apiV2TagsTagIdGet**](docs/TagsApi.md#apiv2tagstagidget) | **GET** api/v2/tags/{tagId} | Get Tag.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [CloudHospitalApi.models.AboutUsPageItemModel](docs/AboutUsPageItemModel.md)
 - [CloudHospitalApi.models.AboutUsPageModel](docs/AboutUsPageModel.md)
 - [CloudHospitalApi.models.AboutUsPagesModel](docs/AboutUsPagesModel.md)
 - [CloudHospitalApi.models.AccreditationItemModel](docs/AccreditationItemModel.md)
 - [CloudHospitalApi.models.AccreditationModel](docs/AccreditationModel.md)
 - [CloudHospitalApi.models.AccreditationsModel](docs/AccreditationsModel.md)
 - [CloudHospitalApi.models.AdminMessageModel](docs/AdminMessageModel.md)
 - [CloudHospitalApi.models.ArticleContributorItemModel](docs/ArticleContributorItemModel.md)
 - [CloudHospitalApi.models.ArticleContributorModel](docs/ArticleContributorModel.md)
 - [CloudHospitalApi.models.ArticleContributorsModel](docs/ArticleContributorsModel.md)
 - [CloudHospitalApi.models.ArticleItemModel](docs/ArticleItemModel.md)
 - [CloudHospitalApi.models.ArticleModel](docs/ArticleModel.md)
 - [CloudHospitalApi.models.ArticleSourcesModel](docs/ArticleSourcesModel.md)
 - [CloudHospitalApi.models.ArticleStatus](docs/ArticleStatus.md)
 - [CloudHospitalApi.models.ArticleTagItemModel](docs/ArticleTagItemModel.md)
 - [CloudHospitalApi.models.ArticleTagModel](docs/ArticleTagModel.md)
 - [CloudHospitalApi.models.ArticleTagsModel](docs/ArticleTagsModel.md)
 - [CloudHospitalApi.models.ArticlesModel](docs/ArticlesModel.md)
 - [CloudHospitalApi.models.AuditableEntity](docs/AuditableEntity.md)
 - [CloudHospitalApi.models.AwardModel](docs/AwardModel.md)
 - [CloudHospitalApi.models.BookingChangeLogModel](docs/BookingChangeLogModel.md)
 - [CloudHospitalApi.models.BookingItemModel](docs/BookingItemModel.md)
 - [CloudHospitalApi.models.BookingModel](docs/BookingModel.md)
 - [CloudHospitalApi.models.BookingStatus](docs/BookingStatus.md)
 - [CloudHospitalApi.models.BookingsModel](docs/BookingsModel.md)
 - [CloudHospitalApi.models.ChangeEmailCommand](docs/ChangeEmailCommand.md)
 - [CloudHospitalApi.models.ChatUserModel](docs/ChatUserModel.md)
 - [CloudHospitalApi.models.ChatUsersModel](docs/ChatUsersModel.md)
 - [CloudHospitalApi.models.CheckNotificationsCommand](docs/CheckNotificationsCommand.md)
 - [CloudHospitalApi.models.CommunicationUserTokenModel](docs/CommunicationUserTokenModel.md)
 - [CloudHospitalApi.models.ConfirmEmailCommand](docs/ConfirmEmailCommand.md)
 - [CloudHospitalApi.models.ConsultationChangeLogModel](docs/ConsultationChangeLogModel.md)
 - [CloudHospitalApi.models.ConsultationItemModel](docs/ConsultationItemModel.md)
 - [CloudHospitalApi.models.ConsultationModel](docs/ConsultationModel.md)
 - [CloudHospitalApi.models.ConsultationStatus](docs/ConsultationStatus.md)
 - [CloudHospitalApi.models.ConsultationType](docs/ConsultationType.md)
 - [CloudHospitalApi.models.ConsultationsModel](docs/ConsultationsModel.md)
 - [CloudHospitalApi.models.ContributionType](docs/ContributionType.md)
 - [CloudHospitalApi.models.ContributorItemModel](docs/ContributorItemModel.md)
 - [CloudHospitalApi.models.ContributorModel](docs/ContributorModel.md)
 - [CloudHospitalApi.models.ContributorSnsHandlesModel](docs/ContributorSnsHandlesModel.md)
 - [CloudHospitalApi.models.ContributorsModel](docs/ContributorsModel.md)
 - [CloudHospitalApi.models.CountriesModel](docs/CountriesModel.md)
 - [CloudHospitalApi.models.CountryItemModel](docs/CountryItemModel.md)
 - [CloudHospitalApi.models.CountryModel](docs/CountryModel.md)
 - [CloudHospitalApi.models.CreateBookingCommand](docs/CreateBookingCommand.md)
 - [CloudHospitalApi.models.CreateChatUserCommand](docs/CreateChatUserCommand.md)
 - [CloudHospitalApi.models.CreateConsultationCommand](docs/CreateConsultationCommand.md)
 - [CloudHospitalApi.models.CreateMediaCommand](docs/CreateMediaCommand.md)
 - [CloudHospitalApi.models.CreatePatientCommand](docs/CreatePatientCommand.md)
 - [CloudHospitalApi.models.CreateServiceReviewCommand](docs/CreateServiceReviewCommand.md)
 - [CloudHospitalApi.models.DealItemModel](docs/DealItemModel.md)
 - [CloudHospitalApi.models.DealItemSimpleModel](docs/DealItemSimpleModel.md)
 - [CloudHospitalApi.models.DealModel](docs/DealModel.md)
 - [CloudHospitalApi.models.DealPackageItemModel](docs/DealPackageItemModel.md)
 - [CloudHospitalApi.models.DealPackageModel](docs/DealPackageModel.md)
 - [CloudHospitalApi.models.DealPackagesModel](docs/DealPackagesModel.md)
 - [CloudHospitalApi.models.DealServiceItemModel](docs/DealServiceItemModel.md)
 - [CloudHospitalApi.models.DealServiceModel](docs/DealServiceModel.md)
 - [CloudHospitalApi.models.DealServicesModel](docs/DealServicesModel.md)
 - [CloudHospitalApi.models.DealsModel](docs/DealsModel.md)
 - [CloudHospitalApi.models.DealsSimpleModel](docs/DealsSimpleModel.md)
 - [CloudHospitalApi.models.DoctorAffiliationItemModel](docs/DoctorAffiliationItemModel.md)
 - [CloudHospitalApi.models.DoctorAffiliationModel](docs/DoctorAffiliationModel.md)
 - [CloudHospitalApi.models.DoctorAffiliationsModel](docs/DoctorAffiliationsModel.md)
 - [CloudHospitalApi.models.DoctorCertificateItemModel](docs/DoctorCertificateItemModel.md)
 - [CloudHospitalApi.models.DoctorCertificateModel](docs/DoctorCertificateModel.md)
 - [CloudHospitalApi.models.DoctorCertificatesModel](docs/DoctorCertificatesModel.md)
 - [CloudHospitalApi.models.DoctorEducationItemModel](docs/DoctorEducationItemModel.md)
 - [CloudHospitalApi.models.DoctorEducationModel](docs/DoctorEducationModel.md)
 - [CloudHospitalApi.models.DoctorEducationsModel](docs/DoctorEducationsModel.md)
 - [CloudHospitalApi.models.DoctorItemModel](docs/DoctorItemModel.md)
 - [CloudHospitalApi.models.DoctorLanguageItemModel](docs/DoctorLanguageItemModel.md)
 - [CloudHospitalApi.models.DoctorLanguageModel](docs/DoctorLanguageModel.md)
 - [CloudHospitalApi.models.DoctorLanguagesModel](docs/DoctorLanguagesModel.md)
 - [CloudHospitalApi.models.DoctorModel](docs/DoctorModel.md)
 - [CloudHospitalApi.models.DoctorPortfolioItemModel](docs/DoctorPortfolioItemModel.md)
 - [CloudHospitalApi.models.DoctorPortfolioModel](docs/DoctorPortfolioModel.md)
 - [CloudHospitalApi.models.DoctorPortfoliosModel](docs/DoctorPortfoliosModel.md)
 - [CloudHospitalApi.models.DoctorSimpleItemModel](docs/DoctorSimpleItemModel.md)
 - [CloudHospitalApi.models.DoctorSpecialtiesModel](docs/DoctorSpecialtiesModel.md)
 - [CloudHospitalApi.models.DoctorSpecialtyItemModel](docs/DoctorSpecialtyItemModel.md)
 - [CloudHospitalApi.models.DoctorSpecialtyModel](docs/DoctorSpecialtyModel.md)
 - [CloudHospitalApi.models.DoctorsModel](docs/DoctorsModel.md)
 - [CloudHospitalApi.models.DoctorsSimpleModel](docs/DoctorsSimpleModel.md)
 - [CloudHospitalApi.models.FaqCategoriesModel](docs/FaqCategoriesModel.md)
 - [CloudHospitalApi.models.FaqCategoryItemModel](docs/FaqCategoryItemModel.md)
 - [CloudHospitalApi.models.FaqCategoryModel](docs/FaqCategoryModel.md)
 - [CloudHospitalApi.models.FaqItemModel](docs/FaqItemModel.md)
 - [CloudHospitalApi.models.FaqModel](docs/FaqModel.md)
 - [CloudHospitalApi.models.FaqTagItemModel](docs/FaqTagItemModel.md)
 - [CloudHospitalApi.models.FaqTagModel](docs/FaqTagModel.md)
 - [CloudHospitalApi.models.FaqTagsModel](docs/FaqTagsModel.md)
 - [CloudHospitalApi.models.FaqsModel](docs/FaqsModel.md)
 - [CloudHospitalApi.models.Gender](docs/Gender.md)
 - [CloudHospitalApi.models.HospitalAccreditationItemModel](docs/HospitalAccreditationItemModel.md)
 - [CloudHospitalApi.models.HospitalAccreditationModel](docs/HospitalAccreditationModel.md)
 - [CloudHospitalApi.models.HospitalAccreditationsModel](docs/HospitalAccreditationsModel.md)
 - [CloudHospitalApi.models.HospitalEquipmentItemModel](docs/HospitalEquipmentItemModel.md)
 - [CloudHospitalApi.models.HospitalEquipmentModel](docs/HospitalEquipmentModel.md)
 - [CloudHospitalApi.models.HospitalEquipmentsModel](docs/HospitalEquipmentsModel.md)
 - [CloudHospitalApi.models.HospitalEvaluationItemModel](docs/HospitalEvaluationItemModel.md)
 - [CloudHospitalApi.models.HospitalEvaluationModel](docs/HospitalEvaluationModel.md)
 - [CloudHospitalApi.models.HospitalEvaluationsModel](docs/HospitalEvaluationsModel.md)
 - [CloudHospitalApi.models.HospitalItemModel](docs/HospitalItemModel.md)
 - [CloudHospitalApi.models.HospitalLanguageItemModel](docs/HospitalLanguageItemModel.md)
 - [CloudHospitalApi.models.HospitalModel](docs/HospitalModel.md)
 - [CloudHospitalApi.models.HospitalServiceItemModel](docs/HospitalServiceItemModel.md)
 - [CloudHospitalApi.models.HospitalServiceModel](docs/HospitalServiceModel.md)
 - [CloudHospitalApi.models.HospitalServicesModel](docs/HospitalServicesModel.md)
 - [CloudHospitalApi.models.HospitalSimpleItemModel](docs/HospitalSimpleItemModel.md)
 - [CloudHospitalApi.models.HospitalSnsHandlesModel](docs/HospitalSnsHandlesModel.md)
 - [CloudHospitalApi.models.HospitalSpecialtiesModel](docs/HospitalSpecialtiesModel.md)
 - [CloudHospitalApi.models.HospitalSpecialtiesSimpleModel](docs/HospitalSpecialtiesSimpleModel.md)
 - [CloudHospitalApi.models.HospitalSpecialtyItemModel](docs/HospitalSpecialtyItemModel.md)
 - [CloudHospitalApi.models.HospitalSpecialtyModel](docs/HospitalSpecialtyModel.md)
 - [CloudHospitalApi.models.HospitalSpecialtySimpleItemModel](docs/HospitalSpecialtySimpleItemModel.md)
 - [CloudHospitalApi.models.HospitalsModel](docs/HospitalsModel.md)
 - [CloudHospitalApi.models.HospitalsSimpleModel](docs/HospitalsSimpleModel.md)
 - [CloudHospitalApi.models.InviteSendBirdGroupChannelCommand](docs/InviteSendBirdGroupChannelCommand.md)
 - [CloudHospitalApi.models.LanguageItemModel](docs/LanguageItemModel.md)
 - [CloudHospitalApi.models.LanguageModel](docs/LanguageModel.md)
 - [CloudHospitalApi.models.LanguagesModel](docs/LanguagesModel.md)
 - [CloudHospitalApi.models.LocalizedUrlModel](docs/LocalizedUrlModel.md)
 - [CloudHospitalApi.models.LocationModel](docs/LocationModel.md)
 - [CloudHospitalApi.models.MarketingType](docs/MarketingType.md)
 - [CloudHospitalApi.models.MediaModel](docs/MediaModel.md)
 - [CloudHospitalApi.models.MediaType](docs/MediaType.md)
 - [CloudHospitalApi.models.MediasModel](docs/MediasModel.md)
 - [CloudHospitalApi.models.MemberModel](docs/MemberModel.md)
 - [CloudHospitalApi.models.MembersModel](docs/MembersModel.md)
 - [CloudHospitalApi.models.MembershipItemModel](docs/MembershipItemModel.md)
 - [CloudHospitalApi.models.MembershipModel](docs/MembershipModel.md)
 - [CloudHospitalApi.models.MembershipsModel](docs/MembershipsModel.md)
 - [CloudHospitalApi.models.Metadata](docs/Metadata.md)
 - [CloudHospitalApi.models.NotificationCode](docs/NotificationCode.md)
 - [CloudHospitalApi.models.NotificationModel](docs/NotificationModel.md)
 - [CloudHospitalApi.models.NotificationsModel](docs/NotificationsModel.md)
 - [CloudHospitalApi.models.PagedListMetaData](docs/PagedListMetaData.md)
 - [CloudHospitalApi.models.PatientModel](docs/PatientModel.md)
 - [CloudHospitalApi.models.PlanHospitalItemModel](docs/PlanHospitalItemModel.md)
 - [CloudHospitalApi.models.PlanHospitalModel](docs/PlanHospitalModel.md)
 - [CloudHospitalApi.models.PlanHospitalsModel](docs/PlanHospitalsModel.md)
 - [CloudHospitalApi.models.PlanItemModel](docs/PlanItemModel.md)
 - [CloudHospitalApi.models.PlanModel](docs/PlanModel.md)
 - [CloudHospitalApi.models.PlansModel](docs/PlansModel.md)
 - [CloudHospitalApi.models.ProblemDetails](docs/ProblemDetails.md)
 - [CloudHospitalApi.models.Procedure](docs/Procedure.md)
 - [CloudHospitalApi.models.RecurringInterval](docs/RecurringInterval.md)
 - [CloudHospitalApi.models.RefundPolicy](docs/RefundPolicy.md)
 - [CloudHospitalApi.models.RejectReason](docs/RejectReason.md)
 - [CloudHospitalApi.models.ReviewType](docs/ReviewType.md)
 - [CloudHospitalApi.models.SendBirdGroupChannelMember](docs/SendBirdGroupChannelMember.md)
 - [CloudHospitalApi.models.SendBirdGroupChannelModel](docs/SendBirdGroupChannelModel.md)
 - [CloudHospitalApi.models.SendBirdGroupChannelrOperator](docs/SendBirdGroupChannelrOperator.md)
 - [CloudHospitalApi.models.ServiceCategoriesModel](docs/ServiceCategoriesModel.md)
 - [CloudHospitalApi.models.ServiceCategoryItemModel](docs/ServiceCategoryItemModel.md)
 - [CloudHospitalApi.models.ServiceCategoryModel](docs/ServiceCategoryModel.md)
 - [CloudHospitalApi.models.ServiceReviewItemModel](docs/ServiceReviewItemModel.md)
 - [CloudHospitalApi.models.ServiceReviewModel](docs/ServiceReviewModel.md)
 - [CloudHospitalApi.models.ServiceReviewsModel](docs/ServiceReviewsModel.md)
 - [CloudHospitalApi.models.SnsHandle](docs/SnsHandle.md)
 - [CloudHospitalApi.models.SnsHandleModel](docs/SnsHandleModel.md)
 - [CloudHospitalApi.models.SnsType](docs/SnsType.md)
 - [CloudHospitalApi.models.SortingOrder](docs/SortingOrder.md)
 - [CloudHospitalApi.models.SourceModel](docs/SourceModel.md)
 - [CloudHospitalApi.models.SpecialtiesModel](docs/SpecialtiesModel.md)
 - [CloudHospitalApi.models.SpecialtiesSimpleModel](docs/SpecialtiesSimpleModel.md)
 - [CloudHospitalApi.models.SpecialtyItemModel](docs/SpecialtyItemModel.md)
 - [CloudHospitalApi.models.SpecialtyItemSimpleModel](docs/SpecialtyItemSimpleModel.md)
 - [CloudHospitalApi.models.SpecialtyModel](docs/SpecialtyModel.md)
 - [CloudHospitalApi.models.SpecialtyTypeItemModel](docs/SpecialtyTypeItemModel.md)
 - [CloudHospitalApi.models.SpecialtyTypeModel](docs/SpecialtyTypeModel.md)
 - [CloudHospitalApi.models.SpecialtyTypeSimpleItemModel](docs/SpecialtyTypeSimpleItemModel.md)
 - [CloudHospitalApi.models.SpecialtyTypesModel](docs/SpecialtyTypesModel.md)
 - [CloudHospitalApi.models.SpecialtyTypesSimpleModel](docs/SpecialtyTypesSimpleModel.md)
 - [CloudHospitalApi.models.SubscriptionModel](docs/SubscriptionModel.md)
 - [CloudHospitalApi.models.TagItemModel](docs/TagItemModel.md)
 - [CloudHospitalApi.models.TagModel](docs/TagModel.md)
 - [CloudHospitalApi.models.TagsModel](docs/TagsModel.md)
 - [CloudHospitalApi.models.UpdateBookingCommand](docs/UpdateBookingCommand.md)
 - [CloudHospitalApi.models.UpdateChatUserCommand](docs/UpdateChatUserCommand.md)
 - [CloudHospitalApi.models.UpdateConsultationCommand](docs/UpdateConsultationCommand.md)
 - [CloudHospitalApi.models.UpdateMediaCommand](docs/UpdateMediaCommand.md)
 - [CloudHospitalApi.models.UpdatePatientCommand](docs/UpdatePatientCommand.md)
 - [CloudHospitalApi.models.UpdateProfileCommand](docs/UpdateProfileCommand.md)
 - [CloudHospitalApi.models.UpdateServiceReviewCommand](docs/UpdateServiceReviewCommand.md)
 - [CloudHospitalApi.models.UserLanguageModel](docs/UserLanguageModel.md)
 - [CloudHospitalApi.models.UserLocationModel](docs/UserLocationModel.md)
 - [CloudHospitalApi.models.UserLocationType](docs/UserLocationType.md)
 - [CloudHospitalApi.models.UserModel](docs/UserModel.md)
 - [CloudHospitalApi.models.WorkingDay](docs/WorkingDay.md)
 - [CloudHospitalApi.models.WorkingDayItemModel](docs/WorkingDayItemModel.md)
 - [CloudHospitalApi.models.WorkingDayModel](docs/WorkingDayModel.md)
 - [CloudHospitalApi.models.WorkingDaysModel](docs/WorkingDaysModel.md)


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
  - CloudHospital_SignalR: CloudHospital_SignalR

