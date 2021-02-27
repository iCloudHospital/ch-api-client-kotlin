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


import com.squareup.moshi.Json

/**
* 
* Values: unpaid,paid,refundRequested,refunded
*/

enum class PaymentStatus(val value: kotlin.String){


    @Json(name = "Unpaid")
    unpaid("Unpaid"),


    @Json(name = "Paid")
    paid("Paid"),


    @Json(name = "RefundRequested")
    refundRequested("RefundRequested"),


    @Json(name = "Refunded")
    refunded("Refunded");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

