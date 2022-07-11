package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.MediaType
import CloudHospitalApi.models.MediasModel
import CloudHospitalApi.models.SpecialtyTypeModel
import CloudHospitalApi.models.SpecialtyTypesModel
import CloudHospitalApi.models.SpecialtyTypesSimpleModel

interface SpecialtyTypesApi {
    /**
     * Get all Departments.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param marketingType  (optional)
     * @param hospitalId  (optional)
     * @param created  (optional)
     * @param ids  (optional)
     * @param specialtyTypeCategoryId  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [SpecialtyTypesModel]
     */
    @GET("api/v2/specialtytypes")
    suspend fun apiV2SpecialtytypesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("Ids") ids: kotlin.collections.List<java.util.UUID>? = null, @Query("SpecialtyTypeCategoryId") specialtyTypeCategoryId: java.util.UUID? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<SpecialtyTypesModel>

    /**
     * Get all Hospitals.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param marketingType  (optional)
     * @param hospitalId  (optional)
     * @param created  (optional)
     * @param ids  (optional)
     * @param specialtyTypeCategoryId  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [SpecialtyTypesSimpleModel]
     */
    @GET("api/v2/specialtytypes/simple")
    suspend fun apiV2SpecialtytypesSimpleGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("Ids") ids: kotlin.collections.List<java.util.UUID>? = null, @Query("SpecialtyTypeCategoryId") specialtyTypeCategoryId: java.util.UUID? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<SpecialtyTypesSimpleModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param slug 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [SpecialtyTypeModel]
     */
    @GET("api/v2/specialtytypes/{slug}")
    suspend fun apiV2SpecialtytypesSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<SpecialtyTypeModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param specialtyTypeId 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [SpecialtyTypeModel]
     */
    @GET("api/v2/specialtytypes/{specialtyTypeId}")
    suspend fun apiV2SpecialtytypesSpecialtyTypeIdGet(@Path("specialtyTypeId") specialtyTypeId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<SpecialtyTypeModel>

    /**
     * Get all SpecialtyTypeMedias.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param specialtyTypeId 
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/specialtytypes/{specialtyTypeId}/medias")
    suspend fun apiV2SpecialtytypesSpecialtyTypeIdMediasGet(@Path("specialtyTypeId") specialtyTypeId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Get SpecialtyTypeMedia.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param specialtyTypeId 
     * @param mediaId 
     * @return [MediaModel]
     */
    @GET("api/v2/specialtytypes/{specialtyTypeId}/medias/{mediaId}")
    suspend fun apiV2SpecialtytypesSpecialtyTypeIdMediasMediaIdGet(@Path("specialtyTypeId") specialtyTypeId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

}
