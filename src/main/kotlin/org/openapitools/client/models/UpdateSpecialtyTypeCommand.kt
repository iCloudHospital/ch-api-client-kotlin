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

import com.google.gson.annotations.SerializedName
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
    @SerializedName("content")
    val content: kotlin.String? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("marketingType")
    val marketingType: MarketingType? = null,
    @SerializedName("specialtyCount")
    val specialtyCount: kotlin.Int? = null,
    @SerializedName("hospitalSpecialtyCount")
    val hospitalSpecialtyCount: kotlin.Int? = null,
    @SerializedName("serviceCount")
    val serviceCount: kotlin.Int? = null,
    @SerializedName("created")
    val created: java.time.LocalDateTime? = null
)

