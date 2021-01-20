package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreateDeviceCommand
import org.openapitools.client.models.CreateDeviceLoginCommand
import org.openapitools.client.models.DeviceViewModel
import org.openapitools.client.models.DevicesViewModel
import org.openapitools.client.models.Platform
import org.openapitools.client.models.UpdateDeviceCommand

interface DevicesApi {
    /**
     * Delete device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param deviceId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/devices/{deviceId}")
    fun apiV1DevicesDeviceIdDelete(@Path("deviceId") deviceId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Create device login.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param deviceId  
     * @param createDeviceLoginCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/devices/{deviceId}/logins")
    fun apiV1DevicesDeviceIdLoginsPost(@Path("deviceId") deviceId: java.util.UUID, @Body createDeviceLoginCommand: CreateDeviceLoginCommand? = null): Call<java.util.UUID>

    /**
     * Update device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param deviceId  
     * @param updateDeviceCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/devices/{deviceId}")
    fun apiV1DevicesDeviceIdPut(@Path("deviceId") deviceId: java.util.UUID, @Body updateDeviceCommand: UpdateDeviceCommand? = null): Call<kotlin.Boolean>

    /**
     * Get all devices.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  (optional)
     * @param token  (optional)
     * @param platform  (optional)
     * @param appAlert  (optional)
     * @param eventAlert  (optional)
     * @param noticeAlert  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[DevicesViewModel]>
     */
    @GET("api/v1/devices")
    fun apiV1DevicesGet(@Query("Id") id: java.util.UUID? = null, @Query("Token") token: kotlin.String? = null, @Query("Platform") platform: Platform? = null, @Query("AppAlert") appAlert: kotlin.Boolean? = null, @Query("EventAlert") eventAlert: kotlin.Boolean? = null, @Query("NoticeAlert") noticeAlert: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<DevicesViewModel>

    /**
     * Create device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createDeviceCommand  (optional)
     * @return [Call]<[DeviceViewModel]>
     */
    @POST("api/v1/devices")
    fun apiV1DevicesPost(@Body createDeviceCommand: CreateDeviceCommand? = null): Call<DeviceViewModel>

    /**
     * Get device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param token  
     * @return [Call]<[DeviceViewModel]>
     */
    @GET("api/v1/devices/{token}")
    fun apiV1DevicesTokenGet(@Path("token") token: kotlin.String): Call<DeviceViewModel>

}
