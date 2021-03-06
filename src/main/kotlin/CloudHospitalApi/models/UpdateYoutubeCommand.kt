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

import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.YoutubeTagItemViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param title 
 * @param slug 
 * @param description 
 * @param url 
 * @param youtubeTags 
 * @param marketingType 
 */

data class UpdateYoutubeCommand (
    @Json(name = "title")
    val title: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "url")
    val url: kotlin.String? = null,
    @Json(name = "youtubeTags")
    val youtubeTags: kotlin.collections.List<YoutubeTagItemViewModel>? = null,
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null
)

