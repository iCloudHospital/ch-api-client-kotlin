package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.AppVersionModel
import CloudHospitalApi.models.Platform

interface AppVersionApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param platform 
     * @return [AppVersionModel]
     */
    @GET("api/v2/appversion/{platform}")
    suspend fun apiV2AppversionPlatformGet(@Path("platform") platform: Platform): Response<AppVersionModel>

}
