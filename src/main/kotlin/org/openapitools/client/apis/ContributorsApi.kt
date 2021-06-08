package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.ContributorViewModel
import org.openapitools.client.models.ContributorsViewModel

interface ContributorsApi {
    /**
     * Get contributor.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param contributorId  
     * @param languageCode  (optional, default to "")
     * @return [Call]<[ContributorViewModel]>
     */
    @GET("api/v1/contributors/{contributorId}")
    fun apiV1ContributorsContributorIdGet(@Path("contributorId") contributorId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Call<ContributorViewModel>

    /**
     * Get all contributors.
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
     * @return [Call]<[ContributorsViewModel]>
     */
    @GET("api/v1/contributors")
    fun apiV1ContributorsGet(@Query("Id") id: java.util.UUID? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<ContributorsViewModel>

    /**
     * Get contributor by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @param languageCode  (optional, default to "")
     * @return [Call]<[ContributorViewModel]>
     */
    @GET("api/v1/contributors/slugs/{slug}")
    fun apiV1ContributorsSlugsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null): Call<ContributorViewModel>

}
