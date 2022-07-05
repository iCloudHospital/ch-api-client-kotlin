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
 * @param userId 
 * @param nickname 
 * @param profileUrl 
 * @param issueAccessToken 
 * @param discoveryKeys 
 */

data class CreateChatUserCommand (
    @Json(name = "userId")
    val userId: java.util.UUID? = null,
    @Json(name = "nickname")
    val nickname: kotlin.String? = null,
    @Json(name = "profileUrl")
    val profileUrl: kotlin.String? = null,
    @Json(name = "issueAccessToken")
    val issueAccessToken: kotlin.Boolean? = null,
    @Json(name = "discoveryKeys")
    val discoveryKeys: kotlin.collections.List<kotlin.String>? = null
)

