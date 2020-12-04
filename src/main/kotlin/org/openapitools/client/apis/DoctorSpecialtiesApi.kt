package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.DoctorSpecialtyViewModel

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
     * @return [Call]<[DoctorSpecialtyViewModel]>
     */
    @POST("api/v1/doctors/{doctorId}/specialty/{specialtyId}")
    fun apiV1DoctorsDoctorIdSpecialtySpecialtyIdPost(@Path("doctorId") doctorId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID): Call<DoctorSpecialtyViewModel>

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
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/doctors/{hospitalId}/doctors/{doctorId}")
    fun apiV1DoctorsHospitalIdDoctorsDoctorIdDelete(@Path("doctorId") doctorId: java.util.UUID, @Path("specailtyId") specailtyId: java.util.UUID, @Path("hospitalId") hospitalId: kotlin.String): Call<kotlin.Boolean>

}
