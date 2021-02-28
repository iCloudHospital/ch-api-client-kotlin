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

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param items 
 * @param metaData 
 */

data class SpecialtySearchResultViewModel (
    @SerializedName("items")
    val items: kotlin.collections.List<SpecialtySearchViewModel>? = null,
    @SerializedName("metaData")
    val metaData: SearchMetaData? = null
)
