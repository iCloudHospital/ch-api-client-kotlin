package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.DoctorSpecialtiesViewModel
import CloudHospitalApi.models.DoctorSpecialtyViewModel

interface DoctorSpecialtiesApi {
    /**
     * Remove link between the doctor and the specialty.
     * Sample request:        DELETE /api/v1/doctors/1/specialty/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param specialtyId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/doctors/{doctorId}/specialties/{specialtyId}")
    suspend fun apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdDelete(@Path("doctorId") doctorId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get DoctorSpecialty
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  
     * @param specialtyId  
     * @return [DoctorSpecialtyViewModel]
     */
    @GET("api/v1/doctors/{doctorId}/specialties/{specialtyId}")
    suspend fun apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdGet(@Path("doctorId") doctorId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID): Response<DoctorSpecialtyViewModel>

    /**
     * Link a doctor to a specialty.
     * Sample request:        POST /api/v1/doctors/1/specialty/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param specialtyId  
     * @return [DoctorSpecialtyViewModel]
     */
    @POST("api/v1/doctors/{doctorId}/specialties/{specialtyId}")
    suspend fun apiV1DoctorsDoctorIdSpecialtiesSpecialtyIdPost(@Path("doctorId") doctorId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID): Response<DoctorSpecialtyViewModel>

    /**
     * Get All DoctorSpecialties
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  (optional)
     * @param doctorName  (optional)
     * @param specialtyId  (optional)
     * @param specialtyName  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorSpecialtiesViewModel]
     */
    @GET("api/v1/doctors/specialties")
    suspend fun apiV1DoctorsSpecialtiesGet(@Query("DoctorId") doctorId: java.util.UUID? = null, @Query("DoctorName") doctorName: kotlin.String? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyName") specialtyName: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorSpecialtiesViewModel>

}
