package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateHospitalMediaCommand
import CloudHospitalApi.models.HospitalMediasViewModel
import CloudHospitalApi.models.MediaType
import CloudHospitalApi.models.MediaViewModel
import CloudHospitalApi.models.UpdateHospitalMediaCommand
import CloudHospitalApi.models.UpdateHospitalMediaSequenceCommand

interface HospitalMediasApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalMediasViewModel]
     */
    @GET("api/v1/hospitals/{hospitalId}/medias")
    suspend fun apiV1HospitalsHospitalIdMediasGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalMediasViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param mediaId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/hospitals/{hospitalId}/medias/{mediaId}")
    suspend fun apiV1HospitalsHospitalIdMediasMediaIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param mediaId  
     * @param updateHospitalMediaCommand  (optional)
     * @return [MediaViewModel]
     */
    @PUT("api/v1/hospitals/{hospitalId}/medias/{mediaId}")
    suspend fun apiV1HospitalsHospitalIdMediasMediaIdPut(@Path("hospitalId") hospitalId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID, @Body updateHospitalMediaCommand: UpdateHospitalMediaCommand? = null): Response<MediaViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param createHospitalMediaCommand  (optional)
     * @return [MediaViewModel]
     */
    @POST("api/v1/hospitals/{hospitalId}/medias")
    suspend fun apiV1HospitalsHospitalIdMediasPost(@Path("hospitalId") hospitalId: java.util.UUID, @Body createHospitalMediaCommand: CreateHospitalMediaCommand? = null): Response<MediaViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param updateHospitalMediaSequenceCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/hospitals/{hospitalId}/mediasequence")
    suspend fun apiV1HospitalsHospitalIdMediasequencePut(@Path("hospitalId") hospitalId: java.util.UUID, @Body updateHospitalMediaSequenceCommand: UpdateHospitalMediaSequenceCommand? = null): Response<kotlin.Boolean>

}
