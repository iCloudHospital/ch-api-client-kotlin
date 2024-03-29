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

import CloudHospitalApi.models.SnsType

import com.squareup.moshi.Json

/**
 * 
 * @param snsType 
 * @param handle 
 */

data class UpdateContributorSnsHandleCommand (
    @Json(name = "snsType")
    val snsType: SnsType? = null,
    @Json(name = "handle")
    val handle: kotlin.String? = null
)

