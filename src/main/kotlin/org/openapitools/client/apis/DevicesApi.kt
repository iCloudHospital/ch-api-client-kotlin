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
     * Delete device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/devices/{id}")
    fun apiV1DevicesIdDelete(@Path("id") id: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  
     * @return [Call]<[DeviceViewModel]>
     */
    @GET("api/v1/devices/{id}")
    fun apiV1DevicesIdGet(@Path("id") id: java.util.UUID): Call<DeviceViewModel>

    /**
     * Create device login.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  
     * @param createDeviceLoginCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/devices/{id}/logins")
    fun apiV1DevicesIdLoginsPost(@Path("id") id: java.util.UUID, @Body createDeviceLoginCommand: CreateDeviceLoginCommand? = null): Call<java.util.UUID>

    /**
     * Update device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  
     * @param updateDeviceCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/devices/{id}")
    fun apiV1DevicesIdPut(@Path("id") id: java.util.UUID, @Body updateDeviceCommand: UpdateDeviceCommand? = null): Call<kotlin.Boolean>

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

}