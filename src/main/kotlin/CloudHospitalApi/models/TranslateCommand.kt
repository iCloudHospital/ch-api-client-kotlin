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


import com.squareup.moshi.Json

/**
 * 
 * @param languageCodeFrom 
 * @param languageCodeTo 
 * @param content 
 * @param isHtml 
 */

data class TranslateCommand (
    @Json(name = "languageCodeFrom")
    val languageCodeFrom: kotlin.String? = null,
    @Json(name = "languageCodeTo")
    val languageCodeTo: kotlin.String? = null,
    @Json(name = "content")
    val content: kotlin.String? = null,
    @Json(name = "isHtml")
    val isHtml: kotlin.Boolean? = null
)

