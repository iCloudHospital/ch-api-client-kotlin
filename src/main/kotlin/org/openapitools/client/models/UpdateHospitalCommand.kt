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

import org.openapitools.client.models.AccreditationViewModel
import org.openapitools.client.models.AuditableEntity
import org.openapitools.client.models.AwardViewModel
import org.openapitools.client.models.HospitalEvaluationViewModel
import org.openapitools.client.models.HospitalSpecialtyItemViewModel
import org.openapitools.client.models.LocationViewModel
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.MediaViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param specialties 
 * @param name 
 * @param slug 
 * @param description 
 * @param logo 
 * @param overview 
 * @param bedsCount 
 * @param operationsPerYear 
 * @param foundationYear 
 * @param medicalStaffCount 
 * @param doctorCount 
 * @param countryName 
 * @param marketingType 
 * @param consultationEnabled 
 * @param consultationFee 
 * @param timeZone 
 * @param articlesCount 
 * @param packagesCount 
 * @param equipmentsCount 
 * @param reviewsCount 
 * @param departmentsCount 
 * @param specialtiesCount 
 * @param accreditationsCount 
 * @param doctorAffiliationsCount 
 * @param managerAffiliationsCount 
 * @param specialtiesSummerized 
 * @param awards 
 * @param medias 
 * @param accreditations 
 * @param evaluations 
 * @param location 
 * @param auditableEntity 
 */

data class UpdateHospitalCommand (
    @Json(name = "specialties")
    val specialties: kotlin.collections.List<HospitalSpecialtyItemViewModel>? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "slug")
    val slug: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "logo")
    val logo: kotlin.String? = null,
    @Json(name = "overview")
    val overview: kotlin.String? = null,
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
    @Json(name = "countryName")
    val countryName: kotlin.String? = null,
    @Json(name = "marketingType")
    val marketingType: MarketingType? = null,
    @Json(name = "consultationEnabled")
    val consultationEnabled: kotlin.Boolean? = null,
    @Json(name = "consultationFee")
    val consultationFee: kotlin.Double? = null,
    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,
    @Json(name = "articlesCount")
    val articlesCount: kotlin.Int? = null,
    @Json(name = "packagesCount")
    val packagesCount: kotlin.Int? = null,
    @Json(name = "equipmentsCount")
    val equipmentsCount: kotlin.Int? = null,
    @Json(name = "reviewsCount")
    val reviewsCount: kotlin.Int? = null,
    @Json(name = "departmentsCount")
    val departmentsCount: kotlin.Int? = null,
    @Json(name = "specialtiesCount")
    val specialtiesCount: kotlin.Int? = null,
    @Json(name = "accreditationsCount")
    val accreditationsCount: kotlin.Int? = null,
    @Json(name = "doctorAffiliationsCount")
    val doctorAffiliationsCount: kotlin.Int? = null,
    @Json(name = "managerAffiliationsCount")
    val managerAffiliationsCount: kotlin.Int? = null,
    @Json(name = "specialtiesSummerized")
    val specialtiesSummerized: kotlin.String? = null,
    @Json(name = "awards")
    val awards: kotlin.collections.List<AwardViewModel>? = null,
    @Json(name = "medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null,
    @Json(name = "accreditations")
    val accreditations: kotlin.collections.List<AccreditationViewModel>? = null,
    @Json(name = "evaluations")
    val evaluations: kotlin.collections.List<HospitalEvaluationViewModel>? = null,
    @Json(name = "location")
    val location: LocationViewModel? = null,
    @Json(name = "auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

