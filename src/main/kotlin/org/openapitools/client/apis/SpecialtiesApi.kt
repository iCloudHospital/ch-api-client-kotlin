package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import org.openapitools.client.models.CreateSpecialtyCommand
import org.openapitools.client.models.SpecialtiesViewModel
import org.openapitools.client.models.SpecialtyViewModel
import org.openapitools.client.models.UpdateSpecialtyCommand

interface SpecialtiesApi {
    /**
     * Get all specialties.
     * Sample request:        GET /api/v1/specialties
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param specialtyTypeId  (optional)
     * @param created  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [SpecialtiesViewModel]
     */
    @GET("api/v1/specialties")
    suspend fun apiV1SpecialtiesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("SpecialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<SpecialtiesViewModel>

    /**
     * Create specialty.
     * Sample request:        POST /api/v1/specialties      {          \&quot;name\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;description\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;specialtyType\&quot;: \&quot;Cardiology\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param specialtyTypeId  (optional)
     * @param createSpecialtyCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/specialties")
    suspend fun apiV1SpecialtiesPost(@Query("specialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Body createSpecialtyCommand: CreateSpecialtyCommand? = null): Response<java.util.UUID>

    /**
     * Get specialty by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @return [SpecialtyViewModel]
     */
    @GET("api/v1/specialties/slugs/{slug}")
    suspend fun apiV1SpecialtiesSlugsSlugGet(@Path("slug") slug: kotlin.String): Response<SpecialtyViewModel>

    /**
     * Delete specialty.
     * Sample request:        DELETE /api/v1/specialties/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param specialtyId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/specialties/{specialtyId}")
    suspend fun apiV1SpecialtiesSpecialtyIdDelete(@Path("specialtyId") specialtyId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get specialty.
     * Sample request:        GET /api/v1/specialties/1
     * Responses:
     *  - 200: Success
     * 
     * @param specialtyId  
     * @return [SpecialtyViewModel]
     */
    @GET("api/v1/specialties/{specialtyId}")
    suspend fun apiV1SpecialtiesSpecialtyIdGet(@Path("specialtyId") specialtyId: java.util.UUID): Response<SpecialtyViewModel>

    /**
     * Update specialty
     * Sample request:        PUT /api/v1/specialties/1      {          \&quot;name\&quot;: \&quot;Dilated cardiomyopathy\&quot;,          \&quot;description\&quot;: \&quot;Dilated cardiomyopathy\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param specialtyId  
     * @param updateSpecialtyCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/specialties/{specialtyId}")
    suspend fun apiV1SpecialtiesSpecialtyIdPut(@Path("specialtyId") specialtyId: java.util.UUID, @Body updateSpecialtyCommand: UpdateSpecialtyCommand? = null): Response<kotlin.Boolean>

}
