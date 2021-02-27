package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import org.openapitools.client.models.CreateDepartmentCommand
import org.openapitools.client.models.Department
import org.openapitools.client.models.DepartmentViewModel
import org.openapitools.client.models.DepartmentsViewModel
import org.openapitools.client.models.UpdateDepartmentCommand

interface DepartmentApi {
    /**
     * Get all department.
     * Sample request:        GET /api/v1/hospitals/departments
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param name  (optional)
     * @param additionalInfo  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [DepartmentsViewModel]
     */
    @GET("api/v1/hospitals/departments")
    suspend fun apiV1HospitalsDepartmentsGet(@Query("Id") id: java.util.UUID? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("Name") name: kotlin.String? = null, @Query("AdditionalInfo") additionalInfo: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<DepartmentsViewModel>

    /**
     * Delete department.
     * Sample request:        DELETE /api/v1/hospitals/1/departments/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param departmentId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/hospitals/{hospitalId}/departments/{departmentId}")
    suspend fun apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("departmentId") departmentId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get department.
     * Sample request:        GET /api/v1/hospitals/1/departments/1
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param departmentId  
     * @return [DepartmentViewModel]
     */
    @GET("api/v1/hospitals/{hospitalId}/departments/{departmentId}")
    suspend fun apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("departmentId") departmentId: java.util.UUID): Response<DepartmentViewModel>

    /**
     * Create department.
     * Sample request:        POST /api/v1/hospitals/1/departments/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param departmentId  
     * @param createDepartmentCommand  (optional)
     * @return [Department]
     */
    @POST("api/v1/hospitals/{hospitalId}/departments/{departmentId}")
    suspend fun apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost(@Path("hospitalId") hospitalId: java.util.UUID, @Path("departmentId") departmentId: kotlin.String, @Body createDepartmentCommand: CreateDepartmentCommand? = null): Response<Department>

    /**
     * Update department.
     * Sample request:
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param departmentId  
     * @param updateDepartmentCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/hospitals/{hospitalId}/departments/{departmentId}")
    suspend fun apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut(@Path("hospitalId") hospitalId: java.util.UUID, @Path("departmentId") departmentId: java.util.UUID, @Body updateDepartmentCommand: UpdateDepartmentCommand? = null): Response<kotlin.Boolean>

}
