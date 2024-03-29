package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateDoctorReviewCommand
import CloudHospitalApi.models.DoctorReview
import CloudHospitalApi.models.DoctorReviewViewModel
import CloudHospitalApi.models.DoctorReviewsViewModel
import CloudHospitalApi.models.ReviewCategory
import CloudHospitalApi.models.UpdateDoctorReviewCommand

interface DoctorReviewsApi {
    /**
     * Delete review.
     * Sample request:        DELETE /api/v1/doctors/1/reviews/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param patientId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/doctors/{doctorId}/reviews/{patientId}")
    suspend fun apiV1DoctorsDoctorIdReviewsPatientIdDelete(@Path("doctorId") doctorId: java.util.UUID, @Path("patientId") patientId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get review.
     * Sample request:        GET /api/v1/doctors/1/reviews/1
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  
     * @param patientId  
     * @return [DoctorReviewViewModel]
     */
    @GET("api/v1/doctors/{doctorId}/reviews/{patientId}")
    suspend fun apiV1DoctorsDoctorIdReviewsPatientIdGet(@Path("doctorId") doctorId: java.util.UUID, @Path("patientId") patientId: java.util.UUID): Response<DoctorReviewViewModel>

    /**
     * Update review.
     * Sample request:
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param patientId  
     * @param updateDoctorReviewCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/doctors/{doctorId}/reviews/{patientId}")
    suspend fun apiV1DoctorsDoctorIdReviewsPatientIdPut(@Path("doctorId") doctorId: java.util.UUID, @Path("patientId") patientId: java.util.UUID, @Body updateDoctorReviewCommand: UpdateDoctorReviewCommand? = null): Response<kotlin.Boolean>

    /**
     * Create review.
     * Sample request:        POST /api/v1/doctors/1/reviews/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param patientId  
     * @param createDoctorReviewCommand  (optional)
     * @return [DoctorReview]
     */
    @POST("api/v1/doctors/{doctorId}/reviews")
    suspend fun apiV1DoctorsDoctorIdReviewsPost(@Path("doctorId") doctorId: java.util.UUID, @Path("patientId") patientId: java.util.UUID, @Body createDoctorReviewCommand: CreateDoctorReviewCommand? = null): Response<DoctorReview>

    /**
     * Get all reviews.
     * Sample request:        GET /api/v1/doctors/reviews
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  (optional)
     * @param doctorName  (optional)
     * @param patientId  (optional)
     * @param patientName  (optional)
     * @param body  (optional)
     * @param recommended  (optional)
     * @param reviewCategory  (optional)
     * @param rate  (optional)
     * @param created  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorReviewsViewModel]
     */
    @GET("api/v1/doctors/reviews")
    suspend fun apiV1DoctorsReviewsGet(@Query("DoctorId") doctorId: java.util.UUID? = null, @Query("DoctorName") doctorName: kotlin.String? = null, @Query("PatientId") patientId: java.util.UUID? = null, @Query("PatientName") patientName: kotlin.String? = null, @Query("Body") body: kotlin.String? = null, @Query("Recommended") recommended: kotlin.Boolean? = null, @Query("ReviewCategory") reviewCategory: ReviewCategory? = null, @Query("Rate") rate: kotlin.Int? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorReviewsViewModel>

}
