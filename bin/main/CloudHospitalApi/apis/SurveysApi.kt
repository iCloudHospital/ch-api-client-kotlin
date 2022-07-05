package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateSurveyResponseCommand
import CloudHospitalApi.models.SurveyModel

interface SurveysApi {
    /**
     * Get the survey.
     * Sample request:        GET: /api/v1/surveys/29e54730-783f-40ed-b1e1-56db817c73e2
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  
     * @return [SurveyModel]
     */
    @GET("api/v1/surveys/{id}")
    suspend fun apiV1SurveysIdGet(@Path("id") id: java.util.UUID): Response<SurveyModel>

    /**
     * Create user&#39;s survey response.
     * Sample request:        POST: /api/v1/surveys      {          \&quot;surveyId\&quot;: \&quot;29e54730-783f-40ed-b1e1-56db817c73e2\&quot;,          \&quot;answers\&quot;: \&quot;[{ ... }]\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createSurveyResponseCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @POST("api/v1/surveys")
    suspend fun apiV1SurveysPost(@Body createSurveyResponseCommand: CreateSurveyResponseCommand? = null): Response<kotlin.Boolean>

}
