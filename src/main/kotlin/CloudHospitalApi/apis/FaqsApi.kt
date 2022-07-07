package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.FaqModel
import CloudHospitalApi.models.FaqTagModel
import CloudHospitalApi.models.FaqTagsModel
import CloudHospitalApi.models.FaqsModel
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.MediaType
import CloudHospitalApi.models.MediasModel

interface FaqsApi {
    /**
     * Get faq.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param faqId 
     * @param languageCode  (optional)
     * @return [FaqModel]
     */
    @GET("api/v2/faqs/{faqId}")
    suspend fun apiV2FaqsFaqIdGet(@Path("faqId") faqId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<FaqModel>

    /**
     * Get all FaqMedias.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param faqId 
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/faqs/{faqId}/medias")
    suspend fun apiV2FaqsFaqIdMediasGet(@Path("faqId") faqId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Get FaqMedia.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param faqId 
     * @param mediaId 
     * @return [MediaModel]
     */
    @GET("api/v2/faqs/{faqId}/medias/{mediaId}")
    suspend fun apiV2FaqsFaqIdMediasMediaIdGet(@Path("faqId") faqId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

    /**
     * GetAll FaqTags.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param faqId 
     * @param tagId  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [FaqTagsModel]
     */
    @GET("api/v2/faqs/{faqId}/tags")
    suspend fun apiV2FaqsFaqIdTagsGet(@Path("faqId") faqId: java.util.UUID, @Query("TagId") tagId: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<FaqTagsModel>

    /**
     * Get FaqTag.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param faqId 
     * @param tagId 
     * @return [FaqTagModel]
     */
    @GET("api/v2/faqs/{faqId}/tags/{tagId}")
    suspend fun apiV2FaqsFaqIdTagsTagIdGet(@Path("faqId") faqId: java.util.UUID, @Path("tagId") tagId: kotlin.String): Response<FaqTagModel>

    /**
     * Get all Faqs.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param slug  (optional)
     * @param categoryId  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [FaqsModel]
     */
    @GET("api/v2/faqs")
    suspend fun apiV2FaqsGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Slug") slug: kotlin.String? = null, @Query("CategoryId") categoryId: java.util.UUID? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<FaqsModel>

    /**
     * Get faq by slug.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param slug 
     * @param languageCode  (optional)
     * @return [FaqModel]
     */
    @GET("api/v2/faqs/{slug}")
    suspend fun apiV2FaqsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null): Response<FaqModel>

}
