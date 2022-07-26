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
 * @param tagId 
 * @param normalizedTagId 
 * @param articleTagsCount 
 * @param youtubeTagsCount 
 */

data class TagItemModel (

    @Json(name = "tagId")
    val tagId: kotlin.String? = null,

    @Json(name = "normalizedTagId")
    val normalizedTagId: kotlin.String? = null,

    @Json(name = "articleTagsCount")
    val articleTagsCount: kotlin.Int? = null,

    @Json(name = "youtubeTagsCount")
    val youtubeTagsCount: kotlin.Int? = null

)

