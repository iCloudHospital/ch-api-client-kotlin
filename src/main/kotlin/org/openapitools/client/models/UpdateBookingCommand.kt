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

import org.openapitools.client.models.Gender

import com.squareup.moshi.Json

/**
 * 
 * @param quantity 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param phone 
 * @param dateOfBirth 
 * @param gender 
 * @param approximateDateStart 
 * @param approximateDateEnd 
 * @param comment 
 * @param timeZone 
 */

data class UpdateBookingCommand (
    @Json(name = "quantity")
    val quantity: kotlin.Int? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "phone")
    val phone: kotlin.String? = null,
    @Json(name = "dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @Json(name = "gender")
    val gender: Gender? = null,
    @Json(name = "approximateDateStart")
    val approximateDateStart: java.time.LocalDateTime? = null,
    @Json(name = "approximateDateEnd")
    val approximateDateEnd: java.time.LocalDateTime? = null,
    @Json(name = "comment")
    val comment: kotlin.String? = null,
    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null
)

