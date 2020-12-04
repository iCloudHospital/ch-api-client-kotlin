package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.ApproveConsultationCommand
import org.openapitools.client.models.ConsultationStatus
import org.openapitools.client.models.ConsultationViewModel
import org.openapitools.client.models.ConsultationsViewModel
import org.openapitools.client.models.CreateConsultationCommand
import org.openapitools.client.models.RejectConsultationCommand
import org.openapitools.client.models.UpdateConsultationCommand

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
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/consultations/{consultationId}/approve")
    fun apiV1ConsultationsConsultationIdApprovePost(@Path("consultationId") consultationId: java.util.UUID, @Body approveConsultationCommand: ApproveConsultationCommand? = null): Call<kotlin.Boolean>

    /**
     * Cancel consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param consultationId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/consultations/{consultationId}/cancel")
    fun apiV1ConsultationsConsultationIdCancelPost(@Path("consultationId") consultationId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Delete consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param consultationId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/consultations/{consultationId}")
    fun apiV1ConsultationsConsultationIdDelete(@Path("consultationId") consultationId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param consultationId  
     * @return [Call]<[ConsultationViewModel]>
     */
    @GET("api/v1/consultations/{consultationId}")
    fun apiV1ConsultationsConsultationIdGet(@Path("consultationId") consultationId: java.util.UUID): Call<ConsultationViewModel>

    /**
     * Pay consultation.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param consultationId  
     * @return [Call]<[kotlin.String]>
     */
    @POST("api/v1/consultations/{consultationId}/pay")
    fun apiV1ConsultationsConsultationIdPayPost(@Path("consultationId") consultationId: java.util.UUID): Call<kotlin.String>

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
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/consultations/{consultationId}")
    fun apiV1ConsultationsConsultationIdPut(@Path("consultationId") consultationId: java.util.UUID, @Body updateConsultationCommand: UpdateConsultationCommand? = null): Call<kotlin.Boolean>

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
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/consultations/{consultationId}/reject")
    fun apiV1ConsultationsConsultationIdRejectPost(@Path("consultationId") consultationId: java.util.UUID, @Body rejectConsultationCommand: RejectConsultationCommand? = null): Call<kotlin.Boolean>

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
     * @return [Call]<[ConsultationsViewModel]>
     */
    @GET("api/v1/consultations")
    fun apiV1ConsultationsGet(@Query("SearchString") searchString: kotlin.String? = null, @Query("IsOpen") isOpen: kotlin.Boolean? = null, @Query("IsCompleted") isCompleted: kotlin.Boolean? = null, @Query("Status") status: ConsultationStatus? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<ConsultationsViewModel>

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
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/consultations/{requestId}")
    fun apiV1ConsultationsRequestIdPost(@Path("requestId") requestId: java.util.UUID, @Body createConsultationCommand: CreateConsultationCommand? = null): Call<java.util.UUID>

}
