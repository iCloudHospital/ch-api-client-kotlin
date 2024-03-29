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
 * @param name 
 * @param logo 
 * @param country 
 */

data class UpdateAccreditationCommand (
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "logo")
    val logo: kotlin.String? = null,
    @Json(name = "country")
    val country: kotlin.String? = null
)

