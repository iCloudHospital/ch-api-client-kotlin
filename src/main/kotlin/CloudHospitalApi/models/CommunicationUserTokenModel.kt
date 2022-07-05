/**
* Swagger UI - Cloud Hospital Api-INT
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
 * @param token 
 * @param expiresOn 
 * @param communicationUserId 
 * @param gateway 
 */

data class CommunicationUserTokenModel (
    @Json(name = "token")
    val token: kotlin.String? = null,
    @Json(name = "expiresOn")
    val expiresOn: java.time.LocalDateTime? = null,
    @Json(name = "communicationUserId")
    val communicationUserId: kotlin.String? = null,
    @Json(name = "gateway")
    val gateway: kotlin.String? = null
)

