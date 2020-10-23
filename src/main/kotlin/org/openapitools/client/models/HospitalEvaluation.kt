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

import com.google.gson.annotations.SerializedName
/**
 * 
 * @param id 
 * @param hospitalId 
 * @param hospital 
 * @param name 
 * @param stars 
 * @param description 
 * @param referenceUrl 
 */

data class HospitalEvaluation (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospital")
    val hospital: Hospital? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("stars")
    val stars: kotlin.Int? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("referenceUrl")
    val referenceUrl: kotlin.String? = null
)

