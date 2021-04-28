package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ReviewerViewModel
import CloudHospitalApi.models.ReviewersViewModel

interface ReviewersApi {
    /**
     * Get all reviewers.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [ReviewersViewModel]
     */
    @GET("api/v1/reviewers")
    suspend fun apiV1ReviewersGet(@Query("Id") id: java.util.UUID? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<ReviewersViewModel>

    /**
     * Get reviewer.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param reviewerId  
     * @param languageCode  (optional, default to "")
     * @return [ReviewerViewModel]
     */
    @GET("api/v1/reviewers/{reviewerId}")
    suspend fun apiV1ReviewersReviewerIdGet(@Path("reviewerId") reviewerId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<ReviewerViewModel>

    /**
     * Get reviewer by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @param languageCode  (optional, default to "")
     * @return [ReviewerViewModel]
     */
    @GET("api/v1/reviewers/slugs/{slug}")
    suspend fun apiV1ReviewersSlugsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null): Response<ReviewerViewModel>

}
