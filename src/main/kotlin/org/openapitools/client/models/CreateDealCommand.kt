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

import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.MediaViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param name 
 * @param description 
 * @param hospitalId 
 * @param marketingType 
 * @param photo 
 * @param photoThumbnail 
 * @param medias 
 */

data class CreateDealCommand (
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,
    @Json(name = "photo")
    val photo: kotlin.String? = null,
    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null
)

