package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import org.openapitools.client.models.CreateSpecialtyTypeCommand
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.SpecialtyTypeViewModel
import org.openapitools.client.models.SpecialtyTypesViewModel
import org.openapitools.client.models.UpdateSpecialtyTypeCommand

interface SpecialtyTypesApi {
    /**
     * Get all SpecialtyTypes.
     * Sample request:        GET /api/v1/SpecialtyTypes
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param marketingType  (optional)
     * @param created  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [SpecialtyTypesViewModel]
     */
    @GET("api/v1/specialtytypes")
    suspend fun apiV1SpecialtytypesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("Created") created: java.time.LocalDateTime? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<SpecialtyTypesViewModel>

    /**
     * Create specialtyType.
     * Sample request:        POST /api/v1/SpecialtyTypes      {          \&quot;name\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;description\&quot;: \&quot;Coronary artery disease\&quot;,          \&quot;specialtyTypeType\&quot;: \&quot;Cardiology\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param specialtyTypeId  (optional)
     * @param createSpecialtyTypeCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/specialtytypes")
    suspend fun apiV1SpecialtytypesPost(@Query("specialtyTypeId") specialtyTypeId: java.util.UUID? = null, @Body createSpecialtyTypeCommand: CreateSpecialtyTypeCommand? = null): Response<java.util.UUID>

    /**
     * Get specialtyType by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @return [SpecialtyTypeViewModel]
     */
    @GET("api/v1/specialtytypes/slugs/{slug}")
    suspend fun apiV1SpecialtytypesSlugsSlugGet(@Path("slug") slug: kotlin.String): Response<SpecialtyTypeViewModel>

    /**
     * Delete specialtyType.
     * Sample request:        DELETE /api/v1/SpecialtyTypes/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param specialtyTypeId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/specialtytypes/{specialtyTypeId}")
    suspend fun apiV1SpecialtytypesSpecialtyTypeIdDelete(@Path("specialtyTypeId") specialtyTypeId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get specialtyType.
     * Sample request:        GET /api/v1/SpecialtyTypes/1
     * Responses:
     *  - 200: Success
     * 
     * @param specialtyTypeId  
     * @return [SpecialtyTypeViewModel]
     */
    @GET("api/v1/specialtytypes/{specialtyTypeId}")
    suspend fun apiV1SpecialtytypesSpecialtyTypeIdGet(@Path("specialtyTypeId") specialtyTypeId: java.util.UUID): Response<SpecialtyTypeViewModel>

    /**
     * Update specialtyType
     * Sample request:        PUT /api/v1/SpecialtyTypes/1      {          \&quot;name\&quot;: \&quot;Dilated cardiomyopathy\&quot;,          \&quot;description\&quot;: \&quot;Dilated cardiomyopathy\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param specialtyTypeId  
     * @param updateSpecialtyTypeCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/specialtytypes/{specialtyTypeId}")
    suspend fun apiV1SpecialtytypesSpecialtyTypeIdPut(@Path("specialtyTypeId") specialtyTypeId: java.util.UUID, @Body updateSpecialtyTypeCommand: UpdateSpecialtyTypeCommand? = null): Response<kotlin.Boolean>

}
