package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.MediaType
import CloudHospitalApi.models.MediasModel
import CloudHospitalApi.models.SpecialtiesModel
import CloudHospitalApi.models.SpecialtiesSimpleModel
import CloudHospitalApi.models.SpecialtyModel

interface SpecialtiesApi {
    /**
     * Get all Specialties.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param specialtyTypeId  (optional)
     * @param marketingType  (optional)
     * @param hospitalId  (optional)
     * @param created  (optional)
     * @param languageCode  (optional)
     * @param ids  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [SpecialtiesModel]
     */
    @GET("api/v2/specialties")
    suspend fun apiV2SpecialtiesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("Ids") ids: kotlin.collections.List<java.util.UUID>? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<SpecialtiesModel>

    /**
     * Get all Specialties Simple.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param specialtyTypeId  (optional)
     * @param marketingType  (optional)
     * @param hospitalId  (optional)
     * @param created  (optional)
     * @param languageCode  (optional)
     * @param ids  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [SpecialtiesSimpleModel]
     */
    @GET("api/v2/specialties/simple")
    suspend fun apiV2SpecialtiesSimpleGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("Ids") ids: kotlin.collections.List<java.util.UUID>? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<SpecialtiesSimpleModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param slug 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [SpecialtyModel]
     */
    @GET("api/v2/specialties/{slug}")
    suspend fun apiV2SpecialtiesSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<SpecialtyModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param specialtyId 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [SpecialtyModel]
     */
    @GET("api/v2/specialties/{specialtyId}")
    suspend fun apiV2SpecialtiesSpecialtyIdGet(@Path("specialtyId") specialtyId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<SpecialtyModel>

    /**
     * Get all SpecialtyMedias.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param specialtyId 
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/specialties/{specialtyId}/medias")
    suspend fun apiV2SpecialtiesSpecialtyIdMediasGet(@Path("specialtyId") specialtyId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Get SpecialtyMedia.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param specialtyId 
     * @param mediaId 
     * @return [MediaModel]
     */
    @GET("api/v2/specialties/{specialtyId}/medias/{mediaId}")
    suspend fun apiV2SpecialtiesSpecialtyIdMediasMediaIdGet(@Path("specialtyId") specialtyId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

}
