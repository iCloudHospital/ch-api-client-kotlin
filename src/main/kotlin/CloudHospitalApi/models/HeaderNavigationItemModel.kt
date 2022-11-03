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
 * @param name 
 * @param url 
 * @param order 
 * @param level 
 * @param parentId 
 * @param subItems 
 */

data class HeaderNavigationItemModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "url")
    val url: kotlin.String? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null,

    @Json(name = "level")
    val level: kotlin.Int? = null,

    @Json(name = "parentId")
    val parentId: java.util.UUID? = null,

    @Json(name = "subItems")
    val subItems: kotlin.collections.List<HeaderNavigationItemModel>? = null

)
