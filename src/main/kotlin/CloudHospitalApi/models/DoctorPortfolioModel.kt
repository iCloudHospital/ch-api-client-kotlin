/**
* Swagger UI - Cloud Hospital Api-DEV
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
 * @param doctorId 
 * @param doctorName 
 * @param name 
 * @param description 
 * @param photoBefore 
 * @param photoAfter 
 */

data class DoctorPortfolioModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "doctorId")
    val doctorId: java.util.UUID? = null,
    @Json(name = "doctorName")
    val doctorName: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "photoBefore")
    val photoBefore: kotlin.String? = null,
    @Json(name = "photoAfter")
    val photoAfter: kotlin.String? = null
)

