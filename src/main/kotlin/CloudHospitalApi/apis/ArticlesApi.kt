package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ArticleStatus
import CloudHospitalApi.models.ArticleViewModel
import CloudHospitalApi.models.ArticlesViewModel
import CloudHospitalApi.models.CreateArticleCommand
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.UpdateArticleCommand

interface ArticlesApi {
    /**
     * Get all articles.
     * Sample request:        GET /api/v1/hospitals/1/articles
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param title  (optional)
     * @param description  (optional)
     * @param status  (optional)
     * @param marketingType  (optional)
     * @param userId  (optional)
     * @param userName  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param countryId  (optional)
     * @param tag  (optional)
     * @param exceptHospitalId  (optional)
     * @param contributorId  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ArticlesViewModel]
     */
    @GET("api/v1/hospitals/articles")
    suspend fun apiV1HospitalsArticlesGet(@Query("Id") id: java.util.UUID? = null, @Query("Title") title: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("Status") status: ArticleStatus? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("UserId") userId: java.util.UUID? = null, @Query("UserName") userName: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("Tag") tag: kotlin.String? = null, @Query("ExceptHospitalId") exceptHospitalId: java.util.UUID? = null, @Query("ContributorId") contributorId: java.util.UUID? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ArticlesViewModel>

    /**
     * Get article by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @param languageCode  (optional, default to "en")
     * @return [ArticleViewModel]
     */
    @GET("api/v1/hospitals/articles/slugs/{slug}")
    suspend fun apiV1HospitalsArticlesSlugsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null): Response<ArticleViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  (optional)
     * @param title  (optional)
     * @param description  (optional)
     * @param status  (optional)
     * @param marketingType  (optional)
     * @param userId  (optional)
     * @param userName  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param countryId  (optional)
     * @param tag  (optional)
     * @param exceptHospitalId  (optional)
     * @param contributorId  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ArticlesViewModel]
     */
    @GET("api/v1/hospitals/authorized")
    suspend fun apiV1HospitalsAuthorizedGet(@Query("Id") id: java.util.UUID? = null, @Query("Title") title: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("Status") status: ArticleStatus? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("UserId") userId: java.util.UUID? = null, @Query("UserName") userName: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("Tag") tag: kotlin.String? = null, @Query("ExceptHospitalId") exceptHospitalId: java.util.UUID? = null, @Query("ContributorId") contributorId: java.util.UUID? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ArticlesViewModel>

    /**
     * Delete article.
     * Sample request:        DELETE /api/v1/hospitals/1/articles/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param articleId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/hospitals/{hospitalId}/articles/{articleId}")
    suspend fun apiV1HospitalsHospitalIdArticlesArticleIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("articleId") articleId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get article.
     * Sample request:        GET /api/v1/hospitals/1/articles/1
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param articleId  
     * @param languageCode  (optional, default to "")
     * @return [ArticleViewModel]
     */
    @GET("api/v1/hospitals/{hospitalId}/articles/{articleId}")
    suspend fun apiV1HospitalsHospitalIdArticlesArticleIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("articleId") articleId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<ArticleViewModel>

    /**
     * Update article.
     * Sample request:        PUT /api/v1/hospitals/1/articles/1      {          \&quot;title\&quot;: \&quot;Samsung Hospital Article\&quot;,          \&quot;description\&quot;: \&quot;This is an article.\&quot;,          \&quot;body\&quot;: \&quot;updated article body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;tags\&quot;: [            {              \&quot;value\&quot;: \&quot;articletag1\&quot;,              \&quot;order\&quot;: 0            },            {              \&quot;value\&quot;: \&quot;articletag2\&quot;,              \&quot;order\&quot;: 0            }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param articleId  
     * @param updateArticleCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/hospitals/{hospitalId}/articles/{articleId}")
    suspend fun apiV1HospitalsHospitalIdArticlesArticleIdPut(@Path("hospitalId") hospitalId: java.util.UUID, @Path("articleId") articleId: java.util.UUID, @Body updateArticleCommand: UpdateArticleCommand? = null): Response<kotlin.Boolean>

    /**
     * Create an article.
     * Sample request:        POST /api/v1/hospitals/1/articles      {          \&quot;title\&quot;: \&quot;Samsung Hospital Article\&quot;,          \&quot;description\&quot;: \&quot;This is an article.\&quot;,          \&quot;body\&quot;: \&quot;article body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;tags\&quot;: [            {              \&quot;value\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0              }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param createArticleCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/hospitals/{hospitalId}/articles")
    suspend fun apiV1HospitalsHospitalIdArticlesPost(@Path("hospitalId") hospitalId: java.util.UUID, @Body createArticleCommand: CreateArticleCommand? = null): Response<java.util.UUID>

}
