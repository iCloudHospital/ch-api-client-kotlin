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

import CloudHospitalApi.models.AwardModel
import CloudHospitalApi.models.HospitalAccreditationItemModel
import CloudHospitalApi.models.HospitalConsultationOptionModel
import CloudHospitalApi.models.HospitalEvaluationItemModel
import CloudHospitalApi.models.HospitalLanguageItemModel
import CloudHospitalApi.models.LocalizedUrlModel
import CloudHospitalApi.models.LocationModel
import CloudHospitalApi.models.MarketingType
import CloudHospitalApi.models.MediaModel
import CloudHospitalApi.models.SnsHandle
import CloudHospitalApi.models.WorkingDay

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param languageCode 
 * @param name 
 * @param slug 
 * @param confirmed 
 * @param logo 
 * @param marketingType 
 * @param consultationEnabled 
 * @param consultationFee 
 * @param timeZone 
 * @param websiteUrl 
 * @param paymentEnabled 
 * @param countryId 
 * @param specialtiesSummerized 
 * @param accreditations 
 * @param medias 
 * @param location 
 * @param description 
 * @param overview 
 * @param content 
 * @param localizedUrls 
 * @param bedsCount 
 * @param operationsPerYear 
 * @param foundationYear 
 * @param medicalStaffCount 
 * @param doctorCount 
 * @param contactTel 
 * @param contactEmail 
 * @param customStyle 
 * @param evaluations 
 * @param hospitalWorkingDays 
 * @param hospitalSnsHandles 
 * @param languages 
 * @param awards 
 * @param consultationOption 
 */

data class HospitalModel (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "languageCode")
    val languageCode: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "slug")
    val slug: kotlin.String? = null,

    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,

    @Json(name = "logo")
    val logo: kotlin.String? = null,

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

    @Json(name = "countryId")
    val countryId: java.util.UUID? = null,

    @Json(name = "specialtiesSummerized")
    val specialtiesSummerized: kotlin.String? = null,

    @Json(name = "accreditations")
    val accreditations: kotlin.collections.List<HospitalAccreditationItemModel>? = null,

    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaModel>? = null,

    @Json(name = "location")
    val location: LocationModel? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "overview")
    val overview: kotlin.String? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "localizedUrls")
    val localizedUrls: kotlin.collections.List<LocalizedUrlModel>? = null,

    @Json(name = "bedsCount")
    val bedsCount: kotlin.Int? = null,

    @Json(name = "operationsPerYear")
    val operationsPerYear: kotlin.Int? = null,

    @Json(name = "foundationYear")
    val foundationYear: kotlin.Int? = null,

    @Json(name = "medicalStaffCount")
    val medicalStaffCount: kotlin.Int? = null,

    @Json(name = "doctorCount")
    val doctorCount: kotlin.Int? = null,

    @Json(name = "contactTel")
    val contactTel: kotlin.String? = null,

    @Json(name = "contactEmail")
    val contactEmail: kotlin.String? = null,

    @Json(name = "customStyle")
    val customStyle: kotlin.String? = null,

    @Json(name = "evaluations")
    val evaluations: kotlin.collections.List<HospitalEvaluationItemModel>? = null,

    @Json(name = "hospitalWorkingDays")
    val hospitalWorkingDays: kotlin.collections.List<WorkingDay>? = null,

    @Json(name = "hospitalSnsHandles")
    val hospitalSnsHandles: kotlin.collections.List<SnsHandle>? = null,

    @Json(name = "languages")
    val languages: kotlin.collections.List<HospitalLanguageItemModel>? = null,

    @Json(name = "awards")
    val awards: kotlin.collections.List<AwardModel>? = null,

    @Json(name = "consultationOption")
    val consultationOption: HospitalConsultationOptionModel? = null

)

