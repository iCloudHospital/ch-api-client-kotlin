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

import CloudHospitalApi.models.SearchMetaData
import CloudHospitalApi.models.SpecialtySearchViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param items 
 * @param metaData 
 */

data class SpecialtySearchResultViewModel (
    @Json(name = "items")
    val items: kotlin.collections.List<SpecialtySearchViewModel>? = null,
    @Json(name = "metaData")
    val metaData: SearchMetaData? = null
)
