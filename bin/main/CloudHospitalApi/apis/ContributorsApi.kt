package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ContributorModel
import CloudHospitalApi.models.ContributorSnsHandlesModel
import CloudHospitalApi.models.ContributorsModel
import CloudHospitalApi.models.SnsHandleModel
import CloudHospitalApi.models.SnsType

interface ContributorsApi {
    /**
     * Get Contributor.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param contributorId  
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [ContributorModel]
     */
    @GET("api/v2/contributors/{contributorId}")
    suspend fun apiV2ContributorsContributorIdGet(@Path("contributorId") contributorId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<ContributorModel>

    /**
     * Get all ContributorHandles.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param contributorId  
     * @param contributorId2  (optional)
     * @param id  (optional)
     * @param snsType  (optional)
     * @param handle  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ContributorSnsHandlesModel]
     */
    @GET("api/v2/contributors/{contributorId}/handles")
    suspend fun apiV2ContributorsContributorIdHandlesGet(@Path("contributorId") contributorId: java.util.UUID, @Query("ContributorId") contributorId2: java.util.UUID? = null, @Query("Id") id: java.util.UUID? = null, @Query("SnsType") snsType: SnsType? = null, @Query("Handle") handle: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ContributorSnsHandlesModel>

    /**
     * Get ContributorHandle.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param contributorId  
     * @param handleId  
     * @return [SnsHandleModel]
     */
    @GET("api/v2/contributors/{contributorId}/handles/{handleId}")
    suspend fun apiV2ContributorsContributorIdHandlesHandleIdGet(@Path("contributorId") contributorId: java.util.UUID, @Path("handleId") handleId: java.util.UUID): Response<SnsHandleModel>

    /**
     * Get all Contributors.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param email  (optional)
     * @param website  (optional)
     * @param hospitalId  (optional)
     * @param interviewerOnly  (optional)
     * @param showHidden  (optional)
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ContributorsModel]
     */
    @GET("api/v2/contributors")
    suspend fun apiV2ContributorsGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Website") website: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("InterviewerOnly") interviewerOnly: kotlin.Boolean? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ContributorsModel>

    /**
     * Get Contributor by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [ContributorModel]
     */
    @GET("api/v2/contributors/{slug}")
    suspend fun apiV2ContributorsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<ContributorModel>

}
