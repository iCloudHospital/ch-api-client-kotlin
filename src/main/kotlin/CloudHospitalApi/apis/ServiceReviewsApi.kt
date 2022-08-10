package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateMediaCommand
import CloudHospitalApi.models.CreateServiceReviewCommand
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.MediaType
import CloudHospitalApi.models.MediasModel
import CloudHospitalApi.models.ProblemDetails
import CloudHospitalApi.models.ReviewType
import CloudHospitalApi.models.ServiceReviewModel
import CloudHospitalApi.models.ServiceReviewsModel
import CloudHospitalApi.models.UpdateMediaCommand
import CloudHospitalApi.models.UpdateServiceReviewCommand

interface ServiceReviewsApi {
    /**
     * Get all ServiceReviews.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param hospitalId  (optional)
     * @param serviceId  (optional)
     * @param serviceName  (optional)
     * @param patientId  (optional)
     * @param patientName  (optional)
     * @param gender  (optional)
     * @param recommended  (optional)
     * @param rate  (optional)
     * @param reviewType  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ServiceReviewsModel]
     */
    @GET("api/v2/servicereviews")
    suspend fun apiV2ServicereviewsGet(@Query("Id") id: java.util.UUID? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("ServiceId") serviceId: java.util.UUID? = null, @Query("ServiceName") serviceName: kotlin.String? = null, @Query("PatientId") patientId: java.util.UUID? = null, @Query("PatientName") patientName: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("Recommended") recommended: kotlin.Boolean? = null, @Query("Rate") rate: kotlin.Int? = null, @Query("ReviewType") reviewType: ReviewType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ServiceReviewsModel>

    /**
     * Create a ServiceReview.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param createServiceReviewCommand  (optional)
     * @return [ServiceReviewModel]
     */
    @POST("api/v2/servicereviews")
    suspend fun apiV2ServicereviewsPost(@Body createServiceReviewCommand: CreateServiceReviewCommand? = null): Response<ServiceReviewModel>

    /**
     * Delete ServiceReview.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param serviceReviewId 
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v2/servicereviews/{serviceReviewId}")
    suspend fun apiV2ServicereviewsServiceReviewIdDelete(@Path("serviceReviewId") serviceReviewId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param serviceReviewId 
     * @param languageCode  (optional)
     * @return [ServiceReviewModel]
     */
    @GET("api/v2/servicereviews/{serviceReviewId}")
    suspend fun apiV2ServicereviewsServiceReviewIdGet(@Path("serviceReviewId") serviceReviewId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<ServiceReviewModel>

    /**
     * Get all ServiceReviewMedias.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param serviceReviewId 
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/servicereviews/{serviceReviewId}/medias")
    suspend fun apiV2ServicereviewsServiceReviewIdMediasGet(@Path("serviceReviewId") serviceReviewId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Delete ServiceReviewMedia
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param serviceReviewId 
     * @param mediaId 
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v2/servicereviews/{serviceReviewId}/medias/{mediaId}")
    suspend fun apiV2ServicereviewsServiceReviewIdMediasMediaIdDelete(@Path("serviceReviewId") serviceReviewId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get ServiceReviewMedia.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param serviceReviewId 
     * @param mediaId 
     * @return [MediaModel]
     */
    @GET("api/v2/servicereviews/{serviceReviewId}/medias/{mediaId}")
    suspend fun apiV2ServicereviewsServiceReviewIdMediasMediaIdGet(@Path("serviceReviewId") serviceReviewId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

    /**
     * Update ServiceReviewMedia.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param serviceReviewId 
     * @param mediaId 
     * @param updateMediaCommand  (optional)
     * @return [MediaModel]
     */
    @PUT("api/v2/servicereviews/{serviceReviewId}/medias/{mediaId}")
    suspend fun apiV2ServicereviewsServiceReviewIdMediasMediaIdPut(@Path("serviceReviewId") serviceReviewId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID, @Body updateMediaCommand: UpdateMediaCommand? = null): Response<MediaModel>

    /**
     * Create ServiceReviewMedia.
     * 
     * Responses:
     *  - 201: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     *
     * @param serviceReviewId 
     * @param createMediaCommand  (optional)
     * @return [MediaModel]
     */
    @POST("api/v2/servicereviews/{serviceReviewId}/medias")
    suspend fun apiV2ServicereviewsServiceReviewIdMediasPost(@Path("serviceReviewId") serviceReviewId: java.util.UUID, @Body createMediaCommand: CreateMediaCommand? = null): Response<MediaModel>

    /**
     * Update ServiceReview.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 0: Error
     *
     * @param serviceReviewId 
     * @param updateServiceReviewCommand  (optional)
     * @return [ServiceReviewModel]
     */
    @PUT("api/v2/servicereviews/{serviceReviewId}")
    suspend fun apiV2ServicereviewsServiceReviewIdPut(@Path("serviceReviewId") serviceReviewId: java.util.UUID, @Body updateServiceReviewCommand: UpdateServiceReviewCommand? = null): Response<ServiceReviewModel>

}
