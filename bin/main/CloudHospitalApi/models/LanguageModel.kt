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
 * @param id 
 * @param code 
 * @param name 
 * @param description 
 * @param published 
 * @param order 
 */

data class LanguageModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "code")
    val code: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "published")
    val published: kotlin.Boolean? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null

)

