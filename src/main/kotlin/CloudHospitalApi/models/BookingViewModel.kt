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

import CloudHospitalApi.models.BookingStatus
import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.RefundPolicy
import CloudHospitalApi.models.RejectReason

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param patientId 
 * @param patientName 
 * @param patientPhoto 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param dealId 
 * @param dealName 
 * @param dealSlug 
 * @param dealPackageId 
 * @param refundPolicy 
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
 * @param timeZone 
 * @param status 
 * @param rejectReason 
 * @param rejectComment 
 * @param isOpen 
 * @param completionRate 
 */

data class BookingViewModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "patientId")
    val patientId: java.util.UUID? = null,
    @Json(name = "patientName")
    val patientName: kotlin.String? = null,
    @Json(name = "patientPhoto")
    val patientPhoto: kotlin.String? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @Json(name = "dealId")
    val dealId: java.util.UUID? = null,
    @Json(name = "dealName")
    val dealName: kotlin.String? = null,
    @Json(name = "dealSlug")
    val dealSlug: kotlin.String? = null,
    @Json(name = "dealPackageId")
    val dealPackageId: java.util.UUID? = null,
    @Json(name = "refundPolicy")
    val refundPolicy: RefundPolicy? = null,
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
    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,
    @Json(name = "status")
    val status: BookingStatus? = null,
    @Json(name = "rejectReason")
    val rejectReason: RejectReason? = null,
    @Json(name = "rejectComment")
    val rejectComment: kotlin.String? = null,
    @Json(name = "isOpen")
    val isOpen: kotlin.Boolean? = null,
    @Json(name = "completionRate")
    val completionRate: kotlin.Int? = null
)

