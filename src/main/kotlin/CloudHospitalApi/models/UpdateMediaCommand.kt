/**
* Swagger UI - Cloud Hospital Api-DEV
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 2
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package CloudHospitalApi.models

import CloudHospitalApi.models.MediaType

import com.squareup.moshi.Json

/**
 * 
 * @param mediaType 
 * @param url 
 * @param thumbnailUrl 
 * @param description 
 * @param order 
 */

data class UpdateMediaCommand (
    @Json(name = "mediaType")
    val mediaType: MediaType? = null,
    @Json(name = "url")
    val url: kotlin.String? = null,
    @Json(name = "thumbnailUrl")
    val thumbnailUrl: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null
)

