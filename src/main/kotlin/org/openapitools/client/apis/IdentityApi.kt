package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
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
     * @return [Unit]
     */
    @GET("api/v1/identity")
    suspend fun apiV1IdentityGet(): Response<Unit>

}
