package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreateManagerCommand
import org.openapitools.client.models.Gender
import org.openapitools.client.models.ManagerViewModel
import org.openapitools.client.models.ManagersViewModel
import org.openapitools.client.models.UpdateManagerCommand

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
     * @return [Call]<[ManagersViewModel]>
     */
    @GET("api/v1/managers")
    fun apiV1ManagersGet(@Query("Id") id: java.util.UUID? = null, @Query("Fullname") fullname: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("DateOfBirth") dateOfBirth: java.time.LocalDateTime? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null, @Query("hospitalId") hospitalId: java.util.UUID? = null): Call<ManagersViewModel>

    /**
     * Delete hospital manager.
     * Sample request:        DELETE /api/v1/managers/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param managerId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/managers/{managerId}")
    fun apiV1ManagersManagerIdDelete(@Path("managerId") managerId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get hospital manager.
     * Sample request:        GET /api/v1/managers/1
     * Responses:
     *  - 200: Success
     * 
     * @param managerId  
     * @return [Call]<[ManagerViewModel]>
     */
    @GET("api/v1/managers/{managerId}")
    fun apiV1ManagersManagerIdGet(@Path("managerId") managerId: java.util.UUID): Call<ManagerViewModel>

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
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/managers/{managerId}")
    fun apiV1ManagersManagerIdPut(@Path("managerId") managerId: java.util.UUID, @Body updateManagerCommand: UpdateManagerCommand? = null): Call<kotlin.Boolean>

    /**
     * Create hospital manager.
     * Sample request:        POST /api/v1/managers      {          \&quot;userName\&quot;: \&quot;manager\&quot;,          \&quot;email\&quot;: \&quot;manger@icloudhospital.com\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;firstName\&quot;: \&quot;cloud\&quot;,          \&quot;lastName\&quot;: \&quot;manager\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;string\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T15:28:09.897Z\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createManagerCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/managers")
    fun apiV1ManagersPost(@Body createManagerCommand: CreateManagerCommand? = null): Call<java.util.UUID>

}
