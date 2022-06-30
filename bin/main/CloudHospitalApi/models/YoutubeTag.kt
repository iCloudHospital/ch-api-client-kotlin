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

import CloudHospitalApi.models.Tag
import CloudHospitalApi.models.Youtube

import com.squareup.moshi.Json

/**
 * 
 * @param youtubeId 
 * @param youtube 
 * @param tagId 
 * @param tag 
 * @param order 
 */

data class YoutubeTag (
    @Json(name = "youtubeId")
    val youtubeId: java.util.UUID? = null,
    @Json(name = "youtube")
    val youtube: Youtube? = null,
    @Json(name = "tagId")
    val tagId: kotlin.String? = null,
    @Json(name = "tag")
    val tag: Tag? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null
)
