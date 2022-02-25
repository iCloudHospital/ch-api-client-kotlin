package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.MediaViewModel

interface ImagesApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [kotlin.collections.List<MediaViewModel>]
     */
    @POST("api/v1/images")
    suspend fun apiV1ImagesPost(): Response<kotlin.collections.List<MediaViewModel>>

}
