package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.HospitalSpecialtiesViewModel
import CloudHospitalApi.models.HospitalSpecialtyViewModel
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.UpdateHospitalSpecialtySequenceCommand

interface HospitalSpecialtiesApi {
    /**
     * Delete hospitalSpecialty.
     * Sample request:        DELETE /api/v1/hospitals/1/specialties/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/hospitals/{hospitalId}/specialties/{specialtyId}")
    suspend fun apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Create hospitalSpecialty.
     * Sample request:        POST /api/v1/hospitals/1/specialties/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @return [HospitalSpecialtyViewModel]
     */
    @POST("api/v1/hospitals/{hospitalId}/specialties/{specialtyId}")
    suspend fun apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPost(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID): Response<HospitalSpecialtyViewModel>

    /**
     * Update hospitalSpecialty sequence.
     * Sample request:        PUT /api/v1/hospitals/1/specialtysequence      {          \&quot;specialtyType\&quot;: \&quot;Endocrinology\&quot;,          \&quot;hospitalSpecialtySequence\&quot;: [14, 30, 5, 7]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param specialtyTypeId  
     * @param updateHospitalSpecialtySequenceCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/hospitals/{hospitalId}/specialtysequence")
    suspend fun apiV1HospitalsHospitalIdSpecialtysequencePut(@Path("hospitalId") hospitalId: java.util.UUID, @Path("SpecialtyTypeId") specialtyTypeId: java.util.UUID, @Body updateHospitalSpecialtySequenceCommand: UpdateHospitalSpecialtySequenceCommand? = null): Response<kotlin.Boolean>

    /**
     * Get all hospitalSpecialties.
     * Sample request:        GET /api/v1/hospitals/specialties
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param hospitalSlug  (optional)
     * @param specialtyId  (optional)
     * @param specialtyName  (optional)
     * @param specialtyTypeId  (optional)
     * @param marketingType  (optional)
     * @param created  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [HospitalSpecialtiesViewModel]
     */
    @GET("api/v1/hospitals/specialties")
    suspend fun apiV1HospitalsSpecialtiesGet(@Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("HospitalSlug") hospitalSlug: kotlin.String? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyName") specialtyName: kotlin.String? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<HospitalSpecialtiesViewModel>

}
