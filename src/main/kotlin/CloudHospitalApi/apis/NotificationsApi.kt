package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CheckNotificationsCommand
import CloudHospitalApi.models.NotificationCode
import CloudHospitalApi.models.NotificationsViewModel

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
    @POST("api/v1/notifications/check")
    suspend fun apiV1NotificationsCheckPost(@Body checkNotificationsCommand: CheckNotificationsCommand? = null): Response<kotlin.Boolean>

    /**
     * Get all notifications.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param notificationCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [NotificationsViewModel]
     */
    @GET("api/v1/notifications")
    suspend fun apiV1NotificationsGet(@Query("NotificationCode") notificationCode: NotificationCode? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<NotificationsViewModel>

}
