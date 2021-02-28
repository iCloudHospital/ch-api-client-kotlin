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

import CloudHospitalApi.models.Hospital
import CloudHospitalApi.models.Service
import CloudHospitalApi.models.Specialty

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param hospitalId 
 * @param hospital 
 * @param specialtyId 
 * @param specialty 
 * @param order 
 * @param services 
 */

data class HospitalSpecialty (
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospital")
    val hospital: Hospital? = null,
    @SerializedName("specialtyId")
    val specialtyId: java.util.UUID? = null,
    @SerializedName("specialty")
    val specialty: Specialty? = null,
    @SerializedName("order")
    val order: kotlin.Int? = null,
    @SerializedName("services")
    val services: kotlin.collections.List<Service>? = null
)

