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

import CloudHospitalApi.models.HospitalReviewItemViewModel
import CloudHospitalApi.models.PagedListMetaData

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param items 
 * @param metaData 
 */

data class HospitalReviewsViewModel (
    @SerializedName("items")
    val items: kotlin.collections.List<HospitalReviewItemViewModel>? = null,
    @SerializedName("metaData")
    val metaData: PagedListMetaData? = null
)

