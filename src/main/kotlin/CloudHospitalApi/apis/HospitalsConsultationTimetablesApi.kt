package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ConsultationTimetableModel

interface HospitalsConsultationTimetablesApi {
    /**
     * Get hospital consultation timetables by hospitalId
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *
     * @param hospitalId 
     * @param year  (optional)
     * @param month  (optional)
     * @return [ConsultationTimetableModel]
     */
    @GET("api/v2/hospitals/{hospitalId}/consultationtimetables")
    suspend fun apiV2HospitalsHospitalIdConsultationtimetablesGet(@Path("hospitalId") hospitalId: java.util.UUID, @Query("Year") year: kotlin.Int? = null, @Query("Month") month: kotlin.Int? = null): Response<ConsultationTimetableModel>

}
