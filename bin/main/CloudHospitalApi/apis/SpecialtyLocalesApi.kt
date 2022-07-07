package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.SpecialtyLocaleViewModel
import CloudHospitalApi.models.UpdateSpecialtyLocaleCommand

interface SpecialtyLocalesApi {
    /**
     * Get specialty locale
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param specialtyId  
     * @param languageCode  
     * @return [SpecialtyLocaleViewModel]
     */
    @GET("api/v1/specialties/{specialtyId}/locales/{languageCode}")
    suspend fun apiV1SpecialtiesSpecialtyIdLocalesLanguageCodeGet(@Path("specialtyId") specialtyId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String): Response<SpecialtyLocaleViewModel>

    /**
     * Update specialty locale
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param specialtyId  
     * @param languageCode  
     * @param updateSpecialtyLocaleCommand  (optional)
     * @return [SpecialtyLocaleViewModel]
     */
    @PUT("api/v1/specialties/{specialtyId}/locales/{languageCode}")
    suspend fun apiV1SpecialtiesSpecialtyIdLocalesLanguageCodePut(@Path("specialtyId") specialtyId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String, @Body updateSpecialtyLocaleCommand: UpdateSpecialtyLocaleCommand? = null): Response<SpecialtyLocaleViewModel>

}
