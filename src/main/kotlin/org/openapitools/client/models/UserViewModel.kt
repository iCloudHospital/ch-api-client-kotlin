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

import com.squareup.moshi.Json

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

data class UserViewModel (
    @Json(name = "userType")
    val userType: kotlin.String? = null,
    @Json(name = "languages")
    val languages: kotlin.collections.List<UserLanguageViewModel>? = null,
    @Json(name = "locations")
    val locations: kotlin.collections.List<UserLocationViewModel>? = null,
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "userName")
    val userName: kotlin.String? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "fullname")
    val fullname: kotlin.String? = null,
    @Json(name = "phone")
    val phone: kotlin.String? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "photo")
    val photo: kotlin.String? = null,
    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @Json(name = "gender")
    val gender: Gender? = null,
    @Json(name = "dateOfBirth")
    val dateOfBirth: java.time.OffsetDateTime? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

