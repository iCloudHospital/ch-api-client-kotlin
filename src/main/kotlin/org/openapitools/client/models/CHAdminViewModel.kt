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
import org.openapitools.client.models.Gender
import org.openapitools.client.models.UserLanguageViewModel
import org.openapitools.client.models.UserLocationViewModel

import com.google.gson.annotations.SerializedName
/**
 * 
 * @param userType 
 * @param languages 
 * @param locations 
 * @param id 
 * @param userName 
 * @param firstName 
 * @param lastName 
 * @param fullname 
 * @param phone 
 * @param email 
 * @param photo 
 * @param photoThumbnail 
 * @param gender 
 * @param dateOfBirth 
 * @param auditableEntity 
 */

data class CHAdminViewModel (
    @SerializedName("userType")
    val userType: kotlin.String? = null,
    @SerializedName("languages")
    val languages: kotlin.Array<UserLanguageViewModel>? = null,
    @SerializedName("locations")
    val locations: kotlin.Array<UserLocationViewModel>? = null,
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("userName")
    val userName: kotlin.String? = null,
    @SerializedName("firstName")
    val firstName: kotlin.String? = null,
    @SerializedName("lastName")
    val lastName: kotlin.String? = null,
    @SerializedName("fullname")
    val fullname: kotlin.String? = null,
    @SerializedName("phone")
    val phone: kotlin.String? = null,
    @SerializedName("email")
    val email: kotlin.String? = null,
    @SerializedName("photo")
    val photo: kotlin.String? = null,
    @SerializedName("photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @SerializedName("gender")
    val gender: Gender? = null,
    @SerializedName("dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

