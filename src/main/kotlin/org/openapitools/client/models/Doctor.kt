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
import org.openapitools.client.models.Award
import org.openapitools.client.models.Device
import org.openapitools.client.models.DoctorAffiliation
import org.openapitools.client.models.DoctorCertificate
import org.openapitools.client.models.DoctorEducation
import org.openapitools.client.models.DoctorPortfolio
import org.openapitools.client.models.DoctorReview
import org.openapitools.client.models.DoctorSpecialty
import org.openapitools.client.models.Gender
import org.openapitools.client.models.Media
import org.openapitools.client.models.QuestionComment
import org.openapitools.client.models.UserLanguage
import org.openapitools.client.models.UserLocation

import com.squareup.moshi.Json

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
 * @param communicationUserId 
 * @param devices 
 * @param articles 
 * @param questionComments 
 * @param locations 
 * @param languages 
 * @param auditableEntity 
 * @param slug 
 * @param startPracticeDate 
 * @param overview 
 * @param consultationEnabled 
 * @param consultationFee 
 * @param doctorReviews 
 * @param doctorEducations 
 * @param doctorPortfolios 
 * @param doctorSpecialties 
 * @param doctorCertificates 
 * @param doctorAffiliations 
 * @param awards 
 * @param medias 
 */

data class Doctor (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "userName")
    val userName: kotlin.String? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "normalizedName")
    val normalizedName: kotlin.String? = null,
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
    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,
    @Json(name = "communicationUserId")
    val communicationUserId: kotlin.String? = null,
    @Json(name = "devices")
    val devices: kotlin.collections.List<Device>? = null,
    @Json(name = "articles")
    val articles: kotlin.collections.List<Article>? = null,
    @Json(name = "questionComments")
    val questionComments: kotlin.collections.List<QuestionComment>? = null,
    @Json(name = "locations")
    val locations: kotlin.collections.List<UserLocation>? = null,
    @Json(name = "languages")
    val languages: kotlin.collections.List<UserLanguage>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "startPracticeDate")
    val startPracticeDate: java.time.LocalDateTime? = null,
    @Json(name = "overview")
    val overview: kotlin.String? = null,
    @Json(name = "consultationEnabled")
    val consultationEnabled: kotlin.Boolean? = null,
    @Json(name = "consultationFee")
    val consultationFee: kotlin.Double? = null,
    @Json(name = "doctorReviews")
    val doctorReviews: kotlin.collections.List<DoctorReview>? = null,
    @Json(name = "doctorEducations")
    val doctorEducations: kotlin.collections.List<DoctorEducation>? = null,
    @Json(name = "doctorPortfolios")
    val doctorPortfolios: kotlin.collections.List<DoctorPortfolio>? = null,
    @Json(name = "doctorSpecialties")
    val doctorSpecialties: kotlin.collections.List<DoctorSpecialty>? = null,
    @Json(name = "doctorCertificates")
    val doctorCertificates: kotlin.collections.List<DoctorCertificate>? = null,
    @Json(name = "doctorAffiliations")
    val doctorAffiliations: kotlin.collections.List<DoctorAffiliation>? = null,
    @Json(name = "awards")
    val awards: kotlin.collections.List<Award>? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<Media>? = null
)

