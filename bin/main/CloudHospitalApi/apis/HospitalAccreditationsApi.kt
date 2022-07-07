package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.HospitalAccreditationViewModel
import CloudHospitalApi.models.HospitalAccreditationsViewModel

interface HospitalAccreditationsApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param accreditationId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/hospitals/{hospitalId}/accreditations/{accreditationId}")
    suspend fun apiV1HospitalsHospitalIdAccreditationsAccreditationIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("accreditationId") accreditationId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param accreditationId  
     * @return [HospitalAccreditationViewModel]
     */
    @POST("api/v1/hospitals/{hospitalId}/accreditations/{accreditationId}")
    suspend fun apiV1HospitalsHospitalIdAccreditationsAccreditationIdPost(@Path("hospitalId") hospitalId: java.util.UUID, @Path("accreditationId") accreditationId: java.util.UUID): Response<HospitalAccreditationViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalAccreditationsViewModel]
     */
    @GET("api/v1/hospitals/{hospitalId}/accreditations")
    suspend fun apiV1HospitalsHospitalIdAccreditationsGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalAccreditationsViewModel>

}
