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

import com.google.gson.annotations.SerializedName
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
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("normalizedName")
    val normalizedName: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospital")
    val hospital: Hospital? = null,
    @SerializedName("marketingType")
    val marketingType: MarketingType? = null,
    @SerializedName("photo")
    val photo: kotlin.String? = null,
    @SerializedName("photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @SerializedName("dealPackages")
    val dealPackages: kotlin.Array<DealPackage>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

