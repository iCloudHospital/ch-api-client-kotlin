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

import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.ContributionType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param articleId 
 * @param contributorId 
 * @param languageCode 
 * @param contributorName 
 * @param contributorSlug 
 * @param contributorConfirmed 
 * @param contributorEmail 
 * @param contributorPhoto 
 * @param contributorPhotoThumbnail 
 * @param type 
 * @param filter 
 * @param order 
 * @param auditableEntity 
 */

data class ArticleContributorItemModel (

    @Json(name = "articleId")
    val articleId: java.util.UUID? = null,

    @Json(name = "contributorId")
    val contributorId: java.util.UUID? = null,

    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,

    @Json(name = "contributorName")
    val contributorName: kotlin.String? = null,

    @Json(name = "contributorSlug")
    val contributorSlug: kotlin.String? = null,

    @Json(name = "contributorConfirmed")
    val contributorConfirmed: kotlin.Boolean? = null,

    @Json(name = "contributorEmail")
    val contributorEmail: kotlin.String? = null,

    @Json(name = "contributorPhoto")
    val contributorPhoto: kotlin.String? = null,

    @Json(name = "contributorPhotoThumbnail")
    val contributorPhotoThumbnail: kotlin.String? = null,

    @Json(name = "type")
    val type: ContributionType? = null,

    @Json(name = "filter")
    val filter: kotlin.String? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null,

    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null

)

