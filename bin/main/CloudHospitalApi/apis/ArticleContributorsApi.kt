package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ArticleContributorViewModel
import CloudHospitalApi.models.ArticleContributorsViewModel
import CloudHospitalApi.models.ContributionType
import CloudHospitalApi.models.CreateArticleContributorCommand
import CloudHospitalApi.models.UpdateArticleContributorCommand

interface ArticleContributorsApi {
    /**
     * Delete article contributor
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param articleId  
     * @param contributorId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/articles/{articleId}/contributors/{contributorId}")
    suspend fun apiV1ArticlesArticleIdContributorsContributorIdDelete(@Path("articleId") articleId: java.util.UUID, @Path("contributorId") contributorId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Update article contributor
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param articleId  
     * @param contributorId  
     * @param updateArticleContributorCommand  (optional)
     * @return [ArticleContributorViewModel]
     */
    @PUT("api/v1/articles/{articleId}/contributors/{contributorId}")
    suspend fun apiV1ArticlesArticleIdContributorsContributorIdPut(@Path("articleId") articleId: java.util.UUID, @Path("contributorId") contributorId: java.util.UUID, @Body updateArticleContributorCommand: UpdateArticleContributorCommand? = null): Response<ArticleContributorViewModel>

    /**
     * Get all article contributor
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param articleId  
     * @param name  (optional)
     * @param email  (optional)
     * @param description  (optional)
     * @param website  (optional)
     * @param contributionType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ArticleContributorsViewModel]
     */
    @GET("api/v1/articles/{articleId}/contributors")
    suspend fun apiV1ArticlesArticleIdContributorsGet(@Path("articleId") articleId: java.util.UUID, @Query("Name") name: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("Website") website: kotlin.String? = null, @Query("ContributionType") contributionType: ContributionType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ArticleContributorsViewModel>

    /**
     * Create article contributor
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param articleId  
     * @param createArticleContributorCommand  (optional)
     * @return [ArticleContributorViewModel]
     */
    @POST("api/v1/articles/{articleId}/contributors")
    suspend fun apiV1ArticlesArticleIdContributorsPost(@Path("articleId") articleId: java.util.UUID, @Body createArticleContributorCommand: CreateArticleContributorCommand? = null): Response<ArticleContributorViewModel>

}
