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

import CloudHospitalApi.models.Service

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param name 
 * @param normalizedName 
 * @param description 
 * @param order 
 * @param services 
 */

data class ServiceCategory (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "normalizedName")
    val normalizedName: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null,
    @Json(name = "services")
    val services: kotlin.collections.List<Service>? = null
)

