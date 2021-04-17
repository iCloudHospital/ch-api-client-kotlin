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
import CloudHospitalApi.models.MediaViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param title 
 * @param slug 
 * @param content 
 * @param medias 
 * @param auditableEntity 
 */

data class FaqViewModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "title")
    val title: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "content")
    val content: kotlin.String? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)
