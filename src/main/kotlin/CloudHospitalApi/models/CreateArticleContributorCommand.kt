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

import CloudHospitalApi.models.ContributionType

import com.squareup.moshi.Json

/**
 * 
 * @param contributorId 
 * @param type 
 * @param filter 
 * @param order 
 */

data class CreateArticleContributorCommand (
    @Json(name = "contributorId")
    val contributorId: java.util.UUID? = null,
    @Json(name = "type")
    val type: ContributionType? = null,
    @Json(name = "filter")
    val filter: kotlin.String? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null
)

