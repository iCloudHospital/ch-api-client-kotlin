package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.HeaderNavigationItemModel

interface HeaderNavigationsApi {
    /**
     * Get all HeaderNavigationItems
     * 
     * Responses:
     *  - 200: Success
     *
     * @param languageCode 
     * @return [kotlin.collections.List<HeaderNavigationItemModel>]
     */
    @GET("api/v2/headernavigations/{languageCode}")
    suspend fun apiV2HeadernavigationsLanguageCodeGet(@Path("languageCode") languageCode: kotlin.String): Response<kotlin.collections.List<HeaderNavigationItemModel>>

}
