package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.AppVersionViewModel
import CloudHospitalApi.models.Platform

interface AppVersionApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param platform  
     * @return [AppVersionViewModel]
     */
    @GET("api/v1/appversion/{platform}")
    suspend fun apiV1AppversionPlatformGet(@Path("platform") platform: Platform): Response<AppVersionViewModel>

}
