package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreateDoctorCommand
import org.openapitools.client.models.DoctorViewModel
import org.openapitools.client.models.DoctorsViewModel
import org.openapitools.client.models.Gender
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.UpdateDoctorCommand

interface DoctorsApi {
    /**
     * Delete doctor.
     * Sample request:        DELETE /api/v1/doctors/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/doctors/{doctorId}")
    fun apiV1DoctorsDoctorIdDelete(@Path("doctorId") doctorId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get hospital doctor.
     * Sample request:        GET /api/v1/doctors/1
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  
     * @return [Call]<[DoctorViewModel]>
     */
    @GET("api/v1/doctors/{doctorId}")
    fun apiV1DoctorsDoctorIdGet(@Path("doctorId") doctorId: java.util.UUID): Call<DoctorViewModel>

    /**
     * Update hospital doctor.
     * Sample request:        PUT /api/v1/doctors/1      {          \&quot;firstName\&quot;: \&quot;string\&quot;,          \&quot;lastName\&quot;: \&quot;string\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param updateDoctorCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/doctors/{doctorId}")
    fun apiV1DoctorsDoctorIdPut(@Path("doctorId") doctorId: java.util.UUID, @Body updateDoctorCommand: UpdateDoctorCommand? = null): Call<kotlin.Boolean>

    /**
     * Get all hospital doctors.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param countryId  (optional)
     * @param hospitalId  (optional)
     * @param marketingType  (optional)
     * @param specialtyId  (optional)
     * @param specialtyTypeId  (optional)
     * @param consultationEnabled  (optional)
     * @param exceptDoctorId  (optional)
     * @param exceptDoctorIds  (optional)
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
     * @return [Call]<[DoctorsViewModel]>
     */
    @GET("api/v1/doctors")
    fun apiV1DoctorsGet(@Query("CountryId") countryId: java.util.UUID? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("ConsultationEnabled") consultationEnabled: kotlin.Boolean? = null, @Query("ExceptDoctorId") exceptDoctorId: java.util.UUID? = null, @Query("ExceptDoctorIds") exceptDoctorIds: kotlin.collections.List<java.util.UUID>? = null, @Query("Id") id: java.util.UUID? = null, @Query("Fullname") fullname: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("DateOfBirth") dateOfBirth: java.time.LocalDateTime? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<DoctorsViewModel>

    /**
     * Create hospital doctor.
     * Sample request:        POST /api/v1/doctors      {          \&quot;userName\&quot;: \&quot;cloudDoctor\&quot;,          \&quot;email\&quot;: \&quot;doctor@icloudhospital.com\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;firstName\&quot;: \&quot;cloud\&quot;,          \&quot;lastName\&quot;: \&quot;doctor\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;string\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T17:57:32.048Z\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createDoctorCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/doctors")
    fun apiV1DoctorsPost(@Body createDoctorCommand: CreateDoctorCommand? = null): Call<java.util.UUID>

    /**
     * Get hospital doctor by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @return [Call]<[DoctorViewModel]>
     */
    @GET("api/v1/doctors/slugs/{slug}")
    fun apiV1DoctorsSlugsSlugGet(@Path("slug") slug: kotlin.String): Call<DoctorViewModel>

}
