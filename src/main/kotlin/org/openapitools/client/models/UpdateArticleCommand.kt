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

import org.openapitools.client.models.ArticleContributorItemViewModel
import org.openapitools.client.models.ArticleSourceItemViewModel
import org.openapitools.client.models.ArticleStatus
import org.openapitools.client.models.ArticleTagItemViewModel
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.MediaViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param title 
 * @param slug 
 * @param description 
 * @param body 
 * @param status 
 * @param marketingType 
 * @param hospitalSlug 
 * @param youtubeUrl 
 * @param articleTags 
 * @param articleSources 
 * @param articleContributors 
 * @param medias 
 */

data class UpdateArticleCommand (
    @SerializedName("title")
    val title: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("body")
    val body: kotlin.String? = null,
    @SerializedName("status")
    val status: ArticleStatus? = null,
    @SerializedName("marketingType")
    val marketingType: MarketingType? = null,
    @SerializedName("hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @SerializedName("youtubeUrl")
    val youtubeUrl: kotlin.String? = null,
    @SerializedName("articleTags")
    val articleTags: kotlin.collections.List<ArticleTagItemViewModel>? = null,
    @SerializedName("articleSources")
    val articleSources: kotlin.collections.List<ArticleSourceItemViewModel>? = null,
    @SerializedName("articleContributors")
    val articleContributors: kotlin.collections.List<ArticleContributorItemViewModel>? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null
)
