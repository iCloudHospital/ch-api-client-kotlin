package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import org.openapitools.client.models.CommunicationUserTokenModel

interface CommunicationsApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [kotlin.Int]
     */
    @DELETE("api/v1/communications")
    suspend fun apiV1CommunicationsDelete(): Response<kotlin.Int>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [CommunicationUserTokenModel]
     */
    @GET("api/v1/communications")
    suspend fun apiV1CommunicationsGet(): Response<CommunicationUserTokenModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [CommunicationUserTokenModel]
     */
    @PUT("api/v1/communications")
    suspend fun apiV1CommunicationsPut(): Response<CommunicationUserTokenModel>

}
