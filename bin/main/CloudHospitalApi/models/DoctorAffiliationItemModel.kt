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

/**
 * 
 *
 * @param languageCode 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param order 
 */

data class DoctorAffiliationItemModel (

    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,

    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,

    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,

    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null

)

