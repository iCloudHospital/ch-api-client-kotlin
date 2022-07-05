/**
* Swagger UI - Cloud Hospital Api-INT
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 2
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package CloudHospitalApi.models

import CloudHospitalApi.models.AuditableEntity

import com.squareup.moshi.Json

/**
 * 
 * @param userId 
 * @param languageCode 
 * @param firstName 
 * @param middleName 
 * @param lastName 
 * @param slug 
 * @param overview 
 * @param description 
 * @param content 
 * @param confirmed 
 * @param auditableEntity 
 */

data class UserTranslationModel (
    @Json(name = "userId")
    val userId: java.util.UUID? = null,
    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "middleName")
    val middleName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "overview")
    val overview: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "content")
    val content: kotlin.String? = null,
    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

