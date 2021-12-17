package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateSendBirdCurrentUserCommand
import CloudHospitalApi.models.SendBirdUserViewModel
import CloudHospitalApi.models.UpdateSendBirdUserCommand

interface ChatUsersApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [SendBirdUserViewModel]
     */
    @GET("api/v1/chatusers/current")
    suspend fun apiV1ChatusersCurrentGet(): Response<SendBirdUserViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createSendBirdCurrentUserCommand  (optional)
     * @return [SendBirdUserViewModel]
     */
    @POST("api/v1/chatusers/current")
    suspend fun apiV1ChatusersCurrentPost(@Body createSendBirdCurrentUserCommand: CreateSendBirdCurrentUserCommand? = null): Response<SendBirdUserViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/chatusers")
    suspend fun apiV1ChatusersDelete(): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param updateSendBirdUserCommand  (optional)
     * @return [SendBirdUserViewModel]
     */
    @PUT("api/v1/chatusers")
    suspend fun apiV1ChatusersPut(@Body updateSendBirdUserCommand: UpdateSendBirdUserCommand? = null): Response<SendBirdUserViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param userId  
     * @return [SendBirdUserViewModel]
     */
    @GET("api/v1/chatusers/{userId}")
    suspend fun apiV1ChatusersUserIdGet(@Path("userId") userId: java.util.UUID): Response<SendBirdUserViewModel>

}
