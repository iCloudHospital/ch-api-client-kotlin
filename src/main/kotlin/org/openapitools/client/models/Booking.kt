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

import org.openapitools.client.models.AuditableEntity
import org.openapitools.client.models.BookingStatus
import org.openapitools.client.models.ChangeLog
import org.openapitools.client.models.DealPackage
import org.openapitools.client.models.Gender
import org.openapitools.client.models.Hospital
import org.openapitools.client.models.Media
import org.openapitools.client.models.Patient
import org.openapitools.client.models.Payment
import org.openapitools.client.models.RejectReason

import com.google.gson.annotations.SerializedName

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
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("patientId")
    val patientId: java.util.UUID? = null,
    @SerializedName("patient")
    val patient: Patient? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospital")
    val hospital: Hospital? = null,
    @SerializedName("dealPackageId")
    val dealPackageId: java.util.UUID? = null,
    @SerializedName("dealPackage")
    val dealPackage: DealPackage? = null,
    @SerializedName("quantity")
    val quantity: kotlin.Int? = null,
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
    @SerializedName("fee")
    val fee: kotlin.Double? = null,
    @SerializedName("applicationFee")
    val applicationFee: kotlin.Double? = null,
    @SerializedName("status")
    val status: BookingStatus? = null,
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

