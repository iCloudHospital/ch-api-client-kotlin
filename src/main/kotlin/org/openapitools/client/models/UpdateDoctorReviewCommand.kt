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

import org.openapitools.client.models.ReviewCategory

import com.squareup.moshi.Json

/**
 * 
 * @param body 
 * @param recommended 
 * @param reviewCategory 
 * @param rate 
 */

data class UpdateDoctorReviewCommand (
    @Json(name = "body")
    val body: kotlin.String? = null,
    @Json(name = "recommended")
    val recommended: kotlin.Boolean? = null,
    @Json(name = "reviewCategory")
    val reviewCategory: ReviewCategory? = null,
    @Json(name = "rate")
    val rate: kotlin.Int? = null
)

