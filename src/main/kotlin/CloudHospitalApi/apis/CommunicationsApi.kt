package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CommunicationUserTokenModel

interface CommunicationsApi {
    /**
     * Delete CommunicationUser.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @return [kotlin.Int]
     */
    @DELETE("api/v2/communications")
    suspend fun apiV2CommunicationsDelete(): Response<kotlin.Int>

    /**
     * Get CommunicationUser.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @return [CommunicationUserTokenModel]
     */
    @GET("api/v2/communications")
    suspend fun apiV2CommunicationsGet(): Response<CommunicationUserTokenModel>

    /**
     * Revoke CommunicationUser.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @return [CommunicationUserTokenModel]
     */
    @PUT("api/v2/communications")
    suspend fun apiV2CommunicationsPut(): Response<CommunicationUserTokenModel>

}
