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
 * @param articleId 
 * @param tagId 
 * @param order 
 */
@JsonClass(generateAdapter = true)
data class ArticleTagItemModel (

    @Json(name = "articleId")
    val articleId: java.util.UUID? = null,

    @Json(name = "tagId")
    val tagId: kotlin.String? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null

)

