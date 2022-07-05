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
 * @param articleId 
 * @param tagId 
 * @param order 
 */

data class ArticleTagModel (
    @Json(name = "articleId")
    val articleId: java.util.UUID? = null,
    @Json(name = "tagId")
    val tagId: kotlin.String? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null
)

