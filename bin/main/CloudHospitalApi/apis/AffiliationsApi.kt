package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.DoctorAffiliationViewModel
import CloudHospitalApi.models.ManagerAffiliationViewModel

interface AffiliationsApi {
    /**
     * Remove link between the doctor and the hospital.
     * Sample request:        DELETE /api/v1/hospitals/1/doctors/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param doctorId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/hospitals/{hospitalId}/doctors/{doctorId}")
    suspend fun apiV1HospitalsHospitalIdDoctorsDoctorIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("doctorId") doctorId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Link a doctor to a hospital.
     * Sample request:        POST /api/v1/hospitals/1/doctors/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param doctorId  
     * @return [DoctorAffiliationViewModel]
     */
    @POST("api/v1/hospitals/{hospitalId}/doctors/{doctorId}")
    suspend fun apiV1HospitalsHospitalIdDoctorsDoctorIdPost(@Path("hospitalId") hospitalId: java.util.UUID, @Path("doctorId") doctorId: java.util.UUID): Response<DoctorAffiliationViewModel>

    /**
     * Remove link between the manager and the hospital.
     * Sample request:        DELETE /api/v1/hospitals/1/managers/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param managerId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/hospitals/{hospitalId}/managers/{managerId}")
    suspend fun apiV1HospitalsHospitalIdManagersManagerIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("managerId") managerId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Link a manager to a hospital.
     * Sample request:        POST /api/v1/hospitals/1/managers/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param managerId  
     * @return [ManagerAffiliationViewModel]
     */
    @POST("api/v1/hospitals/{hospitalId}/managers/{managerId}")
    suspend fun apiV1HospitalsHospitalIdManagersManagerIdPost(@Path("hospitalId") hospitalId: java.util.UUID, @Path("managerId") managerId: java.util.UUID): Response<ManagerAffiliationViewModel>

}
