package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.FaqCategoriesModel
import CloudHospitalApi.models.FaqCategoryModel

interface FaqCategoriesApi {
    /**
     * Get FaqCategory.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param faqCategoryId 
     * @param languageCode  (optional)
     * @return [FaqCategoryModel]
     */
    @GET("api/v2/faqcategories/{faqCategoryId}")
    suspend fun apiV2FaqcategoriesFaqCategoryIdGet(@Path("faqCategoryId") faqCategoryId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<FaqCategoryModel>

    /**
     * Get all FaqCategories.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param parentId  (optional)
     * @param name  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [FaqCategoriesModel]
     */
    @GET("api/v2/faqcategories")
    suspend fun apiV2FaqcategoriesGet(@Query("Id") id: java.util.UUID? = null, @Query("ParentId") parentId: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<FaqCategoriesModel>

    /**
     * Get FaqCategory by slug.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param slug 
     * @param languageCode  (optional)
     * @return [FaqCategoryModel]
     */
    @GET("api/v2/faqcategories/{slug}")
    suspend fun apiV2FaqcategoriesSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null): Response<FaqCategoryModel>

}
