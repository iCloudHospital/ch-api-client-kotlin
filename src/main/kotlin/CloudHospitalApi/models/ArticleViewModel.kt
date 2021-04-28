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

import CloudHospitalApi.models.ArticleSourceItemViewModel
import CloudHospitalApi.models.ArticleStatus
import CloudHospitalApi.models.ArticleTagItemViewModel
import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.MediaViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param title 
 * @param slug 
 * @param description 
 * @param body 
 * @param status 
 * @param marketingType 
 * @param userId 
 * @param userName 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param reviewerId 
 * @param reviewerName 
 * @param reviewerSlug 
 * @param reviewerPhoto 
 * @param youtubeUrl 
 * @param articleTags 
 * @param articleSources 
 * @param medias 
 * @param auditableEntity 
 */

data class ArticleViewModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "title")
    val title: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "body")
    val body: kotlin.String? = null,
    @Json(name = "status")
    val status: ArticleStatus? = null,
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,
    @Json(name = "userId")
    val userId: java.util.UUID? = null,
    @Json(name = "userName")
    val userName: kotlin.String? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @Json(name = "reviewerId")
    val reviewerId: java.util.UUID? = null,
    @Json(name = "reviewerName")
    val reviewerName: kotlin.String? = null,
    @Json(name = "reviewerSlug")
    val reviewerSlug: kotlin.String? = null,
    @Json(name = "reviewerPhoto")
    val reviewerPhoto: kotlin.String? = null,
    @Json(name = "youtubeUrl")
    val youtubeUrl: kotlin.String? = null,
    @Json(name = "articleTags")
    val articleTags: kotlin.collections.List<ArticleTagItemViewModel>? = null,
    @Json(name = "articleSources")
    val articleSources: kotlin.collections.List<ArticleSourceItemViewModel>? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

