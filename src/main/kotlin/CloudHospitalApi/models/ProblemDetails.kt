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

import CloudHospitalApi.models.AnyType

import com.squareup.moshi.Json

/**
 * 
 * @param type 
 * @param title 
 * @param status 
 * @param detail 
 * @param instance 
 */

data class ProblemDetails (
    @Json(name = "type")
    val type: kotlin.String? = null,
    @Json(name = "title")
    val title: kotlin.String? = null,
    @Json(name = "status")
    val status: kotlin.Int? = null,
    @Json(name = "detail")
    val detail: kotlin.String? = null,
    @Json(name = "instance")
    val instance: kotlin.String? = null
) : kotlin.collections.HashMap<String, AnyType>()

