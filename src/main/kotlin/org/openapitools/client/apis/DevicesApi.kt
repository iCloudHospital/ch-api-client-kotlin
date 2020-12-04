package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreateDeviceCommand
import org.openapitools.client.models.CreateDeviceLoginCommand
import org.openapitools.client.models.DeviceViewModel
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
     * Get device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param deviceId  
     * @return [Call]<[DeviceViewModel]>
     */
    @GET("api/v1/devices/{deviceId}")
    fun apiV1DevicesDeviceIdGet(@Path("deviceId") deviceId: java.util.UUID): Call<DeviceViewModel>

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
     * Create device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createDeviceCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/devices")
    fun apiV1DevicesPost(@Body createDeviceCommand: CreateDeviceCommand? = null): Call<java.util.UUID>

}
