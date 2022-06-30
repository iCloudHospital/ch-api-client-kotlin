package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.AutocompleteMode
import CloudHospitalApi.models.AzureSearchModel
import CloudHospitalApi.models.AzureSearchServiceAutocompleteModel
import CloudHospitalApi.models.AzureSearchServiceSuggestModel
import CloudHospitalApi.models.DealsModel
import CloudHospitalApi.models.DoctorsModel
import CloudHospitalApi.models.HospitalsModel
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.SpecialtiesModel
import CloudHospitalApi.models.SpecialtyTypesModel

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
    @GET("api/v2/search/autocomplete")
    suspend fun apiV2SearchAutocompleteGet(@Query("Keyword") keyword: kotlin.String, @Query("Mode") mode: AutocompleteMode? = null, @Query("Fuzzy") fuzzy: kotlin.Boolean? = null, @Query("Highlights") highlights: kotlin.Boolean? = null, @Query("Size") size: kotlin.Int? = null, @Query("MinimumCoverage") minimumCoverage: kotlin.Double? = null): Response<AzureSearchServiceAutocompleteModel>

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
     * @return [DealsModel]
     */
    @GET("api/v2/search/deals")
    suspend fun apiV2SearchDealsGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DealsModel>

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
     * @return [DoctorsModel]
     */
    @GET("api/v2/search/doctors")
    suspend fun apiV2SearchDoctorsGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<DoctorsModel>

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
     * @return [AzureSearchModel]
     */
    @GET("api/v2/search/getcount")
    suspend fun apiV2SearchGetcountGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<AzureSearchModel>

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
     * @return [HospitalsModel]
     */
    @GET("api/v2/search/hospitals")
    suspend fun apiV2SearchHospitalsGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<HospitalsModel>

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
     * @return [SpecialtiesModel]
     */
    @GET("api/v2/search/specialties")
    suspend fun apiV2SearchSpecialtiesGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<SpecialtiesModel>

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
     * @return [SpecialtyTypesModel]
     */
    @GET("api/v2/search/specialtytypes")
    suspend fun apiV2SearchSpecialtytypesGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<SpecialtyTypesModel>

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
    @GET("api/v2/search/suggest")
    suspend fun apiV2SearchSuggestGet(@Query("Keyword") keyword: kotlin.String, @Query("Fuzzy") fuzzy: kotlin.Boolean? = null, @Query("Highlights") highlights: kotlin.Boolean? = null, @Query("Size") size: kotlin.Int? = null): Response<AzureSearchServiceSuggestModel>

}
