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


import com.squareup.moshi.Json

/**
 * 
 * @param token 
 * @param tags 
 * @param appAlert 
 * @param eventAlert 
 * @param noticeAlert 
 */

data class UpdateDeviceCommand (
    @Json(name = "token")
    val token: kotlin.String? = null,
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "appAlert")
    val appAlert: kotlin.Boolean? = null,
    @Json(name = "eventAlert")
    val eventAlert: kotlin.Boolean? = null,
    @Json(name = "noticeAlert")
    val noticeAlert: kotlin.Boolean? = null
)
