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

import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.MediaViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param name 
 * @param description 
 * @param hospitalName 
 * @param medias 
 * @param auditableEntity 
 */

data class UpdateEquipmentCommand (
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("hospitalName")
    val hospitalName: kotlin.String? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

