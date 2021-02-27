package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import org.openapitools.client.models.CreateServiceCommand
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.Procedure
import org.openapitools.client.models.ServiceViewModel
import org.openapitools.client.models.ServicesViewModel
import org.openapitools.client.models.UpdateServiceCommand
import org.openapitools.client.models.UpdateServiceSequenceCommand

interface ServicesApi {
    /**
     * Create service.
     * Sample request:        POST /api/v1/hospitals/1/specialties/1/services      {          \&quot;name\&quot;: \&quot;Heart check up\&quot;,          \&quot;description\&quot;: \&quot;Asan Hospital (Asan Medical Center) is the largest multidisciplinary medical center in South Korea, which can serve 2,700 patients at once.The key specialties in the hospital are organ transplant, oncology, cardiology, and cardiac surgery.Almost half of all heart transplants in South Korea are carried out (45%) at Asan.The success of organ transplants ranges from 90%. Every day, 11,800 outpatients and 2,550 inpatients are treated in Asan Hospital. Medical tourists from the USA, China, the UAE, Russia, Kazakhstan, and Mongolia choose Asan Hospital.\&quot;,          \&quot;minPrice\&quot;: 2235,          \&quot;maxPrice\&quot;: 2566,          \&quot;priceReuqest\&quot;: false,          \&quot;procedure\&quot;: \&quot;Treatment\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @param createServiceCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services")
    suspend fun apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesPost(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID, @Body createServiceCommand: CreateServiceCommand? = null): Response<java.util.UUID>

    /**
     * Delete service.
     * Sample request:        DELETE /api/v1/hospitals/1/specialties/1/services/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @param serviceId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId}")
    suspend fun apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID, @Path("serviceId") serviceId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get service.
     * Sample request:        GET /api/v1/hospitals/1/specialties/1/services/1
     * Responses:
     *  - 200: Success
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @param serviceId  
     * @return [ServiceViewModel]
     */
    @GET("api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId}")
    suspend fun apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID, @Path("serviceId") serviceId: java.util.UUID): Response<ServiceViewModel>

    /**
     * Update service.
     * Sample request:        PUT /api/v1/hospitals/1/specialties/1/services/1      {          \&quot;name\&quot;: \&quot;Extended analysis of blood\&quot;,          \&quot;description\&quot;: \&quot;Extended analysis of blood description.\&quot;,          \&quot;minPrice\&quot;: 1000,          \&quot;maxPrice\&quot;: 2600,          \&quot;priceReuqest\&quot;: false      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @param serviceId  
     * @param updateServiceCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/services/{serviceId}")
    suspend fun apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesServiceIdPut(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID, @Path("serviceId") serviceId: java.util.UUID, @Body updateServiceCommand: UpdateServiceCommand? = null): Response<kotlin.Boolean>

    /**
     * Update service sequence.
     * Smaple request:        PUT /api/v1/hospitals/1/specialties/1/servicesquence      {          \&quot;serviceSequence\&quot;: [1, 3, 5]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param specialtyId  
     * @param updateServiceSequenceCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/hospitals/{hospitalId}/specialties/{specialtyId}/servicesquence")
    suspend fun apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdServicesquencePut(@Path("hospitalId") hospitalId: java.util.UUID, @Path("specialtyId") specialtyId: java.util.UUID, @Body updateServiceSequenceCommand: UpdateServiceSequenceCommand? = null): Response<kotlin.Boolean>

    /**
     * Get all services.
     * Sample request:        GET /api/v1/hospitals/services
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param hospitalSlug  (optional)
     * @param specialtyId  (optional)
     * @param specialtyTypeId  (optional)
     * @param specialtyTypeName  (optional)
     * @param marketingType  (optional)
     * @param procedure  (optional)
     * @param created  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [ServicesViewModel]
     */
    @GET("api/v1/hospitals/services")
    suspend fun apiV1HospitalsServicesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("HospitalSlug") hospitalSlug: kotlin.String? = null, @Query("SpecialtyId") specialtyId: java.util.UUID? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("SpecialtyTypeName") specialtyTypeName: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("Procedure") procedure: Procedure? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<ServicesViewModel>

    /**
     * Get service by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @return [ServiceViewModel]
     */
    @GET("api/v1/hospitals/services/slugs/{slug}")
    suspend fun apiV1HospitalsServicesSlugsSlugGet(@Path("slug") slug: kotlin.String): Response<ServiceViewModel>

}
