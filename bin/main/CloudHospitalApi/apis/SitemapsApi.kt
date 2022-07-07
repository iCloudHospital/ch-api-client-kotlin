package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.SitemapInformationViewModel
import CloudHospitalApi.models.SitemapViewModel

interface SitemapsApi {
    /**
     * Get articles sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/articles")
    suspend fun apiV1SitemapsArticlesGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

    /**
     * Get contributors sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/contributors")
    suspend fun apiV1SitemapsContributorsGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

    /**
     * Get countries sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/countries")
    suspend fun apiV1SitemapsCountriesGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

    /**
     * Get deals sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/deals")
    suspend fun apiV1SitemapsDealsGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

    /**
     * Get departments sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/departments")
    suspend fun apiV1SitemapsDepartmentsGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

    /**
     * Get doctors sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/doctors")
    suspend fun apiV1SitemapsDoctorsGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

    /**
     * Get faq categories sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/faqcategories")
    suspend fun apiV1SitemapsFaqcategoriesGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

    /**
     * Get faqs sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/faqs")
    suspend fun apiV1SitemapsFaqsGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

    /**
     * Get sitemap content pages information
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param limit  (optional)
     * @return [SitemapInformationViewModel]
     */
    @GET("api/v1/sitemaps")
    suspend fun apiV1SitemapsGet(@Query("Limit") limit: kotlin.Int? = null): Response<SitemapInformationViewModel>

    /**
     * Get hospitals sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/hospitals")
    suspend fun apiV1SitemapsHospitalsGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

    /**
     * Get procedures sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/procedures")
    suspend fun apiV1SitemapsProceduresGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

    /**
     * Get services sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/services")
    suspend fun apiV1SitemapsServicesGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

    /**
     * Get specialties sitemap raw data
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [SitemapViewModel]
     */
    @GET("api/v1/sitemaps/specialties")
    suspend fun apiV1SitemapsSpecialtiesGet(@Query("Page") page: kotlin.Int? = null, @Query("Limit") limit: kotlin.Int? = null): Response<SitemapViewModel>

}
