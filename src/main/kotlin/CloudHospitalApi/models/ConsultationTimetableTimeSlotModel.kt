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

import CloudHospitalApi.models.ConsultationTimetableStatus

import com.squareup.moshi.Json

/**
 * 
 *
 * @param startTime 
 * @param endTime 
 * @param status 
 * @param isAvailable 
 */

data class ConsultationTimetableTimeSlotModel (

    @Json(name = "startTime")
    val startTime: java.time.LocalDateTime? = null,

    @Json(name = "endTime")
    val endTime: java.time.LocalDateTime? = null,

    @Json(name = "status")
    val status: ConsultationTimetableStatus? = null,

    @Json(name = "isAvailable")
    val isAvailable: kotlin.Boolean? = null

)

