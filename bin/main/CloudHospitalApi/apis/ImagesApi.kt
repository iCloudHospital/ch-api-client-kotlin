package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.MediaModel

interface ImagesApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @return [kotlin.collections.List<MediaModel>]
     */
    @POST("api/v2/images")
    suspend fun apiV2ImagesPost(): Response<kotlin.collections.List<MediaModel>>

}
