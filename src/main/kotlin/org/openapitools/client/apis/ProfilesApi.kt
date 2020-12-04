package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.ChangeEmailCommand
import org.openapitools.client.models.ConfirmEmailCommand
import org.openapitools.client.models.UserViewModel

interface ProfilesApi {
    /**
     * Change user&#39;s email on both Identity and Api.
     * Sample request:        POST /api/v1/profiles/changeEmail      {          \&quot;email\&quot;: \&quot;user@example.com\&quot;      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param changeEmailCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/profiles/changeemail")
    fun apiV1ProfilesChangeemailPost(@Body changeEmailCommand: ChangeEmailCommand? = null): Call<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param confirmEmailCommand  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/profiles/confirmemail")
    fun apiV1ProfilesConfirmemailPost(@Body confirmEmailCommand: ConfirmEmailCommand? = null): Call<kotlin.Boolean>

    /**
     * Get current user&#39;s profile.
     * Sample request:        GET /api/v1/profiles
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @return [Call]<[UserViewModel]>
     */
    @GET("api/v1/profiles")
    fun apiV1ProfilesGet(): Call<UserViewModel>

}
