/**
* Swagger UI - Cloud Hospital Api-INT
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 2
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package CloudHospitalApi.models

import CloudHospitalApi.models.PagedListMetaData
import CloudHospitalApi.models.WorkingDayItemModel

import com.squareup.moshi.Json

/**
 * 
 * @param items 
 * @param metaData 
 */

data class WorkingDaysModel (
    @Json(name = "items")
    val items: kotlin.collections.List<WorkingDayItemModel>? = null,
    @Json(name = "metaData")
    val metaData: PagedListMetaData? = null
)

