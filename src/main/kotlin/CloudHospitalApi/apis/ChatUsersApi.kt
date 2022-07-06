package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ChatUserModel
import CloudHospitalApi.models.ChatUsersModel
import CloudHospitalApi.models.CreateChatUserCommand
import CloudHospitalApi.models.ProblemDetails
import CloudHospitalApi.models.UpdateChatUserCommand

interface ChatUsersApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [ChatUserModel]
     */
    @GET("api/v2/chatusers/current")
    suspend fun apiV2ChatusersCurrentGet(): Response<ChatUserModel>

    /**
     * Get all chatUsers.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param limit  (optional)
     * @param token  (optional)
     * @param userIds  (optional)
     * @param nickname  (optional)
     * @param nicknameStartswith  (optional)
     * @return [ChatUsersModel]
     */
    @GET("api/v2/chatusers")
    suspend fun apiV2ChatusersGet(@Query("Limit") limit: kotlin.Int? = null, @Query("Token") token: kotlin.String? = null, @Query("UserIds") userIds: kotlin.String? = null, @Query("Nickname") nickname: kotlin.String? = null, @Query("NicknameStartswith") nicknameStartswith: kotlin.String? = null): Response<ChatUsersModel>

    /**
     * Create a chatUser.
     * 
     * Responses:
     *  - 201: Success
     *  - 400: Bad Request
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     * 
     * @param createChatUserCommand  (optional)
     * @return [ChatUserModel]
     */
    @POST("api/v2/chatusers")
    suspend fun apiV2ChatusersPost(@Body createChatUserCommand: CreateChatUserCommand? = null): Response<ChatUserModel>

    /**
     * Delete chatUser.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Not Found
     *  - 400: Bad Request
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     * 
     * @param userId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v2/chatusers/{userId}")
    suspend fun apiV2ChatusersUserIdDelete(@Path("userId") userId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get chatUser.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Not Found
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     * 
     * @param userId  
     * @return [ChatUserModel]
     */
    @GET("api/v2/chatusers/{userId}")
    suspend fun apiV2ChatusersUserIdGet(@Path("userId") userId: java.util.UUID): Response<ChatUserModel>

    /**
     * Update chatUser.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     * 
     * @param userId  
     * @param updateChatUserCommand  (optional)
     * @return [ChatUserModel]
     */
    @PUT("api/v2/chatusers/{userId}")
    suspend fun apiV2ChatusersUserIdPut(@Path("userId") userId: java.util.UUID, @Body updateChatUserCommand: UpdateChatUserCommand? = null): Response<ChatUserModel>

}
