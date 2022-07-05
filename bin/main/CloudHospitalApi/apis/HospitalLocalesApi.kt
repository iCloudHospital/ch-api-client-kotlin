package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.HospitalLocaleViewModel
import CloudHospitalApi.models.UpdateHospitalLocaleCommand

interface HospitalLocalesApi {
    /**
     * Get hospital locale
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param languageCode  
     * @return [HospitalLocaleViewModel]
     */
    @GET("api/v1/hospitals/{hospitalId}/locales/{languageCode}")
    suspend fun apiV1HospitalsHospitalIdLocalesLanguageCodeGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String): Response<HospitalLocaleViewModel>

    /**
     * Update hospital locale
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param languageCode  
     * @param updateHospitalLocaleCommand  (optional)
     * @return [HospitalLocaleViewModel]
     */
    @PUT("api/v1/hospitals/{hospitalId}/locales/{languageCode}")
    suspend fun apiV1HospitalsHospitalIdLocalesLanguageCodePut(@Path("hospitalId") hospitalId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String, @Body updateHospitalLocaleCommand: UpdateHospitalLocaleCommand? = null): Response<HospitalLocaleViewModel>

}
