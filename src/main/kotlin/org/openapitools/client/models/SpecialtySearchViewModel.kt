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

import org.openapitools.client.models.HospitalSearchItemViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param hospitals 
 * @param specialtyId 
 * @param specialtyName 
 * @param slug 
 * @param description 
 * @param content 
 * @param specialtyTypeId 
 * @param specialtyTypeName 
 * @param specialtyTypeCategoryId 
 * @param specialtyTypeCategoryName 
 * @param marketingType 
 * @param order 
 */

data class SpecialtySearchViewModel (
    @Json(name = "hospitals")
    val hospitals: kotlin.collections.List<HospitalSearchItemViewModel>? = null,
    @Json(name = "specialtyId")
    val specialtyId: kotlin.String? = null,
    @Json(name = "specialtyName")
    val specialtyName: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "content")
    val content: kotlin.String? = null,
    @Json(name = "specialtyTypeId")
    val specialtyTypeId: kotlin.String? = null,
    @Json(name = "specialtyTypeName")
    val specialtyTypeName: kotlin.String? = null,
    @Json(name = "specialtyTypeCategoryId")
    val specialtyTypeCategoryId: kotlin.String? = null,
    @Json(name = "specialtyTypeCategoryName")
    val specialtyTypeCategoryName: kotlin.String? = null,
    @Json(name = "marketingType")
    val marketingType: kotlin.Int? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null
)

