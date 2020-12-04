package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.ArticleStatus
import org.openapitools.client.models.ArticleViewModel
import org.openapitools.client.models.ArticlesViewModel
import org.openapitools.client.models.CreateArticleCommand
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.UpdateArticleCommand

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
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[ArticlesViewModel]>
     */
    @GET("api/v1/hospitals/articles")
    fun apiV1HospitalsArticlesGet(@Query("Id") id: java.util.UUID? = null, @Query("Title") title: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("Status") status: ArticleStatus? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("UserId") userId: java.util.UUID? = null, @Query("UserName") userName: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("Tag") tag: kotlin.String? = null, @Query("ExceptHospitalId") exceptHospitalId: java.util.UUID? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<ArticlesViewModel>

    /**
     * Get article by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @return [Call]<[ArticleViewModel]>
     */
    @GET("api/v1/hospitals/articles/slugs/{slug}")
    fun apiV1HospitalsArticlesSlugsSlugGet(@Path("slug") slug: kotlin.String): Call<ArticleViewModel>

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
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/hospitals/{hospitalId}/articles/{articleId}")
    fun apiV1HospitalsHospitalIdArticlesArticleIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("articleId") articleId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get article.
     * Sample request:        GET /api/v1/hospitals/1/articles/1
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param articleId  
     * @return [Call]<[ArticleViewModel]>
     */
    @GET("api/v1/hospitals/{hospitalId}/articles/{articleId}")
    fun apiV1HospitalsHospitalIdArticlesArticleIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("articleId") articleId: java.util.UUID): Call<ArticleViewModel>

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
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/hospitals/{hospitalId}/articles/{articleId}")
    fun apiV1HospitalsHospitalIdArticlesArticleIdPut(@Path("hospitalId") hospitalId: java.util.UUID, @Path("articleId") articleId: java.util.UUID, @Body updateArticleCommand: UpdateArticleCommand? = null): Call<kotlin.Boolean>

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
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/hospitals/{hospitalId}/articles")
    fun apiV1HospitalsHospitalIdArticlesPost(@Path("hospitalId") hospitalId: java.util.UUID, @Body createArticleCommand: CreateArticleCommand? = null): Call<java.util.UUID>

}
