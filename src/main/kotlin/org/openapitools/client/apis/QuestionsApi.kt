package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CreateQuestionCommand
import org.openapitools.client.models.QuestionStatus
import org.openapitools.client.models.QuestionType
import org.openapitools.client.models.QuestionViewModel
import org.openapitools.client.models.QuestionsViewModel
import org.openapitools.client.models.UpdateQuestionCommand

interface QuestionsApi {
    /**
     * Create an question.
     * Sample request:        POST /api/v1/hospitals/1/questions      {          \&quot;title\&quot;: \&quot;Hospital question\&quot;,          \&quot;description\&quot;: \&quot;This is a question.\&quot;,          \&quot;body\&quot;: \&quot;question body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;tags\&quot;: [            {              \&quot;value\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0              }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param createQuestionCommand  (optional)
     * @return [Call]<[java.util.UUID]>
     */
    @POST("api/v1/hospitals/{hospitalId}/questions")
    fun apiV1HospitalsHospitalIdQuestionsPost(@Path("hospitalId") hospitalId: java.util.UUID, @Body createQuestionCommand: CreateQuestionCommand? = null): Call<java.util.UUID>

    /**
     * Delete question.
     * Sample request:        DELETE /api/v1/hospitals/1/questions/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param questionId  
     * @return [Call]<[kotlin.Boolean]>
     */
    @DELETE("api/v1/hospitals/{hospitalId}/questions/{questionId}")
    fun apiV1HospitalsHospitalIdQuestionsQuestionIdDelete(@Path("hospitalId") hospitalId: java.util.UUID, @Path("questionId") questionId: java.util.UUID): Call<kotlin.Boolean>

    /**
     * Get question.
     * Sample request:        GET /api/v1/hospitals/1/questions/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param questionId  
     * @return [Call]<[QuestionViewModel]>
     */
    @GET("api/v1/hospitals/{hospitalId}/questions/{questionId}")
    fun apiV1HospitalsHospitalIdQuestionsQuestionIdGet(@Path("hospitalId") hospitalId: java.util.UUID, @Path("questionId") questionId: java.util.UUID): Call<QuestionViewModel>

    /**
     * Update question.
     * Sample request:        PUT /api/v1/hospitals/1/questions/1      {          \&quot;title\&quot;: \&quot;Samsung Hospital\&quot;,          \&quot;description\&quot;: \&quot;This is an question.\&quot;,          \&quot;body\&quot;: \&quot;updated question body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,        ///                   \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param hospitalId  
     * @param questionId  
     * @param updateQuestionCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @PUT("api/v1/hospitals/{hospitalId}/questions/{questionId}")
    fun apiV1HospitalsHospitalIdQuestionsQuestionIdPut(@Path("hospitalId") hospitalId: java.util.UUID, @Path("questionId") questionId: java.util.UUID, @Body updateQuestionCommand: UpdateQuestionCommand? = null): Call<kotlin.Boolean>

    /**
     * Get all questions.
     * Sample request:        GET /api/v1/hospitals/1/questions
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param id  (optional)
     * @param title  (optional)
     * @param hospitalId  (optional)
     * @param patientId  (optional)
     * @param questionType  (optional)
     * @param questionStatus  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[QuestionsViewModel]>
     */
    @GET("api/v1/hospitals/questions")
    fun apiV1HospitalsQuestionsGet(@Query("Id") id: java.util.UUID? = null, @Query("Title") title: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("PatientId") patientId: java.util.UUID? = null, @Query("QuestionType") questionType: QuestionType? = null, @Query("QuestionStatus") questionStatus: QuestionStatus? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<QuestionsViewModel>

}
