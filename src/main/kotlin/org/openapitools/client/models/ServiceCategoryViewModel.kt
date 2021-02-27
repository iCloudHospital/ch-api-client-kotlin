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

import org.openapitools.client.models.ServiceItemViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param name 
 * @param normalizedName 
 * @param description 
 * @param order 
 * @param serviceCount 
 * @param services 
 */

data class ServiceCategoryViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("normalizedName")
    val normalizedName: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("order")
    val order: kotlin.Int? = null,
    @SerializedName("serviceCount")
    val serviceCount: kotlin.Int? = null,
    @SerializedName("services")
    val services: kotlin.collections.List<ServiceItemViewModel>? = null
)

