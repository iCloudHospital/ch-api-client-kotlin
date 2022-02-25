package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.FaqViewModel
import CloudHospitalApi.models.FaqsViewModel

interface FaqsApi {
    /**
     * Get faq.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param faqId  
     * @param languageCode  (optional, default to "")
     * @return [FaqViewModel]
     */
    @GET("api/v1/faqs/{faqId}")
    suspend fun apiV1FaqsFaqIdGet(@Path("faqId") faqId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<FaqViewModel>

    /**
     * Get all faq.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param title  (optional)
     * @param content  (optional)
     * @param categoryId  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [FaqsViewModel]
     */
    @GET("api/v1/faqs")
    suspend fun apiV1FaqsGet(@Query("Id") id: java.util.UUID? = null, @Query("Title") title: kotlin.String? = null, @Query("Content") content: kotlin.String? = null, @Query("CategoryId") categoryId: java.util.UUID? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<FaqsViewModel>

    /**
     * Get faq by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @param languageCode  (optional, default to "")
     * @return [FaqViewModel]
     */
    @GET("api/v1/faqs/slugs/{slug}")
    suspend fun apiV1FaqsSlugsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null): Response<FaqViewModel>

}
