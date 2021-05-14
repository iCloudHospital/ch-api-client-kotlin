package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateDoctorCommand
import CloudHospitalApi.models.DoctorViewModel
import CloudHospitalApi.models.DoctorsViewModel
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.UpdateDoctorCommand

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
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/doctors/{doctorId}")
    suspend fun apiV1DoctorsDoctorIdDelete(@Path("doctorId") doctorId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get hospital doctor.
     * Sample request:        GET /api/v1/doctors/1
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  
     * @param languageCode  (optional, default to "")
     * @return [DoctorViewModel]
     */
    @GET("api/v1/doctors/{doctorId}")
    suspend fun apiV1DoctorsDoctorIdGet(@Path("doctorId") doctorId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<DoctorViewModel>

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
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/doctors/{doctorId}")
    suspend fun apiV1DoctorsDoctorIdPut(@Path("doctorId") doctorId: java.util.UUID, @Body updateDoctorCommand: UpdateDoctorCommand? = null): Response<kotlin.Boolean>

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
     * @param languageCode  (optional)
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
     * @return [DoctorsViewModel]
     */
    @GET("api/v1/doctors")
    suspend fun apiV1DoctorsGet(@Query("CountryId") countryId: java.util.UUID? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("ConsultationEnabled") consultationEnabled: kotlin.Boolean? = null, @Query("ExceptDoctorId") exceptDoctorId: java.util.UUID? = null, @Query("ExceptDoctorIds") exceptDoctorIds: kotlin.collections.List<java.util.UUID>? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("Id") id: java.util.UUID? = null, @Query("Fullname") fullname: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Gender") gender: Gender? = null, @Query("DateOfBirth") dateOfBirth: java.time.LocalDateTime? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<DoctorsViewModel>

    /**
     * Create hospital doctor.
     * Sample request:        POST /api/v1/doctors      {          \&quot;userName\&quot;: \&quot;cloudDoctor\&quot;,          \&quot;email\&quot;: \&quot;doctor@icloudhospital.com\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;firstName\&quot;: \&quot;cloud\&quot;,          \&quot;lastName\&quot;: \&quot;doctor\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;photoThumbnail\&quot;: \&quot;string\&quot;,          \&quot;gender\&quot;: \&quot;NotSpecified\&quot;,          \&quot;dateOfBirth\&quot;: \&quot;2020-02-22T17:57:32.048Z\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createDoctorCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/doctors")
    suspend fun apiV1DoctorsPost(@Body createDoctorCommand: CreateDoctorCommand? = null): Response<java.util.UUID>

    /**
     * Get hospital doctor by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @param languageCode  (optional, default to "")
     * @return [DoctorViewModel]
     */
    @GET("api/v1/doctors/slugs/{slug}")
    suspend fun apiV1DoctorsSlugsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null): Response<DoctorViewModel>

}
