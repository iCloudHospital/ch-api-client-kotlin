package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody


interface IdentityApi {
    /**
     * Get current user&#39;s Identity claims.
     * Smaple request:        GET /api/v1/identity
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [Call]<[Unit]>
     */
    @GET("api/v1/identity")
    fun apiV1IdentityGet(): Call<Unit>

}
