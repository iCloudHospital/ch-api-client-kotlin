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
import org.openapitools.client.models.VendorType

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param vendor 
 * @param auditableEntity 
 */

data class Account (
    @Json(name = "id")
    val id: kotlin.String? = null,
    @Json(name = "vendor")
    val vendor: VendorType? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

