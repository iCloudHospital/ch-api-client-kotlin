package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import org.openapitools.client.models.InviteSendBirdGroupChannelCommand
import org.openapitools.client.models.SendBirdGroupChannelViewModel

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
     * @return [kotlin.Boolean]
     */
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
     * @param dealId  
     * @return [SendBirdGroupChannelViewModel]
     */
    @GET("api/v1/groupchannels/{dealId}")
    suspend fun apiV1GroupchannelsDealIdGet(@Path("dealId") dealId: java.util.UUID): Response<SendBirdGroupChannelViewModel>

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
     * @return [kotlin.Boolean]
     */
    @POST("api/v1/groupchannels/hospital/{hospitalId}")
    suspend fun apiV1GroupchannelsHospitalHospitalIdPost(@Path("hospitalId") hospitalId: java.util.UUID): Response<kotlin.Boolean>

}
