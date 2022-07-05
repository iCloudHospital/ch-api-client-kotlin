package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ArticleLocaleViewModel
import CloudHospitalApi.models.UpdateArticleLocaleCommand

interface ArticleLocalesApi {
    /**
     * Get article locale
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param articleId  
     * @param languageCode  
     * @return [ArticleLocaleViewModel]
     */
    @GET("api/v1/articles/{articleId}/locales/{languageCode}")
    suspend fun apiV1ArticlesArticleIdLocalesLanguageCodeGet(@Path("articleId") articleId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String): Response<ArticleLocaleViewModel>

    /**
     * Update article locale
     * 
     * Responses:
     *  - 200: Success
     *  - 401: Unauthorized
     *  - 403: Forbidden
     * 
     * @param articleId  
     * @param languageCode  
     * @param updateArticleLocaleCommand  (optional)
     * @return [ArticleLocaleViewModel]
     */
    @PUT("api/v1/articles/{articleId}/locales/{languageCode}")
    suspend fun apiV1ArticlesArticleIdLocalesLanguageCodePut(@Path("articleId") articleId: java.util.UUID, @Path("languageCode") languageCode: kotlin.String, @Body updateArticleLocaleCommand: UpdateArticleLocaleCommand? = null): Response<ArticleLocaleViewModel>

}
