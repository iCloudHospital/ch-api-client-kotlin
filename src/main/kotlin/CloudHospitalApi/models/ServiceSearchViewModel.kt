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
 * @param name 
 * @param description 
 * @param specialtyId 
 * @param specialtyName 
 * @param specialtyTypeId 
 * @param specialtyTypeName 
 * @param procedure 
 * @param order 
 */

data class ServiceSearchViewModel (
    @Json(name = "id")
    val id: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "specialtyId")
    val specialtyId: kotlin.String? = null,
    @Json(name = "specialtyName")
    val specialtyName: kotlin.String? = null,
    @Json(name = "specialtyTypeId")
    val specialtyTypeId: kotlin.String? = null,
    @Json(name = "specialtyTypeName")
    val specialtyTypeName: kotlin.String? = null,
    @Json(name = "procedure")
    val procedure: kotlin.Int? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null
)
