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

import CloudHospitalApi.models.PagedListMetaData
import CloudHospitalApi.models.SourceModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param items 
 * @param metaData 
 */
@JsonClass(generateAdapter = true)
data class ArticleSourcesModel (

    @Json(name = "items")
    val items: kotlin.collections.List<SourceModel>? = null,

    @Json(name = "metaData")
    val metaData: PagedListMetaData? = null

)

