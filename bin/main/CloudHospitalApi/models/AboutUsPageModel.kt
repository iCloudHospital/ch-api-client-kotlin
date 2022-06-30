/**
* Swagger UI - Cloud Hospital Api-DEV
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
import CloudHospitalApi.models.LocalizedUrlModel
import CloudHospitalApi.models.MediaModel

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param name 
 * @param slug 
 * @param description 
 * @param confirmed 
 * @param medias 
 * @param auditableEntity 
 * @param languageCode 
 * @param content 
 * @param customStyle 
 * @param background 
 * @param backgroundThumbnail 
 * @param localizedUrls 
 */

data class AboutUsPageModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaModel>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null,
    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,
    @Json(name = "content")
    val content: kotlin.String? = null,
    @Json(name = "customStyle")
    val customStyle: kotlin.String? = null,
    @Json(name = "background")
    val background: kotlin.String? = null,
    @Json(name = "backgroundThumbnail")
    val backgroundThumbnail: kotlin.String? = null,
    @Json(name = "localizedUrls")
    val localizedUrls: kotlin.collections.List<LocalizedUrlModel>? = null
)

