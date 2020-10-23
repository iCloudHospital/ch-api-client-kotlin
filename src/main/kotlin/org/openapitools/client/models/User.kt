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

import org.openapitools.client.models.Article
import org.openapitools.client.models.AuditableEntity
import org.openapitools.client.models.Device
import org.openapitools.client.models.Gender
import org.openapitools.client.models.QuestionComment
import org.openapitools.client.models.UserLanguage
import org.openapitools.client.models.UserLocation

import com.google.gson.annotations.SerializedName
/**
 * 
 * @param id 
 * @param userName 
 * @param email 
 * @param firstName 
 * @param lastName 
 * @param normalizedName 
 * @param phone 
 * @param photo 
 * @param photoThumbnail 
 * @param gender 
 * @param dateOfBirth 
 * @param timeZone 
 * @param devices 
 * @param articles 
 * @param questionComments 
 * @param locations 
 * @param languages 
 * @param auditableEntity 
 */

data class User (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("userName")
    val userName: kotlin.String? = null,
    @SerializedName("email")
    val email: kotlin.String? = null,
    @SerializedName("firstName")
    val firstName: kotlin.String? = null,
    @SerializedName("lastName")
    val lastName: kotlin.String? = null,
    @SerializedName("normalizedName")
    val normalizedName: kotlin.String? = null,
    @SerializedName("phone")
    val phone: kotlin.String? = null,
    @SerializedName("photo")
    val photo: kotlin.String? = null,
    @SerializedName("photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @SerializedName("gender")
    val gender: Gender? = null,
    @SerializedName("dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @SerializedName("timeZone")
    val timeZone: kotlin.String? = null,
    @SerializedName("devices")
    val devices: kotlin.Array<Device>? = null,
    @SerializedName("articles")
    val articles: kotlin.Array<Article>? = null,
    @SerializedName("questionComments")
    val questionComments: kotlin.Array<QuestionComment>? = null,
    @SerializedName("locations")
    val locations: kotlin.Array<UserLocation>? = null,
    @SerializedName("languages")
    val languages: kotlin.Array<UserLanguage>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

