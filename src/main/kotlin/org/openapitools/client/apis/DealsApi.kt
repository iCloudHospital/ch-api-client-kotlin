package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreateDealCommand
import org.openapitools.client.models.DealViewModel
import org.openapitools.client.models.DealsViewModel
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.UpdateDealCommand

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
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/deals/{dealId}")
    fun apiV1DealsDealIdDelete(@Path("dealId") dealId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get deal.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param dealId  
     * @return [Call]<[DealViewModel]>
     */
    @GET("api/v1/deals/{dealId}")
    fun apiV1DealsDealIdGet(@Path("dealId") dealId: java.util.UUID): Call<DealViewModel>

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
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/deals/{dealId}")
    fun apiV1DealsDealIdPut(@Path("dealId") dealId: java.util.UUID, @Body updateDealCommand: UpdateDealCommand? = null): Call<kotlin.Boolean>

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
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[DealsViewModel]>
     */
    @GET("api/v1/deals")
    fun apiV1DealsGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<DealsViewModel>

    /**
     * Create deal.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createDealCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/deals")
    fun apiV1DealsPost(@Body createDealCommand: CreateDealCommand? = null): Call<java.util.UUID>

    /**
     * Get deal by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @return [Call]<[DealViewModel]>
     */
    @GET("api/v1/deals/slugs/{slug}")
    fun apiV1DealsSlugsSlugGet(@Path("slug") slug: kotlin.String): Call<DealViewModel>

}
