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
import CloudHospitalApi.models.QuestionStatus
import CloudHospitalApi.models.QuestionType
import CloudHospitalApi.models.RefundPolicy

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param title 
 * @param userId 
 * @param userName 
 * @param fullName 
 * @param hospitalId 
 * @param hospitalName 
 * @param questionType 
 * @param questionStatus 
 * @param questionCommentsCount 
 * @param dealId 
 * @param dealName 
 * @param dealPackageId 
 * @param refundPolicy 
 * @param quantity 
 * @param auditableEntity 
 * @param body 
 * @param medias 
 */

data class QuestionViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("title")
    val title: kotlin.String? = null,
    @SerializedName("userId")
    val userId: java.util.UUID? = null,
    @SerializedName("userName")
    val userName: kotlin.String? = null,
    @SerializedName("fullName")
    val fullName: kotlin.String? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospitalName")
    val hospitalName: kotlin.String? = null,
    @SerializedName("questionType")
    val questionType: QuestionType? = null,
    @SerializedName("questionStatus")
    val questionStatus: QuestionStatus? = null,
    @SerializedName("questionCommentsCount")
    val questionCommentsCount: kotlin.Int? = null,
    @SerializedName("dealId")
    val dealId: java.util.UUID? = null,
    @SerializedName("dealName")
    val dealName: kotlin.String? = null,
    @SerializedName("dealPackageId")
    val dealPackageId: java.util.UUID? = null,
    @SerializedName("refundPolicy")
    val refundPolicy: RefundPolicy? = null,
    @SerializedName("quantity")
    val quantity: kotlin.Int? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null,
    @SerializedName("body")
    val body: kotlin.String? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null
)

