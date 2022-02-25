package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.FaqCategoryLocaleViewModel
import CloudHospitalApi.models.UpdateFaqCategoryLocaleCommand

interface FaqCategoryLocalesApi {
    /**
     * Get faqCategory locale
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param faqCategoryId  
     * @param languageCode  
     * @return [FaqCategoryLocaleViewModel]
     */
    @GET("api/v1/faqcategories/{faqCategoryId}/locales/{languageCode}")
    suspend fun apiV1FaqcategoriesFaqCategoryIdLocalesLanguageCodeGet(@Path("faqCategoryId") faqCategoryId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String): Response<FaqCategoryLocaleViewModel>

    /**
     * Update faqCategory locale
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param faqCategoryId  
     * @param languageCode  
     * @param updateFaqCategoryLocaleCommand  (optional)
     * @return [FaqCategoryLocaleViewModel]
     */
    @PUT("api/v1/faqcategories/{faqCategoryId}/locales/{languageCode}")
    suspend fun apiV1FaqcategoriesFaqCategoryIdLocalesLanguageCodePut(@Path("faqCategoryId") faqCategoryId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String, @Body updateFaqCategoryLocaleCommand: UpdateFaqCategoryLocaleCommand? = null): Response<FaqCategoryLocaleViewModel>

}
