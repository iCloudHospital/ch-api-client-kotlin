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

import org.openapitools.client.models.Accreditation
import org.openapitools.client.models.Hospital

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param hospitalId 
 * @param hospital 
 * @param accreditationId 
 * @param accreditation 
 */

data class HospitalAccreditation (
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospital")
    val hospital: Hospital? = null,
    @SerializedName("accreditationId")
    val accreditationId: java.util.UUID? = null,
    @SerializedName("accreditation")
    val accreditation: Accreditation? = null
)

