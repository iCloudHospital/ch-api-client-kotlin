package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.DoctorAffiliationModel
import CloudHospitalApi.models.DoctorAffiliationsModel
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.MediaType
import CloudHospitalApi.models.MediasModel

interface DoctorAffiliationsApi {
    /**
     * Get all DoctorAffiliationMedias.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorAffiliationId 
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/doctoraffiliations/{doctorAffiliationId}/medias")
    suspend fun apiV2DoctoraffiliationsDoctorAffiliationIdMediasGet(@Path("doctorAffiliationId") doctorAffiliationId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Get DoctorAffiliationMedia.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param doctorAffiliationId 
     * @param mediaId 
     * @return [MediaModel]
     */
    @GET("api/v2/doctoraffiliations/{doctorAffiliationId}/medias/{mediaId}")
    suspend fun apiV2DoctoraffiliationsDoctorAffiliationIdMediasMediaIdGet(@Path("doctorAffiliationId") doctorAffiliationId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

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
     * @param specialtyId  (optional)
     * @param marketingType  (optional)
     * @param countryId  (optional)
     * @param exceptDoctorId  (optional)
     * @param consultationEnabled  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorAffiliationsModel]
     */
    @GET("api/v2/doctoraffiliations")
    suspend fun apiV2DoctoraffiliationsGet(@Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("DoctorId") doctorId: java.util.UUID? = null, @Query("DoctorName") doctorName: kotlin.String? = null, @Query("DoctorSlug") doctorSlug: kotlin.String? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("ExceptDoctorId") exceptDoctorId: java.util.UUID? = null, @Query("ConsultationEnabled") consultationEnabled: kotlin.Boolean? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorAffiliationsModel>

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
