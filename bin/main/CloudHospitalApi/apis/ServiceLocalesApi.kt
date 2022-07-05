package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ServiceLocaleViewModel
import CloudHospitalApi.models.UpdateServiceLocaleCommand

interface ServiceLocalesApi {
    /**
     * Get service locale
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param serviceId  
     * @param languageCode  
     * @return [ServiceLocaleViewModel]
     */
    @GET("api/v1/services/{serviceId}/locales/{languageCode}")
    suspend fun apiV1ServicesServiceIdLocalesLanguageCodeGet(@Path("serviceId") serviceId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String): Response<ServiceLocaleViewModel>

    /**
     * Update service locale
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param serviceId  
     * @param languageCode  
     * @param updateServiceLocaleCommand  (optional)
     * @return [ServiceLocaleViewModel]
     */
    @PUT("api/v1/services/{serviceId}/locales/{languageCode}")
    suspend fun apiV1ServicesServiceIdLocalesLanguageCodePut(@Path("serviceId") serviceId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String, @Body updateServiceLocaleCommand: UpdateServiceLocaleCommand? = null): Response<ServiceLocaleViewModel>

}
