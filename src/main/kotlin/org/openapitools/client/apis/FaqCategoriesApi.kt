package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.FaqCategoriesViewModel
import org.openapitools.client.models.FaqCategoryViewModel

interface FaqCategoriesApi {
    /**
     * Get faqCategory.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param faqCategoryId  
     * @param languageCode  (optional, default to "")
     * @return [Call]<[FaqCategoryViewModel]>
     */
    @GET("api/v1/faqcategories/{faqCategoryId}")
    fun apiV1FaqcategoriesFaqCategoryIdGet(@Path("faqCategoryId") faqCategoryId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Call<FaqCategoryViewModel>

    /**
     * Get all faqCategory.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param parentId  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[FaqCategoriesViewModel]>
     */
    @GET("api/v1/faqcategories")
    fun apiV1FaqcategoriesGet(@Query("Id") id: java.util.UUID? = null, @Query("ParentId") parentId: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<FaqCategoriesViewModel>

}
