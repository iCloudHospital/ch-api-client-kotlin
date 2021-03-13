package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreatePartnerCommand
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.PartnerViewModel
import CloudHospitalApi.models.PartnersViewModel
import CloudHospitalApi.models.UpdatePartnerCommand

interface PartnersApi {
    /**
     * Get all partners.
     * Sample request:        GET /api/v1/partners      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;patner\&quot;      }
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
     * @return [PartnersViewModel]
     */
    @GET("api/v1/partners")
    suspend fun apiV1PartnersGet(@Query("Id") id: java.util.UUID? = null, @Query("Fullname") fullname: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("DateOfBirth") dateOfBirth: java.time.OffsetDateTime? = null, @Query("Created") created: java.time.OffsetDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.OffsetDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<PartnersViewModel>

    /**
     * Delete patner.
     * Sample request:        DELETE /api/v1/partners/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param partnerId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/partners/{partnerId}")
    suspend fun apiV1PartnersPartnerIdDelete(@Path("partnerId") partnerId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get partner.
     * Sample request:        GET /api/v1/patners/1
     * Responses:
     *  - 200: Success
     * 
     * @param partnerId  
     * @return [PartnerViewModel]
     */
    @GET("api/v1/partners/{partnerId}")
    suspend fun apiV1PartnersPartnerIdGet(@Path("partnerId") partnerId: java.util.UUID): Response<PartnerViewModel>

    /**
     * Update partner.
     * Sample request:        PUT /api/v1/patners/1      {          firstName\&quot;: \&quot;string\&quot;,          \&quot;lastName\&quot;: \&quot;string\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param partnerId  
     * @param updatePartnerCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/partners/{partnerId}")
    suspend fun apiV1PartnersPartnerIdPut(@Path("partnerId") partnerId: java.util.UUID, @Body updatePartnerCommand: UpdatePartnerCommand? = null): Response<kotlin.Boolean>

    /**
     * Create partner.
     * Sample request:        POST /api/v1/partners      {          \&quot;userName\&quot;: \&quot;string\&quot;,          \&quot;email\&quot;: \&quot;string\&quot;,          \&quot;firstName\&quot;: \&quot;string\&quot;,          \&quot;lastName\&quot;: \&quot;string\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;string\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T18:04:18.025Z\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createPartnerCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/partners")
    suspend fun apiV1PartnersPost(@Body createPartnerCommand: CreatePartnerCommand? = null): Response<java.util.UUID>

}
