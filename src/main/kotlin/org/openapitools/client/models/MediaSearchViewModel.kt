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

data class MediaSearchViewModel (
    @SerializedName("id")
    val id: kotlin.String? = null,
    @SerializedName("mediaType")
    val mediaType: kotlin.Int? = null,
    @SerializedName("url")
    val url: kotlin.String? = null,
    @SerializedName("thumbnailUrl")
    val thumbnailUrl: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("order")
    val order: kotlin.Int? = null
)
