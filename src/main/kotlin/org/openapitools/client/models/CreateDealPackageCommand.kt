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

import org.openapitools.client.models.RefundPolicy
import org.openapitools.client.models.ServiceViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param dealId 
 * @param refundPolicy 
 * @param additionalServices 
 * @param accomodation 
 * @param transfer 
 * @param bonus 
 * @param price 
 * @param dealPackageServices 
 */

data class CreateDealPackageCommand (
    @Json(name = "dealId")
    val dealId: java.util.UUID? = null,
    @Json(name = "refundPolicy")
    val refundPolicy: RefundPolicy? = null,
    @Json(name = "additionalServices")
    val additionalServices: kotlin.String? = null,
    @Json(name = "accomodation")
    val accomodation: kotlin.String? = null,
    @Json(name = "transfer")
    val transfer: kotlin.String? = null,
    @Json(name = "bonus")
    val bonus: kotlin.String? = null,
    @Json(name = "price")
    val price: kotlin.Double? = null,
    @Json(name = "dealPackageServices")
    val dealPackageServices: kotlin.collections.List<ServiceViewModel>? = null
)

