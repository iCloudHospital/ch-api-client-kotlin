package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.DoctorSpecialtyViewModel

interface DoctorSpecialtiesApi {
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
    @POST("api/v1/doctors/{doctorId}/specialty/{specialtyId}")
    suspend fun apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost(@Path("doctorId") doctorId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID): Response<DoctorSpecialtyViewModel>

    /**
     * Remove link between the doctor and the specialty.
     * Sample request:        DELETE /api/v1/doctors/1/specialty/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param specailtyId  
     * @param hospitalId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/doctors/{hospitalId}/doctors/{doctorId}")
    suspend fun apiV1DoctorsHospitalIdDoctorsDoctorIdDelete(@Path("doctorId") doctorId: java.util.UUID, @Path("specailtyId") specailtyId: java.util.UUID, @Path("hospitalId") hospitalId: kotlin.String): Response<kotlin.Boolean>

}
