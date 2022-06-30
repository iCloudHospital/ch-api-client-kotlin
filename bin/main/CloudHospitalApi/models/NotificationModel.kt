/**
* Swagger UI - Cloud Hospital Api-DEV
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 2
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package CloudHospitalApi.models

import CloudHospitalApi.models.NotificationCode

import com.squareup.moshi.Json

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
 * @param isDeleted 
 */

data class NotificationModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "notificationCode")
    val notificationCode: NotificationCode? = null,
    @Json(name = "notificationTargetId")
    val notificationTargetId: java.util.UUID? = null,
    @Json(name = "senderId")
    val senderId: java.util.UUID? = null,
    @Json(name = "senderName")
    val senderName: kotlin.String? = null,
    @Json(name = "receiverId")
    val receiverId: java.util.UUID? = null,
    @Json(name = "receiverName")
    val receiverName: kotlin.String? = null,
    @Json(name = "message")
    val message: kotlin.String? = null,
    @Json(name = "createdAt")
    val createdAt: java.time.LocalDateTime? = null,
    @Json(name = "isChecked")
    val isChecked: kotlin.Boolean? = null,
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean? = null
)

