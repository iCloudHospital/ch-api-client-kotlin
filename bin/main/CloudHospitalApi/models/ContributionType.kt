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


import com.squareup.moshi.Json

/**
 * 
 *
 * Values: reviewedBy,writtenBy,interviewWith
 */

enum class ContributionType(val value: kotlin.String) {

    @Json(name = "ReviewedBy")
    reviewedBy("ReviewedBy"),

    @Json(name = "WrittenBy")
    writtenBy("WrittenBy"),

    @Json(name = "InterviewWith")
    interviewWith("InterviewWith");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ContributionType) "$data" else null

        /**
         * Returns a valid [ContributionType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ContributionType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

