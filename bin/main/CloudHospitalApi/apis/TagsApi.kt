package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateTagCommand
import CloudHospitalApi.models.TagViewModel
import CloudHospitalApi.models.TagsViewModel

interface TagsApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param tagId  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [TagsViewModel]
     */
    @GET("api/v1/tags")
    suspend fun apiV1TagsGet(@Query("TagId") tagId: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<TagsViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createTagCommand  (optional)
     * @return [kotlin.String]
     */
    @POST("api/v1/tags")
    suspend fun apiV1TagsPost(@Body createTagCommand: CreateTagCommand? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param tagId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/tags/{tagId}")
    suspend fun apiV1TagsTagIdDelete(@Path("tagId") tagId: kotlin.String): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param tagId  
     * @param releatedTags  (optional)
     * @return [TagViewModel]
     */
    @GET("api/v1/tags/{tagId}")
    suspend fun apiV1TagsTagIdGet(@Path("tagId") tagId: kotlin.String, @Query("releatedTags") releatedTags: kotlin.Boolean? = null): Response<TagViewModel>

}
