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
import CloudHospitalApi.models.DoctorAffiliationItemModel
import CloudHospitalApi.models.DoctorSpecialtyItemModel

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param languageCode 
 * @param userName 
 * @param firstName 
 * @param lastName 
 * @param fullName 
 * @param userType 
 * @param photo 
 * @param photoThumbnail 
 * @param auditableEntity 
 * @param consultationEnabled 
 * @param consultationFee 
 * @param doctorSpecialties 
 * @param doctorAffiliations 
 */

data class DoctorItemModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,

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

    @Json(name = "consultationEnabled")
    val consultationEnabled: kotlin.Boolean? = null,

    @Json(name = "consultationFee")
    val consultationFee: kotlin.Double? = null,

    @Json(name = "doctorSpecialties")
    val doctorSpecialties: kotlin.collections.List<DoctorSpecialtyItemModel>? = null,

    @Json(name = "doctorAffiliations")
    val doctorAffiliations: kotlin.collections.List<DoctorAffiliationItemModel>? = null

)

