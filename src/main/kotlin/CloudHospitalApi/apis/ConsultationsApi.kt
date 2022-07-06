package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ConsultationModel
import CloudHospitalApi.models.ConsultationStatus
import CloudHospitalApi.models.ConsultationType
import CloudHospitalApi.models.ConsultationsModel
import CloudHospitalApi.models.CreateConsultationCommand
import CloudHospitalApi.models.UpdateConsultationCommand

interface ConsultationsApi {
    /**
     * Get consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Not Found
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     * 
     * @param consultationId  
     * @return [ConsultationModel]
     */
    @GET("api/v2/consultations/{consultationId}")
    suspend fun apiV2ConsultationsConsultationIdGet(@Path("consultationId") consultationId: java.util.UUID): Response<ConsultationModel>

    /**
     * Pay consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param consultationId  
     * @return [kotlin.String]
     */
    @POST("api/v2/consultations/{consultationId}/pay")
    suspend fun apiV2ConsultationsConsultationIdPayPost(@Path("consultationId") consultationId: java.util.UUID): Response<kotlin.String>

    /**
     * Update consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     * 
     * @param consultationId  
     * @param updateConsultationCommand  (optional)
     * @return [ConsultationModel]
     */
    @PUT("api/v2/consultations/{consultationId}")
    suspend fun apiV2ConsultationsConsultationIdPut(@Path("consultationId") consultationId: java.util.UUID, @Body updateConsultationCommand: UpdateConsultationCommand? = null): Response<ConsultationModel>

    /**
     * Get all consultations.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param searchString  (optional)
     * @param isOpen  (optional)
     * @param isCompleted  (optional)
     * @param status  (optional)
     * @param consultationType  (optional)
     * @param hospitalId  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ConsultationsModel]
     */
    @GET("api/v2/consultations")
    suspend fun apiV2ConsultationsGet(@Query("SearchString") searchString: kotlin.String? = null, @Query("IsOpen") isOpen: kotlin.Boolean? = null, @Query("IsCompleted") isCompleted: kotlin.Boolean? = null, @Query("Status") status: ConsultationStatus? = null, @Query("ConsultationType") consultationType: ConsultationType? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ConsultationsModel>

    /**
     * Create consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param requestId  
     * @param createConsultationCommand  (optional)
     * @return [ConsultationModel]
     */
    @POST("api/v2/consultations/{requestId}")
    suspend fun apiV2ConsultationsRequestIdPost(@Path("requestId") requestId: java.util.UUID, @Body createConsultationCommand: CreateConsultationCommand? = null): Response<ConsultationModel>

}
