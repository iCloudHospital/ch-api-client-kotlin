package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CHAdminViewModel
import org.openapitools.client.models.CHAdminsViewModel
import org.openapitools.client.models.CreateCHAdminCommand
import org.openapitools.client.models.Gender
import org.openapitools.client.models.UpdateCHAdminCommand

interface CHAdminsApi {
    /**
     * Delete cloud hospital admin user.
     * Sample request:        DELETE /api/v1/chadmins/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param chAdminId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/chadmins/{chAdminId}")
    fun apiV1ChadminsChAdminIdDelete(@Path("chAdminId") chAdminId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get cloud hospital admin user by id.
     * Sample request:        GET /api/v1/chadmins/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param chAdminId  
     * @return [Call]<[CHAdminViewModel]>
     */
    @GET("api/v1/chadmins/{chAdminId}")
    fun apiV1ChadminsChAdminIdGet(@Path("chAdminId") chAdminId: java.util.UUID): Call<CHAdminViewModel>

    /**
     * Update cloud hospital admin user.
     * Sample request:        PUT /api/v1/chadmins/1      {          \&quot;email\&quot;: \&quot;adminupdate@icloudhospital.com\&quot;,          \&quot;firstName\&quot;: \&quot;Cloud\&quot;,          \&quot;lastName\&quot;: \&quot;Hospital\&quot;,          \&quot;photo\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T09:09:19.082Z\&quot;,          \&quot;locations\&quot;: [              {                  \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,                  \&quot;latitude\&quot;: 0,                  \&quot;longitude\&quot;: 0,                  \&quot;country\&quot;: \&quot;string\&quot;,                  \&quot;state\&quot;: \&quot;string\&quot;,                  \&quot;county\&quot;: \&quot;string\&quot;,                  \&quot;city\&quot;: \&quot;string\&quot;,                  \&quot;zipCode\&quot;: \&quot;string\&quot;,                  \&quot;address\&quot;: \&quot;string\&quot;              }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param chAdminId  
     * @param updateCHAdminCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/chadmins/{chAdminId}")
    fun apiV1ChadminsChAdminIdPut(@Path("chAdminId") chAdminId: java.util.UUID, @Body updateCHAdminCommand: UpdateCHAdminCommand? = null): Call<kotlin.Boolean>

    /**
     * Get cloud hospital admin users.
     * Sample request:        GET /api/v1/chadmin      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;admin\&quot;      }
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
     * @return [Call]<[CHAdminsViewModel]>
     */
    @GET("api/v1/chadmins")
    fun apiV1ChadminsGet(@Query("Id") id: java.util.UUID? = null, @Query("Fullname") fullname: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("DateOfBirth") dateOfBirth: java.time.LocalDateTime? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<CHAdminsViewModel>

    /**
     * Create cloud hospital admin user.
     * Sample request:        POST /api/v1/chadmins      {          \&quot;firstName\&quot;: \&quot;Cloud\&quot;,          \&quot;lastName\&quot;: \&quot;Hospital\&quot;,          \&quot;photo\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/assets/Cloud_Hospital_Logo_blue.png\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T09:09:19.082Z\&quot;,          \&quot;locations\&quot;: [              {                  \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,                  \&quot;latitude\&quot;: 0,                  \&quot;longitude\&quot;: 0,                  \&quot;country\&quot;: \&quot;string\&quot;,                  \&quot;state\&quot;: \&quot;string\&quot;,                  \&quot;county\&quot;: \&quot;string\&quot;,                  \&quot;city\&quot;: \&quot;string\&quot;,                  \&quot;zipCode\&quot;: \&quot;string\&quot;,                  \&quot;address\&quot;: \&quot;string\&quot;              }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createCHAdminCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/chadmins")
    fun apiV1ChadminsPost(@Body createCHAdminCommand: CreateCHAdminCommand? = null): Call<java.util.UUID>

}
