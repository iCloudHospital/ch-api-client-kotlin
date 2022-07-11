package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.DoctorAffiliationModel
import CloudHospitalApi.models.DoctorAffiliationsModel

interface DoctorAffiliationsApi {
    /**
     * Get all doctor affiliations.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param doctorId  (optional)
     * @param doctorName  (optional)
     * @param doctorSlug  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorAffiliationsModel]
     */
    @GET("api/v2/doctoraffiliations")
    suspend fun apiV2DoctoraffiliationsGet(@Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("DoctorId") doctorId: java.util.UUID? = null, @Query("DoctorName") doctorName: kotlin.String? = null, @Query("DoctorSlug") doctorSlug: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorAffiliationsModel>

    /**
     * Get doctor affiliation.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id 
     * @param languageCode  (optional)
     * @return [DoctorAffiliationModel]
     */
    @GET("api/v2/doctoraffiliations/{id}")
    suspend fun apiV2DoctoraffiliationsIdGet(@Path("id") id: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<DoctorAffiliationModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param slug 
     * @param languageCode  (optional)
     * @return [DoctorAffiliationModel]
     */
    @GET("api/v2/doctoraffiliations/{slug}")
    suspend fun apiV2DoctoraffiliationsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null): Response<DoctorAffiliationModel>

}
