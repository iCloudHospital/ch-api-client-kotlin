package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreateServiceCategoryCommand
import org.openapitools.client.models.ServiceCategoriesViewModel
import org.openapitools.client.models.ServiceCategoryViewModel
import org.openapitools.client.models.UpdateServiceCategoryCommand

interface ServiceCategoriesApi {
    /**
     * Get all ServiceCategories.
     * Sample request:        GET /api/v1/ServiceCategories
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[ServiceCategoriesViewModel]>
     */
    @GET("api/v1/servicecategories")
    fun apiV1ServicecategoriesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<ServiceCategoriesViewModel>

    /**
     * Create ServiceCategory.
     * Sample request:        POST /api/v1/ServiceCategories      {          \&quot;name\&quot;: \&quot;Adults\&quot;,          \&quot;description\&quot;: \&quot;There are so many “-ologists“ that they can be hard to keep straight. However, this list could be a handy reference. This is not meant to be an exhaustive and all-inclusive list of what a specialist does, but it should provide you with a basic overview.\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createServiceCategoryCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/servicecategories")
    fun apiV1ServicecategoriesPost(@Body createServiceCategoryCommand: CreateServiceCategoryCommand? = null): Call<java.util.UUID>

    /**
     * Delete ServiceCategory.
     * Sample request:        DELETE /api/v1/ServiceCategories/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param serviceCategoryId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/servicecategories/{serviceCategoryId}")
    fun apiV1ServicecategoriesServiceCategoryIdDelete(@Path("serviceCategoryId") serviceCategoryId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get ServiceCategory.
     * Sample request:        GET /api/v1/ServiceCategories/1
     * Responses:
     *  - 200: Success
     * 
     * @param serviceCategoryId  
     * @param languageCode  (optional, default to "")
     * @return [Call]<[ServiceCategoryViewModel]>
     */
    @GET("api/v1/servicecategories/{serviceCategoryId}")
    fun apiV1ServicecategoriesServiceCategoryIdGet(@Path("serviceCategoryId") serviceCategoryId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Call<ServiceCategoryViewModel>

    /**
     * Update ServiceCategory
     * Sample request:        PUT /api/v1/ServiceCategories/1      {          \&quot;name\&quot;: \&quot;Adults\&quot;,          \&quot;description\&quot;: \&quot;There are so many “-ologists“ that they can be hard to keep straight. However, this list could be a handy reference. This is not meant to be an exhaustive and all-inclusive list of what a specialist does, but it should provide you with a basic overview.\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param serviceCategoryId  
     * @param updateServiceCategoryCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/servicecategories/{serviceCategoryId}")
    fun apiV1ServicecategoriesServiceCategoryIdPut(@Path("serviceCategoryId") serviceCategoryId: java.util.UUID, @Body updateServiceCategoryCommand: UpdateServiceCategoryCommand? = null): Call<kotlin.Boolean>

}
