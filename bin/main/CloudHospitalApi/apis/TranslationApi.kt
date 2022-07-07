package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.TranslateCommand

interface TranslationApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param translateCommand  (optional)
     * @return [kotlin.String]
     */
    @POST("api/v1/translations/translate")
    suspend fun apiV1TranslationsTranslatePost(@Body translateCommand: TranslateCommand? = null): Response<kotlin.String>

}
