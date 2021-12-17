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
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.Media
import CloudHospitalApi.models.Specialty

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param name 
 * @param normalizedName 
 * @param slug 
 * @param description 
 * @param content 
 * @param marketingType 
 * @param specialtyTypeCategoryId 
 * @param specialties 
 * @param medias 
 * @param auditableEntity 
 */

data class SpecialtyType (
    @Json(name = "id")
    val id: java.util.UUID? = null,
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
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,
    @Json(name = "specialtyTypeCategoryId")
    val specialtyTypeCategoryId: java.util.UUID? = null,
    @Json(name = "specialties")
    val specialties: kotlin.collections.List<Specialty>? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<Media>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

