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

import CloudHospitalApi.models.DealPackageSearchViewModel
import CloudHospitalApi.models.HospitalSearchItemViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param name 
 * @param slug 
 * @param description 
 * @param marketingType 
 * @param photo 
 * @param photoThumbnail 
 * @param hospital 
 * @param packages 
 */

data class DealSearchViewModel (
    @Json(name = "id")
    val id: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "marketingType")
    val marketingType: kotlin.Int? = null,
    @Json(name = "photo")
    val photo: kotlin.String? = null,
    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @Json(name = "hospital")
    val hospital: HospitalSearchItemViewModel? = null,
    @Json(name = "packages")
    val packages: kotlin.collections.List<DealPackageSearchViewModel>? = null
)

