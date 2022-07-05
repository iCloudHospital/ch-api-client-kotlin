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

import CloudHospitalApi.models.Gender
import CloudHospitalApi.models.SurgeryProcedureViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param firstName 
 * @param lastName 
 * @param phone 
 * @param gender 
 * @param dateOfBirth 
 * @param residenceAddress 
 * @param insuranceCompany 
 * @param height 
 * @param weight 
 * @param languages 
 * @param allergies 
 * @param medications 
 * @param healthConditions 
 * @param surgeryProcedures 
 * @param weeksOfPregnancy 
 * @param familyHistory 
 * @param familyHistoryDiseases 
 * @param familyHistoryDiseaseOthers 
 */

data class HealthProfileViewModel (
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "phone")
    val phone: kotlin.String? = null,
    @Json(name = "gender")
    val gender: Gender? = null,
    @Json(name = "dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @Json(name = "residenceAddress")
    val residenceAddress: kotlin.String? = null,
    @Json(name = "insuranceCompany")
    val insuranceCompany: kotlin.String? = null,
    @Json(name = "height")
    val height: kotlin.Int? = null,
    @Json(name = "weight")
    val weight: kotlin.Int? = null,
    @Json(name = "languages")
    val languages: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "allergies")
    val allergies: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "medications")
    val medications: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "healthConditions")
    val healthConditions: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "surgeryProcedures")
    val surgeryProcedures: kotlin.collections.List<SurgeryProcedureViewModel>? = null,
    @Json(name = "weeksOfPregnancy")
    val weeksOfPregnancy: kotlin.Int? = null,
    @Json(name = "familyHistory")
    val familyHistory: kotlin.String? = null,
    @Json(name = "familyHistoryDiseases")
    val familyHistoryDiseases: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "familyHistoryDiseaseOthers")
    val familyHistoryDiseaseOthers: kotlin.collections.List<kotlin.String>? = null
)

