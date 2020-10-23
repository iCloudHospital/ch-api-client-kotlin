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

import org.openapitools.client.models.ServiceSearchViewModel

import com.google.gson.annotations.SerializedName
/**
 * 
 * @param id 
 * @param refundPolicy 
 * @param additionalServices 
 * @param accomodation 
 * @param transfer 
 * @param bonus 
 * @param price 
 * @param services 
 */

data class DealPackageSearchViewModel (
    @SerializedName("id")
    val id: kotlin.String? = null,
    @SerializedName("refundPolicy")
    val refundPolicy: kotlin.Int? = null,
    @SerializedName("additionalServices")
    val additionalServices: kotlin.String? = null,
    @SerializedName("accomodation")
    val accomodation: kotlin.String? = null,
    @SerializedName("transfer")
    val transfer: kotlin.String? = null,
    @SerializedName("bonus")
    val bonus: kotlin.String? = null,
    @SerializedName("price")
    val price: kotlin.Double? = null,
    @SerializedName("services")
    val services: kotlin.Array<ServiceSearchViewModel>? = null
)

