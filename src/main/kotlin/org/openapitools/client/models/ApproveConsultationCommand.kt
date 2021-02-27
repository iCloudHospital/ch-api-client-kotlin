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


import com.squareup.moshi.Json

/**
 * 
 * @param confirmedDateStart 
 * @param confirmedDateEnd 
 * @param callerId 
 */

data class ApproveConsultationCommand (
    @Json(name = "confirmedDateStart")
    val confirmedDateStart: java.time.LocalDateTime? = null,
    @Json(name = "confirmedDateEnd")
    val confirmedDateEnd: java.time.LocalDateTime? = null,
    @Json(name = "callerId")
    val callerId: java.util.UUID? = null
)

