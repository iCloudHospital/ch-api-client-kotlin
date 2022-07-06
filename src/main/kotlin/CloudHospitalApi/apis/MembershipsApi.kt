package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.MembersModel
import CloudHospitalApi.models.MembershipModel
import CloudHospitalApi.models.MembershipsModel
import CloudHospitalApi.models.ProblemDetails

interface MembershipsApi {
    /**
     * Get all memberships.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  (optional)
     * @param planId  (optional)
     * @param planName  (optional)
     * @param ownerId  (optional)
     * @param ownerName  (optional)
     * @param isActive  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MembershipsModel]
     */
    @GET("api/v2/memberships")
    suspend fun apiV2MembershipsGet(@Query("Id") id: java.util.UUID? = null, @Query("PlanId") planId: java.util.UUID? = null, @Query("PlanName") planName: kotlin.String? = null, @Query("OwnerId") ownerId: java.util.UUID? = null, @Query("OwnerName") ownerName: kotlin.String? = null, @Query("IsActive") isActive: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MembershipsModel>

    /**
     * Get membership.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Not Found
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     * 
     * @param membershipId  
     * @return [MembershipModel]
     */
    @GET("api/v2/memberships/{membershipId}")
    suspend fun apiV2MembershipsMembershipIdGet(@Path("membershipId") membershipId: java.util.UUID): Response<MembershipModel>

    /**
     * Get all members.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param membershipId  
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MembersModel]
     */
    @GET("api/v2/memberships/{membershipId}/members")
    suspend fun apiV2MembershipsMembershipIdMembersGet(@Path("membershipId") membershipId: java.util.UUID, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MembersModel>

}
