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

import CloudHospitalApi.models.ReviewType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param serviceId 
 * @param patientId 
 * @param name 
 * @param description 
 * @param content 
 * @param recommended 
 * @param rate 
 * @param reviewType 
 */

data class CreateServiceReviewCommand (

    @Json(name = "serviceId")
    val serviceId: java.util.UUID? = null,

    @Json(name = "patientId")
    val patientId: java.util.UUID? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "recommended")
    val recommended: kotlin.Boolean? = null,

    @Json(name = "rate")
    val rate: kotlin.Int? = null,

    @Json(name = "reviewType")
    val reviewType: ReviewType? = null

)

