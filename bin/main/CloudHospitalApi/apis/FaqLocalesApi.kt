package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.FaqLocaleViewModel
import CloudHospitalApi.models.UpdateFaqLocaleCommand

interface FaqLocalesApi {
    /**
     * Get faq locale
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param faqId  
     * @param languageCode  
     * @return [FaqLocaleViewModel]
     */
    @GET("api/v1/faqs/{faqId}/locales/{languageCode}")
    suspend fun apiV1FaqsFaqIdLocalesLanguageCodeGet(@Path("faqId") faqId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String): Response<FaqLocaleViewModel>

    /**
     * Update faq locale
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param faqId  
     * @param languageCode  
     * @param updateFaqLocaleCommand  (optional)
     * @return [FaqLocaleViewModel]
     */
    @PUT("api/v1/faqs/{faqId}/locales/{languageCode}")
    suspend fun apiV1FaqsFaqIdLocalesLanguageCodePut(@Path("faqId") faqId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String, @Body updateFaqLocaleCommand: UpdateFaqLocaleCommand? = null): Response<FaqLocaleViewModel>

}
