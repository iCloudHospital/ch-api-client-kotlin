package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ContributorViewModel
import CloudHospitalApi.models.ContributorsViewModel
import CloudHospitalApi.models.CreateContributorCommand
import CloudHospitalApi.models.UpdateContributorCommand

interface ContributorsApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param contributorId  
     * @param languageCode  (optional, default to "")
     * @param showHidden  (optional, default to false)
     * @return [ContributorViewModel]
     */
    @GET("api/v1/contributors/authorized/{contributorId}")
    suspend fun apiV1ContributorsAuthorizedContributorIdGet(@Path("contributorId") contributorId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("showHidden") showHidden: kotlin.Boolean? = null): Response<ContributorViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param email  (optional)
     * @param description  (optional)
     * @param website  (optional)
     * @param languageCode  (optional)
     * @param hospitalId  (optional)
     * @param interviewerOnly  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ContributorsViewModel]
     */
    @GET("api/v1/contributors/authorized")
    suspend fun apiV1ContributorsAuthorizedGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("Website") website: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("InterviewerOnly") interviewerOnly: kotlin.Boolean? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ContributorsViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param contributorId  
     * @param slug  
     * @param languageCode  (optional, default to "")
     * @param showHidden  (optional, default to false)
     * @return [ContributorViewModel]
     */
    @GET("api/v1/contributors/authorized/{slug}")
    suspend fun apiV1ContributorsAuthorizedSlugGet(@Path("contributorId") contributorId: java.util.UUID, @Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("showHidden") showHidden: kotlin.Boolean? = null): Response<ContributorViewModel>

    /**
     * Delete contributor
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param contributorId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/contributors/{contributorId}")
    suspend fun apiV1ContributorsContributorIdDelete(@Path("contributorId") contributorId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get contributor.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param contributorId  
     * @param languageCode  (optional, default to "")
     * @return [ContributorViewModel]
     */
    @GET("api/v1/contributors/{contributorId}")
    suspend fun apiV1ContributorsContributorIdGet(@Path("contributorId") contributorId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<ContributorViewModel>

    /**
     * Update contributor
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param contributorId  
     * @param updateContributorCommand  (optional)
     * @return [ContributorViewModel]
     */
    @PUT("api/v1/contributors/{contributorId}")
    suspend fun apiV1ContributorsContributorIdPut(@Path("contributorId") contributorId: java.util.UUID, @Body updateContributorCommand: UpdateContributorCommand? = null): Response<ContributorViewModel>

    /**
     * Get all contributors.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param email  (optional)
     * @param description  (optional)
     * @param website  (optional)
     * @param languageCode  (optional)
     * @param hospitalId  (optional)
     * @param interviewerOnly  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ContributorsViewModel]
     */
    @GET("api/v1/contributors")
    suspend fun apiV1ContributorsGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("Website") website: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("InterviewerOnly") interviewerOnly: kotlin.Boolean? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ContributorsViewModel>

    /**
     * Create contributor
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createContributorCommand  (optional)
     * @return [ContributorViewModel]
     */
    @POST("api/v1/contributors")
    suspend fun apiV1ContributorsPost(@Body createContributorCommand: CreateContributorCommand? = null): Response<ContributorViewModel>

    /**
     * Get contributor by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @param languageCode  (optional, default to "")
     * @return [ContributorViewModel]
     */
    @GET("api/v1/contributors/slugs/{slug}")
    suspend fun apiV1ContributorsSlugsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null): Response<ContributorViewModel>

}
