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

import CloudHospitalApi.models.MediaViewModel
import CloudHospitalApi.models.QuestionStatus
import CloudHospitalApi.models.QuestionType

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param title 
 * @param body 
 * @param questionType 
 * @param questionStatus 
 * @param dealPackageId 
 * @param quantity 
 * @param medias 
 */

data class CreateQuestionCommand (
    @SerializedName("title")
    val title: kotlin.String? = null,
    @SerializedName("body")
    val body: kotlin.String? = null,
    @SerializedName("questionType")
    val questionType: QuestionType? = null,
    @SerializedName("questionStatus")
    val questionStatus: QuestionStatus? = null,
    @SerializedName("dealPackageId")
    val dealPackageId: java.util.UUID? = null,
    @SerializedName("quantity")
    val quantity: kotlin.Int? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null
)
