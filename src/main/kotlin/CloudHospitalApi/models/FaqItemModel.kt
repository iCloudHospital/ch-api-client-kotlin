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
import CloudHospitalApi.models.FaqTagItemModel
import CloudHospitalApi.models.MediaModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param languageCode 
 * @param name 
 * @param slug 
 * @param confirmed 
 * @param parentId 
 * @param order 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param hospitalWebsiteUrl 
 * @param faqCategoryId 
 * @param faqCategoryName 
 * @param faqTags 
 * @param medias 
 * @param auditableEntity 
 */
@JsonClass(generateAdapter = true)
data class FaqItemModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "slug")
    val slug: kotlin.String? = null,

    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,

    @Json(name = "parentId")
    val parentId: java.util.UUID? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null,

    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,

    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,

    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,

    @Json(name = "hospitalWebsiteUrl")
    val hospitalWebsiteUrl: kotlin.String? = null,

    @Json(name = "faqCategoryId")
    val faqCategoryId: java.util.UUID? = null,

    @Json(name = "faqCategoryName")
    val faqCategoryName: kotlin.String? = null,

    @Json(name = "faqTags")
    val faqTags: kotlin.collections.List<FaqTagItemModel>? = null,

    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaModel>? = null,

    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null

)

