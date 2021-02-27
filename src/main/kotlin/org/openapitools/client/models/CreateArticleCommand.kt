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
package org.openapitools.client.models

import org.openapitools.client.models.ArticleStatus
import org.openapitools.client.models.ArticleTagItemViewModel
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.MediaViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param title 
 * @param description 
 * @param body 
 * @param status 
 * @param marketingType 
 * @param articleTags 
 * @param medias 
 */

data class CreateArticleCommand (
    @Json(name = "title")
    val title: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "body")
    val body: kotlin.String? = null,
    @Json(name = "status")
    val status: ArticleStatus? = null,
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,
    @Json(name = "articleTags")
    val articleTags: kotlin.collections.List<ArticleTagItemViewModel>? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null
)

