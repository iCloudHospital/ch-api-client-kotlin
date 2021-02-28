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

import CloudHospitalApi.models.MediaSearchViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param name 
 * @param slug 
 * @param description 
 * @param logo 
 * @param overview 
 * @param bedsCount 
 * @param operationsPerYear 
 * @param foundationYear 
 * @param medicalStaffCount 
 * @param doctorCount 
 * @param countryId 
 * @param countryName 
 * @param marketingType 
 * @param latitude 
 * @param longitude 
 * @param country 
 * @param state 
 * @param county 
 * @param city 
 * @param zipCode 
 * @param address 
 * @param medias 
 * @param consultationEnabled 
 * @param consultationFee 
 * @param specialtiesSummerized 
 */

data class HospitalSearchItemViewModel (
    @SerializedName("id")
    val id: kotlin.String? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("logo")
    val logo: kotlin.String? = null,
    @SerializedName("overview")
    val overview: kotlin.String? = null,
    @SerializedName("bedsCount")
    val bedsCount: kotlin.Int? = null,
    @SerializedName("operationsPerYear")
    val operationsPerYear: kotlin.Int? = null,
    @SerializedName("foundationYear")
    val foundationYear: kotlin.Int? = null,
    @SerializedName("medicalStaffCount")
    val medicalStaffCount: kotlin.Int? = null,
    @SerializedName("doctorCount")
    val doctorCount: kotlin.Int? = null,
    @SerializedName("countryId")
    val countryId: kotlin.String? = null,
    @SerializedName("countryName")
    val countryName: kotlin.String? = null,
    @SerializedName("marketingType")
    val marketingType: kotlin.Int? = null,
    @SerializedName("latitude")
    val latitude: kotlin.Double? = null,
    @SerializedName("longitude")
    val longitude: kotlin.Double? = null,
    @SerializedName("country")
    val country: kotlin.String? = null,
    @SerializedName("state")
    val state: kotlin.String? = null,
    @SerializedName("county")
    val county: kotlin.String? = null,
    @SerializedName("city")
    val city: kotlin.String? = null,
    @SerializedName("zipCode")
    val zipCode: kotlin.String? = null,
    @SerializedName("address")
    val address: kotlin.String? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<MediaSearchViewModel>? = null,
    @SerializedName("consultationEnabled")
    val consultationEnabled: kotlin.Boolean? = null,
    @SerializedName("consultationFee")
    val consultationFee: kotlin.Double? = null,
    @SerializedName("specialtiesSummerized")
    val specialtiesSummerized: kotlin.String? = null
)

