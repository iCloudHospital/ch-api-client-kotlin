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

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param hospitalId 
 * @param hospitalName 
 * @param specialtyId 
 * @param specialtyName 
 * @param specialtyTypeId 
 * @param specialtyTypeName 
 * @param order 
 * @param auditableEntity 
 * @param marketingType 
 */

data class HospitalSpecialtyViewModel (
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospitalName")
    val hospitalName: kotlin.String? = null,
    @SerializedName("specialtyId")
    val specialtyId: java.util.UUID? = null,
    @SerializedName("specialtyName")
    val specialtyName: kotlin.String? = null,
    @SerializedName("specialtyTypeId")
    val specialtyTypeId: java.util.UUID? = null,
    @SerializedName("specialtyTypeName")
    val specialtyTypeName: kotlin.String? = null,
    @SerializedName("order")
    val order: kotlin.Int? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null,
    @SerializedName("marketingType")
    val marketingType: MarketingType? = null
)

