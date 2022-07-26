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
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.ReviewType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param languageCode 
 * @param name 
 * @param slug 
 * @param description 
 * @param overview 
 * @param content 
 * @param confirmed 
 * @param serviceId 
 * @param serviceName 
 * @param serviceSlug 
 * @param patientId 
 * @param patientName 
 * @param patientPhoto 
 * @param createdDate 
 * @param recommended 
 * @param rate 
 * @param reviewType 
 * @param medias 
 * @param auditableEntity 
 */
@JsonClass(generateAdapter = true)
data class ServiceReviewItemModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "slug")
    val slug: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "overview")
    val overview: kotlin.String? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,

    @Json(name = "serviceId")
    val serviceId: java.util.UUID? = null,

    @Json(name = "serviceName")
    val serviceName: kotlin.String? = null,

    @Json(name = "serviceSlug")
    val serviceSlug: kotlin.String? = null,

    @Json(name = "patientId")
    val patientId: java.util.UUID? = null,

    @Json(name = "patientName")
    val patientName: kotlin.String? = null,

    @Json(name = "patientPhoto")
    val patientPhoto: kotlin.String? = null,

    @Json(name = "createdDate")
    val createdDate: java.time.LocalDateTime? = null,

    @Json(name = "recommended")
    val recommended: kotlin.Boolean? = null,

    @Json(name = "rate")
    val rate: kotlin.Int? = null,

    @Json(name = "reviewType")
    val reviewType: ReviewType? = null,

    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaModel>? = null,

    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null

)

