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
 * @param name 
 * @param additionalInfo 
 */

data class UpdateDepartmentCommand (
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "additionalInfo")
    val additionalInfo: kotlin.String? = null
)

