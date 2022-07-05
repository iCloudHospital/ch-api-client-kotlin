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

import CloudHospitalApi.models.HospitalAccreditationItemModel
import CloudHospitalApi.models.LocationModel
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.MediaModel

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param name 
 * @param slug 
 * @param logo 
 * @param confirmed 
 * @param countryId 
 * @param countryName 
 * @param countrySlug 
 * @param marketingType 
 * @param consultationEnabled 
 * @param consultationFee 
 * @param timeZone 
 * @param websiteUrl 
 * @param paymentEnabled 
 * @param specialtiesSummerized 
 * @param accreditations 
 * @param medias 
 * @param location 
 */

data class HospitalItemModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "logo")
    val logo: kotlin.String? = null,
    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,
    @Json(name = "countryId")
    val countryId: java.util.UUID? = null,
    @Json(name = "countryName")
    val countryName: kotlin.String? = null,
    @Json(name = "countrySlug")
    val countrySlug: kotlin.String? = null,
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,
    @Json(name = "consultationEnabled")
    val consultationEnabled: kotlin.Boolean? = null,
    @Json(name = "consultationFee")
    val consultationFee: kotlin.Double? = null,
    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,
    @Json(name = "websiteUrl")
    val websiteUrl: kotlin.String? = null,
    @Json(name = "paymentEnabled")
    val paymentEnabled: kotlin.Boolean? = null,
    @Json(name = "specialtiesSummerized")
    val specialtiesSummerized: kotlin.String? = null,
    @Json(name = "accreditations")
    val accreditations: kotlin.collections.List<HospitalAccreditationItemModel>? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaModel>? = null,
    @Json(name = "location")
    val location: LocationModel? = null
)

