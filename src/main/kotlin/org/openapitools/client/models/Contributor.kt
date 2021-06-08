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

import org.openapitools.client.models.ArticleContributor
import org.openapitools.client.models.AuditableEntity
import org.openapitools.client.models.SnsHandle

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param name 
 * @param slug 
 * @param email 
 * @param photo 
 * @param description 
 * @param website 
 * @param snsHandles 
 * @param articleContributors 
 * @param auditableEntity 
 */

data class Contributor (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("email")
    val email: kotlin.String? = null,
    @SerializedName("photo")
    val photo: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("website")
    val website: kotlin.String? = null,
    @SerializedName("snsHandles")
    val snsHandles: kotlin.collections.List<SnsHandle>? = null,
    @SerializedName("articleContributors")
    val articleContributors: kotlin.collections.List<ArticleContributor>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)
