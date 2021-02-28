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

import CloudHospitalApi.models.Article
import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.Booking
import CloudHospitalApi.models.Consultation
import CloudHospitalApi.models.Customer
import CloudHospitalApi.models.Device
import CloudHospitalApi.models.DoctorReview
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.HospitalReview
import CloudHospitalApi.models.Payment
import CloudHospitalApi.models.Question
import CloudHospitalApi.models.QuestionComment
import CloudHospitalApi.models.UserLanguage
import CloudHospitalApi.models.UserLocation

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
 * @param communicationUserId 
 * @param devices 
 * @param articles 
 * @param questionComments 
 * @param locations 
 * @param languages 
 * @param auditableEntity 
 * @param contact 
 * @param contactNumber 
 * @param nationality 
 * @param questions 
 * @param bookings 
 * @param consultations 
 * @param payments 
 * @param customers 
 * @param doctorReviews 
 * @param hospitalReviews 
 */

data class Patient (
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
    @SerializedName("communicationUserId")
    val communicationUserId: kotlin.String? = null,
    @SerializedName("devices")
    val devices: kotlin.collections.List<Device>? = null,
    @SerializedName("articles")
    val articles: kotlin.collections.List<Article>? = null,
    @SerializedName("questionComments")
    val questionComments: kotlin.collections.List<QuestionComment>? = null,
    @SerializedName("locations")
    val locations: kotlin.collections.List<UserLocation>? = null,
    @SerializedName("languages")
    val languages: kotlin.collections.List<UserLanguage>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null,
    @SerializedName("contact")
    val contact: kotlin.String? = null,
    @SerializedName("contactNumber")
    val contactNumber: kotlin.String? = null,
    @SerializedName("nationality")
    val nationality: kotlin.String? = null,
    @SerializedName("questions")
    val questions: kotlin.collections.List<Question>? = null,
    @SerializedName("bookings")
    val bookings: kotlin.collections.List<Booking>? = null,
    @SerializedName("consultations")
    val consultations: kotlin.collections.List<Consultation>? = null,
    @SerializedName("payments")
    val payments: kotlin.collections.List<Payment>? = null,
    @SerializedName("customers")
    val customers: kotlin.collections.List<Customer>? = null,
    @SerializedName("doctorReviews")
    val doctorReviews: kotlin.collections.List<DoctorReview>? = null,
    @SerializedName("hospitalReviews")
    val hospitalReviews: kotlin.collections.List<HospitalReview>? = null
)

