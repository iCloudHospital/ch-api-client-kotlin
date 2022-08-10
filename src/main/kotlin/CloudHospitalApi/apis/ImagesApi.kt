package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.MediaModel

import okhttp3.MultipartBody

interface ImagesApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param files  (optional)
     * @return [kotlin.collections.List<MediaModel>]
     */
    @Multipart
    @POST("api/v2/images")
    suspend fun apiV2ImagesPost(@Part files: MultipartBody.Part? = null): Response<kotlin.collections.List<MediaModel>>

}
