package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.LanguageModel
import CloudHospitalApi.models.LanguagesModel

interface LanguagesApi {
    /**
     * Get Language.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param code 
     * @return [LanguageModel]
     */
    @GET("api/v2/languages/{code}")
    suspend fun apiV2LanguagesCodeGet(@Path("code") code: kotlin.String): Response<LanguageModel>

    /**
     * Get all Languages.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param code  (optional)
     * @param description  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [LanguagesModel]
     */
    @GET("api/v2/languages")
    suspend fun apiV2LanguagesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Code") code: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<LanguagesModel>

}
