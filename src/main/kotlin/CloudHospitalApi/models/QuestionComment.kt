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
import CloudHospitalApi.models.Media
import CloudHospitalApi.models.Question
import CloudHospitalApi.models.User

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param userId 
 * @param user 
 * @param questionId 
 * @param question 
 * @param body 
 * @param medias 
 * @param auditableEntity 
 */

data class QuestionComment (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "userId")
    val userId: java.util.UUID? = null,
    @Json(name = "user")
    val user: User? = null,
    @Json(name = "questionId")
    val questionId: java.util.UUID? = null,
    @Json(name = "question")
    val question: Question? = null,
    @Json(name = "body")
    val body: kotlin.String? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<Media>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

