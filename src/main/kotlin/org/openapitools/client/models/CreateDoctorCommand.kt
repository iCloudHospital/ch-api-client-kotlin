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

import com.squareup.moshi.Json

/**
 * 
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
 */

data class CreateDoctorCommand (
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "phone")
    val phone: kotlin.String? = null,
    @Json(name = "photo")
    val photo: kotlin.String? = null,
    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @Json(name = "gender")
    val gender: Gender? = null,
    @Json(name = "dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null,
    @Json(name = "languages")
    val languages: kotlin.collections.List<UserLanguageViewModel>? = null,
    @Json(name = "locations")
    val locations: kotlin.collections.List<UserLocationViewModel>? = null,
    @Json(name = "userName")
    val userName: kotlin.String? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "consultationEnabled")
    val consultationEnabled: kotlin.Boolean? = null,
    @Json(name = "consultationFee")
    val consultationFee: kotlin.Double? = null,
    @Json(name = "educations")
    val educations: kotlin.collections.List<DoctorEducationViewModel>? = null,
    @Json(name = "portfolios")
    val portfolios: kotlin.collections.List<DoctorPortfolioViewModel>? = null,
    @Json(name = "specialties")
    val specialties: kotlin.collections.List<DoctorSpecialtyViewModel>? = null,
    @Json(name = "certificates")
    val certificates: kotlin.collections.List<DoctorCertificateViewModel>? = null,
    @Json(name = "awards")
    val awards: kotlin.collections.List<AwardViewModel>? = null
)

