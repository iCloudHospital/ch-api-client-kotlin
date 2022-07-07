package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.DealModel
import CloudHospitalApi.models.DealPackageModel
import CloudHospitalApi.models.DealPackagesModel
import CloudHospitalApi.models.DealServiceModel
import CloudHospitalApi.models.DealServicesModel
import CloudHospitalApi.models.DealsModel
import CloudHospitalApi.models.DealsSimpleModel
import CloudHospitalApi.models.MarketingType

interface DealsApi {
    /**
     * Get deal.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param dealId 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [DealModel]
     */
    @GET("api/v2/deals/{dealId}")
    suspend fun apiV2DealsDealIdGet(@Path("dealId") dealId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<DealModel>

    /**
     * Get all DealPackage.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param dealId 
     * @param relatedDealPackageId  (optional)
     * @param dealName  (optional)
     * @param name  (optional)
     * @param countryId  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DealPackagesModel]
     */
    @GET("api/v2/deals/{dealId}/packages")
    suspend fun apiV2DealsDealIdPackagesGet(@Path("dealId") dealId: java.util.UUID, @Query("RelatedDealPackageId") relatedDealPackageId: java.util.UUID? = null, @Query("DealName") dealName: kotlin.String? = null, @Query("Name") name: kotlin.String? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DealPackagesModel>

    /**
     * Get DealPackage.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param dealId 
     * @param packageId 
     * @return [DealPackageModel]
     */
    @GET("api/v2/deals/{dealId}/packages/{packageId}")
    suspend fun apiV2DealsDealIdPackagesPackageIdGet(@Path("dealId") dealId: java.util.UUID, @Path("packageId") packageId: java.util.UUID): Response<DealPackageModel>

    /**
     * Get all DealService.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param dealId 
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DealServicesModel]
     */
    @GET("api/v2/deals/{dealId}/services")
    suspend fun apiV2DealsDealIdServicesGet(@Path("dealId") dealId: java.util.UUID, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DealServicesModel>

    /**
     * Get DealService.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param dealId 
     * @param serviceId 
     * @return [DealServiceModel]
     */
    @GET("api/v2/deals/{dealId}/services/{serviceId}")
    suspend fun apiV2DealsDealIdServicesServiceIdGet(@Path("dealId") dealId: java.util.UUID, @Path("serviceId") serviceId: java.util.UUID): Response<DealServiceModel>

    /**
     * Get all deals.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param marketingType  (optional)
     * @param countryId  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param specialtyId  (optional)
     * @param specialtyName  (optional)
     * @param specialtyTypeId  (optional)
     * @param specialtyTypeName  (optional)
     * @param serviceId  (optional)
     * @param serviceName  (optional)
     * @param exceptHospitalId  (optional)
     * @param exceptDealId  (optional)
     * @param ids  (optional)
     * @param serviceDuration  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DealsModel]
     */
    @GET("api/v2/deals")
    suspend fun apiV2DealsGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyName") specialtyName: kotlin.String? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("SpecialtyTypeName") specialtyTypeName: kotlin.String? = null, @Query("ServiceId") serviceId: java.util.UUID? = null, @Query("ServiceName") serviceName: kotlin.String? = null, @Query("ExceptHospitalId") exceptHospitalId: java.util.UUID? = null, @Query("ExceptDealId") exceptDealId: java.util.UUID? = null, @Query("Ids") ids: kotlin.collections.List<java.util.UUID>? = null, @Query("ServiceDuration") serviceDuration: kotlin.Int? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DealsModel>

    /**
     * Get all deals.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param marketingType  (optional)
     * @param countryId  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param specialtyId  (optional)
     * @param specialtyName  (optional)
     * @param specialtyTypeId  (optional)
     * @param specialtyTypeName  (optional)
     * @param serviceId  (optional)
     * @param serviceName  (optional)
     * @param exceptHospitalId  (optional)
     * @param exceptDealId  (optional)
     * @param ids  (optional)
     * @param serviceDuration  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DealsSimpleModel]
     */
    @GET("api/v2/deals/simple")
    suspend fun apiV2DealsSimpleGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyName") specialtyName: kotlin.String? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("SpecialtyTypeName") specialtyTypeName: kotlin.String? = null, @Query("ServiceId") serviceId: java.util.UUID? = null, @Query("ServiceName") serviceName: kotlin.String? = null, @Query("ExceptHospitalId") exceptHospitalId: java.util.UUID? = null, @Query("ExceptDealId") exceptDealId: java.util.UUID? = null, @Query("Ids") ids: kotlin.collections.List<java.util.UUID>? = null, @Query("ServiceDuration") serviceDuration: kotlin.Int? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DealsSimpleModel>

    /**
     * Get deal by slug.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param slug 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [DealModel]
     */
    @GET("api/v2/deals/{slug}")
    suspend fun apiV2DealsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<DealModel>

}
