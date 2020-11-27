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


import com.google.gson.annotations.SerializedName

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

data class DoctorPortfolioItemViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("doctorId")
    val doctorId: java.util.UUID? = null,
    @SerializedName("doctorName")
    val doctorName: kotlin.String? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("photoBefore")
    val photoBefore: kotlin.String? = null,
    @SerializedName("photoAfter")
    val photoAfter: kotlin.String? = null
)

