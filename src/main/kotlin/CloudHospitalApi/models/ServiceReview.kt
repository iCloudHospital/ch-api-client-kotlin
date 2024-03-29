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

import CloudHospitalApi.models.Media
import CloudHospitalApi.models.Patient
import CloudHospitalApi.models.ReviewType
import CloudHospitalApi.models.Service

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param serviceId 
 * @param service 
 * @param patientId 
 * @param patient 
 * @param body 
 * @param recommended 
 * @param rate 
 * @param reviewType 
 * @param medias 
 */

data class ServiceReview (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "serviceId")
    val serviceId: java.util.UUID? = null,
    @Json(name = "service")
    val service: Service? = null,
    @Json(name = "patientId")
    val patientId: java.util.UUID? = null,
    @Json(name = "patient")
    val patient: Patient? = null,
    @Json(name = "body")
    val body: kotlin.String? = null,
    @Json(name = "recommended")
    val recommended: kotlin.Boolean? = null,
    @Json(name = "rate")
    val rate: kotlin.Int? = null,
    @Json(name = "reviewType")
    val reviewType: ReviewType? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<Media>? = null
)

