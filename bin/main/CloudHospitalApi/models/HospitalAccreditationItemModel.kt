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
 * @param hospitalId 
 * @param accreditationId 
 * @param accreditationName 
 * @param accreditationLogo 
 */

data class HospitalAccreditationItemModel (

    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,

    @Json(name = "accreditationId")
    val accreditationId: java.util.UUID? = null,

    @Json(name = "accreditationName")
    val accreditationName: kotlin.String? = null,

    @Json(name = "accreditationLogo")
    val accreditationLogo: kotlin.String? = null

)

