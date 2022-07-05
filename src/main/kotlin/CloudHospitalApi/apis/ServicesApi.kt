package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.HospitalServiceModel
import CloudHospitalApi.models.HospitalServicesModel
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.Procedure

interface ServicesApi {
    /**
     * Get all HospitalServices.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param slug  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param hospitalSlug  (optional)
     * @param specialtyId  (optional)
     * @param specialtyName  (optional)
     * @param specialtyTypeId  (optional)
     * @param specialtyTypeName  (optional)
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
    @GET("api/v2/services")
    suspend fun apiV2ServicesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Slug") slug: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("HospitalSlug") hospitalSlug: kotlin.String? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyName") specialtyName: kotlin.String? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("SpecialtyTypeName") specialtyTypeName: kotlin.String? = null, @Query("ServiceCategoryId") serviceCategoryId: java.util.UUID? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("Procedure") procedure: Procedure? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalServicesModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param serviceId  
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [HospitalServiceModel]
     */
    @GET("api/v2/services/{serviceId}")
    suspend fun apiV2ServicesServiceIdGet(@Path("serviceId") serviceId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<HospitalServiceModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [HospitalServiceModel]
     */
    @GET("api/v2/services/{slug}")
    suspend fun apiV2ServicesSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<HospitalServiceModel>

}
