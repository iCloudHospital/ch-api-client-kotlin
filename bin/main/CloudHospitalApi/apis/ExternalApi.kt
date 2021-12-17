package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.FacebookUserDataDeletionResponseModel

interface ExternalApi {
    /**
     * Callback for Facebook user data deletion
     * Sample request:        PUT /api/v1/external/facebook/deleteUserData      {          \&quot;signed_request\&quot;: \&quot;......\&quot;      }
     * Responses:
     *  - 200: Success
     * 
     * @return [FacebookUserDataDeletionResponseModel]
     */
    @POST("api/v1/external/facebook/deleteuserdata")
    suspend fun apiV1ExternalFacebookDeleteuserdataPost(): Response<FacebookUserDataDeletionResponseModel>

}
