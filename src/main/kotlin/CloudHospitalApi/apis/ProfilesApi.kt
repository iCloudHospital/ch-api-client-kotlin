package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ChangeEmailCommand
import CloudHospitalApi.models.ConfirmEmailCommand
import CloudHospitalApi.models.UpdateProfileCommand
import CloudHospitalApi.models.UserModel

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
     * @return [kotlin.Boolean]
     */
    @POST("api/v2/profiles/changeemail")
    suspend fun apiV2ProfilesChangeemailPost(@Body changeEmailCommand: ChangeEmailCommand? = null): Response<kotlin.Boolean>

    /**
     * Configm email.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param confirmEmailCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @POST("api/v2/profiles/confirmemail")
    suspend fun apiV2ProfilesConfirmemailPost(@Body confirmEmailCommand: ConfirmEmailCommand? = null): Response<kotlin.Boolean>

    /**
     * Get Profile.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @return [UserModel]
     */
    @GET("api/v2/profiles")
    suspend fun apiV2ProfilesGet(): Response<UserModel>

    /**
     * Update Profile.
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param updateProfileCommand  (optional)
     * @return [UserModel]
     */
    @PUT("api/v2/profiles")
    suspend fun apiV2ProfilesPut(@Body updateProfileCommand: UpdateProfileCommand? = null): Response<UserModel>

}
