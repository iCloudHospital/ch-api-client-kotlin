/**
* Swagger UI - Cloud Hospital Api-DEV
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 2
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package CloudHospitalApi.models


import com.squareup.moshi.Json

/**
 * 
 * @param planId 
 * @param planName 
 * @param hospitalId 
 * @param hospitalName 
 * @param order 
 */

data class PlanHospitalModel (
    @Json(name = "planId")
    val planId: java.util.UUID? = null,
    @Json(name = "planName")
    val planName: kotlin.String? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null
)
