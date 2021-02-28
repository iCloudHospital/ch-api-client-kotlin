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
import CloudHospitalApi.models.DealPackageServiceItemViewModel
import CloudHospitalApi.models.RefundPolicy

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param dealName 
 * @param hospitalId 
 * @param hospitalName 
 * @param refundPolicy 
 * @param additionalServices 
 * @param accomodation 
 * @param transfer 
 * @param bonus 
 * @param price 
 * @param serviceCount 
 * @param dealPackageServices 
 * @param auditableEntity 
 */

data class UpdateDealPackageCommand (
    @SerializedName("dealName")
    val dealName: kotlin.String? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospitalName")
    val hospitalName: kotlin.String? = null,
    @SerializedName("refundPolicy")
    val refundPolicy: RefundPolicy? = null,
    @SerializedName("additionalServices")
    val additionalServices: kotlin.String? = null,
    @SerializedName("accomodation")
    val accomodation: kotlin.String? = null,
    @SerializedName("transfer")
    val transfer: kotlin.String? = null,
    @SerializedName("bonus")
    val bonus: kotlin.String? = null,
    @SerializedName("price")
    val price: kotlin.Double? = null,
    @SerializedName("serviceCount")
    val serviceCount: kotlin.Int? = null,
    @SerializedName("dealPackageServices")
    val dealPackageServices: kotlin.collections.List<DealPackageServiceItemViewModel>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

