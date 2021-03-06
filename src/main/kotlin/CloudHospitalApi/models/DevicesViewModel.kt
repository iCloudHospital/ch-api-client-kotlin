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

import CloudHospitalApi.models.DeviceItemViewModel
import CloudHospitalApi.models.PagedListMetaData

import com.squareup.moshi.Json

/**
 * 
 * @param items 
 * @param metaData 
 */

data class DevicesViewModel (
    @Json(name = "items")
    val items: kotlin.collections.List<DeviceItemViewModel>? = null,
    @Json(name = "metaData")
    val metaData: PagedListMetaData? = null
)

