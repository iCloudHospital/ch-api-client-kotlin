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
 * @param logo 
 * @param auditableEntity 
 */
@JsonClass(generateAdapter = true)
data class CountryItemModel (

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

    @Json(name = "logo")
    val logo: kotlin.String? = null,

    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null

)

