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


import com.squareup.moshi.Json

/**
 * 
 * @param latitude 
 * @param longitude 
 * @param country 
 * @param state 
 * @param county 
 * @param city 
 * @param zipCode 
 * @param address 
 */

data class LocationViewModel (
    @Json(name = "latitude")
    val latitude: kotlin.Double? = null,
    @Json(name = "longitude")
    val longitude: kotlin.Double? = null,
    @Json(name = "country")
    val country: kotlin.String? = null,
    @Json(name = "state")
    val state: kotlin.String? = null,
    @Json(name = "county")
    val county: kotlin.String? = null,
    @Json(name = "city")
    val city: kotlin.String? = null,
    @Json(name = "zipCode")
    val zipCode: kotlin.String? = null,
    @Json(name = "address")
    val address: kotlin.String? = null
)

