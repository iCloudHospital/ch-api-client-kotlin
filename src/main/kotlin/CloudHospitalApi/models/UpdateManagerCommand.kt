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
import CloudHospitalApi.models.UserLanguageViewModel
import CloudHospitalApi.models.UserLocationViewModel

import com.squareup.moshi.Json

/**
 * 
 * @param firstName 
 * @param lastName 
 * @param phone 
 * @param photo 
 * @param photoThumbnail 
 * @param gender 
 * @param dateOfBirth 
 * @param languages 
 * @param locations 
 * @param hospitalId 
 */

data class UpdateManagerCommand (
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "phone")
    val phone: kotlin.String? = null,
    @Json(name = "photo")
    val photo: kotlin.String? = null,
    @Json(name = "photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @Json(name = "gender")
    val gender: Gender? = null,
    @Json(name = "dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @Json(name = "languages")
    val languages: kotlin.collections.List<UserLanguageViewModel>? = null,
    @Json(name = "locations")
    val locations: kotlin.collections.List<UserLocationViewModel>? = null,
    @Json(name = "hospitalId")
    val hospitalId: java.util.UUID? = null
)

