/**
* Swagger UI - Cloud Hospital Api-INT
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 1
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package CloudHospitalApi.models

import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.SpecialtyType

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param languageCode 
 * @param name 
 * @param normalizedName 
 * @param slug 
 * @param description 
 * @param content 
 * @param confirmed 
 * @param auditableEntity 
 * @param specialtyTypeId 
 * @param specialtyType 
 */

data class SpecialtyTypeTranslation (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "normalizedName")
    val normalizedName: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "content")
    val content: kotlin.String? = null,
    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null,
    @Json(name = "specialtyTypeId")
    val specialtyTypeId: java.util.UUID? = null,
    @Json(name = "specialtyType")
    val specialtyType: SpecialtyType? = null
)

