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
 * @param id 
 * @param hospitalId 
 * @param hospitalName 
 * @param name 
 * @param stars 
 * @param description 
 * @param referenceUrl 
 */

data class HospitalEvaluationItemModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "stars")
    val stars: kotlin.Int? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "referenceUrl")
    val referenceUrl: kotlin.String? = null
)

