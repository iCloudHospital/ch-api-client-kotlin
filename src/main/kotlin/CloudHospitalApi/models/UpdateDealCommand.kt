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

import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.DealPackageItemViewModel
import CloudHospitalApi.models.MarketingType

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param name 
 * @param normalizedName 
 * @param slug 
 * @param description 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param marketingType 
 * @param dealPackages 
 * @param auditableEntity 
 * @param photo 
 * @param photoThumbnail 
 */

data class UpdateDealCommand (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("normalizedName")
    val normalizedName: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospitalName")
    val hospitalName: kotlin.String? = null,
    @SerializedName("hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @SerializedName("marketingType")
    val marketingType: MarketingType? = null,
    @SerializedName("dealPackages")
    val dealPackages: kotlin.collections.List<DealPackageItemViewModel>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null,
    @SerializedName("photo")
    val photo: kotlin.String? = null,
    @SerializedName("photoThumbnail")
    val photoThumbnail: kotlin.String? = null
)

