package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.AboutUsPageModel
import CloudHospitalApi.models.AboutUsPagesModel

interface AboutUsApi {
    /**
     * Get all AboutUsList.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param hospitalSlug  (optional)
     * @param name  (optional)
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @param confirmed  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [AboutUsPagesModel]
     */
    @GET("api/v2/aboutus")
    suspend fun apiV2AboutusGet(@Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("HospitalSlug") hospitalSlug: kotlin.String? = null, @Query("Name") name: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("Confirmed") confirmed: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<AboutUsPagesModel>

    /**
     * Get AboutUs.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param hospitalId 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [AboutUsPageModel]
     */
    @GET("api/v2/aboutus/{hospitalId}")
    suspend fun apiV2AboutusHospitalIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<AboutUsPageModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param slug 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [AboutUsPageModel]
     */
    @GET("api/v2/aboutus/{slug}")
    suspend fun apiV2AboutusSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<AboutUsPageModel>

}
