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

import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.RefundPolicy

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param languageCode 
 * @param dealId 
 * @param dealName 
 * @param dealSlug 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param refundPolicy 
 * @param bonus 
 * @param price 
 * @param auditableEntity 
 * @param additionalServices 
 * @param accomodation 
 * @param transfer 
 */

data class DealPackageModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,

    @Json(name = "dealId")
    val dealId: java.util.UUID? = null,

    @Json(name = "dealName")
    val dealName: kotlin.String? = null,

    @Json(name = "dealSlug")
    val dealSlug: kotlin.String? = null,

    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,

    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,

    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,

    @Json(name = "refundPolicy")
    val refundPolicy: RefundPolicy? = null,

    @Json(name = "bonus")
    val bonus: kotlin.String? = null,

    @Json(name = "price")
    val price: kotlin.Double? = null,

    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null,

    @Json(name = "additionalServices")
    val additionalServices: kotlin.String? = null,

    @Json(name = "accomodation")
    val accomodation: kotlin.String? = null,

    @Json(name = "transfer")
    val transfer: kotlin.String? = null

)

