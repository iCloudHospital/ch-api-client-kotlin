/**
* Swagger UI - Cloud Hospital Api-DEV
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
* Values: photo,video,youtube,document,frontal,diagonal,side
*/

enum class MediaType(val value: kotlin.String) {


    @Json(name = "Photo")
    photo("Photo"),

    @Json(name = "Video")
    video("Video"),

    @Json(name = "Youtube")
    youtube("Youtube"),

    @Json(name = "Document")
    document("Document"),

    @Json(name = "Frontal")
    frontal("Frontal"),

    @Json(name = "Diagonal")
    diagonal("Diagonal"),

    @Json(name = "Side")
    side("Side");


    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }
}
