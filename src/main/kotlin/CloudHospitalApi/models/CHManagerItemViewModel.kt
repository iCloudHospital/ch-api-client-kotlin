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
package CloudHospitalApi.models

import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.Gender

import com.google.gson.annotations.SerializedName

/**
 * 
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
 * @param timeZone 
 * @param communicationUserId 
 * @param auditableEntity 
 */

data class CHManagerItemViewModel (
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
    @SerializedName("timeZone")
    val timeZone: kotlin.String? = null,
    @SerializedName("communicationUserId")
    val communicationUserId: kotlin.String? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

