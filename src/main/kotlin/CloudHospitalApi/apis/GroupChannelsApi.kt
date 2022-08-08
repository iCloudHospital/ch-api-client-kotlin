package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.InviteSendBirdGroupChannelCommand
import CloudHospitalApi.models.SendBirdGroupChannelModel

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
     * @return [SendBirdGroupChannelModel]
     */
    @POST("api/v2/groupchannels/{channelUrl}/invite")
    suspend fun apiV2GroupchannelsChannelUrlInvitePost(@Path("channelUrl") channelUrl: kotlin.String, @Body inviteSendBirdGroupChannelCommand: InviteSendBirdGroupChannelCommand? = null): Response<SendBirdGroupChannelModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param dealId 
     * @param hospitalId  (optional)
     * @param isExternal  (optional)
     * @return [kotlin.String]
     */
    @GET("api/v2/groupchannels/deal/{dealId}")
    suspend fun apiV2GroupchannelsDealDealIdGet(@Path("dealId") dealId: java.util.UUID, @Query("hospitalId") hospitalId: java.util.UUID? = null, @Query("isExternal") isExternal: kotlin.Boolean? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param doctorId 
     * @param hospitalId  (optional)
     * @param isExternal  (optional)
     * @return [kotlin.String]
     */
    @GET("api/v2/groupchannels/doctor/{doctorId}")
    suspend fun apiV2GroupchannelsDoctorDoctorIdGet(@Path("doctorId") doctorId: java.util.UUID, @Query("hospitalId") hospitalId: java.util.UUID? = null, @Query("isExternal") isExternal: kotlin.Boolean? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param hospitalId 
     * @param isExternal  (optional)
     * @return [kotlin.String]
     */
    @GET("api/v2/groupchannels/hospital/{hospitalId}")
    suspend fun apiV2GroupchannelsHospitalHospitalIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("isExternal") isExternal: kotlin.Boolean? = null): Response<kotlin.String>

}
