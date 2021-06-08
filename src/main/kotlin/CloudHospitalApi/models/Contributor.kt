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
import CloudHospitalApi.models.SnsHandle

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param name 
 * @param slug 
 * @param email 
 * @param photo 
 * @param description 
 * @param website 
 * @param snsHandles 
 * @param articleContributors 
 * @param auditableEntity 
 */

data class Contributor (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "photo")
    val photo: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "website")
    val website: kotlin.String? = null,
    @Json(name = "snsHandles")
    val snsHandles: kotlin.collections.List<SnsHandle>? = null,
    @Json(name = "articleContributors")
    val articleContributors: kotlin.collections.List<ArticleContributor>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

