package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.LanguageViewModel
import org.openapitools.client.models.LanguagesViewModel

interface LanguagesApi {
    /**
     * Get a language by code
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param code  
     * @return [Call]<[LanguageViewModel]>
     */
    @GET("api/v1/languages/{code}")
    fun apiV1LanguagesCodeGet(@Path("code") code: kotlin.String): Call<LanguageViewModel>

    /**
     * Get all languages.
     * Sample request:        GET: /api/v1/languages
     * Responses:
     *  - 200: Success
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param code  (optional)
     * @param description  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @param current  (optional)
     * @return [Call]<[LanguagesViewModel]>
     */
    @GET("api/v1/languages")
    fun apiV1LanguagesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Code") code: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null, @Query("Current") current: kotlin.Boolean? = null): Call<LanguagesViewModel>

    /**
     * Get a language by id
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param id  
     * @return [Call]<[LanguageViewModel]>
     */
    @GET("api/v1/languages/{id}")
    fun apiV1LanguagesIdGet(@Path("id") id: java.util.UUID): Call<LanguageViewModel>

}
