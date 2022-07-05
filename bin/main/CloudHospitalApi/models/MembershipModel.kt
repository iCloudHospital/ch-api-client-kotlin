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

import CloudHospitalApi.models.SubscriptionModel

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param planId 
 * @param planName 
 * @param patientId 
 * @param patientName 
 * @param memberCount 
 * @param isActive 
 * @param subscription 
 */

data class MembershipModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "planId")
    val planId: java.util.UUID? = null,
    @Json(name = "planName")
    val planName: kotlin.String? = null,
    @Json(name = "patientId")
    val patientId: java.util.UUID? = null,
    @Json(name = "patientName")
    val patientName: kotlin.String? = null,
    @Json(name = "memberCount")
    val memberCount: kotlin.Int? = null,
    @Json(name = "isActive")
    val isActive: kotlin.Boolean? = null,
    @Json(name = "subscription")
    val subscription: SubscriptionModel? = null
)

