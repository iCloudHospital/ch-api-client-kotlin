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
 * @param hospitalId 
 * @param name 
 * @param additionalInfo 
 */

data class CreateDepartmentCommand (
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "additionalInfo")
    val additionalInfo: kotlin.String? = null
)

