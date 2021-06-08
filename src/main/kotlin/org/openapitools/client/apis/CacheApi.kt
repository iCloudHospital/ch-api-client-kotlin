package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody


interface CacheApi {
    /**
     * Remove cache with specified key
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param key  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/cache/{key}")
    fun apiV1CacheKeyDelete(@Path("key") key: kotlin.String): Call<kotlin.Boolean>

}
