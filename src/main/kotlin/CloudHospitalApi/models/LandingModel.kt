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
import CloudHospitalApi.models.LocalizedUrlModel
import CloudHospitalApi.models.MediaModel

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param languageCode 
 * @param name 
 * @param slug 
 * @param confirmed 
 * @param order 
 * @param photo 
 * @param photoThumbnail 
 * @param auditableEntity 
 * @param description 
 * @param overview 
 * @param content 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param customStyle 
 * @param localizedUrls 
 * @param medias 
 */

data class LandingModel (

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

    @Json(name = "order")
    val order: kotlin.Int? = null,

    @Json(name = "photo")
    val photo: kotlin.String? = null,

    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,

    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "overview")
    val overview: kotlin.String? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,

    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,

    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,

    @Json(name = "customStyle")
    val customStyle: kotlin.String? = null,

    @Json(name = "localizedUrls")
    val localizedUrls: kotlin.collections.List<LocalizedUrlModel>? = null,

    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaModel>? = null

)

