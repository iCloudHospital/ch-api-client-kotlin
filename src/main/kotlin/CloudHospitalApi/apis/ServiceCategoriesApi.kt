package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateServiceCategoryCommand
import CloudHospitalApi.models.ServiceCategoriesViewModel
import CloudHospitalApi.models.ServiceCategoryViewModel
import CloudHospitalApi.models.UpdateServiceCategoryCommand

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
     * @return [ServiceCategoriesViewModel]
     */
    @GET("api/v1/servicecategories")
    suspend fun apiV1ServicecategoriesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ServiceCategoriesViewModel>

    /**
     * Create ServiceCategory.
     * Sample request:        POST /api/v1/ServiceCategories      {          \&quot;name\&quot;: \&quot;Adults\&quot;,          \&quot;description\&quot;: \&quot;There are so many “-ologists“ that they can be hard to keep straight. However, this list could be a handy reference. This is not meant to be an exhaustive and all-inclusive list of what a specialist does, but it should provide you with a basic overview.\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createServiceCategoryCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/servicecategories")
    suspend fun apiV1ServicecategoriesPost(@Body createServiceCategoryCommand: CreateServiceCategoryCommand? = null): Response<java.util.UUID>

    /**
     * Delete ServiceCategory.
     * Sample request:        DELETE /api/v1/ServiceCategories/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param serviceCategoryId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/servicecategories/{serviceCategoryId}")
    suspend fun apiV1ServicecategoriesServiceCategoryIdDelete(@Path("serviceCategoryId") serviceCategoryId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get ServiceCategory.
     * Sample request:        GET /api/v1/ServiceCategories/1
     * Responses:
     *  - 200: Success
     * 
     * @param serviceCategoryId  
     * @param languageCode  (optional, default to "")
     * @return [ServiceCategoryViewModel]
     */
    @GET("api/v1/servicecategories/{serviceCategoryId}")
    suspend fun apiV1ServicecategoriesServiceCategoryIdGet(@Path("serviceCategoryId") serviceCategoryId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<ServiceCategoryViewModel>

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
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/servicecategories/{serviceCategoryId}")
    suspend fun apiV1ServicecategoriesServiceCategoryIdPut(@Path("serviceCategoryId") serviceCategoryId: java.util.UUID, @Body updateServiceCategoryCommand: UpdateServiceCategoryCommand? = null): Response<kotlin.Boolean>

}
