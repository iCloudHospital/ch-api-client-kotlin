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

import CloudHospitalApi.models.DealItemModel
import CloudHospitalApi.models.PagedListMetaData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param items 
 * @param metaData 
 */
@JsonClass(generateAdapter = true)
data class DealsModel (

    @Json(name = "items")
    val items: kotlin.collections.List<DealItemModel>? = null,

    @Json(name = "metaData")
    val metaData: PagedListMetaData? = null

)

