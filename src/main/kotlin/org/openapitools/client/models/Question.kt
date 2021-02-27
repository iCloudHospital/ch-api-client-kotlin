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

import org.openapitools.client.models.AuditableEntity
import org.openapitools.client.models.DealPackage
import org.openapitools.client.models.Hospital
import org.openapitools.client.models.Media
import org.openapitools.client.models.Patient
import org.openapitools.client.models.QuestionComment
import org.openapitools.client.models.QuestionStatus
import org.openapitools.client.models.QuestionType

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param title 
 * @param normalizedTitle 
 * @param body 
 * @param questionType 
 * @param questionStatus 
 * @param patientId 
 * @param patient 
 * @param hospitalId 
 * @param hospital 
 * @param dealPackageId 
 * @param dealPackage 
 * @param quantity 
 * @param questionComments 
 * @param medias 
 * @param auditableEntity 
 */

data class Question (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("title")
    val title: kotlin.String? = null,
    @SerializedName("normalizedTitle")
    val normalizedTitle: kotlin.String? = null,
    @SerializedName("body")
    val body: kotlin.String? = null,
    @SerializedName("questionType")
    val questionType: QuestionType? = null,
    @SerializedName("questionStatus")
    val questionStatus: QuestionStatus? = null,
    @SerializedName("patientId")
    val patientId: java.util.UUID? = null,
    @SerializedName("patient")
    val patient: Patient? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospital")
    val hospital: Hospital? = null,
    @SerializedName("dealPackageId")
    val dealPackageId: java.util.UUID? = null,
    @SerializedName("dealPackage")
    val dealPackage: DealPackage? = null,
    @SerializedName("quantity")
    val quantity: kotlin.Int? = null,
    @SerializedName("questionComments")
    val questionComments: kotlin.collections.List<QuestionComment>? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<Media>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

