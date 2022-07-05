/**
* Swagger UI - Cloud Hospital Api-INT
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


import com.squareup.moshi.Json

/**
* 
* Values: nonRefundable,refundable,partialRefundable
*/

enum class RefundPolicy(val value: kotlin.String) {


    @Json(name = "NonRefundable")
    nonRefundable("NonRefundable"),

    @Json(name = "Refundable")
    refundable("Refundable"),

    @Json(name = "PartialRefundable")
    partialRefundable("PartialRefundable");


    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }
}

