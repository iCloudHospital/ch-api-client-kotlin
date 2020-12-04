package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.AzureSearchViewModel
import org.openapitools.client.models.DealSearchResultViewModel
import org.openapitools.client.models.DoctorSearchResultViewModel
import org.openapitools.client.models.HospitalSearchResultViewModel
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.SpecialtySearchResultViewModel
import org.openapitools.client.models.SpecialtyTypeSearchResultViewModel

interface SearchApi {
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
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[DealSearchResultViewModel]>
     */
    @GET("api/v1/search/deals")
    fun apiV1SearchDealsGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<DealSearchResultViewModel>

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
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[DoctorSearchResultViewModel]>
     */
    @GET("api/v1/search/doctors")
    fun apiV1SearchDoctorsGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<DoctorSearchResultViewModel>

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
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[AzureSearchViewModel]>
     */
    @GET("api/v1/search/getcount")
    fun apiV1SearchGetcountGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<AzureSearchViewModel>

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
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[HospitalSearchResultViewModel]>
     */
    @GET("api/v1/search/hospitals")
    fun apiV1SearchHospitalsGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<HospitalSearchResultViewModel>

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
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[SpecialtySearchResultViewModel]>
     */
    @GET("api/v1/search/specialties")
    fun apiV1SearchSpecialtiesGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<SpecialtySearchResultViewModel>

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
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[SpecialtyTypeSearchResultViewModel]>
     */
    @GET("api/v1/search/specialtytypes")
    fun apiV1SearchSpecialtytypesGet(@Query("SearchTerm") searchTerm: kotlin.String? = null, @Query("CountOnly") countOnly: kotlin.Boolean? = null, @Query("CountryId") countryId: kotlin.String? = null, @Query("HospitalId") hospitalId: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<SpecialtyTypeSearchResultViewModel>

}
