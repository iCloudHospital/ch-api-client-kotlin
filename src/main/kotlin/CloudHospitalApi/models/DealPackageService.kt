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

import CloudHospitalApi.models.DealPackage
import CloudHospitalApi.models.Service

import com.squareup.moshi.Json

/**
 * 
 * @param dealPackageId 
 * @param dealPackage 
 * @param serviceId 
 * @param service 
 * @param order 
 */

data class DealPackageService (
    @Json(name = "dealPackageId")
    val dealPackageId: java.util.UUID? = null,
    @Json(name = "dealPackage")
    val dealPackage: DealPackage? = null,
    @Json(name = "serviceId")
    val serviceId: java.util.UUID? = null,
    @Json(name = "service")
    val service: Service? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null
)

