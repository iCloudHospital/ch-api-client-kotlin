package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CheckNotificationsCommand
import org.openapitools.client.models.NotificationCode
import org.openapitools.client.models.NotificationsViewModel

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
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/notifications/check")
    fun apiV1NotificationsCheckPost(@Body checkNotificationsCommand: CheckNotificationsCommand? = null): Call<kotlin.Boolean>

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
     * @return [Call]<[NotificationsViewModel]>
     */
    @GET("api/v1/notifications")
    fun apiV1NotificationsGet(@Query("NotificationCode") notificationCode: NotificationCode? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<NotificationsViewModel>

}
