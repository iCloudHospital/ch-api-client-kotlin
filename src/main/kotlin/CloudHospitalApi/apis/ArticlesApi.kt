package CloudHospitalApi.apis

import CloudHospitalApi.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import CloudHospitalApi.models.ArticleContributorModel
import CloudHospitalApi.models.ArticleContributorsModel
import CloudHospitalApi.models.ArticleModel
import CloudHospitalApi.models.ArticleSourcesModel
import CloudHospitalApi.models.ArticleTagModel
import CloudHospitalApi.models.ArticleTagsModel
import CloudHospitalApi.models.ArticlesModel
import CloudHospitalApi.models.ContributionType
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.MediaType
import CloudHospitalApi.models.MediasModel
import CloudHospitalApi.models.SourceModel

interface ArticlesApi {
    /**
     * Get ArticleContributor.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param articleId 
     * @param contributorId 
     * @return [ArticleContributorModel]
     */
    @GET("api/v2/articles/{articleId}/contributors/{contributorId}")
    suspend fun apiV2ArticlesArticleIdContributorsContributorIdGet(@Path("articleId") articleId: java.util.UUID, @Path("contributorId") contributorId: java.util.UUID): Response<ArticleContributorModel>

    /**
     * GetAll ArticleContributors.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param articleId 
     * @param articleName  (optional)
     * @param contributorId  (optional)
     * @param contributorName  (optional)
     * @param email  (optional)
     * @param website  (optional)
     * @param contributionType  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ArticleContributorsModel]
     */
    @GET("api/v2/articles/{articleId}/contributors")
    suspend fun apiV2ArticlesArticleIdContributorsGet(@Path("articleId") articleId: java.util.UUID, @Query("ArticleName") articleName: kotlin.String? = null, @Query("ContributorId") contributorId: java.util.UUID? = null, @Query("ContributorName") contributorName: kotlin.String? = null, @Query("Email") email: kotlin.String? = null, @Query("Website") website: kotlin.String? = null, @Query("ContributionType") contributionType: ContributionType? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ArticleContributorsModel>

    /**
     * Get Article.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param articleId 
     * @param languageCode  (optional)
     * @return [ArticleModel]
     */
    @GET("api/v2/articles/{articleId}")
    suspend fun apiV2ArticlesArticleIdGet(@Path("articleId") articleId: java.util.UUID, @Query("languageCode") languageCode: kotlin.String? = null): Response<ArticleModel>

    /**
     * Get all ArticleMedias.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param articleId 
     * @param id  (optional)
     * @param mediaType  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [MediasModel]
     */
    @GET("api/v2/articles/{articleId}/medias")
    suspend fun apiV2ArticlesArticleIdMediasGet(@Path("articleId") articleId: java.util.UUID, @Query("Id") id: java.util.UUID? = null, @Query("MediaType") mediaType: MediaType? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<MediasModel>

    /**
     * Get ArticleMedia.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param articleId 
     * @param mediaId 
     * @return [MediaModel]
     */
    @GET("api/v2/articles/{articleId}/medias/{mediaId}")
    suspend fun apiV2ArticlesArticleIdMediasMediaIdGet(@Path("articleId") articleId: java.util.UUID, @Path("mediaId") mediaId: java.util.UUID): Response<MediaModel>

    /**
     * Get all ArticleSource.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param articleId 
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ArticleSourcesModel]
     */
    @GET("api/v2/articles/{articleId}/sources")
    suspend fun apiV2ArticlesArticleIdSourcesGet(@Path("articleId") articleId: java.util.UUID, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ArticleSourcesModel>

    /**
     * Get ArticleSource.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param articleId 
     * @param sourceId 
     * @return [SourceModel]
     */
    @GET("api/v2/articles/{articleId}/sources/{sourceId}")
    suspend fun apiV2ArticlesArticleIdSourcesSourceIdGet(@Path("articleId") articleId: java.util.UUID, @Path("sourceId") sourceId: java.util.UUID): Response<SourceModel>

    /**
     * GetAll ArticleTags.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param articleId 
     * @param tagId  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ArticleTagsModel]
     */
    @GET("api/v2/articles/{articleId}/tags")
    suspend fun apiV2ArticlesArticleIdTagsGet(@Path("articleId") articleId: java.util.UUID, @Query("TagId") tagId: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ArticleTagsModel>

    /**
     * Get ArticleTag.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param articleId 
     * @param tagId 
     * @return [ArticleTagModel]
     */
    @GET("api/v2/articles/{articleId}/tags/{tagId}")
    suspend fun apiV2ArticlesArticleIdTagsTagIdGet(@Path("articleId") articleId: java.util.UUID, @Path("tagId") tagId: kotlin.String): Response<ArticleTagModel>

    /**
     * Get all Articles.
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param marketingType  (optional)
     * @param userId  (optional)
     * @param userName  (optional)
     * @param hospitalId  (optional)
     * @param hospitalName  (optional)
     * @param countryId  (optional)
     * @param tag  (optional)
     * @param exceptArticleId  (optional)
     * @param exceptHospitalId  (optional)
     * @param contributorId  (optional)
     * @param languageCode  (optional)
     * @param showHidden  (optional)
     * @param returnDefaultValue  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param lastRetrieved  (optional)
     * @return [ArticlesModel]
     */
    @GET("api/v2/articles")
    suspend fun apiV2ArticlesGet(@Query("Id") id: java.util.UUID? = null, @Query("Name") name: kotlin.String? = null, @Query("Description") description: kotlin.String? = null, @Query("MarketingType") marketingType: MarketingType? = null, @Query("UserId") userId: java.util.UUID? = null, @Query("UserName") userName: kotlin.String? = null, @Query("HospitalId") hospitalId: java.util.UUID? = null, @Query("HospitalName") hospitalName: kotlin.String? = null, @Query("CountryId") countryId: java.util.UUID? = null, @Query("Tag") tag: kotlin.String? = null, @Query("ExceptArticleId") exceptArticleId: java.util.UUID? = null, @Query("ExceptHospitalId") exceptHospitalId: java.util.UUID? = null, @Query("ContributorId") contributorId: java.util.UUID? = null, @Query("LanguageCode") languageCode: kotlin.String? = null, @Query("ShowHidden") showHidden: kotlin.Boolean? = null, @Query("ReturnDefaultValue") returnDefaultValue: kotlin.Boolean? = null, @Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("lastRetrieved") lastRetrieved: java.time.LocalDateTime? = null): Response<ArticlesModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: Success
     *
     * @param slug 
     * @param languageCode  (optional)
     * @param returnDefaultValue  (optional)
     * @return [ArticleModel]
     */
    @GET("api/v2/articles/{slug}")
    suspend fun apiV2ArticlesSlugGet(@Path("slug") slug: kotlin.String, @Query("languageCode") languageCode: kotlin.String? = null, @Query("returnDefaultValue") returnDefaultValue: kotlin.Boolean? = null): Response<ArticleModel>

}
