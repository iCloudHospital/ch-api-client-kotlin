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

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param managerId 
 * @param manager 
 * @param hospitalId 
 * @param hospital 
 */

data class ManagerAffiliation (
    @SerializedName("managerId")
    val managerId: java.util.UUID? = null,
    @SerializedName("manager")
    val manager: Manager? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospital")
    val hospital: Hospital? = null
)

