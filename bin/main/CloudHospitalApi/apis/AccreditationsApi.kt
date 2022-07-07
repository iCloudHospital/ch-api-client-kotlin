package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.AccreditationModel
import CloudHospitalApi.models.AccreditationsModel
import CloudHospitalApi.models.ProblemDetails

interface AccreditationsApi {
    /**
     * Get Accreditation.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Not Found
     *  - 0: Error
     *
     * @param accreditationId 
     * @return [AccreditationModel]
     */
    @GET("api/v2/accreditations/{accreditationId}")
    suspend fun apiV2AccreditationsAccreditationIdGet(@Path("accreditationId") accreditationId: java.util.UUID): Response<AccreditationModel>

    /**
     * Get all Accreditations.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param name  (optional)
     * @param logo  (optional)
     * @param country  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [AccreditationsModel]
     */
    @GET("api/v2/accreditations")
    suspend fun apiV2AccreditationsGet(@Query("Name") name: kotlin.String? = null, @Query("Logo") logo: kotlin.String? = null, @Query("Country") country: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<AccreditationsModel>

}
