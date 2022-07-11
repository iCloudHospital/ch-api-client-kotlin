/**
 * Swagger UI - Cloud Hospital Api-INT
 *
 * Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
 *
 * The version of the OpenAPI document: 2
 * Contact: hyounoosung@icloudhospital.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package CloudHospitalApi.models

import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.MembershipModel
import CloudHospitalApi.models.UserLanguageModel
import CloudHospitalApi.models.UserLocationModel

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param userName 
 * @param firstName 
 * @param lastName 
 * @param fullName 
 * @param userType 
 * @param photo 
 * @param photoThumbnail 
 * @param auditableEntity 
 * @param phone 
 * @param email 
 * @param gender 
 * @param dateOfBirth 
 * @param timeZone 
 * @param communicationUserId 
 * @param languages 
 * @param locations 
 * @param membership 
 */

data class PatientModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "userName")
    val userName: kotlin.String? = null,

    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    @Json(name = "fullName")
    val fullName: kotlin.String? = null,

    @Json(name = "userType")
    val userType: kotlin.String? = null,

    @Json(name = "photo")
    val photo: kotlin.String? = null,

    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,

    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null,

    @Json(name = "phone")
    val phone: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "gender")
    val gender: Gender? = null,

    @Json(name = "dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,

    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,

    @Json(name = "communicationUserId")
    val communicationUserId: kotlin.String? = null,

    @Json(name = "languages")
    val languages: kotlin.collections.List<UserLanguageModel>? = null,

    @Json(name = "locations")
    val locations: kotlin.collections.List<UserLocationModel>? = null,

    @Json(name = "membership")
    val membership: MembershipModel? = null

)

