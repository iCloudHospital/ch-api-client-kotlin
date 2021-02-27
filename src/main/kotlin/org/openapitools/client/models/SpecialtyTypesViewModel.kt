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

import org.openapitools.client.models.PagedListMetaData
import org.openapitools.client.models.SpecialtyTypeItemViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param items 
 * @param metaData 
 */

data class SpecialtyTypesViewModel (
    @Json(name = "items")
    val items: kotlin.collections.List<SpecialtyTypeItemViewModel>? = null,
    @Json(name = "metaData")
    val metaData: PagedListMetaData? = null
)

