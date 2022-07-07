package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreatePatientCommand
import CloudHospitalApi.models.PatientModel
import CloudHospitalApi.models.ProblemDetails
import CloudHospitalApi.models.UpdatePatientCommand

interface PatientsApi {
    /**
     * Delete Patient.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Not Found
     *  - 400: Bad Request
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     *
     * @param patientId 
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v2/patients/{patientId}")
    suspend fun apiV2PatientsPatientIdDelete(@Path("patientId") patientId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get Patient.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Not Found
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     *
     * @param patientId 
     * @return [PatientModel]
     */
    @GET("api/v2/patients/{patientId}")
    suspend fun apiV2PatientsPatientIdGet(@Path("patientId") patientId: java.util.UUID): Response<PatientModel>

    /**
     * Update Patient.
     * 
     * Responses:
     *  - 200: Success
     *  - 201: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     *
     * @param patientId 
     * @param updatePatientCommand  (optional)
     * @return [PatientModel]
     */
    @PUT("api/v2/patients/{patientId}")
    suspend fun apiV2PatientsPatientIdPut(@Path("patientId") patientId: java.util.UUID, @Body updatePatientCommand: UpdatePatientCommand? = null): Response<PatientModel>

    /**
     * Create a Patient.
     * 
     * Responses:
     *  - 201: Success
     *  - 400: Bad Request
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     *
     * @param createPatientCommand  (optional)
     * @return [PatientModel]
     */
    @POST("api/v2/patients")
    suspend fun apiV2PatientsPost(@Body createPatientCommand: CreatePatientCommand? = null): Response<PatientModel>

}
