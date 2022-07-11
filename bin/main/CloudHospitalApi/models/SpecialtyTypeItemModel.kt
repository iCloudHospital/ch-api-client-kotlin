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
 * @param description 
 * @param marketingType 
 * @param specialtiesCount 
 * @param medias 
 * @param auditableEntity 
 */

data class SpecialtyTypeItemModel (

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

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,

    @Json(name = "specialtiesCount")
    val specialtiesCount: kotlin.Int? = null,

    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaModel>? = null,

    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null

)

