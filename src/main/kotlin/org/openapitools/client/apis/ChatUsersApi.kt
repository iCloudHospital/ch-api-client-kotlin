package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreateSendBirdCurrentUserCommand
import org.openapitools.client.models.SendBirdUserViewModel
import org.openapitools.client.models.UpdateSendBirdUserCommand

interface ChatUsersApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [Call]<[SendBirdUserViewModel]>
     */
    @GET("api/v1/chatusers/current")
    fun apiV1ChatusersCurrentGet(): Call<SendBirdUserViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createSendBirdCurrentUserCommand  (optional)
     * @return [Call]<[SendBirdUserViewModel]>
     */
    @POST("api/v1/chatusers/current")
    fun apiV1ChatusersCurrentPost(@Body createSendBirdCurrentUserCommand: CreateSendBirdCurrentUserCommand? = null): Call<SendBirdUserViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/chatusers")
    fun apiV1ChatusersDelete(): Call<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param updateSendBirdUserCommand  (optional)
     * @return [Call]<[SendBirdUserViewModel]>
     */
    @PUT("api/v1/chatusers")
    fun apiV1ChatusersPut(@Body updateSendBirdUserCommand: UpdateSendBirdUserCommand? = null): Call<SendBirdUserViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param userId  
     * @return [Call]<[SendBirdUserViewModel]>
     */
    @GET("api/v1/chatusers/{userId}")
    fun apiV1ChatusersUserIdGet(@Path("userId") userId: java.util.UUID): Call<SendBirdUserViewModel>

}
