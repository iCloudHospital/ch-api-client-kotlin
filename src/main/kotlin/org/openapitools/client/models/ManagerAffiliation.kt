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

import org.openapitools.client.models.Hospital
import org.openapitools.client.models.Manager

import com.squareup.moshi.Json

/**
 * 
 * @param managerId 
 * @param manager 
 * @param hospitalId 
 * @param hospital 
 */

data class ManagerAffiliation (
    @Json(name = "managerId")
    val managerId: java.util.UUID? = null,
    @Json(name = "manager")
    val manager: Manager? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospital")
    val hospital: Hospital? = null
)

