package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
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
     * @return [Call]<[SendBirdGroupChannelViewModel]>
     */
    @POST("api/v1/groupchannels/{channelUrl}/invite")
    fun apiV1GroupchannelsChannelUrlInvitePost(@Path("channelUrl") channelUrl: kotlin.String, @Body inviteSendBirdGroupChannelCommand: InviteSendBirdGroupChannelCommand? = null): Call<SendBirdGroupChannelViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param dealId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/groupchannels/deal/{dealId}")
    fun apiV1GroupchannelsDealDealIdPost(@Path("dealId") dealId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param dealId  
     * @return [Call]<[SendBirdGroupChannelViewModel]>
     */
    @GET("api/v1/groupchannels/{dealId}")
    fun apiV1GroupchannelsDealIdGet(@Path("dealId") dealId: java.util.UUID): Call<SendBirdGroupChannelViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/groupchannels/doctor/{doctorId}")
    fun apiV1GroupchannelsDoctorDoctorIdPost(@Path("doctorId") doctorId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/groupchannels/hospital/{hospitalId}")
    fun apiV1GroupchannelsHospitalHospitalIdPost(@Path("hospitalId") hospitalId: java.util.UUID): Call<kotlin.Boolean>

}
