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

import CloudHospitalApi.models.RejectReason

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param rejectReason 
 * @param rejectComment 
 */

data class RejectConsultationCommand (
    @SerializedName("rejectReason")
    val rejectReason: RejectReason? = null,
    @SerializedName("rejectComment")
    val rejectComment: kotlin.String? = null
)

