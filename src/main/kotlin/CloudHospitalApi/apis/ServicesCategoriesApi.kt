package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ServiceCategoriesModel
import CloudHospitalApi.models.ServiceCategoryModel

interface ServicesCategoriesApi {
    /**
     * Get all ServiceCategories.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ServiceCategoriesModel]
     */
    @GET("api/v2/servicescategories")
    suspend fun apiV2ServicescategoriesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ServiceCategoriesModel>

    /**
     * Get ServiceCategory.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Not Found
     *  - 0: Error
     * 
     * @param serviceCategoryId  
     * @return [ServiceCategoryModel]
     */
    @GET("api/v2/servicescategories/{serviceCategoryId}")
    suspend fun apiV2ServicescategoriesServiceCategoryIdGet(@Path("serviceCategoryId") serviceCategoryId: java.util.UUID): Response<ServiceCategoryModel>

}
