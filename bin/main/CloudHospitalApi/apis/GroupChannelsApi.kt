package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.InviteSendBirdGroupChannelCommand
import CloudHospitalApi.models.SendBirdGroupChannelViewModel

interface GroupChannelsApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param channelUrl  
     * @param inviteSendBirdGroupChannelCommand  (optional)
     * @return [SendBirdGroupChannelViewModel]
     */
    @POST("api/v1/groupchannels/{channelUrl}/invite")
    suspend fun apiV1GroupchannelsChannelUrlInvitePost(@Path("channelUrl") channelUrl: kotlin.String, @Body inviteSendBirdGroupChannelCommand: InviteSendBirdGroupChannelCommand? = null): Response<SendBirdGroupChannelViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param dealId  
     * @return [SendBirdGroupChannelViewModel]
     */
    @GET("api/v1/groupchannels/deal/{dealId}")
    suspend fun apiV1GroupchannelsDealDealIdGet(@Path("dealId") dealId: java.util.UUID): Response<SendBirdGroupChannelViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param dealId  
     * @return [kotlin.Boolean]
     */
    @Deprecated("This api was deprecated")
    @POST("api/v1/groupchannels/deal/{dealId}")
    suspend fun apiV1GroupchannelsDealDealIdPost(@Path("dealId") dealId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @return [SendBirdGroupChannelViewModel]
     */
    @GET("api/v1/groupchannels/doctor/{doctorId}")
    suspend fun apiV1GroupchannelsDoctorDoctorIdGet(@Path("doctorId") doctorId: java.util.UUID): Response<SendBirdGroupChannelViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @return [kotlin.Boolean]
     */
    @Deprecated("This api was deprecated")
    @POST("api/v1/groupchannels/doctor/{doctorId}")
    suspend fun apiV1GroupchannelsDoctorDoctorIdPost(@Path("doctorId") doctorId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @return [SendBirdGroupChannelViewModel]
     */
    @GET("api/v1/groupchannels/hospital/{hospitalId}")
    suspend fun apiV1GroupchannelsHospitalHospitalIdGet(@Path("hospitalId") hospitalId: java.util.UUID): Response<SendBirdGroupChannelViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @return [kotlin.Boolean]
     */
    @Deprecated("This api was deprecated")
    @POST("api/v1/groupchannels/hospital/{hospitalId}")
    suspend fun apiV1GroupchannelsHospitalHospitalIdPost(@Path("hospitalId") hospitalId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  
     * @return [kotlin.Boolean]
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/groupchannels/{id}")
    suspend fun apiV1GroupchannelsIdGet(@Path("id") id: java.util.UUID): Response<kotlin.Boolean>

}
