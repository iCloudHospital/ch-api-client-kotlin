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
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.Specialty

import com.google.gson.annotations.SerializedName

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
 * @param auditableEntity 
 */

data class SpecialtyType (
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
    @SerializedName("content")
    val content: kotlin.String? = null,
    @SerializedName("marketingType")
    val marketingType: MarketingType? = null,
    @SerializedName("specialtyTypeCategoryId")
    val specialtyTypeCategoryId: java.util.UUID? = null,
    @SerializedName("specialties")
    val specialties: kotlin.collections.List<Specialty>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

