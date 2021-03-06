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

import CloudHospitalApi.models.LocationViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param version 
 * @param location 
 */

data class CreateDeviceLoginCommand (
    @Json(name = "version")
    val version: kotlin.String? = null,
    @Json(name = "location")
    val location: LocationViewModel? = null
)

