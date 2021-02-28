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

import CloudHospitalApi.models.NotificationCode

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param notificationCode 
 * @param notificationTargetId 
 * @param senderId 
 * @param senderName 
 * @param receiverId 
 * @param receiverName 
 * @param message 
 * @param createdAt 
 * @param isChecked 
 */

data class NotificationViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("notificationCode")
    val notificationCode: NotificationCode? = null,
    @SerializedName("notificationTargetId")
    val notificationTargetId: java.util.UUID? = null,
    @SerializedName("senderId")
    val senderId: java.util.UUID? = null,
    @SerializedName("senderName")
    val senderName: kotlin.String? = null,
    @SerializedName("receiverId")
    val receiverId: java.util.UUID? = null,
    @SerializedName("receiverName")
    val receiverName: kotlin.String? = null,
    @SerializedName("message")
    val message: kotlin.String? = null,
    @SerializedName("createdAt")
    val createdAt: java.time.LocalDateTime? = null,
    @SerializedName("isChecked")
    val isChecked: kotlin.Boolean? = null
)

