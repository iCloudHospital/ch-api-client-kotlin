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
 * @param errors 
 * @param success 
 * @param error 
 */

data class DeleteMemberResultModel (
    @Json(name = "errors")
    val errors: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "success")
    val success: kotlin.Boolean? = null,
    @Json(name = "error")
    val error: kotlin.String? = null
)

