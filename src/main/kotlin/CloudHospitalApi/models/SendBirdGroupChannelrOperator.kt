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
 * @param userId 
 * @param nickname 
 * @param profileUrl 
 */
@JsonClass(generateAdapter = true)
data class SendBirdGroupChannelrOperator (

    @Json(name = "user_id")
    val userId: kotlin.String? = null,

    @Json(name = "nickname")
    val nickname: kotlin.String? = null,

    @Json(name = "profile_url")
    val profileUrl: kotlin.String? = null

)

