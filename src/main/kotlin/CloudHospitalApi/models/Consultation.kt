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
import CloudHospitalApi.models.ChangeLog
import CloudHospitalApi.models.ConsultationStatus
import CloudHospitalApi.models.ConsultationType
import CloudHospitalApi.models.Deal
import CloudHospitalApi.models.Doctor
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.Hospital
import CloudHospitalApi.models.Media
import CloudHospitalApi.models.Patient
import CloudHospitalApi.models.Payment
import CloudHospitalApi.models.RejectReason
import CloudHospitalApi.models.Specialty
import CloudHospitalApi.models.User

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param consultationType 
 * @param patientId 
 * @param patient 
 * @param hospitalId 
 * @param hospital 
 * @param specialtyId 
 * @param specialty 
 * @param doctorId 
 * @param doctor 
 * @param dealId 
 * @param deal 
 * @param language 
 * @param isAccountHolder 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param phone 
 * @param dateOfBirth 
 * @param gender 
 * @param comment 
 * @param approximateDateStart 
 * @param approximateDateEnd 
 * @param confirmedDateStart 
 * @param confirmedDateEnd 
 * @param caller 
 * @param callerId 
 * @param fee 
 * @param applicationFee 
 * @param status 
 * @param rejectReason 
 * @param rejectComment 
 * @param isOpen 
 * @param paymentId 
 * @param payment 
 * @param timeZone 
 * @param statusChangeLogs 
 * @param medias 
 * @param auditableEntity 
 */

data class Consultation (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("consultationType")
    val consultationType: ConsultationType? = null,
    @SerializedName("patientId")
    val patientId: java.util.UUID? = null,
    @SerializedName("patient")
    val patient: Patient? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospital")
    val hospital: Hospital? = null,
    @SerializedName("specialtyId")
    val specialtyId: java.util.UUID? = null,
    @SerializedName("specialty")
    val specialty: Specialty? = null,
    @SerializedName("doctorId")
    val doctorId: java.util.UUID? = null,
    @SerializedName("doctor")
    val doctor: Doctor? = null,
    @SerializedName("dealId")
    val dealId: java.util.UUID? = null,
    @SerializedName("deal")
    val deal: Deal? = null,
    @SerializedName("language")
    val language: kotlin.String? = null,
    @SerializedName("isAccountHolder")
    val isAccountHolder: kotlin.Boolean? = null,
    @SerializedName("firstName")
    val firstName: kotlin.String? = null,
    @SerializedName("lastName")
    val lastName: kotlin.String? = null,
    @SerializedName("email")
    val email: kotlin.String? = null,
    @SerializedName("phone")
    val phone: kotlin.String? = null,
    @SerializedName("dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @SerializedName("gender")
    val gender: Gender? = null,
    @SerializedName("comment")
    val comment: kotlin.String? = null,
    @SerializedName("approximateDateStart")
    val approximateDateStart: java.time.LocalDateTime? = null,
    @SerializedName("approximateDateEnd")
    val approximateDateEnd: java.time.LocalDateTime? = null,
    @SerializedName("confirmedDateStart")
    val confirmedDateStart: java.time.LocalDateTime? = null,
    @SerializedName("confirmedDateEnd")
    val confirmedDateEnd: java.time.LocalDateTime? = null,
    @SerializedName("caller")
    val caller: User? = null,
    @SerializedName("callerId")
    val callerId: java.util.UUID? = null,
    @SerializedName("fee")
    val fee: kotlin.Double? = null,
    @SerializedName("applicationFee")
    val applicationFee: kotlin.Double? = null,
    @SerializedName("status")
    val status: ConsultationStatus? = null,
    @SerializedName("rejectReason")
    val rejectReason: RejectReason? = null,
    @SerializedName("rejectComment")
    val rejectComment: kotlin.String? = null,
    @SerializedName("isOpen")
    val isOpen: kotlin.Boolean? = null,
    @SerializedName("paymentId")
    val paymentId: java.util.UUID? = null,
    @SerializedName("payment")
    val payment: Payment? = null,
    @SerializedName("timeZone")
    val timeZone: kotlin.String? = null,
    @SerializedName("statusChangeLogs")
    val statusChangeLogs: kotlin.collections.List<ChangeLog>? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<Media>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)
