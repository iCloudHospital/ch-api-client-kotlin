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
 * @param userId 
 * @param isLockout 
 * @param provider 
 * @param providerKey 
 */

data class FacebookUserDataDeletionResponseModel (
    @Json(name = "userId")
    val userId: kotlin.String? = null,
    @Json(name = "isLockout")
    val isLockout: kotlin.Boolean? = null,
    @Json(name = "provider")
    val provider: kotlin.String? = null,
    @Json(name = "providerKey")
    val providerKey: kotlin.String? = null
)
