package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import org.openapitools.client.models.CreateHospitalCommand
import org.openapitools.client.models.HospitalViewModel
import org.openapitools.client.models.HospitalsViewModel
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.UpdateHospitalCommand

interface HospitalsApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param countryId  (optional)
     * @param created  (optional)
     * @param marketingType  (optional)
     * @param specialtyTypeId  (optional)
     * @param specialtyId  (optional)
     * @param serviceId  (optional)
     * @param exceptHospitalId  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [HospitalsViewModel]
     */
    @GET("api/v1/hospitals/current")
    suspend fun apiV1HospitalsCurrentGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("ServiceId") serviceId: java.util.UUID? = null, @Query("ExceptHospitalId") exceptHospitalId: java.util.UUID? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<HospitalsViewModel>

    /**
     * Get all hospitals.
     * Sample request:        GET /api/v1/hospitals      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;Samsung\&quot;      }
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param countryId  (optional)
     * @param created  (optional)
     * @param marketingType  (optional)
     * @param specialtyTypeId  (optional)
     * @param specialtyId  (optional)
     * @param serviceId  (optional)
     * @param exceptHospitalId  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [HospitalsViewModel]
     */
    @GET("api/v1/hospitals")
    suspend fun apiV1HospitalsGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("ServiceId") serviceId: java.util.UUID? = null, @Query("ExceptHospitalId") exceptHospitalId: java.util.UUID? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<HospitalsViewModel>

    /**
     * Delete hospital.
     * Sample request:        DELETE /api/v1/hospitals/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/hospitals/{hospitalId}")
    suspend fun apiV1HospitalsHospitalIdDelete(@Path("hospitalId") hospitalId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get hospita.
     * Sample request:        GET /api/v1/hospitals/1
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @return [HospitalViewModel]
     */
    @GET("api/v1/hospitals/{hospitalId}")
    suspend fun apiV1HospitalsHospitalIdGet(@Path("hospitalId") hospitalId: java.util.UUID): Response<HospitalViewModel>

    /**
     * Update hospital.
     * Sameple request:        PUT /api/v1/hospitals      {          \&quot;overview\&quot;: \&quot;Overview of Samsung Medical Center\&quot;,          \&quot;bedsCount\&quot;: 2436,          \&quot;operationsPerYear\&quot;: 44,          \&quot;foundationYear\&quot;: 2012,          \&quot;departmentsCount\&quot;: 200,          \&quot;medicalStaffCount\&quot;: 1200,      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param updateHospitalCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/hospitals/{hospitalId}")
    suspend fun apiV1HospitalsHospitalIdPut(@Path("hospitalId") hospitalId: java.util.UUID, @Body updateHospitalCommand: UpdateHospitalCommand? = null): Response<kotlin.Boolean>

    /**
     * Create a hospital.
     * Sample request:        POST /api/v1/hospitals      {          \&quot;name\&quot;: \&quot;Samsung Medical Center\&quot;,          \&quot;description\&quot;: \&quot;Comprehensive Cancer Center in Seoul, South Korea is nationally ranked in 1 adult specialty.\&quot;,          \&quot;logo\&quot;: \&quot;http://www.samsunghospital.com/home/main/index.do\&quot;,          \&quot;overview\&quot;: \&quot;Overview of Samsung Medical Center\&quot;,          \&quot;bedsCount\&quot;: 1436,          \&quot;operationsPerYear\&quot;: 34,          \&quot;foundationYear\&quot;: 2012,          \&quot;departmentsCount\&quot;: 20,          \&quot;medicalStaffCount\&quot;: 600,          \&quot;countryId\&quot;: 1,          \&quot;awards\&quot;: [            {              \&quot;name\&quot;: \&quot;Award1\&quot;,              \&quot;image\&quot;: \&quot;string\&quot;,              \&quot;date\&quot;: \&quot;2020-02-05T09:29:19.240Z\&quot;            },            {              \&quot;name\&quot;: \&quot;Award2\&quot;,              \&quot;image\&quot;: \&quot;string\&quot;,              \&quot;date\&quot;: \&quot;2020-02-05T09:29:19.240Z\&quot;            }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/imagecontainer/SamsungMedicalCenter.jpg\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/thumbnailcontainer/SamsungMedicalCenter.jpg\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            },            {              \&quot;mediaType\&quot;: \&quot;Video\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 1            }          ],          \&quot;location\&quot;: {            \&quot;latitude\&quot;: 37.4881568,            \&quot;longitude\&quot;: 127.0855952,            \&quot;country\&quot;: \&quot;Korea\&quot;,            \&quot;state\&quot;: \&quot;string\&quot;,            \&quot;county\&quot;: \&quot;Gangnamgu\&quot;,            \&quot;city\&quot;: \&quot;Seoul\&quot;,            \&quot;zipCode\&quot;: \&quot;12345\&quot;,            \&quot;address\&quot;: \&quot;Il-won ro 81\&quot;          }      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createHospitalCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/hospitals")
    suspend fun apiV1HospitalsPost(@Body createHospitalCommand: CreateHospitalCommand? = null): Response<java.util.UUID>

    /**
     * Get hospital by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @return [HospitalViewModel]
     */
    @GET("api/v1/hospitals/slugs/{slug}")
    suspend fun apiV1HospitalsSlugsSlugGet(@Path("slug") slug: kotlin.String): Response<HospitalViewModel>

}
