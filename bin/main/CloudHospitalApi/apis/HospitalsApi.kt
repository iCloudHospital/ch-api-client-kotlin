package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.HospitalAccreditationModel
import CloudHospitalApi.models.HospitalAccreditationsModel
import CloudHospitalApi.models.HospitalEquipmentModel
import CloudHospitalApi.models.HospitalEquipmentsModel
import CloudHospitalApi.models.HospitalEvaluationModel
import CloudHospitalApi.models.HospitalEvaluationsModel
import CloudHospitalApi.models.HospitalModel
import CloudHospitalApi.models.HospitalServiceModel
import CloudHospitalApi.models.HospitalServicesModel
import CloudHospitalApi.models.HospitalSnsHandlesModel
import CloudHospitalApi.models.HospitalSpecialtiesModel
import CloudHospitalApi.models.HospitalSpecialtiesSimpleModel
import CloudHospitalApi.models.HospitalSpecialtyModel
import CloudHospitalApi.models.HospitalsModel
import CloudHospitalApi.models.HospitalsSimpleModel
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.MediaType
import CloudHospitalApi.models.MediasModel
import CloudHospitalApi.models.Procedure
import CloudHospitalApi.models.SnsHandleModel
import CloudHospitalApi.models.SnsType
import CloudHospitalApi.models.WorkingDayModel
import CloudHospitalApi.models.WorkingDaysModel

interface HospitalsApi {
    /**
     * Get all Hospitals.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  (optional)
     * @param name  (optional)
     * @param countryId  (optional)
     * @param created  (optional)
     * @param marketingType  (optional)
     * @param specialtyTypeId  (optional)
     * @param specialtyId  (optional)
     * @param serviceId  (optional)
     * @param exceptHospitalId  (optional)
     * @param showHidden  (optional)
     * @param languageCode  (optional)
     * @param ids  (optional)
     * @param returnDefaultValue  (optional)
     * @param paymentEnabled  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalsModel]
     */
    @GET("api/v2/hospitals")
    suspend fun apiV2HospitalsGet(@Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("ServiceId") serviceId: java.util.UUID? = null, @Query("ExceptHospitalId") exceptHospitalId: java.util.UUID? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("Ids") ids: kotlin.collections.List<java.util.UUID>? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("PaymentEnabled") paymentEnabled: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalsModel>

    /**
     * Get HospitalAccreditation.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param accreditationId  
     * @return [HospitalAccreditationModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/accreditations/{accreditationId}")
    suspend fun apiV2HospitalsHospitalIdAccreditationsAccreditationIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("accreditationId") accreditationId: java.util.UUID): Response<HospitalAccreditationModel>

    /**
     * Get all HospitalAccreditations.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param hospitalName  (optional)
     * @param accreditationId  (optional)
     * @param accreditationName  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalAccreditationsModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/accreditations")
    suspend fun apiV2HospitalsHospitalIdAccreditationsGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("AccreditationId") accreditationId: java.util.UUID? = null, @Query("AccreditationName") accreditationName: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalAccreditationsModel>

    /**
     * Get HospitalEquipment.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param equipmentId  
     * @return [HospitalEquipmentModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/equipments/{equipmentId}")
    suspend fun apiV2HospitalsHospitalIdEquipmentsEquipmentIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("equipmentId") equipmentId: java.util.UUID): Response<HospitalEquipmentModel>

    /**
     * Get all EquipmentMedia.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param equipmentId  
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/equipments/{equipmentId}/medias")
    suspend fun apiV2HospitalsHospitalIdEquipmentsEquipmentIdMediasGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("equipmentId") equipmentId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Get EquipmentMedia.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param equipmentId  
     * @param mediaId  
     * @return [MediaModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/equipments/{equipmentId}/medias/{mediaId}")
    suspend fun apiV2HospitalsHospitalIdEquipmentsEquipmentIdMediasMediaIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("equipmentId") equipmentId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

    /**
     * Get all HospitalEquipments.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param id  (optional)
     * @param name  (optional)
     * @param hospitalId2  (optional)
     * @param hospitalName  (optional)
     * @param description  (optional)
     * @param created  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalEquipmentsModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/equipments")
    suspend fun apiV2HospitalsHospitalIdEquipmentsGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("HospitalId") hospitalId2: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalEquipmentsModel>

    /**
     * Get HospitalEvaluation.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param evaluationId  
     * @return [HospitalEvaluationModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/evaluations/{evaluationId}")
    suspend fun apiV2HospitalsHospitalIdEvaluationsEvaluationIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("evaluationId") evaluationId: java.util.UUID): Response<HospitalEvaluationModel>

    /**
     * Get all HospitalEvaluations.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param id  (optional)
     * @param name  (optional)
     * @param stars  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalEvaluationsModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/evaluations")
    suspend fun apiV2HospitalsHospitalIdEvaluationsGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Stars") stars: kotlin.Int? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalEvaluationsModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [HospitalModel]
     */
    @GET("api/v2/hospitals/{hospitalId}")
    suspend fun apiV2HospitalsHospitalIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<HospitalModel>

    /**
     * Get all HospitalHandles.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param id  (optional)
     * @param snsType  (optional)
     * @param handle  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalSnsHandlesModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/handles")
    suspend fun apiV2HospitalsHospitalIdHandlesGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("SnsType") snsType: SnsType? = null, @Query("Handle") handle: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalSnsHandlesModel>

    /**
     * Get HospitalHandle.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param handleId  
     * @return [SnsHandleModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/handles/{handleId}")
    suspend fun apiV2HospitalsHospitalIdHandlesHandleIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("handleId") handleId: java.util.UUID): Response<SnsHandleModel>

    /**
     * Get all HospitalMedias.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/medias")
    suspend fun apiV2HospitalsHospitalIdMediasGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Get HospitalMedia.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param mediaId  
     * @return [MediaModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/medias/{mediaId}")
    suspend fun apiV2HospitalsHospitalIdMediasMediaIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

    /**
     * Get all HospitalSpecialties.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param specialtyId  (optional)
     * @param specialtyName  (optional)
     * @param specialtyTypeId  (optional)
     * @param specialtyTypeName  (optional)
     * @param hospitalSpecialtyId  (optional)
     * @param name  (optional)
     * @param slug  (optional)
     * @param marketingType  (optional)
     * @param returnDefaultValue  (optional)
     * @param includeServices  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalSpecialtiesModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/specialties")
    suspend fun apiV2HospitalsHospitalIdSpecialtiesGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyName") specialtyName: kotlin.String? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("SpecialtyTypeName") specialtyTypeName: kotlin.String? = null, @Query("HospitalSpecialtyId") hospitalSpecialtyId: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Slug") slug: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("IncludeServices") includeServices: kotlin.Boolean? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalSpecialtiesModel>

    /**
     * Get all HospitalServiceMedias.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param hospitalSpecialtyId  
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/specialties/{hospitalSpecialtyId}/medias")
    suspend fun apiV2HospitalsHospitalIdSpecialtiesHospitalSpecialtyIdMediasGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("hospitalSpecialtyId") hospitalSpecialtyId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Get HospitalServiceMedia.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param hospitalSpecialtyId  
     * @param mediaId  
     * @return [MediaModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/specialties/{hospitalSpecialtyId}/medias/{mediaId}")
    suspend fun apiV2HospitalsHospitalIdSpecialtiesHospitalSpecialtyIdMediasMediaIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("hospitalSpecialtyId") hospitalSpecialtyId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

    /**
     * Get all HospitalSpecialties.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param specialtyId  (optional)
     * @param specialtyName  (optional)
     * @param specialtyTypeId  (optional)
     * @param specialtyTypeName  (optional)
     * @param hospitalSpecialtyId  (optional)
     * @param name  (optional)
     * @param slug  (optional)
     * @param marketingType  (optional)
     * @param returnDefaultValue  (optional)
     * @param includeServices  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalSpecialtiesSimpleModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/specialties/simple")
    suspend fun apiV2HospitalsHospitalIdSpecialtiesSimpleGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyName") specialtyName: kotlin.String? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("SpecialtyTypeName") specialtyTypeName: kotlin.String? = null, @Query("HospitalSpecialtyId") hospitalSpecialtyId: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Slug") slug: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("IncludeServices") includeServices: kotlin.Boolean? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalSpecialtiesSimpleModel>

    /**
     * Get HospitalSpecialty by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param slug  
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @param includeServices  (optional)
     * @return [HospitalSpecialtyModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/specialties/{slug}")
    suspend fun apiV2HospitalsHospitalIdSpecialtiesSlugGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("includeServices") includeServices: kotlin.Boolean? = null): Response<HospitalSpecialtyModel>

    /**
     * Get HospitalSpecialty.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @param includeServices  (optional)
     * @return [HospitalSpecialtyModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/specialties/{specialtyId}")
    suspend fun apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("includeServices") includeServices: kotlin.Boolean? = null): Response<HospitalSpecialtyModel>

    /**
     * Get all HospitalServices.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @param id  (optional)
     * @param name  (optional)
     * @param slug  (optional)
     * @param serviceCategoryId  (optional)
     * @param marketingType  (optional)
     * @param procedure  (optional)
     * @param created  (optional)
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalServicesModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services")
    suspend fun apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Slug") slug: kotlin.String? = null, @Query("ServiceCategoryId") serviceCategoryId: java.util.UUID? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("Procedure") procedure: Procedure? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalServicesModel>

    /**
     * Get HospitalService.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @param serviceId  
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [HospitalServiceModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId}")
    suspend fun apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID, @Path("serviceId") serviceId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<HospitalServiceModel>

    /**
     * Get all HospitalServiceMedias.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @param serviceId  
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId}/medias")
    suspend fun apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdMediasGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID, @Path("serviceId") serviceId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Get HospitalServiceMedia.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @param serviceId  
     * @param mediaId  
     * @return [MediaModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId}/medias/{mediaId}")
    suspend fun apiV2HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdMediasMediaIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID, @Path("serviceId") serviceId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

    /**
     * Get all HospitalWorkingDays.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param id  (optional)
     * @param dayOfWeek  (optional)
     * @param timeFrom  (optional)
     * @param timeTo  (optional)
     * @param checkHoliday  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [WorkingDaysModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/workingdays")
    suspend fun apiV2HospitalsHospitalIdWorkingdaysGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("DayOfWeek") dayOfWeek: kotlin.String? = null, @Query("TimeFrom") timeFrom: java.time.LocalDateTime? = null, @Query("TimeTo") timeTo: java.time.LocalDateTime? = null, @Query("CheckHoliday") checkHoliday: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<WorkingDaysModel>

    /**
     * Get HospitalWorkingDay.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param workingDayId  
     * @return [WorkingDayModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/workingdays/{workingDayId}")
    suspend fun apiV2HospitalsHospitalIdWorkingdaysWorkingDayIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("workingDayId") workingDayId: java.util.UUID): Response<WorkingDayModel>

    /**
     * Get all Hospitals.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  (optional)
     * @param name  (optional)
     * @param countryId  (optional)
     * @param created  (optional)
     * @param marketingType  (optional)
     * @param specialtyTypeId  (optional)
     * @param specialtyId  (optional)
     * @param serviceId  (optional)
     * @param exceptHospitalId  (optional)
     * @param showHidden  (optional)
     * @param languageCode  (optional)
     * @param ids  (optional)
     * @param returnDefaultValue  (optional)
     * @param paymentEnabled  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalsSimpleModel]
     */
    @GET("api/v2/hospitals/simple")
    suspend fun apiV2HospitalsSimpleGet(@Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("ServiceId") serviceId: java.util.UUID? = null, @Query("ExceptHospitalId") exceptHospitalId: java.util.UUID? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("Ids") ids: kotlin.collections.List<java.util.UUID>? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("PaymentEnabled") paymentEnabled: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalsSimpleModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [HospitalModel]
     */
    @GET("api/v2/hospitals/{slug}")
    suspend fun apiV2HospitalsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<HospitalModel>

}
