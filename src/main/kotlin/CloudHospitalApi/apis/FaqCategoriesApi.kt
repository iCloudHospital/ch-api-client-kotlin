package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.FaqCategoriesViewModel
import CloudHospitalApi.models.FaqCategoryViewModel

interface FaqCategoriesApi {
    /**
     * Get faqCategory.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param faqCategoryId  
     * @return [FaqCategoryViewModel]
     */
    @GET("api/v1/faqcategories/{faqCategoryId}")
    suspend fun apiV1FaqcategoriesFaqCategoryIdGet(@Path("faqCategoryId") faqCategoryId: java.util.UUID): Response<FaqCategoryViewModel>

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
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [FaqCategoriesViewModel]
     */
    @GET("api/v1/faqcategories")
    suspend fun apiV1FaqcategoriesGet(@Query("Id") id: java.util.UUID? = null, @Query("ParentId") parentId: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.OffsetDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<FaqCategoriesViewModel>

}
