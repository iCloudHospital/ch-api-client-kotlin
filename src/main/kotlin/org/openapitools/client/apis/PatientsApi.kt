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

import org.openapitools.client.models.CreatePatientCommand
import org.openapitools.client.models.Gender
import org.openapitools.client.models.PatientViewModel
import org.openapitools.client.models.PatientsViewModel
import org.openapitools.client.models.UpdatePatientCommand

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

class PatientsApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "http://localhost")
        }
    }

    /**
    * Get all patients.
    * Sample request:        GET /api/v1/patients      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;patient\&quot;      }
    * @param id  (optional)
    * @param fullname  (optional)
    * @param email  (optional)
    * @param gender  (optional)
    * @param dateOfBirth  (optional)
    * @param created  (optional)
    * @param page  (optional)
    * @param limit  (optional)
    * @param lastRetrieved  (optional)
    * @param current  (optional)
    * @return PatientsViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1PatientsGet(id: java.util.UUID?, fullname: kotlin.String?, email: kotlin.String?, gender: Gender?, dateOfBirth: java.time.OffsetDateTime?, created: java.time.OffsetDateTime?, page: kotlin.Int?, limit: kotlin.Int?, lastRetrieved: java.time.OffsetDateTime?, current: kotlin.Boolean?) : PatientsViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (id != null) {
                    put("Id", listOf(id.toString()))
                }
                if (fullname != null) {
                    put("Fullname", listOf(fullname.toString()))
                }
                if (email != null) {
                    put("Email", listOf(email.toString()))
                }
                if (gender != null) {
                    put("Gender", listOf(gender.toString()))
                }
                if (dateOfBirth != null) {
                    put("DateOfBirth", listOf(parseDateToQueryString(dateOfBirth)))
                }
                if (created != null) {
                    put("Created", listOf(parseDateToQueryString(created)))
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
            "/api/v1/patients",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<PatientsViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PatientsViewModel
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
    * Delete patient.
    * Sample request:        DELETE /api/v1/patients/1
    * @param patientId  
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1PatientsPatientIdDelete(patientId: java.util.UUID) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/api/v1/patients/{patientId}".replace("{"+"patientId"+"}", "$patientId"),
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
    * Get patient.
    * Sample request:        GET /api/v1/patients/1
    * @param patientId  
    * @return PatientViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1PatientsPatientIdGet(patientId: java.util.UUID) : PatientViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/patients/{patientId}".replace("{"+"patientId"+"}", "$patientId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<PatientViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PatientViewModel
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
    * Update patient.
    * Sample request:        PUT /api/v1/patients/1      {          \&quot;referralCode\&quot;: \&quot;string\&quot;,          \&quot;firstName\&quot;: \&quot;patient\&quot;,          \&quot;lastName\&quot;: \&quot;cloud\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
    * @param patientId  
    * @param updatePatientCommand  (optional)
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1PatientsPatientIdPut(patientId: java.util.UUID, updatePatientCommand: UpdatePatientCommand?) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = updatePatientCommand
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/api/v1/patients/{patientId}".replace("{"+"patientId"+"}", "$patientId"),
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
    * Create patient.
    * Sample request:        POST /api/v1/patients      {          \&quot;referralCode\&quot;: \&quot;123456\&quot;,          \&quot;email\&quot;: \&quot;patient@icloudhospital.com\&quot;,          \&quot;firstName\&quot;: \&quot;patient\&quot;,          \&quot;lastName\&quot;: \&quot;cloud\&quot;,          \&quot;photo\&quot;: \&quot;string\&quot;,          \&quot;locations\&quot;: [            {              \&quot;locationType\&quot;: \&quot;LivesIn\&quot;,              \&quot;latitude\&quot;: 0,              \&quot;longitude\&quot;: 0,              \&quot;country\&quot;: \&quot;string\&quot;,              \&quot;state\&quot;: \&quot;string\&quot;,              \&quot;county\&quot;: \&quot;string\&quot;,              \&quot;city\&quot;: \&quot;string\&quot;,              \&quot;zipCode\&quot;: \&quot;string\&quot;,              \&quot;address\&quot;: \&quot;string\&quot;            }          ]      }
    * @param createPatientCommand  (optional)
    * @return java.util.UUID
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1PatientsPost(createPatientCommand: CreatePatientCommand?) : java.util.UUID {
        val localVariableBody: kotlin.Any? = createPatientCommand
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/v1/patients",
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

}
