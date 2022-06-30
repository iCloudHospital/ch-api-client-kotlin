/**
* Swagger UI - Cloud Hospital Api-DEV
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
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.Procedure

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param name 
 * @param slug 
 * @param description 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param specialtyTypeId 
 * @param specialtyTypeName 
 * @param specialtyId 
 * @param specialtyName 
 * @param hospitalSpecialtyName 
 * @param hospitalSpecialtySlug 
 * @param serviceCategoryId 
 * @param serviceCategoryName 
 * @param marketingType 
 * @param procedure 
 * @param minPrice 
 * @param maxPrice 
 * @param priceReuqest 
 * @param order 
 * @param confirmed 
 * @param photo 
 * @param photoThumbnail 
 * @param medias 
 * @param auditableEntity 
 */

data class HospitalServiceItemModel (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,
    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,
    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @Json(name = "specialtyTypeId")
    val specialtyTypeId: java.util.UUID? = null,
    @Json(name = "specialtyTypeName")
    val specialtyTypeName: kotlin.String? = null,
    @Json(name = "specialtyId")
    val specialtyId: java.util.UUID? = null,
    @Json(name = "specialtyName")
    val specialtyName: kotlin.String? = null,
    @Json(name = "hospitalSpecialtyName")
    val hospitalSpecialtyName: kotlin.String? = null,
    @Json(name = "hospitalSpecialtySlug")
    val hospitalSpecialtySlug: kotlin.String? = null,
    @Json(name = "serviceCategoryId")
    val serviceCategoryId: java.util.UUID? = null,
    @Json(name = "serviceCategoryName")
    val serviceCategoryName: kotlin.String? = null,
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,
    @Json(name = "procedure")
    val procedure: Procedure? = null,
    @Json(name = "minPrice")
    val minPrice: kotlin.Double? = null,
    @Json(name = "maxPrice")
    val maxPrice: kotlin.Double? = null,
    @Json(name = "priceReuqest")
    val priceReuqest: kotlin.Boolean? = null,
    @Json(name = "order")
    val order: kotlin.Int? = null,
    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,
    @Json(name = "photo")
    val photo: kotlin.String? = null,
    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaModel>? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

