package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CountriesModel
import CloudHospitalApi.models.CountryModel
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.MediaType
import CloudHospitalApi.models.MediasModel

interface CountriesApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param countryId 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [CountryModel]
     */
    @GET("api/v2/countries/{countryId}")
    suspend fun apiV2CountriesCountryIdGet(@Path("countryId") countryId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<CountryModel>

    /**
     * Get all CountryMedias.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param countryId 
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/countries/{countryId}/medias")
    suspend fun apiV2CountriesCountryIdMediasGet(@Path("countryId") countryId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Get CountryMedia.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param countryId 
     * @param mediaId 
     * @return [MediaModel]
     */
    @GET("api/v2/countries/{countryId}/medias/{mediaId}")
    suspend fun apiV2CountriesCountryIdMediasMediaIdGet(@Path("countryId") countryId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

    /**
     * Get all countries.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param createdDate  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [CountriesModel]
     */
    @GET("api/v2/countries")
    suspend fun apiV2CountriesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("CreatedDate") createdDate: java.time.LocalDateTime? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<CountriesModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param slug 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [CountryModel]
     */
    @GET("api/v2/countries/{slug}")
    suspend fun apiV2CountriesSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<CountryModel>

}
