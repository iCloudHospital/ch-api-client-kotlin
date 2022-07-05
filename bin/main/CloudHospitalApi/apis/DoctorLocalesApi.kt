package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.DoctorLocaleViewModel
import CloudHospitalApi.models.UpdateDoctorLocaleCommand

interface DoctorLocalesApi {
    /**
     * Get doctor locale
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  
     * @param languageCode  
     * @return [DoctorLocaleViewModel]
     */
    @GET("api/v1/doctors/{doctorId}/locales/{languageCode}")
    suspend fun apiV1DoctorsDoctorIdLocalesLanguageCodeGet(@Path("doctorId") doctorId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String): Response<DoctorLocaleViewModel>

    /**
     * Update doctor locale
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param languageCode  
     * @param updateDoctorLocaleCommand  (optional)
     * @return [DoctorLocaleViewModel]
     */
    @PUT("api/v1/doctors/{doctorId}/locales/{languageCode}")
    suspend fun apiV1DoctorsDoctorIdLocalesLanguageCodePut(@Path("doctorId") doctorId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String, @Body updateDoctorLocaleCommand: UpdateDoctorLocaleCommand? = null): Response<DoctorLocaleViewModel>

}
