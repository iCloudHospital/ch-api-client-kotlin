package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateDeviceCommand
import CloudHospitalApi.models.CreateDeviceLoginCommand
import CloudHospitalApi.models.DeviceModel
import CloudHospitalApi.models.DevicesModel
import CloudHospitalApi.models.Platform
import CloudHospitalApi.models.UpdateDeviceCommand

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
     * @return [DevicesModel]
     */
    @GET("api/v2/devices")
    suspend fun apiV2DevicesGet(@Query("Id") id: java.util.UUID? = null, @Query("Token") token: kotlin.String? = null, @Query("Platform") platform: Platform? = null, @Query("AppAlert") appAlert: kotlin.Boolean? = null, @Query("EventAlert") eventAlert: kotlin.Boolean? = null, @Query("NoticeAlert") noticeAlert: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DevicesModel>

    /**
     * Delete device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param id 
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v2/devices/{id}")
    suspend fun apiV2DevicesIdDelete(@Path("id") id: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param id 
     * @return [DeviceModel]
     */
    @GET("api/v2/devices/{id}")
    suspend fun apiV2DevicesIdGet(@Path("id") id: java.util.UUID): Response<DeviceModel>

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
     * @return [java.util.UUID]
     */
    @POST("api/v2/devices/{id}/logins")
    suspend fun apiV2DevicesIdLoginsPost(@Path("id") id: java.util.UUID, @Body createDeviceLoginCommand: CreateDeviceLoginCommand? = null): Response<java.util.UUID>

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
     * @return [kotlin.Boolean]
     */
    @PUT("api/v2/devices/{id}")
    suspend fun apiV2DevicesIdPut(@Path("id") id: java.util.UUID, @Body updateDeviceCommand: UpdateDeviceCommand? = null): Response<kotlin.Boolean>

    /**
     * Create device.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param createDeviceCommand  (optional)
     * @return [DeviceModel]
     */
    @POST("api/v2/devices")
    suspend fun apiV2DevicesPost(@Body createDeviceCommand: CreateDeviceCommand? = null): Response<DeviceModel>

}
