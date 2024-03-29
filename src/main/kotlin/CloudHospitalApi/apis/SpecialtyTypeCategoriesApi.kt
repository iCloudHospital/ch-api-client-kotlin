package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateSpecialtyTypeCategoryCommand
import CloudHospitalApi.models.SpecialtyTypeCategoriesViewModel
import CloudHospitalApi.models.SpecialtyTypeCategoryViewModel
import CloudHospitalApi.models.UpdateSpecialtyTypeCategoryCommand

interface SpecialtyTypeCategoriesApi {
    /**
     * Get all SpecialtyTypeCategories.
     * Sample request:        GET /api/v1/SpecialtyTypeCategories
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [SpecialtyTypeCategoriesViewModel]
     */
    @GET("api/v1/specialtytypecategories")
    suspend fun apiV1SpecialtytypecategoriesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<SpecialtyTypeCategoriesViewModel>

    /**
     * Create specialtyTypeCategory.
     * Sample request:        POST /api/v1/SpecialtyTypeCategories      {          \&quot;name\&quot;: \&quot;Adults\&quot;,          \&quot;description\&quot;: \&quot;There are so many “-ologists“ that they can be hard to keep straight. However, this list could be a handy reference. This is not meant to be an exhaustive and all-inclusive list of what a specialist does, but it should provide you with a basic overview.\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createSpecialtyTypeCategoryCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/specialtytypecategories")
    suspend fun apiV1SpecialtytypecategoriesPost(@Body createSpecialtyTypeCategoryCommand: CreateSpecialtyTypeCategoryCommand? = null): Response<java.util.UUID>

    /**
     * Delete specialtyTypeCategory.
     * Sample request:        DELETE /api/v1/SpecialtyTypeCategories/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param specialtyTypeCategoryId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/specialtytypecategories/{specialtyTypeCategoryId}")
    suspend fun apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdDelete(@Path("specialtyTypeCategoryId") specialtyTypeCategoryId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get specialtyTypeCategory.
     * Sample request:        GET /api/v1/SpecialtyTypeCategories/1
     * Responses:
     *  - 200: Success
     * 
     * @param specialtyTypeCategoryId  
     * @param languageCode  (optional, default to "")
     * @return [SpecialtyTypeCategoryViewModel]
     */
    @GET("api/v1/specialtytypecategories/{specialtyTypeCategoryId}")
    suspend fun apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdGet(@Path("specialtyTypeCategoryId") specialtyTypeCategoryId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<SpecialtyTypeCategoryViewModel>

    /**
     * Update specialtyTypeCategory
     * Sample request:        PUT /api/v1/SpecialtyTypeCategories/1      {          \&quot;name\&quot;: \&quot;Adults\&quot;,          \&quot;description\&quot;: \&quot;There are so many “-ologists“ that they can be hard to keep straight. However, this list could be a handy reference. This is not meant to be an exhaustive and all-inclusive list of what a specialist does, but it should provide you with a basic overview.\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param specialtyTypeCategoryId  
     * @param updateSpecialtyTypeCategoryCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/specialtytypecategories/{specialtyTypeCategoryId}")
    suspend fun apiV1SpecialtytypecategoriesSpecialtyTypeCategoryIdPut(@Path("specialtyTypeCategoryId") specialtyTypeCategoryId: java.util.UUID, @Body updateSpecialtyTypeCategoryCommand: UpdateSpecialtyTypeCategoryCommand? = null): Response<kotlin.Boolean>

}
