package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.HospitalsViewModel
import CloudHospitalApi.models.PlanViewModel
import CloudHospitalApi.models.PlansViewModel

interface PlansApi {
    /**
     * Get all plans.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [PlansViewModel]
     */
    @GET("api/v1/plans")
    suspend fun apiV1PlansGet(@Query("Id") id: java.util.UUID? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<PlansViewModel>

    /**
     * Get plan.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param planId  
     * @return [PlanViewModel]
     */
    @GET("api/v1/plans/{planId}")
    suspend fun apiV1PlansPlanIdGet(@Path("planId") planId: java.util.UUID): Response<PlanViewModel>

    /**
     * Get all partner hospitals
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param planId  
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalsViewModel]
     */
    @GET("api/v1/plans/{planId}/hospitals")
    suspend fun apiV1PlansPlanIdHospitalsGet(@Path("planId") planId: java.util.UUID, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalsViewModel>

}
