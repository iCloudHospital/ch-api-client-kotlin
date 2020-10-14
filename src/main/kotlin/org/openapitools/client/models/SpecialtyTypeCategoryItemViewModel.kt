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

import org.openapitools.client.models.SpecialtyTypeItemViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param name 
 * @param description 
 * @param order 
 * @param specialtyTypeCount 
 * @param specialtyTypes 
 */

data class SpecialtyTypeCategoryItemViewModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null,
    @Json(name = "specialtyTypeCount")
    val specialtyTypeCount: kotlin.Int? = null,
    @Json(name = "specialtyTypes")
    val specialtyTypes: kotlin.collections.List<SpecialtyTypeItemViewModel>? = null
)

