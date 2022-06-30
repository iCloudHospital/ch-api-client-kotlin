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
 * @param pageCount 
 * @param totalItemCount 
 * @param pageNumber 
 * @param pageSize 
 */

data class SearchMetaData (
    @Json(name = "pageCount")
    val pageCount: kotlin.Int? = null,
    @Json(name = "totalItemCount")
    val totalItemCount: kotlin.Int? = null,
    @Json(name = "pageNumber")
    val pageNumber: kotlin.Int? = null,
    @Json(name = "pageSize")
    val pageSize: kotlin.Int? = null
)
