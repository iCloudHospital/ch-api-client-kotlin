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

import CloudHospitalApi.models.ArticleContributor
import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.Hospital
import CloudHospitalApi.models.SnsHandle

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param name 
 * @param email 
 * @param photo 
 * @param photoThumbnail 
 * @param description 
 * @param website 
 * @param hospitalId 
 * @param hospital 
 * @param order 
 * @param articleContributors 
 * @param snsHandles 
 * @param auditableEntity 
 */

data class Contributor (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "photo")
    val photo: kotlin.String? = null,
    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "website")
    val website: kotlin.String? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospital")
    val hospital: Hospital? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null,
    @Json(name = "articleContributors")
    val articleContributors: kotlin.collections.List<ArticleContributor>? = null,
    @Json(name = "snsHandles")
    val snsHandles: kotlin.collections.List<SnsHandle>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

