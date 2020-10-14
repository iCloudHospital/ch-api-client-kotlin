/**
* Swagger UI - Cloud Hospital Api-INT
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 1
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import org.openapitools.client.models.CreateQuestionCommand
import org.openapitools.client.models.QuestionStatus
import org.openapitools.client.models.QuestionType
import org.openapitools.client.models.QuestionViewModel
import org.openapitools.client.models.QuestionsViewModel
import org.openapitools.client.models.UpdateQuestionCommand

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class QuestionsApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "http://localhost")
        }
    }

    /**
    * Create an question.
    * Sample request:        POST /api/v1/hospitals/1/questions      {          \&quot;title\&quot;: \&quot;Hospital question\&quot;,          \&quot;description\&quot;: \&quot;This is a question.\&quot;,          \&quot;body\&quot;: \&quot;question body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;tags\&quot;: [            {              \&quot;value\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0              }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }
    * @param hospitalId  
    * @param createQuestionCommand  (optional)
    * @return java.util.UUID
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdQuestionsPost(hospitalId: java.util.UUID, createQuestionCommand: CreateQuestionCommand?) : java.util.UUID {
        val localVariableBody: kotlin.Any? = createQuestionCommand
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/v1/hospitals/{hospitalId}/questions".replace("{"+"hospitalId"+"}", "$hospitalId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<java.util.UUID>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as java.util.UUID
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Delete question.
    * Sample request:        DELETE /api/v1/hospitals/1/questions/1
    * @param hospitalId  
    * @param questionId  
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdQuestionsQuestionIdDelete(hospitalId: java.util.UUID, questionId: java.util.UUID) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/api/v1/hospitals/{hospitalId}/questions/{questionId}".replace("{"+"hospitalId"+"}", "$hospitalId").replace("{"+"questionId"+"}", "$questionId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Boolean>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Boolean
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get question.
    * Sample request:        GET /api/v1/hospitals/1/questions/1
    * @param hospitalId  
    * @param questionId  
    * @return QuestionViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdQuestionsQuestionIdGet(hospitalId: java.util.UUID, questionId: java.util.UUID) : QuestionViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/hospitals/{hospitalId}/questions/{questionId}".replace("{"+"hospitalId"+"}", "$hospitalId").replace("{"+"questionId"+"}", "$questionId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<QuestionViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QuestionViewModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Update question.
    * Sample request:        PUT /api/v1/hospitals/1/questions/1      {          \&quot;title\&quot;: \&quot;Samsung Hospital\&quot;,          \&quot;description\&quot;: \&quot;This is an question.\&quot;,          \&quot;body\&quot;: \&quot;updated question body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,        ///                   \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }
    * @param hospitalId  
    * @param questionId  
    * @param updateQuestionCommand  (optional)
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdQuestionsQuestionIdPut(hospitalId: java.util.UUID, questionId: java.util.UUID, updateQuestionCommand: UpdateQuestionCommand?) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = updateQuestionCommand
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/api/v1/hospitals/{hospitalId}/questions/{questionId}".replace("{"+"hospitalId"+"}", "$hospitalId").replace("{"+"questionId"+"}", "$questionId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Boolean>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Boolean
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get all questions.
    * Sample request:        GET /api/v1/hospitals/1/questions
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
    * @return QuestionsViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsQuestionsGet(id: java.util.UUID?, title: kotlin.String?, hospitalId: java.util.UUID?, patientId: java.util.UUID?, questionType: QuestionType?, questionStatus: QuestionStatus?, page: kotlin.Int?, limit: kotlin.Int?, lastRetrieved: java.time.OffsetDateTime?, current: kotlin.Boolean?) : QuestionsViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (id != null) {
                    put("Id", listOf(id.toString()))
                }
                if (title != null) {
                    put("Title", listOf(title.toString()))
                }
                if (hospitalId != null) {
                    put("HospitalId", listOf(hospitalId.toString()))
                }
                if (patientId != null) {
                    put("PatientId", listOf(patientId.toString()))
                }
                if (questionType != null) {
                    put("QuestionType", listOf(questionType.toString()))
                }
                if (questionStatus != null) {
                    put("QuestionStatus", listOf(questionStatus.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (lastRetrieved != null) {
                    put("lastRetrieved", listOf(parseDateToQueryString(lastRetrieved)))
                }
                if (current != null) {
                    put("Current", listOf(current.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/hospitals/questions",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<QuestionsViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QuestionsViewModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

}
