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

import com.squareup.moshi.Json

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

data class HospitalSpecialtyItemViewModel (
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "specialtyId")
    val specialtyId: java.util.UUID? = null,
    @Json(name = "specialtyName")
    val specialtyName: kotlin.String? = null,
    @Json(name = "specialtyTypeId")
    val specialtyTypeId: java.util.UUID? = null,
    @Json(name = "specialtyTypeName")
    val specialtyTypeName: kotlin.String? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null,
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null
)

