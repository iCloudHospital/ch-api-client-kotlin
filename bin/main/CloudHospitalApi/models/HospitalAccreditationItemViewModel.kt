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
 * @param accreditationId 
 * @param accreditationName 
 * @param accreditationLogo 
 */

data class HospitalAccreditationItemViewModel (
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "accreditationId")
    val accreditationId: java.util.UUID? = null,
    @Json(name = "accreditationName")
    val accreditationName: kotlin.String? = null,
    @Json(name = "accreditationLogo")
    val accreditationLogo: kotlin.String? = null
)

