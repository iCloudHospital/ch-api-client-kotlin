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

import CloudHospitalApi.models.NotificationModel
import CloudHospitalApi.models.PagedListMetaData

import com.squareup.moshi.Json

/**
 * 
 *
 * @param items 
 * @param metaData 
 * @param unreadCount 
 */

data class NotificationsModel (

    @Json(name = "items")
    val items: kotlin.collections.List<NotificationModel>? = null,

    @Json(name = "metaData")
    val metaData: PagedListMetaData? = null,

    @Json(name = "unreadCount")
    val unreadCount: kotlin.Int? = null

)
