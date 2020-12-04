package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
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
     * @return [Call]<[kotlin.Int]>
     */
    @DELETE("api/v1/communications")
    fun apiV1CommunicationsDelete(): Call<kotlin.Int>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [Call]<[CommunicationUserTokenModel]>
     */
    @GET("api/v1/communications")
    fun apiV1CommunicationsGet(): Call<CommunicationUserTokenModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [Call]<[CommunicationUserTokenModel]>
     */
    @PUT("api/v1/communications")
    fun apiV1CommunicationsPut(): Call<CommunicationUserTokenModel>

}
