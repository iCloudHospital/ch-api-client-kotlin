package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateDealPackageCommand
import CloudHospitalApi.models.DealPackageViewModel
import CloudHospitalApi.models.UpdateDealPackageCommand

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
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/deals/{dealId}/packages/{packageId}")
    suspend fun apiV1DealsDealIdPackagesPackageIdDelete(@Path("dealId") dealId: java.util.UUID, @Path("packageId") packageId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get deal package.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param dealId  
     * @param packageId  
     * @return [DealPackageViewModel]
     */
    @GET("api/v1/deals/{dealId}/packages/{packageId}")
    suspend fun apiV1DealsDealIdPackagesPackageIdGet(@Path("dealId") dealId: java.util.UUID, @Path("packageId") packageId: java.util.UUID): Response<DealPackageViewModel>

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
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/deals/{dealId}/packages/{packageId}")
    suspend fun apiV1DealsDealIdPackagesPackageIdPut(@Path("dealId") dealId: java.util.UUID, @Path("packageId") packageId: java.util.UUID, @Body updateDealPackageCommand: UpdateDealPackageCommand? = null): Response<kotlin.Boolean>

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
     * @return [java.util.UUID]
     */
    @POST("api/v1/deals/{dealId}/packages")
    suspend fun apiV1DealsDealIdPackagesPost(@Path("dealId") dealId: java.util.UUID, @Body createDealPackageCommand: CreateDealPackageCommand? = null): Response<java.util.UUID>

}
