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
import CloudHospitalApi.models.FaqTagItemModel
import CloudHospitalApi.models.MediaModel

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param name 
 * @param slug 
 * @param description 
 * @param order 
 * @param hospitalId 
 * @param hospitalName 
 * @param faqCategoryId 
 * @param faqCategoryName 
 * @param confirmed 
 * @param faqTags 
 * @param medias 
 * @param auditableEntity 
 */

data class FaqItemModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "faqCategoryId")
    val faqCategoryId: java.util.UUID? = null,
    @Json(name = "faqCategoryName")
    val faqCategoryName: kotlin.String? = null,
    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,
    @Json(name = "faqTags")
    val faqTags: kotlin.collections.List<FaqTagItemModel>? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaModel>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

