/**
* Swagger UI - Cloud Hospital Api-INT
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 1
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package CloudHospitalApi.models


import com.squareup.moshi.Json

/**
 * 
 * @param messageId 
 * @param type 
 * @param customType 
 * @param channelUrl 
 * @param mentionType 
 * @param isRemoved 
 * @param message 
 * @param data 
 * @param createdAt 
 * @param updatedAt 
 */

data class AdminMessageViewModel (
    @Json(name = "message_id")
    val messageId: kotlin.Int? = null,
    @Json(name = "type")
    val type: kotlin.String? = null,
    @Json(name = "custom_type")
    val customType: kotlin.String? = null,
    @Json(name = "channel_url")
    val channelUrl: kotlin.String? = null,
    @Json(name = "mention_type")
    val mentionType: kotlin.String? = null,
    @Json(name = "is_removed")
    val isRemoved: kotlin.Boolean? = null,
    @Json(name = "message")
    val message: kotlin.String? = null,
    @Json(name = "data")
    val data: kotlin.String? = null,
    @Json(name = "created_at")
    val createdAt: kotlin.Long? = null,
    @Json(name = "updated_at")
    val updatedAt: kotlin.Long? = null
)

