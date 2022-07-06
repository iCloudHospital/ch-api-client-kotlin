package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.PlanHospitalModel
import CloudHospitalApi.models.PlanHospitalsModel
import CloudHospitalApi.models.PlanModel
import CloudHospitalApi.models.PlansModel

interface PlansApi {
    /**
     * Get all plans.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [PlansModel]
     */
    @GET("api/v2/plans")
    suspend fun apiV2PlansGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<PlansModel>

    /**
     * Get plan.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Not Found
     *  - 0: Error
     * 
     * @param planId  
     * @return [PlanModel]
     */
    @GET("api/v2/plans/{planId}")
    suspend fun apiV2PlansPlanIdGet(@Path("planId") planId: java.util.UUID): Response<PlanModel>

    /**
     * Get all plan hospital.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param planId  
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [PlanHospitalsModel]
     */
    @GET("api/v2/plans/{planId}/hospitals")
    suspend fun apiV2PlansPlanIdHospitalsGet(@Path("planId") planId: java.util.UUID, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<PlanHospitalsModel>

    /**
     * Get plan hospital.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param planId  
     * @param hospitalId  
     * @return [PlanHospitalModel]
     */
    @GET("api/v2/plans/{planId}/hospitals/{hospitalId}")
    suspend fun apiV2PlansPlanIdHospitalsHospitalIdGet(@Path("planId") planId: java.util.UUID, @Path("hospitalId") hospitalId: java.util.UUID): Response<PlanHospitalModel>

}
