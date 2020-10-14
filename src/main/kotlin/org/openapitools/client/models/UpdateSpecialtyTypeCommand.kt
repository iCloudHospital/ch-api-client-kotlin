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

import org.openapitools.client.models.MarketingType

import com.squareup.moshi.Json

/**
 * 
 * @param content 
 * @param name 
 * @param slug 
 * @param description 
 * @param marketingType 
 * @param specialtyCount 
 * @param hospitalSpecialtyCount 
 * @param serviceCount 
 * @param created 
 */

data class UpdateSpecialtyTypeCommand (
    @Json(name = "content")
    val content: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,
    @Json(name = "specialtyCount")
    val specialtyCount: kotlin.Int? = null,
    @Json(name = "hospitalSpecialtyCount")
    val hospitalSpecialtyCount: kotlin.Int? = null,
    @Json(name = "serviceCount")
    val serviceCount: kotlin.Int? = null,
    @Json(name = "created")
    val created: java.time.OffsetDateTime? = null
)

