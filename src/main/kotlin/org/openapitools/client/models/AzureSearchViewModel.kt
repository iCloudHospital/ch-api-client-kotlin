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
 * @param hospitals 
 * @param doctors 
 * @param deals 
 * @param specialties 
 * @param specialtyTypes 
 */

data class AzureSearchViewModel (
    @Json(name = "hospitals")
    val hospitals: kotlin.Int? = null,
    @Json(name = "doctors")
    val doctors: kotlin.Int? = null,
    @Json(name = "deals")
    val deals: kotlin.Int? = null,
    @Json(name = "specialties")
    val specialties: kotlin.Int? = null,
    @Json(name = "specialtyTypes")
    val specialtyTypes: kotlin.Int? = null
)

