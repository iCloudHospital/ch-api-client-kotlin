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

import CloudHospitalApi.models.AdminMessageViewModel
import CloudHospitalApi.models.SendBirdGroupChannelMember
import CloudHospitalApi.models.SendBirdGroupChannelrOperator

import com.squareup.moshi.Json

/**
 * 
 * @param name 
 * @param channelUrl 
 * @param coverUrl 
 * @param customType 
 * @param unreadMessageCount 
 * @param data 
 * @param isDistinct 
 * @param isPublic 
 * @param isSuper 
 * @param isEphemeral 
 * @param isAccessCodeRequired 
 * @param hiddenState 
 * @param memberCount 
 * @param joinedMemberCount 
 * @param members 
 * @param operators 
 * @param maxLengthMessage 
 * @param lastMessage 
 * @param createdAt 
 * @param freeze 
 */

data class SendBirdGroupChannelViewModel (
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "channel_url")
    val channelUrl: kotlin.String? = null,
    @Json(name = "cover_url")
    val coverUrl: kotlin.String? = null,
    @Json(name = "custom_type")
    val customType: kotlin.String? = null,
    @Json(name = "unread_message_count")
    val unreadMessageCount: kotlin.Int? = null,
    @Json(name = "data")
    val data: kotlin.String? = null,
    @Json(name = "is_distinct")
    val isDistinct: kotlin.Boolean? = null,
    @Json(name = "is_public")
    val isPublic: kotlin.Boolean? = null,
    @Json(name = "is_super")
    val isSuper: kotlin.Boolean? = null,
    @Json(name = "is_ephemeral")
    val isEphemeral: kotlin.Boolean? = null,
    @Json(name = "is_access_code_required")
    val isAccessCodeRequired: kotlin.Boolean? = null,
    @Json(name = "hidden_state")
    val hiddenState: kotlin.String? = null,
    @Json(name = "member_count")
    val memberCount: kotlin.Int? = null,
    @Json(name = "joined_member_count")
    val joinedMemberCount: kotlin.Int? = null,
    @Json(name = "members")
    val members: kotlin.collections.List<SendBirdGroupChannelMember>? = null,
    @Json(name = "operators")
    val operators: kotlin.collections.List<SendBirdGroupChannelrOperator>? = null,
    @Json(name = "max_length_message")
    val maxLengthMessage: kotlin.Int? = null,
    @Json(name = "last_message")
    val lastMessage: AdminMessageViewModel? = null,
    @Json(name = "created_at")
    val createdAt: kotlin.Int? = null,
    @Json(name = "freeze")
    val freeze: kotlin.Boolean? = null
)

