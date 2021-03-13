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
 * @param confirmedDateStart 
 * @param confirmedDateEnd 
 */

data class ApproveBookingCommand (
    @Json(name = "confirmedDateStart")
    val confirmedDateStart: java.time.OffsetDateTime? = null,
    @Json(name = "confirmedDateEnd")
    val confirmedDateEnd: java.time.OffsetDateTime? = null
)

