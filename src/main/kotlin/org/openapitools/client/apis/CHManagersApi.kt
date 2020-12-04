package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CHManagerViewModel
import org.openapitools.client.models.CHManagersViewModel
import org.openapitools.client.models.CreateCHManagerCommand
import org.openapitools.client.models.Gender
import org.openapitools.client.models.UpdateCHManagerCommand

interface CHManagersApi {
    /**
     * Delete cloud hospital manager.
     * Smaple request:        DELETE /api/v1/chmanagers/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param chManagerId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/chmanagers/{chManagerId}")
    fun apiV1ChmanagersChManagerIdDelete(@Path("chManagerId") chManagerId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get cloud hospital manager.
     * Sample request:        GET /api/v1/chmanagers/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param managerId  
     * @param chManagerId  
     * @return [Call]<[CHManagerViewModel]>
     */
    @GET("api/v1/chmanagers/{chManagerId}")
    fun apiV1ChmanagersChManagerIdGet(@Path("managerId") managerId: java.util.UUID, @Path("chManagerId") chManagerId: kotlin.String): Call<CHManagerViewModel>

    /**
     * Update cloud hospital manager.
     * Sample request:        PUT /api/v1/chmanagers/1      {          \&quot;firstName\&quot;: \&quot;cloud\&quot;,          \&quot;lastName\&quot;: \&quot;manager\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [          {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;              }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param chManagerId  
     * @param updateCHManagerCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/chmanagers/{chManagerId}")
    fun apiV1ChmanagersChManagerIdPut(@Path("chManagerId") chManagerId: java.util.UUID, @Body updateCHManagerCommand: UpdateCHManagerCommand? = null): Call<kotlin.Boolean>

    /**
     * Get cloud hospital managers.
     * Sample request:        GET /api/v1/chmanagers      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;chmanager\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
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
     * @return [Call]<[CHManagersViewModel]>
     */
    @GET("api/v1/chmanagers")
    fun apiV1ChmanagersGet(@Query("Id") id: java.util.UUID? = null, @Query("Fullname") fullname: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("DateOfBirth") dateOfBirth: java.time.LocalDateTime? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<CHManagersViewModel>

    /**
     * Create cloud hospital manager.
     * Sample request:        POST /api/v1/chmanagers      {          \&quot;userName\&quot;: \&quot;chmanager\&quot;,          \&quot;email\&quot;: \&quot;chmanger@icloudhospital.com\&quot;,          \&quot;firstName\&quot;: \&quot;cloud\&quot;,          \&quot;lastName\&quot;: \&quot;manager\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;string\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T15:28:09.897Z\&quot;,          \&quot;locations\&quot;: [             {             \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,             \&quot;latitude\&quot;: 0,             \&quot;longitude\&quot;: 0,             \&quot;country\&quot;: \&quot;string\&quot;,             \&quot;state\&quot;: \&quot;string\&quot;,             \&quot;county\&quot;: \&quot;string\&quot;,             \&quot;city\&quot;: \&quot;string\&quot;,             \&quot;zipCode\&quot;: \&quot;string\&quot;,             \&quot;address\&quot;: \&quot;string\&quot;             }          ]       }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createCHManagerCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/chmanagers")
    fun apiV1ChmanagersPost(@Body createCHManagerCommand: CreateCHManagerCommand? = null): Call<java.util.UUID>

}
