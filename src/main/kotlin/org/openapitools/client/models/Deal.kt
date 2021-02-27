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
package org.openapitools.client.models

import org.openapitools.client.models.AuditableEntity
import org.openapitools.client.models.DealPackage
import org.openapitools.client.models.Hospital
import org.openapitools.client.models.MarketingType

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param name 
 * @param normalizedName 
 * @param slug 
 * @param description 
 * @param hospitalId 
 * @param hospital 
 * @param marketingType 
 * @param photo 
 * @param photoThumbnail 
 * @param dealPackages 
 * @param auditableEntity 
 */

data class Deal (
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
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospital")
    val hospital: Hospital? = null,
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,
    @Json(name = "photo")
    val photo: kotlin.String? = null,
    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @Json(name = "dealPackages")
    val dealPackages: kotlin.collections.List<DealPackage>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

