package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CreateQuestionCommentCommand
import CloudHospitalApi.models.QuestionCommentViewModel
import CloudHospitalApi.models.QuestionCommentsViewModel
import CloudHospitalApi.models.UpdateQuestionCommentCommand

interface QuestionCommentsApi {
    /**
     * Get all questionComment.
     * Sample request:        GET /api/v1/questionComment
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param questionId  
     * @param id  (optional)
     * @param userId  (optional)
     * @param questionId2  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [QuestionCommentsViewModel]
     */
    @GET("api/v1/questions/{questionId}/questioncomments")
    suspend fun apiV1QuestionsQuestionIdQuestioncommentsGet(@Path("questionId") questionId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("UserId") userId: java.util.UUID? = null, @Query("QuestionId") questionId2: java.util.UUID? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.OffsetDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Response<QuestionCommentsViewModel>

    /**
     * Create an questionComment.
     * Sample request:        POST /api/v1/questions/1/questionComment      {          \&quot;description\&quot;: \&quot;This is a questionComment.\&quot;,          \&quot;body\&quot;: \&quot;questionComment body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param questionId  
     * @param createQuestionCommentCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/questions/{questionId}/questioncomments")
    suspend fun apiV1QuestionsQuestionIdQuestioncommentsPost(@Path("questionId") questionId: java.util.UUID, @Body createQuestionCommentCommand: CreateQuestionCommentCommand? = null): Response<java.util.UUID>

    /**
     * Delete questionComment.
     * Sample request:        DELETE /api/v1/questions/1/questionComments/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param questionId  
     * @param questionCommentId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/questions/{questionId}/questioncomments/{questionCommentId}")
    suspend fun apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdDelete(@Path("questionId") questionId: java.util.UUID, @Path("questionCommentId") questionCommentId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get questionComment.
     * Sample request:        GET /api/v1/questionComment/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param questionId  
     * @param questionCommentId  
     * @return [QuestionCommentViewModel]
     */
    @GET("api/v1/questions/{questionId}/questioncomments/{questionCommentId}")
    suspend fun apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdGet(@Path("questionId") questionId: java.util.UUID, @Path("questionCommentId") questionCommentId: java.util.UUID): Response<QuestionCommentViewModel>

    /**
     * Update questionComment.
     * Sample request:        PUT /api/v1/questions/1/questionComments/1      {          \&quot;QuestionTitle\&quot;: \&quot;Question title\&quot;,          \&quot;body\&quot;: \&quot;updated questionComment body here\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param questionId  
     * @param questionCommentId  
     * @param updateQuestionCommentCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/questions/{questionId}/questioncomments/{questionCommentId}")
    suspend fun apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdPut(@Path("questionId") questionId: java.util.UUID, @Path("questionCommentId") questionCommentId: java.util.UUID, @Body updateQuestionCommentCommand: UpdateQuestionCommentCommand? = null): Response<kotlin.Boolean>

}
