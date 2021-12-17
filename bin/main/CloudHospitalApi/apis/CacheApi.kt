package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody


interface CacheApi {
    /**
     * Remove cache with specified key
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param key  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/cache/{key}")
    suspend fun apiV1CacheKeyDelete(@Path("key") key: kotlin.String): Response<kotlin.Boolean>

}
