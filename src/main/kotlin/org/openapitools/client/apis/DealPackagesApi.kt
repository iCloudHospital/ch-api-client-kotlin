package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreateDealPackageCommand
import org.openapitools.client.models.DealPackageViewModel
import org.openapitools.client.models.UpdateDealPackageCommand

interface DealPackagesApi {
    /**
     * Delete deal package.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param dealId  
     * @param packageId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/deals/{dealId}/packages/{packageId}")
    fun apiV1DealsDealIdPackagesPackageIdDelete(@Path("dealId") dealId: java.util.UUID, @Path("packageId") packageId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get deal package.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param dealId  
     * @param packageId  
     * @return [Call]<[DealPackageViewModel]>
     */
    @GET("api/v1/deals/{dealId}/packages/{packageId}")
    fun apiV1DealsDealIdPackagesPackageIdGet(@Path("dealId") dealId: java.util.UUID, @Path("packageId") packageId: java.util.UUID): Call<DealPackageViewModel>

    /**
     * Update deal package.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param dealId  
     * @param packageId  
     * @param updateDealPackageCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/deals/{dealId}/packages/{packageId}")
    fun apiV1DealsDealIdPackagesPackageIdPut(@Path("dealId") dealId: java.util.UUID, @Path("packageId") packageId: java.util.UUID, @Body updateDealPackageCommand: UpdateDealPackageCommand? = null): Call<kotlin.Boolean>

    /**
     * Create deal package.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param dealId  
     * @param createDealPackageCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/deals/{dealId}/packages")
    fun apiV1DealsDealIdPackagesPost(@Path("dealId") dealId: java.util.UUID, @Body createDealPackageCommand: CreateDealPackageCommand? = null): Call<java.util.UUID>

}
