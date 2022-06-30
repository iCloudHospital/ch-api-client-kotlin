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
 * @param id 
 * @param dayOfWeek 
 * @param timeFrom 
 * @param timeTo 
 * @param checkHoliday 
 */

data class WorkingDayModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "dayOfWeek")
    val dayOfWeek: kotlin.String? = null,
    @Json(name = "timeFrom")
    val timeFrom: java.time.LocalDateTime? = null,
    @Json(name = "timeTo")
    val timeTo: java.time.LocalDateTime? = null,
    @Json(name = "checkHoliday")
    val checkHoliday: kotlin.Boolean? = null
)

