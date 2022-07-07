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
 * @param id 
 * @param language 
 * @param userId 
 */

data class UserLanguage (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "language")
    val language: kotlin.String? = null,
    @Json(name = "userId")
    val userId: java.util.UUID? = null
)

