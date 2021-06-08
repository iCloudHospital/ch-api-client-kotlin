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

import CloudHospitalApi.models.Doctor
import CloudHospitalApi.models.Specialty

import com.squareup.moshi.Json

/**
 * 
 * @param doctorId 
 * @param doctor 
 * @param specialtyId 
 * @param specialty 
 * @param order 
 */

data class DoctorSpecialty (
    @Json(name = "doctorId")
    val doctorId: java.util.UUID? = null,
    @Json(name = "doctor")
    val doctor: Doctor? = null,
    @Json(name = "specialtyId")
    val specialtyId: java.util.UUID? = null,
    @Json(name = "specialty")
    val specialty: Specialty? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null
)

