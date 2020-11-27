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
package org.openapitools.client.models

import org.openapitools.client.models.Hospital
import org.openapitools.client.models.Patient
import org.openapitools.client.models.ReviewCategory

import com.google.gson.annotations.SerializedName

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
    @SerializedName("patientId")
    val patientId: java.util.UUID? = null,
    @SerializedName("patient")
    val patient: Patient? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospital")
    val hospital: Hospital? = null,
    @SerializedName("body")
    val body: kotlin.String? = null,
    @SerializedName("recommended")
    val recommended: kotlin.Boolean? = null,
    @SerializedName("reviewCategory")
    val reviewCategory: ReviewCategory? = null,
    @SerializedName("rate")
    val rate: kotlin.Int? = null
)

