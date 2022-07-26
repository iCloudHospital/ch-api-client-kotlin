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

import CloudHospitalApi.models.RecurringInterval

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param name 
 * @param memberLimit 
 * @param unitPrice 
 * @param stripePriceId 
 * @param interval 
 * @param isActive 
 * @param order 
 */
@JsonClass(generateAdapter = true)
data class PlanModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "memberLimit")
    val memberLimit: kotlin.Int? = null,

    @Json(name = "unitPrice")
    val unitPrice: kotlin.Double? = null,

    @Json(name = "stripePriceId")
    val stripePriceId: kotlin.String? = null,

    @Json(name = "interval")
    val interval: RecurringInterval? = null,

    @Json(name = "isActive")
    val isActive: kotlin.Boolean? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null

)

