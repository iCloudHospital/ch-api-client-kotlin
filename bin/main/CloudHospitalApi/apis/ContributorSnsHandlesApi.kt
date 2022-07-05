package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ContributorSnsHandlesViewModel
import CloudHospitalApi.models.CreateContributorSnsHandleCommand
import CloudHospitalApi.models.SnsHandleViewModel
import CloudHospitalApi.models.SnsType
import CloudHospitalApi.models.UpdateContributorSnsHandleCommand

interface ContributorSnsHandlesApi {
    /**
     * Get all contributor SNShandles.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param contributorId  
     * @param id  (optional)
     * @param snsType  (optional)
     * @param handle  (optional)
     * @param contributorId2  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ContributorSnsHandlesViewModel]
     */
    @GET("api/v1/contributors/{contributorId}/snshandles")
    suspend fun apiV1ContributorsContributorIdSnshandlesGet(@Path("contributorId") contributorId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("SnsType") snsType: SnsType? = null, @Query("Handle") handle: kotlin.String? = null, @Query("ContributorId") contributorId2: java.util.UUID? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ContributorSnsHandlesViewModel>

    /**
     * Create contributor SNShandle
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param contributorId  
     * @param createContributorSnsHandleCommand  (optional)
     * @return [SnsHandleViewModel]
     */
    @POST("api/v1/contributors/{contributorId}/snshandles")
    suspend fun apiV1ContributorsContributorIdSnshandlesPost(@Path("contributorId") contributorId: java.util.UUID, @Body createContributorSnsHandleCommand: CreateContributorSnsHandleCommand? = null): Response<SnsHandleViewModel>

    /**
     * Delete contributor SNShandle
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param contributorId  
     * @param snshandleId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/contributors/{contributorId}/snshandles/{snshandleId}")
    suspend fun apiV1ContributorsContributorIdSnshandlesSnshandleIdDelete(@Path("contributorId") contributorId: java.util.UUID, @Path("snshandleId") snshandleId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Update contributor SNShandle
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param contributorId  
     * @param snshandleId  
     * @param updateContributorSnsHandleCommand  (optional)
     * @return [SnsHandleViewModel]
     */
    @PUT("api/v1/contributors/{contributorId}/snshandles/{snshandleId}")
    suspend fun apiV1ContributorsContributorIdSnshandlesSnshandleIdPut(@Path("contributorId") contributorId: java.util.UUID, @Path("snshandleId") snshandleId: java.util.UUID, @Body updateContributorSnsHandleCommand: UpdateContributorSnsHandleCommand? = null): Response<SnsHandleViewModel>

}
