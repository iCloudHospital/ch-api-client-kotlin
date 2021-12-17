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
import CloudHospitalApi.models.BookingStatus
import CloudHospitalApi.models.ChangeLog
import CloudHospitalApi.models.DealPackage
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.Hospital
import CloudHospitalApi.models.Media
import CloudHospitalApi.models.Patient
import CloudHospitalApi.models.Payment
import CloudHospitalApi.models.RejectReason

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param patientId 
 * @param patient 
 * @param hospitalId 
 * @param hospital 
 * @param dealPackageId 
 * @param dealPackage 
 * @param quantity 
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

data class Booking (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "patientId")
    val patientId: java.util.UUID? = null,
    @Json(name = "patient")
    val patient: Patient? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospital")
    val hospital: Hospital? = null,
    @Json(name = "dealPackageId")
    val dealPackageId: java.util.UUID? = null,
    @Json(name = "dealPackage")
    val dealPackage: DealPackage? = null,
    @Json(name = "quantity")
    val quantity: kotlin.Int? = null,
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
    @Json(name = "approximateDateStart")
    val approximateDateStart: java.time.LocalDateTime? = null,
    @Json(name = "approximateDateEnd")
    val approximateDateEnd: java.time.LocalDateTime? = null,
    @Json(name = "confirmedDateStart")
    val confirmedDateStart: java.time.LocalDateTime? = null,
    @Json(name = "confirmedDateEnd")
    val confirmedDateEnd: java.time.LocalDateTime? = null,
    @Json(name = "fee")
    val fee: kotlin.Double? = null,
    @Json(name = "applicationFee")
    val applicationFee: kotlin.Double? = null,
    @Json(name = "status")
    val status: BookingStatus? = null,
    @Json(name = "rejectReason")
    val rejectReason: RejectReason? = null,
    @Json(name = "rejectComment")
    val rejectComment: kotlin.String? = null,
    @Json(name = "isOpen")
    val isOpen: kotlin.Boolean? = null,
    @Json(name = "paymentId")
    val paymentId: java.util.UUID? = null,
    @Json(name = "payment")
    val payment: Payment? = null,
    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,
    @Json(name = "statusChangeLogs")
    val statusChangeLogs: kotlin.collections.List<ChangeLog>? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<Media>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

