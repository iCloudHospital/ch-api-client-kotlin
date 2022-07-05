package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateHospitalReviewCommand
import CloudHospitalApi.models.HospitalReview
import CloudHospitalApi.models.HospitalReviewViewModel
import CloudHospitalApi.models.HospitalReviewsViewModel
import CloudHospitalApi.models.ReviewCategory
import CloudHospitalApi.models.UpdateHospitalReviewCommand

interface HospitalReviewsApi {
    /**
     * Delete review.
     * Sample request:        DELETE /api/v1/hospitals/1/reviews/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param patientId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/hospitals/{hospitalId}/reviews/{patientId}")
    suspend fun apiV1HospitalsHospitalIdReviewsPatientIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("patientId") patientId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get review.
     * Sample request:        GET /api/v1/hospitals/1/reviews/1
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param patientId  
     * @return [HospitalReviewViewModel]
     */
    @GET("api/v1/hospitals/{hospitalId}/reviews/{patientId}")
    suspend fun apiV1HospitalsHospitalIdReviewsPatientIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("patientId") patientId: java.util.UUID): Response<HospitalReviewViewModel>

    /**
     * Update review.
     * Sample request:
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param patientId  
     * @param updateHospitalReviewCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/hospitals/{hospitalId}/reviews/{patientId}")
    suspend fun apiV1HospitalsHospitalIdReviewsPatientIdPut(@Path("hospitalId") hospitalId: java.util.UUID, @Path("patientId") patientId: java.util.UUID, @Body updateHospitalReviewCommand: UpdateHospitalReviewCommand? = null): Response<kotlin.Boolean>

    /**
     * Create review.
     * Sample request:        POST /api/v1/hospitals/1/reviews/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param patientId  
     * @param createHospitalReviewCommand  (optional)
     * @return [HospitalReview]
     */
    @POST("api/v1/hospitals/{hospitalId}/reviews")
    suspend fun apiV1HospitalsHospitalIdReviewsPost(@Path("hospitalId") hospitalId: java.util.UUID, @Path("patientId") patientId: java.util.UUID, @Body createHospitalReviewCommand: CreateHospitalReviewCommand? = null): Response<HospitalReview>

    /**
     * Get all reviews.
     * Sample request:        GET /api/v1/hospitals/reviews
     * Responses:
     *  - 200: Success
     * 
     * @param patientId  (optional)
     * @param patientName  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param body  (optional)
     * @param recommended  (optional)
     * @param reviewCategory  (optional)
     * @param rate  (optional)
     * @param created  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalReviewsViewModel]
     */
    @GET("api/v1/hospitals/reviews")
    suspend fun apiV1HospitalsReviewsGet(@Query("PatientId") patientId: java.util.UUID? = null, @Query("PatientName") patientName: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("Body") body: kotlin.String? = null, @Query("Recommended") recommended: kotlin.Boolean? = null, @Query("ReviewCategory") reviewCategory: ReviewCategory? = null, @Query("Rate") rate: kotlin.Int? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalReviewsViewModel>

}
