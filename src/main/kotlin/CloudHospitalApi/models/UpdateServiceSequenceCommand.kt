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


import com.google.gson.annotations.SerializedName

/**
 * 
 * @param serviceSequence 
 */

data class UpdateServiceSequenceCommand (
    @SerializedName("serviceSequence")
    val serviceSequence: kotlin.collections.List<java.util.UUID>? = null
)

