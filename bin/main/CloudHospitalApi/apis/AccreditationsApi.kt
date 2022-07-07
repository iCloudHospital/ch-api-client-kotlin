package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.AccreditationViewModel
import CloudHospitalApi.models.AccreditationsViewModel
import CloudHospitalApi.models.CreateAccreditationCommand
import CloudHospitalApi.models.UpdateAccreditationCommand

interface AccreditationsApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param accreditationId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/accreditations/{accreditationId}")
    suspend fun apiV1AccreditationsAccreditationIdDelete(@Path("accreditationId") accreditationId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param accreditationId  
     * @return [AccreditationViewModel]
     */
    @GET("api/v1/accreditations/{accreditationId}")
    suspend fun apiV1AccreditationsAccreditationIdGet(@Path("accreditationId") accreditationId: java.util.UUID): Response<AccreditationViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param accreditationId  
     * @param updateAccreditationCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/accreditations/{accreditationId}")
    suspend fun apiV1AccreditationsAccreditationIdPut(@Path("accreditationId") accreditationId: java.util.UUID, @Body updateAccreditationCommand: UpdateAccreditationCommand? = null): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param name  (optional)
     * @param logo  (optional)
     * @param country  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [AccreditationsViewModel]
     */
    @GET("api/v1/accreditations")
    suspend fun apiV1AccreditationsGet(@Query("Name") name: kotlin.String? = null, @Query("Logo") logo: kotlin.String? = null, @Query("Country") country: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<AccreditationsViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createAccreditationCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/accreditations")
    suspend fun apiV1AccreditationsPost(@Body createAccreditationCommand: CreateAccreditationCommand? = null): Response<java.util.UUID>

}
