package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import org.openapitools.client.models.CreateYoutubeCommand
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.UpdateYoutubeCommand
import org.openapitools.client.models.YoutubeViewModel
import org.openapitools.client.models.YoutubesViewModel

interface YoutubesApi {
    /**
     * Get all youtubes.
     * Sample request:        GET /api/v1/youtubes
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param title  (optional)
     * @param normalizedTitle  (optional)
     * @param description  (optional)
     * @param marketingType  (optional)
     * @param tag  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [YoutubesViewModel]
     */
    @GET("api/v1/youtubes")
    suspend fun apiV1YoutubesGet(@Query("Id") id: java.util.UUID? = null, @Query("Title") title: kotlin.String? = null, @Query("NormalizedTitle") normalizedTitle: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("Tag") tag: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<YoutubesViewModel>

    /**
     * Create an youtube.
     * Sample request:        POST /api/v1/youtubes      {          \&quot;title\&quot;: \&quot;Samsung Hospital Youtube\&quot;,          \&quot;description\&quot;: \&quot;This is an youtube.\&quot;,          \&quot;body\&quot;: \&quot;youtube body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;tags\&quot;: [            {              \&quot;value\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0              }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createYoutubeCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/youtubes")
    suspend fun apiV1YoutubesPost(@Body createYoutubeCommand: CreateYoutubeCommand? = null): Response<java.util.UUID>

    /**
     * Get youtube by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @return [YoutubeViewModel]
     */
    @GET("api/v1/youtubes/slugs/{slug}")
    suspend fun apiV1YoutubesSlugsSlugGet(@Path("slug") slug: kotlin.String): Response<YoutubeViewModel>

    /**
     * Delete youtube.
     * Sample request:        DELETE /api/v1/youtubes/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param youtubeId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/youtubes/{youtubeId}")
    suspend fun apiV1YoutubesYoutubeIdDelete(@Path("youtubeId") youtubeId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get youtube.
     * Sample request:        GET /api/v1/youtubes/1
     * Responses:
     *  - 200: Success
     * 
     * @param youtubeId  
     * @return [YoutubeViewModel]
     */
    @GET("api/v1/youtubes/{youtubeId}")
    suspend fun apiV1YoutubesYoutubeIdGet(@Path("youtubeId") youtubeId: java.util.UUID): Response<YoutubeViewModel>

    /**
     * Update youtube.
     * Sample request:        PUT /api/v1/youtubes/1      {          \&quot;title\&quot;: \&quot;Samsung Hospital Youtube\&quot;,          \&quot;description\&quot;: \&quot;This is an youtube.\&quot;,                  \&quot;tags\&quot;: [            {              \&quot;value\&quot;: \&quot;youtubetag1\&quot;,              \&quot;order\&quot;: 0            },            {              \&quot;value\&quot;: \&quot;youtubetag2\&quot;,              \&quot;order\&quot;: 0            }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param youtubeId  
     * @param updateYoutubeCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/youtubes/{youtubeId}")
    suspend fun apiV1YoutubesYoutubeIdPut(@Path("youtubeId") youtubeId: java.util.UUID, @Body updateYoutubeCommand: UpdateYoutubeCommand? = null): Response<kotlin.Boolean>

}
