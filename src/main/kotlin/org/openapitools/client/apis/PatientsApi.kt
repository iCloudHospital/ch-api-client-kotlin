package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreatePatientCommand
import org.openapitools.client.models.Gender
import org.openapitools.client.models.PatientViewModel
import org.openapitools.client.models.PatientsViewModel
import org.openapitools.client.models.UpdatePatientCommand

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
     * @param current  (optional)
     * @return [Call]<[PatientsViewModel]>
     */
    @GET("api/v1/patients")
    fun apiV1PatientsGet(@Query("Id") id: java.util.UUID? = null, @Query("Fullname") fullname: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("DateOfBirth") dateOfBirth: java.time.LocalDateTime? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<PatientsViewModel>

    /**
     * Delete patient.
     * Sample request:        DELETE /api/v1/patients/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param patientId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/patients/{patientId}")
    fun apiV1PatientsPatientIdDelete(@Path("patientId") patientId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get patient.
     * Sample request:        GET /api/v1/patients/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param patientId  
     * @return [Call]<[PatientViewModel]>
     */
    @GET("api/v1/patients/{patientId}")
    fun apiV1PatientsPatientIdGet(@Path("patientId") patientId: java.util.UUID): Call<PatientViewModel>

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
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/patients/{patientId}")
    fun apiV1PatientsPatientIdPut(@Path("patientId") patientId: java.util.UUID, @Body updatePatientCommand: UpdatePatientCommand? = null): Call<kotlin.Boolean>

    /**
     * Create patient.
     * Sample request:        POST /api/v1/patients      {          \&quot;referralCode\&quot;: \&quot;123456\&quot;,          \&quot;email\&quot;: \&quot;patient@icloudhospital.com\&quot;,          \&quot;firstName\&quot;: \&quot;patient\&quot;,          \&quot;lastName\&quot;: \&quot;cloud\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createPatientCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/patients")
    fun apiV1PatientsPost(@Body createPatientCommand: CreatePatientCommand? = null): Call<java.util.UUID>

}
