package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.SendFileRequestModel

interface ChatMessagesApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param sendFileRequestModel  (optional)
     * @return [kotlin.Boolean]
     */
    @POST("api/v1/chatmessages/files")
    suspend fun apiV1ChatmessagesFilesPost(@Body sendFileRequestModel: SendFileRequestModel? = null): Response<kotlin.Boolean>

}
