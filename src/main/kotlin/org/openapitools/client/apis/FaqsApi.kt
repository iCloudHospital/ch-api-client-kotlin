package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.FaqViewModel
import org.openapitools.client.models.FaqsViewModel

interface FaqsApi {
    /**
     * Get faq.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param faqId  
     * @param languageCode  (optional, default to "")
     * @return [Call]<[FaqViewModel]>
     */
    @GET("api/v1/faqs/{faqId}")
    fun apiV1FaqsFaqIdGet(@Path("faqId") faqId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Call<FaqViewModel>

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
     * @param current  (optional)
     * @return [Call]<[FaqsViewModel]>
     */
    @GET("api/v1/faqs")
    fun apiV1FaqsGet(@Query("Id") id: java.util.UUID? = null, @Query("Title") title: kotlin.String? = null, @Query("Content") content: kotlin.String? = null, @Query("CategoryId") categoryId: java.util.UUID? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<FaqsViewModel>

    /**
     * Get faq by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @param languageCode  (optional, default to "")
     * @return [Call]<[FaqViewModel]>
     */
    @GET("api/v1/faqs/slugs/{slug}")
    fun apiV1FaqsSlugsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null): Call<FaqViewModel>

}
