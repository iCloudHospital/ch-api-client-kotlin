package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateDoctorMediaCommand
import CloudHospitalApi.models.DoctorMediasViewModel
import CloudHospitalApi.models.MediaType
import CloudHospitalApi.models.MediaViewModel
import CloudHospitalApi.models.UpdateDoctorMediaCommand
import CloudHospitalApi.models.UpdateDoctorMediaSequenceCommand

interface DoctorMediasApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorMediasViewModel]
     */
    @GET("api/v1/doctors/{doctorId}/medias")
    suspend fun apiV1DoctorsDoctorIdMediasGet(@Path("doctorId") doctorId: java.util.UUID, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorMediasViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param mediaId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/doctors/{doctorId}/medias/{mediaId}")
    suspend fun apiV1DoctorsDoctorIdMediasMediaIdDelete(@Path("doctorId") doctorId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param mediaId  
     * @param updateDoctorMediaCommand  (optional)
     * @return [MediaViewModel]
     */
    @PUT("api/v1/doctors/{doctorId}/medias/{mediaId}")
    suspend fun apiV1DoctorsDoctorIdMediasMediaIdPut(@Path("doctorId") doctorId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID, @Body updateDoctorMediaCommand: UpdateDoctorMediaCommand? = null): Response<MediaViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param createDoctorMediaCommand  (optional)
     * @return [MediaViewModel]
     */
    @POST("api/v1/doctors/{doctorId}/medias")
    suspend fun apiV1DoctorsDoctorIdMediasPost(@Path("doctorId") doctorId: java.util.UUID, @Body createDoctorMediaCommand: CreateDoctorMediaCommand? = null): Response<MediaViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param updateDoctorMediaSequenceCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/doctors/{doctorId}/mediasequence")
    suspend fun apiV1DoctorsDoctorIdMediasequencePut(@Path("doctorId") doctorId: java.util.UUID, @Body updateDoctorMediaSequenceCommand: UpdateDoctorMediaSequenceCommand? = null): Response<kotlin.Boolean>

}
