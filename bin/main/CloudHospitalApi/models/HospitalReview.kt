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
import CloudHospitalApi.models.Patient
import CloudHospitalApi.models.ReviewCategory

import com.squareup.moshi.Json

/**
 * 
 * @param patientId 
 * @param patient 
 * @param hospitalId 
 * @param hospital 
 * @param body 
 * @param recommended 
 * @param reviewCategory 
 * @param rate 
 */

data class HospitalReview (
    @Json(name = "patientId")
    val patientId: java.util.UUID? = null,
    @Json(name = "patient")
    val patient: Patient? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospital")
    val hospital: Hospital? = null,
    @Json(name = "body")
    val body: kotlin.String? = null,
    @Json(name = "recommended")
    val recommended: kotlin.Boolean? = null,
    @Json(name = "reviewCategory")
    val reviewCategory: ReviewCategory? = null,
    @Json(name = "rate")
    val rate: kotlin.Int? = null
)

