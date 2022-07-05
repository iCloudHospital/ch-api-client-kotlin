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

import CloudHospitalApi.models.AuditableEntity
import CloudHospitalApi.models.HospitalServiceItemModel
import CloudHospitalApi.models.LocalizedUrlModel
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.MediaModel

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param specialtyId 
 * @param specialtyName 
 * @param specialtyTypeId 
 * @param specialtyTypeName 
 * @param marketingType 
 * @param name 
 * @param slug 
 * @param description 
 * @param serviceCount 
 * @param serviceList 
 * @param photo 
 * @param photoThumbnail 
 * @param background 
 * @param backgroundThumbnail 
 * @param order 
 * @param confirmed 
 * @param medias 
 * @param auditableEntity 
 * @param content 
 * @param customStyle 
 * @param languageCode 
 * @param localizedUrls 
 */

data class HospitalSpecialtyModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @Json(name = "specialtyId")
    val specialtyId: java.util.UUID? = null,
    @Json(name = "specialtyName")
    val specialtyName: kotlin.String? = null,
    @Json(name = "specialtyTypeId")
    val specialtyTypeId: java.util.UUID? = null,
    @Json(name = "specialtyTypeName")
    val specialtyTypeName: kotlin.String? = null,
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "serviceCount")
    val serviceCount: kotlin.Int? = null,
    @Json(name = "serviceList")
    val serviceList: kotlin.collections.List<HospitalServiceItemModel>? = null,
    @Json(name = "photo")
    val photo: kotlin.String? = null,
    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @Json(name = "background")
    val background: kotlin.String? = null,
    @Json(name = "backgroundThumbnail")
    val backgroundThumbnail: kotlin.String? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null,
    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaModel>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null,
    @Json(name = "content")
    val content: kotlin.String? = null,
    @Json(name = "customStyle")
    val customStyle: kotlin.String? = null,
    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,
    @Json(name = "localizedUrls")
    val localizedUrls: kotlin.collections.List<LocalizedUrlModel>? = null
)

