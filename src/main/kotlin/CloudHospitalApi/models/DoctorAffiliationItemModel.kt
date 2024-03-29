/**
 * Swagger UI - Cloud Hospital Api-INT
 *
 * Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
 *
 * The version of the OpenAPI document: 2
 * Contact: hyounoosung@icloudhospital.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package CloudHospitalApi.models

import CloudHospitalApi.models.MarketingType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param languageCode 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param countryId 
 * @param marketingType 
 * @param doctorId 
 * @param name 
 * @param slug 
 * @param confirmed 
 * @param photo 
 * @param photoThumbnail 
 * @param consultationEnabled 
 * @param consultationFee 
 * @param startPracticeDate 
 * @param yearOfExperience 
 * @param specialtiesSummerized 
 * @param order 
 */

data class DoctorAffiliationItemModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,

    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null,

    @Json(name = "hospitalName")
    val hospitalName: kotlin.String? = null,

    @Json(name = "hospitalSlug")
    val hospitalSlug: kotlin.String? = null,

    @Json(name = "countryId")
    val countryId: java.util.UUID? = null,

    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,

    @Json(name = "doctorId")
    val doctorId: java.util.UUID? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "slug")
    val slug: kotlin.String? = null,

    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,

    @Json(name = "photo")
    val photo: kotlin.String? = null,

    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,

    @Json(name = "consultationEnabled")
    val consultationEnabled: kotlin.Boolean? = null,

    @Json(name = "consultationFee")
    val consultationFee: kotlin.Double? = null,

    @Json(name = "startPracticeDate")
    val startPracticeDate: java.time.LocalDateTime? = null,

    @Json(name = "yearOfExperience")
    val yearOfExperience: kotlin.Double? = null,

    @Json(name = "specialtiesSummerized")
    val specialtiesSummerized: kotlin.String? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null

)

