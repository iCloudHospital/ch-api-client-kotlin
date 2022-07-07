package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.CountriesViewModel
import CloudHospitalApi.models.CountryViewModel
import CloudHospitalApi.models.CreateCountryCommand
import CloudHospitalApi.models.UpdateCountryCommand

interface CountriesApi {
    /**
     * Delete country.
     * Sample request:        DELETE /api/v1/countries/1
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param countryId  
     * @return [kotlin.Boolean]
     */
    @DELETE("api/v1/countries/{countryId}")
    suspend fun apiV1CountriesCountryIdDelete(@Path("countryId") countryId: java.util.UUID): Response<kotlin.Boolean>

    /**
     * Get country.
     * Sample request:        GET /api/v1/countries/1
     * Responses:
     *  - 200: Success
     * 
     * @param countryId  
     * @param languageCode  (optional, default to "")
     * @return [CountryViewModel]
     */
    @GET("api/v1/countries/{countryId}")
    suspend fun apiV1CountriesCountryIdGet(@Path("countryId") countryId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<CountryViewModel>

    /**
     * Update country.
     * Sample request:        PUT /api/v1/countries/1      {          \&quot;name\&quot;: \&quot;USA\&quot;,          \&quot;description\&quot;: \&quot;United States of America\&quot;          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: 0,              \&quot;url\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/imagecontainer/SouthKorea.png\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/thumbnailcontainer/SouthKorea.png\&quot;              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            },            {              \&quot;mediaType\&quot;: 1,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 1            }          ],      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param countryId  
     * @param updateCountryCommand  (optional)
     * @return [kotlin.Boolean]
     */
    @PUT("api/v1/countries/{countryId}")
    suspend fun apiV1CountriesCountryIdPut(@Path("countryId") countryId: java.util.UUID, @Body updateCountryCommand: UpdateCountryCommand? = null): Response<kotlin.Boolean>

    /**
     * Get all countries.
     * Sample request:        GET /api/v1/countries      {          \&quot;countryPageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;,              \&quot;languageCode\&quot;: \&quot;en\&quot;          }      }
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param createdDate  (optional)
     * @param languageCode  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [CountriesViewModel]
     */
    @GET("api/v1/countries")
    suspend fun apiV1CountriesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("CreatedDate") createdDate: java.time.LocalDateTime? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<CountriesViewModel>

    /**
     * Create a country.
     * Sample request:        POST /api/v1/countries      {          \&quot;name\&quot;: \&quot;Korea\&quot;,          \&quot;description\&quot;: \&quot;Republic of Korea\&quot;,          \&quot;medias\&quot;: [              {                  \&quot;mediaType\&quot;: \&quot;Photo\&quot;,                  \&quot;url\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/imagecontainer/SouthKorea.png\&quot;,                  \&quot;thumbnailUrl\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/thumbnailcontainer/SouthKorea.png\&quot;,                  \&quot;description\&quot;: \&quot;string\&quot;              }          ]      }
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param createCountryCommand  (optional)
     * @return [java.util.UUID]
     */
    @POST("api/v1/countries")
    suspend fun apiV1CountriesPost(@Body createCountryCommand: CreateCountryCommand? = null): Response<java.util.UUID>

    /**
     * Get country by slug.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param slug  
     * @param languageCode  (optional, default to "")
     * @return [CountryViewModel]
     */
    @GET("api/v1/countries/slugs/{slug}")
    suspend fun apiV1CountriesSlugsSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null): Response<CountryViewModel>

}
