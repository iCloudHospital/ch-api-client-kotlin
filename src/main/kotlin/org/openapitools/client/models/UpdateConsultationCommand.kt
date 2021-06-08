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

import org.openapitools.client.models.Gender

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param specialtyId 
 * @param doctorId 
 * @param language 
 * @param isAccountHolder 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param phone 
 * @param dateOfBirth 
 * @param gender 
 * @param comment 
 * @param timeRange 
 * @param approximateDateStart 
 * @param approximateDateEnd 
 * @param timeZone 
 */

data class UpdateConsultationCommand (
    @SerializedName("specialtyId")
    val specialtyId: java.util.UUID? = null,
    @SerializedName("doctorId")
    val doctorId: java.util.UUID? = null,
    @SerializedName("language")
    val language: kotlin.String? = null,
    @SerializedName("isAccountHolder")
    val isAccountHolder: kotlin.Boolean? = null,
    @SerializedName("firstName")
    val firstName: kotlin.String? = null,
    @SerializedName("lastName")
    val lastName: kotlin.String? = null,
    @SerializedName("email")
    val email: kotlin.String? = null,
    @SerializedName("phone")
    val phone: kotlin.String? = null,
    @SerializedName("dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @SerializedName("gender")
    val gender: Gender? = null,
    @SerializedName("comment")
    val comment: kotlin.String? = null,
    @SerializedName("timeRange")
    val timeRange: kotlin.String? = null,
    @SerializedName("approximateDateStart")
    val approximateDateStart: java.time.LocalDateTime? = null,
    @SerializedName("approximateDateEnd")
    val approximateDateEnd: java.time.LocalDateTime? = null,
    @SerializedName("timeZone")
    val timeZone: kotlin.String? = null
)
