package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ContributorViewModel
import CloudHospitalApi.models.ContributorsViewModel

interface ContributorsApi {
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
     * Get all contributors.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param languageCode  (optional)
     * @param interviewerOnly  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [ContributorsViewModel]
     */
    @GET("api/v1/contributors")
    suspend fun apiV1ContributorsGet(@Query("Id") id: java.util.UUID? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("InterviewerOnly") interviewerOnly: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<ContributorsViewModel>

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
