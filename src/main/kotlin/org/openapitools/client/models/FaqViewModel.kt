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
import org.openapitools.client.models.MediaViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param title 
 * @param slug 
 * @param content 
 * @param medias 
 * @param auditableEntity 
 */

data class FaqViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("title")
    val title: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("content")
    val content: kotlin.String? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

