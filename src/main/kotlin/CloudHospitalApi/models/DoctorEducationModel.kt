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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param doctorId 
 * @param doctorName 
 * @param institution 
 * @param qualification 
 * @param graduationDate 
 * @param graduationYear 
 * @param graduationMonth 
 */
@JsonClass(generateAdapter = true)
data class DoctorEducationModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "doctorId")
    val doctorId: java.util.UUID? = null,

    @Json(name = "doctorName")
    val doctorName: kotlin.String? = null,

    @Json(name = "institution")
    val institution: kotlin.String? = null,

    @Json(name = "qualification")
    val qualification: kotlin.String? = null,

    @Json(name = "graduationDate")
    val graduationDate: java.time.LocalDateTime? = null,

    @Json(name = "graduationYear")
    val graduationYear: kotlin.Int? = null,

    @Json(name = "graduationMonth")
    val graduationMonth: kotlin.Int? = null

)

