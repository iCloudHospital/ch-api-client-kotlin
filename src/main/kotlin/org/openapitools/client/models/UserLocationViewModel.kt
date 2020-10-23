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

import org.openapitools.client.models.UserLocationType

import com.google.gson.annotations.SerializedName
/**
 * 
 * @param locationType 
 * @param latitude 
 * @param longitude 
 * @param country 
 * @param state 
 * @param county 
 * @param city 
 * @param zipCode 
 * @param address 
 */

data class UserLocationViewModel (
    @SerializedName("locationType")
    val locationType: UserLocationType? = null,
    @SerializedName("latitude")
    val latitude: kotlin.Double? = null,
    @SerializedName("longitude")
    val longitude: kotlin.Double? = null,
    @SerializedName("country")
    val country: kotlin.String? = null,
    @SerializedName("state")
    val state: kotlin.String? = null,
    @SerializedName("county")
    val county: kotlin.String? = null,
    @SerializedName("city")
    val city: kotlin.String? = null,
    @SerializedName("zipCode")
    val zipCode: kotlin.String? = null,
    @SerializedName("address")
    val address: kotlin.String? = null
)

