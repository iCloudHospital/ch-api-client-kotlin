package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CountryLocaleViewModel
import CloudHospitalApi.models.UpdateCountryLocaleCommand

interface CountryLocalesApi {
    /**
     * Get country locale
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param countryId  
     * @param languageCode  
     * @return [CountryLocaleViewModel]
     */
    @GET("api/v1/countries/{countryId}/locales/{languageCode}")
    suspend fun apiV1CountriesCountryIdLocalesLanguageCodeGet(@Path("countryId") countryId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String): Response<CountryLocaleViewModel>

    /**
     * Update country locale
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param countryId  
     * @param languageCode  
     * @param updateCountryLocaleCommand  (optional)
     * @return [CountryLocaleViewModel]
     */
    @PUT("api/v1/countries/{countryId}/locales/{languageCode}")
    suspend fun apiV1CountriesCountryIdLocalesLanguageCodePut(@Path("countryId") countryId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String, @Body updateCountryLocaleCommand: UpdateCountryLocaleCommand? = null): Response<CountryLocaleViewModel>

}
