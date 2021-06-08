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

import CloudHospitalApi.models.ConsultationStatus
import CloudHospitalApi.models.ConsultationType
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.RejectReason

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param consultationType 
 * @param patientId 
 * @param patientName 
 * @param communicationUserId 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param specialtyId 
 * @param specialtyName 
 * @param specialtySlug 
 * @param doctorId 
 * @param doctorName 
 * @param doctorSlug 
 * @param dealId 
 * @param dealName 
 * @param dealSlug 
 * @param language 
 * @param isAccountHolder 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param phone 
 * @param dateOfBirth 
 * @param gender 
 * @param comment 
 * @param timeRange 
 * @param approximateDateStart 
 * @param approximateDateEnd 
 * @param confirmedDateStart 
 * @param confirmedDateEnd 
 * @param callerName 
 * @param callerId 
 * @param fee 
 * @param applicationFee 
 * @param timeZone 
 * @param status 
 * @param rejectReason 
 * @param isOpen 
 * @param paymentId 
 */

data class ConsultationItemViewModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "consultationType")
    val consultationType: ConsultationType? = null,
    @Json(name = "patientId")
    val patientId: java.util.UUID? = null,
    @Json(name = "patientName")
    val patientName: kotlin.String? = null,
    @Json(name = "communicationUserId")
    val communicationUserId: kotlin.String? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @Json(name = "specialtyId")
    val specialtyId: java.util.UUID? = null,
    @Json(name = "specialtyName")
    val specialtyName: kotlin.String? = null,
    @Json(name = "specialtySlug")
    val specialtySlug: kotlin.String? = null,
    @Json(name = "doctorId")
    val doctorId: java.util.UUID? = null,
    @Json(name = "doctorName")
    val doctorName: kotlin.String? = null,
    @Json(name = "doctorSlug")
    val doctorSlug: kotlin.String? = null,
    @Json(name = "dealId")
    val dealId: java.util.UUID? = null,
    @Json(name = "dealName")
    val dealName: kotlin.String? = null,
    @Json(name = "dealSlug")
    val dealSlug: kotlin.String? = null,
    @Json(name = "language")
    val language: kotlin.String? = null,
    @Json(name = "isAccountHolder")
    val isAccountHolder: kotlin.Boolean? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "phone")
    val phone: kotlin.String? = null,
    @Json(name = "dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @Json(name = "gender")
    val gender: Gender? = null,
    @Json(name = "comment")
    val comment: kotlin.String? = null,
    @Json(name = "timeRange")
    val timeRange: kotlin.String? = null,
    @Json(name = "approximateDateStart")
    val approximateDateStart: java.time.LocalDateTime? = null,
    @Json(name = "approximateDateEnd")
    val approximateDateEnd: java.time.LocalDateTime? = null,
    @Json(name = "confirmedDateStart")
    val confirmedDateStart: java.time.LocalDateTime? = null,
    @Json(name = "confirmedDateEnd")
    val confirmedDateEnd: java.time.LocalDateTime? = null,
    @Json(name = "callerName")
    val callerName: kotlin.String? = null,
    @Json(name = "callerId")
    val callerId: java.util.UUID? = null,
    @Json(name = "fee")
    val fee: kotlin.Double? = null,
    @Json(name = "applicationFee")
    val applicationFee: kotlin.Double? = null,
    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,
    @Json(name = "status")
    val status: ConsultationStatus? = null,
    @Json(name = "rejectReason")
    val rejectReason: RejectReason? = null,
    @Json(name = "isOpen")
    val isOpen: kotlin.Boolean? = null,
    @Json(name = "paymentId")
    val paymentId: java.util.UUID? = null
)

