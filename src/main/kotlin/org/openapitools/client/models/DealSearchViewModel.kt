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

import org.openapitools.client.models.DealPackageSearchViewModel
import org.openapitools.client.models.HospitalSearchItemViewModel

import com.google.gson.annotations.SerializedName

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
    @SerializedName("id")
    val id: kotlin.String? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("marketingType")
    val marketingType: kotlin.Int? = null,
    @SerializedName("photo")
    val photo: kotlin.String? = null,
    @SerializedName("photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @SerializedName("hospital")
    val hospital: HospitalSearchItemViewModel? = null,
    @SerializedName("packages")
    val packages: kotlin.collections.List<DealPackageSearchViewModel>? = null
)

