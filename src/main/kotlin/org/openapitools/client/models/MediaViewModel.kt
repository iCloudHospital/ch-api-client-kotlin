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

import org.openapitools.client.models.MediaType

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param mediaType 
 * @param url 
 * @param thumbnailUrl 
 * @param description 
 * @param order 
 */

data class MediaViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("mediaType")
    val mediaType: MediaType? = null,
    @SerializedName("url")
    val url: kotlin.String? = null,
    @SerializedName("thumbnailUrl")
    val thumbnailUrl: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("order")
    val order: kotlin.Int? = null
)

