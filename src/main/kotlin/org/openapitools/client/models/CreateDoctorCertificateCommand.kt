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
 * @param certificate 
 * @param activeFrom 
 * @param activeTo 
 */

data class CreateDoctorCertificateCommand (
    @SerializedName("certificate")
    val certificate: kotlin.String? = null,
    @SerializedName("activeFrom")
    val activeFrom: java.time.LocalDateTime? = null,
    @SerializedName("activeTo")
    val activeTo: java.time.LocalDateTime? = null
)

