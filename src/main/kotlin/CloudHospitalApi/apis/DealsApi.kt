package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateDealCommand
import CloudHospitalApi.models.DealViewModel
import CloudHospitalApi.models.DealsViewModel
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.UpdateDealCommand

interface DealsApi {
    /**
     * Delete deal.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param dealId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/deals/{dealId}")
    suspend fun apiV1DealsDealIdDelete(@Path("dealId") dealId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get deal.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param dealId  
     * @return [DealViewModel]
     */
    @GET("api/v1/deals/{dealId}")
    suspend fun apiV1DealsDealIdGet(@Path("dealId") dealId: java.util.UUID): Response<DealViewModel>

    /**
     * Update deal.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param dealId  
     * @param updateDealCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/deals/{dealId}")
    suspend fun apiV1DealsDealIdPut(@Path("dealId") dealId: java.util.UUID, @Body updateDealCommand: UpdateDealCommand? = null): Response<kotlin.Boolean>

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
     * @param specialtyTypeId  (optional)
     * @param exceptHospitalId  (optional)
     * @param exceptDealId  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [DealsViewModel]
     */
    @GET("api/v1/deals")
    suspend fun apiV1DealsGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("ExceptHospitalId") exceptHospitalId: java.util.UUID? = null, @Query("ExceptDealId") exceptDealId: java.util.UUID? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<DealsViewModel>

    /**
     * Create deal.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createDealCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/deals")
    suspend fun apiV1DealsPost(@Body createDealCommand: CreateDealCommand? = null): Response<java.util.UUID>

    /**
     * Get deal by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @return [DealViewModel]
     */
    @GET("api/v1/deals/slugs/{slug}")
    suspend fun apiV1DealsSlugsSlugGet(@Path("slug") slug: kotlin.String): Response<DealViewModel>

}
