package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateDoctorEducationCommand
import CloudHospitalApi.models.DoctorEducationViewModel
import CloudHospitalApi.models.DoctorEducationsViewModel
import CloudHospitalApi.models.UpdateDoctorEducationCommand

interface DoctorEducationsApi {
    /**
     * Delete Education.
     * Sample request:        DELETE /api/v1/doctors/1/educations/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param educationId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/doctorseducations/{doctorId}/educations/{educationId}")
    suspend fun apiV1DoctorseducationsDoctorIdEducationsEducationIdDelete(@Path("doctorId") doctorId: java.util.UUID, @Path("educationId") educationId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get education.
     * Sample request:        GET /api/v1/doctors/1/educations/1
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  
     * @param educationId  
     * @return [DoctorEducationViewModel]
     */
    @GET("api/v1/doctorseducations/{doctorId}/educations/{educationId}")
    suspend fun apiV1DoctorseducationsDoctorIdEducationsEducationIdGet(@Path("doctorId") doctorId: java.util.UUID, @Path("educationId") educationId: java.util.UUID): Response<DoctorEducationViewModel>

    /**
     * Update department.
     * Sample request:
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param educationId  
     * @param updateDoctorEducationCommand  (optional)
     * @return [DoctorEducationViewModel]
     */
    @PUT("api/v1/doctorseducations/{doctorId}/educations/{educationId}")
    suspend fun apiV1DoctorseducationsDoctorIdEducationsEducationIdPut(@Path("doctorId") doctorId: java.util.UUID, @Path("educationId") educationId: java.util.UUID, @Body updateDoctorEducationCommand: UpdateDoctorEducationCommand? = null): Response<DoctorEducationViewModel>

    /**
     * Create education.
     * Sample request:        POST /api/v1/doctors/1/educations/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param createDoctorEducationCommand  (optional)
     * @return [DoctorEducationViewModel]
     */
    @POST("api/v1/doctorseducations/{doctorId}/educations")
    suspend fun apiV1DoctorseducationsDoctorIdEducationsPost(@Path("doctorId") doctorId: java.util.UUID, @Body createDoctorEducationCommand: CreateDoctorEducationCommand? = null): Response<DoctorEducationViewModel>

    /**
     * Get all educations.
     * Sample request:        GET /api/v1/doctors/educations
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  (optional)
     * @param doctorName  (optional)
     * @param institution  (optional)
     * @param qualification  (optional)
     * @param graduationDate  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorEducationsViewModel]
     */
    @GET("api/v1/doctorseducations/educations")
    suspend fun apiV1DoctorseducationsEducationsGet(@Query("DoctorId") doctorId: java.util.UUID? = null, @Query("DoctorName") doctorName: kotlin.String? = null, @Query("Institution") institution: kotlin.String? = null, @Query("Qualification") qualification: kotlin.String? = null, @Query("GraduationDate") graduationDate: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorEducationsViewModel>

}
