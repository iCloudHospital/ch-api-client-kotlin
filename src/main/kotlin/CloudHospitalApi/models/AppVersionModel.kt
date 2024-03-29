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

import CloudHospitalApi.models.Platform

import com.squareup.moshi.Json

/**
 * 
 *
 * @param platform 
 * @param latestVersion 
 * @param minimumVersion 
 * @param committedDate 
 */

data class AppVersionModel (

    @Json(name = "platform")
    val platform: Platform? = null,

    @Json(name = "latestVersion")
    val latestVersion: kotlin.String? = null,

    @Json(name = "minimumVersion")
    val minimumVersion: kotlin.String? = null,

    @Json(name = "committedDate")
    val committedDate: java.time.LocalDateTime? = null

)

