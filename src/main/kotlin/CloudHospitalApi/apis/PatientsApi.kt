package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreatePatientCommand
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.HealthProfileViewModel
import CloudHospitalApi.models.PatientViewModel
import CloudHospitalApi.models.PatientsViewModel
import CloudHospitalApi.models.UpdateHealthProfileCommand
import CloudHospitalApi.models.UpdatePatientCommand

interface PatientsApi {
    /**
     * Get all patients.
     * Sample request:        GET /api/v1/patients      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;patient\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  (optional)
     * @param fullname  (optional)
     * @param email  (optional)
     * @param gender  (optional)
     * @param dateOfBirth  (optional)
     * @param created  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [PatientsViewModel]
     */
    @GET("api/v1/patients")
    suspend fun apiV1PatientsGet(@Query("Id") id: java.util.UUID? = null, @Query("Fullname") fullname: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("DateOfBirth") dateOfBirth: java.time.LocalDateTime? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<PatientsViewModel>

    /**
     * Get health profile for patient.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [HealthProfileViewModel]
     */
    @GET("api/v1/patients/healthprofile")
    suspend fun apiV1PatientsHealthprofileGet(): Response<HealthProfileViewModel>

    /**
     * Update health profile for patient.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param updateHealthProfileCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/patients/healthprofile")
    suspend fun apiV1PatientsHealthprofilePut(@Body updateHealthProfileCommand: UpdateHealthProfileCommand? = null): Response<kotlin.Boolean>

    /**
     * Delete patient.
     * Sample request:        DELETE /api/v1/patients/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param patientId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/patients/{patientId}")
    suspend fun apiV1PatientsPatientIdDelete(@Path("patientId") patientId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get patient.
     * Sample request:        GET /api/v1/patients/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param patientId  
     * @return [PatientViewModel]
     */
    @GET("api/v1/patients/{patientId}")
    suspend fun apiV1PatientsPatientIdGet(@Path("patientId") patientId: java.util.UUID): Response<PatientViewModel>

    /**
     * Update patient.
     * Sample request:        PUT /api/v1/patients/1      {          \&quot;referralCode\&quot;: \&quot;string\&quot;,          \&quot;firstName\&quot;: \&quot;patient\&quot;,          \&quot;lastName\&quot;: \&quot;cloud\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param patientId  
     * @param updatePatientCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/patients/{patientId}")
    suspend fun apiV1PatientsPatientIdPut(@Path("patientId") patientId: java.util.UUID, @Body updatePatientCommand: UpdatePatientCommand? = null): Response<kotlin.Boolean>

    /**
     * Create patient.
     * Sample request:        POST /api/v1/patients      {          \&quot;referralCode\&quot;: \&quot;123456\&quot;,          \&quot;email\&quot;: \&quot;patient@icloudhospital.com\&quot;,          \&quot;firstName\&quot;: \&quot;patient\&quot;,          \&quot;lastName\&quot;: \&quot;cloud\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createPatientCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/patients")
    suspend fun apiV1PatientsPost(@Body createPatientCommand: CreatePatientCommand? = null): Response<java.util.UUID>

}
