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
import org.openapitools.client.models.Service
import org.openapitools.client.models.Specialty

import com.squareup.moshi.Json

/**
 * 
 * @param hospitalId 
 * @param hospital 
 * @param specialtyId 
 * @param specialty 
 * @param order 
 * @param services 
 */

data class HospitalSpecialty (
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospital")
    val hospital: Hospital? = null,
    @Json(name = "specialtyId")
    val specialtyId: java.util.UUID? = null,
    @Json(name = "specialty")
    val specialty: Specialty? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null,
    @Json(name = "services")
    val services: kotlin.collections.List<Service>? = null
)

