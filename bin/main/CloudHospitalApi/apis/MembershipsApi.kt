package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateInvitationCommand
import CloudHospitalApi.models.CreateInvitationResultModel
import CloudHospitalApi.models.CreateMembershipResultModel
import CloudHospitalApi.models.DeleteInvitationResultModel
import CloudHospitalApi.models.DeleteMemberResultModel
import CloudHospitalApi.models.DeleteMembershipResultModel
import CloudHospitalApi.models.InvitationsViewModel
import CloudHospitalApi.models.MembersViewModel
import CloudHospitalApi.models.MembershipViewModel

interface MembershipsApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [MembershipViewModel]
     */
    @GET("api/v1/memberships/current")
    suspend fun apiV1MembershipsCurrentGet(): Response<MembershipViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [DeleteMembershipResultModel]
     */
    @DELETE("api/v1/memberships")
    suspend fun apiV1MembershipsDelete(): Response<DeleteMembershipResultModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [InvitationsViewModel]
     */
    @GET("api/v1/memberships/invitations")
    suspend fun apiV1MembershipsInvitationsGet(): Response<InvitationsViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param invitationId  
     * @return [DeleteInvitationResultModel]
     */
    @DELETE("api/v1/memberships/invitations/{invitationId}")
    suspend fun apiV1MembershipsInvitationsInvitationIdDelete(@Path("invitationId") invitationId: java.util.UUID): Response<DeleteInvitationResultModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createInvitationCommand  (optional)
     * @return [CreateInvitationResultModel]
     */
    @POST("api/v1/memberships/invitations")
    suspend fun apiV1MembershipsInvitationsPost(@Body createInvitationCommand: CreateInvitationCommand? = null): Response<CreateInvitationResultModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [MembersViewModel]
     */
    @GET("api/v1/memberships/members")
    suspend fun apiV1MembershipsMembersGet(): Response<MembersViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param patientId  
     * @return [DeleteMemberResultModel]
     */
    @DELETE("api/v1/memberships/members/{patientId}")
    suspend fun apiV1MembershipsMembersPatientIdDelete(@Path("patientId") patientId: java.util.UUID): Response<DeleteMemberResultModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param planId  
     * @return [CreateMembershipResultModel]
     */
    @POST("api/v1/memberships/{planId}")
    suspend fun apiV1MembershipsPlanIdPost(@Path("planId") planId: java.util.UUID): Response<CreateMembershipResultModel>

}
