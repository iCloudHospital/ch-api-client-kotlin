package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateManagerCommand
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.ManagerViewModel
import CloudHospitalApi.models.ManagersViewModel
import CloudHospitalApi.models.UpdateManagerCommand

interface ManagersApi {
    /**
     * Get all hospital managers.
     * Sample request:        GET /api/v1/managers      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;manager\&quot;      }
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param fullname  (optional)
     * @param email  (optional)
     * @param gender  (optional)
     * @param dateOfBirth  (optional)
     * @param created  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @param hospitalId  (optional)
     * @return [ManagersViewModel]
     */
    @GET("api/v1/managers")
    suspend fun apiV1ManagersGet(@Query("Id") id: java.util.UUID? = null, @Query("Fullname") fullname: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("DateOfBirth") dateOfBirth: java.time.OffsetDateTime? = null, @Query("Created") created: java.time.OffsetDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.OffsetDateTime? = null, @Query("Current") current: kotlin.Boolean? = null, @Query("hospitalId") hospitalId: java.util.UUID? = null): Response<ManagersViewModel>

    /**
     * Delete hospital manager.
     * Sample request:        DELETE /api/v1/managers/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param managerId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/managers/{managerId}")
    suspend fun apiV1ManagersManagerIdDelete(@Path("managerId") managerId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get hospital manager.
     * Sample request:        GET /api/v1/managers/1
     * Responses:
     *  - 200: Success
     * 
     * @param managerId  
     * @return [ManagerViewModel]
     */
    @GET("api/v1/managers/{managerId}")
    suspend fun apiV1ManagersManagerIdGet(@Path("managerId") managerId: java.util.UUID): Response<ManagerViewModel>

    /**
     * Update hospital manager.
     * Sample request:        PUT /api/v1/managers/1      {          \&quot;firstName\&quot;: \&quot;string\&quot;,          \&quot;lastName\&quot;: \&quot;string\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param managerId  
     * @param updateManagerCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/managers/{managerId}")
    suspend fun apiV1ManagersManagerIdPut(@Path("managerId") managerId: java.util.UUID, @Body updateManagerCommand: UpdateManagerCommand? = null): Response<kotlin.Boolean>

    /**
     * Create hospital manager.
     * Sample request:        POST /api/v1/managers      {          \&quot;userName\&quot;: \&quot;manager\&quot;,          \&quot;email\&quot;: \&quot;manger@icloudhospital.com\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;firstName\&quot;: \&quot;cloud\&quot;,          \&quot;lastName\&quot;: \&quot;manager\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;string\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T15:28:09.897Z\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createManagerCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/managers")
    suspend fun apiV1ManagersPost(@Body createManagerCommand: CreateManagerCommand? = null): Response<java.util.UUID>

}
