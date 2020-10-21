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

import org.openapitools.client.models.AwardViewModel
import org.openapitools.client.models.DoctorCertificateViewModel
import org.openapitools.client.models.DoctorEducationViewModel
import org.openapitools.client.models.DoctorPortfolioViewModel
import org.openapitools.client.models.DoctorSpecialtyViewModel
import org.openapitools.client.models.Gender
import org.openapitools.client.models.MediaViewModel
import org.openapitools.client.models.UserLanguageViewModel
import org.openapitools.client.models.UserLocationViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param userName 
 * @param email 
 * @param hospitalId 
 * @param consultationEnabled 
 * @param consultationFee 
 * @param educations 
 * @param portfolios 
 * @param specialties 
 * @param certificates 
 * @param awards 
 * @param firstName 
 * @param lastName 
 * @param phone 
 * @param photo 
 * @param photoThumbnail 
 * @param gender 
 * @param dateOfBirth 
 * @param medias 
 * @param languages 
 * @param locations 
 */

data class CreateDoctorCommand (
    @SerializedName("userName")
    val userName: kotlin.String? = null,
    @SerializedName("email")
    val email: kotlin.String? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("consultationEnabled")
    val consultationEnabled: kotlin.Boolean? = null,
    @SerializedName("consultationFee")
    val consultationFee: kotlin.Double? = null,
    @SerializedName("educations")
    val educations: kotlin.collections.List<DoctorEducationViewModel>? = null,
    @SerializedName("portfolios")
    val portfolios: kotlin.collections.List<DoctorPortfolioViewModel>? = null,
    @SerializedName("specialties")
    val specialties: kotlin.collections.List<DoctorSpecialtyViewModel>? = null,
    @SerializedName("certificates")
    val certificates: kotlin.collections.List<DoctorCertificateViewModel>? = null,
    @SerializedName("awards")
    val awards: kotlin.collections.List<AwardViewModel>? = null,
    @SerializedName("firstName")
    val firstName: kotlin.String? = null,
    @SerializedName("lastName")
    val lastName: kotlin.String? = null,
    @SerializedName("phone")
    val phone: kotlin.String? = null,
    @SerializedName("photo")
    val photo: kotlin.String? = null,
    @SerializedName("photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @SerializedName("gender")
    val gender: Gender? = null,
    @SerializedName("dateOfBirth")
    val dateOfBirth: java.time.OffsetDateTime? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null,
    @SerializedName("languages")
    val languages: kotlin.collections.List<UserLanguageViewModel>? = null,
    @SerializedName("locations")
    val locations: kotlin.collections.List<UserLocationViewModel>? = null
)

