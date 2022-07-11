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
import CloudHospitalApi.models.MarketingType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param languageCode 
 * @param name 
 * @param slug 
 * @param confirmed 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param marketingType 
 * @param photo 
 * @param photoThumbnail 
 * @param order 
 * @param auditableEntity 
 */

data class DealItemModel (

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

    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,

    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,

    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,

    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,

    @Json(name = "photo")
    val photo: kotlin.String? = null,

    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null,

    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null

)

