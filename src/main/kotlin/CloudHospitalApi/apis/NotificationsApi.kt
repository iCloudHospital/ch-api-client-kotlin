package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CheckNotificationsCommand
import CloudHospitalApi.models.NotificationCode
import CloudHospitalApi.models.NotificationsModel

interface NotificationsApi {
    /**
     * Check notification.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param checkNotificationsCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @POST("api/v2/notifications/check")
    suspend fun apiV2NotificationsCheckPost(@Body checkNotificationsCommand: CheckNotificationsCommand? = null): Response<kotlin.Boolean>

    /**
     * Get all notifications.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param notificationCode  (optional)
     * @param unreadCountOnly  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [NotificationsModel]
     */
    @GET("api/v2/notifications")
    suspend fun apiV2NotificationsGet(@Query("NotificationCode") notificationCode: NotificationCode? = null, @Query("UnreadCountOnly") unreadCountOnly: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<NotificationsModel>

}
