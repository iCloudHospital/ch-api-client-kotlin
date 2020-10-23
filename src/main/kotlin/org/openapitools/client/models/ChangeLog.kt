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


import com.google.gson.annotations.SerializedName
/**
 * 
 * @param id 
 * @param status 
 * @param actorId 
 * @param createdDate 
 */

data class ChangeLog (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("status")
    val status: kotlin.Int? = null,
    @SerializedName("actorId")
    val actorId: java.util.UUID? = null,
    @SerializedName("createdDate")
    val createdDate: java.time.LocalDateTime? = null
)

