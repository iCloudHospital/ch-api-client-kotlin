package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.TagModel
import CloudHospitalApi.models.TagsModel

interface TagsApi {
    /**
     * Get all Tags.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param tagId  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [TagsModel]
     */
    @GET("api/v2/tags")
    suspend fun apiV2TagsGet(@Query("TagId") tagId: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<TagsModel>

    /**
     * Get Tag.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param tagId  
     * @param releatedTags  (optional)
     * @return [TagModel]
     */
    @GET("api/v2/tags/{tagId}")
    suspend fun apiV2TagsTagIdGet(@Path("tagId") tagId: kotlin.String, @Query("releatedTags") releatedTags: kotlin.Boolean? = null): Response<TagModel>

}
