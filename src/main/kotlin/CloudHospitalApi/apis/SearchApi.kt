package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.AutocompleteMode
import CloudHospitalApi.models.AzureSearchServiceAutocompleteModel
import CloudHospitalApi.models.AzureSearchServiceSuggestModel
import CloudHospitalApi.models.AzureSearchViewModel
import CloudHospitalApi.models.DealsViewModel
import CloudHospitalApi.models.DoctorsViewModel
import CloudHospitalApi.models.HospitalsViewModel
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.SpecialtiesViewModel
import CloudHospitalApi.models.SpecialtyTypesViewModel

interface SearchApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param keyword  
     * @param mode  (optional)
     * @param fuzzy  (optional)
     * @param highlights  (optional)
     * @param size  (optional)
     * @param minimumCoverage  (optional)
     * @return [AzureSearchServiceAutocompleteModel]
     */
    @GET("api/v1/search/autocomplete")
    suspend fun apiV1SearchAutocompleteGet(@Query("Keyword") keyword: kotlin.String, @Query("Mode") mode: AutocompleteMode? = null, @Query("Fuzzy") fuzzy: kotlin.Boolean? = null, @Query("Highlights") highlights: kotlin.Boolean? = null, @Query("Size") size: kotlin.Int? = null, @Query("MinimumCoverage") minimumCoverage: kotlin.Double? = null): Response<AzureSearchServiceAutocompleteModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param searchTerm  (optional)
     * @param countOnly  (optional)
     * @param countryId  (optional)
     * @param hospitalId  (optional)
     * @param marketingType  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DealsViewModel]
     */
    @GET("api/v1/search/deals")
    suspend fun apiV1SearchDealsGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DealsViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param searchTerm  (optional)
     * @param countOnly  (optional)
     * @param countryId  (optional)
     * @param hospitalId  (optional)
     * @param marketingType  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [DoctorsViewModel]
     */
    @GET("api/v1/search/doctors")
    suspend fun apiV1SearchDoctorsGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorsViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param searchTerm  (optional)
     * @param countOnly  (optional)
     * @param countryId  (optional)
     * @param hospitalId  (optional)
     * @param marketingType  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [AzureSearchViewModel]
     */
    @GET("api/v1/search/getcount")
    suspend fun apiV1SearchGetcountGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<AzureSearchViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param searchTerm  (optional)
     * @param countOnly  (optional)
     * @param countryId  (optional)
     * @param hospitalId  (optional)
     * @param marketingType  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [HospitalsViewModel]
     */
    @GET("api/v1/search/hospitals")
    suspend fun apiV1SearchHospitalsGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalsViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param searchTerm  (optional)
     * @param countOnly  (optional)
     * @param countryId  (optional)
     * @param hospitalId  (optional)
     * @param marketingType  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [SpecialtiesViewModel]
     */
    @GET("api/v1/search/specialties")
    suspend fun apiV1SearchSpecialtiesGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<SpecialtiesViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param searchTerm  (optional)
     * @param countOnly  (optional)
     * @param countryId  (optional)
     * @param hospitalId  (optional)
     * @param marketingType  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [SpecialtyTypesViewModel]
     */
    @GET("api/v1/search/specialtytypes")
    suspend fun apiV1SearchSpecialtytypesGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<SpecialtyTypesViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param keyword  
     * @param fuzzy  (optional)
     * @param highlights  (optional)
     * @param size  (optional)
     * @return [AzureSearchServiceSuggestModel]
     */
    @GET("api/v1/search/suggest")
    suspend fun apiV1SearchSuggestGet(@Query("Keyword") keyword: kotlin.String, @Query("Fuzzy") fuzzy: kotlin.Boolean? = null, @Query("Highlights") highlights: kotlin.Boolean? = null, @Query("Size") size: kotlin.Int? = null): Response<AzureSearchServiceSuggestModel>

}
