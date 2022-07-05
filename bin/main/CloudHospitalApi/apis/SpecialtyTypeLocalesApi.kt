package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.SpecialtyTypeLocaleViewModel
import CloudHospitalApi.models.UpdateSpecialtyTypeLocaleCommand

interface SpecialtyTypeLocalesApi {
    /**
     * Get specialtyType locale
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param specialtyTypeId  
     * @param languageCode  
     * @return [SpecialtyTypeLocaleViewModel]
     */
    @GET("api/v1/specialtytypes/{specialtyTypeId}/locales/{languageCode}")
    suspend fun apiV1SpecialtytypesSpecialtyTypeIdLocalesLanguageCodeGet(@Path("specialtyTypeId") specialtyTypeId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String): Response<SpecialtyTypeLocaleViewModel>

    /**
     * Update specialtyType locale
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param specialtyTypeId  
     * @param languageCode  
     * @param updateSpecialtyTypeLocaleCommand  (optional)
     * @return [SpecialtyTypeLocaleViewModel]
     */
    @PUT("api/v1/specialtytypes/{specialtyTypeId}/locales/{languageCode}")
    suspend fun apiV1SpecialtytypesSpecialtyTypeIdLocalesLanguageCodePut(@Path("specialtyTypeId") specialtyTypeId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String, @Body updateSpecialtyTypeLocaleCommand: UpdateSpecialtyTypeLocaleCommand? = null): Response<SpecialtyTypeLocaleViewModel>

}
