/**
 * Swagger UI - Cloud Hospital Api-INT
 *
 * Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
 *
 * The version of the OpenAPI document: 2
 * Contact: hyounoosung@icloudhospital.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package CloudHospitalApi.models

import CloudHospitalApi.models.ArticleContributorItemModel
import CloudHospitalApi.models.ArticleStatus
import CloudHospitalApi.models.ArticleTagItemModel
import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.SourceModel

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param name 
 * @param slug 
 * @param description 
 * @param body 
 * @param status 
 * @param marketingType 
 * @param userId 
 * @param userName 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param youtubeUrl 
 * @param confirmed 
 * @param articleTags 
 * @param articleContributors 
 * @param medias 
 * @param sources 
 * @param auditableEntity 
 */

data class ArticleItemModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "slug")
    val slug: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "body")
    val body: kotlin.String? = null,

    @Json(name = "status")
    val status: ArticleStatus? = null,

    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,

    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    @Json(name = "userName")
    val userName: kotlin.String? = null,

    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,

    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,

    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,

    @Json(name = "youtubeUrl")
    val youtubeUrl: kotlin.String? = null,

    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,

    @Json(name = "articleTags")
    val articleTags: kotlin.collections.List<ArticleTagItemModel>? = null,

    @Json(name = "articleContributors")
    val articleContributors: kotlin.collections.List<ArticleContributorItemModel>? = null,

    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaModel>? = null,

    @Json(name = "sources")
    val sources: kotlin.collections.List<SourceModel>? = null,

    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null

)

