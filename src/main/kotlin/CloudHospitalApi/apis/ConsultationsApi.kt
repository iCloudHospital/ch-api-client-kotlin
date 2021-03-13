package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ApproveConsultationCommand
import CloudHospitalApi.models.ConsultationStatus
import CloudHospitalApi.models.ConsultationViewModel
import CloudHospitalApi.models.ConsultationsViewModel
import CloudHospitalApi.models.CreateConsultationCommand
import CloudHospitalApi.models.RejectConsultationCommand
import CloudHospitalApi.models.UpdateConsultationCommand

interface ConsultationsApi {
    /**
     * Approve consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param consultationId  
     * @param approveConsultationCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @POST("api/v1/consultations/{consultationId}/approve")
    suspend fun apiV1ConsultationsConsultationIdApprovePost(@Path("consultationId") consultationId: java.util.UUID, @Body approveConsultationCommand: ApproveConsultationCommand? = null): Response<kotlin.Boolean>

    /**
     * Cancel consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param consultationId  
     * @return [kotlin.Boolean]
     */
    @POST("api/v1/consultations/{consultationId}/cancel")
    suspend fun apiV1ConsultationsConsultationIdCancelPost(@Path("consultationId") consultationId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Delete consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param consultationId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/consultations/{consultationId}")
    suspend fun apiV1ConsultationsConsultationIdDelete(@Path("consultationId") consultationId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param consultationId  
     * @return [ConsultationViewModel]
     */
    @GET("api/v1/consultations/{consultationId}")
    suspend fun apiV1ConsultationsConsultationIdGet(@Path("consultationId") consultationId: java.util.UUID): Response<ConsultationViewModel>

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
    @POST("api/v1/consultations/{consultationId}/pay")
    suspend fun apiV1ConsultationsConsultationIdPayPost(@Path("consultationId") consultationId: java.util.UUID): Response<kotlin.String>

    /**
     * Update consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param consultationId  
     * @param updateConsultationCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/consultations/{consultationId}")
    suspend fun apiV1ConsultationsConsultationIdPut(@Path("consultationId") consultationId: java.util.UUID, @Body updateConsultationCommand: UpdateConsultationCommand? = null): Response<kotlin.Boolean>

    /**
     * Reject consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param consultationId  
     * @param rejectConsultationCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @POST("api/v1/consultations/{consultationId}/reject")
    suspend fun apiV1ConsultationsConsultationIdRejectPost(@Path("consultationId") consultationId: java.util.UUID, @Body rejectConsultationCommand: RejectConsultationCommand? = null): Response<kotlin.Boolean>

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
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [ConsultationsViewModel]
     */
    @GET("api/v1/consultations")
    suspend fun apiV1ConsultationsGet(@Query("SearchString") searchString: kotlin.String? = null, @Query("IsOpen") isOpen: kotlin.Boolean? = null, @Query("IsCompleted") isCompleted: kotlin.Boolean? = null, @Query("Status") status: ConsultationStatus? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<ConsultationsViewModel>

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
     * @return [java.util.UUID]
     */
    @POST("api/v1/consultations/{requestId}")
    suspend fun apiV1ConsultationsRequestIdPost(@Path("requestId") requestId: java.util.UUID, @Body createConsultationCommand: CreateConsultationCommand? = null): Response<java.util.UUID>

}
