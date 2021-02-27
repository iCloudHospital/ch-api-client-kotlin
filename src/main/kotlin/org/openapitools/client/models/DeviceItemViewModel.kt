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

import org.openapitools.client.models.Platform

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param token 
 * @param platform 
 * @param appAlert 
 * @param eventAlert 
 * @param noticeAlert 
 */

data class DeviceItemViewModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "token")
    val token: kotlin.String? = null,
    @Json(name = "platform")
    val platform: Platform? = null,
    @Json(name = "appAlert")
    val appAlert: kotlin.Boolean? = null,
    @Json(name = "eventAlert")
    val eventAlert: kotlin.Boolean? = null,
    @Json(name = "noticeAlert")
    val noticeAlert: kotlin.Boolean? = null
)

