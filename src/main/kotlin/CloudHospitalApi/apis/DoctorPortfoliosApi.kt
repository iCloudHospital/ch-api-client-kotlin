package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateDoctorPortfolioCommand
import CloudHospitalApi.models.DoctorPortfolioViewModel
import CloudHospitalApi.models.DoctorPortfoliosViewModel
import CloudHospitalApi.models.UpdateDoctorPortfolioCommand

interface DoctorPortfoliosApi {
    /**
     * Delete DoctorPortfolio
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param portfolioId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/doctors/{doctorId}/portfolios/{portfolioId}")
    suspend fun apiV1DoctorsDoctorIdPortfoliosPortfolioIdDelete(@Path("doctorId") doctorId: java.util.UUID, @Path("portfolioId") portfolioId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get DoctorPortfolio
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param doctorId  
     * @param portfolioId  
     * @return [DoctorPortfolioViewModel]
     */
    @GET("api/v1/doctors/{doctorId}/portfolios/{portfolioId}")
    suspend fun apiV1DoctorsDoctorIdPortfoliosPortfolioIdGet(@Path("doctorId") doctorId: java.util.UUID, @Path("portfolioId") portfolioId: java.util.UUID): Response<DoctorPortfolioViewModel>

    /**
     * Update DoctorPortfolio
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param portfolioId  
     * @param updateDoctorPortfolioCommand  (optional)
     * @return [DoctorPortfolioViewModel]
     */
    @PUT("api/v1/doctors/{doctorId}/portfolios/{portfolioId}")
    suspend fun apiV1DoctorsDoctorIdPortfoliosPortfolioIdPut(@Path("doctorId") doctorId: java.util.UUID, @Path("portfolioId") portfolioId: java.util.UUID, @Body updateDoctorPortfolioCommand: UpdateDoctorPortfolioCommand? = null): Response<DoctorPortfolioViewModel>

    /**
     * Create DoctorPortfolios
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param doctorId  
     * @param createDoctorPortfolioCommand  (optional)
     * @return [DoctorPortfolioViewModel]
     */
    @POST("api/v1/doctors/{doctorId}/portfolios")
    suspend fun apiV1DoctorsDoctorIdPortfoliosPost(@Path("doctorId") doctorId: java.util.UUID, @Body createDoctorPortfolioCommand: CreateDoctorPortfolioCommand? = null): Response<DoctorPortfolioViewModel>

    /**
     * Get All DoctorPortfolios
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param doctorId  (optional)
     * @param doctorName  (optional)
     * @param name  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorPortfoliosViewModel]
     */
    @GET("api/v1/doctors/portfolios")
    suspend fun apiV1DoctorsPortfoliosGet(@Query("Id") id: java.util.UUID? = null, @Query("DoctorId") doctorId: java.util.UUID? = null, @Query("DoctorName") doctorName: kotlin.String? = null, @Query("Name") name: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorPortfoliosViewModel>

}
