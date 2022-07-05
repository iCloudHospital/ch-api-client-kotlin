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
 * @param id 
 * @param name 
 * @param slug 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param order 
 * @param confirmed 
 * @param auditableEntity 
 */

data class DealItemSimpleModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null,
    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

