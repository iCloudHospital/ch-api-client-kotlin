package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreateDoctorCertificateCommand
import org.openapitools.client.models.DoctorCertificate
import org.openapitools.client.models.DoctorCertificateViewModel
import org.openapitools.client.models.DoctorCertificatesViewModel
import org.openapitools.client.models.UpdateDoctorCertificateCommand

interface DoctorCertificatesApi {
    /**
     * Get all certificates.
     * Sample request:        GET /api/v1/doctors/certificates
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param doctorId  (optional)
     * @param doctorName  (optional)
     * @param certificate  (optional)
     * @param activeFrom  (optional)
     * @param activeTo  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[DoctorCertificatesViewModel]>
     */
    @GET("api/v1/doctors/certificates")
    fun apiV1DoctorsCertificatesGet(@Query("Id") id: java.util.UUID? = null, @Query("DoctorId") doctorId: java.util.UUID? = null, @Query("DoctorName") doctorName: kotlin.String? = null, @Query("Certificate") certificate: kotlin.String? = null, @Query("ActiveFrom") activeFrom: java.time.LocalDateTime? = null, @Query("ActiveTo") activeTo: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<DoctorCertificatesViewModel>

    /**
     * Delete certificate.
     * Sample request:        DELETE /api/v1/doctors/1/certificates/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param certificateId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/doctors/{doctorId}/certificates/{certificateId}")
    fun apiV1DoctorsDoctorIdCertificatesCertificateIdDelete(@Path("doctorId") doctorId: java.util.UUID, @Path("certificateId") certificateId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get certificate.
     * Sample request:        GET /api/v1/doctors/1/certificates/1
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  
     * @param certificateId  
     * @return [Call]<[DoctorCertificateViewModel]>
     */
    @GET("api/v1/doctors/{doctorId}/certificates/{certificateId}")
    fun apiV1DoctorsDoctorIdCertificatesCertificateIdGet(@Path("doctorId") doctorId: java.util.UUID, @Path("certificateId") certificateId: java.util.UUID): Call<DoctorCertificateViewModel>

    /**
     * Update department.
     * Sample request:
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param certificateId  
     * @param updateDoctorCertificateCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/doctors/{doctorId}/certificates/{certificateId}")
    fun apiV1DoctorsDoctorIdCertificatesCertificateIdPut(@Path("doctorId") doctorId: java.util.UUID, @Path("certificateId") certificateId: java.util.UUID, @Body updateDoctorCertificateCommand: UpdateDoctorCertificateCommand? = null): Call<kotlin.Boolean>

    /**
     * Create certificate.
     * Sample request:        POST /api/v1/doctors/1/certificates/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param createDoctorCertificateCommand  (optional)
     * @return [Call]<[DoctorCertificate]>
     */
    @POST("api/v1/doctors/{doctorId}/certificates")
    fun apiV1DoctorsDoctorIdCertificatesPost(@Path("doctorId") doctorId: java.util.UUID, @Body createDoctorCertificateCommand: CreateDoctorCertificateCommand? = null): Call<DoctorCertificate>

}