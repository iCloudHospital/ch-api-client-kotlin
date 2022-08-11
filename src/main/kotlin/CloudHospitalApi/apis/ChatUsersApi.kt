package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ChatUserModel
import CloudHospitalApi.models.ChatUsersModel
import CloudHospitalApi.models.CreateChatUserCommand
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
     * Delete chatUser.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v2/chatusers")
    suspend fun apiV2ChatusersDelete(): Response<kotlin.Boolean>

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
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param createChatUserCommand  (optional)
     * @return [ChatUserModel]
     */
    @POST("api/v2/chatusers")
    suspend fun apiV2ChatusersPost(@Body createChatUserCommand: CreateChatUserCommand? = null): Response<ChatUserModel>

    /**
     * Update chatUser.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param updateChatUserCommand  (optional)
     * @return [ChatUserModel]
     */
    @PUT("api/v2/chatusers")
    suspend fun apiV2ChatusersPut(@Body updateChatUserCommand: UpdateChatUserCommand? = null): Response<ChatUserModel>

    /**
     * Get chatUser.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param userId 
     * @return [ChatUserModel]
     */
    @GET("api/v2/chatusers/{userId}")
    suspend fun apiV2ChatusersUserIdGet(@Path("userId") userId: java.util.UUID): Response<ChatUserModel>

}
