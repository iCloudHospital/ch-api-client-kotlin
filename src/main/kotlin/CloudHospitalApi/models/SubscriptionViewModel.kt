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


import com.squareup.moshi.Json

/**
 * 
 * @param startDate 
 * @param endDate 
 * @param status 
 * @param clientSecret 
 */

data class SubscriptionViewModel (
    @Json(name = "startDate")
    val startDate: java.time.LocalDateTime? = null,
    @Json(name = "endDate")
    val endDate: java.time.LocalDateTime? = null,
    @Json(name = "status")
    val status: kotlin.String? = null,
    @Json(name = "clientSecret")
    val clientSecret: kotlin.String? = null
)

