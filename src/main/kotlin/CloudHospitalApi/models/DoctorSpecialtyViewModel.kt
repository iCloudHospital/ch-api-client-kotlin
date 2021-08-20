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
 * @param specialtyId 
 * @param specialtyName 
 * @param specialtySlug 
 * @param specialtyTypeId 
 * @param specialtyTypeName 
 * @param order 
 * @param doctorId 
 * @param doctorName 
 */

data class DoctorSpecialtyViewModel (
    @Json(name = "specialtyId")
    val specialtyId: java.util.UUID? = null,
    @Json(name = "specialtyName")
    val specialtyName: kotlin.String? = null,
    @Json(name = "specialtySlug")
    val specialtySlug: kotlin.String? = null,
    @Json(name = "specialtyTypeId")
    val specialtyTypeId: java.util.UUID? = null,
    @Json(name = "specialtyTypeName")
    val specialtyTypeName: kotlin.String? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null,
    @Json(name = "doctorId")
    val doctorId: java.util.UUID? = null,
    @Json(name = "doctorName")
    val doctorName: kotlin.String? = null
)

