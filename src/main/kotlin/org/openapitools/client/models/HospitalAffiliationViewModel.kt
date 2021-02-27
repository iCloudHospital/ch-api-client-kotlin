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
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param countryId 
 * @param countryName 
 * @param stateName 
 * @param cityName 
 */

data class HospitalAffiliationViewModel (
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @Json(name = "countryId")
    val countryId: java.util.UUID? = null,
    @Json(name = "countryName")
    val countryName: kotlin.String? = null,
    @Json(name = "stateName")
    val stateName: kotlin.String? = null,
    @Json(name = "cityName")
    val cityName: kotlin.String? = null
)

